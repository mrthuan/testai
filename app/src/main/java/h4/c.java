package h4;

import java.util.ArrayList;
import java.util.Iterator;
import o9.d;

/* compiled from: TranscoderRegistry.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f18004a = new ArrayList();

    /* compiled from: TranscoderRegistry.java */
    /* loaded from: classes.dex */
    public static final class a<Z, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Z> f18005a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f18006b;
        public final b<Z, R> c;

        public a(Class<Z> cls, Class<R> cls2, b<Z, R> bVar) {
            this.f18005a = cls;
            this.f18006b = cls2;
            this.c = bVar;
        }
    }

    public final synchronized <Z, R> b<Z, R> a(Class<Z> cls, Class<R> cls2) {
        boolean z10;
        if (cls2.isAssignableFrom(cls)) {
            return d.f22760d;
        }
        Iterator it = this.f18004a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f18005a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f18006b)) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                return aVar.c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public final synchronized ArrayList b(Class cls, Class cls2) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f18004a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f18005a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f18006b)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
