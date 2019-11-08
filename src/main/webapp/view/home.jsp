<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Application</title>
</head>
<body>
    <h2>${message} ${name}</h2>
    <img src="/static/logo.png" alt="Logo" height="100" >

    <form action="/add" method="post">
        <input type="text" name="title">
        <input type="text" name="author">
        <input type="Submit" name="Add Book">
    </form>

    <c:forEach items="${books}" var="book">
        <p><i>${book.getTitle()}</i> by ${book.getAuthor()}</p>
    </c:forEach>

</body>
</html>