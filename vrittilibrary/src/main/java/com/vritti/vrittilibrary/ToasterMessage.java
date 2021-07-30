package com.vritti.vrittilibrary;

import android.content.Context;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ToasterMessage {

    public static void s(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();
        Log.e("MESSAGE",message);

    }


    public  static LinearLayout VControllers(Context c){
        LinearLayout layout = new LinearLayout(c);
        layout.setOrientation(LinearLayout.VERTICAL);
        for (int i = 0; i < 3; i++) {
            LinearLayout row = new LinearLayout(c);
            row.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT,
                            LinearLayout.LayoutParams.WRAP_CONTENT));
            for (int j = 0; j < 4; j++) {
                Button btnTag = new Button(c);
                btnTag.setLayoutParams(new LinearLayout.LayoutParams
                        (LinearLayout.LayoutParams.WRAP_CONTENT,
                                LinearLayout.LayoutParams.MATCH_PARENT));
                btnTag.setText("Button " + (j + 1 + (i * 4 )));
                btnTag.setId(j + 1 + (i * 4));
                row.addView(btnTag);
            }
            layout.addView(row);
        }
        return layout;
    }
}
