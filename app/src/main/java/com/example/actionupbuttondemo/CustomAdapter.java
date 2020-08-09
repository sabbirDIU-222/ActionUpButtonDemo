package com.example.actionupbuttondemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context  context;
    int[]    image;
    String[] imagename;
    LayoutInflater inflater;




    public CustomAdapter(Context context, int[] image, String[] imagename) {
        this.context = context;
        this.image = image;
        this.imagename = imagename;
    }





    @Override
    public int getCount() {
        return imagename.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){

            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.new_file,parent,false);

     }

        ImageView imageView =  convertView.findViewById(R.id.imageViewid);
        TextView textView = convertView.findViewById(R.id.textViewId);

        imageView.setImageResource(image[position]);
        textView.setText(imagename[position]);


        return convertView;
    }
}
