package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbsk;
import com.google.android.gms.internal.ads.zzbts;
import k7.d;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzaw {

    /* renamed from: a  reason: collision with root package name */
    public final zzk f10102a;

    /* renamed from: b  reason: collision with root package name */
    public final zzi f10103b;
    public final zzeq c;

    /* renamed from: d  reason: collision with root package name */
    public final zzbhc f10104d;

    /* renamed from: e  reason: collision with root package name */
    public final zzbsk f10105e;

    /* renamed from: f  reason: collision with root package name */
    public zzbts f10106f;

    public zzaw(zzk zzkVar, zzi zziVar, zzeq zzeqVar, zzbhc zzbhcVar, zzbsk zzbskVar) {
        this.f10102a = zzkVar;
        this.f10103b = zziVar;
        this.c = zzeqVar;
        this.f10104d = zzbhcVar;
        this.f10105e = zzbskVar;
    }

    public static zzbsg a(Context context, zzboi zzboiVar) {
        return (zzbsg) new d(context, zzboiVar).d(context, false);
    }

    public static void b(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzay zzayVar = zzay.f10107f;
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = zzayVar.f10108a;
        String str2 = zzayVar.f10110d.f10345a;
        zzfVar.getClass();
        com.google.android.gms.ads.internal.util.client.zzf.n(context, str2, bundle, new com.google.android.gms.ads.internal.util.client.zzc(zzfVar));
    }
}
