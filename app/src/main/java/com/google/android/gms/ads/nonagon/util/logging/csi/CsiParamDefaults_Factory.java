package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzchc;
import com.google.android.gms.internal.ads.zzhfc;
import com.google.android.gms.internal.ads.zzhfu;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class CsiParamDefaults_Factory implements zzhfc<CsiParamDefaults> {

    /* renamed from: a  reason: collision with root package name */
    public final zzhfu f10763a;

    /* renamed from: b  reason: collision with root package name */
    public final zzhfu f10764b;

    public CsiParamDefaults_Factory(zzcgp zzcgpVar, zzchc zzchcVar) {
        this.f10763a = zzcgpVar;
        this.f10764b = zzchcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final Object zzb() {
        return new CsiParamDefaults((Context) this.f10763a.zzb(), (VersionInfoParcel) this.f10764b.zzb());
    }
}
