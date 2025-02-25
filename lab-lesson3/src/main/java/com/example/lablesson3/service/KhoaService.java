package com.example.lablesson3.service;


import com.example.lablesson3.entity.Khoa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KhoaService {
    private List<Khoa> khoas = new ArrayList<>();

    public KhoaService() {
        khoas.add(new Khoa("KH01", "Công nghệ thông tin"));
        khoas.add(new Khoa("KH02", "Điện tử - Viễn thông"));
        khoas.add(new Khoa("KH03", "Kinh tế"));
        khoas.add(new Khoa("KH04", "Ngôn ngữ Anh"));
        khoas.add(new Khoa("KH05", "Luật"));
    }

    public List<Khoa> getAllKhoa() {
        return khoas;
    }

    public Khoa getKhoaById(String makh) {
        return khoas.stream().filter(khoa -> khoa.getMakh().equals(makh)).findFirst().orElse(null);
    }

    public Khoa addKhoa(Khoa khoa) {
        khoas.add(khoa);
        return khoa;
    }

    public Khoa updateKhoa(String makh, Khoa khoa) {
        Khoa existing = getKhoaById(makh);
        if (existing != null) {
            existing.setTenkh(khoa.getTenkh());
            return existing;
        }
        return null;
    }

    public boolean deleteKhoa(String makh) {
        return khoas.removeIf(khoa -> khoa.getMakh().equals(makh));
    }
}
