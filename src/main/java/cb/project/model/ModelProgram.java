/**
 *
 * Free License
 */
package cb.project.model;

/**
 *
 * @author Miguel Pazo Sánchez (http://miguelpazo.com/)
 */
public class ModelProgram {

    private Integer idProgram;
    private String title;
    private String description;
    private String goal;
    private String requirements;
    private Double price;
    private Integer duration;
    private Integer status;

    public ModelProgram() {
        this.status = 1;
    }

    public ModelProgram(Integer idProgram, String title, String description, String goal, String requirements, Double price, Integer duration, Integer status) {
        this.idProgram = idProgram;
        this.title = title;
        this.description = description;
        this.goal = goal;
        this.requirements = requirements;
        this.price = price;
        this.duration = duration;
        this.status = status;
    }

    public Integer getIdProgram() {
        return idProgram;
    }

    public void setIdProgram(Integer idProgram) {
        this.idProgram = idProgram;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ModelProgram{" + "idProgram=" + idProgram + ", title=" + title + ", description=" + description + ", goal=" + goal + ", requirements=" + requirements + ", price=" + price + ", duration=" + duration + ", status=" + status + '}';
    }

}
