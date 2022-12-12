import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QLCV {
    static Scanner scan = new Scanner(System.in);
    static Employee createEmployee() {
        Employee employee = null;
//        System.out.println("1. Input Admin");
//        System.out.println("2. Input Teamlead");
//        System.out.println("Choose");
//        int choose = Integer.parseInt(scan.nextLine());
//        switch(choose){
//            case 1:
//                employee = new Employee();
//                break;
//            default:
//                human = new Admin();
//        }
        employee.create();
        return employee;
    }
    static void inputEmp() {
        System.out.println("Nhập số nhân viên cần thêm: ");
        int n = Integer.parseInt(scan.nextLine());

        for(int i = 0; i < n; ++i) {
            Employee human = createEmployee();
//            humanList.add(human);
        }

    }

    public static void showMenu() {
        System.out.println("Choose options:");
        System.out.println("1. Add new employee");
        System.out.println("2. Find employee information");
        System.out.println("3. Show");
        System.out.println("2. Thêm dự án");
        System.out.println("4. Tìm dự án theo tên");
        System.out.println("6. Hiển thị thông tin dự án");
        System.out.println("7. Thoát");
        System.out.println();
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        SubTask subtask1 = new SubTask();
        showMenu();
        int choose;
//        while (true){
//            choose = Integer.parseInt(scan.nextLine());
//            switch (choose){
//                case 1:
////                    in
//                    Map<String, String> empMap = new HashMap<>();
//                    empMap.put("ưef", "èc");
//                    Map<String, String> employee = (Map<String, String>) empMap.entrySet();
//            }
//        }
        emp.create();
        emp.read();
    }
}
