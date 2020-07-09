package com.example.canrisk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    int[] points;
    Bundle bundle;
    int tot=0;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView2);
        bundle = getIntent().getExtras();
        points=bundle.getIntArray("array");
       //int size=points.length-1;
       for(int i=0;i<=12;i++){
          //System.out.println(points[i]);
           tot+=points[i];
       }
        System.out.println(tot);
       if(tot<=21){
            textView.setText("Your risk of having pre-diabetes or type 2 diabetes is fairly low, though it always pays to maintain a healthy lifestyle.");
       }else if(tot<=32){
           textView.setText("Based on your identified risk factors, your risk of having pre-diabetes or type 2 diabetes is moderate. You may wish to consult with a health care practitioner about your risk of developing diabetes.");
       }else if(tot>=33){
            textView.setText("Based on your identified risk factors, your risk of having pre-diabetes or type 2 diabetes is high. You may wish to consult with a health care practitioner to discuss getting your blood sugar tested.");
       }
    }
}
