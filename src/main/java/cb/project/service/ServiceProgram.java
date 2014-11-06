/**
 *
 * Free License
 */
package cb.project.service;

import cb.project.model.ModelProgram;
import java.util.List;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
public interface ServiceProgram {

    void insert(ModelProgram oProgram) throws Exception;

    void update(ModelProgram oProgram) throws Exception;

    void delete(ModelProgram oProgram) throws Exception;

    Boolean delete(Integer id);

    List<ModelProgram> fetchAll() throws Exception;

    Boolean save(ModelProgram oProgram);

    ModelProgram getById(Integer id);
}
