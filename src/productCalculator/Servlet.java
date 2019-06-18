package productCalculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = "/product")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        int percent = Integer.parseInt(request.getParameter("percent"));
        float discountAmount = (price/100) * percent;
        float discountPrice = price - discountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h2>Description: " + description + "</h2>");
        writer.println("<h2>Price: " + price + "</h2>");
        writer.println("<h2>Percent: " + percent + "%</h2>");
        writer.println("<h2>Discount Amount: " + discountAmount + "</h2>");
        writer.println("<h2>Discount Price: " + discountPrice + "</h2>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
