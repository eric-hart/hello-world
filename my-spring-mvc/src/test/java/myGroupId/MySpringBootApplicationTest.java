package myGroupId.mySwingMVC;

import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.runner.RunWith;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.web.server.LocalServerPort;

import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

/**
 * @class Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class MySpringBootApplicationTest {
  /**
   * @property
   */
  @LocalServerPort
  private int port;

  /**
   * @property
   */
  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  public void contexLoads() throws Exception {
    String url = "http://localhost:" + port + "/greeting";
    String JSON = this.restTemplate.getForObject(url, String.class);
    boolean assertion = JSON.contains("Hello World!");

    assertThat("JSON:\"/greeting\" should contains \"Hello World\";", assertion);
  }
}
