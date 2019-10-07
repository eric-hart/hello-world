package groupId.my.spring.mybatis.mapper;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;

import groupId.my.spring.mybatis.entity.User;
import groupId.my.spring.mybatis.mapper.UserMapper;

/**
 * @interface
 */
@Mapper
public interface UserMapper {
  /**
   * @method
   */
  @Select("select id, name from users")
  ArrayList<User> selectAll();

  /**
   * @method
   */
  @Select("select id, name from users where id = #{id}")
  ArrayList<User> selectById(@Param("id") String id);

  /**
   * @method
   */
  @Insert("insert into users(id, name) values(#{id}, #{name})")
  int insert(@Param("id") String id, @Param("name") String name);

  /**
   * @method
   */
  @Update("update users set name = #{name} where id = #{id}")
  int update(@Param("id") String id, @Param("name") String name);

  /**
   * @method
   */
  @Delete("delete from users where id = #{id}")
  int delete(@Param("id") String id);
}
