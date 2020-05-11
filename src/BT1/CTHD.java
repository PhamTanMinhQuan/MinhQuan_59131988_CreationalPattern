/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author quan
 */
public class CTHD {
    String sanPham;
    int soLuong;
    double donGia;
    int chietKhau;
    public CTHD(String sanPham, int soLuong, double donGia, int chietKhau){
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
        }
    @Override
    public String toString(){
        return "San pham: " + sanPham + " " 
                            + soLuong + " " 
                            + donGia + " " 
                            + chietKhau + "\n";
    }
}
