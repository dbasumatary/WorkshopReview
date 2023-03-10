package stackusinglinklist;

/*Question : Provide an implementation of stack using linked list using an example*/
/*Created by : Dhondip Basumatary*/

//Created a node class from which we can use node values
class Node{

    //Each node has an integer data and a reference to the next node in the list
    int data;
    Node next;

    //constructor created
    public Node(int data){
        this.data = data;
    }
}

//Here we will implement the stack using linked list
public class StackUsingLinkedList {
    Node head = null;    //head represents top of the stack, and initially it has null value
    int size = 0;   //this will keep track of number of elements in stack

    //this method will return the current size of stack which mwy change according to methods used
    public int stackSize(){
        return size;
    }

    //the pushElement method adds an element to the top of the stack
    public void pushElement(int data){
        //create a new node object
        //if the stack is empty then the head will be the new node value entered
        Node newValue = new Node(data);
        if(stackSize() == 0){
            head = newValue;
        }
        else{
            //adding the Node at the start of a Linked List and storing it in temp
            //setting the next to current head
            //update the head to newly created node
            Node temp = head;
            newValue.next = temp;
            head = newValue;
        }
        System.out.println("Element pushed :  "+ data);

        //increment the size for next node
        size++;
    }

    //the popElement method removes and returns the element at the top of the stack
    public int popElement(){
        if(stackSize() == 0){
            System.out.println("Error . The stack is Empty");
            return -1;
        }
        else{
            //setting the head to the next node in the list
            //it will also decrement the size because we are removing the node
            //then it will return the data after removing the node
            Node temp = head;
            head = head.next;
            size--;
            return temp.data;
        }
    }

    //the displayStack method prints the elements of stack in the order of their creation
    public void displayStack(){
        Node current = head;

        //iterate through each node
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.pushElement(3);
        stack.pushElement(6);
        stack.pushElement(1);
        stack.pushElement(13);
        System.out.print("The elements in stack are : ");
        stack.displayStack();
        System.out.println();
        System.out.println("The element first popped out is " + stack.popElement());
        System.out.print("After doing pop, the remaining elements are : ");
        stack.displayStack();
    }
}


//Answer to the question of why should we use linked list representation for stack:
//If we use array to represent the stack, the size is fixed, and we cannot manipulate the stack.
//Therefore, we use linked list when the size of the stack is not known in advance.