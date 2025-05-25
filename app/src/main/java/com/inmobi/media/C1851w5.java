package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.inmobi.media.w5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1851w5 {

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap f15578b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f15579a;

    public C1851w5(Context context, String str) {
        this.f15579a = context.getSharedPreferences(str, 0);
    }

    public static final C1851w5 a(Context context, String str) {
        return AbstractC1838v5.a(context, str);
    }

    public final void b() {
        SharedPreferences.Editor edit = this.f15579a.edit();
        edit.clear();
        edit.apply();
    }

    public final boolean a(String key) {
        kotlin.jvm.internal.g.e(key, "key");
        if (this.f15579a.contains(key)) {
            SharedPreferences.Editor edit = this.f15579a.edit();
            edit.remove(key);
            edit.apply();
            return true;
        }
        return false;
    }

    public final void a(String key, String str) {
        kotlin.jvm.internal.g.e(key, "key");
        SharedPreferences.Editor edit = this.f15579a.edit();
        edit.putString(key, str);
        edit.apply();
    }

    public final void a(String key, int i10) {
        kotlin.jvm.internal.g.e(key, "key");
        SharedPreferences.Editor edit = this.f15579a.edit();
        edit.putInt(key, i10);
        edit.apply();
    }

    public final void a(String key, long j10) {
        kotlin.jvm.internal.g.e(key, "key");
        SharedPreferences.Editor edit = this.f15579a.edit();
        edit.putLong(key, j10);
        edit.apply();
    }

    public final void a(String key, boolean z10) {
        kotlin.jvm.internal.g.e(key, "key");
        SharedPreferences.Editor edit = this.f15579a.edit();
        edit.putBoolean(key, z10);
        edit.apply();
    }
}
