package com.example.rndroid.reciever_ex4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver3 extends BroadcastReceiver {
    public MyReceiver3() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Reciever 3 started Music Player", Toast.LENGTH_SHORT).show();
    }
}
