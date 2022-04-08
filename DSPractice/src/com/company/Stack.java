package com.company;

public class Stack {
    int[] arr;
    int topOfStack;
    public Stack(int size){
        arr= new int[size];
        topOfStack=-1;
    }

    public boolean isEmpty(){
        if(topOfStack==-1) return true;
        else return false;
    }

    public boolean isFull(){
        if(arr.length==topOfStack) return true;
        else return false;
    }

    public void delete(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            arr=null;
            topOfStack=-1;
            System.out.println("Array successfully deleted");
        }
    }
    public void push(int num){
        if(topOfStack==arr.length-1){
            System.out.println("Stack is full");
        }else{
            arr[topOfStack+1]=num;
            topOfStack++;
    }}
    public int pop(){
            if(isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }else{
                int topStack = arr[topOfStack];
                topOfStack--;
                return topStack;
            }
    }

}
