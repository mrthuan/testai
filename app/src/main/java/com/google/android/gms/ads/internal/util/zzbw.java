package com.google.android.gms.ads.internal.util;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzbw extends zzb {

    /* renamed from: a  reason: collision with root package name */
    public final com.google.android.gms.ads.internal.util.client.zzr f10437a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10438b;

    public zzbw(Context context, String str, String str2) {
        this.f10437a = new com.google.android.gms.ads.internal.util.client.zzr(com.google.android.gms.ads.internal.zzu.B.c.v(context, str));
        this.f10438b = str2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        this.f10437a.zza(this.f10438b);
    }
}
