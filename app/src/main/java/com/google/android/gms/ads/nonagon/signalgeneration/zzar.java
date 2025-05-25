package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzhfc;
import com.google.android.gms.internal.ads.zzhfk;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzar implements zzhfc {

    /* renamed from: a  reason: collision with root package name */
    public final zzap f10683a;

    public zzar(zzap zzapVar) {
        this.f10683a = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final Object zzb() {
        String lowerCase = this.f10683a.f10681a.toLowerCase(Locale.ROOT);
        zzhfk.zzb(lowerCase);
        return lowerCase;
    }
}
