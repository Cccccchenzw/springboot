package czw.controller;

import czw.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRedisController {
    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/redis")
    public void redisTest(){
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ops.set("name","陈章文");
        System.out.println(ops.get("name"));
        ValueOperations value = redisTemplate.opsForValue();
        Book book = new Book();
        book.setId(999);
        book.setName("七里香");
        book.setAuthor("周杰伦");
//        需要该对象实现序列化
        value.set("jay",book);
        Book jay = (Book)value.get("jay");
        System.out.println(jay);
    }
}

