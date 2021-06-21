package ex42.base;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class solution42Test {

    @Test
    public void doesmainfunctionwork() throws Exception{


        File expected = new File("C:\\Users\\anobu\\Documents\\cop assignments\\Banaag-COP-3330-assignment3\\exercise42_test.txt");
        File actual = new solution42().tablefilesorter();

        assertEquals(expected, actual);


    }

}