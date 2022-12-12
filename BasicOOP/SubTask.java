import java.util.Date;

public class SubTask {
    private String Id;
    private String name;
    private String description;
    private String status;
    private Employee employee;
    private Task task;
    private Conversation discussion;
    private String createdAt;
    private String updatedAt;

    public void create(){

    }

    public void read(){

    }

    public void update(Date updatedAt){

    }

    public void delete(){

    }

    public void search(SubTask subTask){

    }

    public void addEmployeeToSubTask(){

    }

    public void removeEmployeFromSubTask(){

    }

    public void addDiscussion(){

    }

    public void removeDiscussion() {

    }

    public SubTask() {
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Conversation getDiscussion() {
        return discussion;
    }

    public void setDiscussion(Conversation discussion) {
        this.discussion = discussion;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public SubTask(String id, String name, String description, String status, Employee employee, Task task, Conversation discussion, String createdAt, String updatedAt) {
        Id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.employee = employee;
        this.task = task;
        this.discussion = discussion;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
