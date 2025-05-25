package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbbc;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdgy implements zzcye, com.google.android.gms.ads.internal.overlay.zzp, zzcxk {
    zzeeo zza;
    private final Context zzb;
    private final zzcej zzc;
    private final zzfel zzd;
    private final VersionInfoParcel zze;
    private final zzbbc.zza.EnumC0157zza zzf;
    private final zzeem zzg;

    public zzdgy(Context context, zzcej zzcejVar, zzfel zzfelVar, VersionInfoParcel versionInfoParcel, zzbbc.zza.EnumC0157zza enumC0157zza, zzeem zzeemVar) {
        this.zzb = context;
        this.zzc = zzcejVar;
        this.zzd = zzfelVar;
        this.zze = versionInfoParcel;
        this.zzf = enumC0157zza;
        this.zzg = zzeemVar;
    }

    private final boolean zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeC)).booleanValue() && this.zzg.zzd()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeG)).booleanValue() && this.zzc != null) {
            if (this.zza != null || zzg()) {
                if (this.zza != null) {
                    this.zzc.zzd("onSdkImpression", new y.b());
                } else {
                    this.zzg.zzb();
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i10) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzcxk
    public final void zzr() {
        if (zzg()) {
            this.zzg.zzb();
        } else if (this.zza != null && this.zzc != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeG)).booleanValue()) {
                this.zzc.zzd("onSdkImpression", new y.b());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzs() {
        VersionInfoParcel versionInfoParcel;
        zzeel zzeelVar;
        zzeel zzeelVar2;
        zzeek zzeekVar;
        zzbbc.zza.EnumC0157zza enumC0157zza;
        zzbbn zzbbnVar = zzbbw.zzeJ;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if ((((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() || (enumC0157zza = this.zzf) == zzbbc.zza.EnumC0157zza.REWARD_BASED_VIDEO_AD || enumC0157zza == zzbbc.zza.EnumC0157zza.INTERSTITIAL || enumC0157zza == zzbbc.zza.EnumC0157zza.APP_OPEN) && this.zzd.zzT && this.zzc != null) {
            Context context = this.zzb;
            com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
            if (zzuVar.f10573w.zzl(context)) {
                if (zzg()) {
                    this.zzg.zzc();
                    return;
                }
                String str = this.zze.f10346b + "." + versionInfoParcel.c;
                zzffj zzffjVar = this.zzd.zzV;
                String zza = zzffjVar.zza();
                if (zzffjVar.zzc() == 1) {
                    zzeekVar = zzeek.VIDEO;
                    zzeelVar2 = zzeel.DEFINED_BY_JAVASCRIPT;
                } else {
                    if (this.zzd.zzY == 2) {
                        zzeelVar = zzeel.UNSPECIFIED;
                    } else {
                        zzeelVar = zzeel.BEGIN_TO_RENDER;
                    }
                    zzeelVar2 = zzeelVar;
                    zzeekVar = zzeek.HTML_DISPLAY;
                }
                zzeeo zza2 = zzuVar.f10573w.zza(str, this.zzc.zzG(), "", "javascript", zza, zzeelVar2, zzeekVar, this.zzd.zzal);
                this.zza = zza2;
                zzcej zzcejVar = this.zzc;
                if (zza2 != null) {
                    zzflq zza3 = zza2.zza();
                    boolean booleanValue = ((Boolean) zzbaVar.c.zza(zzbbw.zzeB)).booleanValue();
                    zzeei zzeeiVar = zzuVar.f10573w;
                    if (booleanValue) {
                        zzeeiVar.zzj(zza3, this.zzc.zzG());
                        for (View view : this.zzc.zzV()) {
                            com.google.android.gms.ads.internal.zzu.B.f10573w.zzg(zza3, view);
                        }
                    } else {
                        zzeeiVar.zzj(zza3, (View) zzcejVar);
                    }
                    this.zzc.zzat(this.zza);
                    com.google.android.gms.ads.internal.zzu.B.f10573w.zzk(zza3);
                    this.zzc.zzd("onSdkLoaded", new y.b());
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
    }
}
