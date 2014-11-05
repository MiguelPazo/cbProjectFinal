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
@Service("ServiceUserImpl_Sec")
@Qualifier("impl2")
public class ServiceUserImpl_Sec implements ServiceUser {

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
    public List<ModelUser> fetchAll() throws Exception {
        List<ModelUser> lstUser = oDao.fetchAll();
        return lstUser;
    }

    @Override
    public Boolean login(ModelUser oUser) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
