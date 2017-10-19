/*
 * Created by Taran Rai Chris Kwon on 11/10/17 1:10 PM
 * Copyright (c) 2017. All rights reserved
 *
 * Last modified 11/10/17 1:10 PM
 */

package ca.bcit.project.newwestnewlife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class HomepageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Button historyButton = (Button) findViewById(R.id.historyButton);
        historyButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent historyIntent = new Intent(HomepageActivity.this, HistoryActivity.class);
                startActivity(historyIntent);
            }
        });
    }
}
