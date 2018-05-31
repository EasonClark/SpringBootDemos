package hello.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * test for initing project
 *
 * @author hasee
 * 2018-05-31
 */

@RestController
public class SayHello {
    private static final Logger LOGGER = LoggerFactory.getLogger(SayHello.class);

    @RequestMapping(value = "/sayHello")
    public String saySomething() {
        LOGGER.error("error level msg");
        LOGGER.warn("warn level msg");
        LOGGER.info("info level msg");
        return "Hello World!";
    }
}
