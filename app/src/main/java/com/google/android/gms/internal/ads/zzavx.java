package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzavx implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzavy zza;

    public zzavx(zzavy zzavyVar) {
        this.zza = zzavyVar;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        long j10;
        long j11;
        long j12;
        if (z10) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        zzavy zzavyVar = this.zza;
        long currentTimeMillis = System.currentTimeMillis();
        j10 = zzavyVar.zzc;
        if (j10 > 0) {
            zzavy zzavyVar2 = this.zza;
            j11 = zzavyVar2.zzc;
            if (currentTimeMillis >= j11) {
                j12 = zzavyVar2.zzc;
                zzavyVar2.zzd = currentTimeMillis - j12;
            }
        }
        this.zza.zze = false;
    }
}
