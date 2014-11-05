/**
 *
 * Free License
 */
package cb.project.dao.impl;

import cb.project.dao.DaoUser;
import cb.project.mapper.MapperUser;
import cb.project.model.ModelUser;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
@Repository("DaoUserImpl")
public class DaoUserImpl implements DaoUser {

    @Autowired
    private MapperUser oMapper;

    @Override
    public void insert(ModelUser oUser) {
        oMapper.insert(oUser);
    }

    @Override
    public void update(ModelUser oUser) {
        oMapper.update(oUser);
    }

    @Override
    public List<ModelUser> fetchAll() {
        List<ModelUser> lstUser = oMapper.fetchAll();
        return lstUser;
    }

}
