package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzawn extends zzaxd {
    private final zzavh zzh;

    public zzawn(zzavp zzavpVar, String str, String str2, zzaro zzaroVar, int i10, int i11, zzavh zzavhVar) {
        super(zzavpVar, "QcEEfK1PwFv2Eb+NZQ+4kWKAUUVvycYqoBzmAjBexJV/sKEjaFlajeD5MAZYWXy5", "361aY1ErIwpwsXwpamiiDSCpkl/IcdBM93dd8sW9a/Y=", zzaroVar, i10, 94);
        this.zzh = zzavhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxd
    public final void zza() {
        int intValue = ((Integer) this.zze.invoke(null, this.zzh.zza())).intValue();
        synchronized (this.zzd) {
            this.zzd.zzae(zzasa.zza(intValue));
        }
    }
}
