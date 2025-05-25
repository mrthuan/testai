package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzapk;
import com.google.android.gms.internal.ads.zzaqo;
import com.google.android.gms.internal.ads.zzbbw;
import java.util.HashMap;
import java.util.Map;
import m7.d;
import m7.e;
import m7.f;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzbo {

    /* renamed from: a  reason: collision with root package name */
    public static zzapk f10431a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f10432b = new Object();

    public zzbo(Context context) {
        zzapk zza;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f10432b) {
            try {
                if (f10431a == null) {
                    zzbbw.zza(context);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdW)).booleanValue()) {
                        zza = zzaz.a(context);
                    } else {
                        zza = zzaqo.zza(context, null);
                    }
                    f10431a = zza;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static f a(int i10, String str, HashMap hashMap, byte[] bArr) {
        f fVar = new f();
        d dVar = new d(str, fVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(0);
        e eVar = new e(i10, str, fVar, dVar, bArr, hashMap, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.c()) {
            try {
                Map zzl = eVar.zzl();
                if (bArr == null) {
                    bArr = null;
                }
                if (com.google.android.gms.ads.internal.util.client.zzl.c()) {
                    zzlVar.d("onNetworkRequest", new com.google.android.gms.ads.internal.util.client.zzg(str, "GET", zzl, bArr));
                }
            } catch (zzaop e10) {
                com.google.android.gms.ads.internal.util.client.zzm.e(e10.getMessage());
            }
        }
        f10431a.zza(eVar);
        return fVar;
    }
}
