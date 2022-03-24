package czw.mapper;

import czw.model.Role;
import czw.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    User loadUserByUsername(String username);
    List<Role> getUserRoleByUid(Integer id);
}
