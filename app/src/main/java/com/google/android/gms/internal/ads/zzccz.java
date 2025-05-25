package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzccz extends zzccv {
    public zzccz(zzcbk zzcbkVar) {
        super(zzcbkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final boolean zzt(String str) {
        String a10 = com.google.android.gms.ads.internal.util.client.zzf.a(str, "MD5");
        zzcbk zzcbkVar = (zzcbk) this.zzc.get();
        if (zzcbkVar != null && a10 != null) {
            zzcbkVar.zzt(a10, this);
        }
        com.google.android.gms.ads.internal.util.client.zzm.e("VideoStreamNoopCache is doing nothing.");
        zzg(str, a10, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzf() {
    }
}
