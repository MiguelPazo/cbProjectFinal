/**
 *
 * Free License
 */
package cb.project.dao;

import cb.project.model.ModelAudit;
import java.util.List;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
public interface DaoAudit {

    void insert(ModelAudit oAudit);

    void update(ModelAudit oAudit);

    void delete(ModelAudit oAudit);

    List<ModelAudit> fetchAll();
}
