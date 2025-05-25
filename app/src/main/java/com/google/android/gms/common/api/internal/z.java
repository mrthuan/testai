package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.IAccountAccessor;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f11043a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0 f11044b;

    public z(a0 a0Var, ConnectionResult connectionResult) {
        this.f11044b = a0Var;
        this.f11043a = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAccountAccessor iAccountAccessor;
        a0 a0Var = this.f11044b;
        zabq zabqVar = (zabq) a0Var.f10983f.f10948j.get(a0Var.f10980b);
        if (zabqVar == null) {
            return;
        }
        ConnectionResult connectionResult = this.f11043a;
        if (connectionResult.f()) {
            a0Var.f10982e = true;
            Api.Client client = a0Var.f10979a;
            if (client.requiresSignIn()) {
                if (a0Var.f10982e && (iAccountAccessor = a0Var.c) != null) {
                    client.getRemoteService(iAccountAccessor, a0Var.f10981d);
                    return;
                }
                return;
            }
            try {
                client.getRemoteService(null, client.getScopesForConnectionlessNonSignIn());
                return;
            } catch (SecurityException unused) {
                client.disconnect("Failed to get service from broker.");
                zabqVar.n(new ConnectionResult(10), null);
                return;
            }
        }
        zabqVar.n(connectionResult, null);
    }
}
