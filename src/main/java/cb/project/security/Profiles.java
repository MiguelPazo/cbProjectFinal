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

    private String admin = "ADMIN";
    private String asistent = "ASISTENT";
    private String client = "CLIENT";

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getAsistent() {
        return asistent;
    }

    public void setAsistent(String asistent) {
        this.asistent = asistent;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }
}
