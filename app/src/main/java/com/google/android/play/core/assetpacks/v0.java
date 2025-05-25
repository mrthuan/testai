package com.google.android.play.core.assetpacks;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class v0 {

    /* renamed from: k  reason: collision with root package name */
    public static final q9.y f13402k = new q9.y("ExtractorLooper");

    /* renamed from: a  reason: collision with root package name */
    public final g1 f13403a;

    /* renamed from: b  reason: collision with root package name */
    public final s0 f13404b;
    public final h2 c;

    /* renamed from: d  reason: collision with root package name */
    public final r1 f13405d;

    /* renamed from: e  reason: collision with root package name */
    public final t1 f13406e;

    /* renamed from: f  reason: collision with root package name */
    public final y1 f13407f;

    /* renamed from: g  reason: collision with root package name */
    public final a2 f13408g;

    /* renamed from: h  reason: collision with root package name */
    public final i1 f13409h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f13410i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    public final q9.k f13411j;

    public v0(g1 g1Var, q9.k kVar, s0 s0Var, h2 h2Var, r1 r1Var, t1 t1Var, y1 y1Var, a2 a2Var, i1 i1Var) {
        this.f13403a = g1Var;
        this.f13411j = kVar;
        this.f13404b = s0Var;
        this.c = h2Var;
        this.f13405d = r1Var;
        this.f13406e = t1Var;
        this.f13407f = y1Var;
        this.f13408g = a2Var;
        this.f13409h = i1Var;
    }

    public final void a(Exception exc, int i10) {
        g1 g1Var = this.f13403a;
        try {
            ReentrantLock reentrantLock = g1Var.f13239d;
            reentrantLock.lock();
            g1Var.b(i10).c.f13201d = 5;
            reentrantLock.unlock();
            ReentrantLock reentrantLock2 = g1Var.f13239d;
            reentrantLock2.lock();
            g1Var.a(i10);
            reentrantLock2.unlock();
        } catch (ck unused) {
            f13402k.b("Error during error handling: %s", exc.getMessage());
        }
    }
}
