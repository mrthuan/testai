package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeof implements zzevo {
    private final zzevo zza;
    private final zzffg zzb;
    private final Context zzc;
    private final zzbze zzd;

    public zzeof(zzeqg zzeqgVar, zzffg zzffgVar, Context context, zzbze zzbzeVar) {
        this.zza = zzeqgVar;
        this.zzb = zzffgVar;
        this.zzc = context;
        this.zzd = zzbzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        return zzgcj.zzm(this.zza.zzb(), new zzful() { // from class: com.google.android.gms.internal.ads.zzeoe
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                return zzeof.this.zzc((zzevx) obj);
            }
        }, zzbzo.zzf);
    }

    public final /* synthetic */ zzeog zzc(zzevx zzevxVar) {
        String str;
        boolean z10;
        String str2;
        float f10;
        int i10;
        int i11;
        int i12;
        DisplayMetrics displayMetrics;
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzb.zze;
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr = zzqVar.f10243g;
        if (zzqVarArr == null) {
            str = zzqVar.f10238a;
            z10 = zzqVar.f10245i;
        } else {
            str = null;
            boolean z11 = false;
            boolean z12 = false;
            z10 = false;
            for (com.google.android.gms.ads.internal.client.zzq zzqVar2 : zzqVarArr) {
                boolean z13 = zzqVar2.f10245i;
                if (!z13 && !z11) {
                    str = zzqVar2.f10238a;
                    z11 = true;
                }
                if (z13) {
                    if (!z12) {
                        z12 = true;
                        z10 = true;
                    } else {
                        z12 = true;
                    }
                }
                if (z11 && z12) {
                    break;
                }
            }
        }
        Resources resources = this.zzc.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzbze zzbzeVar = this.zzd;
            f10 = displayMetrics.density;
            i11 = displayMetrics.widthPixels;
            i10 = displayMetrics.heightPixels;
            str2 = zzbzeVar.zzi().zzm();
        } else {
            str2 = null;
            f10 = 0.0f;
            i10 = 0;
            i11 = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr2 = zzqVar.f10243g;
        if (zzqVarArr2 != null) {
            boolean z14 = false;
            for (com.google.android.gms.ads.internal.client.zzq zzqVar3 : zzqVarArr2) {
                if (zzqVar3.f10245i) {
                    z14 = true;
                } else {
                    if (sb2.length() != 0) {
                        sb2.append("|");
                    }
                    int i13 = -1;
                    int i14 = zzqVar3.f10241e;
                    if (i14 == -1) {
                        if (f10 != 0.0f) {
                            i13 = (int) (zzqVar3.f10242f / f10);
                        }
                    } else {
                        i13 = i14;
                    }
                    sb2.append(i13);
                    sb2.append("x");
                    int i15 = -2;
                    int i16 = zzqVar3.f10239b;
                    if (i16 == -2) {
                        if (f10 != 0.0f) {
                            i15 = (int) (zzqVar3.c / f10);
                        }
                    } else {
                        i15 = i16;
                    }
                    sb2.append(i15);
                }
            }
            if (z14) {
                if (sb2.length() != 0) {
                    i12 = 0;
                    sb2.insert(0, "|");
                } else {
                    i12 = 0;
                }
                sb2.insert(i12, "320x50");
            }
        }
        return new zzeog(zzqVar, str, z10, sb2.toString(), f10, i11, i10, str2, this.zzb.zzq);
    }
}
