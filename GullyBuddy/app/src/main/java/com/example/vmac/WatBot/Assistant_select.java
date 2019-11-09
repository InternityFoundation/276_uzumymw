package com.example.vmac.WatBot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Assistant_select extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ass_select);
        final ImageButton button = (ImageButton) findViewById(R.id.imageButton3);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(Assistant_select.this, Route_select.class);

                // currentContext.startActivity(activityChangeIntent);

                Assistant_select.this.startActivity(activityChangeIntent);
            }
        });


        final ImageButton button2 = (ImageButton) findViewById(R.id.imageButton4);

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(Assistant_select.this, Route_select.class);

                // currentContext.startActivity(activityChangeIntent);

                Assistant_select.this.startActivity(activityChangeIntent);
            }
        });


        final ImageButton button3 = (ImageButton) findViewById(R.id.imageButton7);

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(Assistant_select.this, Route_select.class);

                // currentContext.startActivity(activityChangeIntent);

                Assistant_select.this.startActivity(activityChangeIntent);
            }
        });

        final ImageButton button4 = (ImageButton) findViewById(R.id.imageButton2);

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(Assistant_select.this, Route_select.class);

                // currentContext.startActivity(activityChangeIntent);

                Assistant_select.this.startActivity(activityChangeIntent);
            }
        });
    }
}
