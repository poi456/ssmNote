<%--
  Created by IntelliJ IDEA.
  User: lsm
  Date: 2020/11/22
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${findAll}" var="account">
    ${account.bookId}，
    ${account.bookName}，
    ${account.price}，
    ${account.remarks}
</c:forEach>
</body>
</html>
