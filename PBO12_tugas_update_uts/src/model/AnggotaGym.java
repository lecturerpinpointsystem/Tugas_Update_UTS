/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 
 */
public class AnggotaGym {
    private String no_ktp;
    private String nama;
    private String JK, cabang, PF, handuk;

    public String Getktp() {

        return no_ktp;
    }

    public void Setnoktp(String no_ktp) {
        this.no_ktp = no_ktp;

    }

    public String Getnama() {

        return nama;
    }

    public void Setnama(String nama) {
        this.nama = nama;

    }

    public String GetJK() {

        return JK;
    }

    public void SetJK(String JK) {

        this.JK = JK;

    }

    public String Gehanduk() {

        return no_ktp;
    }

    public void Sethanduk(String no_ktp) {
        this.no_ktp = no_ktp;

    }

    public String GetPF() {

        return PF;
    }

    public void SetPF(String PF) {
        this.PF = PF;

    }

}
