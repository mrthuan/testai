package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaqs extends zzhen {
    static {
        zzheu.zzb(zzaqs.class);
    }

    public zzaqs(zzheo zzheoVar, zzaqr zzaqrVar) {
        zze(zzheoVar, zzheoVar.zzc(), zzaqrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final String toString() {
        String obj = this.zzc.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 7);
        sb2.append("model(");
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhen, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
