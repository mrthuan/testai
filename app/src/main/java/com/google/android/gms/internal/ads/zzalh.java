package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzalh implements zzaka {
    private final zzek zza = new zzek();

    @Override // com.google.android.gms.internal.ads.zzaka
    public final void zza(byte[] bArr, int i10, int i11, zzajz zzajzVar, zzdn zzdnVar) {
        boolean z10;
        zzdb zzp;
        boolean z11;
        this.zza.zzI(bArr, i11 + i10);
        this.zza.zzK(i10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzek zzekVar = this.zza;
            if (zzekVar.zzb() > 0) {
                if (zzekVar.zzb() >= 8) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzdi.zze(z10, "Incomplete Mp4Webvtt Top Level box header found.");
                zzek zzekVar2 = this.zza;
                int zzg = zzekVar2.zzg() - 8;
                if (zzekVar2.zzg() == 1987343459) {
                    zzek zzekVar3 = this.zza;
                    CharSequence charSequence = null;
                    zzcz zzczVar = null;
                    while (zzg > 0) {
                        if (zzg >= 8) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zzdi.zze(z11, "Incomplete vtt cue box header found.");
                        int zzg2 = zzekVar3.zzg();
                        int zzg3 = zzekVar3.zzg();
                        int i12 = zzg - 8;
                        int i13 = zzg2 - 8;
                        String zzB = zzet.zzB(zzekVar3.zzM(), zzekVar3.zzd(), i13);
                        zzekVar3.zzL(i13);
                        if (zzg3 == 1937011815) {
                            zzczVar = zzalr.zzb(zzB);
                        } else if (zzg3 == 1885436268) {
                            charSequence = zzalr.zza(null, zzB.trim(), Collections.emptyList());
                        }
                        zzg = i12 - i13;
                    }
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    if (zzczVar != null) {
                        zzczVar.zzl(charSequence);
                        zzp = zzczVar.zzp();
                    } else {
                        zzalq zzalqVar = new zzalq();
                        zzalqVar.zzc = charSequence;
                        zzp = zzalqVar.zza().zzp();
                    }
                    arrayList.add(zzp);
                } else {
                    this.zza.zzL(zzg);
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
