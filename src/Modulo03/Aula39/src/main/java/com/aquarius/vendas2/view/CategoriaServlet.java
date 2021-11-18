package com.aquarius.vendas2.view;

import java.io.IOException;
import java.io.PrintWriter;

import com.aquarius.vendas2.model.Categoria;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Categoria model = new Categoria();
		String nome = req.getParameter("nome");

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.printf("<h1>Cadastro de categorias: %s</h1>", nome);		
		out.println("<body>");
		out.println("<html>");
		
	}
}
