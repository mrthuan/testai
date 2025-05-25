package com.bytedance.sdk.openadsdk.hpZ;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;

/* compiled from: PlayableHub.java */
/* loaded from: classes.dex */
public class Tgh {
    protected static int CJ = 30;
    public static int Gm = 16;
    protected static String Qhi = "images";
    public static int ROR = 1;
    public static int Sf = 2;
    public static int Tgh = 0;
    public static int WAv = 8;

    /* renamed from: ac  reason: collision with root package name */
    protected static int f9314ac = 1;
    protected static String cJ = null;

    /* renamed from: fl  reason: collision with root package name */
    protected static long f9315fl = 15360;

    /* renamed from: hm  reason: collision with root package name */
    public static int f9316hm = 4;

    /* renamed from: zc  reason: collision with root package name */
    public static int f9317zc = 32;

    public static boolean Qhi(Context context, String str) {
        return false;
    }

    public static boolean cJ(Context context, String str) {
        if (context.checkSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public static Bitmap Qhi(String str) {
        byte[] decode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public static boolean Qhi(Context context, int i10) {
        boolean Qhi2;
        boolean Qhi3;
        if (Tgh == 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                Qhi2 = Qhi(context, "android.permission.READ_MEDIA_IMAGES");
                Qhi3 = true;
            } else {
                Qhi2 = Qhi(context, "android.permission.READ_EXTERNAL_STORAGE");
                Qhi3 = Qhi(context, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            boolean Qhi4 = Qhi(context, "android.permission.CAMERA");
            boolean Qhi5 = Qhi(context, "android.permission.RECORD_AUDIO");
            PackageManager packageManager = context.getPackageManager();
            if (Qhi2 && Qhi3) {
                Tgh |= ROR;
            }
            if (Qhi4 && packageManager.hasSystemFeature("android.hardware.camera")) {
                Tgh |= Sf;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                Tgh |= f9316hm;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                Tgh |= WAv;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                Tgh |= Gm;
            }
            if (Qhi5 && packageManager.hasSystemFeature("android.hardware.microphone")) {
                Tgh |= f9317zc;
            }
        }
        return (Tgh & i10) != 0;
    }

    public static boolean Qhi(Context context) {
        boolean z10;
        boolean z11;
        if (Build.VERSION.SDK_INT >= 33) {
            z10 = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        } else {
            z10 = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z11 = false;
                return !z11 && z10;
            }
        }
        z11 = true;
        if (z11) {
        }
    }
}
