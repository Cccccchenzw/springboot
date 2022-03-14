//package czw.service;
//
//import czw.dao.BookDao2;
//import czw.model.Book2;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class BookService3 {
//
//    @Autowired
//    BookDao2 bookDao2;
//
//    public void addBook(Book2 book2){
//        bookDao2.save(book2);
//    }
//
//    public Page<Book2> getBook2ByPage(Pageable pageable){
//        return bookDao2.findAll(pageable);
//    }
//
//    public List<Book2> getBook2sByAuthorStartingWith(String author){
//        return bookDao2.getBook2sByAuthorStartingWith(author);
//    }
//
//    public List<Book2> getBook2sByPriceGreaterThan(Float price){
//        return bookDao2.getBook2sByPriceGreaterThan(price);
//    }
//
//    public Book2 getMaxIdBook2(){
//        return bookDao2.getMaxIdBook2();
//    }
//
//    public List<Book2> getBook2ByIdAndAuthor(String author, Integer id){
//        return bookDao2.getBook2ByIdAndAuthor(author,id);
//    }
//
//    public List<Book2> getBook2sByIdAndName(String name, Integer id){
//        return bookDao2.getBook2sByIdAndName(name, id);
//    }
//
//}
