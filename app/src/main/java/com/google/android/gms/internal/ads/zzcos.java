package com.google.android.gms.internal.ads;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcos {
    private final zzdsk zza;
    private final zzfex zzb;

    public zzcos(zzdsk zzdskVar, zzfex zzfexVar) {
        this.zza = zzdskVar;
        this.zzb = zzfexVar;
    }

    public final void zza(long j10, int i10) {
        String str;
        zzdsj zza = this.zza.zza();
        zza.zzd(this.zzb.zzb.zzb);
        zza.zzb("action", "ad_closed");
        zza.zzb("show_time", String.valueOf(j10));
        zza.zzb("ad_format", "app_open_ad");
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            str = "u";
                        } else {
                            str = "ac";
                        }
                    } else {
                        str = PDPrintFieldAttributeObject.ROLE_CB;
                    }
                } else {
                    str = "cc";
                }
            } else {
                str = "bb";
            }
        } else {
            str = "h";
        }
        zza.zzb("acr", str);
        zza.zzf();
    }
}
