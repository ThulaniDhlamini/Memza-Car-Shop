<%-- 
    Document   : view_car_outcome
    Created on : May 12, 2025, 10:15:20 PM
    Author     : manya
--%>

<%@page import="java.util.List"%>
<%@page import="ac.za.tut.entities.Garage"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ALL CARS</h1>
        <%
            List<Garage> listGarage = (List<Garage>) request.getAttribute("listGarage");
            for (Garage list : listGarage) {
        %>
        <form action="BuyCarServlet" method="POST">
            <table>
                <tr>
                    <td>Brand:  <%=list.getBrand()%></td>
                </tr>
                <tr>
                    <td>Registration Year  <%=list.getRegstrationYear()%></td>
                </tr>
                <tr>
                    <td>Fuel:  <%=list.getFuel()%></td>
                </tr>
                <tr>
                    <td>Transmission:  <%=list.getTransmittion()%></td>
                </tr>
                <tr>
                    <td>Condition:  <%=list.getCondition()%></td>
                </tr>
                <tr>
                    <td>Total Amount:  <%=list.getAmount()%></td>
                </tr>
                <tr>
                    <td>Per Month:  <%=list.getPerMonth()%></td>
                </tr>
                <tr>
                    <td>
                        <input type="hidden" name="id" value=<%=list.getId()%>>
                        <input type="submit"  value="BUY">
                    
                    </td>
                    
                </tr>
            </table>
        </form><br>
        <%    }
        %>
        
        <p>
            Click <a href="menu.jsp">HERE!</a> to MENU.<br>
            Click <a href="index.html">HERE!</a> to HOME.<br>
            Click <a href="LogoutServlet.do">HERE!</a> to LOGOUT.
        </p>
    </body>
</html>
