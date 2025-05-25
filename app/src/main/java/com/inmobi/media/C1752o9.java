package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.inmobi.media.o9  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1752o9 {

    /* renamed from: a  reason: collision with root package name */
    public final C1851w5 f15362a;

    public C1752o9(Context context, String sharePrefFile) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(sharePrefFile, "sharePrefFile");
        ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
        this.f15362a = AbstractC1838v5.a(context, sharePrefFile);
    }

    public final void a(String key, String value) {
        kotlin.jvm.internal.g.e(key, "key");
        kotlin.jvm.internal.g.e(value, "value");
        this.f15362a.a(key, value);
    }

    public final void b(String key, String value) {
        kotlin.jvm.internal.g.e(key, "key");
        kotlin.jvm.internal.g.e(value, "value");
        this.f15362a.a(key, value);
        a(System.currentTimeMillis() / 1000);
    }

    public final boolean c(String key) {
        kotlin.jvm.internal.g.e(key, "key");
        return this.f15362a.a(key);
    }

    public final void a(String key, boolean z10) {
        kotlin.jvm.internal.g.e(key, "key");
        this.f15362a.a(key, z10);
    }

    public final String a(String key) {
        kotlin.jvm.internal.g.e(key, "key");
        C1851w5 c1851w5 = this.f15362a;
        c1851w5.getClass();
        return c1851w5.f15579a.getString(key, null);
    }

    public final long b() {
        C1851w5 c1851w5 = this.f15362a;
        c1851w5.getClass();
        return c1851w5.f15579a.getLong("last_ts", 0L);
    }

    public final void a(long j10) {
        this.f15362a.a("last_ts", j10);
    }

    public final boolean b(String key) {
        kotlin.jvm.internal.g.e(key, "key");
        C1851w5 c1851w5 = this.f15362a;
        c1851w5.getClass();
        return c1851w5.f15579a.contains(key);
    }

    public final void a() {
        this.f15362a.b();
    }
}
