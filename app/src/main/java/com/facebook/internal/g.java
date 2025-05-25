package com.facebook.internal;

/* compiled from: InstallReferrerUtil.kt */
/* loaded from: classes.dex */
public final class g {

    /* compiled from: InstallReferrerUtil.kt */
    /* loaded from: classes.dex */
    public interface a {
        void a(String str);
    }

    public static final void a() {
        com.facebook.d.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
}
