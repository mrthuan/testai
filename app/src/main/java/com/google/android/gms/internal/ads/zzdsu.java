package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdsu {
    private final String zze;
    private final zzdsp zzf;
    private final List zzb = new ArrayList();
    private boolean zzc = false;
    private boolean zzd = false;
    private final com.google.android.gms.ads.internal.util.zzg zza = com.google.android.gms.ads.internal.zzu.B.f10557g.zzi();

    public zzdsu(String str, zzdsp zzdspVar) {
        this.zze = str;
        this.zzf = zzdspVar;
    }

    private final Map zzg() {
        String str;
        Map zza = this.zzf.zza();
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        zza.put("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        if (this.zza.zzS()) {
            str = "";
        } else {
            str = this.zze;
        }
        zza.put("tid", str);
        return zza;
    }

    public final synchronized void zza(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbP)).booleanValue()) {
            return;
        }
        Map zzg = zzg();
        zzg.put("action", "aaia");
        zzg.put("aair", "MalformedJson");
        this.zzb.add(zzg);
    }

    public final synchronized void zzb(String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbP)).booleanValue()) {
            return;
        }
        Map zzg = zzg();
        zzg.put("action", "adapter_init_finished");
        zzg.put("ancn", str);
        zzg.put("rqe", str2);
        this.zzb.add(zzg);
    }

    public final synchronized void zzc(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbP)).booleanValue()) {
            return;
        }
        Map zzg = zzg();
        zzg.put("action", "adapter_init_started");
        zzg.put("ancn", str);
        this.zzb.add(zzg);
    }

    public final synchronized void zzd(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbP)).booleanValue()) {
            return;
        }
        Map zzg = zzg();
        zzg.put("action", "adapter_init_finished");
        zzg.put("ancn", str);
        this.zzb.add(zzg);
    }

    public final synchronized void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbP)).booleanValue() && !this.zzd) {
            Map zzg = zzg();
            zzg.put("action", "init_finished");
            this.zzb.add(zzg);
            for (Map map : this.zzb) {
                this.zzf.zzf(map);
            }
            this.zzd = true;
        }
    }

    public final synchronized void zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbP)).booleanValue() && !this.zzc) {
            Map zzg = zzg();
            zzg.put("action", "init_started");
            this.zzb.add(zzg);
            this.zzc = true;
        }
    }
}
