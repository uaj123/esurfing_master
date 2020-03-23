<%--
  Created by IntelliJ IDEA.
  User: uaj
  Date: 2020/2/10
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
</head>
<body>
    <form action="">
        <table width="100%" border="1">
            <tr>
                <td>商品名称</td>
                <td>${items.name}</td>
            </tr>
            <tr>
                <td>商品价格</td>
                <td>${items.price}</td>
            </tr>
            <tr>
                <td>商品生成日期</td>
                <td><fmt:formatDate value="${items.create_time}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
            </tr>
            <tr>
                <td>商品简介</td>
                <td>${items.detail}</td>
            </tr>
        </table>
    </form>
</body>
</html>