import java.util.*;

public class StackOperations {
    static Scanner scan = new Scanner(System.in);
      
    public static void stackFunctions()
    {
        int inputArray [] = new int[100];
        int top = -1;
        
        do {
            System.out.println("*****Stack Menu*****");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Is Empty");
            System.out.println("5.Display");
            System.out.println("6.Exit");
            System.out.print("Enter your choice: ");
            int sChoice = scan.nextInt();
            switch(sChoice)
            {
                //Push the element in stack
                case 1:
                if(top == inputArray.length-1)
                {
                    System.out.println("Stack is overflow can't push elements");
                    System.out.print("Do you want pop some elements in stack press 9 or press enter : ");
                }
                else
                {
                    System.out.print("Enter value to push in stack: ");
                    int value = scan.nextInt();
                    inputArray[++top] = value;
                    System.err.println("Element pushed in stack successfully.");
                }
                System.out.print("Do you want continue in stack menu press 9 or press enter : ");
                break;
                //Pop the Element from Stack
                case 2:
                if(top == -1)
                {
                    System.out.println("Stack is underflow can't operate POP operation.");
                    System.out.print("Do you want push some elements in stack press 9 : ");
                    break;
                }
                else
                {
                    inputArray [top] = inputArray[top--] ;
                    System.err.println("Element popped in stack successfully.");
                }
                System.out.print("Do you want continue in stack menu press 9 or press enter : ");
                break;
                //Peek element in stack
                case 3:
                System.out.println("Top Element is : "+inputArray[top]);
                System.out.print("Do you want continue in stack menu press 9 or press enter : ");
                break;
                //Check stack is empty
                case 4:
                if(top ==-1)
                {
                    System.out.println("Stack is empty");
                    System.out.print("Do you want push some elements in stack press 9 and goto PUSH menu: ");
                    break;
                }
                else
                {
                    System.out.println("Stack have some elements.");
                    System.out.print("Do you want check those elements in stack press 9 and go to DISPLAY menu: ");
                    break;
                }
                // Display Stack
                case 5:
                System.out.println("Elements in Stack,");
                for (int i=0;i<=top;i++)
                {
                    System.err.println(inputArray[i]);
                }
                System.out.print("Do you want continue in stack menu press 9 or press enter : ");
                break;
                case 6:
                System.exit(0);
                break;
                default:
                System.out.println("Plese enter number from metioned menu.");
                break;
            }

        }while(scan.nextInt()== 9);

    }
    
}
