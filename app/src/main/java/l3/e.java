package l3;

import android.graphics.PointF;
import e3.k;
import g3.o;
import k3.l;

/* compiled from: RectangleShape.java */
/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f20459a;

    /* renamed from: b  reason: collision with root package name */
    public final l<PointF, PointF> f20460b;
    public final k3.f c;

    /* renamed from: d  reason: collision with root package name */
    public final k3.b f20461d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f20462e;

    public e(String str, l<PointF, PointF> lVar, k3.f fVar, k3.b bVar, boolean z10) {
        this.f20459a = str;
        this.f20460b = lVar;
        this.c = fVar;
        this.f20461d = bVar;
        this.f20462e = z10;
    }

    @Override // l3.b
    public final g3.c a(k kVar, com.airbnb.lottie.model.layer.a aVar) {
        return new o(kVar, aVar, this);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.f20460b + ", size=" + this.c + '}';
    }
}
