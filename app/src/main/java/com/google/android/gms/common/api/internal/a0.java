package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class a0 implements BaseGmsClient.ConnectionProgressReportCallbacks, zacs {

    /* renamed from: a  reason: collision with root package name */
    public final Api.Client f10979a;

    /* renamed from: b  reason: collision with root package name */
    public final ApiKey f10980b;
    public IAccountAccessor c = null;

    /* renamed from: d  reason: collision with root package name */
    public Set f10981d = null;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10982e = false;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ GoogleApiManager f10983f;

    public a0(GoogleApiManager googleApiManager, Api.Client client, ApiKey apiKey) {
        this.f10983f = googleApiManager;
        this.f10979a = client;
        this.f10980b = apiKey;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void a(ConnectionResult connectionResult) {
        this.f10983f.f10952n.post(new z(this, connectionResult));
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    public final void b(ConnectionResult connectionResult) {
        zabq zabqVar = (zabq) this.f10983f.f10948j.get(this.f10980b);
        if (zabqVar != null) {
            zabqVar.o(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    public final void c(IAccountAccessor iAccountAccessor, Set set) {
        if (iAccountAccessor != null && set != null) {
            this.c = iAccountAccessor;
            this.f10981d = set;
            if (this.f10982e) {
                this.f10979a.getRemoteService(iAccountAccessor, set);
                return;
            }
            return;
        }
        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
        b(new ConnectionResult(4));
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    public final void d(int i10) {
        zabq zabqVar = (zabq) this.f10983f.f10948j.get(this.f10980b);
        if (zabqVar != null) {
            if (zabqVar.f11117i) {
                zabqVar.o(new ConnectionResult(17));
            } else {
                zabqVar.onConnectionSuspended(i10);
            }
        }
    }
}
