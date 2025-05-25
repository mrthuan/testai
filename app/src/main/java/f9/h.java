package f9;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import f9.n;
import f9.p;
import java.util.BitSet;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: MaterialShapeDrawable.java */
/* loaded from: classes2.dex */
public class h extends Drawable implements q {

    /* renamed from: w  reason: collision with root package name */
    public static final Paint f17163w;

    /* renamed from: a  reason: collision with root package name */
    public b f17164a;

    /* renamed from: b  reason: collision with root package name */
    public final p.f[] f17165b;
    public final p.f[] c;

    /* renamed from: d  reason: collision with root package name */
    public final BitSet f17166d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17167e;

    /* renamed from: f  reason: collision with root package name */
    public final Matrix f17168f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f17169g;

    /* renamed from: h  reason: collision with root package name */
    public final Path f17170h;

    /* renamed from: i  reason: collision with root package name */
    public final RectF f17171i;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f17172j;

    /* renamed from: k  reason: collision with root package name */
    public final Region f17173k;

    /* renamed from: l  reason: collision with root package name */
    public final Region f17174l;

    /* renamed from: m  reason: collision with root package name */
    public m f17175m;

    /* renamed from: n  reason: collision with root package name */
    public final Paint f17176n;

    /* renamed from: o  reason: collision with root package name */
    public final Paint f17177o;

    /* renamed from: p  reason: collision with root package name */
    public final e9.a f17178p;

    /* renamed from: q  reason: collision with root package name */
    public final a f17179q;

    /* renamed from: r  reason: collision with root package name */
    public final n f17180r;

    /* renamed from: s  reason: collision with root package name */
    public PorterDuffColorFilter f17181s;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuffColorFilter f17182t;

    /* renamed from: u  reason: collision with root package name */
    public final RectF f17183u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f17184v;

    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: classes2.dex */
    public class a {
        public a() {
        }
    }

