package com.example.thuchanh4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter  extends BaseAdapter {
 Context context454;
 ArrayList<com.example.thuchanh4.ListViewModel> listviewData454;
 LayoutInflater layoutInflater454;
 com.example.thuchanh4.ListViewModel listViewModel454;

 public ListViewAdapter( Context context , ArrayList<com.example.thuchanh4.ListViewModel> countriesData){
     this.context454 = context;
     this.listviewData454 = countriesData;
     layoutInflater454 = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

 }
    public ListViewAdapter( MainActivity context , ArrayList<com.example.thuchanh4.ListViewModel> listviewData){
        this.context454 = context;
        this.listviewData454 = listviewData;
        layoutInflater454 = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return listviewData454.size();
    }

    @Override
    public Object getItem(int position) {
        return listviewData454.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
     convertView = layoutInflater454.inflate(R.layout.item,null,true);
     listViewModel454 = listviewData454.get(position);

        ImageView productImg = convertView.findViewById(R.id.image454);
        TextView productName = convertView.findViewById(R.id.tvname454);
        TextView gia = convertView.findViewById(R.id.tvgia454);
        TextView sl = convertView.findViewById(R.id.sl454);

        productImg.setImageResource(listViewModel454.getImage454());
        productName.setText(listViewModel454.getTen454());
        gia.setText(listViewModel454.getGia454());
        sl.setText(listViewModel454.getSl454());

        return convertView;
    }
}