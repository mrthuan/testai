package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzcx implements MuteThisAdReason {

    /* renamed from: a  reason: collision with root package name */
    public final String f10122a;

    /* renamed from: b  reason: collision with root package name */
    public final zzcw f10123b;

    public zzcx(zzcw zzcwVar) {
        String str;
        this.f10123b = zzcwVar;
        try {
            str = zzcwVar.zze();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            str = null;
        }
        this.f10122a = str;
    }

    public final String toString() {
        return this.f10122a;
    }
}
