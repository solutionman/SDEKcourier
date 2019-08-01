<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Set New Delivery Date</title>
</head>
<body>
<H1><a href="/courier-1"> World's Best Delivery for our Customers </a></H1>
<H1>Set New Delivery Date</H1>
<form name="customer" action="/courier-1/addCustomer" method="post">
    <p>ID</p>
    <input title="ID" type="text" name="id" >
    <p>orderNo</p>
    <input title="orderNo" type="text" name="orderNo">
    <p>lastName</p>
    <input title="lastName" type="text" name="lastName">
    <p>lastName</p>
    <input title="firstName" type="text" name="firstName">
    <p>lastName</p>
    <input title="middleName" type="text" name="middleName">
    <p>deliveryTime</p>
    <input title="deliveryTime" type="text" name="deliveryTime">
    <input type="submit" value="Create New Customer">
</form>
</body>
</html>