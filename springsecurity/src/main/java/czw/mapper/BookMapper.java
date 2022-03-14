package czw.mapper;

import czw.model.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    int addBook(Book book);
    int updateBook(Book book);
    int deleteBookById(Integer id);
    Book getBookById(Integer id);
    List<Book> getAllBooks();

}
