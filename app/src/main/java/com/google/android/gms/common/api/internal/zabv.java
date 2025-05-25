package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zabv extends zaag {
    public final GoogleApi c;

    public zabv(GoogleApi googleApi) {
        this.c = googleApi;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T f(T t4) {
        return (T) this.c.doRead((GoogleApi) t4);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T g(T t4) {
        return (T) this.c.doWrite((GoogleApi) t4);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context i() {
        return this.c.getApplicationContext();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper j() {
        return this.c.getLooper();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void k(zada zadaVar) {
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void l(zada zadaVar) {
    }
}
