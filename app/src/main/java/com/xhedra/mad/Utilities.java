package com.xhedra.mad;

import android.content.Context;
import android.content.Intent;

import android.net.Uri;


public class Utilities {

    public static void makecall(String phone, Context context){
        String callNumber = phone;
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" +callNumber));
        context.startActivity(intent);
    }

}