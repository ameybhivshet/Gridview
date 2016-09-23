package com.example.amey.gridview;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by amey on 7/19/2016.
 */
public class Myadapter  extends BaseAdapter {

    ArrayList<Singleitem> list;

    Context context;

    public Myadapter(Context context)
    {

        list=new ArrayList<Singleitem>();
        this.context=context;
        int images[]={R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher};
        Resources res=context.getResources();
        String descriptions[]=res.getStringArray(R.array.description);

        for(int i=0;i<6;i++)
        {
            Singleitem singleitem=new Singleitem(images[i],descriptions[i]);
            list.add(singleitem);
        }

    }




    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Myholder holder;
        View row=convertView;
        if(row==null)
        {
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row= inflater.inflate(R.layout.singlerow,parent,false);

            holder=new Myholder(row);
            row.setTag(holder);


        }
        else {

            holder = (Myholder) row.getTag();
        }
            Singleitem temp=list.get(position);

            holder.iview.setImageResource(temp.imageid);

holder.iview.setTag(temp);
        return row;
    }
}
