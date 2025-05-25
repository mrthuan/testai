package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public class zaag extends GoogleApiClient {

    /* renamed from: b  reason: collision with root package name */
    public final String f11049b = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void b() {
        throw new UnsupportedOperationException(this.f11049b);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void e() {
        throw new UnsupportedOperationException(this.f11049b);
    }
}
