package com.gyf.immersionbar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes2.dex */
class SpecialBarFontUtils {
    private static int SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
    private static Method mSetStatusBarColorIcon;
    private static Method mSetStatusBarDarkIcon;
    private static Field mStatusBarColorFiled;

    static {
        try {
            mSetStatusBarColorIcon = Activity.class.getMethod("setStatusBarDarkIcon", Integer.TYPE);
        } catch (NoSuchMethodException unused) {
        }
        try {
            mSetStatusBarDarkIcon = Activity.class.getMethod("setStatusBarDarkIcon", Boolean.TYPE);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            mStatusBarColorFiled = WindowManager.LayoutParams.class.getField("statusBarColor");
        } catch (NoSuchFieldException unused3) {
        }
        try {
            SYSTEM_UI_FLAG_LIGHT_STATUS_BAR = View.class.getField("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR").getInt(null);
        } catch (IllegalAccessException | NoSuchFieldException unused4) {
        }
    }

    private static boolean changeMeizuFlag(WindowManager.LayoutParams layoutParams, String str, boolean z10) {
        int i10;
        try {
            Field declaredField = layoutParams.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            int i11 = declaredField.getInt(layoutParams);
            Field declaredField2 = layoutParams.getClass().getDeclaredField("meizuFlags");
            declaredField2.setAccessible(true);
            int i12 = declaredField2.getInt(layoutParams);
            if (z10) {
                i10 = i11 | i12;
            } else {
                i10 = (~i11) & i12;
            }
            if (i12 != i10) {
                declaredField2.setInt(layoutParams, i10);
                return true;
            }
            return false;
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
            return false;
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
            return false;
        } catch (NoSuchFieldException e12) {
            e12.printStackTrace();
            return false;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    public static boolean isBlackColor(int i10, int i11) {
        if (toGrey(i10) < i11) {
            return true;
        }
        return false;
    }

    @SuppressLint({"PrivateApi"})
    public static void setMIUIBarDark(Window window, String str, boolean z10) {
        if (window != null) {
            Class<?> cls = window.getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i10 = cls2.getField(str).getInt(cls2);
                Class<?> cls3 = Integer.TYPE;
                Method method = cls.getMethod("setExtraFlags", cls3, cls3);
                if (z10) {
                    method.invoke(window, Integer.valueOf(i10), Integer.valueOf(i10));
                } else {
                    method.invoke(window, 0, Integer.valueOf(i10));
                }
            } catch (Exception unused) {
            }
        }
    }

    private static void setStatusBarColor(Window window, int i10) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        Field field = mStatusBarColorFiled;
        if (field != null) {
            try {
                if (field.getInt(attributes) != i10) {
                    mStatusBarColorFiled.set(attributes, Integer.valueOf(i10));
                    window.setAttributes(attributes);
                }
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void setStatusBarDarkIcon(Activity activity, int i10) {
        Method method = mSetStatusBarColorIcon;
        if (method != null) {
            try {
                method.invoke(activity, Integer.valueOf(i10));
                return;
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return;
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
                return;
            }
        }
        boolean isBlackColor = isBlackColor(i10, 50);
        if (mStatusBarColorFiled != null) {
            setStatusBarDarkIcon(activity, isBlackColor, isBlackColor);
            setStatusBarDarkIcon(activity.getWindow(), i10);
            return;
        }
        setStatusBarDarkIcon(activity, isBlackColor);
    }

    public static int toGrey(int i10) {
        int i11 = ((65280 & i10) >> 8) * 75;
        return (((i10 & FunctionEval.FunctionID.EXTERNAL_FUNC) * 15) + (i11 + (((i10 & 16711680) >> 16) * 38))) >> 7;
    }

    public static void setStatusBarDarkIcon(Window window, int i10) {
        try {
            setStatusBarColor(window, i10);
            setStatusBarDarkIcon(window.getDecorView(), true);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void setStatusBarDarkIcon(Activity activity, boolean z10) {
        setStatusBarDarkIcon(activity, z10, true);
    }

    private static void setStatusBarDarkIcon(View view, boolean z10) {
        int i10;
        int systemUiVisibility = view.getSystemUiVisibility();
        if (z10) {
            i10 = SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | systemUiVisibility;
        } else {
            i10 = (~SYSTEM_UI_FLAG_LIGHT_STATUS_BAR) & systemUiVisibility;
        }
        if (i10 != systemUiVisibility) {
            view.setSystemUiVisibility(i10);
        }
    }

    public static void setStatusBarDarkIcon(Window window, boolean z10) {
        setStatusBarDarkIcon(window.getDecorView(), z10);
        setStatusBarColor(window, 0);
    }

    private static void setStatusBarDarkIcon(Activity activity, boolean z10, boolean z11) {
        Method method = mSetStatusBarDarkIcon;
        if (method == null) {
            if (z11) {
                setStatusBarDarkIcon(activity.getWindow(), z10);
                return;
            }
            return;
        }
        try {
            method.invoke(activity, Boolean.valueOf(z10));
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        } catch (InvocationTargetException e11) {
            e11.printStackTrace();
        }
    }
}
