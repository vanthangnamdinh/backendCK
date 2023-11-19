package com.example.demo.Entity;



import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "Staff")
public class Staff {

	@Id
	@Column(name = "maNhanVien",length = 100)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int maNhanVien;
	
	@Column(name = "ho", length = 50)
    private String ho;

    @Column(name = "ten", length = 50)
    private String ten;

    @Column(name = "diaChi", length = 50)
    private String diaChi;

    @Column(name = "ngaySinh")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngaySinh;

    @Column(name = "soDienThoai", length = 50)
    private String soDienThoai;

    @ManyToOne
    @JoinColumn(name="maChiNhanh")
    private Branch branch;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "luong")
    private int luong;

    @Column(name = "chucvu", length = 50)
    private String chucvu;
    
	

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Staff(int maNhanVien, String ho, String ten, String diaChi, Date ngaySinh, String soDienThoai, Branch branch,
			String email, int luong, String chucvu) {
		super();
		this.maNhanVien = maNhanVien;
		this.ho = ho;
		this.ten = ten;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
		this.soDienThoai = soDienThoai;
		this.branch = branch;
		this.email = email;
		this.luong = luong;
		this.chucvu = chucvu;
	}
	
	
	public Staff(String ho, String ten, String diaChi, Date ngaySinh, String soDienThoai, Branch branch, String email,
			int luong, String chucvu) {
		super();
		this.ho = ho;
		this.ten = ten;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
		this.soDienThoai = soDienThoai;
		this.branch = branch;
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


	public Branch getBranch() {
		return branch;
	}


	public void setBranch(Branch branch) {
		this.branch = branch;
	}
    
    
}
