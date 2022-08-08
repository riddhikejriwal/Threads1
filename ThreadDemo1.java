import java.util.*;
import java.io.*;
import java.lang.*;

class ThreadDemo extends Thread{
    public void run(){
        System.out.println("The name of the current thread is: "+Thread.currentThread().getName());
    }
    public static void main(String[] args){
        ThreadDemo t1=new ThreadDemo();
        t1.start();
    }
}
