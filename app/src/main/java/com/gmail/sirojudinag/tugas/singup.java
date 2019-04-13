package com.gmail.sirojudinag.tugas;

//TODO 1: merupakan package yang perlu diimport untuk membuat aplikasi
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class singup extends AppCompatActivity {
    @Override
    //TODO 2: pembuatan bundle untuk menampilkan activity dari layout singup
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singup);
    }
}