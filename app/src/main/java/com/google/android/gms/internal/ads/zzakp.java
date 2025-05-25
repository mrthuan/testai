package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzakp implements zzaka {
    private final zzek zza = new zzek();
    private final zzek zzb = new zzek();
    private final zzako zzc = new zzako();
    private Inflater zzd;

    @Override // com.google.android.gms.internal.ads.zzaka
    public final void zza(byte[] bArr, int i10, int i11, zzajz zzajzVar, zzdn zzdnVar) {
        this.zza.zzI(bArr, i11 + i10);
        this.zza.zzK(i10);
        zzek zzekVar = this.zza;
        if (zzekVar.zzb() > 0 && zzekVar.zzf() == 120) {
            if (this.zzd == null) {
                this.zzd = new Inflater();
            }
            if (zzet.zzI(zzekVar, this.zzb, this.zzd)) {
                zzek zzekVar2 = this.zzb;
                zzekVar.zzI(zzekVar2.zzM(), zzekVar2.zze());
            }
        }
        this.zzc.zze();
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzek zzekVar3 = this.zza;
            if (zzekVar3.zzb() >= 3) {
                zzako zzakoVar = this.zzc;
                int zze = zzekVar3.zze();
                int zzm = zzekVar3.zzm();
                int zzq = zzekVar3.zzq();
                int zzd = zzekVar3.zzd() + zzq;
                zzdb zzdbVar = null;
                if (zzd > zze) {
                    zzekVar3.zzK(zze);
                } else {
                    if (zzm != 128) {
                        switch (zzm) {
                            case 20:
                                zzako.zzd(zzakoVar, zzekVar3, zzq);
                                break;
                            case 21:
                                zzako.zzb(zzakoVar, zzekVar3, zzq);
                                break;
                            case 22:
                                zzako.zzc(zzakoVar, zzekVar3, zzq);
                                break;
                        }
                    } else {
                        zzdb zza = zzakoVar.zza();
                        zzakoVar.zze();
                        zzdbVar = zza;
                    }
                    zzekVar3.zzK(zzd);
                }
                if (zzdbVar != null) {
                    arrayList.add(zzdbVar);
                }
            } else {
                zzdnVar.zza(new zzajs(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final /* synthetic */ void zzb() {
    }
}
