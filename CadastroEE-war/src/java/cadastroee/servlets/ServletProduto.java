/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package cadastroee.servlets;

package cadastroee.servlets;

import cadastroee.controller.ProdutoFacadeLocal;
import cadastroee.model.Produto;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ServletProduto", urlPatterns = {"/ServletProduto"})
public class ServletProduto extends HttpServlet {

    @EJB
    private ProdutoFacadeLocal produtoFacade;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Recupera a lista de produtos usando o EJB ProdutoFacadeLocal
        List<Produto> produtos = produtoFacade.findAll();

        // Configura o tipo de resposta como HTML
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            // Gera uma resposta HTML
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Lista de Produtos</title>");
            out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css'>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container'>");
            out.println("<h1>Lista de Produtos</h1>");
            out.println("<table class='table table-striped'>");
            out.println("<thead><tr><th>ID</th><th>Nome</th><th>Preço</th><th>Quantidade</th></tr></thead>");
            out.println("<tbody>");

            // Percorre a lista de produtos e adiciona uma linha para cada produto
            for (Produto produto : produtos) {
                out.println("<tr>");
                out.println("<td>" + produto.getId() + "</td>");
                out.println("<td>" + produto.getNome() + "</td>");
                out.println("<td>" + produto.getPrecoVenda() + "</td>");
                out.println("<td>" + produto.getQuantidade() + "</td>");
                out.println("</tr>");
            }

            out.println("</tbody>");
            out.println("</table>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
