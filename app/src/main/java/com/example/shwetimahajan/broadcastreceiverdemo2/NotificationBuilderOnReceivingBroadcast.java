package com.example.shwetimahajan.broadcastreceiverdemo2;

import android.app.Notification;
import android.app.NotificationManager;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.widget.RemoteViews;
import android.widget.Toast;

import java.nio.channels.Channel;

/**
 * Created by shwetimahajan on 3/4/18.
 */

public class NotificationBuilderOnReceivingBroadcast extends BroadcastReceiver{


    NotificationCompat.Builder nBuilder;
    private static final int uniqueId = 3748;
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals("com.example.shwetimahajan.broadcastreceiverdemo2")) {
            Toast.makeText(context, "CREATE_NOTIFICATION broadcast received!", Toast.LENGTH_LONG).show();
            //NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        }
        else if(intent.getAction().equals("android.intent.action.ACTION_POWER_CONNECTED")) {
            Toast.makeText(context, "Power Connected!!", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(context, "Power got Disconnected!!", Toast.LENGTH_LONG).show();
        }
    }
}
