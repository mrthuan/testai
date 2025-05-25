package com.bykv.vk.openvk.preload.b;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Interceptor.java */
/* loaded from: classes.dex */
public abstract class d<IN, OUT> {

    /* renamed from: g  reason: collision with root package name */
    private static AtomicLong f7452g = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    d f7453a;

    /* renamed from: b  reason: collision with root package name */
    IN f7454b;
    public OUT c;

    /* renamed from: d  reason: collision with root package name */
    com.bykv.vk.openvk.preload.b.b.a f7455d;

    /* renamed from: e  reason: collision with root package name */
    b f7456e;

    /* renamed from: f  reason: collision with root package name */
    public long f7457f;

    public abstract Object a(b<OUT> bVar, IN in2);

    public void a(Object... objArr) {
    }

    public final void b(Throwable th2) {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.f7455d;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f7456e, this, th2);
    }

    public final void a(b bVar, d dVar, IN in2, com.bykv.vk.openvk.preload.b.b.a aVar, Object[] objArr) {
        this.f7456e = new m(bVar);
        this.f7453a = dVar;
        this.f7454b = in2;
        this.f7455d = aVar;
        if (dVar != null) {
            this.f7457f = dVar.f7457f;
        } else {
            long andIncrement = f7452g.getAndIncrement();
            this.f7457f = andIncrement;
            if (andIncrement < 0) {
                throw new RuntimeException("Pipeline ID use up!");
            }
        }
        a(objArr);
    }
}
