import java.util.Date;
import java.util.List;

public class Task {
    private String Id;
    private String name;
    private String description;
    private String status;
    private Group group;
    private Project project;
    private List<SubTask> subTaskList;
    private Date createdAt;
    private Date updatedAt;

    public Task(String id, String name, String description, String status, Group group, Project project, List<SubTask> subTaskList, Date createdAt, Date updatedAt) {
        Id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.group = group;
        this.project = project;
        this.subTaskList = subTaskList;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Task() {
    }

    public void create(){

    }

    public void read(){

    }

    public void update(SubTask subTask){

    }

    public void delete(){

    }

    public void search(Task task){

    }

    public void addSubTaskToTask(){

    }

    public void addGroupToTask(){

    }

    public void removeSubTask(){

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

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public List<SubTask> getSubTaskList() {
        return subTaskList;
    }

    public void setSubTaskList(List<SubTask> subTaskList) {
        this.subTaskList = subTaskList;
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

    public void removeGroupFromTask(){

    }
}
