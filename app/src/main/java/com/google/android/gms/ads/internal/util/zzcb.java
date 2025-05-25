package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import m7.i;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzcb {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f10443a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f10444b = new ArrayList();
    public final Context c;

    public zzcb(Context context) {
        this.c = context;
    }

    public final synchronized void a(String str) {
        SharedPreferences sharedPreferences;
        if (this.f10443a.containsKey(str)) {
            return;
        }
        if (Objects.equals(str, "__default__")) {
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.c);
        } else {
            sharedPreferences = this.c.getSharedPreferences(str, 0);
        }
        i iVar = new i(this, str);
        this.f10443a.put(str, iVar);
        sharedPreferences.registerOnSharedPreferenceChangeListener(iVar);
    }

    public final void b() {
        zzbbn zzbbnVar = zzbbw.zzjz;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (!((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            return;
        }
        zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        HashMap G = zzt.G((String) zzbaVar.c.zza(zzbbw.zzjE));
        for (String str : G.keySet()) {
            a(str);
        }
        zzbz zzbzVar = new zzbz(G);
        synchronized (this) {
            this.f10444b.add(zzbzVar);
        }
    }
}
