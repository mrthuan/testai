package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzflu extends zzflq {
    private final zzfls zza;
    private zzfoa zzc;
    private zzfmz zzd;
    private final String zzg;
    private final zzfmp zzb = new zzfmp();
    private boolean zze = false;
    private boolean zzf = false;

    public zzflu(zzflr zzflrVar, zzfls zzflsVar, String str) {
        this.zza = zzflsVar;
        this.zzg = str;
        zzk(null);
        if (zzflsVar.zzd() != zzflt.HTML && zzflsVar.zzd() != zzflt.JAVASCRIPT) {
            this.zzd = new zzfnd(str, zzflsVar.zzi(), null);
        } else {
            this.zzd = new zzfna(str, zzflsVar.zza());
        }
        this.zzd.zzn();
        zzfml.zza().zzd(this);
        this.zzd.zzf(zzflrVar);
    }

    private final void zzk(View view) {
        this.zzc = new zzfoa(view);
    }

    @Override // com.google.android.gms.internal.ads.zzflq
    public final void zzb(View view, zzflx zzflxVar, String str) {
        if (this.zzf) {
            return;
        }
        this.zzb.zzb(view, zzflxVar, "Ad overlay");
    }

    @Override // com.google.android.gms.internal.ads.zzflq
    public final void zzc() {
        if (this.zzf) {
            return;
        }
        this.zzc.clear();
        if (!this.zzf) {
            this.zzb.zzc();
        }
        this.zzf = true;
        this.zzd.zze();
        zzfml.zza().zze(this);
        this.zzd.zzc();
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzflq
    public final void zzd(View view) {
        if (!this.zzf && zzf() != view) {
            zzk(view);
            this.zzd.zzb();
            Collection<zzflu> zzc = zzfml.zza().zzc();
            if (zzc != null && !zzc.isEmpty()) {
                for (zzflu zzfluVar : zzc) {
                    if (zzfluVar != this && zzfluVar.zzf() == view) {
                        zzfluVar.zzc.clear();
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflq
    public final void zze() {
        if (this.zze) {
            return;
        }
        this.zze = true;
        zzfml.zza().zzf(this);
        this.zzd.zzl(zzfmt.zzb().zza());
        this.zzd.zzg(zzfmj.zza().zzb());
        this.zzd.zzi(this, this.zza);
    }

    public final View zzf() {
        return (View) this.zzc.get();
    }

    public final zzfmz zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zzb.zza();
    }

    public final boolean zzj() {
        if (this.zze && !this.zzf) {
            return true;
        }
        return false;
    }
}
