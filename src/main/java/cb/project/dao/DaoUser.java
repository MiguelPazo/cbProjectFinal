/**
 *
 * Free License
 */
package cb.project.dao;

import cb.project.model.ModelUser;
import java.util.List;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
public interface DaoUser {

    public void insert(ModelUser oUser);

    public void update(ModelUser oUser);

    public void delete(ModelUser oUser);

    public List<ModelUser> fetchAll();

    public ModelUser getByUser(ModelUser oUser);
}
