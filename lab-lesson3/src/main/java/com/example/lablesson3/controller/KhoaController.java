package com.example.lablesson3.controller;

import com.example.lablesson3.entity.Khoa;
import com.example.lablesson3.service.KhoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/khoa")
public class KhoaController {

    @Autowired
    private KhoaService khoaService;

    @GetMapping
    public List<Khoa> getAllKhoa() {
        return khoaService.getAllKhoa();
    }

    @GetMapping("/{makh}")
    public Khoa getKhoaById(@PathVariable String makh) {
        return khoaService.getKhoaById(makh);
    }

    @PostMapping
    public Khoa addKhoa(@RequestBody Khoa khoa) {
        return khoaService.addKhoa(khoa);
    }

    @PutMapping("/{makh}")
    public Khoa updateKhoa(@PathVariable String makh, @RequestBody Khoa khoa) {
        return khoaService.updateKhoa(makh, khoa);
    }

    @DeleteMapping("/{makh}")
    public boolean deleteKhoa(@PathVariable String makh) {
        return khoaService.deleteKhoa(makh);
    }
}

