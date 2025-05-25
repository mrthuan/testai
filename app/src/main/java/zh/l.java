package zh;

/* compiled from: SectionElement.java */
/* loaded from: classes3.dex */
public final class l extends a {

    /* renamed from: e  reason: collision with root package name */
    public final e f32391e = new e(10);

    @Override // zh.a, zh.h
    public final void dispose() {
        super.dispose();
        e eVar = this.f32391e;
        if (eVar != null) {
            eVar.b();
        }
    }

    public final void e(a aVar) {
        this.f32391e.a(aVar);
    }

    @Override // zh.a, zh.h
    public final String getText() {
        e eVar = this.f32391e;
        int i10 = eVar.f32384a;
        String str = "";
        for (int i11 = 0; i11 < i10; i11++) {
            StringBuilder k10 = a0.a.k(str);
            k10.append(eVar.d(i11).getText());
            str = k10.toString();
        }
        return str;
    }

    @Override // zh.a, zh.h
    public final short getType() {
        return (short) 0;
    }
}
