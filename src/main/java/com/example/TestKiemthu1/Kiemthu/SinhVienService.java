package com.example.TestKiemthu1.Kiemthu;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> listSinhVien = new ArrayList<SinhVien>();

    public boolean addSinhVien(SinhVien sv){
        if (sv == null || sv.getMaSV().isEmpty() || sv.getTen().isEmpty()){
            return false;
        }

        if (exMaSinhVien(sv.getMaSV())){
            return false;
        }
        listSinhVien.add(sv);
        return true;
    }

    public boolean deleteSinhVien(String sv){
        return listSinhVien.removeIf( s -> s.getMaSV().equals(sv) );
    }

    public boolean updateSinhVien(SinhVien sv, String ten, int tuoi, float diemTB, int kyHoc, String chuyenNganh ){
        if (sv == null || sv.getMaSV().isEmpty() || ten.isEmpty()){
            return false;
        }

        sv.setTen(ten);
        sv.setTuoi(tuoi);
        sv.setDiemTB(diemTB);
        sv.setKyHoc(kyHoc);
        sv.setChuyenNganh(chuyenNganh);

        return true;
    }

    public boolean exMaSinhVien(String sv){
        return listSinhVien.stream().filter( s -> s.getMaSV().equals(sv) ).findFirst().isPresent();
    }
}
