package jumpStatements;

public class JumpAsGoto {
    public static void main(String[] args) {
        // create scope, ex.1
        {
            System.out.println("Scope 1");
        }
        {
            System.out.println("Scope 2");
        }

        // create scope, ex.2
        first: {
            System.out.println("Scope 1");
        }
        second: {
            System.out.println("Scope 2");
        }

        // use jump statements as "goto"
        first: {
            second: {
                third: {
                    System.out.println("This will be executed");
                    if(true) break second;
                    System.out.println("This will now be executed");
                }
                System.out.println("This will now be executed");
            }
            System.out.println("Execution will go there after 'break'");
        }
    }
}
