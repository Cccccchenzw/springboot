package czw.service;

import czw.mapper.BookMapper;
import czw.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService2 {
    @Autowired
    BookMapper bookMapper;

    public int addBook(Book book){
        return bookMapper.addBook(book);
    }

    public int updateBook(Book book){
        return bookMapper.updateBook(book);
    }

    public int deleteBookById(Integer id){
        return bookMapper.deleteBookById(id);
    }

    public Book getBookById(Integer id){
        return bookMapper.getBookById(id);
    }

    public List<Book> getAllBooks(){
        return bookMapper.getAllBooks();
    }
}
