package com.example.mymidterm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GuestBookConfirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_book_confirmation);

        GuestBookData guestBookData = (GuestBookData) getIntent().getSerializableExtra("GuestBookData");

        TextView confirmationMessage = findViewById(R.id.confirmationPage);
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("Thank you ");
        stringBuffer.append(guestBookData.getName());
        stringBuffer.append(". You have now signed the guest book!");

        confirmationMessage.setText(stringBuffer.toString());
    }
}
