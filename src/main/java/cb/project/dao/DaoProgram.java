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

    public void insert(ModelProgram oProgram);

    public void update(ModelProgram oProgram);

    public List<ModelProgram> fetchAll();

}
