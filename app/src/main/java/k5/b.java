package k5;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.Vector;
import lib.zj.office.java.awt.geom.AffineTransform;
import lib.zj.office.java.awt.geom.e;
import lib.zj.office.java.awt.geom.p;

/* compiled from: LogItem.java */
/* loaded from: classes.dex */
public final class b implements p {

    /* renamed from: a  reason: collision with root package name */
    public int f19594a;

    /* renamed from: b  reason: collision with root package name */
    public final Serializable f19595b;
    public final Serializable c;

    /* renamed from: d  reason: collision with root package name */
    public Object f19596d;

    /* renamed from: e  reason: collision with root package name */
    public Object f19597e;

    public b(Vector vector, AffineTransform affineTransform) {
        this.c = vector;
        this.f19595b = affineTransform;
        if (vector.size() >= 1) {
            this.f19597e = (e) vector.get(0);
        }
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final int a(double[] dArr) {
        int i10;
        int i11 = 1;
        if (((e) this.f19596d) != null) {
            Object obj = this.f19597e;
            if (((e) obj) != null && ((e) obj).j() != 0) {
                dArr[0] = ((e) this.f19597e).n();
                dArr[1] = ((e) this.f19597e).s();
                i10 = 1;
            } else {
                return 4;
            }
        } else {
            Object obj2 = this.f19597e;
            if (((e) obj2) != null) {
                int l10 = ((e) obj2).l(dArr);
                int j10 = ((e) this.f19597e).j();
                if (j10 == 0) {
                    i10 = 1;
                    i11 = l10;
                } else {
                    i11 = l10;
                    i10 = j10;
                }
            } else {
                throw new NoSuchElementException("area iterator out of bounds");
            }
        }
        Serializable serializable = this.f19595b;
        if (((AffineTransform) serializable) != null) {
            ((AffineTransform) serializable).transform(dArr, 0, dArr, 0, i10);
        }
        return i11;
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final int b(float[] fArr) {
        int i10;
        double[] dArr = new double[6];
        int a10 = a(dArr);
        int i11 = 0;
        if (a10 == 4) {
            i10 = 0;
        } else if (a10 == 2) {
            i10 = 0;
            i11 = 2;
        } else {
            int i12 = 3;
            if (a10 != 3) {
                i12 = 1;
            }
            i11 = i12;
            i10 = 0;
        }
        while (i10 < i11 * 2) {
            fArr[i10] = (float) dArr[i10];
            i10++;
        }
        return a10;
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final int c() {
        return 1;
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final boolean isDone() {
        if (((e) this.f19596d) == null && ((e) this.f19597e) == null) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final void next() {
        if (((e) this.f19596d) != null) {
            this.f19596d = null;
            return;
        }
        this.f19596d = (e) this.f19597e;
        int i10 = this.f19594a + 1;
        this.f19594a = i10;
        Serializable serializable = this.c;
        if (i10 < ((Vector) serializable).size()) {
            e eVar = (e) ((Vector) serializable).get(this.f19594a);
            this.f19597e = eVar;
            if (eVar.j() != 0 && ((e) this.f19596d).o() == ((e) this.f19597e).n() && ((e) this.f19596d).t() == ((e) this.f19597e).s()) {
                this.f19596d = null;
                return;
            }
            return;
        }
        this.f19597e = null;
    }
}
