import com.yobennett.spawn.client.Client;
import com.yobennett.spawn.server.Server;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader=AnnotationConfigContextLoader.class)
@TestExecutionListeners( { DependencyInjectionTestExecutionListener.class })
public class ServerAndClientTest {

	@Configuration
	static class ContextConfiguration {

		@Bean
		public Server server() {
			return new Server(8080, "/ws");
		}

		@Bean
		public Client client() {
			return new Client("localhost", 8080);
		}

	}

	@Autowired
	private Server server;

	@Autowired
	private Client client;

	public class RunnableServer implements Runnable {

		@Override
		public void run() {
			try {
				server.startAndWait();
			} catch (InterruptedException exception) {
				exception.printStackTrace();
			}
		}

	}

	public class RunnableClient implements Runnable {

		@Override
		public void run() {
			try {
				client.startAndWait();
			} catch (InterruptedException exception) {
				exception.printStackTrace();
			}
		}

	}

	@Test
	public void testClientConnectToServer() throws InterruptedException {
		// start the server
		new Thread(new RunnableServer()).join();

		// start the client
		new Thread(new RunnableClient()).join();
	}

}
