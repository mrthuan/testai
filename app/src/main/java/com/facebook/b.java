package com.facebook;

import android.content.SharedPreferences;

/* compiled from: AccessTokenCache.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f9674a;

    /* compiled from: AccessTokenCache.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public b() {
        SharedPreferences sharedPreferences = d.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        kotlin.jvm.internal.g.d(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
        new a();
        this.f9674a = sharedPreferences;
    }
}
