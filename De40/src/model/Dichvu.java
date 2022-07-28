/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.TrongExeption;
import java.io.Serializable;

/**
 *
 * @author chouv
 */
public class Dichvu implements Serializable{
//  Thông tin về Dịch vụ gồm các thuộc tính (mã dịch vụ, Tên dịch vụ, Nhóm dịch vụ, Chi phí, Giá
//cước) – trong đó Nhóm dịch vụ có thể là: Dịch vụ thuê bao trả trước, Dịch vụ thuê bao trả sau, Dịch
//vụ giá trị gia tăng. Mã dịch vụ là một số nguyên có 4 chữ số, tự động tăng. 
    
    private int ma;
    private String ten,nhom;
    private double cphi,cuoc;
    private static int sma=1000;

    public Dichvu() {
    }

    public Dichvu(String ten, String nhom, double cphi, double cuoc) {
        
        this.ma = sma++;
        this.ten = ten;
        this.nhom = nhom;
        this.cphi = cphi;
        this.cuoc = cuoc;
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

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public double getCphi() {
        return cphi;
    }

    public void setCphi(double cphi) {
        this.cphi = cphi;
    }

    public double getCuoc() {
        return cuoc;
    }

    public void setCuoc(double cuoc) {
        this.cuoc = cuoc;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Dichvu.sma = sma;
    }
    public Object[] toObjects(){
        return new Object[]{
          ma,ten,nhom,cphi,cuoc  
        };
    }
        
}
