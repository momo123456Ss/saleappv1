<%-- 
    Document   : products
    Created on : Jul 21, 2023, 1:18:29 PM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h1 class="text-center text-info mt-1">QUẢN LÝ SẢN PHẨM</h1>

<c:url value="/products" var="action" />
<form:form method="post" action="${action}" modelAttribute="product" enctype="multipart/form-data">
    <form:hidden path="id" />
    <form:hidden path="image" />

    <form:errors path="*" element="div" cssClass="alert alert-danger"/>
    <div class="form-floating mb-3 mt-3">
        <form:input type="text" class="form-control" 
                    path="name" id="name" placeholder="Tên sản phẩm..." />
        <label for="name">Tên sản phẩm</label>
        <form:errors path="name" element="div" cssClass="text-danger"/>
    </div>
    <div class="form-floating">
        <form:textarea class="form-control" id="des" name="text" 
                       path="description" placeholder="Mô tả"></form:textarea>
            <label for="des">Mô tả</label>
        </div>
        <div class="form-floating mb-3 mt-3">
        <form:input type="number" class="form-control" 
                    path="price" id="price" placeholder="Nhập giá..." />
        <label for="price">Gía sản phẩm</label>
        <form:errors path="price" element="div" cssClass="text-danger"/>
    </div>
    <div class="form-floating mb-3 mt-3">
        <form:input type="file" class="form-control" 
                    path="file" id="file"  />
        <label for="file">Ảnh sản phẩm</label>
    </div>
    <c:if test="${product.image != null}">
        <div class="form-floating mb-3 mt-3">
            <img src="<c:url value="${product.image}"/>" width="100px" height="100px"> 
        </div>
    </c:if>
    <div class="form-floating">
        <form:select class="form-select" id="category" name="category" path="categoryId">
            <c:forEach items="${categories}" var="c">
                <c:choose>
                    <c:when test="${c.id == product.categoryId.id}" >
                        <option value="${c.id}" selected>${c.name}</option>
                    </c:when>
                    <c:otherwise>
                        <option value="${c.id}">${c.name}</option>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
        </form:select>

        <label for="category" class="form-label">Danh mục sản phẩm:</label>
    </div>

    <div class="form-floating mt-1">
        <button class="btn btn-info" type="submit">
            <c:choose>
                <c:when test="${product.id == null}" >
                    Thêm sản phẩm
                </c:when>
                <c:otherwise>
                    Cap nhat sản phẩm
                </c:otherwise>
            </c:choose>
        </button>
    </div>
</form:form>