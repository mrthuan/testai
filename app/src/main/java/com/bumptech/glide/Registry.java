package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import h4.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k4.a;
import k4.c;
import k4.d;
import lib.zj.pdfeditor.Annotation;
import q4.a;
import z3.o;
import z3.p;
import z3.q;

/* loaded from: classes.dex */
public final class Registry {

    /* renamed from: a  reason: collision with root package name */
    public final q f6822a;

    /* renamed from: b  reason: collision with root package name */
    public final k4.a f6823b;
    public final k4.c c;

    /* renamed from: d  reason: collision with root package name */
    public final k4.d f6824d;

    /* renamed from: e  reason: collision with root package name */
    public final com.bumptech.glide.load.data.f f6825e;

    /* renamed from: f  reason: collision with root package name */
    public final h4.c f6826f;

    /* renamed from: g  reason: collision with root package name */
    public final androidx.core.content.e f6827g;

    /* renamed from: h  reason: collision with root package name */
    public final w1.f f6828h = new w1.f(2);

    /* renamed from: i  reason: collision with root package name */
    public final k4.b f6829i = new k4.b();

    /* renamed from: j  reason: collision with root package name */
    public final a.c f6830j;

    /* loaded from: classes.dex */
    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    /* loaded from: classes.dex */
    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(M m10, List<o<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m10);
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* loaded from: classes.dex */
    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* loaded from: classes.dex */
    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        a.c cVar = new a.c(new w0.e(20), new q4.b(), new q4.c());
        this.f6830j = cVar;
        this.f6822a = new q(cVar);
        this.f6823b = new k4.a();
        k4.c cVar2 = new k4.c();
        this.c = cVar2;
        this.f6824d = new k4.d();
        this.f6825e = new com.bumptech.glide.load.data.f();
        this.f6826f = new h4.c();
        this.f6827g = new androidx.core.content.e(4);
        List asList = Arrays.asList("Gif", Annotation.KEY_ANNOT_BMP, "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.addAll(asList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        synchronized (cVar2) {
            ArrayList arrayList2 = new ArrayList(cVar2.f19578a);
            cVar2.f19578a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cVar2.f19578a.add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (!arrayList.contains(str)) {
                    cVar2.f19578a.add(str);
                }
            }
        }
    }

    public final void a(Class cls, Class cls2, p pVar) {
        q qVar = this.f6822a;
        synchronized (qVar) {
            qVar.f32259a.a(cls, cls2, pVar);
            qVar.f32260b.f32261a.clear();
        }
    }

    public final void b(Class cls, t3.a aVar) {
        k4.a aVar2 = this.f6823b;
        synchronized (aVar2) {
            aVar2.f19573a.add(new a.C0262a(cls, aVar));
        }
    }

    public final void c(Class cls, t3.g gVar) {
        k4.d dVar = this.f6824d;
        synchronized (dVar) {
            dVar.f19582a.add(new d.a(cls, gVar));
        }
    }

    public final void d(t3.f fVar, Class cls, Class cls2, String str) {
        k4.c cVar = this.c;
        synchronized (cVar) {
            cVar.a(str).add(new c.a<>(cls, cls2, fVar));
        }
    }

    public final ArrayList e(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.c.b(cls, cls2).iterator();
        while (it.hasNext()) {
            Class cls4 = (Class) it.next();
            Iterator it2 = this.f6826f.b(cls4, cls3).iterator();
            while (it2.hasNext()) {
                Class cls5 = (Class) it2.next();
                k4.c cVar = this.c;
                synchronized (cVar) {
                    arrayList = new ArrayList();
                    Iterator it3 = cVar.f19578a.iterator();
                    while (it3.hasNext()) {
                        List<c.a> list = (List) cVar.f19579b.get((String) it3.next());
                        if (list != null) {
                            for (c.a aVar : list) {
                                if (aVar.f19580a.isAssignableFrom(cls) && cls4.isAssignableFrom(aVar.f19581b)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    arrayList.add(aVar.c);
                                }
                            }
                        }
                    }
                }
                arrayList2.add(new v3.e(cls, cls4, cls5, arrayList, this.f6826f.a(cls4, cls5), this.f6830j));
            }
        }
        return arrayList2;
    }

    public final List<ImageHeaderParser> f() {
        List<ImageHeaderParser> list;
        androidx.core.content.e eVar = this.f6827g;
        synchronized (eVar) {
            list = (List) eVar.f3529a;
        }
        if (!list.isEmpty()) {
            return list;
        }
        throw new NoImageHeaderParserException();
    }

    public final <Model> List<o<Model, ?>> g(Model model) {
        List<o<Model, ?>> list;
        q qVar = this.f6822a;
        qVar.getClass();
        Class<?> cls = model.getClass();
        synchronized (qVar) {
            q.a.C0428a c0428a = (q.a.C0428a) qVar.f32260b.f32261a.get(cls);
            if (c0428a == null) {
                list = null;
            } else {
                list = c0428a.f32262a;
            }
            if (list == null) {
                list = Collections.unmodifiableList(qVar.f32259a.b(cls));
                if (((q.a.C0428a) qVar.f32260b.f32261a.put(cls, new q.a.C0428a(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List<o<Model, ?>> emptyList = Collections.emptyList();
            boolean z10 = true;
            for (int i10 = 0; i10 < size; i10++) {
                o<Model, ?> oVar = list.get(i10);
                if (oVar.a(model)) {
                    if (z10) {
                        emptyList = new ArrayList<>(size - i10);
                        z10 = false;
                    }
                    emptyList.add(oVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new NoModelLoaderAvailableException(model, list);
        }
        throw new NoModelLoaderAvailableException(model);
    }

    public final void h(ImageHeaderParser imageHeaderParser) {
        androidx.core.content.e eVar = this.f6827g;
        synchronized (eVar) {
            ((List) eVar.f3529a).add(imageHeaderParser);
        }
    }

    public final void i(e.a aVar) {
        com.bumptech.glide.load.data.f fVar = this.f6825e;
        synchronized (fVar) {
            fVar.f6879a.put(aVar.a(), aVar);
        }
    }

    public final void j(Class cls, Class cls2, h4.b bVar) {
        h4.c cVar = this.f6826f;
        synchronized (cVar) {
            cVar.f18004a.add(new c.a(cls, cls2, bVar));
        }
    }
}
