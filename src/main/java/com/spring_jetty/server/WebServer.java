package com.spring_jetty.server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.webapp.WebAppContext;

public class WebServer {
	
	private static final int PORT = 8080;
	private static final String CONTEXT_PATH = "/";
	private static final String WEB_APP = "src/main/resources/webapp";
	
	public void startServer() throws Exception {
		Server server = new Server(PORT);
		HandlerList handlers = new HandlerList();
		WebAppContext webapp = new WebAppContext();
		webapp.setResourceBase(WEB_APP);
		webapp.setContextPath(CONTEXT_PATH);
		
		handlers.addHandler(webapp);
		server.setHandler(handlers);
		
		server.start();
		server.join();
	}

	public static void main(String[] args) throws Exception {
		new WebServer().startServer();;
	}
}
