package nhl69.luansapp.tltdtdd_tuan7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView;
        ArrayList<MonAn> arrayList;
        AdapterMonAn adapter;

        listView = (ListView) findViewById(R.id.listviewmonan);
        arrayList = new ArrayList<>();
        arrayList.add(new MonAn("Thịt cầy", "Infomation of item 1", "6$", R.drawable.thit_cay));
        arrayList.add(new MonAn("Gà hun khói", "Infomation of item 2", "6$", R.drawable.ga_hun_khoi));
        arrayList.add(new MonAn("Giò heo muối", "Infomation of item 3", "6$", R.drawable.gio_heo_muoi));
        arrayList.add(new MonAn("Gỏi bò", "Infomation of item 4", "6$", R.drawable.goi_bo_bop_thau));
        arrayList.add(new MonAn("Trứng vịt lộn", "Infomation of item 5", "6$", R.drawable.trung_vit_lon));


        adapter = new AdapterMonAn(ListActivity.this, R.layout.layout_monan, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent();
                intent.setClass(ListActivity.this, DetailMonAnActivity.class);
                startActivity(intent);
            }
        });

//        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
//
//            }
//        });
    }
}