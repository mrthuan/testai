package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzfe extends zzdf {

    /* renamed from: a  reason: collision with root package name */
    public final OnPaidEventListener f10189a;

    public zzfe(OnPaidEventListener onPaidEventListener) {
        this.f10189a = onPaidEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final void Y(zzs zzsVar) {
        OnPaidEventListener onPaidEventListener = this.f10189a;
        if (onPaidEventListener != null) {
            onPaidEventListener.a(new AdValue(zzsVar.f10253b, zzsVar.f10254d));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final boolean zzf() {
        if (this.f10189a == null) {
            return true;
        }
        return false;
    }
}
