import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:C:/IdeaProjects/TEST.springMVC/src/main/webapp/WEB-INF/applicationContext.xml")
public class baseJunitTest extends AbstractJUnit4SpringContextTests {


}
