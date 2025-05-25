package z3;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import z3.o;

/* compiled from: MultiModelLoader.java */
/* loaded from: classes.dex */
public final class r<Model, Data> implements o<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final List<o<Model, Data>> f32263a;

    /* renamed from: b  reason: collision with root package name */
    public final w0.d<List<Throwable>> f32264b;

    /* compiled from: MultiModelLoader.java */
    /* loaded from: classes.dex */
    public static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final List<com.bumptech.glide.load.data.d<Data>> f32265a;

        /* renamed from: b  reason: collision with root package name */
        public final w0.d<List<Throwable>> f32266b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public Priority f32267d;

        /* renamed from: e  reason: collision with root package name */
        public d.a<? super Data> f32268e;

        /* renamed from: f  reason: collision with root package name */
        public List<Throwable> f32269f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f32270g;

        public a(ArrayList arrayList, w0.d dVar) {
            this.f32266b = dVar;
            if (!arrayList.isEmpty()) {
                this.f32265a = arrayList;
                this.c = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            return this.f32265a.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            List<Throwable> list = this.f32269f;
            if (list != null) {
                this.f32266b.a(list);
            }
            this.f32269f = null;
            for (com.bumptech.glide.load.data.d<Data> dVar : this.f32265a) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public final void c(Exception exc) {
            List<Throwable> list = this.f32269f;
            com.google.android.play.core.assetpacks.c.l(list);
            list.add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
            this.f32270g = true;
            for (com.bumptech.glide.load.data.d<Data> dVar : this.f32265a) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final DataSource d() {
            return this.f32265a.get(0).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(Priority priority, d.a<? super Data> aVar) {
            this.f32267d = priority;
            this.f32268e = aVar;
            this.f32269f = this.f32266b.b();
            this.f32265a.get(this.c).e(priority, this);
            if (this.f32270g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public final void f(Data data) {
            if (data != null) {
                this.f32268e.f(data);
            } else {
                g();
            }
        }

        public final void g() {
            if (this.f32270g) {
                return;
            }
            if (this.c < this.f32265a.size() - 1) {
                this.c++;
                e(this.f32267d, this.f32268e);
                return;
            }
            com.google.android.play.core.assetpacks.c.l(this.f32269f);
            this.f32268e.c(new GlideException("Fetch failed", new ArrayList(this.f32269f)));
        }
    }

    public r(ArrayList arrayList, w0.d dVar) {
        this.f32263a = arrayList;
        this.f32264b = dVar;
    }

    @Override // z3.o
    public final boolean a(Model model) {
        for (o<Model, Data> oVar : this.f32263a) {
            if (oVar.a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // z3.o
    public final o.a<Data> b(Model model, int i10, int i11, t3.e eVar) {
        o.a<Data> b10;
        List<o<Model, Data>> list = this.f32263a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        t3.b bVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            o<Model, Data> oVar = list.get(i12);
            if (oVar.a(model) && (b10 = oVar.b(model, i10, i11, eVar)) != null) {
                arrayList.add(b10.c);
                bVar = b10.f32257a;
            }
        }
        if (arrayList.isEmpty() || bVar == null) {
            return null;
        }
        return new o.a<>(bVar, new a(arrayList, this.f32264b));
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f32263a.toArray()) + '}';
    }
}
