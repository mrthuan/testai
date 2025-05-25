package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeoy implements zzevn {
    private final com.google.android.gms.ads.internal.client.zzw zza;
    private final VersionInfoParcel zzb;
    private final boolean zzc;

    public zzeoy(com.google.android.gms.ads.internal.client.zzw zzwVar, VersionInfoParcel versionInfoParcel, boolean z10) {
        this.zza = zzwVar;
        this.zzb = versionInfoParcel;
        this.zzc = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzevn
    public final void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzbbn zzbbnVar = zzbbw.zzeK;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (this.zzb.c >= ((Integer) zzbaVar.c.zza(zzbbnVar)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) zzbaVar.c.zza(zzbbw.zzeL)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzc);
        }
        com.google.android.gms.ads.internal.client.zzw zzwVar = this.zza;
        if (zzwVar != null) {
            int i10 = zzwVar.f10262a;
            if (i10 == 1) {
                bundle.putString("avo", "p");
            } else if (i10 == 2) {
                bundle.putString("avo", OperatorName.LINE_TO);
            }
        }
    }
}
