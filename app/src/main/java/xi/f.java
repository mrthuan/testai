package xi;

import android.graphics.Canvas;
import android.graphics.Point;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.geom.GeneralPath;

/* compiled from: AbstractPolyPolygon.java */
/* loaded from: classes3.dex */
public abstract class f extends wi.e {
    public final Rectangle c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f31699d;

    /* renamed from: e  reason: collision with root package name */
    public final Point[][] f31700e;

    public f(int i10, Rectangle rectangle, int[] iArr, Point[][] pointArr) {
        super(i10);
        this.c = rectangle;
        this.f31699d = iArr;
        this.f31700e = pointArr;
    }

    @Override // wi.e, xi.l0
    public void a(wi.d dVar) {
        d(dVar, true);
    }

    public final void d(wi.d dVar, boolean z10) {
        GeneralPath generalPath = new GeneralPath(dVar.f31243n);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f31699d;
            if (i10 >= iArr.length) {
                break;
            }
            GeneralPath generalPath2 = new GeneralPath(dVar.f31243n);
            for (int i11 = 0; i11 < iArr[i10]; i11++) {
                Point point = this.f31700e[i10][i11];
                if (i11 > 0) {
                    generalPath2.lineTo(point.x, point.y);
                } else {
                    generalPath2.moveTo(point.x, point.y);
                }
            }
            if (z10) {
                generalPath2.closePath();
            }
            generalPath.append((lib.zj.office.java.awt.b) generalPath2, false);
            i10++;
        }
        if (z10) {
            dVar.e(generalPath);
            return;
        }
        Canvas canvas = dVar.f31236g;
        if (!dVar.a(generalPath)) {
            dVar.d(canvas, generalPath);
        }
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  bounds: " + this.c + "\n  #polys: " + this.f31699d.length;
    }
}
