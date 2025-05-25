package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.p;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonTreeWriter.java */
/* loaded from: classes.dex */
public final class f extends com.bykv.vk.openvk.preload.a.d.c {

    /* renamed from: f  reason: collision with root package name */
    private static final Writer f7201f = new Writer() { // from class: com.bykv.vk.openvk.preload.a.b.a.f.1
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    };

    /* renamed from: g  reason: collision with root package name */
    private static final p f7202g = new p("closed");

    /* renamed from: a  reason: collision with root package name */
    public final List<com.bykv.vk.openvk.preload.a.k> f7203a;

    /* renamed from: b  reason: collision with root package name */
    public com.bykv.vk.openvk.preload.a.k f7204b;

    /* renamed from: h  reason: collision with root package name */
    private String f7205h;

    public f() {
        super(f7201f);
        this.f7203a = new ArrayList();
        this.f7204b = com.bykv.vk.openvk.preload.a.m.f7444a;
    }

    private void a(com.bykv.vk.openvk.preload.a.k kVar) {
        if (this.f7205h != null) {
            if (!(kVar instanceof com.bykv.vk.openvk.preload.a.m) || this.f7395e) {
                ((com.bykv.vk.openvk.preload.a.n) f()).a(this.f7205h, kVar);
            }
            this.f7205h = null;
        } else if (this.f7203a.isEmpty()) {
            this.f7204b = kVar;
        } else {
            com.bykv.vk.openvk.preload.a.k f10 = f();
            if (f10 instanceof com.bykv.vk.openvk.preload.a.i) {
                ((com.bykv.vk.openvk.preload.a.i) f10).a(kVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    private com.bykv.vk.openvk.preload.a.k f() {
        return (com.bykv.vk.openvk.preload.a.k) a0.a.f(this.f7203a, -1);
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c b() {
        if (!this.f7203a.isEmpty() && this.f7205h == null) {
            if (f() instanceof com.bykv.vk.openvk.preload.a.i) {
                List<com.bykv.vk.openvk.preload.a.k> list = this.f7203a;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c c() {
        com.bykv.vk.openvk.preload.a.n nVar = new com.bykv.vk.openvk.preload.a.n();
        a(nVar);
        this.f7203a.add(nVar);
        return this;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7203a.isEmpty()) {
            this.f7203a.add(f7202g);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c d() {
        if (!this.f7203a.isEmpty() && this.f7205h == null) {
            if (f() instanceof com.bykv.vk.openvk.preload.a.n) {
                List<com.bykv.vk.openvk.preload.a.k> list = this.f7203a;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c e() {
        a(com.bykv.vk.openvk.preload.a.m.f7444a);
        return this;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c b(String str) {
        if (str == null) {
            return e();
        }
        a(new p(str));
        return this;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c a() {
        com.bykv.vk.openvk.preload.a.i iVar = new com.bykv.vk.openvk.preload.a.i();
        a(iVar);
        this.f7203a.add(iVar);
        return this;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c a(String str) {
        if (str != null) {
            if (!this.f7203a.isEmpty() && this.f7205h == null) {
                if (f() instanceof com.bykv.vk.openvk.preload.a.n) {
                    this.f7205h = str;
                    return this;
                }
                throw new IllegalStateException();
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c a(boolean z10) {
        a(new p(Boolean.valueOf(z10)));
        return this;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c a(Boolean bool) {
        if (bool == null) {
            return e();
        }
        a(new p(bool));
        return this;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c, java.io.Flushable
    public final void flush() {
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c a(long j10) {
        a(new p(Long.valueOf(j10)));
        return this;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c a(Number number) {
        if (number == null) {
            return e();
        }
        if (!this.c) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: ".concat(String.valueOf(number)));
            }
        }
        a(new p(number));
        return this;
    }
}
