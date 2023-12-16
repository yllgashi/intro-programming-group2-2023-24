package switch_syntax.practice;

public class MenuExample {
    public static void main(String[] args) {
        String menu = "Dashboard";
        // String menu = "dashboard"; // kjo menaxhohet me default pasiqe "Dashboard" != "dashboard"

        switch (menu) {
            case "Dashboard":
                System.out.println("Je ne faqe kryesore");
                break;
            case "Administrator":
                System.out.println("Je ne faqe te Admin");
                break;
            default:
                System.out.println("Nuk e ke menahxu");
        }
    }
}
