<%--
  Created by IntelliJ IDEA.
  User: uaj
  Date: 2020/2/14
  Time: 13:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>导航侧栏</title>
</head>
<body>
<!-- 导航侧栏 -->
<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="${pageContext.request.contextPath}/img/girl8.jpg" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p><security:authentication property="principal.username"/></p>
                <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
            </div>
        </div>
        <!-- search form -->
        <!--<form action="#" method="get" class="sidebar-form">
    <div class="input-group">
        <input type="text" name="q" class="form-control" placeholder="搜索...">
        <span class="input-group-btn">
        <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
        </button>
      </span>
    </div>
</form>-->
        <!-- /.search form -->


        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="header">菜单</li>

            <li id="admin-index"><a href="${pageContext.request.contextPath}/index.jsp"><i class="fa fa-dashboard"></i>
                <span>首页</span></a></li>

            <!-- 菜单 -->


            <%--数据信息,必须有ROLE_USER角色的用户才能显示--%>
            <security:authorize access="hasRole('ROLE_USER')">
                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-folder"></i> <span>基础数据</span>
                        <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                    </a>
                    <ul class="treeview-menu">
                        <li id="product-datalist">
                            <a href="${pageContext.request.contextPath}/product/findAllProduct.do">
                                <i class="fa fa-circle-o"></i> 产品管理
                            </a>
                        </li>
                    </ul>
                    <ul class="treeview-menu">
                        <li id="order-datalist">
                            <a href="${pageContext.request.contextPath}/orders/findAllOrders.do?pageNum=1&pageSize=2">
                                <i class="fa fa-circle-o"></i> 订单管理
                            </a>
                        </li>
                    </ul>
                </li>
            </security:authorize>
            <%--系统信息,必须有ROLE_AMDIN角色的用户才能显示--%>
            <security:authorize access="hasRole('ADMIN')">
                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-cogs"></i> <span>系统管理</span>
                        <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                    </a>
                    <ul class="treeview-menu">

                        <li id="system-setting">
                            <a href="${pageContext.request.contextPath}/user/findAll.do">
                                <i class="fa fa-circle-o"></i> 用户管理
                            </a>
                        </li>

                    </ul>
                    <ul class="treeview-menu">

                        <li id="system-setting1">
                            <a href="${pageContext.request.contextPath}/role/findAllRole.do">
                                <i class="fa fa-circle-o"></i> 角色管理
                            </a>
                        </li>

                    </ul>
                    <ul class="treeview-menu">

                        <li id="system-setting2">
                            <a href="${pageContext.request.contextPath}/permission/findAll.do">
                                <i class="fa fa-circle-o"></i>资源权限管理
                            </a>
                        </li>
                    </ul>
                    <ul class="treeview-menu">

                        <li id="system-setting3">
                            <a href="${pageContext.request.contextPath}/sysLog/findAll.do">
                                <i class="fa fa-circle-o"></i>日志管理
                            </a>
                        </li>
                    </ul>
                </li>
            </security:authorize>
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>
<!-- 导航侧栏 /-->
</body>
</html>
