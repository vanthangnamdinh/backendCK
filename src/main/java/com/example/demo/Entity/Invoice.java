package com.example.demo.Entity;

import java.util.Date;

import jakarta.persistence.*;

@Entity
public class Invoice {

    @Id
    @Column(name = "maHoaDon")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int maHoaDon;

    @Column(name = "ngayBan")
    @Temporal(TemporalType.DATE)
    private Date ngayBan;

    @ManyToOne
    @JoinColumn(name = "maNhanVien")
    private Staff staff;

    @Column(name = "tongTien")
    private Integer tongTien;

    // Constructors

    public Invoice() {
        // Default constructor
    }

    public Invoice(int maHoaDon, Date ngayBan, Staff staff, Integer tongTien) {
        this.maHoaDon = maHoaDon;
        this.ngayBan = ngayBan;
        this.staff = staff;
        this.tongTien = tongTien;
    }

    // Getter and Setter methods

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Integer getTongTien() {
        return tongTien;
    }

    public void setTongTien(Integer tongTien) {
        this.tongTien = tongTien;
    }

    // Other methods if needed
}