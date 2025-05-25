package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import bb.k;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbw;
import java.util.WeakHashMap;
import m7.j;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzci {

    /* renamed from: d  reason: collision with root package name */
    public boolean f10452d;

    /* renamed from: e  reason: collision with root package name */
    public Context f10453e;
    public boolean c = false;

    /* renamed from: b  reason: collision with root package name */
    public final WeakHashMap f10451b = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final j f10450a = new j(this);

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void a(Context context) {
        if (this.c) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.f10453e = applicationContext;
        if (applicationContext == null) {
            this.f10453e = context;
        }
        zzbbw.zza(this.f10453e);
        zzbbn zzbbnVar = zzbbw.zzdv;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        this.f10452d = ((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        if (((Boolean) zzbaVar.c.zza(zzbbw.zzkb)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            k.m(this.f10453e, this.f10450a, intentFilter);
        } else {
            this.f10453e.registerReceiver(this.f10450a, intentFilter);
        }
        this.c = true;
    }

    public final synchronized void b(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f10452d) {
            this.f10451b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
