package com.google.android.gms.tasks;

import d8.o;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
public class TaskCompletionSource<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final o f11978a = new o();

    public final void a(Exception exc) {
        this.f11978a.t(exc);
    }

    public final void b(TResult tresult) {
        this.f11978a.u(tresult);
    }

    public final boolean c(Exception exc) {
        o oVar = this.f11978a;
        oVar.getClass();
        if (exc != null) {
            synchronized (oVar.f16147a) {
                if (oVar.c) {
                    return false;
                }
                oVar.c = true;
                oVar.f16151f = exc;
                oVar.f16148b.b(oVar);
                return true;
            }
        }
        throw new NullPointerException("Exception must not be null");
    }

    public final boolean d(TResult tresult) {
        o oVar = this.f11978a;
        synchronized (oVar.f16147a) {
            if (oVar.c) {
                return false;
            }
            oVar.c = true;
            oVar.f16150e = tresult;
            oVar.f16148b.b(oVar);
            return true;
        }
    }
}
