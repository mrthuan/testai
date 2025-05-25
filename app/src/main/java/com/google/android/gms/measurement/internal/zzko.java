package com.google.android.gms.measurement.internal;

import a8.s;
import a8.x1;
import a8.y1;
import android.os.Looper;
import j3.h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzko extends s {
    public com.google.android.gms.internal.measurement.zzby c;

    /* renamed from: d  reason: collision with root package name */
    public final y1 f11877d;

    /* renamed from: e  reason: collision with root package name */
    public final x1 f11878e;

    /* renamed from: f  reason: collision with root package name */
    public final h f11879f;

    public zzko(zzge zzgeVar) {
        super(zzgeVar);
        this.f11877d = new y1(this);
        this.f11878e = new x1(this);
        this.f11879f = new h(this);
    }

    @Override // a8.s
    public final boolean p() {
        return false;
    }

    public final void q() {
        m();
        if (this.c == null) {
            this.c = new com.google.android.gms.internal.measurement.zzby(Looper.getMainLooper());
        }
    }
}
