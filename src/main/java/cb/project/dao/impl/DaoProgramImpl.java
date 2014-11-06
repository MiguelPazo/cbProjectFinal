/**
 *
 * Free License
 */
package cb.project.dao.impl;

import cb.project.dao.DaoProgram;
import cb.project.mapper.MapperProgram;
import cb.project.model.ModelProgram;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
@Repository("DaoProgramImpl")
public class DaoProgramImpl implements DaoProgram {

    @Autowired
    private MapperProgram oMapper;

    @Override
    public void insert(ModelProgram oProgram) {
        oMapper.insert(oProgram);
    }

    @Override
    public void update(ModelProgram oProgram) {
        oMapper.update(oProgram);
    }

    @Override
    public void delete(ModelProgram oProgram) {
        oMapper.delete(oProgram);
    }

    @Override
    public List<ModelProgram> fetchAll() {
        List<ModelProgram> lstProgram = oMapper.fetchAll();
        return lstProgram;
    }

    @Override
    public ModelProgram getById(ModelProgram oProgram) {
        ModelProgram oProgramSearched = oMapper.getById(oProgram);
        return oProgramSearched;
    }

}
