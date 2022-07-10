package com.example.permissionm;

import android.widget.Toast;

public class ToastUtil {
    public static void showShort(String message) {
        Toast.makeText(MyApplication.context,message,Toast.LENGTH_SHORT)
                .show();
    }
}
