package cn.net.guu.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

public class MyAccessDeniedExceptionHandler implements AccessDeniedHandler {
	
	private String errorPage;

	public void setErrorPage(String errorPage) {
		if ((errorPage != null) && !errorPage.startsWith("/")) {
            throw new IllegalArgumentException("errorPage must begin with '/'");
        }

		this.errorPage = errorPage;
		
	}

	@Override
	public void handle(HttpServletRequest request,
			HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException,
			ServletException {
		// TODO Auto-generated method stub
		response.sendRedirect(errorPage);

	}

}
