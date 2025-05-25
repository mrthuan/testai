package wk;

import java.util.ArrayList;

/* compiled from: PendingPost.java */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: d  reason: collision with root package name */
    public static final ArrayList f31335d = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public Object f31336a;

    /* renamed from: b  reason: collision with root package name */
    public m f31337b;
    public h c;

    public h(Object obj, m mVar) {
        this.f31336a = obj;
        this.f31337b = mVar;
    }

    public static h a(Object obj, m mVar) {
        ArrayList arrayList = f31335d;
        synchronized (arrayList) {
            int size = arrayList.size();
            if (size > 0) {
                h hVar = (h) arrayList.remove(size - 1);
                hVar.f31336a = obj;
                hVar.f31337b = mVar;
                hVar.c = null;
                return hVar;
            }
            return new h(obj, mVar);
        }
    }
}
