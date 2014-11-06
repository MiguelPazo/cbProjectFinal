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

    public void insert(ModelUser oUser) throws Exception;

    public void update(ModelUser oUser) throws Exception;

    public void delete(ModelUser oUser) throws Exception;

    public List<ModelUser> fetchAll() throws Exception;

    public ModelUser login(ModelUser oUser);

    public Boolean save(ModelUser oUser);
}
