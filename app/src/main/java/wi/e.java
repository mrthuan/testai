package wi;

import a6.h;
import xi.l0;

/* compiled from: EMFTag.java */
/* loaded from: classes3.dex */
public abstract class e extends yi.c implements l0 {
    @Override // yi.c
    public final yi.c b(int i10, yi.e eVar, int i11) {
        return c((c) eVar, i11);
    }

    public abstract e c(c cVar, int i10);

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("EMFTag ");
        if (this.f32157b == null) {
            String name = getClass().getName();
            this.f32157b = name;
            int lastIndexOf = name.lastIndexOf(".");
            if (lastIndexOf >= 0) {
                str = this.f32157b.substring(lastIndexOf + 1);
            } else {
                str = this.f32157b;
            }
            this.f32157b = str;
        }
        sb2.append(this.f32157b);
        sb2.append(" (");
        return h.g(sb2, this.f32156a, ")");
    }

    @Override // xi.l0
    public void a(d dVar) {
    }
}
