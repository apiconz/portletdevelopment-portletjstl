package pe.com.apiconz.example.portlets;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletURL;
import javax.portlet.ProcessAction;
import javax.portlet.RenderMode;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class JstlPortlet extends GenericPortlet {

	@RenderMode(name = "VIEW")
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		System.out.println("Paso por render");
		PortletURL registrarActionURL = response.createActionURL();
		registrarActionURL.setParameter(ActionRequest.ACTION_NAME, "registrar");
		request.setAttribute("registrarActionURL", registrarActionURL);

		getPortletContext().getRequestDispatcher("/WEB-INF/jsp/success.jsp")
				.include(request, response);
	}

	@ProcessAction(name = "registrar")
	public void registrar(ActionRequest request, ActionResponse response)
			throws PortletException, IOException {

		String texto = request.getParameter("texto");
		System.out.println("-" + texto);
		System.out.println("Paso por registrar");
	}

}
