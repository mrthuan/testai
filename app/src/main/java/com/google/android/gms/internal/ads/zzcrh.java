package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcrh implements zzcye, zzcxk {
    private final Context zza;
    private final zzcej zzb;
    private final zzfel zzc;
    private final VersionInfoParcel zzd;
    private zzeeo zze;
    private boolean zzf;
    private final zzeem zzg;

    public zzcrh(Context context, zzcej zzcejVar, zzfel zzfelVar, VersionInfoParcel versionInfoParcel, zzeem zzeemVar) {
        this.zza = context;
        this.zzb = zzcejVar;
        this.zzc = zzfelVar;
        this.zzd = versionInfoParcel;
        this.zzg = zzeemVar;
    }

    private final synchronized void zza() {
        zzeel zzeelVar;
        zzeel zzeelVar2;
        zzeek zzeekVar;
        if (this.zzc.zzT && this.zzb != null) {
            Context context = this.zza;
            com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
            if (zzuVar.f10573w.zzl(context)) {
                VersionInfoParcel versionInfoParcel = this.zzd;
                String str = versionInfoParcel.f10346b + "." + versionInfoParcel.c;
                zzffj zzffjVar = this.zzc.zzV;
                String zza = zzffjVar.zza();
                if (zzffjVar.zzc() == 1) {
                    zzeekVar = zzeek.VIDEO;
                    zzeelVar2 = zzeel.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzfel zzfelVar = this.zzc;
                    zzeek zzeekVar2 = zzeek.HTML_DISPLAY;
                    if (zzfelVar.zze == 1) {
                        zzeelVar = zzeel.ONE_PIXEL;
                    } else {
                        zzeelVar = zzeel.BEGIN_TO_RENDER;
                    }
                    zzeelVar2 = zzeelVar;
                    zzeekVar = zzeekVar2;
                }
                zzeeo zza2 = zzuVar.f10573w.zza(str, this.zzb.zzG(), "", "javascript", zza, zzeelVar2, zzeekVar, this.zzc.zzal);
                this.zze = zza2;
                zzcej zzcejVar = this.zzb;
                if (zza2 != null) {
                    zzflq zza3 = zza2.zza();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeB)).booleanValue()) {
                        zzuVar.f10573w.zzj(zza3, this.zzb.zzG());
                        for (View view : this.zzb.zzV()) {
                            com.google.android.gms.ads.internal.zzu.B.f10573w.zzg(zza3, view);
                        }
                    } else {
                        zzuVar.f10573w.zzj(zza3, (View) zzcejVar);
                    }
                    this.zzb.zzat(this.zze);
                    com.google.android.gms.ads.internal.zzu.B.f10573w.zzk(zza3);
                    this.zzf = true;
                    this.zzb.zzd("onSdkLoaded", new y.b());
                }
            }
        }
    }

    private final boolean zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeC)).booleanValue() && this.zzg.zzd()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcxk
    public final synchronized void zzr() {
        zzcej zzcejVar;
        if (zzb()) {
            this.zzg.zzb();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (this.zzc.zzT && this.zze != null && (zzcejVar = this.zzb) != null) {
            zzcejVar.zzd("onSdkImpression", new y.b());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final synchronized void zzs() {
        if (zzb()) {
            this.zzg.zzc();
        } else if (this.zzf) {
        } else {
            zza();
        }
    }
}
