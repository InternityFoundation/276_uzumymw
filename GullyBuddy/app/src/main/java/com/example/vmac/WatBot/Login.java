package com.example.vmac.WatBot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.File;
import java.lang.*;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class Login extends AppCompatActivity {

    public String sname;
    public String friendName;
    public String snumber;
    public String friendNumber;

    private EditText editTextName , editTestEmail,editTestpnumber , editTextPassword ,
            editTextFname , editTextFnumber ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_login);

        editTextName = findViewById(R.id.input_name);
        editTestEmail = findViewById(R.id.input_email);
        editTestpnumber = findViewById(R.id.input_pnumber);
        editTextPassword = findViewById(R.id.input_password);
        editTextFname = findViewById(R.id.friends_name);
        editTextFnumber = findViewById(R.id.friends_pnumber);



        final Button button = (Button) findViewById(R.id.btn_signup);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(Login.this, Assistant_select.class);

                sname = editTextName.getText().toString().trim();
                String email = editTestEmail.getText().toString().trim();
                snumber = editTestpnumber.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();
                friendName = editTextFname.getText().toString().trim();
                friendNumber = editTextFnumber.getText().toString().trim();

                Log.d("rishi" , friendName +" " + friendNumber);


                JSONObject obj = new JSONObject();
                obj.put("friendName", friendName);
                obj.put("friendNumber", friendNumber);

                try {
                    FileWriter file = new FileWriter("/data/data/" + getApplicationContext().getPackageName() + "/" + "text1.txt");
                    //file.write(obj.toJSONString());
                    file.write(friendNumber + " " + friendName + " " + sname);
                    file.flush();
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Log.d("rishi" , "obj "+ obj);







                //currentContext.startActivity(activityChangeIntent);


                Login.this.startActivity(activityChangeIntent);
            }
        });
    }
}
