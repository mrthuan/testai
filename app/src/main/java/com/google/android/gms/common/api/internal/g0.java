package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class g0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Result f11005a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zada f11006b;

    public g0(zada zadaVar, Result result) {
        this.f11006b = zadaVar;
        this.f11005a = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Result result = this.f11005a;
        zada zadaVar = this.f11006b;
        try {
            try {
                ThreadLocal threadLocal = BasePendingResult.zaa;
                threadLocal.set(Boolean.TRUE);
                ResultTransform resultTransform = zadaVar.f11137a;
                Preconditions.j(resultTransform);
                PendingResult a10 = resultTransform.a();
                h0 h0Var = zadaVar.f11142g;
                h0Var.sendMessage(h0Var.obtainMessage(0, a10));
                threadLocal.set(Boolean.FALSE);
                zada.g(result);
                GoogleApiClient googleApiClient = (GoogleApiClient) zadaVar.f11141f.get();
                if (googleApiClient != null) {
                    googleApiClient.l(zadaVar);
                }
            } catch (RuntimeException e10) {
                h0 h0Var2 = zadaVar.f11142g;
                h0Var2.sendMessage(h0Var2.obtainMessage(1, e10));
                BasePendingResult.zaa.set(Boolean.FALSE);
                zada.g(result);
                GoogleApiClient googleApiClient2 = (GoogleApiClient) zadaVar.f11141f.get();
                if (googleApiClient2 != null) {
                    googleApiClient2.l(zadaVar);
                }
            }
        } catch (Throwable th2) {
            BasePendingResult.zaa.set(Boolean.FALSE);
            zada.g(result);
            GoogleApiClient googleApiClient3 = (GoogleApiClient) zadaVar.f11141f.get();
            if (googleApiClient3 != null) {
                googleApiClient3.l(zadaVar);
            }
            throw th2;
        }
    }
}
