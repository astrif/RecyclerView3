package id.sch.smktelkom_mlg.learn.recyclerview3.model;

import android.graphics.drawable.Drawable;

/**
 * Created by Astri Fadilah on 16/11/2016.
 */
public class Hotel {
    public String judul;
    public String deskripsi;
    public String foto;
    public String lokasi;
    public String detail;


    public Hotel(String judul, String deskripsi, String foto, String lokasi, String detail)
    {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
        this.detail = detail;
        this.lokasi = lokasi;
    }
}
