package x3;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import r3.a;
import x3.b;

/* compiled from: DiskLruCacheWrapper.java */
/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: b  reason: collision with root package name */
    public final File f31600b;
    public final long c;

    /* renamed from: e  reason: collision with root package name */
    public r3.a f31602e;

    /* renamed from: d  reason: collision with root package name */
    public final b f31601d = new b();

    /* renamed from: a  reason: collision with root package name */
    public final j f31599a = new j();

    @Deprecated
    public d(File file, long j10) {
        this.f31600b = file;
        this.c = j10;
    }

    @Override // x3.a
    public final File a(t3.b bVar) {
        String b10 = this.f31599a.b(bVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(bVar);
        }
        try {
            a.e h10 = b().h(b10);
            if (h10 != null) {
                return h10.f29459a[0];
            }
        } catch (IOException unused) {
            Log.isLoggable("DiskLruCacheWrapper", 5);
        }
        return null;
    }

    public final synchronized r3.a b() {
        if (this.f31602e == null) {
            this.f31602e = r3.a.j(this.f31600b, this.c);
        }
        return this.f31602e;
    }

    @Override // x3.a
    public final void f(t3.b bVar, v3.d dVar) {
        b.a aVar;
        boolean z10;
        String b10 = this.f31599a.b(bVar);
        b bVar2 = this.f31601d;
        synchronized (bVar2) {
            aVar = (b.a) bVar2.f31592a.get(b10);
            if (aVar == null) {
                aVar = bVar2.f31593b.a();
                bVar2.f31592a.put(b10, aVar);
            }
            aVar.f31595b++;
        }
        aVar.f31594a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(bVar);
            }
            try {
                r3.a b11 = b();
                if (b11.h(b10) == null) {
                    a.c d10 = b11.d(b10);
                    if (d10 != null) {
                        try {
                            if (dVar.f30503a.d(dVar.f30504b, d10.b(), dVar.c)) {
                                r3.a.a(r3.a.this, d10, true);
                                d10.c = true;
                            }
                            if (!z10) {
                                try {
                                    d10.a();
                                } catch (IOException unused) {
                                }
                            }
                        } finally {
                            if (!d10.c) {
                                try {
                                    d10.a();
                                } catch (IOException unused2) {
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(b10));
                    }
                }
            } catch (IOException unused3) {
                Log.isLoggable("DiskLruCacheWrapper", 5);
            }
        } finally {
            this.f31601d.a(b10);
        }
    }
}
