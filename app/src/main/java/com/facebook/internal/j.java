package com.facebook.internal;

import com.facebook.LoggingBehavior;
import java.util.HashMap;

/* compiled from: Logger.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: d  reason: collision with root package name */
    public static final a f9803d = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap<String, String> f9804e = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final LoggingBehavior f9805a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9806b;
    public StringBuilder c;

    /* compiled from: Logger.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(LoggingBehavior behavior, String tag, String string) {
            kotlin.jvm.internal.g.e(behavior, "behavior");
            kotlin.jvm.internal.g.e(tag, "tag");
            kotlin.jvm.internal.g.e(string, "string");
            c(behavior, tag, string);
        }

        public static void b(LoggingBehavior behavior, String tag, String str, Object... objArr) {
            kotlin.jvm.internal.g.e(behavior, "behavior");
            kotlin.jvm.internal.g.e(tag, "tag");
            com.facebook.d.h(behavior);
        }

        public static void c(LoggingBehavior behavior, String tag, String string) {
            kotlin.jvm.internal.g.e(behavior, "behavior");
            kotlin.jvm.internal.g.e(tag, "tag");
            kotlin.jvm.internal.g.e(string, "string");
            com.facebook.d.h(behavior);
        }

        public final synchronized void d(String original) {
            kotlin.jvm.internal.g.e(original, "original");
            j.f9804e.put(original, "ACCESS_TOKEN_REMOVED");
        }
    }

    public j(LoggingBehavior behavior) {
        kotlin.jvm.internal.g.e(behavior, "behavior");
        this.f9805a = behavior;
        q.d("Request", "tag");
        this.f9806b = "FacebookSDK.".concat("Request");
        this.c = new StringBuilder();
    }

    public final void a(Object value, String key) {
        kotlin.jvm.internal.g.e(key, "key");
        kotlin.jvm.internal.g.e(value, "value");
        c();
    }

    public final void b() {
        String sb2 = this.c.toString();
        kotlin.jvm.internal.g.d(sb2, "contents.toString()");
        a.c(this.f9805a, this.f9806b, sb2);
        this.c = new StringBuilder();
    }

    public final void c() {
        com.facebook.d.h(this.f9805a);
    }
}
