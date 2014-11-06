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

    void insert(ModelUser oUser);

    void update(ModelUser oUser);

    void delete(ModelUser oUser);

    List<ModelUser> fetchAll();

    ModelUser getByUser(ModelUser oUser);

    ModelUser getById(ModelUser oUser);
}
