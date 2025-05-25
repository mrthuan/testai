package h3;

import androidx.activity.s;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseKeyframeAnimation.java */
/* loaded from: classes.dex */
public abstract class a<K, A> {
    public final c<K> c;

    /* renamed from: e  reason: collision with root package name */
    public n3.a f17963e;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f17960a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    public boolean f17961b = false;

    /* renamed from: d  reason: collision with root package name */
    public float f17962d = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    public A f17964f = null;

    /* renamed from: g  reason: collision with root package name */
    public float f17965g = -1.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f17966h = -1.0f;

    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: h3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0242a {
        void a();
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public static final class b<T> implements c<T> {
        @Override // h3.a.c
        public final boolean a(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // h3.a.c
        public final q3.a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // h3.a.c
        public final boolean c(float f10) {
            return false;
        }

        @Override // h3.a.c
        public final float d() {
            return 1.0f;
        }

        @Override // h3.a.c
        public final float e() {
            return 0.0f;
        }

        @Override // h3.a.c
        public final boolean isEmpty() {
            return true;
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public interface c<T> {
        boolean a(float f10);

        q3.a<T> b();

        boolean c(float f10);

        float d();

        float e();

        boolean isEmpty();
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public static final class d<T> implements c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final List<? extends q3.a<T>> f17967a;
        public q3.a<T> c = null;

        /* renamed from: d  reason: collision with root package name */
        public float f17969d = -1.0f;

        /* renamed from: b  reason: collision with root package name */
        public q3.a<T> f17968b = f(0.0f);

        public d(List<? extends q3.a<T>> list) {
            this.f17967a = list;
        }

        @Override // h3.a.c
        public final boolean a(float f10) {
            q3.a<T> aVar = this.c;
            q3.a<T> aVar2 = this.f17968b;
            if (aVar == aVar2 && this.f17969d == f10) {
                return true;
            }
            this.c = aVar2;
            this.f17969d = f10;
            return false;
        }

        @Override // h3.a.c
        public final q3.a<T> b() {
            return this.f17968b;
        }

        @Override // h3.a.c
        public final boolean c(float f10) {
            boolean z10;
            q3.a<T> aVar = this.f17968b;
            if (f10 >= aVar.b() && f10 < aVar.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return !this.f17968b.c();
            }
            this.f17968b = f(f10);
            return true;
        }

        @Override // h3.a.c
        public final float d() {
            return ((q3.a) a0.a.f(this.f17967a, -1)).a();
        }

        @Override // h3.a.c
        public final float e() {
            return this.f17967a.get(0).b();
        }

        public final q3.a<T> f(float f10) {
            List<? extends q3.a<T>> list = this.f17967a;
            q3.a<T> aVar = list.get(list.size() - 1);
            if (f10 >= aVar.b()) {
                return aVar;
            }
            int size = list.size() - 2;
            while (true) {
                boolean z10 = false;
                if (size >= 1) {
                    q3.a<T> aVar2 = list.get(size);
                    if (this.f17968b != aVar2) {
                        if (f10 >= aVar2.b() && f10 < aVar2.a()) {
                            z10 = true;
                        }
                        if (z10) {
                            return aVar2;
                        }
                    }
                    size--;
                } else {
                    return list.get(0);
                }
            }
        }

        @Override // h3.a.c
        public final boolean isEmpty() {
            return false;
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public static final class e<T> implements c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final q3.a<T> f17970a;

        /* renamed from: b  reason: collision with root package name */
        public float f17971b = -1.0f;

        public e(List<? extends q3.a<T>> list) {
            this.f17970a = list.get(0);
        }

        @Override // h3.a.c
        public final boolean a(float f10) {
            if (this.f17971b == f10) {
                return true;
            }
            this.f17971b = f10;
            return false;
        }

        @Override // h3.a.c
        public final q3.a<T> b() {
            return this.f17970a;
        }

        @Override // h3.a.c
        public final boolean c(float f10) {
            return !this.f17970a.c();
        }

        @Override // h3.a.c
        public final float d() {
            return this.f17970a.a();
        }

        @Override // h3.a.c
        public final float e() {
            return this.f17970a.b();
        }

        @Override // h3.a.c
        public final boolean isEmpty() {
            return false;
        }
    }

    public a(List<? extends q3.a<K>> list) {
        c dVar;
        c cVar;
        if (list.isEmpty()) {
            cVar = new b();
        } else {
            if (list.size() == 1) {
                dVar = new e(list);
            } else {
                dVar = new d(list);
            }
            cVar = dVar;
        }
        this.c = cVar;
    }

    public final void a(InterfaceC0242a interfaceC0242a) {
        this.f17960a.add(interfaceC0242a);
    }

    public final q3.a<K> b() {
        q3.a<K> b10 = this.c.b();
        s.y();
        return b10;
    }

    public float c() {
        if (this.f17966h == -1.0f) {
            this.f17966h = this.c.d();
        }
        return this.f17966h;
    }

    public final float d() {
        q3.a<K> b10 = b();
        if (b10.c()) {
            return 0.0f;
        }
        return b10.f29066d.getInterpolation(e());
    }

    public final float e() {
        if (this.f17961b) {
            return 0.0f;
        }
        q3.a<K> b10 = b();
        if (b10.c()) {
            return 0.0f;
        }
        return (this.f17962d - b10.b()) / (b10.a() - b10.b());
    }

    public A f() {
        float d10 = d();
        if (this.f17963e == null && this.c.a(d10)) {
            return this.f17964f;
        }
        A g10 = g(b(), d10);
        this.f17964f = g10;
        return g10;
    }

    public abstract A g(q3.a<K> aVar, float f10);

    public void h() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f17960a;
            if (i10 < arrayList.size()) {
                ((InterfaceC0242a) arrayList.get(i10)).a();
                i10++;
            } else {
                return;
            }
        }
    }

    public void i(float f10) {
        c<K> cVar = this.c;
        if (cVar.isEmpty()) {
            return;
        }
        if (this.f17965g == -1.0f) {
            this.f17965g = cVar.e();
        }
        float f11 = this.f17965g;
        if (f10 < f11) {
            if (f11 == -1.0f) {
                this.f17965g = cVar.e();
            }
            f10 = this.f17965g;
        } else if (f10 > c()) {
            f10 = c();
        }
        if (f10 == this.f17962d) {
            return;
        }
        this.f17962d = f10;
        if (cVar.c(f10)) {
            h();
        }
    }

    public final void j(n3.a aVar) {
        n3.a aVar2 = this.f17963e;
        if (aVar2 != null) {
            aVar2.f22332b = null;
        }
        this.f17963e = aVar;
        if (aVar != null) {
            aVar.f22332b = this;
        }
    }
}
