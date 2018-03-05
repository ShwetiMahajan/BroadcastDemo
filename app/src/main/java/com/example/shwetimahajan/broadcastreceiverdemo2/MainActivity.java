package com.example.shwetimahajan.broadcastreceiverdemo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button send_broadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send_broadcast = (Button)findViewById(R.id.send_broadcast);

        send_broadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent broadcast_intent = new Intent("com.example.shwetimahajan.broadcastreceiverdemo2");
                sendBroadcast(broadcast_intent);
            }
        });
    }
}
