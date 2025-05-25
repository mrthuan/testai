package l3;

import g3.p;
import k3.k;

/* compiled from: Repeater.java */
/* loaded from: classes.dex */
public final class f implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f20463a;

    /* renamed from: b  reason: collision with root package name */
    public final k3.b f20464b;
    public final k3.b c;

    /* renamed from: d  reason: collision with root package name */
    public final k f20465d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f20466e;

    public f(String str, k3.b bVar, k3.b bVar2, k kVar, boolean z10) {
        this.f20463a = str;
        this.f20464b = bVar;
        this.c = bVar2;
        this.f20465d = kVar;
        this.f20466e = z10;
    }

    @Override // l3.b
    public final g3.c a(e3.k kVar, com.airbnb.lottie.model.layer.a aVar) {
        return new p(kVar, aVar, this);
    }
}
