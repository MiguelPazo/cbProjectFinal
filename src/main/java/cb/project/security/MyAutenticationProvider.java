/**
 *
 * Free License
 */
package cb.project.security;

import cb.project.model.ModelUser;
import cb.project.service.ServiceUser;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
public class MyAutenticationProvider implements AuthenticationProvider {

    @Autowired
    private Profiles oProfile;

    @Autowired
    @Qualifier("impl1")
    private ServiceUser oService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        ModelUser oUser = new ModelUser();

        oUser.setUser(authentication.getName());
        oUser.setPassword(authentication.getCredentials().toString());

        ModelUser oUserLogged = oService.login(oUser);

        if (oUserLogged != null) {
            List<GrantedAuthority> grantedAuths = new ArrayList();

            switch (oUserLogged.getProfile()) {
                case 1:
                    grantedAuths.add(new SimpleGrantedAuthority(oProfile.getSuperAdmin()));
                    break;
                case 2:
                    grantedAuths.add(new SimpleGrantedAuthority(oProfile.getAdmin()));
                    break;
                case 3:
                    grantedAuths.add(new SimpleGrantedAuthority(oProfile.getClient()));
                    break;
            }

            Authentication auth = new UsernamePasswordAuthenticationToken(oUserLogged.getUser(),
                    oUserLogged.getPassword(), grantedAuths);

            return auth;
        } else {
            return null;
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

}
