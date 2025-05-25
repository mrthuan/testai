package zh;

/* compiled from: ParagraphElement.java */
/* loaded from: classes3.dex */
public class j extends a {

    /* renamed from: e  reason: collision with root package name */
    public final e f32389e = new e(10);

    @Override // zh.a, zh.h
    public void dispose() {
        super.dispose();
        e eVar = this.f32389e;
        if (eVar != null) {
            eVar.b();
        }
    }

    public void e(i iVar) {
        this.f32389e.a(iVar);
    }

    public h f(int i10) {
        return this.f32389e.d(0);
    }

    public h g(long j10) {
        return this.f32389e.c(j10);
    }

    @Override // zh.a, zh.h
    public String getText() {
        e eVar = this.f32389e;
        int i10 = eVar.f32384a;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(eVar.d(i11).getText());
        }
        return sb2.toString();
    }
}
