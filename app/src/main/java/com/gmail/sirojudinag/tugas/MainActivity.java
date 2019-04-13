package com.gmail.sirojudinag.tugas;

//TODO 1: merupakan package yang perlu diimport untuk membuat aplikasi
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //TODO 2: pembuatan variabel dan objek yang dibutuhkan untuk validasi password
    String nama, pass;
    String username = "sirojudin";
    String passw = "165410193";

    @Override
    //TODO 3: pembuatan bundle untuk menampilkan activity dari layout halaman_utama
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_utama);

    }

    //TODO 4: proses memanggil view ketika tombol dengan action onclik login ditekan
    public void login(View view) {
        //TODO 5: mengambil nilai dari editText dengan Id editText5 dan 6
        EditText ambilnama = (EditText) findViewById(R.id.editText5);
        EditText password = (EditText) findViewById(R.id.editText6);
        //TODO 6: pemberian nilai untuk dimasukkan ke variabel nama dan pass, terlebih dahulu dikonversi menjadi string
        nama = ambilnama.getText().toString();
        pass = password.getText().toString();
        //TODO 7 : pengecekan kondisi nama dan password inputan user
        if (nama.equals(username) & (pass.equals(passw))) {
            //TODO 8: jika nama dan password sesuai maka buka intent class listview
            startActivity(new Intent(MainActivity.this, listview.class));
            //TODO  9: menampilkan toast berhasil login
            Toast.makeText(getApplicationContext(), "Berhasil Login", Toast.LENGTH_LONG).show();
        } else {
            //TODO 10: jika nama dan password tidak sesuai maka tampilkan toast nama dan username salah
            Toast.makeText(getApplicationContext(), "Nama Atau Username Salah", Toast.LENGTH_LONG).show();
        }
    }
    //TODO 11: proses memanggil view ketika tombol dengan action onclik singup ditekan
    public void singup(View view) {
        //TODO 12: action untuk membuka intent class singup
        startActivity(new Intent(MainActivity.this, singup.class));
    }

}