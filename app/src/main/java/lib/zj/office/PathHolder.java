package lib.zj.office;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class PathHolder extends Path {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<a> f20657a;

    /* loaded from: classes2.dex */
    public enum PathOp {
        MOVE_TO,
        rMOVE_TO,
        LINE_TO,
        rLINE_TO,
        CURVE_TO,
        rCURVE_TO,
        QUAD_TO,
        rQUAD_TO,
        ARC_TO,
        ADD_ARC,
        ADD_RECT,
        ADD_OVAL,
        ADD_CIRCLE,
        ADD_ROUND_RECT,
        OFFSET,
        SET_LAST_POINT,
        TRANSFORM,
        CLOSE
    }

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final PathOp f20659a;

        /* renamed from: b  reason: collision with root package name */
        public final float[] f20660b;

        public a(PathOp pathOp, float... fArr) {
            this.f20659a = pathOp;
            this.f20660b = fArr;
        }
    }

    public PathHolder(Path path) {
        super(path);
        this.f20657a = new ArrayList<>();
        if (path instanceof PathHolder) {
            Iterator<a> it = ((PathHolder) path).f20657a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                this.f20657a.add(new a(next.f20659a, (float[]) next.f20660b.clone()));
            }
        }
    }

    public final float[] a() {
        ArrayList<a> arrayList = this.f20657a;
        Iterator<a> it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().f20660b.length + 2;
        }
        float[] fArr = new float[i10];
        Iterator<a> it2 = arrayList.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            a next = it2.next();
            int i12 = i11 + 1;
            fArr[i11] = next.f20659a.ordinal();
            i11 = i12 + 1;
            float[] fArr2 = next.f20660b;
            fArr[i12] = fArr2.length;
            int length = fArr2.length;
            int i13 = 0;
            while (i13 < length) {
                fArr[i11] = fArr2[i13];
                i13++;
                i11++;
            }
        }
        return fArr;
    }

    @Override // android.graphics.Path
    public final void addArc(RectF rectF, float f10, float f11) {
        addArc(rectF.left, rectF.top, rectF.right, rectF.bottom, f10, f11);
    }

    @Override // android.graphics.Path
    public final void addCircle(float f10, float f11, float f12, Path.Direction direction) {
        float f13;
        super.addCircle(f10, f11, f12, direction);
        PathOp pathOp = PathOp.ADD_CIRCLE;
        float[] fArr = new float[4];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        if (direction == Path.Direction.CW) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        fArr[3] = f13;
        this.f20657a.add(new a(pathOp, fArr));
    }

    @Override // android.graphics.Path
    public final void addOval(RectF rectF, Path.Direction direction) {
        addOval(rectF.left, rectF.top, rectF.right, rectF.bottom, direction);
    }

    @Override // android.graphics.Path
    public final void addPath(Path path, float f10, float f11) {
        super.addPath(path, f10, f11);
        boolean z10 = path instanceof PathHolder;
    }

    @Override // android.graphics.Path
    public final void addRect(RectF rectF, Path.Direction direction) {
        addRect(rectF.left, rectF.top, rectF.right, rectF.bottom, direction);
    }

    @Override // android.graphics.Path
    public final void addRoundRect(RectF rectF, float f10, float f11, Path.Direction direction) {
        addRoundRect(rectF.left, rectF.top, rectF.right, rectF.bottom, f10, f11, direction);
    }

    @Override // android.graphics.Path
    public final void arcTo(RectF rectF, float f10, float f11, boolean z10) {
        arcTo(rectF.left, rectF.top, rectF.right, rectF.bottom, f10, f11, z10);
    }

    @Override // android.graphics.Path
    public final void close() {
        super.close();
        this.f20657a.add(new a(PathOp.CLOSE, new float[0]));
    }

    @Override // android.graphics.Path
    public final void cubicTo(float f10, float f11, float f12, float f13, float f14, float f15) {
        super.cubicTo(f10, f11, f12, f13, f14, f15);
        this.f20657a.add(new a(PathOp.CURVE_TO, f10, f11, f12, f13, f14, f15));
    }

    @Override // android.graphics.Path
    public final void lineTo(float f10, float f11) {
        super.lineTo(f10, f11);
        this.f20657a.add(new a(PathOp.LINE_TO, f10, f11));
    }

    @Override // android.graphics.Path
    public final void moveTo(float f10, float f11) {
        super.moveTo(f10, f11);
        this.f20657a.add(new a(PathOp.MOVE_TO, f10, f11));
    }

    @Override // android.graphics.Path
    public final void offset(float f10, float f11, Path path) {
        super.offset(f10, f11, path);
        boolean z10 = path instanceof PathHolder;
    }

    @Override // android.graphics.Path
    public final boolean op(Path path, Path.Op op2) {
        boolean op3 = super.op(path, op2);
        Objects.toString(op2);
        boolean z10 = path instanceof PathHolder;
        return op3;
    }

    @Override // android.graphics.Path
    public final void quadTo(float f10, float f11, float f12, float f13) {
        super.quadTo(f10, f11, f12, f13);
        this.f20657a.add(new a(PathOp.QUAD_TO, f10, f11, f12, f13));
    }

    @Override // android.graphics.Path
    public final void rCubicTo(float f10, float f11, float f12, float f13, float f14, float f15) {
        super.rCubicTo(f10, f11, f12, f13, f14, f15);
        this.f20657a.add(new a(PathOp.rCURVE_TO, f10, f11, f12, f13, f14, f15));
    }

    @Override // android.graphics.Path
    public final void rLineTo(float f10, float f11) {
        super.rLineTo(f10, f11);
        this.f20657a.add(new a(PathOp.LINE_TO, f10, f11));
    }

    @Override // android.graphics.Path
    public final void rMoveTo(float f10, float f11) {
        super.rMoveTo(f10, f11);
        this.f20657a.add(new a(PathOp.rMOVE_TO, f10, f11));
    }

    @Override // android.graphics.Path
    public final void rQuadTo(float f10, float f11, float f12, float f13) {
        super.rQuadTo(f10, f11, f12, f13);
        this.f20657a.add(new a(PathOp.rQUAD_TO, f10, f11, f12, f13));
    }

    @Override // android.graphics.Path
    public final void reset() {
        super.reset();
        this.f20657a.clear();
    }

    @Override // android.graphics.Path
    public final void rewind() {
        super.rewind();
        this.f20657a.clear();
    }

    @Override // android.graphics.Path
    public final void set(Path path) {
        super.set(path);
        if (path instanceof PathHolder) {
            ArrayList<a> arrayList = this.f20657a;
            arrayList.clear();
            Iterator<a> it = ((PathHolder) path).f20657a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                arrayList.add(new a(next.f20659a, (float[]) next.f20660b.clone()));
            }
        }
    }

    @Override // android.graphics.Path
    public final void setLastPoint(float f10, float f11) {
        super.setLastPoint(f10, f11);
        this.f20657a.add(new a(PathOp.SET_LAST_POINT, f10, f11));
    }

    @Override // android.graphics.Path
    public final void transform(Matrix matrix, Path path) {
        super.transform(matrix, path);
        Objects.toString(matrix);
        boolean z10 = path instanceof PathHolder;
    }

    @Override // android.graphics.Path
    public final void addArc(float f10, float f11, float f12, float f13, float f14, float f15) {
        super.addArc(f10, f11, f12, f13, f14, f15);
        this.f20657a.add(new a(PathOp.ADD_ARC, f10, f11, f12, f13, f14, f15));
    }

    @Override // android.graphics.Path
    public final void addOval(float f10, float f11, float f12, float f13, Path.Direction direction) {
        super.addOval(f10, f11, f12, f13, direction);
        PathOp pathOp = PathOp.ADD_OVAL;
        float[] fArr = new float[5];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = direction == Path.Direction.CW ? 1.0f : 0.0f;
        this.f20657a.add(new a(pathOp, fArr));
    }

    @Override // android.graphics.Path
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        super.addRect(f10, f11, f12, f13, direction);
        PathOp pathOp = PathOp.ADD_RECT;
        float[] fArr = new float[5];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = direction == Path.Direction.CW ? 1.0f : 0.0f;
        this.f20657a.add(new a(pathOp, fArr));
    }

    @Override // android.graphics.Path
    public final void addRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, Path.Direction direction) {
        super.addRoundRect(f10, f11, f12, f13, f14, f15, direction);
        PathOp pathOp = PathOp.ADD_ROUND_RECT;
        float[] fArr = new float[7];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f15;
        fArr[6] = direction == Path.Direction.CW ? 1.0f : 0.0f;
        this.f20657a.add(new a(pathOp, fArr));
    }

    @Override // android.graphics.Path
    public final void arcTo(RectF rectF, float f10, float f11) {
        arcTo(rectF.left, rectF.top, rectF.right, rectF.bottom, f10, f11, false);
    }

    @Override // android.graphics.Path
    public final void addPath(Path path) {
        super.addPath(path);
        boolean z10 = path instanceof PathHolder;
    }

    @Override // android.graphics.Path
    public final void arcTo(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10) {
        super.arcTo(f10, f11, f12, f13, f14, f15, z10);
        PathOp pathOp = PathOp.ARC_TO;
        float[] fArr = new float[7];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f15;
        fArr[6] = z10 ? 1.0f : 0.0f;
        this.f20657a.add(new a(pathOp, fArr));
    }

    @Override // android.graphics.Path
    public final void offset(float f10, float f11) {
        super.offset(f10, f11);
        this.f20657a.add(new a(PathOp.OFFSET, f10, f11));
    }

    @Override // android.graphics.Path
    public final boolean op(Path path, Path path2, Path.Op op2) {
        boolean op3 = super.op(path, path2, op2);
        Objects.toString(op2);
        boolean z10 = path instanceof PathHolder;
        boolean z11 = path2 instanceof PathHolder;
        return op3;
    }

    @Override // android.graphics.Path
    public final void transform(Matrix matrix) {
        super.transform(matrix);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        this.f20657a.add(new a(PathOp.TRANSFORM, fArr));
    }

    @Override // android.graphics.Path
    public final void addRoundRect(RectF rectF, float[] fArr, Path.Direction direction) {
        super.addRoundRect(rectF, fArr, direction);
        if (fArr.length == 8) {
            PathOp pathOp = PathOp.ADD_ROUND_RECT;
            float[] fArr2 = new float[13];
            fArr2[0] = rectF.left;
            fArr2[1] = rectF.top;
            fArr2[2] = rectF.right;
            fArr2[3] = rectF.bottom;
            fArr2[4] = fArr[0];
            fArr2[5] = fArr[1];
            fArr2[6] = fArr[2];
            fArr2[7] = fArr[3];
            fArr2[8] = fArr[4];
            fArr2[9] = fArr[5];
            fArr2[10] = fArr[6];
            fArr2[11] = fArr[7];
            fArr2[12] = direction == Path.Direction.CW ? 1.0f : 0.0f;
            this.f20657a.add(new a(pathOp, fArr2));
        }
    }

    @Override // android.graphics.Path
    public final void addPath(Path path, Matrix matrix) {
        super.addPath(path, matrix);
        boolean z10 = path instanceof PathHolder;
        Objects.toString(matrix);
    }

    public PathHolder() {
        this.f20657a = new ArrayList<>();
    }

    @Override // android.graphics.Path
    public final void addRoundRect(float f10, float f11, float f12, float f13, float[] fArr, Path.Direction direction) {
        super.addRoundRect(f10, f11, f12, f13, fArr, direction);
        if (fArr.length == 8) {
            PathOp pathOp = PathOp.ADD_ROUND_RECT;
            float[] fArr2 = new float[13];
            fArr2[0] = f10;
            fArr2[1] = f11;
            fArr2[2] = f12;
            fArr2[3] = f13;
            fArr2[4] = fArr[0];
            fArr2[5] = fArr[1];
            fArr2[6] = fArr[2];
            fArr2[7] = fArr[3];
            fArr2[8] = fArr[4];
            fArr2[9] = fArr[5];
            fArr2[10] = fArr[6];
            fArr2[11] = fArr[7];
            fArr2[12] = direction == Path.Direction.CW ? 1.0f : 0.0f;
            this.f20657a.add(new a(pathOp, fArr2));
        }
    }
}
