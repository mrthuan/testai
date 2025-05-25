package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzafc implements zzacn {
    private final long zzb;
    private final zzacn zzc;

    public zzafc(long j10, zzacn zzacnVar) {
        this.zzb = j10;
        this.zzc = zzacnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzD() {
        this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzO(zzadi zzadiVar) {
        this.zzc.zzO(new zzafb(this, zzadiVar, zzadiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final zzadp zzw(int i10, int i11) {
        return this.zzc.zzw(i10, i11);
    }
}
