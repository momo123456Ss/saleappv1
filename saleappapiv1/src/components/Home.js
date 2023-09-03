import { useEffect, useState } from "react";
import { Spinner } from "react-bootstrap";
import Api, { endpoints } from "../configs/Api";

const Home = () => {
    const [products, setProducts] = useState(null);
    useEffect(() => {
        const loadProducts = async () => {
            let res = await Api.get(endpoints[`products`])
            setProducts(res.data);
        }
        loadProducts();
    }, [])
    if (products == null)
        return <Spinner animation="grow" variant="info" />;

    return (<>
        {products.map(c => <li key={c.id}>{c.name}</li>)}

        <h1>My Home</h1>
    </>)
}
export default Home;