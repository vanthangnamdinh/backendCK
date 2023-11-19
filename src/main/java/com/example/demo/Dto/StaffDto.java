package com.example.demo.Dto;

import java.util.Date;



public class StaffDto {
	
	private int maNhanVien;
    private String ho;
    private String ten;
    private String diaChi;
    private Date ngaySinh;
    private String soDienThoai;
    private int maChiNhanh;
    private String email;
    private int luong;
    private String chucvu;
	public StaffDto(int maNhanVien, String ho, String ten, String diaChi, Date ngaySinh, String soDienThoai,
			int maChiNhanh, String email, int luong, String chucvu) {
		super();
		this.maNhanVien = maNhanVien;
		this.ho = ho;
		this.ten = ten;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
		this.soDienThoai = soDienThoai;
		this.maChiNhanh = maChiNhanh;
		this.email = email;
		this.luong = luong;
		this.chucvu = chucvu;
	}
	public StaffDto(String ho, String ten, String diaChi, Date ngaySinh, String soDienThoai, int maChiNhanh,
			String email, int luong, String chucvu) {
		super();
		this.ho = ho;
		this.ten = ten;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
		this.soDienThoai = soDienThoai;
		this.maChiNhanh = maChiNhanh;
		this.email = email;
		this.luong = luong;
		this.chucvu = chucvu;
	}
	public int getMaNhanVien() {
		return maNhanVien;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public int getMaChiNhanh() {
		return maChiNhanh;
	}
	public void setMaChiNhanh(int maChiNhanh) {
		this.maChiNhanh = maChiNhanh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	public String getChucvu() {
		return chucvu;
	}
	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}
	
    
}
