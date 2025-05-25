package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfmt implements zzfmm {
    private static zzfmt zza;
    private float zzb = 0.0f;
    private zzfmh zzc;
    private zzfml zzd;

    public zzfmt(zzfmi zzfmiVar, zzfmg zzfmgVar) {
    }

    public static zzfmt zzb() {
        if (zza == null) {
            zza = new zzfmt(new zzfmi(), new zzfmg());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfmm
    public final void zzc(boolean z10) {
        if (z10) {
            zzfnt.zzd().zzi();
        } else {
            zzfnt.zzd().zzh();
        }
    }

    public final void zzd(Context context) {
        this.zzc = new zzfmh(new Handler(), context, new zzfmf(), this);
    }

    public final void zze(float f10) {
        this.zzb = f10;
        if (this.zzd == null) {
            this.zzd = zzfml.zza();
        }
        for (zzflu zzfluVar : this.zzd.zzb()) {
            zzfluVar.zzg().zzl(f10);
        }
    }

    public final void zzf() {
        zzfmk.zza().zze(this);
        zzfmk.zza().zzf();
        zzfnt.zzd().zzi();
        this.zzc.zza();
    }

    public final void zzg() {
        zzfnt.zzd().zzj();
        zzfmk.zza().zzg();
        this.zzc.zzb();
    }
}
