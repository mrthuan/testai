package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public class MediationAdConfiguration {

    /* renamed from: a  reason: collision with root package name */
    public final String f10580a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f10581b;
    public final Bundle c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f10582d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10583e;

    /* renamed from: f  reason: collision with root package name */
    public final String f10584f;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TagForChildDirectedTreatment {
    }

    public MediationAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, int i10, String str2) {
        this.f10580a = str;
        this.f10581b = bundle;
        this.c = bundle2;
        this.f10582d = context;
        this.f10583e = i10;
        this.f10584f = str2;
    }
}
