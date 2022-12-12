import java.util.Date;
import java.util.List;

public class Project {
    private String Id;
    private String name;
    private String description;
    private String status;
    private List<Task> taskList;
    private Date createdAt;
    private Date updatedAt;

    public void create() {

    }

    public void read() {

    }

    public void update(Date updatedAt){

    }

    public void delete() {

    }

    public void search(Project project) {

    }

    public void addTask(Task task) {

    }

    public void removeTask(Task task){

    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Project(String id, String name, String description, String status, List<Task> taskList, Date createdAt, Date updatedAt) {
        Id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.taskList = taskList;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Project() {
    }
}
