package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzanm implements zzang {
    final /* synthetic */ zzano zza;
    private final zzej zzb = new zzej(new byte[4], 4);

    public zzanm(zzano zzanoVar) {
        this.zza = zzanoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void zza(zzek zzekVar) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i10;
        if (zzekVar.zzm() == 0 && (zzekVar.zzm() & 128) != 0) {
            zzekVar.zzL(6);
            int zzb = zzekVar.zzb() / 4;
            for (int i11 = 0; i11 < zzb; i11++) {
                zzekVar.zzF(this.zzb, 4);
                zzej zzejVar = this.zzb;
                int zzd = zzejVar.zzd(16);
                zzejVar.zzn(3);
                if (zzd == 0) {
                    this.zzb.zzn(13);
                } else {
                    int zzd2 = this.zzb.zzd(13);
                    sparseArray2 = this.zza.zzg;
                    if (sparseArray2.get(zzd2) == null) {
                        zzano zzanoVar = this.zza;
                        sparseArray3 = zzanoVar.zzg;
                        sparseArray3.put(zzd2, new zzanh(new zzann(zzanoVar, zzd2)));
                        zzano zzanoVar2 = this.zza;
                        i10 = zzanoVar2.zzm;
                        zzanoVar2.zzm = i10 + 1;
                    }
                }
            }
            sparseArray = this.zza.zzg;
            sparseArray.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void zzb(zzer zzerVar, zzacn zzacnVar, zzans zzansVar) {
    }
}
