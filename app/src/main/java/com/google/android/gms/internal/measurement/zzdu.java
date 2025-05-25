package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.2 */
/* loaded from: classes2.dex */
public abstract class zzdu implements Runnable {
    final long zzh;
    final long zzi;
    final boolean zzj;
    final /* synthetic */ zzef zzk;

    public zzdu(zzef zzefVar, boolean z10) {
        this.zzk = zzefVar;
        this.zzh = zzefVar.zza.a();
        this.zzi = zzefVar.zza.b();
        this.zzj = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        z10 = this.zzk.zzh;
        if (z10) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (Exception e10) {
            this.zzk.zzT(e10, false, this.zzj);
            zzb();
        }
    }

    public abstract void zza();

    public void zzb() {
    }
}
