package f2;

import java.util.ArrayList;

/* compiled from: FragmentTransitionSupport.java */
/* loaded from: classes.dex */
public final class g extends n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f17025a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f17026b;
    public final /* synthetic */ Object c = null;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f17027d = null;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f17028e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f17029f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f f17030g;

    public g(f fVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f17030g = fVar;
        this.f17025a = obj;
        this.f17026b = arrayList;
        this.f17028e = obj2;
        this.f17029f = arrayList2;
    }

    @Override // f2.k.d
    public final void c(k kVar) {
        kVar.x(this);
    }

    @Override // f2.n, f2.k.d
    public final void d() {
        f fVar = this.f17030g;
        Object obj = this.f17025a;
        if (obj != null) {
            fVar.s(obj, this.f17026b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            fVar.s(obj2, this.f17027d, null);
        }
        Object obj3 = this.f17028e;
        if (obj3 != null) {
            fVar.s(obj3, this.f17029f, null);
        }
    }
}
