package controller.produto.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.produto.DAOProduto;
import controller.portal.PortalServlet;

@SuppressWarnings("serial")
public class ExcluirProduto extends PortalServlet {

	@Override
	protected void doGetPortal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String codigo = request.getParameter("codigo");
		
		DAOProduto.excluirProduto(Integer.parseInt(codigo));
	}
}