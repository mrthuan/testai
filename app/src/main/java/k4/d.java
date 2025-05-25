package k4;

import java.util.ArrayList;
import t3.g;

/* compiled from: ResourceEncoderRegistry.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f19582a = new ArrayList();

    /* compiled from: ResourceEncoderRegistry.java */
    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f19583a;

        /* renamed from: b  reason: collision with root package name */
        public final g<T> f19584b;

        public a(Class<T> cls, g<T> gVar) {
            this.f19583a = cls;
            this.f19584b = gVar;
        }
    }

    public final synchronized <Z> g<Z> a(Class<Z> cls) {
        int size = this.f19582a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) this.f19582a.get(i10);
            if (aVar.f19583a.isAssignableFrom(cls)) {
                return (g<Z>) aVar.f19584b;
            }
        }
        return null;
    }
}
