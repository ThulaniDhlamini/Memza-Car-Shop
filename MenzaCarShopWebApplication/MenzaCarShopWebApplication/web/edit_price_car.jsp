<%-- 
    Document   : edit_price_car
    Created on : May 12, 2025, 10:51:49 PM
    Author     : manya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Edit Price Of Car</h1>
        <form action="EditCarServlet" method="post">
            <table>
                <tr>
                    <td>ID:</td>
                    <td><input type="number" name="id" ></td>
                </tr>
                
                    <td>Amount:</td>
                    <td><input type="text"  name="amount" placeholder="R100 000"></td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" value="submit">
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
