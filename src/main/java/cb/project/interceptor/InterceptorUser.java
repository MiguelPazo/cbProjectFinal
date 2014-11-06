/**
 *
 * Free License
 */
package cb.project.interceptor;

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
public class InterceptorUser {

    @Autowired
    private InterceptorUtils oUtils;

    @Before("execution(* cb.project.service.impl.ServiceUserImpl.save(cb.project.model.ModelUser))")
    public void beforeSave(JoinPoint jPoint) {
        oUtils.registryAdvice("Before", jPoint);
    }

    @After("execution(* cb.project.service.impl.ServiceUserImpl.save(cb.project.model.ModelUser))")
    public void afterSave(JoinPoint jPoint) {
        oUtils.registryAdvice("After", jPoint);
    }

}
