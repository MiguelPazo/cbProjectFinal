/**
 *
 * Free License
 */
package cb.project.model;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
public class ModelUser {

    private Integer id;
    private String user;
    private String password;
    private Integer profile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getProfile() {
        return profile;
    }

    public void setProfile(Integer profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "ModelUser{" + "id=" + id + ", user=" + user + ", password=" + password + ", profile=" + profile + '}';
    }
}
