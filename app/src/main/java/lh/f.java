package lh;

import java.util.ArrayList;

/* compiled from: GroupShape.java */
/* loaded from: classes.dex */
public class f extends b {

    /* renamed from: m  reason: collision with root package name */
    public int f20618m;

    /* renamed from: n  reason: collision with root package name */
    public int f20619n;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f20620o = new ArrayList();

    @Override // lh.b, lh.g
    public final short getType() {
        return (short) 7;
    }

    public final void q(g gVar) {
        this.f20620o.add(gVar);
    }

    public final g[] r() {
        ArrayList arrayList = this.f20620o;
        return (g[]) arrayList.toArray(new g[arrayList.size()]);
    }
}
