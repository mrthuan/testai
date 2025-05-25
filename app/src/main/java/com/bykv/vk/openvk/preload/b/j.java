package com.bykv.vk.openvk.preload.b;

import com.bykv.vk.openvk.preload.b.i;
import com.bykv.vk.openvk.preload.b.l;
import java.util.List;

/* compiled from: RetryBranchInterceptor.java */
/* loaded from: classes.dex */
public abstract class j<IN, OUT> extends l<IN, OUT> {

    /* renamed from: h  reason: collision with root package name */
    private String f7470h;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.d
    public final Object a(b<OUT> bVar, IN in2) {
        new m(bVar);
        String a10 = a((j<IN, OUT>) in2);
        this.f7470h = a10;
        l.a aVar = this.f7472g.get(a10);
        while (aVar != null) {
            List<h> list = aVar.f7473a;
            try {
                Object a11 = c.a(list, bVar.f7467a, this).a((b) in2);
                return !l.a(list) ? a11 : bVar.a((b<OUT>) a11);
            } catch (i.a e10) {
                Throwable cause = e10.getCause();
                new m(bVar);
                String a12 = a(in2, cause, this.f7470h);
                this.f7470h = a12;
                aVar = this.f7472g.get(a12);
            } catch (Throwable th2) {
                new m(bVar);
                String a13 = a(in2, th2, this.f7470h);
                this.f7470h = a13;
                aVar = this.f7472g.get(a13);
            }
        }
        throw new IllegalArgumentException("can not found branch，branch name is：" + this.f7470h);
    }

    public abstract String a(IN in2);

    public abstract String a(IN in2, Throwable th2, String str);
}
