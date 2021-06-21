package ex46base;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;




public class solution46 {
    public static void main(String[] args)  {

        //readfile
        //scanforwordrepeats function
        //convert wordrepeatstostars
        //print output

        //file to string conversion
        //string to ref code hashmap
        readfileandcountwords();

    }

    public static void readfileandcountwords(){

        ArrayList<String> thewords = new ArrayList<>();
        Map<String, Integer> words = new HashMap<>();


        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\anobu\\Documents\\cop assignments\\Banaag-COP-3330-assignment3\\exercise46_input.txt"));
            String currentLine = reader.readLine();

            while (currentLine!=null){
                thewords.add(currentLine);

                currentLine = reader.readLine();
            }

            String thewordsstring = thewords.toString();

            for(String word : thewordsstring.split("\\W")){
                if(words.containsKey(word)) {
                    words.put(word, words.get(word)+1);
                }
                else {
                    words.put(word, 1);
                }
            }


            for(Map.Entry<String, Integer> entry : words.entrySet()) {

                System.out.println(entry.getKey() + ": " + entry.getValue());
            }


            reader.close();


        }catch (IOException ioe){
            ioe.printStackTrace();
        }


    }


















}


