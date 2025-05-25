package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class r extends zabw {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f11030a;

    public r(zabe zabeVar) {
        this.f11030a = new WeakReference(zabeVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void a() {
        zabe zabeVar = (zabe) this.f11030a.get();
        if (zabeVar == null) {
            return;
        }
        zabeVar.f11073b.lock();
        try {
            if (zabeVar.f11079i) {
                zabeVar.q();
            }
        } finally {
            zabeVar.f11073b.unlock();
        }
    }
}
