package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzeby implements zzgcf {
    final /* synthetic */ zzfio zza;

    public zzeby(zzebz zzebzVar, zzfio zzfioVar) {
        this.zza = zzfioVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.util.client.zzm.c("Failed to get offline signal database: ".concat(String.valueOf(th2.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.util.client.zzm.c("Error executing function on offline signal database: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
