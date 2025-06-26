package org.example.ph56921_26062025.Service;

import org.example.ph56921_26062025.Entity.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    private List<SanPham> sanPhamList = new ArrayList<>();

    public void add(SanPham sanPham){
        if(sanPham == null){
            throw new IllegalArgumentException("Sản phẩm không được để trống");
        }
        sanPhamList.add(sanPham);
    }
    public List<SanPham> getAll(){
        return new ArrayList<>(sanPhamList);
    }
}
