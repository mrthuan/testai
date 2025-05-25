package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzhfc;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzas implements zzhfc {

    /* renamed from: a  reason: collision with root package name */
    public final zzap f10684a;

    public zzas(zzap zzapVar) {
        this.f10684a = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final Object zzb() {
        zzap zzapVar = this.f10684a;
        zzapVar.getClass();
        HashSet hashSet = new HashSet();
        hashSet.add(zzapVar.f10681a.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
