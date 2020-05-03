package com.example.sendmailteste;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button send = this.findViewById(R.id.buttonSend);

        send.setOnClickListener(this);
    }

    private void sendEmail(){
        String email = "nunomcfrancisco@gmail.com";
        String subject = "Test Mail Android";
        String message = "This is a test! AGAIN!";

        SendMail sm = new SendMail(this, email, subject, message);
        sm.execute();
    }

    @Override
    public void onClick(View v) {
        sendEmail();
    }
}
