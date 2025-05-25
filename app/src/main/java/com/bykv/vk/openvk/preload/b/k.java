package com.bykv.vk.openvk.preload.b;

import com.bykv.vk.openvk.preload.b.i;

/* compiled from: RetryInterceptor.java */
/* loaded from: classes.dex */
public abstract class k<IN, OUT> extends d<IN, OUT> {

    /* renamed from: g  reason: collision with root package name */
    protected IN f7471g;

    @Override // com.bykv.vk.openvk.preload.b.d
    public final Object a(b<OUT> bVar, IN in2) {
        this.f7471g = in2;
        try {
            return bVar.a((b<OUT>) a());
        } catch (i.a e10) {
            return a((b) bVar, e10.getCause());
        } catch (Throwable th2) {
            return a((b) bVar, th2);
        }
    }

    public abstract boolean a(Throwable th2);

    private Object a(b<OUT> bVar, Throwable th2) {
        while (a(th2)) {
            try {
                return bVar.a((b<OUT>) a());
            } catch (i.a e10) {
                th2 = e10.getCause();
            } catch (Throwable th3) {
                th2 = th3;
            }
        }
        throw th2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [IN, OUT] */
    public OUT a() {
        return this.f7471g;
    }
}
