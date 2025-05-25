package xi;

import android.graphics.Matrix;
import lib.zj.office.java.awt.geom.GeneralPath;
import lib.zj.office.java.awt.geom.c;

/* compiled from: AbstractClipPath.java */
/* loaded from: classes3.dex */
public abstract class c extends wi.e {
    public final int c;

    public c(int i10, int i11) {
        super(i10);
        this.c = i11;
    }

    public final void d(wi.d dVar, lib.zj.office.java.awt.b bVar) {
        if (bVar != null) {
            int i10 = this.c;
            if (i10 == 1) {
                dVar.b(bVar);
            } else if (i10 == 5) {
                Matrix matrix = dVar.f31236g.getMatrix();
                dVar.i(dVar.f31236g);
                dVar.j(dVar.f31235f);
                dVar.f31236g.setMatrix(matrix);
                dVar.b(bVar);
            } else if (i10 == 4) {
                lib.zj.office.java.awt.geom.b bVar2 = dVar.f31254y;
                if (bVar2 != null) {
                    lib.zj.office.java.awt.geom.b bVar3 = new lib.zj.office.java.awt.geom.b(bVar);
                    bVar3.f20742a = new c.e().b(bVar3.f20742a, new lib.zj.office.java.awt.geom.b(bVar2).f20742a);
                    bVar3.f20743b = null;
                    dVar.j(bVar3);
                } else {
                    dVar.j(bVar);
                }
            } else if (i10 == 2) {
                GeneralPath generalPath = new GeneralPath(bVar);
                lib.zj.office.java.awt.geom.b bVar4 = dVar.f31254y;
                if (bVar4 != null) {
                    generalPath.append((lib.zj.office.java.awt.b) bVar4, false);
                }
                dVar.j(generalPath);
            } else if (i10 == 3) {
                lib.zj.office.java.awt.geom.b bVar5 = dVar.f31254y;
                if (bVar5 != null) {
                    lib.zj.office.java.awt.geom.b bVar6 = new lib.zj.office.java.awt.geom.b(bVar);
                    bVar6.f20742a = new c.f().b(bVar6.f20742a, new lib.zj.office.java.awt.geom.b(bVar5).f20742a);
                    bVar6.f20743b = null;
                    dVar.j(bVar6);
                } else {
                    dVar.j(bVar);
                }
            }
        }
        dVar.f31250u = null;
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  mode: " + this.c;
    }
}
