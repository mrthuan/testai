package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfgt {
    private final int zzb;
    private final int zzc;
    private final LinkedList zza = new LinkedList();
    private final zzfhs zzd = new zzfhs();

    public zzfgt(int i10, int i11) {
        this.zzb = i10;
        this.zzc = i11;
    }

    private final void zzi() {
        while (!this.zza.isEmpty()) {
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            if (System.currentTimeMillis() - ((zzfhd) this.zza.getFirst()).zzd >= this.zzc) {
                this.zzd.zzg();
                this.zza.remove();
            } else {
                return;
            }
        }
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        zzi();
        return this.zza.size();
    }

    public final long zzc() {
        return this.zzd.zzb();
    }

    public final long zzd() {
        return this.zzd.zzc();
    }

    public final zzfhd zze() {
        this.zzd.zzf();
        zzi();
        if (this.zza.isEmpty()) {
            return null;
        }
        zzfhd zzfhdVar = (zzfhd) this.zza.remove();
        if (zzfhdVar != null) {
            this.zzd.zzh();
        }
        return zzfhdVar;
    }

    public final zzfhr zzf() {
        return this.zzd.zzd();
    }

    public final String zzg() {
        return this.zzd.zze();
    }

    public final boolean zzh(zzfhd zzfhdVar) {
        this.zzd.zzf();
        zzi();
        if (this.zza.size() == this.zzb) {
            return false;
        }
        this.zza.add(zzfhdVar);
        return true;
    }
}
