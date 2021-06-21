package ex42.base;

import java.io.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Anthony Banaag
 */

public class solution42 {
    public static void main(String[] args) {
        tablefilesorter();

    }

    public static File tablefilesorter(){

        String line;

        try{
            //input file
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\anobu\\Documents\\cop assignments\\Banaag-COP-3330-assignment3\\exercise42_input.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\anobu\\Documents\\cop assignments\\Banaag-COP-3330-assignment3\\exercise42_output.txt"));

            //organize the file (last, first, salary)
            bw.write("Last            First       Salary\n");
            bw.write("--------------------------------------\n");



            while((line = br.readLine()) !=null ){
                String[] values = line.split(",");

                //output to file
                bw.write((String.format("%8s      %8s      %5s\n", values[0], values[1], values[2])));
            }

            bw.close();
            br.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();





        }


        return new File("C:\\Users\\anobu\\Documents\\cop assignments\\Banaag-COP-3330-assignment3\\exercise42_output.txt");
    }



}
