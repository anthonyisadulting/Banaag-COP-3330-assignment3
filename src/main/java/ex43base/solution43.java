package ex43base;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Anthony Banaag
 */
/*
Prompt for the name of the site.
Prompt for the author of the site.
Ask if the user wants a folder for JavaScript files.
Ask if the user wants a folder for CSS files.
Generate an index.html file that contains the name of the site inside the <title> tag and the author in a <meta> tag.
 */
public class solution43 {


    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //make sure to group created message together at the end

        //sitenames
        String sitename = askforsitename();
        createsitefolder(sitename);

        //authornames
        String authorname = askforauthorname();

        //askforfolders
        askforfolderJS(sitename);
        askforfolderCSS(sitename);

        //createdoutput
        createdsitename(sitename);
        createdHTML(sitename);
        createdjsfolder(sitename);
        createdcssfolder(sitename);

        //HTML generator
        HTMLGenerator(sitename, authorname);

    }
    //askforsitename function
    public static String askforsitename(){


        System.out.println("Site name:");
        String sitename = sc.nextLine();

    return sitename;}

    public static void createsitefolder(String askforsitename){

        String foldername = askforsitename;

        File Dir = new File(foldername);
        Dir.mkdir();
    }

    //ask for author function
    public static String askforauthorname(){

        System.out.println("Author name:");
        String authorname = sc.nextLine();

    return authorname;}

    //ask for folder: JS function
    public static void askforfolderJS(String sitename){

        System.out.println("Do you want a folder for JavaScript?");
        String response = sc.next();

        if(response.equals("y")){

            //String foldername = "js";

            File Dir = new File("C:\\Users\\anobu\\Documents\\cop assignments\\Banaag-COP-3330-assignment3\\" + sitename + "\\js");
            Dir.mkdir();

        }
        else if(response.equals("n")){

        }

    }

    //ask for folder: CSS function
    public static void askforfolderCSS(String sitename){

        System.out.println("Do you want a folder for CSS?");
        String response = sc.next();

        if(response.equals("y")){

            //String foldername = "CSSFolder";

            File Dir = new File("C:\\Users\\anobu\\Documents\\cop assignments\\Banaag-COP-3330-assignment3\\" + sitename + "\\css");
            Dir.mkdir();
        }
        else if(response.equals("n")){

        }
    }


    //createdfunctions
    public static void createdsitename(String sitename){
        System.out.println("Created ./website/" +sitename); //put this in createdsitename
    }

    public static void createdjsfolder(String sitename){
        System.out.println("Created ./website/" + sitename + "/js/");
    }

    public static void createdcssfolder(String sitename){
        System.out.println("Created ./website/" + sitename + "/css/");
    }
    public static void createdHTML(String sitename){
        System.out.println("Created ./website/" + sitename + "/index.html");
    }

    public static void HTMLGenerator(String sitename, String authorname){

        //Generate an index.html file that contains the name of the site
        // inside the <title> tag and the author in a <meta> tag.

        String html = "<html>\n" +
                "    <head>\n" +
                "<title>" + sitename +"</title>" +
                "        <meta name = \"author \" \n" +
                "                      content = \"" +authorname + "\" />\n" +
                "    </head>\n" +
                "          \n" +
                "    <body>\n" +
                "    </body>\n" +
                "</html>  ";

        File f = new File("C:\\Users\\anobu\\Documents\\cop assignments\\Banaag-COP-3330-assignment3\\" + sitename + "\\index.html");
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write(html);
            bw.close();
        }catch(IOException e ){
            e.printStackTrace();
        }


    }

}


