<%--
  Created by IntelliJ IDEA.
  User: sysadmin
  Date: 18/06/2019
  Time: 09:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  <body>
  <h2>Product Discount Calculator</h2>
  <form method="post" action="/product">
    <label>Product Description:</label>
    <input type="text" name="description">
    <br>
    <label>List Price:    </label>
    <input type="text" name="price">
    <br>
    <label>Discount Percent:</label>
    <input type="text" name="percent"> %
    <div id="buttons">
      <label>&nbsp;</label>
      <input type="submit" value="Calculate Discount"/>
    </div>
  </form>
  </body>
</html>
