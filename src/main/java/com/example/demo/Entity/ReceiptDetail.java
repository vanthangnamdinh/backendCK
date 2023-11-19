package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
public class ReceiptDetail {
	@Id
    @Column(name = "maPhieuNhap")
    private int maPhieuNhap;

    @Id
    @Column(name = "maHang")
    private int maHang;

    @Column(name = "soLuongNhap")
    private int soLuongNhap;

    @Column(name = "donGia")
    private int donGia;

    @ManyToOne
    @JoinColumn(name = "maPhieuNhap", insertable = false, updatable = false)
    private GoodsReceiptNote goodsReceiptNote;

    @ManyToOne
    @JoinColumn(name = "maHang", insertable = false, updatable = false)
    private Goods goods;

    // Constructors

    public ReceiptDetail() {
        // Default constructor
    }

    public ReceiptDetail(int maPhieuNhap, int maHang, int soLuongNhap, int donGia) {
        this.maPhieuNhap = maPhieuNhap;
        this.maHang = maHang;
        this.soLuongNhap = soLuongNhap;
        this.donGia = donGia;
    }

    // Getter and Setter methods

    public int getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap(int maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public int getSoLuongNhap() {
        return soLuongNhap;
    }

    public void setSoLuongNhap(int soLuongNhap) {
        this.soLuongNhap = soLuongNhap;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public GoodsReceiptNote getGoodsReceiptNote() {
        return goodsReceiptNote;
    }

    public void setGoodsReceiptNote(GoodsReceiptNote goodsReceiptNote) {
        this.goodsReceiptNote = goodsReceiptNote;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    // Other methods if needed
}

