package nj;

import android.os.Looper;

/* compiled from: Util.java */
/* loaded from: classes3.dex */
public final class b {
    static {
        "0123456789abcdef".toCharArray();
    }

    public static void a() {
        boolean z10;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }
}
