/**
 *
 * Free License
 */
package cb.project.dao.impl;

import cb.project.dao.DaoAudit;
import cb.project.mapper.MapperAudit;
import cb.project.model.ModelAudit;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
@Repository("DaoAuditImpl")
public class DaoAuditImpl implements DaoAudit {

    @Autowired
    private MapperAudit oMapper;

    @Override
    public void insert(ModelAudit oAudit) {
        oMapper.insert(oAudit);
    }

    @Override
    public void update(ModelAudit oAudit) {
        oMapper.update(oAudit);
    }

    @Override
    public void delete(ModelAudit oAudit) {
        oMapper.delete(oAudit);
    }

    @Override
    public List<ModelAudit> fetchAll() {
        List<ModelAudit> lstAudit = oMapper.fetchAll();
        return lstAudit;
    }

}
