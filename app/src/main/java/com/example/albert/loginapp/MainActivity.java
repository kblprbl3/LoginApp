package com.example.albert.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img;
    private Button btn;
    private EditText email,pass;

    private static final String email_text = "example@mail.kg";
    private static final String pass_text = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
    }

    public void login(){
        img = (ImageView)findViewById(R.id.imageView2);
        btn = (Button)findViewById(R.id.button);
        email = (EditText)findViewById(R.id.editText);
        pass = (EditText)findViewById(R.id.editText2);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (email_text.equals(String.valueOf(email.getText())) && pass_text.equals(String.valueOf(pass.getText())))
                            img.setImageResource(R.drawable.logo_right);
                        else
                            img.setImageResource(R.drawable.logo_wrong);


                    }
                }
        );

    }
}
