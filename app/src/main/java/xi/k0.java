package xi;

import android.graphics.BitmapFactory;
import java.io.ByteArrayInputStream;

/* compiled from: GDIComment.java */
/* loaded from: classes3.dex */
public final class k0 extends wi.e {
    public String c;

    public k0() {
        super(70);
        this.c = "";
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        k0 k0Var = new k0();
        int readUnsignedInt = (int) cVar.readUnsignedInt();
        int readUnsignedInt2 = (int) cVar.readUnsignedInt();
        if (readUnsignedInt2 == 726027589) {
            cVar.b(readUnsignedInt - 4);
            int i11 = readUnsignedInt % 4;
            if (i11 != 0) {
                cVar.h(4 - i11);
            }
        } else if (readUnsignedInt2 == 2) {
            cVar.m();
            int readUnsignedInt3 = (int) cVar.readUnsignedInt();
            if (readUnsignedInt3 > 0) {
                k0Var.c = new String(cVar.b(readUnsignedInt3));
            }
        } else if (readUnsignedInt2 != 3) {
            if (readUnsignedInt2 == 1073741828) {
                cVar.m();
                cVar.readUnsignedInt();
                int i12 = (readUnsignedInt - 4) - 8;
                k0Var.c = new String(cVar.h(i12));
                int i13 = i12 % 4;
                if (i13 != 0) {
                    cVar.h(4 - i13);
                }
            } else if (readUnsignedInt2 == -2147483647) {
                cVar.readUnsignedInt();
                cVar.readUnsignedInt();
                cVar.readUnsignedInt();
                BitmapFactory.decodeStream(new ByteArrayInputStream(cVar.b((int) cVar.readUnsignedInt())));
                return this;
            } else {
                int i14 = readUnsignedInt - 4;
                if (i14 > 0) {
                    k0Var.c = new String(cVar.h(i14));
                    int i15 = i14 % 4;
                    if (i15 != 0) {
                        cVar.h(4 - i15);
                    }
                } else {
                    this.c = "";
                }
            }
        }
        return k0Var;
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  length: " + this.c.length();
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
    }
}
