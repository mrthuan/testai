package com.google.android.gms.common.internal;

import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void a(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    @KeepForSdk
    public static void b(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException();
    }

    @KeepForSdk
    public static void c(com.google.android.gms.internal.base.zau zauVar) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != zauVar.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            throw new IllegalStateException(a0.d.d("Must be called on ", zauVar.getLooper().getThread().getName(), " thread, but got ", str, "."));
        }
    }

    @KeepForSdk
    public static void d(com.google.android.gms.internal.base.zau zauVar, String str) {
        if (Looper.myLooper() == zauVar.getLooper()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    @KeepForSdk
    public static void e(String str) {
        boolean z10;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalStateException(str);
    }

    @KeepForSdk
    public static void f(String str) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    @KeepForSdk
    public static void g(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    @KeepForSdk
    public static void h() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            String name = myLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
            }
        }
    }

    @KeepForSdk
    public static void i(String str) {
        boolean z10;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        throw new IllegalStateException(str);
    }

    @KeepForSdk
    public static void j(Object obj) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException("null reference");
    }

    @KeepForSdk
    public static void k(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    @KeepForSdk
    public static void l(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalStateException(String.valueOf(str));
    }

    @KeepForSdk
    public static void m(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalStateException();
    }
}
