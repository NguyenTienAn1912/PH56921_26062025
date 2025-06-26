package org.example.ph56921_26062025.Service;

import org.example.ph56921_26062025.Entity.SanPham;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SanPhamService {
    private List<SanPham> sanPhamList = new ArrayList<>();

    public void add(SanPham sanPham){
        if(sanPham == null){
            throw new IllegalArgumentException("Sản phẩm không được để trống");
        }
        sanPhamList.add(sanPham);
    }
    public Optional<SanPham> getOne(Integer id){
        return sanPhamList.stream().filter(sanPham -> sanPham.getId() == id).findFirst();
    }
    public List<SanPham> getAll(){
        return new ArrayList<>(sanPhamList);
    }
}
