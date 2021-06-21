package ex45base;

import java.io.*;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Anthony Banaag
 */
/*

 */

//Original psuedocode:
//askforoutputfoldername
//readreplaceoutputfile
//make sure to create a new file for output txt

public class solution45  {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String outputfilename = askforoutputname();
        readreplaceoutputfile("utilize", "use", outputfilename);


    }

    public static String askforoutputname(){

        System.out.println("What would you like to name your output file?");
        String outputname = sc.nextLine();

    return outputname;}


    public static void readreplaceoutputfile(String oldstring, String newString, String outputfilename){

        String old = "";

        try{
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\anobu\\Documents\\cop assignments\\Banaag-COP-3330-assignment3\\exercise45_input.txt"));

            String line = reader.readLine();

            while (line !=null){
                old = old + line + System.lineSeparator();
                line = reader.readLine();
            }

            String New = old.replaceAll(oldstring, newString);

            File file = new File("C:\\Users\\anobu\\Documents\\cop assignments\\Banaag-COP-3330-assignment3\\"+ outputfilename +".txt");

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(New);

            reader.close();
            writer.close();

        }catch (IOException ioe){
            ioe.printStackTrace();
        }


    }

}
