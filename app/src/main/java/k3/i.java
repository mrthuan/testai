package k3;

import android.graphics.PointF;
import java.util.List;

/* compiled from: AnimatableSplitDimensionPathValue.java */
/* loaded from: classes.dex */
public final class i implements l<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    public final b f19558a;

    /* renamed from: b  reason: collision with root package name */
    public final b f19559b;

    public i(b bVar, b bVar2) {
        this.f19558a = bVar;
        this.f19559b = bVar2;
    }

    @Override // k3.l
    public final h3.a<PointF, PointF> a() {
        return new h3.m((h3.c) this.f19558a.a(), (h3.c) this.f19559b.a());
    }

    @Override // k3.l
    public final List<q3.a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // k3.l
    public final boolean c() {
        if (this.f19558a.c() && this.f19559b.c()) {
            return true;
        }
        return false;
    }
}
