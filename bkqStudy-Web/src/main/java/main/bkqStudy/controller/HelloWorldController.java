package main.bkqStudy.controller;

import main.bkqStudy.mapper.PersonMapper;
import main.bkqStudy.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    StringRedisTemplate stringRedisTemplate;//只能操作key-value

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    PersonMapper personMapper;

    @Autowired
    PersonService personService;

    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

    //redis 操作
    @RequestMapping("/teacher")
    public String teacher() {
        //opsForValue 对字符型操作
        stringRedisTemplate.opsForValue().set("laoshi:3", "3333");
        String value = stringRedisTemplate.opsForValue().get("laoshi:3");

        redisTemplate.opsForValue().set("laoshi:4", "12344");
        Object value2 = redisTemplate.opsForValue().get("laoshi:4");
        return value + "__" + value2.toString();
    }

    @RequestMapping("/query")
    public Object queryById(int id) {
        return personMapper.findPersonById(id);
    }

    @RequestMapping("/getUser/{id}")
    public String GetUser(@PathVariable int id) {
        return personService.Sel(id).toString();
    }
}
