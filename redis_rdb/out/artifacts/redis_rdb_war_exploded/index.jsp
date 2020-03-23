<%--
  Created by IntelliJ IDEA.
  User: uaj
  Date: 2020/2/11
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
  <head>
    <script src="js/jquery-3.3.1.min.js"></script>
    <script>
      $(function(){
        /*发送ajax请求，加载所有省份数据*/
        $.get("provinceRedisServlet",{},function (data) {
          /*遍历json数组*/
          $(data).each(function () {
            /*创建<option>*/
            var option = "<option name='"+this.id+"'>"+this.province+"</option>";
            /*调用select的append追加option*/
            $("#province").append(option);
          });
        })
      })
    </script>
    <title>$Title$</title>
  </head>
  <body>

  <label for="province">
    <select id="province">
      <option>--输入省份--</option>
    </select>
  </label>
  <form action="provinceRedisSave" method="post">
    <input type="text" name="province"/>
    <input type="submit" value="保存"/>
  </form><br>
  <form action="provinceRedisDelete" method="post">
    <input type="text" name="id"/>
    <input type="submit" value="删除"/>
  </form>

  </body>
</html>
