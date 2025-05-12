/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ac.za.tut.beans.GarageFacadeLocal;
import ac.za.tut.entities.Garage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author manya
 */
public class AddCarServlet extends HttpServlet {
    
    @EJB
    private GarageFacadeLocal gfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id =Long.parseLong(request.getParameter("id"));
        String brand=request.getParameter("brand");
        String registrationYear=request.getParameter("registrationYear");
        String fuel=request.getParameter("fuel");
        String transmission=request.getParameter("transmission");
        String condition=request.getParameter("condition");
        Double amount=Double.parseDouble(request.getParameter("amount"));
        Double perMonth=amount*0.03;
        Garage garage = new Garage(id, brand, registrationYear, fuel, transmission, condition, amount, perMonth, new Date());
        gfl.create(garage);
        
        RequestDispatcher disp;
        disp=request.getRequestDispatcher("add_car_outcome.jsp");
        disp.forward(request, response);
        
    }

}
