<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "h" uri = "http://tomcat.apache.org/hello-taglib" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Application</title>
    <style type="text/css">
        .error {
            border: 1px solid red;
        }
        .errorMessage {
            color: red;
        }
    </style>
</head>
<body>
    <h:hello name="${name}"/>
    <img src="/static/logo.png" alt="Logo" height="100" >

    <form:form action="/add" modelAttribute="book">
        <form:input path="title" placeholder="title" cssErrorClass="error"/>
        <form:errors path="title" cssErrorClass="errorMessage"/>
        <form:input path="author" placeholder="author" cssErrorClass="error"/>
        <form:errors path="author" cssErrorClass="errorMessage"/>
        <input type="Submit" name="Add Book"/>
    </form:form>

    <c:forEach items="${books}" var="book">
        <p><i>${book.getTitle()}</i> by ${book.getAuthor()}</p>
    </c:forEach>

</body>
</html>