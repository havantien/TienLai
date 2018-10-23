package com.codegym;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MoneyServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("Product Description");
        double listPrice = Double.parseDouble(request.getParameter("List Price"));
        double discountPercent = Double.parseDouble(request.getParameter("discount Percent"));

        double amount = listPrice * discountPercent * 0.1;
        double price = listPrice - amount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        writer.println("<h1>Product Discount Calculator</h1>");
        writer.println("<label>Product Description: " + description + ".</label>");
        writer.println("<label>Price: $" + listPrice + ".</label>");
        writer.println("<label>Discount percent: " + discountPercent + "%</label>");
        writer.println("<label>Discount Amount: $" + amount + ".</label>");
        writer.println("<label>Discount Price: $" + price + ".</label>");

        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
