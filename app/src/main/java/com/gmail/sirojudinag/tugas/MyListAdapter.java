package com.gmail.sirojudinag.tugas;

//TODO 1: merupakan package yang perlu diimport untuk membuat aplikasi
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends ArrayAdapter<String> {
    //TODO 2: pembuatan variabel dan objek yang dibutuhkan untuk membuat adapter list
    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final Integer[] imgid;
    public MyListAdapter(Activity context, String[] maintitle, String[] subtitle, Integer[] imgid)
    {
        super(context, R.layout.mylist, maintitle);
    // TODO 3 : Pembuatan constructor Secara otomatis untuk masing-masing objek
        this.context=context;
        this.maintitle=maintitle;
        this.subtitle=subtitle;
        this.imgid=imgid;
    }
    // TODO 4: Metode ini menciptakan View  yang menampilkan data untuk item / baris yang ditentukan (berdasarkan posisi) di AdapterView.
    public View getView(int position,View view,ViewGroup parent) {
        // TODO 5: untuk mengambil widget Berdasarkan Tombol Tombol = (Tombol) view.findViewById
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);
        // TODO 6: mengambil nilai untuk titletext dengan id title
        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        // TODO 7: mengambil nilai untuk imageView dengan id icon
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        // TODO 8: mengambil nilai untuk subtitletext dengan id subtitle
        TextView subtitleText = (TextView) rowView.findViewById(R.id.subtitle);
        // TODO 9: memberikan posisi pada titletext, imageview dan subtitletext berdasarkan posisi
        titleText.setText(maintitle[position]);
        imageView.setImageResource(imgid[position]);
        subtitleText.setText(subtitle[position]);
        return rowView;
    };
}
