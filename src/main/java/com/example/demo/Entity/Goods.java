package com.example.demo.Entity;


import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="Goods")
public class Goods {

    @Id
    @Column(name = "maHang")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int maHang;

    @Column(name = "tenMatHang", length = 50, nullable = false)
    private String tenMatHang;

    @Column(name = "moTa", length = 50, nullable = false)
    private String moTa;

    @Column(name = "giaBan", nullable = false)
    private int giaBan;

    @Column(name = "soLuongConLai", nullable = false)
    private int soLuongConLai;

    @Column(name = "noiSanXuat", length = 50, nullable = false)
    private String noiSanXuat;

    @ManyToOne
    @JoinColumn(name = "maLoai", nullable = false)
    private GoodsType goodsType;
    
    @ManyToOne
    @JoinColumn(name="maChiNhanh", nullable =false)
    private Branch branch;

	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Goods(int maHang, String tenMatHang, String moTa, int giaBan, int soLuongConLai, String noiSanXuat,
			GoodsType goodsType, Branch branch) {
		super();
		this.maHang = maHang;
		this.tenMatHang = tenMatHang;
		this.moTa = moTa;
		this.giaBan = giaBan;
		this.soLuongConLai = soLuongConLai;
		this.noiSanXuat = noiSanXuat;
		this.goodsType = goodsType;
		this.branch = branch;
	}


	public Goods(String tenMatHang, String moTa, int giaBan, int soLuongConLai, String noiSanXuat, GoodsType goodsType,
			Branch branch) {
		super();
		this.tenMatHang = tenMatHang;
		this.moTa = moTa;
		this.giaBan = giaBan;
		this.soLuongConLai = soLuongConLai;
		this.noiSanXuat = noiSanXuat;
		this.goodsType = goodsType;
		this.branch = branch;
	}


	public int getMaHang() {
		return maHang;
	}

	public String getTenMatHang() {
		return tenMatHang;
	}

	public void setTenMatHang(String tenMatHang) {
		this.tenMatHang = tenMatHang;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}



	public Branch getBranch() {
		return branch;
	}


	public void setBranch(Branch branch) {
		this.branch = branch;
	}


	public int getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(int giaBan) {
		this.giaBan = giaBan;
	}

	

	public int getSoLuongConLai() {
		return soLuongConLai;
	}

	public void setSoLuongConLai(int soLuongConLai) {
		this.soLuongConLai = soLuongConLai;
	}



	public String getNoiSanXuat() {
		return noiSanXuat;
	}

	public void setNoiSanXuat(String noiSanXuat) {
		this.noiSanXuat = noiSanXuat;
	}

	public GoodsType getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(GoodsType goodsType) {
		this.goodsType = goodsType;
	}

    

}