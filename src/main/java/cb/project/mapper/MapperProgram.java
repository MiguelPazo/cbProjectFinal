/**
 *
 * Free License
 */
package cb.project.mapper;

import cb.project.model.ModelProgram;
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
public interface MapperProgram {

    String FETCHALL = "SELECT IDPROGRAMA AS idProgram, TITULO as title, DESCRIPCION as description, OBJETIVOS as goal, REQUISITOS as requirements, PRECIO as price, DURACION as duration, ESTADO as status FROM PROGRAMAS";
    String GET_BY_ID = "SELECT IDPROGRAMA AS idProgram, TITULO as title, DESCRIPCION as description, OBJETIVOS as goal, REQUISITOS as requirements, PRECIO as price, DURACION as duration, ESTADO as status FROM PROGRAMAS WHERE IDPROGRAMA=#{idProgram}";
    String INSERT = "INSERT INTO PROGRAMAS (TITULO,DESCRIPCION,OBJETIVOS,REQUISITOS,PRECIO,DURACION,ESTADO) VALUES (#{title},#{description},#{goal},#{requirements},#{price},#{duration},#{status})";
    String UPDATE = "UPDATE PROGRAMAS SET TITULO=#{title}, DESCRIPCION=#{description}, OBJETIVOS=#{goal}, REQUISITOS=#{requirements}, PRECIO=#{price}, DURACION=#{duration}, ESTADO=#{status} WHERE IDPROGRAMA=#{idProgram}";
    String DELETE = "DELETE FROM PROGRAMAS WHERE IDPROGRAMA=#{idProgram}";

    @Select(FETCHALL)
    List<ModelProgram> fetchAll();

    @Options(useGeneratedKeys = true, keyProperty = "idProgram")
    @Insert(INSERT)
    void insert(ModelProgram oProgram);

    @Update(UPDATE)
    void update(ModelProgram oProgram);

    @Delete(DELETE)
    void delete(ModelProgram oProgram);

    @Select(GET_BY_ID)
    ModelProgram getById(ModelProgram oProgram);

}
