package com.iab.omid.library.inmobi.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes2.dex */
public class g {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b  reason: collision with root package name */
    private static g f13970b = new g();

    /* renamed from: a  reason: collision with root package name */
    private Context f13971a;

    private g() {
    }

    public static g b() {
        return f13970b;
    }

    public Context a() {
        return this.f13971a;
    }

    public void a(Context context) {
        this.f13971a = context != null ? context.getApplicationContext() : null;
    }
}
