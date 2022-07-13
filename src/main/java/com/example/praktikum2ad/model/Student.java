package com.example.praktikum2ad.model;

public class Student {
    private String NRP;
    private String nama;
    private Double nilaiIPA;
    private Double nilaiIPS;

    public Student() {
    }

    public Student(String NRP, String nama, Double nilaiIPA, Double nilaiIPS) {
        this.NRP = NRP;
        this.nama = nama;
        this.nilaiIPA = nilaiIPA;
        this.nilaiIPS = nilaiIPS;
    }

    public String getNRP() {
        return NRP;
    }

    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Double getNilaiIPA() {
        return nilaiIPA;
    }

    public void setNilaiIPA(Double nilaiIPA) {
        this.nilaiIPA = nilaiIPA;
    }

    public Double getNilaiIPS() {
        return nilaiIPS;
    }

    public void setNilaiIPS(Double nilaiIPS) {
        this.nilaiIPS = nilaiIPS;
    }
}
