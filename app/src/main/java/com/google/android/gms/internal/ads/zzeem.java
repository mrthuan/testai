package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeem {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzfel zzc;
    private final zzcej zzd;
    private zzfmb zze;

    public zzeem(Context context, VersionInfoParcel versionInfoParcel, zzfel zzfelVar, zzcej zzcejVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzfelVar;
        this.zzd = zzcejVar;
    }

    public final synchronized void zza(View view) {
        zzfmb zzfmbVar = this.zze;
        if (zzfmbVar != null) {
            com.google.android.gms.ads.internal.zzu.B.f10573w.zzh(zzfmbVar, view);
        }
    }

    public final synchronized void zzb() {
        zzcej zzcejVar;
        if (this.zze != null && (zzcejVar = this.zzd) != null) {
            zzcejVar.zzd("onSdkImpression", zzfxu.zzd());
        }
    }

    public final synchronized void zzc() {
        zzcej zzcejVar;
        zzfmb zzfmbVar = this.zze;
        if (zzfmbVar != null && (zzcejVar = this.zzd) != null) {
            for (View view : zzcejVar.zzV()) {
                com.google.android.gms.ads.internal.zzu.B.f10573w.zzh(zzfmbVar, view);
            }
            this.zzd.zzd("onSdkLoaded", zzfxu.zzd());
        }
    }

    public final synchronized boolean zzd() {
        if (this.zze != null) {
            return true;
        }
        return false;
    }

    public final synchronized boolean zze(boolean z10) {
        if (this.zzc.zzT) {
            zzbbn zzbbnVar = zzbbw.zzez;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                if (((Boolean) zzbaVar.c.zza(zzbbw.zzeC)).booleanValue() && this.zzd != null) {
                    if (this.zze != null) {
                        com.google.android.gms.ads.internal.util.client.zzm.e("Omid javascript session service already started for ad.");
                        return false;
                    }
                    Context context = this.zza;
                    com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
                    if (!zzuVar.f10573w.zzl(context)) {
                        com.google.android.gms.ads.internal.util.client.zzm.e("Unable to initialize omid.");
                        return false;
                    } else if (this.zzc.zzV.zzb()) {
                        zzfmb zze = zzuVar.f10573w.zze(this.zzb, this.zzd.zzG(), true);
                        if (zze == null) {
                            com.google.android.gms.ads.internal.util.client.zzm.e("Unable to create javascript session service.");
                            return false;
                        }
                        com.google.android.gms.ads.internal.util.client.zzm.d("Created omid javascript session service.");
                        this.zze = zze;
                        this.zzd.zzas(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void zzf(zzcey zzceyVar) {
        zzfmb zzfmbVar = this.zze;
        if (zzfmbVar != null && this.zzd != null) {
            com.google.android.gms.ads.internal.zzu.B.f10573w.zzm(zzfmbVar, zzceyVar);
            this.zze = null;
            this.zzd.zzas(null);
        }
    }
}
