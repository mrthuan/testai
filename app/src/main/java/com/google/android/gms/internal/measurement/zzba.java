package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzba implements Comparator {
    final /* synthetic */ zzai zza;
    final /* synthetic */ zzg zzb;

    public zzba(zzai zzaiVar, zzg zzgVar) {
        this.zza = zzaiVar;
        this.zzb = zzgVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzap zzapVar = (zzap) obj;
        zzap zzapVar2 = (zzap) obj2;
        zzai zzaiVar = this.zza;
        zzg zzgVar = this.zzb;
        if (zzapVar instanceof zzau) {
            if (!(zzapVar2 instanceof zzau)) {
                return 1;
            }
            return 0;
        } else if (zzapVar2 instanceof zzau) {
            return -1;
        } else {
            if (zzaiVar == null) {
                return zzapVar.zzi().compareTo(zzapVar2.zzi());
            }
            return (int) zzh.zza(zzaiVar.zza(zzgVar, Arrays.asList(zzapVar, zzapVar2)).zzh().doubleValue());
        }
    }
}
