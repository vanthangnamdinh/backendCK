package com.example.demo.Entity;

import java.util.Date;

import jakarta.persistence.*;

@Entity
public class GoodsReceiptNote {

    @Id
    @Column(name = "maPhieuNhap")
    private int maPhieuNhap;

    @Column(name = "ngayNhap")
    @Temporal(TemporalType.DATE)
    private Date ngayNhap;

    @ManyToOne
    @JoinColumn(name = "maNhaCungCap")
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name = "maNhanVien")
    private Staff staff;

    @Column(name = "tongTien")
    private int tongTien;

    // Constructors

    public GoodsReceiptNote() {
        // Default constructor
    }

    public GoodsReceiptNote(int maPhieuNhap, Date ngayNhap, Supplier supplier, Staff staff, int tongTien) {
        this.maPhieuNhap = maPhieuNhap;
        this.ngayNhap = ngayNhap;
        this.supplier = supplier;
        this.staff = staff;
        this.tongTien = tongTien;
    }

    // Getter and Setter methods

    public int getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap(int maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    // Other methods if needed
}