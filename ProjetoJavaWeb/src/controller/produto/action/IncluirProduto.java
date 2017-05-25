package controller.produto.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.produto.DAOProduto;
import controller.portal.PortalServlet;

@SuppressWarnings("serial")
public class IncluirProduto extends PortalServlet {

	@Override
	protected void doGetPortal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String nome = request.getParameter("nome");
		
		if (DAOProduto.isNomeProdutoValido(nome, 0)) {
			DAOProduto.incluirProduto(nome, Integer.parseInt(request.getParameter("categoria")), request.getParameter("descricao"));
		} else {
			trataRetornoErroEsperado(response, "Nome do produto já cadastrado");
		}
	}
}