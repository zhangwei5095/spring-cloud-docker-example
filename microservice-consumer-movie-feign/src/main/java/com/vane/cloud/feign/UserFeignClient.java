package com.vane.cloud.feign;

/**
 * @Author Vane
 * @Date 2018年05月14日
 */
import com.vane.cloud.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jacky on 2017/7/14.
 */
@FeignClient("microservice-provider-user")
public interface UserFeignClient {
    /**
     * 根据Id获得User
     * 两个坑：1. @GetMapping不支持   2. @PathVariable得设置value
     * @param id
     * @return
     */
    @RequestMapping(value = "/simple/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User postUser(@RequestBody User user);

    // 该请求不会成功，只要参数是复杂对象，即使指定了是GET方法，feign依然会以POST方法进行发送请求。可能是我没找到相应的注解或使用方法错误。
    // 也就是说复杂对象，feign一定要post的请求方式
    @RequestMapping(value = "/get-user", method = RequestMethod.GET)
    public User getUser(User user);
}