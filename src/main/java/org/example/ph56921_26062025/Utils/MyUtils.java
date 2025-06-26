package org.example.ph56921_26062025.Utils;

public class MyUtils {
    public int tinhTongSoChan(int n) {
            int tong = 0;
            for (int i = 0; i <= n; i += 2) {
                tong += i;
            }
            return tong;
        }

}

