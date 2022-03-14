//package czw.controller;
//
//import czw.model.Book2;
//import czw.service.BookService3;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class Book2Controller {
//    @Autowired
//    BookService3 bookService3;
//    @RequestMapping("/findAllBook2")
//    public void findAllBook2(){
//        Pageable pageable = PageRequest.of(2,3);
//        Page<Book2> page = bookService3.getBook2ByPage(pageable);
//        System.out.println("总页数：" + page.getTotalPages());
//        System.out.println("总记录数：" + page.getTotalElements());
//        System.out.println("查询结果：" + page.getContent());
//        System.out.println("当前页数：" + (page.getNumber()+1));
//        System.out.println("当前页记录数：" + page.getNumberOfElements());
//        System.out.println("每页记录数：" + page.getSize());
//    }
//
////    由于表名有数字影响了JPA的识别，去掉数字即可
//    @RequestMapping("/searchBook2")
//    public void searchBook3(){
//        List<Book2> bs1 = bookService3.getBook2ByIdAndAuthor("鲁迅",7);
//        List<Book2> bs2 = bookService3.getBook2sByAuthorStartingWith("吴");
//        List<Book2> bs3 = bookService3.getBook2sByIdAndName("西",8);
//        List<Book2> bs4 = bookService3.getBook2sByPriceGreaterThan(30F);
//        Book2 book2 = bookService3.getMaxIdBook2();
//        System.out.println("bs1:------"+bs1);
//        System.out.println("bs2:------"+bs2);
//        System.out.println("bs3:------"+bs3);
//        System.out.println("bs4:------"+bs4);
//        System.out.println("book2:------"+book2);
//    }
//
//    @RequestMapping("/saveBook2")
//    public void  saveBook2(){
//        Book2 book2 = new Book2();
//        book2.setId(100);
//        book2.setAuthor("鲁迅");
//        book2.setName("呐喊");
//        book2.setPrice(23F);
//        bookService3.addBook(book2);
//    }
//}
