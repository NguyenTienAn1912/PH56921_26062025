package org.example.ph56921_26062025.Service;

import org.example.ph56921_26062025.Entity.SanPham;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamServiceTest {
    private SanPhamService sanPhamService;

    @BeforeEach
    void setUp() {
        sanPhamService = new SanPhamService();
    }

    @Test
    void addWithValid() {
        SanPham sanPham = new SanPham(1,"SP01" , "Laptop Dell" , 5 , 1660000F ,3 , "LapTop");
        sanPhamService.add(sanPham);

        assertEquals(1 , sanPhamService.getAll().size());
        assertEquals("Laptop Dell" , sanPhamService.getOne(1).get().getTen());
    }

    @Test
    void addWithInvalidTen(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> sanPhamService.add(new SanPham(1,"SP01" , "" , 5 , 1660000F ,3 , "LapTop")));
        assertEquals("Tên không được để trống" , exception.getMessage());
    }

    @Test
    void addWithInvalidSoLuong(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> sanPhamService.add(new SanPham(1,"SP01" , "LapTop Dell" , 5 , 1660000F ,-3 , "LapTop")));
        assertEquals("Số lượng phải lớn hơn 0" , exception.getMessage());
    }

    @Test
    void addWithInvalidMa(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> sanPhamService.add(new SanPham(1,"" , "LapTop ASUS" , 5 , 1660000F ,3 , "LapTop")));
        assertEquals("Mã không được để trống" , exception.getMessage());
    }

    @Test
    void addWithInvalidNamBaoHanh(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> sanPhamService.add(new SanPham(1,"SP01" , "LapTop ASUS" , -1 , 1660000F ,3 , "LapTop")));
        assertEquals("Năm bảo hành phải lớn hơn 0" , exception.getMessage());
    }
    @Test
    void addWithInvalidGia(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> sanPhamService.add(new SanPham(1,"SP01" , "LapTop ASUS" , 12 , -5F ,3 , "LapTop")));
        assertEquals("Giá phải lớn hơn 0" , exception.getMessage());
    }
    @Test
    void addWithInvalidDanhMuc(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> sanPhamService.add(new SanPham(1,"SP01" , "LapTop ASUS" , 12 , 1800000F ,3 , "")));
        assertEquals("Danh mục không được để trống" , exception.getMessage());
    }
    @Test
    void addWithNull(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> sanPhamService.add(null));
        assertEquals("Sản phẩm không được để trống" , exception.getMessage());
    }
}