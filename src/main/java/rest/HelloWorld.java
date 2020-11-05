package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 
 * 
 * @author zoutao
 * @date 2020年8月20日
 *
 */
@Path("/hello")
public class HelloWorld {

	// http://localhost:8080/restful/test/hello
	// GET注解设置接受请求类型为GET
	@GET
	// Produces表明发送出去的数据类型为text/plain
	// 与Produces对应的是@Consumes，表示接受的数据类型为text/plain
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() {
		return "Hello world!";
	}

}
