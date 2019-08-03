<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Set New Delivery Date</title>
</head>
<body>
<H1><a href="/courier-1"> World's Best Delivery for our Customers </a></H1>
<H1>Set New Delivery Date</H1>
<form name="customer" action="/courier-1/updateCustomer" method="post">
    <p>ID</p>
    <input title="ID" type="text" name="id" value="${customer.id}" readonly>
    <p>orderNo</p>
    <input title="orderNo" type="text" name="orderNo" value="${customer.orderNo}" readonly>
    <p>lastName</p>
    <input title="lastName" type="text" name="lastName" value="${customer.lastName}" readonly>
    <p>firstName</p>
    <input title="firstName" type="text" name="firstName" value="${customer.firstName}" readonly>
    <p>middleName</p>
    <input title="middleName" type="text" name="middleName" value="${customer.middleName}" readonly>
    <p>lateDelivery</p>
    <input title="lateDelivery" type="text" name="lateDelivery" value="no" readonly>
    <p>deliveryTime (current: ${customer.deliveryTime})</p>
    <input title="deliveryTime" type="text" name="deliveryTime" value="${customer.deliveryTime}">
    <input type="submit" value="Set New Delivery Time">
</form>
</body>
</html>