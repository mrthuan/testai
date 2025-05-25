package com.inmobi.media;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class Ia {

    /* renamed from: a  reason: collision with root package name */
    public static final Ia f14348a = new Ia();

    /* renamed from: b  reason: collision with root package name */
    public static String f14349b = null;
    public static String c = "dir";

    public static final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c = str;
    }

    public static /* synthetic */ void b() {
    }

    public static final String c() {
        return "10.7.8";
    }

    public static final String d() {
        return c;
    }

    public static final String f() {
        return f14349b;
    }

    public static final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f14349b = str;
    }

    public static final String a() {
        return !TextUtils.isEmpty("") ? "pr-SAND-10.7.8-20241004-" : "pr-SAND-10.7.8-20241004";
    }

    public final String a(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
        return AbstractC1838v5.a(context, "sdk_version_store").f15579a.getString("sdk_version", null);
    }

    public final boolean b(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
        return AbstractC1838v5.a(context, "sdk_version_store").f15579a.getBoolean("db_deletion_failed", false);
    }

    public final void a(Context context, String str) {
        kotlin.jvm.internal.g.e(context, "context");
        ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
        AbstractC1838v5.a(context, "sdk_version_store").a("sdk_version", str);
    }

    public final void a(Context context, boolean z10) {
        kotlin.jvm.internal.g.e(context, "context");
        ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
        AbstractC1838v5.a(context, "sdk_version_store").a("db_deletion_failed", z10);
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void g() {
    }
}
