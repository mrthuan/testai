package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.zad;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zact extends com.google.android.gms.signin.internal.zac implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: h  reason: collision with root package name */
    public static final b8.a f11130h = zad.f11959a;

    /* renamed from: a  reason: collision with root package name */
    public final Context f11131a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f11132b;
    public final b8.a c = f11130h;

    /* renamed from: d  reason: collision with root package name */
    public final Set f11133d;

    /* renamed from: e  reason: collision with root package name */
    public final ClientSettings f11134e;

    /* renamed from: f  reason: collision with root package name */
    public com.google.android.gms.signin.zae f11135f;

    /* renamed from: g  reason: collision with root package name */
    public zacs f11136g;

    public zact(Context context, Handler handler, ClientSettings clientSettings) {
        this.f11131a = context;
        this.f11132b = handler;
        this.f11134e = clientSettings;
        this.f11133d = clientSettings.f11182b;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.f11135f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f11136g.b(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        this.f11136g.d(i10);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    public final void s(com.google.android.gms.signin.internal.zak zakVar) {
        this.f11132b.post(new e0(0, this, zakVar));
    }
}
