package z3;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import z3.o;

/* compiled from: UnitModelLoader.java */
/* loaded from: classes.dex */
public final class v<Model> implements o<Model, Model> {

    /* renamed from: a  reason: collision with root package name */
    public static final v<?> f32285a = new v<>();

    /* compiled from: UnitModelLoader.java */
    /* loaded from: classes.dex */
    public static class a<Model> implements p<Model, Model> {

        /* renamed from: a  reason: collision with root package name */
        public static final a<?> f32286a = new a<>();

        @Override // z3.p
        public final o<Model, Model> b(s sVar) {
            return v.f32285a;
        }
    }

    @Override // z3.o
    public final boolean a(Model model) {
        return true;
    }

    @Override // z3.o
    public final o.a<Model> b(Model model, int i10, int i11, t3.e eVar) {
        return new o.a<>(new o4.d(model), new b(model));
    }

    /* compiled from: UnitModelLoader.java */
    /* loaded from: classes.dex */
    public static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* renamed from: a  reason: collision with root package name */
        public final Model f32287a;

        public b(Model model) {
            this.f32287a = model;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Model> a() {
            return (Class<Model>) this.f32287a.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public final DataSource d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(Priority priority, d.a<? super Model> aVar) {
            aVar.f((Model) this.f32287a);
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
