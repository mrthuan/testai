package c5;

import android.content.Context;

/* compiled from: AppUpgrade.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static volatile a f5562e;

    /* renamed from: b  reason: collision with root package name */
    public Context f5564b;
    public j c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f5563a = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5565d = false;

    public static a b() {
        if (f5562e == null) {
            synchronized (a.class) {
                if (f5562e == null) {
                    f5562e = new a();
                }
            }
        }
        return f5562e;
    }

    public final void a() {
        if (this.f5563a) {
            return;
        }
        throw new g5.a();
    }
}
