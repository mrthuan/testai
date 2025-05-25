package f9;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: ShapePath.java */
/* loaded from: classes2.dex */
public final class p {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f17247a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f17248b;
    @Deprecated
    public float c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f17249d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f17250e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f17251f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f17252g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f17253h = new ArrayList();

    /* compiled from: ShapePath.java */
    /* loaded from: classes2.dex */
    public static class a extends f {
        public final c c;

        public a(c cVar) {
            this.c = cVar;
        }

        @Override // f9.p.f
        public final void a(Matrix matrix, e9.a aVar, int i10, Canvas canvas) {
            boolean z10;
            c cVar = this.c;
            float f10 = cVar.f17260f;
            float f11 = cVar.f17261g;
            RectF rectF = new RectF(cVar.f17257b, cVar.c, cVar.f17258d, cVar.f17259e);
            aVar.getClass();
            if (f11 < 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Path path = aVar.f16515g;
            int[] iArr = e9.a.f16508k;
            if (z10) {
                iArr[0] = 0;
                iArr[1] = aVar.f16514f;
                iArr[2] = aVar.f16513e;
                iArr[3] = aVar.f16512d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f10, f11);
                path.close();
                float f12 = -i10;
                rectF.inset(f12, f12);
                iArr[0] = 0;
                iArr[1] = aVar.f16512d;
                iArr[2] = aVar.f16513e;
                iArr[3] = aVar.f16514f;
            }
            float width = rectF.width() / 2.0f;
            if (width > 0.0f) {
                float f13 = 1.0f - (i10 / width);
                float m10 = a0.a.m(1.0f, f13, 2.0f, f13);
                float[] fArr = e9.a.f16509l;
                fArr[1] = f13;
                fArr[2] = m10;
                RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
                Paint paint = aVar.f16511b;
                paint.setShader(radialGradient);
                canvas.save();
                canvas.concat(matrix);
                canvas.scale(1.0f, rectF.height() / rectF.width());
                if (!z10) {
                    canvas.clipPath(path, Region.Op.DIFFERENCE);
                    canvas.drawPath(path, aVar.f16516h);
                }
                canvas.drawArc(rectF, f10, f11, true, paint);
                canvas.restore();
            }
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes2.dex */
    public static class b extends f {
        public final d c;

        /* renamed from: d  reason: collision with root package name */
        public final float f17254d;

        /* renamed from: e  reason: collision with root package name */
        public final float f17255e;

        public b(d dVar, float f10, float f11) {
            this.c = dVar;
            this.f17254d = f10;
            this.f17255e = f11;
        }

        @Override // f9.p.f
        public final void a(Matrix matrix, e9.a aVar, int i10, Canvas canvas) {
            d dVar = this.c;
            float f10 = dVar.c;
            float f11 = this.f17255e;
            float f12 = dVar.f17262b;
            float f13 = this.f17254d;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f10 - f11, f12 - f13), 0.0f);
            Matrix matrix2 = this.f17265a;
            matrix2.set(matrix);
            matrix2.preTranslate(f13, f11);
            matrix2.preRotate(b());
            aVar.getClass();
            rectF.bottom += i10;
            rectF.offset(0.0f, -i10);
            int[] iArr = e9.a.f16506i;
            iArr[0] = aVar.f16514f;
            iArr[1] = aVar.f16513e;
            iArr[2] = aVar.f16512d;
            Paint paint = aVar.c;
            float f14 = rectF.left;
            paint.setShader(new LinearGradient(f14, rectF.top, f14, rectF.bottom, iArr, e9.a.f16507j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }

        public final float b() {
            d dVar = this.c;
            return (float) Math.toDegrees(Math.atan((dVar.c - this.f17255e) / (dVar.f17262b - this.f17254d)));
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes2.dex */
    public static class c extends e {

        /* renamed from: h  reason: collision with root package name */
        public static final RectF f17256h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f17257b;
        @Deprecated
        public float c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f17258d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f17259e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f17260f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f17261g;

        public c(float f10, float f11, float f12, float f13) {
            this.f17257b = f10;
            this.c = f11;
            this.f17258d = f12;
            this.f17259e = f13;
        }

        @Override // f9.p.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f17263a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f17256h;
            rectF.set(this.f17257b, this.c, this.f17258d, this.f17259e);
            path.arcTo(rectF, this.f17260f, this.f17261g, false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes2.dex */
    public static class d extends e {

        /* renamed from: b  reason: collision with root package name */
        public float f17262b;
        public float c;

        @Override // f9.p.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f17263a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f17262b, this.c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes2.dex */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f17263a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes2.dex */
    public static abstract class f {

        /* renamed from: b  reason: collision with root package name */
        public static final Matrix f17264b = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f17265a = new Matrix();

        public abstract void a(Matrix matrix, e9.a aVar, int i10, Canvas canvas);
    }

    public p() {
        e(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        boolean z10;
        float f16;
        c cVar = new c(f10, f11, f12, f13);
        cVar.f17260f = f14;
        cVar.f17261g = f15;
        this.f17252g.add(cVar);
        a aVar = new a(cVar);
        float f17 = f14 + f15;
        if (f15 < 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        if (z10) {
            f16 = (180.0f + f17) % 360.0f;
        } else {
            f16 = f17;
        }
        b(f14);
        this.f17253h.add(aVar);
        this.f17250e = f16;
        double d10 = f17;
        this.c = (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))) + ((f10 + f12) * 0.5f);
        this.f17249d = (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))) + ((f11 + f13) * 0.5f);
    }

    public final void b(float f10) {
        float f11 = this.f17250e;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.c;
        float f14 = this.f17249d;
        c cVar = new c(f13, f14, f13, f14);
        cVar.f17260f = this.f17250e;
        cVar.f17261g = f12;
        this.f17253h.add(new a(cVar));
        this.f17250e = f10;
    }

    public final void c(Matrix matrix, Path path) {
        ArrayList arrayList = this.f17252g;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) arrayList.get(i10)).a(matrix, path);
        }
    }

    public final void d(float f10, float f11) {
        d dVar = new d();
        dVar.f17262b = f10;
        dVar.c = f11;
        this.f17252g.add(dVar);
        b bVar = new b(dVar, this.c, this.f17249d);
        b(bVar.b() + 270.0f);
        this.f17253h.add(bVar);
        this.f17250e = bVar.b() + 270.0f;
        this.c = f10;
        this.f17249d = f11;
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f17247a = f10;
        this.f17248b = f11;
        this.c = f10;
        this.f17249d = f11;
        this.f17250e = f12;
        this.f17251f = (f12 + f13) % 360.0f;
        this.f17252g.clear();
        this.f17253h.clear();
    }
}
