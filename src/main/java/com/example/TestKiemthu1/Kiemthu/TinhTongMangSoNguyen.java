package com.example.TestKiemthu1.Kiemthu;

public class TinhTongMangSoNguyen {

    public int TinhTongMangSoNguyen(int[] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

}
