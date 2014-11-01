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

	public class ExampleServer implements Runnable {

		@Override
		public void run() {
			new Server(8080, "/ws").startAndWait();
		}

	}

	@Test
	public void testClientConnectToServer() {
		new Thread(new ExampleServer()).start();
	}

}
