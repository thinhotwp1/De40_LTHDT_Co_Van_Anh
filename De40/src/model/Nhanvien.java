/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.SoExeption;
import controller.TrongExeption;
import java.io.Serializable;

/**
 *
 * @author chouv
 */
public class Nhanvien implements Serializable{
//  Thông tin về Dịch vụ gồm các thuộc tính (mã dịch vụ, Tên dịch vụ, Nhóm dịch vụ, Chi phí, Giá
//cước) – trong đó Nhóm dịch vụ có thể là: Dịch vụ thuê bao trả trước, Dịch vụ thuê bao trả sau, Dịch
//vụ giá trị gia tăng. Mã dịch vụ là một số nguyên có 4 chữ số, tự động tăng. 
    
    private int ma;
    private String ten,diachi,sdt;
    private static int sma=1000;

    public Nhanvien() {
    }

    public Nhanvien(String ten, String diachi, String sdt){
        this.ma = sma++;
        this.ten = ten;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Nhanvien.sma = sma;
    }
    
    
    public Object[] toObjects(){
        return new Object[]{
          ma,ten,diachi,sdt 
        };
    }
        
}
