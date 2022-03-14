package czw.mapper1;

import czw.model.Chinese;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChineseMapper {
    List<Chinese> getAllBooks();
}
