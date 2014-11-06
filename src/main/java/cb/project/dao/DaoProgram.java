/**
 *
 * Free License
 */
package cb.project.dao;

import cb.project.model.ModelProgram;
import java.util.List;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
public interface DaoProgram {

    void insert(ModelProgram oProgram);

    void update(ModelProgram oProgram);

    void delete(ModelProgram oProgram);

    List<ModelProgram> fetchAll();

    ModelProgram getById(ModelProgram oProgram);

}
