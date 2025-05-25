package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbal extends zzbzt {
    final /* synthetic */ zzbar zza;

    public zzbal(zzbar zzbarVar) {
        this.zza = zzbarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzt, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        zzbar.zze(this.zza);
        return super.cancel(z10);
    }
}
