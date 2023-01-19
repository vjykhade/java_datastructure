import java.util.Scanner;

public class QueueOperations {
    static Scanner scan = new Scanner(System.in);
    
    int front, rear;
    int inputArray [];
    QueueOperations()
    {
        front = rear = -1;
        inputArray = new int[100];
    }
    void enqueue(int a)
  {
    if(rear==inputArray.length-1)
		System.out.println("overflow");
	else
		inputArray[++rear]=a;
	
	if(front==-1)
		front++;
   }
   int dequeue()
   {
     int x=-1;
	 if(front==-1)
		System.out.println("underflow");
	 else
		x=inputArray[front++];
	 if(rear==0)
	     rear--;
	 return x;
    }
    void display()
	{
	  for(int i=front;i<=rear;i++)
		System.out.print(inputArray[i]+" ");

	 System.out.println();


	}

    public static void queueFunctions()
    {
        QueueOperations qo = new QueueOperations();
        do {
            System.out.println("*****Linked List Menu*****");
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.print("Enter your choice: ");
            int qChoice = scan.nextInt();
            switch(qChoice)
            {
                case 1:
                System.out.println("Enter array element: ");
                qo.enqueue(scan.nextInt());
                System.out.println("Enqueued element in queue");
                System.out.print("Do you continue in array menu enter - 9 or press enter : ");
                break;
                case 2:
                System.out.println("Dequeue Queue Element: ");
                qo.dequeue();
                System.out.println("Dequeued element in queue");
                System.out.print("Do you continue in array menu enter - 9 or press enter : ");
                break;
                case 3:
                qo.display();
                System.out.print("Do you continue in array menu enter - 9 or press enter : ");
                break;
                default:
                System.out.println("Plese enter number from metioned menu.");
                break;
            }

        }while(scan.nextInt() == 9);
    }
}
