/**
 *
 * Free License
 */
package cb.project.interceptor;

import cb.project.dao.DaoAudit;
import cb.project.model.ModelAudit;
import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
@Aspect
@Component("InterceptorUser")
public class InterceptorUser {

    @Autowired
    private DaoAudit oDao;

//    args(autor) => Confirm name of argument
//    @Before("execution(* cb.project.service.impl.update(cb.project.model.ModelUser)) && args(oUser)")
//    public void beforeInsert(JoinPoint jPoint) {
//        InterceptorUtils.registryAdvice("Before", jPoint);
//    }
//    @After("execution(* cb.project.service.impl.ServiceUserImpl.insert(cb.project.model.ModelUser))")
    public void afterInsert(JoinPoint jPoint) {
        registryAdvice("After", jPoint);
    }

    public void registryAdvice(String Advice, JoinPoint jPoint) {
        ModelAudit oAudit = new ModelAudit();

        String method = jPoint.getSignature().getName();
        String description = jPoint.getArgs()[0].toString();

        oAudit.setDate(new Date());
        oAudit.setMethod(method);
        oAudit.setAdvice("Before");
        oAudit.setDescription(description);

        oDao.insert(oAudit);

    }

}
