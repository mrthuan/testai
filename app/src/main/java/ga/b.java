package ga;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Component.java */
/* loaded from: classes2.dex */
public final class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f17703a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<q<? super T>> f17704b;
    public final Set<k> c;

    /* renamed from: d  reason: collision with root package name */
    public final int f17705d;

    /* renamed from: e  reason: collision with root package name */
    public final int f17706e;

    /* renamed from: f  reason: collision with root package name */
    public final e<T> f17707f;

    /* renamed from: g  reason: collision with root package name */
    public final Set<Class<?>> f17708g;

    /* compiled from: Component.java */
    /* loaded from: classes2.dex */
    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public String f17709a = null;

        /* renamed from: b  reason: collision with root package name */
        public final HashSet f17710b;
        public final HashSet c;

        /* renamed from: d  reason: collision with root package name */
        public int f17711d;

        /* renamed from: e  reason: collision with root package name */
        public int f17712e;

        /* renamed from: f  reason: collision with root package name */
        public e<T> f17713f;

        /* renamed from: g  reason: collision with root package name */
        public final HashSet f17714g;

        public a(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.f17710b = hashSet;
            this.c = new HashSet();
            this.f17711d = 0;
            this.f17712e = 0;
            this.f17714g = new HashSet();
            hashSet.add(q.a(cls));
            for (Class cls2 : clsArr) {
                if (cls2 != null) {
                    this.f17710b.add(q.a(cls2));
                } else {
                    throw new NullPointerException("Null interface");
                }
            }
        }

        public final void a(k kVar) {
            if (!this.f17710b.contains(kVar.f17729a)) {
                this.c.add(kVar);
                return;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        public final b<T> b() {
            boolean z10;
            if (this.f17713f != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return new b<>(this.f17709a, new HashSet(this.f17710b), new HashSet(this.c), this.f17711d, this.f17712e, this.f17713f, this.f17714g);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public final void c(int i10) {
            boolean z10;
            if (this.f17711d == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f17711d = i10;
                return;
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }
    }

    public b(String str, Set<q<? super T>> set, Set<k> set2, int i10, int i11, e<T> eVar, Set<Class<?>> set3) {
        this.f17703a = str;
        this.f17704b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.f17705d = i10;
        this.f17706e = i11;
        this.f17707f = eVar;
        this.f17708g = Collections.unmodifiableSet(set3);
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> b(final T t4, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(cls));
        for (Class<? super T> cls2 : clsArr) {
            if (cls2 != null) {
                hashSet.add(q.a(cls2));
            } else {
                throw new NullPointerException("Null interface");
            }
        }
        return new b<>(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new e() { // from class: ga.a
            @Override // ga.e
            public final Object a(r rVar) {
                return t4;
            }
        }, hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f17704b.toArray()) + ">{" + this.f17705d + ", type=" + this.f17706e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
