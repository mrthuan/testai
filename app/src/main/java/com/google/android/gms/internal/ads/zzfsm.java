package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfsm extends zzfsy {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final zzfsy zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final zzfsy zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final zzfsz zzc() {
        return new zzfso(this.zza, this.zzb, null);
    }
}
