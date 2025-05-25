package f9;

import f9.m;

/* compiled from: MaterialShapeDrawable.java */
/* loaded from: classes2.dex */
public final class i implements m.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float f17206a;

    public i(float f10) {
        this.f17206a = f10;
    }

    @Override // f9.m.b
    public final d a(d dVar) {
        if (!(dVar instanceof k)) {
            return new b(this.f17206a, dVar);
        }
        return dVar;
    }
}
