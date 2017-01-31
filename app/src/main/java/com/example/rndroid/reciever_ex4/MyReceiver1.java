package com.example.rndroid.reciever_ex4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver1 extends BroadcastReceiver {
    public MyReceiver1() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Reciever 1 started Music Player", Toast.LENGTH_SHORT).show();
    }
}
