package com.vritti.vrittilibrary;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.core.graphics.drawable.DrawableCompat;

public class ToasterMessage {

    public static void s(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();
        Log.e("MESSAGE",message);

    }









    public  static LinearLayout VControllers(Context c){
        LinearLayout layout = new LinearLayout(c);
        layout.setOrientation(LinearLayout.VERTICAL);
        for (int i = 0; i < 1; i++) {
            LinearLayout row = new LinearLayout(c);
            row.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.WRAP_CONTENT));
            row.setGravity(Gravity.CENTER);


            Button btnTag_1 = new Button(c);
            btnTag_1.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT,
                            LinearLayout.LayoutParams.MATCH_PARENT));

            btnTag_1.setText("1");
            //btnTag_1.setId(0);
            btnTag_1.setGravity(Gravity.CENTER);
            btnTag_1.setPadding(5,5,5,5);
            btnTag_1.setTextColor(Color.WHITE);

            Drawable buttonDrawable = btnTag_1.getBackground();
            buttonDrawable = DrawableCompat.wrap(buttonDrawable);
            DrawableCompat.setTint(buttonDrawable, Color.BLUE);
            btnTag_1.setBackground(buttonDrawable);
            row.addView(btnTag_1);


            btnTag_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Button 1
                    Log.e("LIBBUTTON-1","Clicked");
                    Intent i2 = new Intent();
                    i2.setComponent(new ComponentName("com.vritti.application_2","com.vritti.application_2.MainActivity"));//the destination packageName
                    i2.putExtra("media", "stop");
                    c.startActivity(i2);
                }
            });

            Button btnTag_2 = new Button(c);
            btnTag_2.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT,
                            LinearLayout.LayoutParams.MATCH_PARENT));

            btnTag_2.setText("2");
            //btnTag_2.setId(1);
            btnTag_2.setGravity(Gravity.CENTER);
            btnTag_2.setPadding(5,5,5,5);
            btnTag_2.setTextColor(Color.WHITE);

            Drawable buttonDrawable2 = btnTag_2.getBackground();
            buttonDrawable2 = DrawableCompat.wrap(buttonDrawable2);
            DrawableCompat.setTint(buttonDrawable2, Color.BLUE);
            btnTag_2.setBackground(buttonDrawable2);
            row.addView(btnTag_2);


            btnTag_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Button2
                    Log.e("LIBBUTTON-2","Clicked");

                    Intent i2 = new Intent();
                    i2.setComponent(new ComponentName("com.vritti.application_2","com.vritti.application_2.MainActivity"));//the destination packageName
                    i2.putExtra("media", "play");
                    c.startActivity(i2);
                }
            });



            Button btnTag_3 = new Button(c);
            btnTag_3.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT,
                            LinearLayout.LayoutParams.MATCH_PARENT));

            btnTag_3.setText("3");
            //btnTag_3.setId(1 + (i * 4));
            btnTag_3.setGravity(Gravity.CENTER);
            btnTag_3.setPadding(5,5,5,5);
            btnTag_3.setTextColor(Color.WHITE);

            Drawable buttonDrawable3 = btnTag_3.getBackground();
            buttonDrawable3 = DrawableCompat.wrap(buttonDrawable3);
            DrawableCompat.setTint(buttonDrawable3, Color.BLUE);
            btnTag_3.setBackground(buttonDrawable3);

            row.addView(btnTag_3);

            btnTag_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Button3
                    Log.e("LIBBUTTON-3","Clicked");

                    Intent i2 = new Intent();
                    i2.setComponent(new ComponentName("com.vritti.application_2","com.vritti.application_2.MainActivity"));//the destination packageName
                    i2.putExtra("media", "pause");
                    c.startActivity(i2);
                }
            });


            /*for (int j = 0; j < 3; j++) {
                btnTag = new Button(this);
                btnTag.setLayoutParams(new LinearLayout.LayoutParams
                        (LinearLayout.LayoutParams.WRAP_CONTENT,
                                LinearLayout.LayoutParams.MATCH_PARENT));

                btnTag.setText("" + (j + 1 + (i * 4 )));
                btnTag.setId(j + 1 + (i * 4));
                btnTag.setGravity(Gravity.CENTER);
                btnTag.setPadding(5,5,5,5);
                btnTag.setTextColor(Color.WHITE);

                row.addView(btnTag);

            }*/
            layout.addView(row);


        }
        return layout;
    }

   /* public  static LinearLayout VControllers(Context c){
        LinearLayout layout = new LinearLayout(c);
        layout.setOrientation(LinearLayout.VERTICAL);
        for (int i = 0; i < 1; i++) {
            LinearLayout row = new LinearLayout(c);
            row.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT,
                            LinearLayout.LayoutParams.WRAP_CONTENT));
            for (int j = 0; j < 3; j++) {
                Button btnTag = new Button(c);
                btnTag.setLayoutParams(new LinearLayout.LayoutParams
                        (LinearLayout.LayoutParams.WRAP_CONTENT,
                                LinearLayout.LayoutParams.MATCH_PARENT));

                btnTag.setText("Button " + (j + 1 + (i * 4 )));
                btnTag.setId(j + 1 + (i * 4));
                btnTag.setTextColor(Color.WHITE);
                btnTag.setBackgroundColor(Color.BLUE);
                row.addView(btnTag);
            }
            layout.addView(row);
        }
        return layout;
    }*/

}
