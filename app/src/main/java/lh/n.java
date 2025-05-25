package lh;

/* compiled from: TextBox.java */
/* loaded from: classes.dex */
public final class n extends b {

    /* renamed from: m  reason: collision with root package name */
    public boolean f20642m;

    /* renamed from: n  reason: collision with root package name */
    public zh.l f20643n;

    /* renamed from: o  reason: collision with root package name */
    public ai.h f20644o;

    /* renamed from: p  reason: collision with root package name */
    public byte f20645p = 0;

    /* renamed from: q  reason: collision with root package name */
    public boolean f20646q;

    public n() {
        this.f20611l = -1;
    }

    @Override // lh.b, lh.g
    public final void dispose() {
        super.dispose();
        zh.l lVar = this.f20643n;
        if (lVar != null) {
            lVar.dispose();
        }
    }

    @Override // lh.b, lh.g
    public final short getType() {
        return (short) 1;
    }
}
