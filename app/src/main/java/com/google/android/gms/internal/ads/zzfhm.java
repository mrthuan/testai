package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfhm implements zzgcf {
    final /* synthetic */ zzfhp zza;
    final /* synthetic */ zzfhq zzb;

    public zzfhm(zzfhq zzfhqVar, zzfhp zzfhpVar) {
        this.zza = zzfhpVar;
        this.zzb = zzfhqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayDeque arrayDeque;
        int i10;
        Void r4 = (Void) obj;
        synchronized (this.zzb) {
            this.zzb.zze = null;
            arrayDeque = this.zzb.zzd;
            arrayDeque.addFirst(this.zza);
            zzfhq zzfhqVar = this.zzb;
            i10 = zzfhqVar.zzf;
            if (i10 == 1) {
                zzfhqVar.zzh();
            }
        }
    }
}
