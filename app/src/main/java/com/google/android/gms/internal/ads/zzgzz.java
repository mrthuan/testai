package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgzz {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgzz() {
    }

    public static /* bridge */ /* synthetic */ zzgwm zza(zzgzz zzgzzVar, zzgwm zzgwmVar, zzgwm zzgwmVar2) {
        zzgzzVar.zzb(zzgwmVar);
        zzgzzVar.zzb(zzgwmVar2);
        zzgwm zzgwmVar3 = (zzgwm) zzgzzVar.zza.pop();
        while (!zzgzzVar.zza.isEmpty()) {
            zzgwmVar3 = new zzhad((zzgwm) zzgzzVar.zza.pop(), zzgwmVar3);
        }
        return zzgwmVar3;
    }

    private final void zzb(zzgwm zzgwmVar) {
        zzgwm zzgwmVar2;
        zzgwm zzgwmVar3;
        if (zzgwmVar.zzh()) {
            int zzc = zzc(zzgwmVar.zzd());
            ArrayDeque arrayDeque = this.zza;
            int zzc2 = zzhad.zzc(zzc + 1);
            if (!arrayDeque.isEmpty() && ((zzgwm) this.zza.peek()).zzd() < zzc2) {
                int zzc3 = zzhad.zzc(zzc);
                zzgwm zzgwmVar4 = (zzgwm) this.zza.pop();
                while (!this.zza.isEmpty() && ((zzgwm) this.zza.peek()).zzd() < zzc3) {
                    zzgwmVar4 = new zzhad((zzgwm) this.zza.pop(), zzgwmVar4);
                }
                zzhad zzhadVar = new zzhad(zzgwmVar4, zzgwmVar);
                while (!this.zza.isEmpty()) {
                    ArrayDeque arrayDeque2 = this.zza;
                    if (((zzgwm) arrayDeque2.peek()).zzd() >= zzhad.zzc(zzc(zzhadVar.zzd()) + 1)) {
                        break;
                    }
                    zzhadVar = new zzhad((zzgwm) this.zza.pop(), zzhadVar);
                }
                this.zza.push(zzhadVar);
                return;
            }
            this.zza.push(zzgwmVar);
        } else if (zzgwmVar instanceof zzhad) {
            zzhad zzhadVar2 = (zzhad) zzgwmVar;
            zzgwmVar2 = zzhadVar2.zzd;
            zzb(zzgwmVar2);
            zzgwmVar3 = zzhadVar2.zze;
            zzb(zzgwmVar3);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgwmVar.getClass())));
        }
    }

    private static final int zzc(int i10) {
        int binarySearch = Arrays.binarySearch(zzhad.zza, i10);
        if (binarySearch < 0) {
            return (-(binarySearch + 1)) - 1;
        }
        return binarySearch;
    }

    public /* synthetic */ zzgzz(zzgzy zzgzyVar) {
    }
}
