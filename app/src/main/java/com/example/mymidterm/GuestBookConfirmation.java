package com.example.mymidterm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GuestBookConfirmation extends AppCompatActivity {

    public Button goHome;
    public void init(){
        goHome = findViewById(R.id.guestSubmit);
        goHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(GuestBookConfirmation.this,ItemListActivity.class);


                startActivity(toy);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_book_confirmation);

        GuestBookData guestBookData = (GuestBookData) getIntent().getSerializableExtra("GuestBookData");

        TextView confirmationMessage = findViewById(R.id.confirmationPage);
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("Thank you ");
        stringBuffer.append(guestBookData.getName());
        stringBuffer.append(". You have now signed the guest book!\n");
        stringBuffer.append("Here is the information you provided in the guestbook: ");
        stringBuffer.append("\n");
        stringBuffer.append(guestBookData.getPhone());
        stringBuffer.append("\n");
        stringBuffer.append(guestBookData.getEmail());
        stringBuffer.append("\n");
        stringBuffer.append(guestBookData.getComments());

        confirmationMessage.setText(stringBuffer.toString());

        init();
    }
}
