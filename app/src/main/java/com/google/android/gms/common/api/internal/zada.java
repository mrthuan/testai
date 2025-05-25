package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zada<R extends Result> extends TransformedResult<R> implements ResultCallback<R> {

    /* renamed from: f  reason: collision with root package name */
    public final WeakReference f11141f;

    /* renamed from: g  reason: collision with root package name */
    public final h0 f11142g;

    /* renamed from: a  reason: collision with root package name */
    public ResultTransform f11137a = null;

    /* renamed from: b  reason: collision with root package name */
    public zada f11138b = null;
    public PendingResult c = null;

    /* renamed from: d  reason: collision with root package name */
    public final Object f11139d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public Status f11140e = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11143h = false;

    public zada(WeakReference weakReference) {
        Looper mainLooper;
        if (weakReference != null) {
            this.f11141f = weakReference;
            GoogleApiClient googleApiClient = (GoogleApiClient) weakReference.get();
            if (googleApiClient != null) {
                mainLooper = googleApiClient.j();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            this.f11142g = new h0(this, mainLooper);
            return;
        }
        throw new NullPointerException("GoogleApiClient reference must not be null");
    }

    public static final void g(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(result));
            }
        }
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void a(Result result) {
        synchronized (this.f11139d) {
            try {
                if (result.getStatus().d()) {
                    if (this.f11137a != null) {
                        zaco.f11129a.submit(new g0(this, result));
                    } else {
                        GoogleApiClient googleApiClient = (GoogleApiClient) this.f11141f.get();
                    }
                } else {
                    d(result.getStatus());
                    g(result);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zada b(ResultTransform resultTransform) {
        boolean z10;
        zada zadaVar;
        synchronized (this.f11139d) {
            if (this.f11137a == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.l("Cannot call then() twice.", z10);
            this.f11137a = resultTransform;
            zadaVar = new zada(this.f11141f);
            this.f11138b = zadaVar;
            e();
        }
        return zadaVar;
    }

    public final void c(PendingResult pendingResult) {
        synchronized (this.f11139d) {
            this.c = pendingResult;
            e();
        }
    }

    public final void d(Status status) {
        synchronized (this.f11139d) {
            this.f11140e = status;
            f(status);
        }
    }

    public final void e() {
        if (this.f11137a != null) {
            GoogleApiClient googleApiClient = (GoogleApiClient) this.f11141f.get();
            if (!this.f11143h && this.f11137a != null && googleApiClient != null) {
                googleApiClient.k(this);
                this.f11143h = true;
            }
            Status status = this.f11140e;
            if (status != null) {
                f(status);
                return;
            }
            PendingResult pendingResult = this.c;
            if (pendingResult != null) {
                pendingResult.setResultCallback(this);
            }
        }
    }

    public final void f(Status status) {
        synchronized (this.f11139d) {
            if (this.f11137a != null) {
                if (status != null) {
                    zada zadaVar = this.f11138b;
                    Preconditions.j(zadaVar);
                    zadaVar.d(status);
                } else {
                    throw new NullPointerException("onFailure must not return null");
                }
            } else {
                GoogleApiClient googleApiClient = (GoogleApiClient) this.f11141f.get();
            }
        }
    }
}
