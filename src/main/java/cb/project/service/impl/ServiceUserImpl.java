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
import org.springframework.security.access.prepost.PreAuthorize;
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

//    @PreAuthorize("hasRole('SUPER_ADMIN')")
    @Override
    public Boolean save(ModelUser oUser) {
        try {
            if (oUser.getId() != null) {
                if (oUser.getPassword() == null
                        || oUser.getPassword().equals("")
                        || oUser.getPassword().equals("********")) {
                    String password = this.getById(oUser.getId()).getPassword();
                    oUser.setPassword(password);
                }

                this.update(oUser);
            } else {
                this.insert(oUser);
            }

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public ModelUser getById(Integer id) {
        ModelUser oUser = new ModelUser();
        oUser.setId(id);

        ModelUser oUserSearched = oDao.getById(oUser);

        if (oUserSearched != null) {
            return oUserSearched;
        } else {
            return new ModelUser();
        }

    }

//    @PreAuthorize("hasRole('SUPER_ADMIN')")
    @Override
    public Boolean delete(Integer idUser) {
        ModelUser oUser = new ModelUser();
        oUser.setId(idUser);

        try {
            this.delete(oUser);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
