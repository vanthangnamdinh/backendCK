package com.example.demo.Entity;


import jakarta.persistence.*;
@Entity
@Table(name = "Branch")
public class Branch {
	 	@Id
	    @Column(name = "maChiNhanh")
	 	@GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer maChiNhanh;

	    @Column(name = "tenChiNhanh", length = 50, nullable = false)
	    private String tenChiNhanh;

	    @Column(name = "diaChi", length = 50, nullable = false)
	    private String diaChi;

	    @Column(name = "soDienThoai", length = 50, nullable = false)
	    private String soDienThoai;

	    
		public Branch() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Branch(int maChiNhanh, String tenChiNhanh, String diaChi, String soDienThoai) {
			super();
			this.maChiNhanh = maChiNhanh;
			this.tenChiNhanh = tenChiNhanh;
			this.diaChi = diaChi;
			this.soDienThoai = soDienThoai;
		}

		public Branch(String tenChiNhanh, String diaChi, String soDienThoai) {
			super();
			this.tenChiNhanh = tenChiNhanh;
			this.diaChi = diaChi;
			this.soDienThoai = soDienThoai;
		}

		public int getMaChiNhanh() {
			return maChiNhanh;
		}

		public String getTenChiNhanh() {
			return tenChiNhanh;
		}

		public void setTenChiNhanh(String tenChiNhanh) {
			this.tenChiNhanh = tenChiNhanh;
		}

		public String getDiaChi() {
			return diaChi;
		}

		public void setDiaChi(String diaChi) {
			this.diaChi = diaChi;
		}

		public String getSoDienThoai() {
			return soDienThoai;
		}

		public void setSoDienThoai(String soDienThoai) {
			this.soDienThoai = soDienThoai;
		}
	    
	    
}
