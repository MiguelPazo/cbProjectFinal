/**
 *
 * Free License
 */
package cb.project.interceptor;

import cb.project.dao.DaoAudit;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
@Aspect
public class InterceptorProgram {

    @Autowired
    private InterceptorUtils oUtils;

    @Before("execution(* cb.project.service.impl.ServiceProgramImpl.save(cb.project.model.ModelProgram))")
    public void beforeSave(JoinPoint jPoint) {
        oUtils.registryAdvice("Before", jPoint);
    }

    @After("execution(* cb.project.service.impl.ServiceProgramImpl.save(cb.project.model.ModelProgram))")
    public void afterSave(JoinPoint jPoint) {
        oUtils.registryAdvice("After", jPoint);
    }

    @Before("execution(* cb.project.dao.impl.DaoProgramImpl.delete(Integer))")
    public void beforeDelete(JoinPoint jPoint) {
        oUtils.registryAdvice("Before", jPoint);
    }
}
