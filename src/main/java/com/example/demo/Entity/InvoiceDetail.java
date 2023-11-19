package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
public class InvoiceDetail {

    @Id
    @Column(name = "maHoaDon")
    private int maHoaDon;

    @Id
    @Column(name = "maHang")
    private int maHang;

    @Column(name = "soLuong")
    private int soLuong;

    @Column(name = "donGia")
    private int donGia;

    @ManyToOne
    @JoinColumn(name = "maHoaDon", insertable = false, updatable = false)
    private Invoice invoice;

    @ManyToOne
    @JoinColumn(name = "maHang", insertable = false, updatable = false)
    private Goods goods;

    // Constructors

    public InvoiceDetail() {
        // Default constructor
    }

    public InvoiceDetail(int maHoaDon, int maHang, int soLuong, int donGia) {
        this.maHoaDon = maHoaDon;
        this.maHang = maHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    // Getter and Setter methods

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    // Other methods if needed
}