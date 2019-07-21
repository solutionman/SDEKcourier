<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Later Delivery</title>
</head>
<body>
<H1>Later Delivery</H1>
<table>
    <tr>
        <th>Id</th>
        <th>orderNo</th>
        <th>lastName</th>
        <th>firstName</th>
        <th>middleName</th>
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
            <td>${customer.lateDelivery}</td>
        </tr>
    </#list>
</table>
<br>
<a href="/courier-1">Main Page</a>
</body>
</html>