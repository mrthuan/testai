package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbnl {
    private static final Charset zzc = Charset.forName("UTF-8");
    public static final zzbni zza = new zzbnk();
    public static final zzbng zzb = new zzbng() { // from class: com.google.android.gms.internal.ads.zzbnj
        @Override // com.google.android.gms.internal.ads.zzbng
        public final Object zza(JSONObject jSONObject) {
            return zzbnl.zza(jSONObject);
        }
    };

    public static /* synthetic */ InputStream zza(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(zzc));
    }
}
