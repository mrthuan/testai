package z3;

import java.util.Collections;
import java.util.List;

/* compiled from: ModelLoader.java */
/* loaded from: classes.dex */
public interface o<Model, Data> {

    /* compiled from: ModelLoader.java */
    /* loaded from: classes.dex */
    public static class a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final t3.b f32257a;

        /* renamed from: b  reason: collision with root package name */
        public final List<t3.b> f32258b;
        public final com.bumptech.glide.load.data.d<Data> c;

        public a() {
            throw null;
        }

        public a(t3.b bVar, com.bumptech.glide.load.data.d<Data> dVar) {
            List<t3.b> emptyList = Collections.emptyList();
            com.google.android.play.core.assetpacks.c.l(bVar);
            this.f32257a = bVar;
            com.google.android.play.core.assetpacks.c.l(emptyList);
            this.f32258b = emptyList;
            com.google.android.play.core.assetpacks.c.l(dVar);
            this.c = dVar;
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i10, int i11, t3.e eVar);
}
