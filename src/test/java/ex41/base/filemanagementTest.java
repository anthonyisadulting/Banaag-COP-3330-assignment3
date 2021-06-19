package ex41.base;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class filemanagementTest {

    @Test
    void is_name_counter_working() throws IOException {
        filemanagement namecounter = new filemanagement();

        int actual = namecounter.countnames(0);
        int expected = 7;

        assertEquals(expected, actual);


    }


}