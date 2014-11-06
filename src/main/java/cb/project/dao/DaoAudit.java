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

    public void insert(ModelAudit oAudit);

    public void update(ModelAudit oAudit);

    public void delete(ModelAudit oAudit);

    public List<ModelAudit> fetchAll();
}
