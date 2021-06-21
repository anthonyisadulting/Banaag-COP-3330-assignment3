package ex41.base;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

//replaced most of pseudocode with method names

public class filemanagement {

    public static void main(String[] args) {

        int countword = 0;

        int counter = countnames(countword);
        readandoutputfile(counter);

    }

    public static void readandoutputfile(int countnames){
        ArrayList<String> names = new ArrayList<>();

        try {

            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\anobu\\Documents\\exercise41_input.txt"));

            String currentLine = reader.readLine();

            while (currentLine != null) {

                names.add(currentLine);

                currentLine = reader.readLine();

            }

            Collections.sort(names);

            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\anobu\\Documents\\cop assignments\\Banaag-COP-3330-assignment3\\exercise41_output.txt"));

            writer.write("There are " + countnames + " number of names.\n");

            for (String line : names)
            {
                writer.write(line);

                writer.newLine();
            }

            reader.close();
            writer.close();

        }catch (IOException ioe){
            ioe.printStackTrace();
        }

    }


    public static int countnames(int numofnames) {

        ArrayList<String> names = new ArrayList<>();

        try {

            BufferedReader reader;

            reader = new BufferedReader(new FileReader("C:\\Users\\anobu\\Documents\\exercise41_input.txt"));

            String currentLine = reader.readLine();

            while (currentLine != null) {

                names.add(currentLine);

                currentLine = reader.readLine();

                numofnames++;
            }

            reader.close();

        }catch (IOException ioe){
            ioe.printStackTrace();
        }



        return numofnames;}




}
