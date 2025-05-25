package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcax implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcay zzb;

    public zzcax(zzcay zzcayVar, boolean z10) {
        this.zza = z10;
        this.zzb = zzcayVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
