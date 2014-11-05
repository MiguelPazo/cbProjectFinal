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

    public void insert(ModelProgram oProgram) throws Exception;

    public void update(ModelProgram oProgram) throws Exception;

    public List<ModelProgram> fetchAll() throws Exception;
}
