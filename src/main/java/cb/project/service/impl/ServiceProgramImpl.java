/**
 *
 * Free License
 */
package cb.project.service.impl;

import cb.project.dao.DaoProgram;
import cb.project.model.ModelProgram;
import cb.project.service.ServiceProgram;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
@Service("ServiceProgramImpl")
public class ServiceProgramImpl implements ServiceProgram {

    @Autowired
    private DaoProgram oDao;

    @Override
    public void insert(ModelProgram oProgram) throws Exception {
        oDao.insert(oProgram);
    }

    @Override
    public void update(ModelProgram oProgram) throws Exception {
        oDao.update(oProgram);
    }

    @Override
    public void delete(ModelProgram oProgram) throws Exception {
        oDao.delete(oProgram);
    }

    @Override
    public List<ModelProgram> fetchAll() throws Exception {
        List<ModelProgram> lstProgram = oDao.fetchAll();
        return lstProgram;
    }

    @Override
    public Boolean save(ModelProgram oProgram) {
        try {
            if (oProgram.getIdProgram() == null) {
                this.insert(oProgram);
            } else {
                this.update(oProgram);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
