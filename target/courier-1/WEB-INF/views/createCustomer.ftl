<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Set New Delivery Date</title>
</head>
<body>
<H1><a href="/courier-1"> World's Best Delivery for our Customers </a></H1>
<H1>Create New Customer</H1>
<form name="customer" action="/courier-1/addCustomer" method="post">
    <p>orderNo</p>
    <input title="orderNo" type="text" name="orderNo">
    <p>lastName</p>
    <input title="lastName" type="text" name="lastName">
    <p>lastName</p>
    <input title="firstName" type="text" name="firstName">
    <p>lastName</p>
    <input title="middleName" type="text" name="middleName">
    <p>lateDelivery</p>
    <input title="lateDelivery" type="text" name="lateDelivery">
    <input type="submit" value="Create New Customer">
</form>
</body>
</html>