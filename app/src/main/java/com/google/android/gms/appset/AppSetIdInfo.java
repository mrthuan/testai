package com.google.android.gms.appset;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes.dex */
public class AppSetIdInfo {

    /* renamed from: a  reason: collision with root package name */
    public final String f10793a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10794b;

    /* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Scope {
    }

    public AppSetIdInfo(String str, int i10) {
        this.f10793a = str;
        this.f10794b = i10;
    }
}
