package com.example.TestKiemthu1.Test1;

import com.example.TestKiemthu1.Kiemthu.TinhTongMangSoNguyen;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TinhTongMangSoNguyenTest {

    TinhTongMangSoNguyen tinhTongMangSoNguyen = new TinhTongMangSoNguyen();

    @Test
    public void testTinhTongMangSoNguyenMangRong() {
        assertEquals(0,tinhTongMangSoNguyen.TinhTongMangSoNguyen(new int[]{}));
    }

    @Test
    public void testTinhTongMangSoNguyenDuongDung() {
        assertEquals(15,tinhTongMangSoNguyen.TinhTongMangSoNguyen(new int[]{1,2,3,4,5}));
    }

    @Test
    public void testTinhTongMangSoNguyenDuongTuongDuong() {
        assertEquals(3, tinhTongMangSoNguyen.TinhTongMangSoNguyen(new int[]{1,2}));
    }

    @Test
    public void testTinhTongMangSoNguyenAm(){
        assertEquals(-15,tinhTongMangSoNguyen.TinhTongMangSoNguyen(new int[]{-5,-4,-3,-2,-1}));
    }

    @Test
    public void testTinhTongMangSoNguyenAmDuong(){
        assertEquals(0,tinhTongMangSoNguyen.TinhTongMangSoNguyen(new int[]{-3,-2,5}));
    }
}
