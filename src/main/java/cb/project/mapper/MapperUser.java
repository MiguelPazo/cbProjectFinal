/**
 *
 * Free License
 */
package cb.project.mapper;

import cb.project.model.ModelUser;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
public interface MapperUser {

    String FETCHALL = "SELECT IDUSER AS id, NAME as name, LASTNAME as lastname, USER as user, PASSWORD as password, PROFILE as profile FROM USER";
    String GET_BY_USER = "SELECT IDUSER AS id, NAME as name, LASTNAME as lastname, USER as user, PASSWORD as password, PROFILE as profile FROM USER WHERE USER=#{user}";
    String INSERT = "INSERT INTO USER (NAME, LASTNAME, USER, PASSWORD, PROFILE) VALUES (#{name},#{lastname},#{user},#{password},#{profile})";
    String UPDATE = "UPDATE USER SET NAME=#{name}, LASTNAME=#{lastname}, USER=#{user}, PASSWORD=#{password}, PROFILE=#{profile} WHERE IDUSER=#{id}";
    String DELETE = "DELETE FROM USER WHERE IDUSER=#{id}";

    @Select(FETCHALL)
    List<ModelUser> fetchAll();

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert(INSERT)
    void insert(ModelUser user);

    @Update(UPDATE)
    void update(ModelUser user);

    @Delete(DELETE)
    void delete(ModelUser user);

    @Select(GET_BY_USER)
    ModelUser getByUser(ModelUser oUser);
}
