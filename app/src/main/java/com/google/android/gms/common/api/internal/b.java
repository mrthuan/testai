package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class b implements PendingResult.StatusListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f10984a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zaad f10985b;

    public b(zaad zaadVar, BaseImplementation.ApiMethodImpl apiMethodImpl) {
        this.f10985b = zaadVar;
        this.f10984a = apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void a() {
        this.f10985b.f11045a.remove(this.f10984a);
    }
}
