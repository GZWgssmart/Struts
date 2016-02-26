<%--
  Created by IntelliJ IDEA.
  User: WangGenshen
  Date: 2/26/16
  Time: 09:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <a href="<%=path %>/product/input.action">Product input</a>
    <br />
    <a href="<%=path %>/user/tologin.action">User login</a>
    <br />
    <a href="<%=path %>/context/context.action?pname=pname">ActionContext</a>
    <br />
    <a href="<%=path %>/aware/aware.action?pname=pname">Aware</a>
  </body>
</html>
