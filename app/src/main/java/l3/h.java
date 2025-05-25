package l3;

import android.graphics.Path;
import e3.k;

/* compiled from: ShapeFill.java */
/* loaded from: classes.dex */
public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f20469a;

    /* renamed from: b  reason: collision with root package name */
    public final Path.FillType f20470b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final k3.a f20471d;

    /* renamed from: e  reason: collision with root package name */
    public final k3.d f20472e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f20473f;

    public h(String str, boolean z10, Path.FillType fillType, k3.a aVar, k3.d dVar, boolean z11) {
        this.c = str;
        this.f20469a = z10;
        this.f20470b = fillType;
        this.f20471d = aVar;
        this.f20472e = dVar;
        this.f20473f = z11;
    }

    @Override // l3.b
    public final g3.c a(k kVar, com.airbnb.lottie.model.layer.a aVar) {
        return new g3.g(kVar, aVar, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f20469a + '}';
    }
}
