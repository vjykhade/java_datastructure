import java.util.*;

public class ArrayOperations {
    static Scanner scan = new Scanner(System.in);
    
    public static void arrayFunctions()
    {
         int inputArray[] = null ;
        do {
            System.out.println("*****Array Menu*****");
            System.out.println("1.Insert Array");
            System.out.println("2.Sorting Array");
            System.out.println("3.Search Element Array");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.print("Enter your choice: ");
            
            int aChioce = scan.nextInt();
            switch(aChioce)
            {
                // Insert an Array Elements
                case 1:
                System.out.println("******inserting Array******");
                System.out.print("Enter size of array: ");
                int limit = scan.nextInt();
                inputArray = new int[limit];
                System.out.println("Enter values of array,");
                Scanner in = new Scanner(System.in);
                for (int i=0;i<limit;i++)
                {
                    inputArray[i] = in.nextInt();
                }
                System.out.print("Do you continue in array menu - 9 or press 0 : ");
                break;
                case 2:
                System.out.println("******Sorting Array******");
                if (inputArray == null)
                {
                    System.out.println("Array not inserted yet, insert array first and then display it");
                    System.out.print("Do you continue to insert array press - 9 or press 0 : ");
                    break;
                }
                else
                {
                System.out.println("Which order you want to sort");
                System.out.println("1. Asending Order");
                System.out.println("2. Desending Order");
                System.out.println("3. Exit");
                System.out.print("Please enter you choice: ");
                int sortOrder = scan.nextInt();
                if (sortOrder == 1)
                {
                    Arrays.sort(inputArray);
                    System.out.println("Array sorted successfully, please go Array menu and check result on DISPLAY option.");   
                    System.out.print("Do you continue in array menu enter - 9 or press 0 : ");   
                }
                else if (sortOrder == 2)
                {
                    int temp = 0;
                    for (int i = 0; i < inputArray.length; i++) {     
                        for (int j = i+1; j < inputArray.length; j++) {     
                           if(inputArray[i] < inputArray[j]) {    
                               temp = inputArray[i];    
                               inputArray[i] = inputArray[j];    
                               inputArray[j] = temp;    
                           }     
                        }     
                    } 
                    System.out.println("Array sorted successfully, please go Array menu and check result on DISPLAY option.");   
                    System.out.print("Do you continue in array menu enter - 9 or press 0 : ");   
                }
                else if (sortOrder == 3)
                {
                    System.exit(0);
                }

                }
                break;
                case 3:
                //Search Elements
                System.out.println("******Searching Array******");
                if (inputArray == null)
                {
                    System.out.println("Array not inserted yet, insert array first and then display it");
                    System.out.print("Do you continue to insert array press - 9 or press 0 : ");
                    break;
                }
                else
                {
                    System.out.print("Enter value to find : ");
                    int search = scan.nextInt();
                    int i;
                    for (i=0;i<inputArray.length;i++)
                    {
                    if(inputArray[i] == search)
                    {
                        System.out.println(search+" number found at "+(i+1)+" location.");
                        break;
                    }
                    }
                    if (i == inputArray.length)  
                    System.out.println(search + " isn't present in array.");  
                }
                System.out.print("Do you continue in array menu enter - 9 or press 0 : ");
                break;
                //Display the Array Elements
                case 4:
                System.out.println("******Displying Array******");
                if (inputArray == null)
                {
                    System.out.println("Array not inserted yet, insert array first and then display it");
                    System.out.print("Do you continue to insert array press - 9 or press 0 : ");
                    break;
                }
                else
                {
                System.out.println("Entered array : ");
                for (int g=0;g<inputArray.length;g++)
                {
                    System.out.print(inputArray[g]+" ");
                }
                System.out.println("");
                }
                System.out.print("Do you continue in array menu enter - 9 or press 0 : ");
                break;
                case 5:
                System.exit(0);;
                break;
                default:
                System.out.println("Plese enter number from metioned menu.");
                break;
            }
        } while (scan.nextInt()== 9);
    }
    
}
