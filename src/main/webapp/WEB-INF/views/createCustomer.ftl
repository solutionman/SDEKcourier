<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Set New Delivery Date</title>
</head>
<body>
<H1><a href="/courier"> World's Best Delivery for our Customers </a></H1>
<H1>Create New Customer</H1>
<form name="customer" action="/courier/addCustomer" method="post">
    <p>orderNo</p>
    <input title="orderNo" type="text" name="orderNo">
    <p>lastName</p>
    <input title="lastName" type="text" name="lastName">
    <p>firstName</p>
    <input title="firstName" type="text" name="firstName">
    <p>middleName</p>
    <input title="middleName" type="text" name="middleName">
    <p>address</p>
    <input title="address" type="text" name="address">
    <p>lateDelivery</p>
    <input title="lateDelivery" type="text" name="lateDelivery" value="no">
    <p>phone</p>
    <input title="phone" type="text" name="phone">
    <p>deliveryTime</p>
    <input title="deliveryTime" type="text" name="deliveryTime" value="2019-08-12 17:30:00">
    <input type="submit" value="Create New Customer">
</form>
</body>
</html>