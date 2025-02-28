package com.example.TestKiemthu1.Test1;

import com.example.TestKiemthu1.Kiemthu.SinhVien;
import com.example.TestKiemthu1.Kiemthu.SinhVienService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinhVienTesst {

    SinhVienService sinhVienService = new SinhVienService();
    private SinhVien sinhVien;

    //add thanh cong
    @Test
    public void testSinhVienAdd() {
        boolean result = sinhVienService.addSinhVien(new SinhVien("A1","Hoang",22,8,5,"HN"));
        assertEquals(true, result);
    }
    //add ma bo trong
    @Test
    public void testSinhVienAddMaBoTrong() {
        boolean result = sinhVienService.addSinhVien(new SinhVien("","Hoang",22,8,5,"HN"));
        assertEquals(false, result);
    }
    //add ten bo trong
    @Test
    public void testSinhVienAddTenBoTrong() {
        boolean result = sinhVienService.addSinhVien(new SinhVien("A1","",22,8,5,"HN"));
        assertEquals(false, result);
    }


    //deleteSinhVienThanhCong
    @Test
    public void testDeleteSinhVienThanhCong() {
        sinhVienService.addSinhVien(new SinhVien("A1","Hoang",22,8,5,"HN"));
        boolean result = sinhVienService.deleteSinhVien("A1");
        assertEquals(true, result);
    }

    //deleteSinhVienThatBai
    @Test
    public void testDeleteSinhVienThatBai() {
        sinhVienService.addSinhVien(new SinhVien("A1","Hoang",22,8,5,"HN"));
        boolean result = sinhVienService.deleteSinhVien("A2");
        assertEquals(false, result);
    }

    //updateSinhVienThanhCong
    @Test
    public void testUpdateSinhVienThanhCong() {

        SinhVien sv1 = new SinhVien("A1","Hoang",22,8,5,"HN");
        sinhVienService.addSinhVien(sv1);

        boolean result = sinhVienService.updateSinhVien(sv1,"Hoang",22,8,5,"HN");
        assertEquals(true, result);
    }


    //update ten bo trong
    @Test
    public void testUpdateSinhVientenBonTrong() {
        SinhVien sv1 = new SinhVien("A1","Hoang",22,8,5,"HN");
        sinhVienService.addSinhVien(sv1);

        boolean result = sinhVienService.updateSinhVien(sv1,"",22,8,5,"HN");
        assertEquals(false, result);
    }

}
