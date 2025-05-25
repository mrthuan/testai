package c7;

/* compiled from: EventStoreModule_StoreConfigFactory.java */
/* loaded from: classes.dex */
public final class h implements x6.b<e> {

    /* compiled from: EventStoreModule_StoreConfigFactory.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final h f5638a = new h();
    }

    @Override // pf.a
    public final Object get() {
        c7.a aVar = e.f5635a;
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
