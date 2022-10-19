package hw1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    //if u wanted this method to rethrow the exception, then u would have put it in the method signature and not done the try/catch stuff in the block of code
    public static void createNewFile() {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        }catch(IOException e){
            System.out.println("file does not exist");
            e.printStackTrace(); //prints out stacks from bottom to top so u can see where the error is
        }
    }

    public static void numbersExceptionHandling(){
        File file = new File("resources/numbers.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);

            while(fileReader.hasNext()){
                double number = fileReader.nextDouble();
                System.out.println(number);
            }
        }catch(FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }finally{
            fileReader.close();
        }
    }
    public static void main(String[] args) {
        //GIVES ARRAYOUTOFBOUNDS EXCEPTIONS
//        String[] candies = {"Skittles", "Hershey's", "M&M's"};
//        for (int i=0; i < 4; i++){
//            System.out.println("I will eat " + candies[i]);

      //  createNewFile();
        }
    }

