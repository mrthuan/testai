package z3;

import java.util.ArrayDeque;

/* compiled from: ModelCache.java */
/* loaded from: classes.dex */
public final class n<A, B> {

    /* renamed from: a  reason: collision with root package name */
    public final m f32253a = new m();

    /* compiled from: ModelCache.java */
    /* loaded from: classes.dex */
    public static final class a<A> {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayDeque f32254d;

        /* renamed from: a  reason: collision with root package name */
        public int f32255a;

        /* renamed from: b  reason: collision with root package name */
        public int f32256b;
        public A c;

        static {
            char[] cArr = p4.j.f23703a;
            f32254d = new ArrayDeque(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(Object obj) {
            a aVar;
            ArrayDeque arrayDeque = f32254d;
            synchronized (arrayDeque) {
                aVar = (a) arrayDeque.poll();
            }
            if (aVar == null) {
                aVar = new a();
            }
            aVar.c = obj;
            aVar.f32256b = 0;
            aVar.f32255a = 0;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f32256b != aVar.f32256b || this.f32255a != aVar.f32255a || !this.c.equals(aVar.c)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.c.hashCode() + (((this.f32255a * 31) + this.f32256b) * 31);
        }
    }
}
