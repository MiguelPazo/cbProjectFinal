/**
 *
 * Free License
 */
package cb.project.service.impl;

import cb.project.dao.DaoUser;
import cb.project.model.ModelUser;
import cb.project.service.ServiceUser;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
@Service("ServiceUserImpl")
@Qualifier("impl1")
public class ServiceUserImpl implements ServiceUser {

    @Autowired
    private DaoUser oDao;

    @Override
    public void insert(ModelUser oUser) throws Exception {
        oDao.insert(oUser);
    }

    @Override
    public void update(ModelUser oUser) throws Exception {
        oDao.update(oUser);
    }

    @Override
    public void delete(ModelUser oUser) throws Exception {
        oDao.delete(oUser);
    }

    @Override
    public List<ModelUser> fetchAll() throws Exception {
        List<ModelUser> lstUser = oDao.fetchAll();
        return lstUser;
    }

    @Override
    public ModelUser login(ModelUser oUser) {
        ModelUser oUserSearched = oDao.getByUser(oUser);

        if (oUserSearched != null) {
            if (oUserSearched.getPassword().equals(oUser.getPassword())) {
                return oUserSearched;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @Override
    public Boolean save(ModelUser oUser) {
        try {
            if (oUser.getId() == null) {
                this.insert(oUser);
            } else {
                this.update(oUser);
            }

            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
