package com.google.android.gms.ads.formats;

import android.os.Bundle;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@Deprecated
/* loaded from: classes.dex */
public abstract class UnifiedNativeAd {
    @KeepForSdk
    public abstract void performClick(Bundle bundle);

    @KeepForSdk
    public abstract boolean recordImpression(Bundle bundle);

    @KeepForSdk
    public abstract void reportTouchEvent(Bundle bundle);

    @Deprecated
    public abstract VideoController zza();

    public abstract NativeAd.Image zzb();

    public abstract Double zzc();

    public abstract Object zzd();

    public abstract String zze();

    public abstract String zzf();

    public abstract String zzg();

    public abstract String zzh();

    public abstract String zzi();

    public abstract String zzj();

    public abstract List zzk();
}
