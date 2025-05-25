package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.c;
import com.bumptech.glide.load.engine.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import z3.o;

/* compiled from: SourceGenerator.java */
/* loaded from: classes.dex */
public final class i implements c, c.a {

    /* renamed from: a  reason: collision with root package name */
    public final d<?> f7029a;

    /* renamed from: b  reason: collision with root package name */
    public final c.a f7030b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public b f7031d;

    /* renamed from: e  reason: collision with root package name */
    public Object f7032e;

    /* renamed from: f  reason: collision with root package name */
    public volatile o.a<?> f7033f;

    /* renamed from: g  reason: collision with root package name */
    public v3.c f7034g;

    public i(d<?> dVar, c.a aVar) {
        this.f7029a = dVar;
        this.f7030b = aVar;
    }

    @Override // com.bumptech.glide.load.engine.c.a
    public final void a(t3.b bVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource) {
        this.f7030b.a(bVar, exc, dVar, this.f7033f.c.d());
    }

    @Override // com.bumptech.glide.load.engine.c
    public final boolean b() {
        boolean z10;
        boolean z11;
        Object obj = this.f7032e;
        if (obj != null) {
            this.f7032e = null;
            int i10 = p4.f.f23697a;
            SystemClock.elapsedRealtimeNanos();
            try {
                t3.a<X> d10 = this.f7029a.d(obj);
                v3.d dVar = new v3.d(d10, obj, this.f7029a.f6952i);
                t3.b bVar = this.f7033f.f32257a;
                d<?> dVar2 = this.f7029a;
                this.f7034g = new v3.c(bVar, dVar2.f6957n);
                ((e.c) dVar2.f6951h).a().f(this.f7034g, dVar);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Objects.toString(this.f7034g);
                    obj.toString();
                    d10.toString();
                    SystemClock.elapsedRealtimeNanos();
                }
                this.f7033f.c.b();
                this.f7031d = new b(Collections.singletonList(this.f7033f.f32257a), this.f7029a, this);
            } catch (Throwable th2) {
                this.f7033f.c.b();
                throw th2;
            }
        }
        b bVar2 = this.f7031d;
        if (bVar2 != null && bVar2.b()) {
            return true;
        }
        this.f7031d = null;
        this.f7033f = null;
        boolean z12 = false;
        while (!z12) {
            if (this.c < this.f7029a.b().size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            ArrayList b10 = this.f7029a.b();
            int i11 = this.c;
            this.c = i11 + 1;
            this.f7033f = (o.a) b10.get(i11);
            if (this.f7033f != null) {
                if (!this.f7029a.f6959p.c(this.f7033f.c.d())) {
                    if (this.f7029a.c(this.f7033f.c.a()) != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                    }
                }
                this.f7033f.c.e(this.f7029a.f6958o, new v3.o(this, this.f7033f));
                z12 = true;
            }
        }
        return z12;
    }

    @Override // com.bumptech.glide.load.engine.c.a
    public final void c(t3.b bVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource, t3.b bVar2) {
        this.f7030b.c(bVar, obj, dVar, this.f7033f.c.d(), bVar);
    }

    @Override // com.bumptech.glide.load.engine.c
    public final void cancel() {
        o.a<?> aVar = this.f7033f;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.c.a
    public final void d() {
        throw new UnsupportedOperationException();
    }
}
