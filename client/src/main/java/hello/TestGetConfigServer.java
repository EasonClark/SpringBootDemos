package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hasee
 * 2018-05-30
 */

@RefreshScope
@RestController
public class TestGetConfigServer {
    @Value("${message}")
    private String message;

    @RequestMapping(value="/hello")
    public String sayWords() {
        return "say: " + message + "!";
    }

}
