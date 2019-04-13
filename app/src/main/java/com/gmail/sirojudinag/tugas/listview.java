package com.gmail.sirojudinag.tugas;

//TODO 1: merupakan package yang perlu diimport untuk membuat aplikasi
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class listview extends AppCompatActivity {

    //TODO 2: pembuatan variabel dan objek yang dibutuhkan untuk menampilkan list
    ListView list;
    //TODO 3: merupakan array untuk menyimpan string dari judul utama listview
    String[] maintitle ={
            "Triyudo Wibisono","Yuliana Anjarwati",
            "Widya Sulistyani","Afrizal Abiyan",
            "Sella Monika","Dikdik Maulana",
            "Gertiana Golongi","afrilla adhitya",
    };
    //TODO 4: merupakan array yang digunakan untuk menyimpan string dari subjudul dari listview
    String[] subtitle ={
            "triyudowbn98@gmail.com","anjaryuliana.ya@gmail.com",
            "widyasulistyani36@gmail.com","aprizalabyan@gmail.com",
            "sellamonicaa@gmail.com","dikdikmaulana48@gmail.com","gertianagl@gmail.com","afrilla.adit@gmail.com",
    };
    //TODO 5: pengambilan data foto yang dsimpan dalam folder drawable, agar tidak bermasalah gunakan format png pda foto
    Integer[] imgid={
            R.drawable.yudo,
            R.drawable.anjar,
            R.drawable.widya,
            R.drawable.abi,
            R.drawable.sella,
            R.drawable.dikdik,
            R.drawable.gerti,
            R.drawable.adhit
    };

    @Override
    //TODO 6: pembuatan bundle untuk menampilkan activity dari layout activity_listView
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        //TODO 7: pemanggilan adapter listview dan memberikan nilai dari maintitle, subtitle dan imgid
        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
        //TODO 8: pemberian nilai list dengan mengambil nilai dari id List
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        //TODO 9: onclick listener, menghandle apa yang akan dilakukan ketika list ditekan
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // TODO 10: kondisi dalam if jika listview ditekan,
                if(position == 0) {
                    //TODO 11: kode khusus untuk item daftar pertama Jika pada posisi index 0
                    Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 1) {
                    //TODO 12: kode khusus untuk item kedua Jika pada posisi index 1
                    Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 2) {
                    //TODO 13: kode khusus untuk item ketiga Jika pada posisi index 2
                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {
                    //TODO 14: kode khusus untuk item keempat Jika pada posisi index 3
                    Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {
                    //TODO 15: kode khusus untuk item kelima Jika pada posisi index 4
                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 5) {
                    //TODO 16: kode khusus untuk item keenam Jika pada posisi index 5
                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 6) {
                    //TODO 17: kode khusus untuk item ketuju Jika pada posisi index 6
                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 7) {
                    //TODO 18: kode khusus untuk item kedelapan Jika pada posisi index 7
                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
