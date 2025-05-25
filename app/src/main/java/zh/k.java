package zh;

/* compiled from: STDocument.java */
/* loaded from: classes3.dex */
public class k implements g {

    /* renamed from: a  reason: collision with root package name */
    public l f32390a;

    @Override // zh.g
    public h a(long j10) {
        return null;
    }

    @Override // zh.g
    public final String b(long j10, long j11) {
        long b10;
        long b11;
        if (j11 - j10 != 0 && (j10 & (-1152921504606846976L)) == ((-1152921504606846976L) & j11)) {
            h f10 = f(j10);
            String text = f10.getText();
            int b12 = (int) (j10 - f10.b());
            if (j11 >= f10.a()) {
                b10 = text.length();
            } else {
                b10 = j11 - f10.b();
            }
            String substring = text.substring(b12, (int) b10);
            long a10 = f10.a();
            while (a10 < j11) {
                h f11 = f(a10);
                String text2 = f11.getText();
                if (j11 >= f11.a()) {
                    b11 = text2.length();
                } else {
                    b11 = j11 - f11.b();
                }
                String substring2 = text2.substring(0, (int) b11);
                a10 = f11.a();
                substring = substring2;
            }
            return substring;
        }
        return "";
    }

    @Override // zh.g
    public h c(int i10) {
        return this.f32390a.f32391e.d(i10);
    }

    @Override // zh.g
    public final long d() {
        return k() + 0;
    }

    @Override // zh.g
    public void dispose() {
        l lVar = this.f32390a;
        if (lVar != null) {
            lVar.dispose();
        }
    }

    @Override // zh.g
    public int e(long j10) {
        return this.f32390a.f32391e.f32384a;
    }

    @Override // zh.g
    public final h f(long j10) {
        h g10 = g(j10);
        if (g10 != null) {
            return ((j) g10).g(j10);
        }
        return null;
    }

    @Override // zh.g
    public h g(long j10) {
        return this.f32390a.f32391e.c(j10);
    }

    @Override // zh.g
    public void h(h hVar) {
        this.f32390a = (l) hVar;
    }

    @Override // zh.g
    public h i() {
        return this.f32390a;
    }

    @Override // zh.g
    public void j(h hVar, long j10) {
        this.f32390a.e((a) hVar);
    }

    public long k() {
        l lVar = this.f32390a;
        return lVar.f32372b - lVar.f32371a;
    }
}
