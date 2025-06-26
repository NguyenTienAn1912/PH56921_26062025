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
    void tinhTongSoChanWithNis0() {
        assertEquals(0 , myUtils.tinhTongSoChan(0));
    }
    @Test
    void tinhTongSoChanWithNis1() {
        assertEquals(0 , myUtils.tinhTongSoChan(1));
    }
    @Test
    void tinhTongSoChanWithNis2() {
        assertEquals(2 , myUtils.tinhTongSoChan(2));
    }
    @Test
    void tinhTongSoChanWithNis8() {
        assertEquals(20 , myUtils.tinhTongSoChan(8));
    }
    @Test
    void tinhTongSoChanWithNis10() {
        assertEquals(30 , myUtils.tinhTongSoChan(10));
    }
    @Test
    void tinhTongSoChanWithNis100() {
        assertEquals(2550 , myUtils.tinhTongSoChan(100));
    }
    @Test
    void tinhTongSoChanWithNisInvalid() {
        assertEquals(0 , myUtils.tinhTongSoChan(-1));
    }
}
