package com.czw;

import com.sun.glass.ui.Application;
import czw.service.BookService2;
import czw.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class test {
//    当我们在使用@Autowired注解的时候，默认required=true,表示注入的时候bean必须存在，否则注入失败。
//    required = false
    @Autowired(required = false)
    private TestService testService;

    @Autowired(required = false)
    BookService2 bookService2;
//    原因错误:Application.class的导包出错了com.sun.glass.ui.Application
    @Test
    public void test01(){
        System.out.println("czw");
        testService = new TestService();
        System.out.println(testService.test("czw"));

    }
}
