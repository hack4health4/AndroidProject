package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class NurseContact extends AppCompatActivity {

    private String message;
    private String subject;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nurse_contact);



//        public void sendMail(){
//
////            String subject = mEditTextSubject.getText().toString();
////            String message = mEditTextMessage.getText().toString();
//
//            Intent intent = new Intent(Intent.ACTION_SEND);
//            intent.putExtra(Intent.EXTRA_EMAIL, recipient);// from DB
//            intent.putExtra(Intent.EXTRA_SUBJECT, subject);
//            intent.putExtra(Intent.EXTRA_TEXT, message);
//
//            intent.setType("message/rfc822");
//            startActivity(Intent.createChooser(intent, "Choose an email client"));
//
//        }
    }
}