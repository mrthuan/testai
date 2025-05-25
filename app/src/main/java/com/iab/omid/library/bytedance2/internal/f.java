package com.iab.omid.library.bytedance2.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes2.dex */
public class f {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b  reason: collision with root package name */
    private static f f13861b = new f();

    /* renamed from: a  reason: collision with root package name */
    private Context f13862a;

    private f() {
    }

    public static f b() {
        return f13861b;
    }

    public Context a() {
        return this.f13862a;
    }

    public void a(Context context) {
        this.f13862a = context != null ? context.getApplicationContext() : null;
    }
}
