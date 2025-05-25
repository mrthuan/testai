package na;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: UserMetadata.java */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final e f22393a;

    /* renamed from: b  reason: collision with root package name */
    public final ma.g f22394b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final a f22395d = new a(false);

    /* renamed from: e  reason: collision with root package name */
    public final a f22396e = new a(true);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicMarkableReference<String> f22397f = new AtomicMarkableReference<>(null, false);

    /* compiled from: UserMetadata.java */
    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicMarkableReference<b> f22398a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReference<Callable<Void>> f22399b = new AtomicReference<>(null);
        public final boolean c;

        public a(boolean z10) {
            int i10;
            this.c = z10;
            if (z10) {
                i10 = 8192;
            } else {
                i10 = 1024;
            }
            this.f22398a = new AtomicMarkableReference<>(new b(i10), false);
        }
    }

    public i(String str, ra.d dVar, ma.g gVar) {
        this.c = str;
        this.f22393a = new e(dVar);
        this.f22394b = gVar;
    }

    public final void a(String str, String str2) {
        a aVar = this.f22395d;
        synchronized (aVar) {
            if (aVar.f22398a.getReference().c(str, str2)) {
                AtomicMarkableReference<b> atomicMarkableReference = aVar.f22398a;
                boolean z10 = true;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                t5.h hVar = new t5.h(aVar, 1);
                AtomicReference<Callable<Void>> atomicReference = aVar.f22399b;
                while (true) {
                    if (!atomicReference.compareAndSet(null, hVar)) {
                        if (atomicReference.get() != null) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z10) {
                    i.this.f22394b.a(hVar);
                }
            }
        }
    }
}
