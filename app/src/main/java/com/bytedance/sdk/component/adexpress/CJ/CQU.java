package com.bytedance.sdk.component.adexpress.CJ;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: ScreenUtils.java */
/* loaded from: classes.dex */
public class CQU {
    private static boolean Qhi;

    private static float CJ(Context context) {
        try {
            if (Qhi) {
                Class<?> loadClass = context.getClassLoader().loadClass("android.util.DisplayMetrics");
                Method declaredMethod = loadClass.getDeclaredMethod("getDeviceDensity", new Class[0]);
                declaredMethod.setAccessible(true);
                return ((Integer) declaredMethod.invoke(loadClass, new Object[0])).intValue() / 160.0f;
            }
        } catch (Exception unused) {
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static int Qhi(float f10, float f11, float f12, float f13) {
        return (((int) ((f10 * 255.0f) + 0.5f)) << 24) | (((int) ((f11 * 255.0f) + 0.5f)) << 16) | (((int) ((f12 * 255.0f) + 0.5f)) << 8) | ((int) ((f13 * 255.0f) + 0.5f));
    }

    public static float ac(Context context, float f10) {
        if (context == null) {
            context = Qhi.Qhi().ac().cJ();
        }
        return f10 * CJ(context);
    }

    public static int cJ(Context context, float f10) {
        if (context == null) {
            context = Qhi.Qhi().ac().cJ();
        }
        float CJ = CJ(context);
        if (CJ <= 0.0f) {
            CJ = 1.0f;
        }
        return (int) ((f10 / CJ) + 0.5f);
    }

    public static float Qhi(Context context, float f10) {
        if (context == null) {
            context = Qhi.Qhi().ac().cJ();
        }
        return (f10 * CJ(context)) + 0.5f;
    }

    public static String ac(Context context) {
        String str;
        Locale locale;
        LocaleList locales;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locales = com.bytedance.sdk.component.utils.MQ.cJ(context).getConfiguration().getLocales();
                locale = locales.get(0);
            } else {
                locale = Locale.getDefault();
            }
            str = locale.getLanguage();
            try {
                if (locale.getCountry().equals("TW")) {
                    str = "zhHant";
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str = "";
        }
        return Qhi(str);
    }

    public static int cJ(Context context) {
        if (context == null) {
            context = Qhi.Qhi().ac().cJ();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int Qhi(Context context) {
        if (context == null) {
            context = Qhi.Qhi().ac().cJ();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private static String Qhi(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 3121:
                if (str.equals("ar")) {
                    c = 0;
                    break;
                }
                break;
            case 3383:
                if (str.equals("ja")) {
                    c = 1;
                    break;
                }
                break;
            case 3428:
                if (str.equals("ko")) {
                    c = 2;
                    break;
                }
                break;
            case 3494:
                if (str.equals("ms")) {
                    c = 3;
                    break;
                }
                break;
            case 3886:
                if (str.equals("zh")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "aa";
            case 1:
                return "japan";
            case 2:
                return "korea";
            case 3:
                return "my";
            case 4:
                return "cn";
            default:
                return str;
        }
    }
}
