package ex42.base;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class solution42 {
    public static void main(String[] args) {
        String line = "";

        //input file to table function (spacings, remember to look up 4%d or whatever), (string 1, string 2, int 1 for array)
        //output

try{
    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\anobu\\Documents\\cop assignments\\Banaag-COP-3330-assignment3\\exercise42_input.txt"));
    BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\anobu\\Documents\\cop assignments\\Banaag-COP-3330-assignment3\\exercise42_output.txt"));

    while((line = br.readLine()) !=null ){
        String[] values = line.split(",");
        System.out.println(values[0] + "\t" + values[1] + "\t" + values[2]);
    }

}catch (FileNotFoundException e){
    e.printStackTrace();
}catch (IOException e){
    e.printStackTrace();





    }














}}
