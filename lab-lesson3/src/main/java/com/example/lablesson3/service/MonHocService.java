package com.example.lablesson3.service;


import com.example.lablesson3.entity.MonHoc;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MonHocService {
    private List<MonHoc> monHocs = new ArrayList<>();

    public MonHocService() {
        monHocs.add(new MonHoc("MH01", "Lập trình Java", 45));
        monHocs.add(new MonHoc("MH02", "Cấu trúc dữ liệu", 60));
        monHocs.add(new MonHoc("MH03", "Toán rời rạc", 45));
    }

    public List<MonHoc> getAllMonHoc() {
        return monHocs;
    }

    public MonHoc getMonHocById(String mamh) {
        return monHocs.stream().filter(mh -> mh.getMamh().equals(mamh)).findFirst().orElse(null);
    }

    public MonHoc addMonHoc(MonHoc monHoc) {
        monHocs.add(monHoc);
        return monHoc;
    }

    public boolean deleteMonHoc(String mamh) {
        return monHocs.removeIf(mh -> mh.getMamh().equals(mamh));
    }
}

