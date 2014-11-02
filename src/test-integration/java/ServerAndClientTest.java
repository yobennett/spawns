import com.yobennett.spawn.server.Server;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader=AnnotationConfigContextLoader.class)
public class ServerAndClientTest {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ServerAndClientTest.class);

	@Configuration
	static class ContextConfiguration {

		@Bean
		public Server server() {
			return new Server(8080, "/ws");
		}
	}

	@Autowired
	private Server server;

	public class RunnableServer implements Runnable {

		@Override
		public void run() {
			server.startAndWait();
		}

	}

	@Test
	public void testClientConnectToServer() throws InterruptedException {
		try {
			new Thread(new RunnableServer()).join();
		} finally {
			server.destroy();
		}
	}

}
