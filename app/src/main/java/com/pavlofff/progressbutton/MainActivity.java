package com.pavlofff.progressbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    ProgressButton button;
    float ratio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (ProgressButton) findViewById(R.id.progress_button);

    }

   public void onClicked (View view) {

       button.setRatio(ratio);
       ratio = ratio +0.3f;
       if (ratio >= 1) ratio = 0;
    }
}
