package restful;

import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("/rest")
public class RestService {

	@GET
	@Path("/getText")
	public String getString(@QueryParam("name") String name) {
		return "Hello, " + name;
	}

	// http://localhost:8080/restful/test/rest/hello
	@GET
	@Path("/hello")
	public String getString() {
		return "Hello, restful!";
	}

	@GET
	@Path("getJson")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getJson(@QueryParam("name") String name) {
		Student student = new Student();
		student.setName(name);

		return student;
	}

	@POST
	@Path("jsonTest")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Student addStudent(@NotNull() Student student) {
		return student;
	}

}
