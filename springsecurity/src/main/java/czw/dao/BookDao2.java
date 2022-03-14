package czw.dao;

import czw.model.Book2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookDao2 extends JpaRepository<Book2,Integer> {
    List<Book2> getBook2sByAuthorStartingWith(String author);
    List<Book2> getBook2sByPriceGreaterThan(Float price);

    @Query(value = "select * from jpa_book where id=(select max (id) from jpa_book )",nativeQuery = true)
    Book2 getMaxIdBook2();

    @Query("select b from jpa_book b where b.id>:id and b.author=:author")
    List<Book2> getBook2ByIdAndAuthor(@Param("author") String author,@Param("id") Integer id);

    @Query("select b from jpa_book b where b.id<?2 and b.name like %?1%")
    List<Book2> getBook2sByIdAndName(String name,Integer id);

}
