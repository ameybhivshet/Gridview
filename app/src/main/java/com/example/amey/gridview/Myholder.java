package com.example.amey.gridview;

import android.view.View;
import android.widget.ImageView;

/**
 * Created by amey on 7/19/2016.
 */
public class Myholder {
ImageView iview;
public Myholder(View v)
{
    iview= (ImageView) v.findViewById(R.id.imageView);

}
}
