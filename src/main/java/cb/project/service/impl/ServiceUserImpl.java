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
    public List<ModelUser> fetchAll() throws Exception {
        List<ModelUser> lstUser = oDao.fetchAll();
        return lstUser;
    }

    @Override
    public Boolean login(ModelUser oUser) {
        return false;
    }

}
