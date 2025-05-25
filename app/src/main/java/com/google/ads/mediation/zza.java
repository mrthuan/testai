package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzj;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
final class zza extends UnifiedNativeAdMapper {
    public zza(UnifiedNativeAd unifiedNativeAd) {
        setHeadline(unifiedNativeAd.zzh());
        setImages(unifiedNativeAd.zzk());
        setBody(unifiedNativeAd.zzf());
        setIcon(unifiedNativeAd.zzb());
        setCallToAction(unifiedNativeAd.zzg());
        setAdvertiser(unifiedNativeAd.zze());
        setStarRating(unifiedNativeAd.zzc());
        setStore(unifiedNativeAd.zzj());
        setPrice(unifiedNativeAd.zzi());
        zzd(unifiedNativeAd.zzd());
        setOverrideImpressionRecording(true);
        setOverrideClickHandling(true);
        zze(unifiedNativeAd.zza());
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        if (!(view instanceof zzj)) {
            if (((com.google.android.gms.ads.formats.zze) com.google.android.gms.ads.formats.zze.f10090a.get(view)) == null) {
                return;
            }
            throw null;
        }
        zzj zzjVar = (zzj) view;
        throw null;
    }
}