    static {
        Paint paint = new Paint(1);
        f17163w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public h() {
        this(new m());
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        n nVar = this.f17180r;
        b bVar = this.f17164a;
        nVar.a(bVar.f17186a, bVar.f17194j, rectF, this.f17179q, path);
        if (this.f17164a.f17193i != 1.0f) {
            Matrix matrix = this.f17168f;
            matrix.reset();
            float f10 = this.f17164a.f17193i;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f17183u, true);
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        int color;
        int d10;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z10) {
                colorForState = d(colorForState);
            }
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z10 && (d10 = d((color = paint.getColor()))) != color) {
            porterDuffColorFilter = new PorterDuffColorFilter(d10, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        return porterDuffColorFilter;
    }

    public final int d(int i10) {
        b bVar = this.f17164a;
        float f10 = bVar.f17198n + bVar.f17199o + bVar.f17197m;
        t8.a aVar = bVar.f17187b;
        if (aVar != null) {
            return aVar.a(f10, i10);
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (r0 != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bf  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r22) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.h.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas) {
        this.f17166d.cardinality();
        int i10 = this.f17164a.f17202r;
        Path path = this.f17169g;
        e9.a aVar = this.f17178p;
        if (i10 != 0) {
            canvas.drawPath(path, aVar.f16510a);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            p.f fVar = this.f17165b[i11];
            int i12 = this.f17164a.f17201q;
            Matrix matrix = p.f.f17264b;
            fVar.a(matrix, aVar, i12, canvas);
            this.c[i11].a(matrix, aVar, this.f17164a.f17201q, canvas);
        }
        if (this.f17184v) {
            b bVar = this.f17164a;
            int sin = (int) (Math.sin(Math.toRadians(bVar.f17203s)) * bVar.f17202r);
            int i13 = i();
            canvas.translate(-sin, -i13);
            canvas.drawPath(path, f17163w);
            canvas.translate(sin, i13);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, m mVar, RectF rectF) {
        if (mVar.f(rectF)) {
            float a10 = mVar.f17216f.a(rectF) * this.f17164a.f17194j;
            canvas.drawRoundRect(rectF, a10, a10, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void g(Canvas canvas) {
        boolean z10;
        Paint paint = this.f17177o;
        Path path = this.f17170h;
        m mVar = this.f17175m;
        RectF rectF = this.f17172j;
        rectF.set(h());
        Paint.Style style = this.f17164a.f17205u;
        float f10 = 0.0f;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && paint.getStrokeWidth() > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f10 = paint.getStrokeWidth() / 2.0f;
        }
        rectF.inset(f10, f10);
        f(canvas, paint, path, mVar, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f17164a.f17196l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f17164a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f17164a.f17200p == 2) {
            return;
        }
        if (l()) {
            outline.setRoundRect(getBounds(), j() * this.f17164a.f17194j);
            return;
        }
        RectF h10 = h();
        Path path = this.f17169g;
        b(h10, path);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            outline.setPath(path);
        } else if (i10 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f17164a.f17192h;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f17173k;
        region.set(bounds);
        RectF h10 = h();
        Path path = this.f17169g;
        b(h10, path);
        Region region2 = this.f17174l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        RectF rectF = this.f17171i;
        rectF.set(getBounds());
        return rectF;
    }

    public final int i() {
        b bVar = this.f17164a;
        return (int) (Math.cos(Math.toRadians(bVar.f17203s)) * bVar.f17202r);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f17167e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (!super.isStateful() && (((colorStateList = this.f17164a.f17190f) == null || !colorStateList.isStateful()) && (((colorStateList2 = this.f17164a.f17189e) == null || !colorStateList2.isStateful()) && (((colorStateList3 = this.f17164a.f17188d) == null || !colorStateList3.isStateful()) && ((colorStateList4 = this.f17164a.c) == null || !colorStateList4.isStateful()))))) {
            return false;
        }
        return true;
    }

    public final float j() {
        return this.f17164a.f17186a.f17215e.a(h());
    }

    public final void k(Context context) {
        this.f17164a.f17187b = new t8.a(context);
        w();
    }

    public final boolean l() {
        return this.f17164a.f17186a.f(h());
    }

    public final void m(float f10) {
        b bVar = this.f17164a;
        if (bVar.f17198n != f10) {
            bVar.f17198n = f10;
            w();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f17164a = new b(this.f17164a);
        return this;
    }

    public final void n(ColorStateList colorStateList) {
        b bVar = this.f17164a;
        if (bVar.c != colorStateList) {
            bVar.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void o(float f10) {
        b bVar = this.f17164a;
        if (bVar.f17194j != f10) {
            bVar.f17194j = f10;
            this.f17167e = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f17167e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, w8.p.b
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        boolean u7 = u(iArr);
        boolean v10 = v();
        if (!u7 && !v10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public final void p(Paint.Style style) {
        this.f17164a.f17205u = style;
        super.invalidateSelf();
    }

    public final void q() {
        this.f17178p.a(-12303292);
        this.f17164a.f17204t = false;
        super.invalidateSelf();
    }

    public final void r(int i10) {
        b bVar = this.f17164a;
        if (bVar.f17200p != i10) {
            bVar.f17200p = i10;
            super.invalidateSelf();
        }
    }

    public final void s(ColorStateList colorStateList) {
        b bVar = this.f17164a;
        if (bVar.f17188d != colorStateList) {
            bVar.f17188d = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        b bVar = this.f17164a;
        if (bVar.f17196l != i10) {
            bVar.f17196l = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f17164a.getClass();
        super.invalidateSelf();
    }

    @Override // f9.q
    public final void setShapeAppearanceModel(m mVar) {
        this.f17164a.f17186a = mVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f17164a.f17190f = colorStateList;
        v();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f17164a;
        if (bVar.f17191g != mode) {
            bVar.f17191g = mode;
            v();
            super.invalidateSelf();
        }
    }

    public final void t(float f10) {
        this.f17164a.f17195k = f10;
        invalidateSelf();
    }

    public final boolean u(int[] iArr) {
        boolean z10;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f17164a.c != null && color2 != (colorForState2 = this.f17164a.c.getColorForState(iArr, (color2 = (paint2 = this.f17176n).getColor())))) {
            paint2.setColor(colorForState2);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f17164a.f17188d != null && color != (colorForState = this.f17164a.f17188d.getColorForState(iArr, (color = (paint = this.f17177o).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z10;
    }

    public final boolean v() {
        PorterDuffColorFilter porterDuffColorFilter = this.f17181s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f17182t;
        b bVar = this.f17164a;
        this.f17181s = c(bVar.f17190f, bVar.f17191g, this.f17176n, true);
        b bVar2 = this.f17164a;
        this.f17182t = c(bVar2.f17189e, bVar2.f17191g, this.f17177o, false);
        b bVar3 = this.f17164a;
        if (bVar3.f17204t) {
            this.f17178p.a(bVar3.f17190f.getColorForState(getState(), 0));
        }
        if (!w0.b.a(porterDuffColorFilter, this.f17181s) || !w0.b.a(porterDuffColorFilter2, this.f17182t)) {
            return true;
        }
        return false;
    }

    public final void w() {
        b bVar = this.f17164a;
        float f10 = bVar.f17198n + bVar.f17199o;
        bVar.f17201q = (int) Math.ceil(0.75f * f10);
        this.f17164a.f17202r = (int) Math.ceil(f10 * 0.25f);
        v();
        super.invalidateSelf();
    }

    public h(m mVar) {
        this(new b(mVar));
    }

    public h(b bVar) {
        n nVar;
        this.f17165b = new p.f[4];
        this.c = new p.f[4];
        this.f17166d = new BitSet(8);
        this.f17168f = new Matrix();
        this.f17169g = new Path();
        this.f17170h = new Path();
        this.f17171i = new RectF();
        this.f17172j = new RectF();
        this.f17173k = new Region();
        this.f17174l = new Region();
        Paint paint = new Paint(1);
        this.f17176n = paint;
        Paint paint2 = new Paint(1);
        this.f17177o = paint2;
        this.f17178p = new e9.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            nVar = n.a.f17245a;
        } else {
            nVar = new n();
        }
        this.f17180r = nVar;
        this.f17183u = new RectF();
        this.f17184v = true;
        this.f17164a = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        v();
        u(getState());
        this.f17179q = new a();
    }

    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: classes2.dex */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public m f17186a;

        /* renamed from: b  reason: collision with root package name */
        public t8.a f17187b;
        public ColorStateList c;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f17188d;

        /* renamed from: e  reason: collision with root package name */
        public final ColorStateList f17189e;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f17190f;

        /* renamed from: g  reason: collision with root package name */
        public PorterDuff.Mode f17191g;

        /* renamed from: h  reason: collision with root package name */
        public Rect f17192h;

        /* renamed from: i  reason: collision with root package name */
        public final float f17193i;

        /* renamed from: j  reason: collision with root package name */
        public float f17194j;

        /* renamed from: k  reason: collision with root package name */
        public float f17195k;

        /* renamed from: l  reason: collision with root package name */
        public int f17196l;

        /* renamed from: m  reason: collision with root package name */
        public float f17197m;

        /* renamed from: n  reason: collision with root package name */
        public float f17198n;

        /* renamed from: o  reason: collision with root package name */
        public final float f17199o;

        /* renamed from: p  reason: collision with root package name */
        public int f17200p;

        /* renamed from: q  reason: collision with root package name */
        public int f17201q;

        /* renamed from: r  reason: collision with root package name */
        public int f17202r;

        /* renamed from: s  reason: collision with root package name */
        public int f17203s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f17204t;

        /* renamed from: u  reason: collision with root package name */
        public Paint.Style f17205u;

        public b(m mVar) {
            this.c = null;
            this.f17188d = null;
            this.f17189e = null;
            this.f17190f = null;
            this.f17191g = PorterDuff.Mode.SRC_IN;
            this.f17192h = null;
            this.f17193i = 1.0f;
            this.f17194j = 1.0f;
            this.f17196l = FunctionEval.FunctionID.EXTERNAL_FUNC;
            this.f17197m = 0.0f;
            this.f17198n = 0.0f;
            this.f17199o = 0.0f;
            this.f17200p = 0;
            this.f17201q = 0;
            this.f17202r = 0;
            this.f17203s = 0;
            this.f17204t = false;
            this.f17205u = Paint.Style.FILL_AND_STROKE;
            this.f17186a = mVar;
            this.f17187b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVar = new h(this);
            hVar.f17167e = true;
            return hVar;
        }

        public b(b bVar) {
            this.c = null;
            this.f17188d = null;
            this.f17189e = null;
            this.f17190f = null;
            this.f17191g = PorterDuff.Mode.SRC_IN;
            this.f17192h = null;
            this.f17193i = 1.0f;
            this.f17194j = 1.0f;
            this.f17196l = FunctionEval.FunctionID.EXTERNAL_FUNC;
            this.f17197m = 0.0f;
            this.f17198n = 0.0f;
            this.f17199o = 0.0f;
            this.f17200p = 0;
            this.f17201q = 0;
            this.f17202r = 0;
            this.f17203s = 0;
            this.f17204t = false;
            this.f17205u = Paint.Style.FILL_AND_STROKE;
            this.f17186a = bVar.f17186a;
            this.f17187b = bVar.f17187b;
            this.f17195k = bVar.f17195k;
            this.c = bVar.c;
            this.f17188d = bVar.f17188d;
            this.f17191g = bVar.f17191g;
            this.f17190f = bVar.f17190f;
            this.f17196l = bVar.f17196l;
            this.f17193i = bVar.f17193i;
            this.f17202r = bVar.f17202r;
            this.f17200p = bVar.f17200p;
            this.f17204t = bVar.f17204t;
            this.f17194j = bVar.f17194j;
            this.f17197m = bVar.f17197m;
            this.f17198n = bVar.f17198n;
            this.f17199o = bVar.f17199o;
            this.f17201q = bVar.f17201q;
            this.f17203s = bVar.f17203s;
            this.f17189e = bVar.f17189e;
            this.f17205u = bVar.f17205u;
            if (bVar.f17192h != null) {
                this.f17192h = new Rect(bVar.f17192h);
            }
        }
    }

    public h(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(new m(m.c(context, attributeSet, i10, i11)));
    }
}
