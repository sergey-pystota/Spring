<#import "/spring.ftl" as spring/>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Clients</h1>
<table border="1">
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>City</th>
        <th>Street</th>
        <th>Building</th>
        <th>Apartment</th>
    </tr>

    <#list clients as client>
        <tr>
            <td>${client.firstName}</td>
            <td>${client.lastName}</td>
            <td>${client.address.city}</td>
            <td>${client.address.street}</td>
            <td>${client.address.building}</td>
            <td>${client.address.apartment}</td>

        </tr>
    </#list>

</table>


</body>
</html>