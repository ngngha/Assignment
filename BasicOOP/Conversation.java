import java.util.Date;

public class Conversation {
    private int id;
    private Employee employee;
    private SubTask subTask;
    private String line;

    public void create(){

    }

    public void read(){

    }

    public void update(){

    }

    public void delete(){

    }

    public void search(Conversation conversation){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public SubTask getSubTask() {
        return subTask;
    }

    public void setSubTask(SubTask subTask) {
        this.subTask = subTask;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public Conversation(int id, Employee employee, SubTask subTask, String line) {
        this.id = id;
        this.employee = employee;
        this.subTask = subTask;
        this.line = line;
    }

    public Conversation() {
    }
}
