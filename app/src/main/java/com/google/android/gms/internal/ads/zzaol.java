package com.google.android.gms.internal.ads;

import java.security.cert.X509Certificate;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaol extends zzaom {
    private final byte[] zza;

    public zzaol(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaom, java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.zza;
    }
}
