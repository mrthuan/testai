package l3;

import android.graphics.PointF;
import e3.k;
import k3.l;

/* compiled from: CircleShape.java */
/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f20446a;

    /* renamed from: b  reason: collision with root package name */
    public final l<PointF, PointF> f20447b;
    public final k3.f c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f20448d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f20449e;

    public a(String str, l<PointF, PointF> lVar, k3.f fVar, boolean z10, boolean z11) {
        this.f20446a = str;
        this.f20447b = lVar;
        this.c = fVar;
        this.f20448d = z10;
        this.f20449e = z11;
    }

    @Override // l3.b
    public final g3.c a(k kVar, com.airbnb.lottie.model.layer.a aVar) {
        return new g3.f(kVar, aVar, this);
    }
}
