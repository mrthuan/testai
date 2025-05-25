package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbid implements zzbix {
    @Override // com.google.android.gms.internal.ads.zzbix
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzb;
        zzcej zzcejVar = (zzcej) obj;
        zzber zzK = zzcejVar.zzK();
        if (zzK != null && (zzb = zzK.zzb()) != null) {
            zzcejVar.zze("nativeClickMetaReady", zzb);
        } else {
            zzcejVar.zze("nativeClickMetaReady", new JSONObject());
        }
    }
}
