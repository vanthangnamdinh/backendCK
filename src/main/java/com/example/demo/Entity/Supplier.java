package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
public class Supplier {

    @Id
    @Column(name = "maNhaCungCap")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int maNhaCungCap;

    @Column(name = "tenNhaCungCap", length = 255, nullable = false)
    private String tenNhaCungCap;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "soDienThoai", length = 255)
    private String soDienThoai;

    // Constructors

    public Supplier() {
        // Default constructor
    }

    public Supplier(int maNhaCungCap, String tenNhaCungCap, String email, String soDienThoai) {
        this.maNhaCungCap = maNhaCungCap;
        this.tenNhaCungCap = tenNhaCungCap;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }

    // Getter and Setter methods

    public int getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(int maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    public String getTenNhaCungCap() {
        return tenNhaCungCap;
    }

    public void setTenNhaCungCap(String tenNhaCungCap) {
        this.tenNhaCungCap = tenNhaCungCap;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    // Other methods if needed
}
