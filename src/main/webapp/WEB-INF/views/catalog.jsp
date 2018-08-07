<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="ru.dansaranov.enterprise.entity.Product" %>
<%@ page import="ru.dansaranov.enterprise.FieldConst" %>
<%@ page import="java.util.Collection" %>

<html>
<head>
    <title>Каталог</title>
</head>
<body>
<h1>Каталог</h1>
<jsp:include page="/WEB-INF/template/menu.jsp"/>
<%
    final Object productObject = request.getAttribute(FieldConst.PRODUCTS);
    final Collection<Product> products = (Collection<Product>) productObject;
%>
<table width="100%" cellpadding="10" cellspacing="10" border="1" style="border-collapse: collapse;">
    <tr>
        <th>№</th>
        <th align="left">NAME</th>
        <th align="left">DESCRIPTION</th>
        <th></th>
        <th></th>
    </tr>
    <% int index = 1; %>
    <% for (final Product product: products) { %>
    <tr>
        <td align="center"><%=index%>.</td>
        <td width="200" align="left" nowrap="nowrap"><%=product.getName()%></td>
        <td width="100%" align="left"><%=product.getDescription()%></td>
        <td align="center" nowrap="nowrap">
            <a href="product-edit?id=<%=product.getId()%>">EDIT</a>
        </td>
        <td align="center" nowrap="nowrap">
            <a href="product-remove?id=<%=product.getId()%>">REMOVE</a>
        </td>
    </tr>
    <% index++; %>
    <% } %>
</table>

<br />

<form action="product-create" method="get">
    <button type="submit" style="font-size: 1.5em;">CREATE</button>
</form>
</body>
</html>
