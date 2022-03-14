package czw.controller;

import czw.model.Book;
import czw.service.BookService;
import czw.service.BookService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @Autowired
    BookService2 bookService2;
    @RequestMapping("/bookOps")
    public void bookOps(){
        Book book1 = new Book();
        book1.setName("西游记");
        book1.setAuthor("吴承恩");
        int i1 = bookService.addBook(book1);
        System.out.println("addBook------" + i1);
        Book book2 = new Book();
        book2.setId(1);
        book2.setName("红楼梦");
        book2.setAuthor("曹雪芹");
        int i2 = bookService.updateBook(book2);
        System.out.println("updateBook------" + i2);
        Book bookById = bookService.getBookById(2);
        System.out.println(bookById.toString());
        int i3 = bookService.deleteBookById(1);
        System.out.println("deleteBookById------" + i3);
        List<Book> allBooks = bookService.getAllBooks();
        System.out.println("allBooks------" + allBooks);
    }

    @RequestMapping("/bookOps2")
    public void bookOps2(){
        Book book1 = new Book();
        book1.setName("西游记");
        book1.setAuthor("吴承恩");
        int i1 = bookService2.addBook(book1);
        System.out.println("addBook------" + i1);
        Book book2 = new Book();
        book2.setId(1);
        book2.setName("红楼梦");
        book2.setAuthor("曹雪芹");
        int i2 = bookService2.updateBook(book2);
        System.out.println("updateBook------" + i2);
        Book bookById = bookService2.getBookById(2);
        System.out.println(bookById.toString());
        int i3 = bookService2.deleteBookById(1);
        System.out.println("deleteBookById------" + i3);
        List<Book> allBooks = bookService2.getAllBooks();
        System.out.println("allBooks------" + allBooks);
    }
}
