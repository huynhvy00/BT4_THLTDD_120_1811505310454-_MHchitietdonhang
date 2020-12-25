package com.example.thuchanh4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
ListViewAdapter listViewAdapter;
ArrayList<ListViewModel> listviewData;
private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview454);
        listviewData = new ArrayList<>();
        listviewData.add(new ListViewModel(R.drawable.banhgau, "Bánh gấu", "30000đ", "3"));
        listviewData.add(new ListViewModel(R.drawable.pbt, "Phúc bồn tử", "30000đ", "1"));
        listviewData.add(new ListViewModel(R.drawable.banhxoai, "Bánh xoài", "50000đ", "2"));
        listviewData.add(new ListViewModel(R.drawable.caramen, "Caramen", "30000đ", "7"));
        listViewAdapter = new ListViewAdapter(this , listviewData);
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView tvxoa = (TextView) findViewById(R.id.xoa);
                tvxoa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        AlertDialog.Builder alertDialogbuilder = new AlertDialog.Builder(view.getContext());
                        alertDialogbuilder.setTitle("Xóa");
                        alertDialogbuilder.setMessage("Bạn chắc chắn muốn xóa?");
                        alertDialogbuilder.setCancelable(false).setPositiveButton("Xóa", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        }).setNegativeButton("Hủy", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                        alertDialogbuilder.show();
                    }
                });
            }
        });
    }
}