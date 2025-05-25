package l3;

import e3.k;
import g3.q;

/* compiled from: ShapePath.java */
/* loaded from: classes.dex */
public final class j implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f20476a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20477b;
    public final k3.h c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f20478d;

    public j(String str, int i10, k3.h hVar, boolean z10) {
        this.f20476a = str;
        this.f20477b = i10;
        this.c = hVar;
        this.f20478d = z10;
    }

    @Override // l3.b
    public final g3.c a(k kVar, com.airbnb.lottie.model.layer.a aVar) {
        return new q(kVar, aVar, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.f20476a);
        sb2.append(", index=");
        return androidx.activity.f.n(sb2, this.f20477b, '}');
    }
}
