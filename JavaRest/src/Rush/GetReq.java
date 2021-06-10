package Rush;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@Path("/hello")
public class GetReq {
	
	@GET()
	@Produces(MediaType.TEXT_XML)
	public String sayHelloXml()
	{
		String resource = "<? xml version = '1.0' ?> "
				+ "<hello> Hi there, This is Rush from XML !!! </hello> ";
		
		return resource;
	}
	
	@GET()
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJason()
	{
		String resource = null;
		
		return resource;
	}
	
	@GET()
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHtml()
	{
		String resource = "<h1> Hi There!!! This is Rush from HTML";
		
		return resource;
	}

}
