import java.util.*;

public class LinkedListOperations {
    static Scanner scan = new Scanner(System.in);
    Node head;
	class Node
	{
		int data;
		Node next;

		Node(int d)
		{
			this.data = d;
			this.next = null;
		}
	}
	// Inserting Elements at Begining of LinkedList
	Node insertInBegining (Node head, int data)
	{
		Node temp = new Node(data);
		if(head == null)
		{
			head = temp;
		}
		else
		{
			temp.next = head;
			head = temp;
		}
		return head;
	}
	// Inserting Elements at the End of LinkedList
	Node insertInEnd(int key,Node head)
	{
		Node temp=new Node(key);
		Node temp1=head;
		
		if(temp1==null)
			head=temp;
		else
		{
			while(temp1.next!=null)
			temp1=temp1.next;
			temp1.next=temp;
			
		}
		return head;		
	}
	// Inserting Elements at specific position of LinkedList
	Node insertAtPos(int key,int pos,Node head)
	{
		Node temp=new Node(key);
		
		if(pos==1)
		{
			temp.next=head;
			head=temp;
		}
		else
		{
			Node temp1=head;
			for(int i=1;temp1!=null && i<pos;i++)
			temp1=temp1.next;
			temp.next=temp1.next;
			temp1.next=temp;
		}
		
		return head;
	}
	//Delete element from LinkedList
	Node deleteElements(int pos,Node head)
	{
		Node ttmp=head;
		if(pos==1)
			head=ttmp.next;
		else
		{
			for(int i=1;ttmp!=null && i<pos-1;i++)
				ttmp=ttmp.next;
			ttmp.next=ttmp.next.next;
		}
		return head;
	}
	//Calculate length of LinkedList
	int length(Node head)
	{
		Node ttmp=head;
		int c=0;
		if(ttmp==null)
			return 0;
		else
		{
		 while(ttmp!=null)
			{	ttmp=ttmp.next;
				c++;
			}
		}
		return c;
	}
	//Reverse Elements of LinkedList
	Node reverseElements(Node head)
	{
		Node prevLNode=null,curLNode=head,nextLNode=null;
		while(curLNode!=null)
		{
			nextLNode=curLNode.next;
			curLNode.next=prevLNode;
			prevLNode=curLNode;
			curLNode=nextLNode;
		}
		
		head=prevLNode;
		return head;
	}
	//Display the LinkedList Elements
	void displayElements(Node head)
	{
		Node ttmp=head;
		while(ttmp!=null)
			{System.out.print(ttmp.data+" ");
			 ttmp=ttmp.next;
			}
			System.out.println("");
	}

    public static void linkedListFunctions()
    { 
		LinkedListOperations list = new LinkedListOperations();
			list.head = null;
        do {
            System.out.println("*****Linked List Menu*****");
            System.out.println("1.Add Element at Begining");
            System.out.println("2.Add Element at End");
            System.out.println("3.Add Element at Position");
            System.out.println("4.Delete Element from Position");
            System.out.println("5.Display");
            System.out.println("6.Calculate Length");
            System.out.println("7.Reverse Linked List Elements");
            System.out.println("8.Exit");
            System.out.print("Enter your choice: ");
            int lChoice = scan.nextInt();
			
            switch(lChoice)
            {
                case 1:
                System.out.print("Enter Element to add in Linked List: ");
                list.head = list.insertInBegining(list.head, scan.nextInt());
				System.out.println("Data Inserted");
				System.out.print("Do you continue in array menu - 9 or press 0 : ");
				break;
				case 2:
				System.out.print("Enter Element to add in end of Linked List: ");
                list.head = list.insertInEnd(scan.nextInt(),list.head);
				System.out.println("Data Inserted");
				System.out.print("Do you continue in array menu - 9 or press 0 : ");
				break;
				case 3:
				System.out.print("Enter Element and then position to be add in Linked List: ");
                list.head = list.insertAtPos(scan.nextInt(),scan.nextInt(),list.head);
				System.out.println("Data Inserted");
				System.out.print("Do you continue in array menu - 9 or press 0 : ");
				break;
				case 4:
				System.out.println("Enter position to delete from Linked List: ");
                list.head = list.deleteElements(scan.nextInt(),list.head);
				System.out.println("Element deleted");
				System.out.print("Do you continue in array menu - 9 or press 0 : ");
				break;
				case 5:
				System.out.println("Printing Linked List Data: ");
				list.displayElements(list.head);
				System.out.print("Do you continue in array menu - 9 or press 0 : ");
				break;
				case 6:
				System.out.println("Calculating Length of LinkedList: ");
                int count = list.length(list.head);
				System.out.println("Length of LinkedList: "+count);
				System.out.print("Do you continue in array menu - 9 or press 0 : ");
				break;
				case 7:
				System.out.println("Reversing LinkedList: ");
                list.head = list.reverseElements(list.head);
				System.out.println("Element reserved..");
				System.out.print("Do you continue in array menu - 9 or press 0 : ");
				break;
				case 8:
				System.exit(0);
				break;
                default:
                System.out.println("Plese enter number from metioned menu.");
                break;
            }
        }while(scan.nextInt() == 9);
		
	}

}
