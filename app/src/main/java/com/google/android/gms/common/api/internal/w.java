package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f11039a;

    public w(x xVar) {
        this.f11039a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Api.Client client = this.f11039a.f11040a.f11111b;
        client.disconnect(client.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
