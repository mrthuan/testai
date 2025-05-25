package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbic implements zzbix {
    @Override // com.google.android.gms.internal.ads.zzbix
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzcej zzcejVar = (zzcej) obj;
        zzber zzK = zzcejVar.zzK();
        if (zzK != null && (zza = zzK.zza()) != null) {
            zzcejVar.zze("nativeAdViewSignalsReady", zza);
        } else {
            zzcejVar.zze("nativeAdViewSignalsReady", new JSONObject());
        }
    }
}
