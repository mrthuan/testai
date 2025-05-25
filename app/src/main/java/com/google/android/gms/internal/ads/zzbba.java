package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbba {
    final /* synthetic */ zzbbb zza;
    private final byte[] zzb;
    private int zzc;

    public /* synthetic */ zzbba(zzbbb zzbbbVar, byte[] bArr, zzbaz zzbazVar) {
        this.zza = zzbbbVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzbbb zzbbbVar = this.zza;
            if (zzbbbVar.zzb) {
                zzbbbVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(3);
        }
    }

    public final zzbba zza(int i10) {
        this.zzc = i10;
        return this;
    }

    public final synchronized void zzc() {
        ExecutorService executorService;
        executorService = this.zza.zzc;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbay
            @Override // java.lang.Runnable
            public final void run() {
                zzbba.this.zzd();
            }
        });
    }
}
