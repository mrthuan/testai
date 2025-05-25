package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdht implements zzbix {
    private final WeakReference zza;

    public /* synthetic */ zzdht(zzdhy zzdhyVar, zzdhs zzdhsVar) {
        this.zza = new WeakReference(zzdhyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        zzcwo zzcwoVar;
        zzdeo zzdeoVar;
        zzdeo zzdeoVar2;
        zzdhy zzdhyVar = (zzdhy) this.zza.get();
        if (zzdhyVar != null && "_ac".equals((String) map.get("eventName"))) {
            zzcwoVar = zzdhyVar.zzh;
            zzcwoVar.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjR)).booleanValue()) {
                zzdeoVar = zzdhyVar.zzi;
                zzdeoVar.zzdG();
                if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    zzdeoVar2 = zzdhyVar.zzi;
                    zzdeoVar2.zzdf();
                }
            }
        }
    }
}
