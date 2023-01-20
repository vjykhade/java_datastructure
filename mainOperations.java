import java.util.Scanner;

public class mainOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       do {
        System.out.println("**************Data Structure Operations Menu**************");
        System.out.println("1.Array");
        System.out.println("2.Stack");
        System.out.println("3.Linked List");
        System.out.println("4.Queue");
        System.out.println("5.Exit");
        System.err.print("Enter Your Choice: ");
        int choice = scan.nextInt();
        System.out.println("Entered Choice: "+choice);
        switch(choice)
        {
            case 1:
            ArrayOperations.arrayFunctions();
            break;
            case 2:
            StackOperations.stackFunctions();
            break;
            case 3:
            LinkedListOperations.linkedListFunctions();
            break;
            case 4:
            QueueOperations.queueFunctions();
            break;
            case 5:
            System.out.println("Thank you for using this application");
            System.exit(0);
            break;
            default:
            System.out.println("Please enter between above numbers.");
            break;
        }
        System.out.print("For main menu..press 11 : ");
       } while (scan.nextInt() == 11); 
       scan.close();
    }
    
        
}
