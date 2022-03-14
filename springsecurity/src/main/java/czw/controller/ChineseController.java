package czw.controller;

import czw.mapper1.ChineseMapper;
import czw.mapper2.ChineseMapper2;
import czw.model.Chinese;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ChineseController {
    @Resource(name = "jdbcTemplateOne")
    JdbcTemplate jdbcTemplateOne;
    @Autowired
    @Qualifier("jdbcTemplateTwo")
    JdbcTemplate jdbcTemplateTwo;

    @RequestMapping("/testDataSource")
    public void testDataSource(){
        List<Chinese> query1 = jdbcTemplateOne.query("select * from chinese", new BeanPropertyRowMapper<>(Chinese.class));
        List<Chinese> query2 = jdbcTemplateTwo.query("select * from chinese", new BeanPropertyRowMapper<>(Chinese.class));
        System.out.println(query1);
        System.out.println(query2);
    }
//    上面是jdbcTemplate多数据源，下面是mybatis
    @Autowired
    ChineseMapper chineseMapper;
    @Autowired
    ChineseMapper2 chineseMapper2;
    @RequestMapping("/testDataSource2")
    public void testDataSource2(){
        List<Chinese> allBooks = chineseMapper.getAllBooks();
        List<Chinese> allBooks1 = chineseMapper2.getAllBooks();
        System.out.println(allBooks);
        System.out.println(allBooks1);
    }
}
