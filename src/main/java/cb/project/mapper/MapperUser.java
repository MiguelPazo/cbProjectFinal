/**
 *
 * Free License
 */
package cb.project.mapper;

import cb.project.model.ModelUser;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
public interface MapperUser {

    String FETCHALL = "SELECT IDENTIFIER AS id, USER as user, PASSWORD as password, PROFILE as profile FROM USER";
    String INSERT = "INSERT INTO USER (USER, PASSWORD, PROFILE) VALUES (#{user},#{password},#{profile})";
    String UPDATE = "UPDATE USER SET USER=#{user}, PASSWORD=#{password}, PROFILE=#{profile} WHERE ID=#{id}";

    @Select(FETCHALL)
    List<ModelUser> fetchAll();

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert(INSERT)
    void insert(ModelUser user);

    @Update(UPDATE)
    void update(ModelUser user);
}
