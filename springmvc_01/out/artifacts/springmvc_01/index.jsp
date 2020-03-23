<%--
  Created by IntelliJ IDEA.
  User: uaj
  Date: 2020/2/7
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello</title>
    <script src="js/jquery-3.2.1.min.js"></script>
    <script>
        /*加载页面*/
        $(function () {
            $("#btn").click(function () {
                /*alert("你好，急急急")*/
                /*发送ajax请求*/
                $.ajax({
                    /*编写json格式，设置属性和值*/
                    url:"account/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"乌萨黑","password":"123"}',
                    dataType:"json",
                    type:"POST",
                    success:function (data) {
                        /*data是服务器端响应的json数据*/
                        alert(data);
                    }
                })
            })
        })
    </script>
</head>
<body>
    <a href="account/testString">测试返回值是字符串</a>
    <a href="account/testVoid">测试返回值是void</a>
    <a href="account/testModelAndView">testModelAndView</a>
    <a href="account/testForwardOrRedirect">testForwardOrRedirect</a>
    <br>
    <button id="btn">发送请求</button>
</body>
</html>
