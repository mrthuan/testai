package eo;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;

/* compiled from: RateSpUtil.java */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<SharedPreferences> f16832a;

    public static boolean a(Context context, Boolean bool) {
        if (bool != null) {
            t(context, ea.a.p("KmQRdBthMGUYZGY=", "JlOxHFYN"), bool.booleanValue());
        } else {
            bool = Boolean.valueOf(b(context, ea.a.p("VmQidCBhFGUiZGY=", "zY8BuB5V")));
        }
        return bool.booleanValue();
    }

    public static boolean b(Context context, String str) {
        try {
            return i(context).getBoolean(str, false);
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static int c(Context context) {
        return d(context, 0, ea.a.p("LGQldCtzGXYtXxZkUl80b01udA==", "T7ILtxMG"));
    }

    public static int d(Context context, int i10, String str) {
        try {
            return i(context).getInt(str, i10);
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    public static long e(Context context) {
        try {
            return i(context).getLong(ea.a.p("PWFFZSZ0Xm1l", "Gfb8WcVP"), 0L);
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1L;
        }
    }

    public static int f(Context context) {
        return d(context, 0, ea.a.p("XHAubixhEnAtY1t1B3QJdy10Wl8ncDNfQWk0Z1V0", "6P0XezQ7"));
    }

    public static int g(Context context) {
        return d(context, 0, ea.a.p("DXAPbmthAXA=", "dQbj4qPD"));
    }

    public static int h(Context context) {
        return d(context, 0, ea.a.p("QWE_ZSxjDXUcdA==", "eGcRDPak"));
    }

    public static SharedPreferences i(Context context) {
        SharedPreferences sharedPreferences;
        WeakReference<SharedPreferences> weakReference = f16832a;
        if (weakReference != null) {
            sharedPreferences = weakReference.get();
        } else {
            sharedPreferences = null;
        }
        if (sharedPreferences == null) {
            SharedPreferences sharedPreferences2 = context.getSharedPreferences(ea.a.p("QWE-ZQ==", "Ug3J96nH"), 0);
            f16832a = new WeakReference<>(sharedPreferences2);
            return sharedPreferences2;
        }
        return sharedPreferences;
    }

    public static int j(Context context) {
        return d(context, 0, ea.a.p("PGhQchxfR2Q8XylvAG50", "t2RPUg4A"));
    }

    public static int k(Context context) {
        return d(context, 0, ea.a.p("RWkudyxwBmYtY1t1B3Q=", "2wWKV0R5"));
    }

    public static boolean l(Context context) {
        return b(context, ea.a.p("PWEFZQt1cw==", "uiOqTCqy"));
    }

    public static boolean m(Context context, Boolean bool) {
        if (bool != null) {
            t(context, ea.a.p("XHAubjJwcA==", "U47gtT0t"), bool.booleanValue());
        } else {
            bool = Boolean.valueOf(b(context, ea.a.p("J3AdbjdwcA==", "diHxvW7M")));
        }
        return bool.booleanValue();
    }

    public static void n(Context context, int i10) {
        if (!pdf.pdfreader.viewer.editor.free.utils.extension.c.g(context)) {
            return;
        }
        u(context, i10, ea.a.p("VmQidCxzA3YXX0RkD181bzFudA==", "HwHiaFQq"));
    }

    public static void o(Context context, long j10) {
        try {
            i(context).edit().putLong(ea.a.p("K2E9ZWd0X21l", "e9YI86DQ"), j10).apply();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void p(Context context, int i10) {
        if (!pdf.pdfreader.viewer.editor.free.utils.extension.c.g(context)) {
            return;
        }
        u(context, i10, ea.a.p("XHAubixhEnAtY1t1B3QJdy10Wl8ncDNfQmkQZyB0", "5tE6t06q"));
    }

    public static void q(Context context, int i10) {
        if (!pdf.pdfreader.viewer.editor.free.utils.extension.c.g(context)) {
            return;
        }
        u(context, i10, ea.a.p("IHBUbiZhR3A=", "ZpewyPWk"));
    }

    public static void r(Context context, int i10) {
        if (!pdf.pdfreader.viewer.editor.free.utils.extension.c.g(context)) {
            return;
        }
        u(context, i10, ea.a.p("QGgqchZfEmQUX1dvHG50", "U31Sqbfw"));
    }

    public static void s(Context context, int i10) {
        if (!pdf.pdfreader.viewer.editor.free.utils.extension.c.g(context)) {
            return;
        }
        u(context, i10, ea.a.p("OWlUdyZwU2YFYyV1G3Q=", "lXEvpAwW"));
    }

    public static void t(Context context, String str, boolean z10) {
        try {
            i(context).edit().putBoolean(str, z10).apply();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void u(Context context, int i10, String str) {
        try {
            i(context).edit().putInt(str, i10).apply();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static boolean v(Context context, Boolean bool) {
        if (bool != null) {
            t(context, ea.a.p("QGgqchZQBmY=", "eu648d0R"), bool.booleanValue());
        } else {
            bool = Boolean.valueOf(b(context, ea.a.p("PGhQchxQU2Y=", "1B1K3mT6")));
        }
        return bool.booleanValue();
    }

    public static boolean w(Context context, Boolean bool) {
        if (bool != null) {
            t(context, ea.a.p("EWgFdzJpLXcYZGY=", "sybjdHcc"), bool.booleanValue());
        } else {
            bool = Boolean.valueOf(b(context, ea.a.p("QGgkdyVpB3ciZGY=", "g6UrOSrj")));
        }
        return bool.booleanValue();
    }
}
