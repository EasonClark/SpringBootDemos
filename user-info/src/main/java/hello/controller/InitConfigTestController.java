package hello.controller;

import hello.service.InitConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hasee
 * 2018-05-31
 */

@RestController("/user-info")
public class InitConfigTestController {
    @Autowired
    private InitConfigService initConfigService;

    @RequestMapping(value = "/getUserInfoCount", method = RequestMethod.GET)
    public int getUserInfoCount() {
        return initConfigService.getUserInfoCount();
    }

}
