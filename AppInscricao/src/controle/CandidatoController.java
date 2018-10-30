package controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Candidato;


public class CandidatoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private List<String> listUF;
 
    public CandidatoController() {
        listUF = new ArrayList<String>();
    
    }
//    private String nome;
//	private String email;
//	private String emailRed;
//	private String rg;
//	private Calendar expedicao;
//	private String orgao;
//	private String uf;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("listaUF", listUF);
		request.getRequestDispatcher("dadosBasicos.jsp").forward(request, response);
		
//		Candidato candidato = new Candidato();
//		candidato.setNome(request.getParameter("nome"));
//		candidato.setEmail(request.getParameter("email"));
//		candidato.setEmailRed(request.getParameter("emailRed"));
//		candidato.setRg(request.getParameter("rg"));
//		candidato.setExpedicao(String.valueOf(request.getParameter("expedicao"));
//		candidato.setOrgao(request.getParameter("orgao"));
//		candidato.setUf(request.getParameter("uf"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
