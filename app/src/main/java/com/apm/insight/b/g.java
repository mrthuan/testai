package com.apm.insight.b;

import android.content.Context;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static volatile g f6372a;
    private static h c;

    /* renamed from: b  reason: collision with root package name */
    private final b f6373b;

    private g(Context context) {
        this.f6373b = new b(context);
        h hVar = new h(0);
        c = hVar;
        hVar.b();
    }

    public static h b() {
        return c;
    }

    public b a() {
        return this.f6373b;
    }

    public void c() {
        this.f6373b.a();
    }

    public void d() {
        this.f6373b.b();
    }

    public static g a(Context context) {
        if (f6372a == null) {
            synchronized (g.class) {
                if (f6372a == null) {
                    f6372a = new g(context);
                }
            }
        }
        return f6372a;
    }
}
