package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfno implements Runnable {
    final /* synthetic */ zzfnt zza;

    public zzfno(zzfnt zzfntVar) {
        this.zza = zzfntVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfnn zzfnnVar;
        zzfnnVar = this.zza.zzl;
        zzfnnVar.zzb();
    }
}
