package org.example.ph56921_26062025.Utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyUtilsTest {
    private MyUtils myUtils;
    @BeforeEach
    void setUp() {
        myUtils = new MyUtils();
    }



    @Test
    void tinhTongSoChanWithNis8() {
        assertEquals(21, myUtils.tinhTongSoChan(8));
    }

}
