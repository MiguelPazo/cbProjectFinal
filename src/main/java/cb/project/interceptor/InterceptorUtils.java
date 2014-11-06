/**
 *
 * Free License
 */
package cb.project.interceptor;

import cb.project.dao.DaoAudit;
import cb.project.model.ModelAudit;
import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
public class InterceptorUtils {

//    @Autowired
//    private static DaoAudit oDao;

//    public static void registryAdvice(String Advice, JoinPoint jPoint) {
//        ModelAudit oAudit = new ModelAudit();
//
//        String method = jPoint.getSignature().getName();
//        String description = jPoint.getArgs()[0].toString();
//
//        oAudit.setDate(new Date());
//        oAudit.setMethod(method);
//        oAudit.setAdvice("Before");
//        oAudit.setDescription(description);
//
//        oDao.insert(oAudit);
//
//    }
}
