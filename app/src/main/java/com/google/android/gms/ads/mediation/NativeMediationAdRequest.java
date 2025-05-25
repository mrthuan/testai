package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAdOptions;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@Deprecated
/* loaded from: classes.dex */
public interface NativeMediationAdRequest extends MediationAdRequest {
    @Deprecated
    NativeAdOptions getNativeAdOptions();

    com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions();

    boolean isUnifiedNativeAdRequested();

    Map zza();

    boolean zzb();
}
