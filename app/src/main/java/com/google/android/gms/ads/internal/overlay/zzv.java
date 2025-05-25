package com.google.android.gms.ads.internal.overlay;

import com.google.android.gms.internal.ads.zzcej;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzv implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzx f10334a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f10335b;
    public final /* synthetic */ Map c;

    public /* synthetic */ zzv(zzx zzxVar, String str, HashMap hashMap) {
        this.f10334a = zzxVar;
        this.f10335b = str;
        this.c = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcej zzcejVar = this.f10334a.c;
        if (zzcejVar != null) {
            zzcejVar.zzd(this.f10335b, this.c);
        }
    }
}
