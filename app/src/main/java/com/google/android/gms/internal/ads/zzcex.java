package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzcex implements Runnable {
    public final /* synthetic */ zzcej zza;

    public /* synthetic */ zzcex(zzcej zzcejVar) {
        this.zza = zzcejVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.destroy();
    }
}
