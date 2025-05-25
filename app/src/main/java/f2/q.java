package f2;

import android.os.Build;

/* compiled from: TransitionUtils.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f17073a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f17074b;
    public static final boolean c;

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        f17073a = true;
        f17074b = true;
        if (i10 < 28) {
            z10 = false;
        }
        c = z10;
    }
}
