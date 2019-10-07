package groupId.my.spring.mybatis;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.owlike.genson.Genson;

import groupId.my.spring.mybatis.entity.User;
import groupId.my.spring.mybatis.mapper.UserMapper;

/**
 * @class
 *
 */
@MapperScan("groupId.my.spring.mybatis.mapper")
@SpringBootApplication
public class Application implements CommandLineRunner {
  /**
   * @property
   */
  @Autowired
  private UserMapper userMapper;

  /**
   * @property
   */
  private Genson genson = new Genson();

  /**
   * @method
   */
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  /**
   * @method
   */
  @Override
  public void run(String... args) {
    ArrayList<User> users = this.userMapper.selectAll();
    System.out.println(genson.serialize(users));
  }
}
