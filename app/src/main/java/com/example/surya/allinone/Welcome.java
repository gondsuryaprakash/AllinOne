package com.example.surya.allinone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void fb(View view) {
        Toast.makeText(Welcome.this, "FB is not Installed", Toast.LENGTH_SHORT).show();
    }

    public void yt(View view) {
        Intent iyt= getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
        startActivity(iyt);
    }

    public void whatsapp(View view) {
        Intent iwt= getPackageManager().getLaunchIntentForPackage("com.whatsapp");
        startActivity(iwt);

    }

    public void gmail(View view) {
        Intent igm= getPackageManager().getLaunchIntentForPackage("com.google.android.gm");
        startActivity(igm);

    }

    public void vlc(View view) {
        Intent ivl= getPackageManager().getLaunchIntentForPackage("org.videolan.vlc");
        startActivity(ivl);

    }

    public void tw(View view) {
        Intent itc= getPackageManager().getLaunchIntentForPackage("com.twitter.android");
        startActivity(itc);


    }

    public void insta(View view) {
        Intent iin= getPackageManager().getLaunchIntentForPackage("com.instagram.android");
        startActivity(iin);
    }

    public void telegram(View view) {
        Intent itl= getPackageManager().getLaunchIntentForPackage("org.telegram.messenger");
        startActivity(itl);
    }

    public void maps(View view) {
        Intent imp= getPackageManager().getLaunchIntentForPackage("com.google.android.apps.maps");
        startActivity(imp);

    }

    public void phonepe(View view) {
        Intent ipp= getPackageManager().getLaunchIntentForPackage("com.phonepe.app");
        startActivity(ipp);

    }
}
