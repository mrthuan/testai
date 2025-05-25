package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzdss {
    protected final Map zza;
    protected final Context zzb;
    protected final Executor zzc;
    protected final com.google.android.gms.ads.internal.util.client.zzr zzd;
    protected final boolean zze;
    private final CsiUrlBuilder zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final AtomicBoolean zzi;
    private final AtomicReference zzj;

    public zzdss(Executor executor, com.google.android.gms.ads.internal.util.client.zzr zzrVar, CsiUrlBuilder csiUrlBuilder, Context context) {
        String str = (String) zzbdm.zza.zze();
        this.zza = new HashMap();
        this.zzi = new AtomicBoolean();
        this.zzj = new AtomicReference(new Bundle());
        this.zzc = executor;
        this.zzd = zzrVar;
        zzbbn zzbbnVar = zzbbw.zzbN;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        this.zze = ((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue();
        this.zzf = csiUrlBuilder;
        this.zzg = ((Boolean) zzbaVar.c.zza(zzbbw.zzbQ)).booleanValue();
        this.zzh = ((Boolean) zzbaVar.c.zza(zzbbw.zzgp)).booleanValue();
        this.zzb = context;
    }

    private final void zza(Map map, boolean z10) {
        Bundle a10;
        if (!map.isEmpty()) {
            if (map.isEmpty()) {
                com.google.android.gms.ads.internal.util.client.zzm.b("Empty or null paramMap.");
            } else {
                if (!this.zzi.getAndSet(true)) {
                    final String str = (String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjF);
                    Context context = this.zzb;
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.zzdsr
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                            zzdss.this.zzd(str, sharedPreferences, str2);
                        }
                    };
                    if (TextUtils.isEmpty(str)) {
                        a10 = Bundle.EMPTY;
                    } else {
                        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                        a10 = com.google.android.gms.ads.internal.util.zzad.a(context, str);
                    }
                    this.zzj.set(a10);
                }
                Bundle bundle = (Bundle) this.zzj.get();
                for (String str2 : bundle.keySet()) {
                    map.put(str2, String.valueOf(bundle.get(str2)));
                }
            }
            final String a11 = this.zzf.a(map);
            com.google.android.gms.ads.internal.util.zze.h(a11);
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
            if (this.zze) {
                if (!z10 || this.zzg) {
                    if (!parseBoolean || this.zzh) {
                        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsq
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdss.this.zzd.zza(a11);
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.b("Empty paramMap.");
    }

    public final String zzb(Map map) {
        return this.zzf.a(map);
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.zza);
    }

    public final /* synthetic */ void zzd(String str, SharedPreferences sharedPreferences, String str2) {
        this.zzj.set(com.google.android.gms.ads.internal.util.zzad.a(this.zzb, str));
    }

    public final void zze(Map map) {
        zza(map, true);
    }

    public final void zzf(Map map) {
        zza(map, false);
    }
}
