package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzezj implements zzevn {
    private final Map zza;

    public zzezj(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzevn
    public final void zzj(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a.j(this.zza));
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.h("Could not encode video decoder properties: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
