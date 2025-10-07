package com.example.web;

import com.example.service.ProductService;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

//@WebServlet("/add")
public class AddProductServlet extends HttpServlet {
    private final ProductService productService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/plain; charset=UTF-8");
        String name = req.getParameter("name");
        resp.getWriter().println(productService.addProduct(name != null ? name : "Inconnu"));
    }
}
