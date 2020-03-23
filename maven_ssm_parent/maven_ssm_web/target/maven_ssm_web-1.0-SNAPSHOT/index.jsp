<%--
  Created by IntelliJ IDEA.
  User: uaj
  Date: 2020/2/10
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>hello world</h1>

    <a href="items/findByIdItems">查询一件商品</a>
    <form action="items/saveItems" method="post">
        <label>
            名称：<input type="text" name="name"/>
        </label>
        <label>
            价格：<input type="text" name="price"/>
        </label>
        <label>
            pic：<input type="text" name="pic"/>
        </label>
        <label>
            生成时间：<input type="date" name="create_time"/>
        </label>
        <label>
            简介：<input type="text" name="detail"/>
        </label>
        <input type="submit" value="保存"/>
    </form>
</body>
</html>
