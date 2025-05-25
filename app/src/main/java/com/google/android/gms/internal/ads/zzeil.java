package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.LinkedHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeil implements zzgcf {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfeo zzb;
    final /* synthetic */ zzfel zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzflh zze;
    final /* synthetic */ zzfex zzf;
    final /* synthetic */ zzein zzg;

    public zzeil(zzein zzeinVar, long j10, zzfeo zzfeoVar, zzfel zzfelVar, String str, zzflh zzflhVar, zzfex zzfexVar) {
        this.zza = j10;
        this.zzb = zzfeoVar;
        this.zzc = zzfelVar;
        this.zzd = str;
        this.zze = zzflhVar;
        this.zzf = zzfexVar;
        this.zzg = zzeinVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgcf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.Throwable r17) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeil.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zzb(Object obj) {
        Clock clock;
        boolean z10;
        boolean z11;
        boolean zzq;
        LinkedHashMap linkedHashMap;
        zzeey zzeeyVar;
        LinkedHashMap linkedHashMap2;
        zzeip zzeipVar;
        clock = this.zzg.zza;
        long b10 = clock.b() - this.zza;
        synchronized (this.zzg) {
            zzein zzeinVar = this.zzg;
            z10 = zzeinVar.zze;
            if (z10) {
                zzeipVar = zzeinVar.zzb;
                zzeipVar.zza(this.zzb, this.zzc, 0, null, b10);
            }
            zzein zzeinVar2 = this.zzg;
            z11 = zzeinVar2.zzg;
            if (!z11) {
                zzq = zzeinVar2.zzq(this.zzc);
                if (zzq) {
                    linkedHashMap2 = this.zzg.zzd;
                    ((zzeim) linkedHashMap2.get(this.zzc)).zzd = b10;
                } else {
                    linkedHashMap = this.zzg.zzd;
                    zzfel zzfelVar = this.zzc;
                    linkedHashMap.put(zzfelVar, new zzeim(this.zzd, zzfelVar.zzaf, 0, b10, null));
                }
                zzeeyVar = this.zzg.zzf;
                zzeeyVar.zzg(this.zzc, b10, null);
            }
        }
    }
}
