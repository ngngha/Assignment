public class Role {
    private int code;
    private String roleName;

    public void create(){

    }

    public void read(){

    }

    public void update(){

    }

    public void delete(){

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Role() {
    }

    public Role(int code, String roleName) {
        this.code = code;
        this.roleName = roleName;
    }
}
