/**
 *
 * Free License
 */
package cb.project.service;

import cb.project.model.ModelUser;
import java.util.List;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
public interface ServiceUser {

    void insert(ModelUser oUser) throws Exception;

    void update(ModelUser oUser) throws Exception;

    void delete(ModelUser oUser) throws Exception;

    Boolean delete(Integer idUser);

    List<ModelUser> fetchAll() throws Exception;

    ModelUser login(ModelUser oUser);

    ModelUser getById(Integer id);

    Boolean save(ModelUser oUser);
}
