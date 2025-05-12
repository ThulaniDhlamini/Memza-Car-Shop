<%-- 
    Document   : add_car
    Created on : May 12, 2025, 9:42:47 PM
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
        <h1>ADD CAR</h1>
        <form action="AddCarServlet" method="post">
            <table>
                <tr>
                    <td>ID:</td>
                    <td><input type="number" name="id" ></td>
                </tr>
                <tr>
                    <td>Brand:</td>
                    <td><select name="brand">
                            <option value="TOYOTA">TOYOTA</option>
                            <option value="FORD">FORD</option>
                            <option value="HONDA">HONDA</option>
                            <option value="NISSAN">NISSAN</option>
                            <option value="BMW">BMW</option>
                            <option value="MERCEDES">MERCEDES</option>
                            <option value="VOLKSWAGEN">VOLKSWAGEN</option>
                            <option value="HYUNDAI">HYUNDAI</option>
                            <option value="KIA">KIA</option>
                            <option value="MAZDA">MAZDA</option>
                            <option value="AUDI">AUDI</option>
                            <option value="CHEVROLET">CHEVROLET</option>
                            <option value="SUZUKI">SUZUKI</option>
                            <option value="RENAULT">RENAULT</option>
                            <option value="ISUZU">ISUZU</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Registration Year:</td>
                    <td><input type="text" name="registrationYear" ></td>
                </tr>
                <tr>
                    <td>Fuel:</td>
                    <td>
                        <select name="fuel">
                            <option value="PETROL">PETROL</option>
                            <option value="DIESEL">DIESEL</option>
                            <option value="ELECTRIC">ELECTRIC</option>
                            <option value="HYBRID">HYBRID</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Transmission:</td>
                    <td><select name="transmission">
                            <option value="MANUAL">MANUAL</option>
                            <option value="AUTOMATIC">AUTOMATIC</option>
                            <option value="SEMI_AUTOMATIC">SEMI-AUTOMATIC</option>
                        </select></td>
                </tr>
                <tr>
                    <td>Condition:</td>
                    <td>
                        <select name="condition">
                            <option value="NEW">NEW</option>
                            <option value="USED">USED</option>
                            <option value="CERTIFIED_PRE_OWNED">CERTIFIED PRE-OWNED</option>
                        </select
                    </td>
                </tr>
                <tr>
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
