package JavaAdvanced;

import java.util.Stack;

//Q5. create a stack data structure to store Integers Create some methods for following functionalities.
//a. Include functions for pushing elements onto the stack.
//b. popping elements from the stack.
//c. checking if the Stack is empty

public class StackData {
    static Stack<Integer> stackDatas = new Stack<Integer>();
    public static void main(String[] args) {
        pushing();
        popping();
        checkingStack();
    }

    // pushing elements onto the stack
    public  static  void pushing(){
        stackDatas.push(10);
        stackDatas.push(5);
    }

    //popping elements from the stack
    public static  void popping(){
        stackDatas.pop();
        System.out.println("Removed last Element");
    }

    //checking if the Stack is empty
    public static  void checkingStack(){
        if(stackDatas.isEmpty()){
            System.out.println("Stack is empty");
        }else {
            System.out.println("Stack is not empty");
        }
    }
}

//case 1<---------------------------------------------------->

//(input)
//stackDatas.push(10);
// stackDatas.push(5);

//(out put)
//Removed last Element
// Stack is not empty


//case 2 <---------------------------------------------------->

//(input)
//stackDatas.push(5);

//(out put)
//Removed last Element
//Stack is empty
