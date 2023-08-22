public class ifElsepractice {
    public static void main(String[] args) {

        int x, y, z;

        x = 20;
        y = 20;
        z = 30;

        if (x > y && x > z) {
            System.out.println(x + " is yhe largest ");
        } else if (y > x && y > z) {
            System.out.println(y + " is the largest");
        } else if (z > y && z > x) {
            System.out.println(z + " is the largest");
        } else {
            System.out.println("Numbers are equal");

            // check username and password
            String username, password;

            username = "Admin";
            password = "admin123";

            if (username == "Admin") {
                System.out.println("User is correct");

                if (password == "admin123") {
                    System.out.println("password is correct");
                }
            }


        }
    }}

