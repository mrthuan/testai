package com.bykv.vk.openvk.preload.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: JsonArray.java */
/* loaded from: classes.dex */
public final class i extends k implements Iterable<k> {

    /* renamed from: a  reason: collision with root package name */
    private final List<k> f7443a = new ArrayList();

    public final void a(k kVar) {
        if (kVar == null) {
            kVar = m.f7444a;
        }
        this.f7443a.add(kVar);
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final String b() {
        if (this.f7443a.size() == 1) {
            return this.f7443a.get(0).b();
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final double c() {
        if (this.f7443a.size() == 1) {
            return this.f7443a.get(0).c();
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final long d() {
        if (this.f7443a.size() == 1) {
            return this.f7443a.get(0).d();
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final int e() {
        if (this.f7443a.size() == 1) {
            return this.f7443a.get(0).e();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof i) || !((i) obj).f7443a.equals(this.f7443a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final boolean f() {
        if (this.f7443a.size() == 1) {
            return this.f7443a.get(0).f();
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        return this.f7443a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<k> iterator() {
        return this.f7443a.iterator();
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final Number a() {
        if (this.f7443a.size() == 1) {
            return this.f7443a.get(0).a();
        }
        throw new IllegalStateException();
    }
}
