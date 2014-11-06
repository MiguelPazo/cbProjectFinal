/**
 *
 * Free License
 */
package cb.project.mapper;

import cb.project.model.ModelAudit;
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
public interface MapperAudit {

    String FETCHALL = "SELECT IDAUDIT AS id, DATE as date, METHOD as method, ADVICE as advice, DESCRIPTION as description FROM AUDIT";
    String INSERT = "INSERT INTO AUDIT (DATE, METHOD, ADVICE, DESCRIPTION) VALUES (#{date},#{method},#{advice},#{description})";
    String UPDATE = "UPDATE AUDIT SET DATE=#{date}, METHOD=#{method}, ADVICE=#{advice}, DESCRIPTION=#{description} WHERE IDAUDIT=#{id}";
    String DELETE = "DELETE FROM AUDIT WHERE IDAUDIT=#{id}";

    @Select(FETCHALL)
    List<ModelAudit> fetchAll();

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert(INSERT)
    void insert(ModelAudit progam);

    @Update(UPDATE)
    void update(ModelAudit program);

    @Delete(DELETE)
    void delete(ModelAudit program);
}
