package test;

import com.beta.test.testng.beans.TestBean;
import com.beta.test.testng.config.SpringConfig;
import com.beta.test.testng.page.MainPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@ContextConfiguration(classes = SpringConfig.class)
public class TestSpring extends AbstractTestNGSpringContextTests {

    @Autowired
    public TestBean testBean;
    @Autowired
    public MainPage mainPage;
    @Autowired
    private ApplicationContext ctx;
    @Value("${server.url}")
    private String startBadeUrl;

    @Test
    public void t_01() {
        Assert.assertNotNull("TEST");
    }

    @Test
    public void t_02() {
        mainPage.open();
    }

    @Test
    public void testHello(){
        Assert.assertEquals("Hello", testBean.returnHello());

    }
}
