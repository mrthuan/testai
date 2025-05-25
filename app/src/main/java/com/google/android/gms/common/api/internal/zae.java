package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zae extends zai {

    /* renamed from: b  reason: collision with root package name */
    public final BaseImplementation.ApiMethodImpl f11146b;

    public zae(int i10, BaseImplementation.ApiMethodImpl apiMethodImpl) {
        super(i10);
        if (apiMethodImpl != null) {
            this.f11146b = apiMethodImpl;
            return;
        }
        throw new NullPointerException("Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void a(Status status) {
        try {
            this.f11146b.setFailedResult(status);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void b(RuntimeException runtimeException) {
        try {
            this.f11146b.setFailedResult(new Status(10, androidx.activity.f.m(runtimeException.getClass().getSimpleName(), ": ", runtimeException.getLocalizedMessage()), null, null));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void c(zabq zabqVar) {
        try {
            this.f11146b.run(zabqVar.f11111b);
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void d(zaad zaadVar, boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        Map map = zaadVar.f11045a;
        BaseImplementation.ApiMethodImpl apiMethodImpl = this.f11146b;
        map.put(apiMethodImpl, valueOf);
        apiMethodImpl.addStatusListener(new b(zaadVar, apiMethodImpl));
    }
}
