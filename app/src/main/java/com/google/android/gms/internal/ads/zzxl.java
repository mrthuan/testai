package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzxl implements Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ zzxt zza;

    public zzxl(zzxm zzxmVar, zzxt zzxtVar) {
        this.zza = zzxtVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        zzxt.zzi(this.zza);
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        zzxt.zzi(this.zza);
    }
}
