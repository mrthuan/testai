package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzbbc;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzecp implements zzfjm {
    private final zzecd zza;
    private final zzech zzb;

    public zzecp(zzecd zzecdVar, zzech zzechVar) {
        this.zza = zzecdVar;
        this.zzb = zzechVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final void zzd(zzfjf zzfjfVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzfB)).booleanValue() && zzfjf.RENDERER == zzfjfVar && this.zza.zzc() != 0) {
            zzecd zzecdVar = this.zza;
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            zzecdVar.zzf(SystemClock.elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final void zzdD(zzfjf zzfjfVar, String str, Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzfB)).booleanValue() && zzfjf.RENDERER == zzfjfVar && this.zza.zzc() != 0) {
            zzecd zzecdVar = this.zza;
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            zzecdVar.zzf(SystemClock.elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final void zzdE(zzfjf zzfjfVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzfB)).booleanValue()) {
            if (zzfjf.RENDERER == zzfjfVar) {
                zzecd zzecdVar = this.zza;
                com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                zzecdVar.zzg(SystemClock.elapsedRealtime());
            } else if (zzfjf.PRELOADED_LOADER != zzfjfVar && zzfjf.SERVER_TRANSACTION != zzfjfVar) {
            } else {
                zzecd zzecdVar2 = this.zza;
                com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                zzecdVar2.zzh(SystemClock.elapsedRealtime());
                final zzech zzechVar = this.zzb;
                final long zzd = this.zza.zzd();
                zzechVar.zza.zza(new zzfio() { // from class: com.google.android.gms.internal.ads.zzecg
                    @Override // com.google.android.gms.internal.ads.zzfio
                    public final Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (!zzech.this.zzf()) {
                            long j10 = zzd;
                            zzbbc.zzaf.zza.C0159zza zzn = zzbbc.zzaf.zza.zzn();
                            zzn.zzP(j10);
                            byte[] zzaV = zzn.zzbr().zzaV();
                            zzeco.zzf(sQLiteDatabase, false, false);
                            zzeco.zzc(sQLiteDatabase, j10, zzaV);
                            return null;
                        }
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final void zzdC(zzfjf zzfjfVar, String str) {
    }
}
