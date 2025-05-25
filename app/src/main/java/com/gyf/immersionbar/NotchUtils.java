package com.gyf.immersionbar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes2.dex */
public class NotchUtils {
    private static final String NOTCH_HUA_WEI = "com.huawei.android.util.HwNotchSizeUtil";
    private static final String NOTCH_LENOVO = "config_screen_has_notch";
    private static final String NOTCH_MEIZU = "flyme.config.FlymeFeature";
    private static final String NOTCH_OPPO = "com.oppo.feature.screen.heteromorphism";
    private static final String NOTCH_VIVO = "android.util.FtFeature";
    private static final String NOTCH_XIAO_MI = "ro.miui.notch";
    private static final String SYSTEM_PROPERTIES = "android.os.SystemProperties";

    private static int dp2px(Context context, int i10) {
        return (int) TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    private static DisplayCutout getDisplayCutout(Activity activity) {
        return getDisplayCutout(activity.getWindow().getDecorView());
    }

    private static int[] getHuaWeiNotchSize(Context context) {
        int[] iArr = {0, 0};
        try {
            Class<?> loadClass = context.getClassLoader().loadClass(NOTCH_HUA_WEI);
            return (int[]) loadClass.getMethod("getNotchSize", new Class[0]).invoke(loadClass, new Object[0]);
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return iArr;
        }
    }

    private static int getLenovoNotchHeight(Context context) {
        int identifier = context.getResources().getIdentifier("notch_h", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private static int getMeizuNotchHeight(Context context) {
        int identifier = context.getResources().getIdentifier("fringe_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
        if (80 < r0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getNotchHeight(android.app.Activity r6) {
        /*
            boolean r0 = hasNotchScreen(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.gyf.immersionbar.a r0 = new com.gyf.immersionbar.a
            r0.<init>(r6)
            android.view.DisplayCutout r2 = getDisplayCutout(r6)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            r5 = 1
            if (r3 < r4) goto L3b
            if (r2 == 0) goto L3b
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.orientation
            if (r6 != r5) goto L2b
            int r6 = androidx.window.layout.f.c(r2)
            goto L84
        L2b:
            int r6 = androidx.window.layout.e.b(r2)
            if (r6 != 0) goto L36
            int r6 = androidx.window.layout.g.b(r2)
            goto L84
        L36:
            int r6 = androidx.window.layout.e.b(r2)
            goto L84
        L3b:
            boolean r2 = hasNotchAtXiaoMi(r6)
            if (r2 == 0) goto L45
            int r1 = getXiaoMiNotchHeight(r6)
        L45:
            boolean r2 = hasNotchAtHuaWei(r6)
            if (r2 == 0) goto L51
            int[] r1 = getHuaWeiNotchSize(r6)
            r1 = r1[r5]
        L51:
            boolean r2 = hasNotchAtVIVO(r6)
            int r0 = r0.f13750a
            if (r2 == 0) goto L62
            r1 = 32
            int r1 = dp2px(r6, r1)
            if (r1 >= r0) goto L62
            r1 = r0
        L62:
            boolean r2 = hasNotchAtOPPO(r6)
            if (r2 == 0) goto L6d
            r1 = 80
            if (r1 >= r0) goto L6d
            goto L6e
        L6d:
            r0 = r1
        L6e:
            boolean r1 = hasNotchAtLenovo(r6)
            if (r1 == 0) goto L78
            int r0 = getLenovoNotchHeight(r6)
        L78:
            boolean r1 = hasNotchAtMeiZu()
            if (r1 == 0) goto L83
            int r6 = getMeizuNotchHeight(r6)
            goto L84
        L83:
            r6 = r0
        L84:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gyf.immersionbar.NotchUtils.getNotchHeight(android.app.Activity):int");
    }

    private static int getXiaoMiNotchHeight(Context context) {
        int identifier = context.getResources().getIdentifier("notch_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private static boolean hasNotchAtAndroidP(View view) {
        return getDisplayCutout(view) != null;
    }

    @SuppressLint({"PrivateApi"})
    private static boolean hasNotchAtHuaWei(Context context) {
        if (!OSUtils.isHuaWei()) {
            return false;
        }
        try {
            Class<?> loadClass = context.getClassLoader().loadClass(NOTCH_HUA_WEI);
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    private static boolean hasNotchAtLenovo(Context context) {
        int identifier;
        if (OSUtils.isLenovo() && (identifier = context.getResources().getIdentifier(NOTCH_LENOVO, "bool", "android")) > 0) {
            return context.getResources().getBoolean(identifier);
        }
        return false;
    }

    private static boolean hasNotchAtMeiZu() {
        if (OSUtils.isMeizu()) {
            try {
                return ((Boolean) Class.forName(NOTCH_MEIZU).getDeclaredField("IS_FRINGE_DEVICE").get(null)).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private static boolean hasNotchAtOPPO(Context context) {
        if (OSUtils.isOppo()) {
            try {
                return context.getPackageManager().hasSystemFeature(NOTCH_OPPO);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @SuppressLint({"PrivateApi"})
    private static boolean hasNotchAtVIVO(Context context) {
        if (!OSUtils.isVivo()) {
            return false;
        }
        try {
            Class<?> loadClass = context.getClassLoader().loadClass(NOTCH_VIVO);
            return ((Boolean) loadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(loadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"PrivateApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean hasNotchAtXiaoMi(android.content.Context r6) {
        /*
            boolean r0 = com.gyf.immersionbar.OSUtils.isXiaoMi()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3c
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r6 = r6.loadClass(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = "getInt"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r2] = r5     // Catch: java.lang.Throwable -> L3c
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L3c
            r4[r1] = r5     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Method r0 = r6.getMethod(r0, r4)     // Catch: java.lang.Throwable -> L3c
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = "ro.miui.notch"
            r3[r2] = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L3c
            r3[r1] = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r6 = r0.invoke(r6, r3)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L3c
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L3c
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L3c
            goto L3d
        L3c:
            r6 = r2
        L3d:
            if (r6 != r1) goto L40
            goto L41
        L40:
            r1 = r2
        L41:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gyf.immersionbar.NotchUtils.hasNotchAtXiaoMi(android.content.Context):boolean");
    }

    public static boolean hasNotchScreen(Activity activity) {
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return hasNotchAtAndroidP(activity);
            }
            return hasNotchAtXiaoMi(activity) || hasNotchAtHuaWei(activity) || hasNotchAtOPPO(activity) || hasNotchAtVIVO(activity) || hasNotchAtLenovo(activity) || hasNotchAtMeiZu();
        }
        return false;
    }

    private static DisplayCutout getDisplayCutout(View view) {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        if (Build.VERSION.SDK_INT < 28 || view == null || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return null;
        }
        displayCutout = rootWindowInsets.getDisplayCutout();
        return displayCutout;
    }

    private static boolean hasNotchAtAndroidP(Activity activity) {
        return getDisplayCutout(activity) != null;
    }

    public static boolean hasNotchScreen(View view) {
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return hasNotchAtAndroidP(view);
            }
            return hasNotchAtXiaoMi(view.getContext()) || hasNotchAtHuaWei(view.getContext()) || hasNotchAtOPPO(view.getContext()) || hasNotchAtVIVO(view.getContext());
        }
        return false;
    }

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f13749a;

        public a(Activity activity) {
            this.f13749a = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    public static void getNotchHeight(Activity activity, k kVar) {
        activity.getWindow().getDecorView().post(new a(activity));
    }
}
