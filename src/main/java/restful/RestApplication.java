package restful;

import org.glassfish.jersey.server.ResourceConfig;

public class RestApplication extends ResourceConfig {
	public RestApplication() {
		// 服务类所在的包路径
		packages("restful");
	}
}
