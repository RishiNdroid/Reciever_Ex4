package com.example.rndroid.reciever_ex4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver2 extends BroadcastReceiver {
    public MyReceiver2() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Reciever 2 started Music Player", Toast.LENGTH_SHORT).show();
        abortBroadcast(); // this will stop the connection and next two will
    }
}
