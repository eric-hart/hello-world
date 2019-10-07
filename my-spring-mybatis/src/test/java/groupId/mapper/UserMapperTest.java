package groupId.my.spring.mybatis;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

import com.owlike.genson.Genson;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import groupId.my.spring.mybatis.entity.User;
import groupId.my.spring.mybatis.mapper.UserMapper;

/**
 * @class
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
  /**
   * @property
   */
  @Autowired
  private UserMapper userMapper;

  /**
   * @property
   */
  private final Genson genson = new Genson();

  /**
   * @method
   */
  @Test
  public void testSelectAll() throws Exception {
    ArrayList<User> users = userMapper.selectAll();
    String json = this.genson.serialize(users);
    assertThat(json).contains("[]");
  }

  /**
   * @method
   */
  @Test
  public void testInsert() throws Exception {
    userMapper.insert("1", "Paul Allen");

    ArrayList<User> users = userMapper.selectAll();
    String json = this.genson.serialize(users);
    assertThat(json).contains("[{\"id\":1,\"name\":\"Paul Allen\"}]");
  }

  /**
   * @method
   */
  @Test
  public void testUpdate() throws Exception {
    userMapper.update("1", "Yuki Hsu");

    ArrayList<User> users = userMapper.selectAll();
    String json = this.genson.serialize(users);
    assertThat(json).contains("[{\"id\":1,\"name\":\"Yuki Hsu\"}]");
  }

  /**
   * @method
   */
  @Test
  public void testSelectById() throws Exception {
    userMapper.delete("1");

    ArrayList<User> users = userMapper.selectAll();
    String json = this.genson.serialize(users);
    assertThat(json).contains("[]");
  }
}
