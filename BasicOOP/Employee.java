import java.util.*;

public class Employee{
    private String Id;
    private String name;
    private String dateOfBirth;
    private String mail;
    private String gender;
    private String skills;
    private String password;
    private Role role;
    private boolean isAvailable;
    private String profileImage;
    private Date createdAt;
    private Date updatedAt;
    private Group groupId;
    Scanner scan = new Scanner(System.in);

    public void create(){
        System.out.println("Employee's ID: ");
        this.Id = scan.nextLine();
        System.out.println("Full name: ");
        this.name = scan.nextLine();
        System.out.println("Date of birth: ");
        this.dateOfBirth = scan.nextLine();
        System.out.println("Email: ");
        this.mail = scan.nextLine();
        System.out.println("Gender: ");
        this.gender = scan.nextLine();
        System.out.println("Skills: ");
        this.skills = scan.nextLine();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", mail='" + mail + '\'' +
                ", gender='" + gender + '\'' +
                ", skills='" + skills + '\'' +
                '}';
    }

    public void read(){
        System.out.println(this);
    }

    public void update(Date updatedAt){

    }

    public void delete(){

    }

    public void search(Employee employee){
//        static void searchByNameE() {
//        CustomQueue<Employee> employeeList = new CustomQueue<>();
//            System.out.println("Nhập tên nhân viên cần tìm kiếm: ");
//            String name = scan.nextLine();
//            for(Employee emp : employeeList) {
//                if (emp.getName().equals(name)) {
//                    emp.read();
//                }
//            }
//
////        }
    }

    public void logIn(){

    }

    public void logOut(){

    }

    public Employee(String id, String name, String dateOfBirth, String mail, String gender, String skills, String password, Role role, boolean isAvailable, String profileImage, Date createdAt, Date updatedAt) {
        Id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.mail = mail;
        this.gender = gender;
        this.skills = skills;
        this.password = password;
        this.role = role;
        this.isAvailable = isAvailable;
        this.profileImage = profileImage;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Employee() {
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
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
}
