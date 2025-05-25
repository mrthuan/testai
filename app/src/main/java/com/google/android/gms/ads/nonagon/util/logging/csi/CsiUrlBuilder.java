package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzbdm;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public class CsiUrlBuilder {

    /* renamed from: a  reason: collision with root package name */
    public final String f10765a = (String) zzbdm.zza.zze();

    public final String a(Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(this.f10765a).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return buildUpon.build().toString();
    }
}
