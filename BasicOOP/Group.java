import java.util.Date;
import java.util.List;

public class Group {
    private String Id;
    private String name;
    private Employee leader;
    //mã
    //tìm group theo tên
    private List<Employee> empList;
    private String description;
    private Date createdAt;
    private Date updatedAt;

    public void create(){

    }

    public void read(){

    }

    public void update(){

    }

    public void delete(){

    }

    public void search(Group group){

    }

    public void addEmployeeToGroup(Employee employee){

    }

    public void removeEmployeeFromGroup(Employee employee){

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

    public Employee getLeader() {
        return leader;
    }

    public void setLeader(Employee leader) {
        this.leader = leader;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Group(String id, String name, Employee leader, List<Employee> empList, String description, Date createdAt, Date updatedAt) {
        Id = id;
        this.name = name;
        this.leader = leader;
        this.empList = empList;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Group() {
    }
}
