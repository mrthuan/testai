package com.pgl.ssdk;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: DisplayUnits.java */
/* loaded from: classes2.dex */
public class A {

    /* renamed from: a  reason: collision with root package name */
    public static int f15748a;

    /* renamed from: b  reason: collision with root package name */
    public static int f15749b;
    public static int c;

    private static void a(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            f15748a = point.x;
            f15749b = point.y;
        } catch (Throwable unused) {
        }
    }

    public static String b(Context context) {
        try {
            a(context);
            if (context != null) {
                try {
                    new DisplayMetrics();
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f10 = displayMetrics.density;
                    c = displayMetrics.densityDpi;
                } catch (Throwable unused) {
                }
            }
            new DisplayMetrics();
            float f11 = context.getResources().getDisplayMetrics().xdpi;
        } catch (Throwable unused2) {
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c);
        sb2.append("[<!>]");
        sb2.append(f15748a);
        sb2.append(",");
        return a6.h.g(sb2, f15749b, "[<!>]");
    }
}
