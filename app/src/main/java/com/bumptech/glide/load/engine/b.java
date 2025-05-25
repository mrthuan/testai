package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.c;
import com.bumptech.glide.load.engine.e;
import java.io.File;
import java.util.List;
import z3.o;

/* compiled from: DataCacheGenerator.java */
/* loaded from: classes.dex */
public final class b implements c, d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final List<t3.b> f6937a;

    /* renamed from: b  reason: collision with root package name */
    public final d<?> f6938b;
    public final c.a c;

    /* renamed from: d  reason: collision with root package name */
    public int f6939d = -1;

    /* renamed from: e  reason: collision with root package name */
    public t3.b f6940e;

    /* renamed from: f  reason: collision with root package name */
    public List<o<File, ?>> f6941f;

    /* renamed from: g  reason: collision with root package name */
    public int f6942g;

    /* renamed from: h  reason: collision with root package name */
    public volatile o.a<?> f6943h;

    /* renamed from: i  reason: collision with root package name */
    public File f6944i;

    public b(List<t3.b> list, d<?> dVar, c.a aVar) {
        this.f6937a = list;
        this.f6938b = dVar;
        this.c = aVar;
    }

    @Override // com.bumptech.glide.load.engine.c
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        while (true) {
            List<o<File, ?>> list = this.f6941f;
            if (list != null) {
                if (this.f6942g < list.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f6943h = null;
                    boolean z13 = false;
                    while (!z13) {
                        if (this.f6942g < this.f6941f.size()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            break;
                        }
                        List<o<File, ?>> list2 = this.f6941f;
                        int i10 = this.f6942g;
                        this.f6942g = i10 + 1;
                        File file = this.f6944i;
                        d<?> dVar = this.f6938b;
                        this.f6943h = list2.get(i10).b(file, dVar.f6948e, dVar.f6949f, dVar.f6952i);
                        if (this.f6943h != null) {
                            if (this.f6938b.c(this.f6943h.c.a()) != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                this.f6943h.c.e(this.f6938b.f6958o, this);
                                z13 = true;
                            }
                        }
                    }
                    return z13;
                }
            }
            int i11 = this.f6939d + 1;
            this.f6939d = i11;
            if (i11 >= this.f6937a.size()) {
                return false;
            }
            t3.b bVar = this.f6937a.get(this.f6939d);
            d<?> dVar2 = this.f6938b;
            File a10 = ((e.c) dVar2.f6951h).a().a(new v3.c(bVar, dVar2.f6957n));
            this.f6944i = a10;
            if (a10 != null) {
                this.f6940e = bVar;
                this.f6941f = this.f6938b.c.f6842b.g(a10);
                this.f6942g = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void c(Exception exc) {
        this.c.a(this.f6940e, exc, this.f6943h.c, DataSource.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.c
    public final void cancel() {
        o.a<?> aVar = this.f6943h;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void f(Object obj) {
        this.c.c(this.f6940e, obj, this.f6943h.c, DataSource.DATA_DISK_CACHE, this.f6940e);
    }
}
