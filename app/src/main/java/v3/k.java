package v3;

import q4.a;
import q4.d;

/* compiled from: LockedResource.java */
/* loaded from: classes.dex */
public final class k<Z> implements l<Z>, a.d {

    /* renamed from: e  reason: collision with root package name */
    public static final a.c f30521e = q4.a.a(20, new a());

    /* renamed from: a  reason: collision with root package name */
    public final d.a f30522a = new d.a();

    /* renamed from: b  reason: collision with root package name */
    public l<Z> f30523b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f30524d;

    /* compiled from: LockedResource.java */
    /* loaded from: classes.dex */
    public class a implements a.b<k<?>> {
        @Override // q4.a.b
        public final k<?> a() {
            return new k<>();
        }
    }

    @Override // v3.l
    public final synchronized void a() {
        this.f30522a.a();
        this.f30524d = true;
        if (!this.c) {
            this.f30523b.a();
            this.f30523b = null;
            f30521e.a(this);
        }
    }

    @Override // q4.a.d
    public final d.a b() {
        return this.f30522a;
    }

    @Override // v3.l
    public final Class<Z> c() {
        return this.f30523b.c();
    }

    public final synchronized void d() {
        this.f30522a.a();
        if (this.c) {
            this.c = false;
            if (this.f30524d) {
                a();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @Override // v3.l
    public final Z get() {
        return this.f30523b.get();
    }

    @Override // v3.l
    public final int getSize() {
        return this.f30523b.getSize();
    }
}
