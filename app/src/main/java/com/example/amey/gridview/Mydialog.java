package com.example.amey.gridview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by amey on 7/20/2016.
 */
public class Mydialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog);
        ImageView imageView= (ImageView) findViewById(R.id.imageView2);
        EditText editText= (EditText) findViewById(R.id.editText2);

        Intent intent=getIntent();
      int img=  intent.getIntExtra("img", R.drawable.ic_launcher);
        String desc=intent.getStringExtra("desc");

        imageView.setImageResource(img);
        editText.setText(desc);
    }
    public void ok(View view)
    {
        finish();


    }

}
