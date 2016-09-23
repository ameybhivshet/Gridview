package com.example.amey.gridview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView= (GridView) findViewById(R.id.gridView);
        Myadapter myadapter=new Myadapter(this);
        gridView.setAdapter(myadapter);
        gridView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
Myholder holder= (Myholder) view.getTag();

       Singleitem t= (Singleitem) holder.iview.getTag();

        Intent intent=new Intent(this,Mydialog.class);
        intent.putExtra("img",t.imageid);
        intent.putExtra("desc",t.desc);

        startActivity(intent);

    }
}
