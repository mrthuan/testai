package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfhq {
    private final zzfgu zza;
    private final zzfho zzb;
    private final zzfgq zzc;
    private zzfhw zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfhq(zzfgu zzfguVar, zzfgq zzfgqVar, zzfho zzfhoVar) {
        this.zza = zzfguVar;
        this.zzc = zzfgqVar;
        this.zzb = zzfhoVar;
        zzfgqVar.zzb(new zzfhl(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzfE)).booleanValue() && !com.google.android.gms.ads.internal.zzu.B.f10557g.zzi().zzh().zzh()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzfhp zzfhpVar = (zzfhp) this.zzd.pollFirst();
                if (zzfhpVar == null || (zzfhpVar.zza() != null && this.zza.zze(zzfhpVar.zza()))) {
                    zzfhw zzfhwVar = new zzfhw(this.zza, this.zzb, zzfhpVar);
                    this.zze = zzfhwVar;
                    zzfhwVar.zzd(new zzfhm(this, zzfhpVar));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        if (this.zze == null) {
            return true;
        }
        return false;
    }

    public final synchronized y9.a zza(zzfhp zzfhpVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zza(zzfhpVar);
    }

    public final synchronized void zze(zzfhp zzfhpVar) {
        this.zzd.add(zzfhpVar);
    }

    public final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
