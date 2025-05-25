package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f11016a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectionResult f11017b;

    public l0(ConnectionResult connectionResult, int i10) {
        Preconditions.j(connectionResult);
        this.f11017b = connectionResult;
        this.f11016a = i10;
    }
}
