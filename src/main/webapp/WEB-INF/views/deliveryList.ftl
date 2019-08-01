<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Delivery List</title>
</head>
<body>
<H1><a href="/courier-1"> World's Best Delivery for our Customers </a></H1>
<H1>Delivery List</H1>
<table>
    <tr>
        <th>Id</th>
        <th>orderNo</th>
        <th>lastName</th>
        <th>firstName</th>
        <th>middleName</th>
        <th>deliveryTime</th>
        <th>lateDelivery</th>
    </tr>
    <#list customers as customer>
        <tr>
            <#--<td><a href="customer/${customer.id}">${customer.id}</a></td>-->
            <td>${customer.id}</td>
            <td>${customer.orderNo}</td>
            <td>${customer.lastName}</td>
            <td>${customer.firstName}</td>
            <td>${customer.middleName}</td>
            <td>${customer.deliveryTime}</td>
            <td>${customer.lateDelivery}</td>
            <td><a href="/courier-1/later/${customer.id}">Can't deliver in time</a></td>
        </tr>
    </#list>
</table>
<a href="/courier-1/addCustomer/">New Customer</a>
</body>
</html>


