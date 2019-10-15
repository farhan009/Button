package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int count = 0;
    private Button login, logout;
    private TextView result_TextView, times_TextView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login_Button);
        logout = findViewById(R.id.logout_Button);
        result_TextView = findViewById(R.id.result_TextView);
        times_TextView = findViewById(R.id.times_TextView);

        login.setOnClickListener(this);
        logout.setOnClickListener(this);

        /*login.setOnClickListener(new View.OnClickListener() {                 //
            @Override                                                           //
            public void onClick(View v) {                                       //
                count++;                                                        // Another method to Add Onclick Listener
                times_TextView.setText(count +"Times");                         // it's Switable for 1 Button
            }                                                                   //
        });  */                                                                 //

       // Handler handler = new Handler();                                      //
       // login.setOnClickListener(handler);                                    //
    }                                                                           //
                                                                                //
    /*class Handler implements View.OnClickListener{                            // Another method to Ad OnClick Listener
                                                                                // Inner Class Listener
        @Override                                                               //
        public void onClick(View v) {                                           //
                                                                                //
        }                                                                       //
    }  */                                                                       //

    /*public void show(View v){                                                 // Another method to Ad OnClick Listener
        result_TextView.setText("Welcome");                                     // A attrbutes in .xml file
    }  */                                                                       //

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.login_Button){
            count++;
            times_TextView.setText(count +" Times");
            result_TextView.setText("Login Button is clicked");

            //Toast.makeText(MainActivity.this, "Login Button is clicked", Toast.LENGTH_SHORT).show();
        }
        if (v.getId()==R.id.logout_Button){
            count++;
            times_TextView.setText(count +" Times");
            result_TextView.setText("LogOut Button is clicked");

            //Toast.makeText(MainActivity.this, "LogOut Button is clicked", Toast.LENGTH_SHORT).show();
        }
    }
}
