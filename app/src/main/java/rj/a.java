package rj;

import android.view.View;

/* compiled from: OnSafeClickListener.java */
/* loaded from: classes3.dex */
public abstract class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static long f29615a;

    /* renamed from: b  reason: collision with root package name */
    public static int f29616b;

    public static boolean a(int i10, long j10) {
        System.currentTimeMillis();
        if (f29616b != i10) {
            f29615a = 0L;
        }
        f29616b = i10;
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - f29615a;
        if (j11 < j10 && j11 >= 0) {
            return true;
        }
        System.currentTimeMillis();
        f29615a = currentTimeMillis;
        return false;
    }
}
