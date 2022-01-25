public class StackOfIntegers {

    private int[] elements=new int[16];//An array to store integers in the stack
    private int size;//The number of integers in the stack
    //Constructs an empty stack with a default capacity of 16
    public StackOfIntegers() {
    }
    //Constructs an empty stack with a specified capacity
    public StackOfIntegers(int capacity){

    }
    //Returns true if the stack is empty
    public boolean empty(){
        if(this.size==0)
        {
            return true;
        }
        else
            return false;
    }
    //Returns the integer at the top of the stack without removing it from the stack
    public int peek()
    {
        return elements[size-1];
    }
    //Stores an integer into the top of the stack
    public void push(int value){
        this.elements[size] = value;
        this.size++;
    }
    public int pop(){
        int popElement = elements[size-1];
        this.elements[size-1]=0;
        this.size--;
        return popElement;
    }

    public int getSize() {
        return this.size;
    }
}
