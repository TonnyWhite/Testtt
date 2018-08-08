package com.example.tomiris.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        LinearLayout linearLayout = new LinearLayout(MainActivity.this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        linearLayout.setLayoutParams(params);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);


        TextView tvText = new TextView(MainActivity.this);
        LinearLayout.LayoutParams params1 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params1.height = SizeDP(50);
        params1.weight = SizeDP(200);
        tvText.setText("text");
        tvText.setLayoutParams(params1);
        linearLayout.addView(tvText);

        ImageView imageView = new ImageView(MainActivity.this);
        LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params2.weight = SizeDP(50);
        params2.height = SizeDP(50);
        params2.gravity = Gravity.RIGHT;
        imageView.setLayoutParams(params2);
        linearLayout.addView(imageView);


    }

    private int SizeDP(float count) {
        float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, count, getResources().getDisplayMetrics());
        int numb = Math.round(px);
        return numb;
    }
}
