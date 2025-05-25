package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaug implements Runnable {
    final /* synthetic */ zzauh zza;

    public zzaug(zzauh zzauhVar) {
        this.zza = zzauhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z10;
        zzfoh zzfohVar;
        Object obj2;
        obj = this.zza.zzo;
        synchronized (obj) {
            z10 = this.zza.zzp;
            if (!z10) {
                this.zza.zzp = true;
                try {
                    zzauh.zzj(this.zza);
                } catch (Exception e10) {
                    zzfohVar = this.zza.zzh;
                    zzfohVar.zzc(2023, -1L, e10);
                }
                obj2 = this.zza.zzo;
                synchronized (obj2) {
                    this.zza.zzp = false;
                }
            }
        }
    }
}
