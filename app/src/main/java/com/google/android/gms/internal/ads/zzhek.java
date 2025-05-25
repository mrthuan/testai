package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzhek extends zzhen implements zzaqu {
    protected final String zza = "moov";

    public zzhek(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqu
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaqu
    public final void zzb(zzheo zzheoVar, ByteBuffer byteBuffer, long j10, zzaqr zzaqrVar) {
        zzheoVar.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzc = zzheoVar;
        this.zze = zzheoVar.zzb();
        zzheoVar.zze(zzheoVar.zzb() + j10);
        this.zzf = zzheoVar.zzb();
        this.zzb = zzaqrVar;
    }
}
