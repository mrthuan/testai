package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcci extends zzaqq {
    static final zzcci zzb = new zzcci();

    @Override // com.google.android.gms.internal.ads.zzaqq
    public final zzaqu zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzaqw();
        }
        if ("mvhd".equals(str)) {
            return new zzaqx();
        }
        return new zzaqy(str);
    }
}
