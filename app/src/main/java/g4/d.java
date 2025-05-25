package g4;

import android.graphics.Bitmap;
import g4.f;

/* compiled from: GifDrawableResource.java */
/* loaded from: classes.dex */
public final class d extends e4.b<c> {
    public d(c cVar) {
        super(cVar);
    }

    @Override // v3.l
    public final void a() {
        c cVar = (c) this.f16451a;
        cVar.stop();
        cVar.f17632d = true;
        f fVar = cVar.f17630a.f17639a;
        fVar.c.clear();
        Bitmap bitmap = fVar.f17651l;
        if (bitmap != null) {
            fVar.f17644e.d(bitmap);
            fVar.f17651l = null;
        }
        fVar.f17645f = false;
        f.a aVar = fVar.f17648i;
        com.bumptech.glide.f fVar2 = fVar.f17643d;
        if (aVar != null) {
            fVar2.k(aVar);
            fVar.f17648i = null;
        }
        f.a aVar2 = fVar.f17650k;
        if (aVar2 != null) {
            fVar2.k(aVar2);
            fVar.f17650k = null;
        }
        f.a aVar3 = fVar.f17653n;
        if (aVar3 != null) {
            fVar2.k(aVar3);
            fVar.f17653n = null;
        }
        fVar.f17641a.clear();
        fVar.f17649j = true;
    }

    @Override // v3.l
    public final Class<c> c() {
        return c.class;
    }

    @Override // v3.l
    public final int getSize() {
        f fVar = ((c) this.f16451a).f17630a.f17639a;
        return fVar.f17641a.f() + fVar.f17654o;
    }

    @Override // e4.b, v3.i
    public final void initialize() {
        ((c) this.f16451a).f17630a.f17639a.f17651l.prepareToDraw();
    }
}
