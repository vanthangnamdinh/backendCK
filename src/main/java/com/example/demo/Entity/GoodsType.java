package com.example.demo.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="GoodsType")
public class GoodsType {
	
	 @Id
	    @Column(name = "maLoai")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	    private int maLoai;

	    @Column(name = "loaiHang", length = 255, nullable = false)
	    private String loaiHang;

		public int getMaLoai() {
			return maLoai;
		}

		public String getLoaiHang() {
			return loaiHang;
		}

		public void setLoaiHang(String loaiHang) {
			this.loaiHang = loaiHang;
		}
	    
	    
}
