public class switch_statement_challange {
    public static void main(String args[]) {


        char switch_var = 'B';
        switch (switch_var) {
            case 'A':
                System.out.println("this char is A");
                break;

            case 'C':
                System.out.println("this char is C");
                break;
            case 'D':
            case 'B':
            case 'E':
                System.out.println(" this char is either a D a B or an E");
                break;
            default:
                System.out.println("the char was neither A B C D or E");
                break;
        }
    }
}




