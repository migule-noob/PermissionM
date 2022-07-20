package com.example.mylibrary;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Toast;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

public class ToastUtil {
    @SuppressLint({"StaticFieldLeak"})
    private static Context context;
    private static final int DEFAULT_COLOR = -16777217;
    private static int sGravity = -1;
    private static int sXOffset = -1;
    private static int sYOffset = -1;
    private static int backgroundColor = -16777217;
    private static int backgroundResource = -1;
    private static int messageColor = -16777217;
    private static int messageTextSize = -1;

    public static void init(Context context) {
        ToastUtil.context = context;
    }

    private ToastUtil() {
        throw new UnsupportedOperationException("u can't touch me!");
    }

    public static void setGravity(int gravity, int xOffset, int yOffset) {
        sGravity = gravity;
        sXOffset = xOffset;
        sYOffset = yOffset;
    }

    public static void setBackgroundColor(@ColorInt int backgroundColor) {
        ToastUtil.backgroundColor = backgroundColor;
    }

    public static void setBackgroundResource(@DrawableRes int backgroundResource) {
        ToastUtil.backgroundResource = backgroundResource;
    }

    public static void setMessageColor(@ColorInt int messageColor) {
        ToastUtil.messageColor = messageColor;
    }

    public static void setMessageTextSize(int messageTextSize) {
        ToastUtil.messageTextSize = messageTextSize;
    }

    public static void showShort(String msg) {
        Toast.makeText(context, msg, 0).show();
    }

    public static void showShort(@StringRes int res) {
        Toast.makeText(context, res, 0).show();
    }

    public static void showLong(String msg) {
        Toast.makeText(context, msg, 1).show();
    }

    public static void showLong(@StringRes int res) {
        Toast.makeText(context, res, 1).show();
    }

    public static void resetToast() {
        setMessageColor(-16777217);
        setBackgroundColor(-16777217);
        setBackgroundResource(-1);
        setGravity(81, -1, -1);
    }
}
