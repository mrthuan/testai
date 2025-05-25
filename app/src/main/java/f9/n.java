package f9;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import f9.h;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: ShapeAppearancePathProvider.java */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final p[] f17234a = new p[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f17235b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    public final PointF f17236d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f17237e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f17238f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final p f17239g = new p();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f17240h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f17241i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f17242j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f17243k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public final boolean f17244l = true;

    /* compiled from: ShapeAppearancePathProvider.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final n f17245a = new n();
    }

    public n() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f17234a[i10] = new p();
            this.f17235b[i10] = new Matrix();
            this.c[i10] = new Matrix();
        }
    }

    public final void a(m mVar, float f10, RectF rectF, h.a aVar, Path path) {
        int i10;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        p[] pVarArr;
        float abs;
        f fVar;
        Path path2;
        h.a aVar2;
        char c;
        d dVar;
        ge.a aVar3;
        Path path3;
        n nVar = this;
        m mVar2 = mVar;
        h.a aVar4 = aVar;
        Path path4 = path;
        path.rewind();
        Path path5 = nVar.f17237e;
        path5.rewind();
        Path path6 = nVar.f17238f;
        path6.rewind();
        path6.addRect(rectF, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            i10 = 4;
            matrixArr = nVar.c;
            fArr = nVar.f17240h;
            matrixArr2 = nVar.f17235b;
            pVarArr = nVar.f17234a;
            if (i11 >= 4) {
                break;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        dVar = mVar2.f17216f;
                    } else {
                        dVar = mVar2.f17215e;
                    }
                } else {
                    dVar = mVar2.f17218h;
                }
            } else {
                dVar = mVar2.f17217g;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        aVar3 = mVar2.f17213b;
                    } else {
                        aVar3 = mVar2.f17212a;
                    }
                } else {
                    aVar3 = mVar2.f17214d;
                }
            } else {
                aVar3 = mVar2.c;
            }
            p pVar = pVarArr[i11];
            aVar3.getClass();
            aVar3.x(f10, dVar.a(rectF), pVar);
            int i12 = i11 + 1;
            float f11 = (i12 % 4) * 90;
            matrixArr2[i11].reset();
            PointF pointF = nVar.f17236d;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        path3 = path5;
                        pointF.set(rectF.right, rectF.top);
                    } else {
                        path3 = path5;
                        pointF.set(rectF.left, rectF.top);
                    }
                } else {
                    path3 = path5;
                    pointF.set(rectF.left, rectF.bottom);
                }
            } else {
                path3 = path5;
                pointF.set(rectF.right, rectF.bottom);
            }
            matrixArr2[i11].setTranslate(pointF.x, pointF.y);
            matrixArr2[i11].preRotate(f11);
            p pVar2 = pVarArr[i11];
            fArr[0] = pVar2.c;
            fArr[1] = pVar2.f17249d;
            matrixArr2[i11].mapPoints(fArr);
            matrixArr[i11].reset();
            matrixArr[i11].setTranslate(fArr[0], fArr[1]);
            matrixArr[i11].preRotate(f11);
            i11 = i12;
            path5 = path3;
        }
        Path path7 = path5;
        char c10 = 1;
        char c11 = 0;
        int i13 = 0;
        while (i13 < i10) {
            p pVar3 = pVarArr[i13];
            fArr[c11] = pVar3.f17247a;
            fArr[c10] = pVar3.f17248b;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 == 0) {
                path4.moveTo(fArr[c11], fArr[c10]);
            } else {
                path4.lineTo(fArr[c11], fArr[c10]);
            }
            pVarArr[i13].c(matrixArr2[i13], path4);
            if (aVar4 != null) {
                p pVar4 = pVarArr[i13];
                Matrix matrix = matrixArr2[i13];
                h hVar = h.this;
                BitSet bitSet = hVar.f17166d;
                pVar4.getClass();
                bitSet.set(i13, false);
                pVar4.b(pVar4.f17251f);
                hVar.f17165b[i13] = new o(new ArrayList(pVar4.f17253h), new Matrix(matrix));
            }
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            p pVar5 = pVarArr[i13];
            fArr[0] = pVar5.c;
            fArr[1] = pVar5.f17249d;
            matrixArr2[i13].mapPoints(fArr);
            p pVar6 = pVarArr[i15];
            float f12 = pVar6.f17247a;
            float[] fArr2 = nVar.f17241i;
            fArr2[0] = f12;
            fArr2[1] = pVar6.f17248b;
            matrixArr2[i15].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            p pVar7 = pVarArr[i13];
            fArr[0] = pVar7.c;
            fArr[1] = pVar7.f17249d;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 != 1 && i13 != 3) {
                abs = Math.abs(rectF.centerY() - fArr[1]);
            } else {
                abs = Math.abs(rectF.centerX() - fArr[0]);
            }
            p pVar8 = nVar.f17239g;
            pVar8.e(0.0f, 0.0f, 270.0f, 0.0f);
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        fVar = mVar2.f17220j;
                    } else {
                        fVar = mVar2.f17219i;
                    }
                } else {
                    fVar = mVar2.f17222l;
                }
            } else {
                fVar = mVar2.f17221k;
            }
            fVar.c(max, abs, f10, pVar8);
            Path path8 = nVar.f17242j;
            path8.reset();
            pVar8.c(matrixArr[i13], path8);
            if (nVar.f17244l && (fVar.a() || nVar.b(path8, i13) || nVar.b(path8, i15))) {
                path8.op(path8, path6, Path.Op.DIFFERENCE);
                fArr[0] = pVar8.f17247a;
                fArr[1] = pVar8.f17248b;
                matrixArr[i13].mapPoints(fArr);
                path2 = path7;
                path2.moveTo(fArr[0], fArr[1]);
                pVar8.c(matrixArr[i13], path2);
                aVar2 = aVar;
                path4 = path;
            } else {
                path2 = path7;
                path4 = path;
                pVar8.c(matrixArr[i13], path4);
                aVar2 = aVar;
            }
            if (aVar2 != null) {
                Matrix matrix2 = matrixArr[i13];
                h hVar2 = h.this;
                c = 0;
                hVar2.f17166d.set(i13 + 4, false);
                pVar8.b(pVar8.f17251f);
                hVar2.c[i13] = new o(new ArrayList(pVar8.f17253h), new Matrix(matrix2));
            } else {
                c = 0;
            }
            nVar = this;
            c11 = c;
            aVar4 = aVar2;
            path7 = path2;
            i13 = i14;
            c10 = 1;
            i10 = 4;
            mVar2 = mVar;
        }
        Path path9 = path7;
        path.close();
        path9.close();
        if (!path9.isEmpty()) {
            path4.op(path9, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i10) {
        Path path2 = this.f17243k;
        path2.reset();
        this.f17234a[i10].c(this.f17235b[i10], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
            return true;
        }
        return false;
    }
}
