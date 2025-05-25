package l3;

import android.graphics.Path;
import com.airbnb.lottie.model.content.GradientType;
import e3.k;

/* compiled from: GradientFill.java */
/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final GradientType f20452a;

    /* renamed from: b  reason: collision with root package name */
    public final Path.FillType f20453b;
    public final k3.c c;

    /* renamed from: d  reason: collision with root package name */
    public final k3.d f20454d;

    /* renamed from: e  reason: collision with root package name */
    public final k3.f f20455e;

    /* renamed from: f  reason: collision with root package name */
    public final k3.f f20456f;

    /* renamed from: g  reason: collision with root package name */
    public final String f20457g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f20458h;

    public d(String str, GradientType gradientType, Path.FillType fillType, k3.c cVar, k3.d dVar, k3.f fVar, k3.f fVar2, boolean z10) {
        this.f20452a = gradientType;
        this.f20453b = fillType;
        this.c = cVar;
        this.f20454d = dVar;
        this.f20455e = fVar;
        this.f20456f = fVar2;
        this.f20457g = str;
        this.f20458h = z10;
    }

    @Override // l3.b
    public final g3.c a(k kVar, com.airbnb.lottie.model.layer.a aVar) {
        return new g3.h(kVar, aVar, this);
    }
}
