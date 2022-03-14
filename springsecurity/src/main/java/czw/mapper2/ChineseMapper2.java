package czw.mapper2;

import czw.model.Chinese;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChineseMapper2 {
    List<Chinese> getAllBooks();

}
