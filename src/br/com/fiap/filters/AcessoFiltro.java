package br.com.fiap.filters;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import br.com.fiap.bean.AcessoBean;

@WebFilter("/*")
public class AcessoFiltro implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest r = (HttpServletRequest) req;
		
		AcessoBean ab = (AcessoBean) r.getSession(true).getAttribute("user");
		
		if(ab == null) {
			ab = new AcessoBean();
			ab.setPrimeiroAcesso(LocalDateTime.now());
			ab.setUltimoAcesso(LocalDateTime.now());
		}
		
		if(ab.getPrimeiroAcesso().isAfter(LocalDateTime.now())){
			ab.setPrimeiroAcesso(LocalDateTime.now());
		}
		
		if(ab.getUltimoAcesso().isBefore(LocalDateTime.now())){
			ab.setUltimoAcesso(LocalDateTime.now());
		}
		
		r.getSession().setAttribute("user", ab);
		
		chain.doFilter(req, resp);
	}
	
}
