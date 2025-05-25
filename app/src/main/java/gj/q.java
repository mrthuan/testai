package gj;

/* compiled from: TitleView.java */
/* loaded from: classes3.dex */
public final class q extends ai.a {

    /* renamed from: p  reason: collision with root package name */
    public ai.e f17872p;

    public q(zh.h hVar) {
        this.f479a = hVar;
    }

    @Override // ai.a, ai.e
    public final void dispose() {
        super.dispose();
    }

    @Override // ai.a, ai.e
    public final lib.zj.office.system.f getControl() {
        ai.e eVar = this.f17872p;
        if (eVar != null) {
            return eVar.getControl();
        }
        return null;
    }

    @Override // ai.a, ai.e
    public final zh.g getDocument() {
        ai.e eVar = this.f17872p;
        if (eVar != null) {
            return eVar.getDocument();
        }
        return null;
    }

    @Override // ai.e
    public final short getType() {
        return (short) 12;
    }

    @Override // ai.a, ai.e
    public final xh.e n() {
        ai.e eVar = this.f17872p;
        if (eVar != null) {
            return eVar.n();
        }
        return null;
    }
}
