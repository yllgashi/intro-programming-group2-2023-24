package scope;

// scope - visibility of a member (variable, function, etc)
public class ScopeExample {
    public static void main(String[] args) {

        int age = 40;
        System.out.println(age);

        {
            char gender = 'M';
            System.out.println(gender);

            {
                gender = 'F';
            }
        }
//        System.out.println(gender); (nuk mundemi me e pa jasht scope)
    }
}
