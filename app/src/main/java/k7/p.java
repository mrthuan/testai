package k7;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.internal.client.zzcz;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzej;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class p extends zzcz {
    @Override // com.google.android.gms.ads.internal.client.zzda
    public final void zze(zze zzeVar) {
        AdInspectorError adInspectorError;
        OnAdInspectorClosedListener onAdInspectorClosedListener = zzej.b().f10174g;
        if (onAdInspectorClosedListener != null) {
            if (zzeVar == null) {
                adInspectorError = null;
            } else {
                adInspectorError = new AdInspectorError(zzeVar.f10146a, zzeVar.f10147b, zzeVar.c);
            }
            onAdInspectorClosedListener.a(adInspectorError);
        }
    }
}
