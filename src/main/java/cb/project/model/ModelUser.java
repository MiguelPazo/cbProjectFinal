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
    private String name;
    private String lastname;
    private String user;
    private String password;
    private Integer profile;

    public ModelUser() {
    }

    public ModelUser(Integer id, String name, String lastname, String user, String password, Integer profile) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.user = user;
        this.password = password;
        this.profile = profile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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
        return "ModelUser{" + "id=" + id + ", name=" + name + ", lastname=" + lastname + ", user=" + user + ", password=" + password + ", profile=" + profile + '}';
    }
}
