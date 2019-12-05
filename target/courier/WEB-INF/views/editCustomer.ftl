<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Set New Delivery Date</title>
</head>
<body>
<H1><a href="/courier"> World's Best Delivery for our Customers </a></H1>
<H1>Set New Delivery Date</H1>
<form name="customer" action="/courier/updateCustomer" method="post">
    <#--<p>ID: ${customer.id}</p>-->
    <input title="ID" type="hidden" name="id" value="${customer.id}" readonly>
    <p>orderNo: ${customer.orderNo}</p>
    <input title="orderNo" type="hidden" name="orderNo" value="${customer.orderNo}" readonly>
    <p>lastName: ${customer.lastName}</p>
    <input title="lastName" type="hidden" name="lastName" value="${customer.lastName}" readonly>
    <p>firstName: ${customer.firstName}</p>
    <input title="firstName" type="hidden" name="firstName" value="${customer.firstName}" readonly>
    <p>middleName: ${customer.middleName}</p>
    <input title="middleName" type="hidden" name="middleName" value="${customer.middleName}" readonly>
    <input title="lateDelivery" type="hidden" name="lateDelivery" value="no" readonly>
    <p>address: ${customer.address}</p>
    <input title="address" type="hidden" name="address" value="${customer.address}">
    <p>phone: ${customer.phone}</p>
    <input title="phone" type="hidden" name="phone" value="${customer.phone}">
    <p>deliveryTime (current: ${customer.deliveryTime})</p>
    <input title="deliveryTime" type="text" name="deliveryTime" value="${customer.deliveryTime}">
    <input type="submit" value="Set New Delivery Time">
</form>
</body>
</html>