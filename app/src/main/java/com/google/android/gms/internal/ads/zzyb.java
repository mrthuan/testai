package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzyb {
    private zzya zza;
    private zzyj zzb;

    public zzlg zze() {
        throw null;
    }

    public void zzj() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzk(zzh zzhVar) {
        throw null;
    }

    public boolean zzn() {
        throw null;
    }

    public abstract zzyc zzo(zzlh[] zzlhVarArr, zzwi zzwiVar, zzui zzuiVar, zzcc zzccVar);

    public abstract void zzp(Object obj);

    public final zzyj zzq() {
        zzyj zzyjVar = this.zzb;
        zzdi.zzb(zzyjVar);
        return zzyjVar;
    }

    public final void zzr(zzya zzyaVar, zzyj zzyjVar) {
        this.zza = zzyaVar;
        this.zzb = zzyjVar;
    }

    public final void zzs() {
        zzya zzyaVar = this.zza;
        if (zzyaVar != null) {
            zzyaVar.zzi();
        }
    }
}
