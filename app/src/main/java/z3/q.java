package z3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import q4.a;

/* compiled from: ModelLoaderRegistry.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final s f32259a;

    /* renamed from: b  reason: collision with root package name */
    public final a f32260b;

    /* compiled from: ModelLoaderRegistry.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f32261a = new HashMap();

        /* compiled from: ModelLoaderRegistry.java */
        /* renamed from: z3.q$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0428a<Model> {

            /* renamed from: a  reason: collision with root package name */
            public final List<o<Model, ?>> f32262a;

            public C0428a(List<o<Model, ?>> list) {
                this.f32262a = list;
            }
        }
    }

    public q(a.c cVar) {
        s sVar = new s(cVar);
        this.f32260b = new a();
        this.f32259a = sVar;
    }

    public final synchronized ArrayList a(Class cls) {
        return this.f32259a.e(cls);
    }
}
