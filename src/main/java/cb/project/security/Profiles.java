/**
 *
 * Free License
 */
package cb.project.security;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
public class Profiles {

    private String superAdmin = "SUPER_ADMIN";
    private String admin = "ADMIN";
    private String client = "CLIENT";

    public String getSuperAdmin() {
        return superAdmin;
    }

    public void setSuperAdmin(String superAdmin) {
        this.superAdmin = superAdmin;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }
}
