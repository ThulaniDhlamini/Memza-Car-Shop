/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ac.za.tut.beans.GarageFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
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
public class TotalCarsServlet extends HttpServlet {
    @EJB
    private GarageFacadeLocal gfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int total=gfl.count();
        request.setAttribute("total", total);
        RequestDispatcher disp;
        disp=request.getRequestDispatcher("total_car_outcome.jsp");
        disp.forward(request, response);
    }

}
