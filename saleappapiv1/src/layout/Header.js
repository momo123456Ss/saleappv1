import { useEffect, useState } from "react";
import { Container, Nav, Navbar, NavDropdown, Spinner } from "react-bootstrap";
import Api, { endpoints } from "../configs/Api";
const Header = () => {
    const [categories, setCategories] = useState(null)


    useEffect(() => {
        const loadCates = async () => {
            let res = await Api.get(endpoints[`categories`])
            setCategories(res.data);
        }
        loadCates();
    }, [])

    if (categories == null)
        return <Spinner animation="grow" variant="info" />;

    return (<>
        <Navbar expand="lg" className="bg-body-tertiary">
            <Container>
                <Navbar.Brand href="#home">React-Bootstrap</Navbar.Brand>
                <Navbar.Toggle aria-controls="basic-navbar-nav" />
                <Navbar.Collapse id="basic-navbar-nav">
                    <Nav className="me-auto">
                        <Nav.Link href="#home">Home</Nav.Link>
                        <Nav.Link href="#link">Link</Nav.Link>
                        <NavDropdown title="Dropdown" id="basic-nav-dropdown">
                        {categories.map(c => <NavDropdown.Item href="#action/3.1" key={c.id}>{c.name}</NavDropdown.Item>)}
                            
                        </NavDropdown>
                    </Nav>
                </Navbar.Collapse>
            </Container>
        </Navbar>
    </>)
}
export default Header;