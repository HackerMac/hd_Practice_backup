import com.ihrm.system.SystemApplication;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description TODO
 * @Date 2021/7/10
 * @Created by MINGKU
 */
@SpringBootTest(classes = SystemApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class IhrmSystemTest {

    @Value("${my.appId}")
    private String APP_ID;
    @Value("${my.apiKey}")
    private String API_KEY;
    @Value("${my.secretKey}")
    private String SECRET_KEY;
    @Value("${my.imageType}")
    private String IMAGE_TYPE;
    @Value("${my.groupId}")
    private String groupId;


    @Test
    public void testMd5(){
        String password = new Md5Hash("123456" , "13800000002" , 3).toString();
        System.out.println(password.equals("c8b7722b1139bb9b346409e503302e82"));

    }


    @Test
    public void testAPI() {
        System.out.println(APP_ID);
        System.out.println(API_KEY);
        System.out.println(SECRET_KEY);
        System.out.println(IMAGE_TYPE);
        System.out.println(groupId);
    }
}
