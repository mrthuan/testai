package g2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import o0.d;
import org.xmlpull.v1.XmlPullParser;
import p0.a;

/* compiled from: VectorDrawableCompat.java */
/* loaded from: classes.dex */
public final class i extends g2.h {

    /* renamed from: j  reason: collision with root package name */
    public static final PorterDuff.Mode f17438j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public g f17439b;
    public PorterDuffColorFilter c;

    /* renamed from: d  reason: collision with root package name */
    public ColorFilter f17440d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17441e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17442f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f17443g;

    /* renamed from: h  reason: collision with root package name */
    public final Matrix f17444h;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f17445i;

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class a extends e {
        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class d {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class g extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f17486a;

        /* renamed from: b  reason: collision with root package name */
        public f f17487b;
        public ColorStateList c;

        /* renamed from: d  reason: collision with root package name */
        public PorterDuff.Mode f17488d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f17489e;

        /* renamed from: f  reason: collision with root package name */
        public Bitmap f17490f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f17491g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f17492h;

        /* renamed from: i  reason: collision with root package name */
        public int f17493i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f17494j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f17495k;

        /* renamed from: l  reason: collision with root package name */
        public Paint f17496l;

        public g(g gVar) {
            this.c = null;
            this.f17488d = i.f17438j;
            if (gVar != null) {
                this.f17486a = gVar.f17486a;
                f fVar = new f(gVar.f17487b);
                this.f17487b = fVar;
                if (gVar.f17487b.f17475e != null) {
                    fVar.f17475e = new Paint(gVar.f17487b.f17475e);
                }
                if (gVar.f17487b.f17474d != null) {
                    this.f17487b.f17474d = new Paint(gVar.f17487b.f17474d);
                }
                this.c = gVar.c;
                this.f17488d = gVar.f17488d;
                this.f17489e = gVar.f17489e;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f17486a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new i(this);
        }

        public g() {
            this.c = null;
            this.f17488d = i.f17438j;
            this.f17487b = new f();
        }
    }

    public i() {
        this.f17442f = true;
        this.f17443g = new float[9];
        this.f17444h = new Matrix();
        this.f17445i = new Rect();
        this.f17439b = new g();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            a.b.b(drawable);
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
        if (r10 == false) goto L66;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.i.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            return a.C0322a.a(drawable);
        }
        return this.f17439b.f17487b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f17439b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            return a.b.c(drawable);
        }
        return this.f17440d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f17437a != null && Build.VERSION.SDK_INT >= 24) {
            return new h(this.f17437a.getConstantState());
        }
        this.f17439b.f17486a = getChangingConfigurations();
        return this.f17439b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f17439b.f17487b.f17479i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f17439b.f17487b.f17478h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            return a.C0322a.d(drawable);
        }
        return this.f17439b.f17489e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            g gVar = this.f17439b;
            if (gVar != null) {
                f fVar = gVar.f17487b;
                if (fVar.f17484n == null) {
                    fVar.f17484n = Boolean.valueOf(fVar.f17477g.a());
                }
                if (fVar.f17484n.booleanValue() || ((colorStateList = this.f17439b.c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f17441e && super.mutate() == this) {
            this.f17439b = new g(this.f17439b);
            this.f17441e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        g gVar = this.f17439b;
        ColorStateList colorStateList = gVar.c;
        if (colorStateList != null && (mode = gVar.f17488d) != null) {
            this.c = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        } else {
            z10 = false;
        }
        f fVar = gVar.f17487b;
        if (fVar.f17484n == null) {
            fVar.f17484n = Boolean.valueOf(fVar.f17477g.a());
        }
        if (fVar.f17484n.booleanValue()) {
            boolean b10 = gVar.f17487b.f17477g.b(iArr);
            gVar.f17495k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f17439b.f17487b.getRootAlpha() != i10) {
            this.f17439b.f17487b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            a.C0322a.e(drawable, z10);
        } else {
            this.f17439b.f17489e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f17440d = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            p0.a.a(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            a.b.h(drawable, colorStateList);
            return;
        }
        g gVar = this.f17439b;
        if (gVar.c != colorStateList) {
            gVar.c = colorStateList;
            this.c = a(colorStateList, gVar.f17488d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            a.b.i(drawable, mode);
            return;
        }
        g gVar = this.f17439b;
        if (gVar.f17488d != mode) {
            gVar.f17488d = mode;
            this.c = a(gVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f17497a;

        public h(Drawable.ConstantState constantState) {
            this.f17497a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f17497a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f17497a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            i iVar = new i();
            iVar.f17437a = (VectorDrawable) this.f17497a.newDrawable();
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f17437a = (VectorDrawable) this.f17497a.newDrawable(resources);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f17437a = (VectorDrawable) this.f17497a.newDrawable(resources, theme);
            return iVar;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class e extends d {

        /* renamed from: a  reason: collision with root package name */
        public d.a[] f17468a;

        /* renamed from: b  reason: collision with root package name */
        public String f17469b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f17470d;

        public e() {
            this.f17468a = null;
            this.c = 0;
        }

        public d.a[] getPathData() {
            return this.f17468a;
        }

        public String getPathName() {
            return this.f17469b;
        }

        public void setPathData(d.a[] aVarArr) {
            if (!o0.d.a(this.f17468a, aVarArr)) {
                this.f17468a = o0.d.e(aVarArr);
                return;
            }
            d.a[] aVarArr2 = this.f17468a;
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                aVarArr2[i10].f22643a = aVarArr[i10].f22643a;
                int i11 = 0;
                while (true) {
                    float[] fArr = aVarArr[i10].f22644b;
                    if (i11 < fArr.length) {
                        aVarArr2[i10].f22644b[i11] = fArr[i11];
                        i11++;
                    }
                }
            }
        }

        public e(e eVar) {
            this.f17468a = null;
            this.c = 0;
            this.f17469b = eVar.f17469b;
            this.f17470d = eVar.f17470d;
            this.f17468a = o0.d.e(eVar.f17468a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.i.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public i(g gVar) {
        this.f17442f = true;
        this.f17443g = new float[9];
        this.f17444h = new Matrix();
        this.f17445i = new Rect();
        this.f17439b = gVar;
        this.c = a(gVar.c, gVar.f17488d);
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: e  reason: collision with root package name */
        public n0.c f17446e;

        /* renamed from: f  reason: collision with root package name */
        public float f17447f;

        /* renamed from: g  reason: collision with root package name */
        public n0.c f17448g;

        /* renamed from: h  reason: collision with root package name */
        public float f17449h;

        /* renamed from: i  reason: collision with root package name */
        public float f17450i;

        /* renamed from: j  reason: collision with root package name */
        public float f17451j;

        /* renamed from: k  reason: collision with root package name */
        public float f17452k;

        /* renamed from: l  reason: collision with root package name */
        public float f17453l;

        /* renamed from: m  reason: collision with root package name */
        public Paint.Cap f17454m;

        /* renamed from: n  reason: collision with root package name */
        public Paint.Join f17455n;

        /* renamed from: o  reason: collision with root package name */
        public float f17456o;

        public b() {
            this.f17447f = 0.0f;
            this.f17449h = 1.0f;
            this.f17450i = 1.0f;
            this.f17451j = 0.0f;
            this.f17452k = 1.0f;
            this.f17453l = 0.0f;
            this.f17454m = Paint.Cap.BUTT;
            this.f17455n = Paint.Join.MITER;
            this.f17456o = 4.0f;
        }

        @Override // g2.i.d
        public final boolean a() {
            if (!this.f17448g.b() && !this.f17446e.b()) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        @Override // g2.i.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean b(int[] r7) {
            /*
                r6 = this;
                n0.c r0 = r6.f17448g
                boolean r1 = r0.b()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L1c
                android.content.res.ColorStateList r1 = r0.f22279b
                int r4 = r1.getDefaultColor()
                int r1 = r1.getColorForState(r7, r4)
                int r4 = r0.c
                if (r1 == r4) goto L1c
                r0.c = r1
                r0 = r2
                goto L1d
            L1c:
                r0 = r3
            L1d:
                n0.c r1 = r6.f17446e
                boolean r4 = r1.b()
                if (r4 == 0) goto L36
                android.content.res.ColorStateList r4 = r1.f22279b
                int r5 = r4.getDefaultColor()
                int r7 = r4.getColorForState(r7, r5)
                int r4 = r1.c
                if (r7 == r4) goto L36
                r1.c = r7
                goto L37
            L36:
                r2 = r3
            L37:
                r7 = r2 | r0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: g2.i.b.b(int[]):boolean");
        }

        public float getFillAlpha() {
            return this.f17450i;
        }

        public int getFillColor() {
            return this.f17448g.c;
        }

        public float getStrokeAlpha() {
            return this.f17449h;
        }

        public int getStrokeColor() {
            return this.f17446e.c;
        }

        public float getStrokeWidth() {
            return this.f17447f;
        }

        public float getTrimPathEnd() {
            return this.f17452k;
        }

        public float getTrimPathOffset() {
            return this.f17453l;
        }

        public float getTrimPathStart() {
            return this.f17451j;
        }

        public void setFillAlpha(float f10) {
            this.f17450i = f10;
        }

        public void setFillColor(int i10) {
            this.f17448g.c = i10;
        }

        public void setStrokeAlpha(float f10) {
            this.f17449h = f10;
        }

        public void setStrokeColor(int i10) {
            this.f17446e.c = i10;
        }

        public void setStrokeWidth(float f10) {
            this.f17447f = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.f17452k = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f17453l = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f17451j = f10;
        }

        public b(b bVar) {
            super(bVar);
            this.f17447f = 0.0f;
            this.f17449h = 1.0f;
            this.f17450i = 1.0f;
            this.f17451j = 0.0f;
            this.f17452k = 1.0f;
            this.f17453l = 0.0f;
            this.f17454m = Paint.Cap.BUTT;
            this.f17455n = Paint.Join.MITER;
            this.f17456o = 4.0f;
            this.f17446e = bVar.f17446e;
            this.f17447f = bVar.f17447f;
            this.f17449h = bVar.f17449h;
            this.f17448g = bVar.f17448g;
            this.c = bVar.c;
            this.f17450i = bVar.f17450i;
            this.f17451j = bVar.f17451j;
            this.f17452k = bVar.f17452k;
            this.f17453l = bVar.f17453l;
            this.f17454m = bVar.f17454m;
            this.f17455n = bVar.f17455n;
            this.f17456o = bVar.f17456o;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c extends d {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f17457a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<d> f17458b;
        public float c;

        /* renamed from: d  reason: collision with root package name */
        public float f17459d;

        /* renamed from: e  reason: collision with root package name */
        public float f17460e;

        /* renamed from: f  reason: collision with root package name */
        public float f17461f;

        /* renamed from: g  reason: collision with root package name */
        public float f17462g;

        /* renamed from: h  reason: collision with root package name */
        public float f17463h;

        /* renamed from: i  reason: collision with root package name */
        public float f17464i;

        /* renamed from: j  reason: collision with root package name */
        public final Matrix f17465j;

        /* renamed from: k  reason: collision with root package name */
        public final int f17466k;

        /* renamed from: l  reason: collision with root package name */
        public String f17467l;

        public c() {
            this.f17457a = new Matrix();
            this.f17458b = new ArrayList<>();
            this.c = 0.0f;
            this.f17459d = 0.0f;
            this.f17460e = 0.0f;
            this.f17461f = 1.0f;
            this.f17462g = 1.0f;
            this.f17463h = 0.0f;
            this.f17464i = 0.0f;
            this.f17465j = new Matrix();
            this.f17467l = null;
        }

        @Override // g2.i.d
        public final boolean a() {
            int i10 = 0;
            while (true) {
                ArrayList<d> arrayList = this.f17458b;
                if (i10 >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i10).a()) {
                    return true;
                }
                i10++;
            }
        }

        @Override // g2.i.d
        public final boolean b(int[] iArr) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                ArrayList<d> arrayList = this.f17458b;
                if (i10 < arrayList.size()) {
                    z10 |= arrayList.get(i10).b(iArr);
                    i10++;
                } else {
                    return z10;
                }
            }
        }

        public final void c() {
            Matrix matrix = this.f17465j;
            matrix.reset();
            matrix.postTranslate(-this.f17459d, -this.f17460e);
            matrix.postScale(this.f17461f, this.f17462g);
            matrix.postRotate(this.c, 0.0f, 0.0f);
            matrix.postTranslate(this.f17463h + this.f17459d, this.f17464i + this.f17460e);
        }

        public String getGroupName() {
            return this.f17467l;
        }

        public Matrix getLocalMatrix() {
            return this.f17465j;
        }

        public float getPivotX() {
            return this.f17459d;
        }

        public float getPivotY() {
            return this.f17460e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f17461f;
        }

        public float getScaleY() {
            return this.f17462g;
        }

        public float getTranslateX() {
            return this.f17463h;
        }

        public float getTranslateY() {
            return this.f17464i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f17459d) {
                this.f17459d = f10;
                c();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f17460e) {
                this.f17460e = f10;
                c();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.c) {
                this.c = f10;
                c();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f17461f) {
                this.f17461f = f10;
                c();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f17462g) {
                this.f17462g = f10;
                c();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f17463h) {
                this.f17463h = f10;
                c();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f17464i) {
                this.f17464i = f10;
                c();
            }
        }

        public c(c cVar, y.b<String, Object> bVar) {
            e aVar;
            this.f17457a = new Matrix();
            this.f17458b = new ArrayList<>();
            this.c = 0.0f;
            this.f17459d = 0.0f;
            this.f17460e = 0.0f;
            this.f17461f = 1.0f;
            this.f17462g = 1.0f;
            this.f17463h = 0.0f;
            this.f17464i = 0.0f;
            Matrix matrix = new Matrix();
            this.f17465j = matrix;
            this.f17467l = null;
            this.c = cVar.c;
            this.f17459d = cVar.f17459d;
            this.f17460e = cVar.f17460e;
            this.f17461f = cVar.f17461f;
            this.f17462g = cVar.f17462g;
            this.f17463h = cVar.f17463h;
            this.f17464i = cVar.f17464i;
            String str = cVar.f17467l;
            this.f17467l = str;
            this.f17466k = cVar.f17466k;
            if (str != null) {
                bVar.put(str, this);
            }
            matrix.set(cVar.f17465j);
            ArrayList<d> arrayList = cVar.f17458b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                d dVar = arrayList.get(i10);
                if (dVar instanceof c) {
                    this.f17458b.add(new c((c) dVar, bVar));
                } else {
                    if (dVar instanceof b) {
                        aVar = new b((b) dVar);
                    } else if (dVar instanceof a) {
                        aVar = new a((a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f17458b.add(aVar);
                    String str2 = aVar.f17469b;
                    if (str2 != null) {
                        bVar.put(str2, aVar);
                    }
                }
            }
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: p  reason: collision with root package name */
        public static final Matrix f17471p = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Path f17472a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f17473b;
        public final Matrix c;

        /* renamed from: d  reason: collision with root package name */
        public Paint f17474d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f17475e;

        /* renamed from: f  reason: collision with root package name */
        public PathMeasure f17476f;

        /* renamed from: g  reason: collision with root package name */
        public final c f17477g;

        /* renamed from: h  reason: collision with root package name */
        public float f17478h;

        /* renamed from: i  reason: collision with root package name */
        public float f17479i;

        /* renamed from: j  reason: collision with root package name */
        public float f17480j;

        /* renamed from: k  reason: collision with root package name */
        public float f17481k;

        /* renamed from: l  reason: collision with root package name */
        public int f17482l;

        /* renamed from: m  reason: collision with root package name */
        public String f17483m;

        /* renamed from: n  reason: collision with root package name */
        public Boolean f17484n;

        /* renamed from: o  reason: collision with root package name */
        public final y.b<String, Object> f17485o;

        public f() {
            this.c = new Matrix();
            this.f17478h = 0.0f;
            this.f17479i = 0.0f;
            this.f17480j = 0.0f;
            this.f17481k = 0.0f;
            this.f17482l = FunctionEval.FunctionID.EXTERNAL_FUNC;
            this.f17483m = null;
            this.f17484n = null;
            this.f17485o = new y.b<>();
            this.f17477g = new c();
            this.f17472a = new Path();
            this.f17473b = new Path();
        }

        public final void a(c cVar, Matrix matrix, Canvas canvas, int i10, int i11) {
            int i12;
            float f10;
            float f11;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            Path.FillType fillType;
            Path.FillType fillType2;
            cVar.f17457a.set(matrix);
            Matrix matrix2 = cVar.f17457a;
            matrix2.preConcat(cVar.f17465j);
            canvas.save();
            char c = 0;
            int i13 = 0;
            while (true) {
                ArrayList<d> arrayList = cVar.f17458b;
                if (i13 < arrayList.size()) {
                    d dVar = arrayList.get(i13);
                    if (dVar instanceof c) {
                        a((c) dVar, matrix2, canvas, i10, i11);
                    } else if (dVar instanceof e) {
                        e eVar = (e) dVar;
                        float f12 = i10 / this.f17480j;
                        float f13 = i11 / this.f17481k;
                        float min = Math.min(f12, f13);
                        Matrix matrix3 = this.c;
                        matrix3.set(matrix2);
                        matrix3.postScale(f12, f13);
                        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                        matrix2.mapVectors(fArr);
                        i12 = i13;
                        float hypot = (float) Math.hypot(fArr[2], fArr[3]);
                        float f14 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                        float max = Math.max((float) Math.hypot(fArr[c], fArr[1]), hypot);
                        if (max > 0.0f) {
                            f10 = Math.abs(f14) / max;
                        } else {
                            f10 = 0.0f;
                        }
                        if (f10 != 0.0f) {
                            eVar.getClass();
                            Path path = this.f17472a;
                            path.reset();
                            d.a[] aVarArr = eVar.f17468a;
                            if (aVarArr != null) {
                                d.a.b(aVarArr, path);
                            }
                            Path path2 = this.f17473b;
                            path2.reset();
                            if (eVar instanceof a) {
                                if (eVar.c == 0) {
                                    fillType2 = Path.FillType.WINDING;
                                } else {
                                    fillType2 = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType2);
                                path2.addPath(path, matrix3);
                                canvas.clipPath(path2);
                            } else {
                                b bVar = (b) eVar;
                                float f15 = bVar.f17451j;
                                if (f15 != 0.0f || bVar.f17452k != 1.0f) {
                                    float f16 = bVar.f17453l;
                                    float f17 = (f15 + f16) % 1.0f;
                                    float f18 = (bVar.f17452k + f16) % 1.0f;
                                    if (this.f17476f == null) {
                                        this.f17476f = new PathMeasure();
                                    }
                                    this.f17476f.setPath(path, false);
                                    float length = this.f17476f.getLength();
                                    float f19 = f17 * length;
                                    float f20 = f18 * length;
                                    path.reset();
                                    if (f19 > f20) {
                                        this.f17476f.getSegment(f19, length, path, true);
                                        f11 = 0.0f;
                                        this.f17476f.getSegment(0.0f, f20, path, true);
                                    } else {
                                        f11 = 0.0f;
                                        this.f17476f.getSegment(f19, f20, path, true);
                                    }
                                    path.rLineTo(f11, f11);
                                }
                                path2.addPath(path, matrix3);
                                n0.c cVar2 = bVar.f17448g;
                                if (cVar2.f22278a != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10 && cVar2.c == 0) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                if (z11) {
                                    if (this.f17475e == null) {
                                        Paint paint = new Paint(1);
                                        this.f17475e = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    }
                                    Paint paint2 = this.f17475e;
                                    Shader shader = cVar2.f22278a;
                                    if (shader != null) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (z15) {
                                        shader.setLocalMatrix(matrix3);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(bVar.f17450i * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(FunctionEval.FunctionID.EXTERNAL_FUNC);
                                        int i14 = cVar2.c;
                                        float f21 = bVar.f17450i;
                                        PorterDuff.Mode mode = i.f17438j;
                                        paint2.setColor((i14 & 16777215) | (((int) (Color.alpha(i14) * f21)) << 24));
                                    }
                                    paint2.setColorFilter(null);
                                    if (bVar.c == 0) {
                                        fillType = Path.FillType.WINDING;
                                    } else {
                                        fillType = Path.FillType.EVEN_ODD;
                                    }
                                    path2.setFillType(fillType);
                                    canvas.drawPath(path2, paint2);
                                }
                                n0.c cVar3 = bVar.f17446e;
                                if (cVar3.f22278a != null) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (!z12 && cVar3.c == 0) {
                                    z13 = false;
                                } else {
                                    z13 = true;
                                }
                                if (z13) {
                                    if (this.f17474d == null) {
                                        z14 = true;
                                        Paint paint3 = new Paint(1);
                                        this.f17474d = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    } else {
                                        z14 = true;
                                    }
                                    Paint paint4 = this.f17474d;
                                    Paint.Join join = bVar.f17455n;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = bVar.f17454m;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(bVar.f17456o);
                                    Shader shader2 = cVar3.f22278a;
                                    if (shader2 == null) {
                                        z14 = false;
                                    }
                                    if (z14) {
                                        shader2.setLocalMatrix(matrix3);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(bVar.f17449h * 255.0f));
                                    } else {
                                        paint4.setShader(null);
                                        paint4.setAlpha(FunctionEval.FunctionID.EXTERNAL_FUNC);
                                        int i15 = cVar3.c;
                                        float f22 = bVar.f17449h;
                                        PorterDuff.Mode mode2 = i.f17438j;
                                        paint4.setColor((i15 & 16777215) | (((int) (Color.alpha(i15) * f22)) << 24));
                                    }
                                    paint4.setColorFilter(null);
                                    paint4.setStrokeWidth(bVar.f17447f * f10 * min);
                                    canvas.drawPath(path2, paint4);
                                }
                            }
                        }
                        i13 = i12 + 1;
                        c = 0;
                    }
                    i12 = i13;
                    i13 = i12 + 1;
                    c = 0;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f17482l;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f17482l = i10;
        }

        public f(f fVar) {
            this.c = new Matrix();
            this.f17478h = 0.0f;
            this.f17479i = 0.0f;
            this.f17480j = 0.0f;
            this.f17481k = 0.0f;
            this.f17482l = FunctionEval.FunctionID.EXTERNAL_FUNC;
            this.f17483m = null;
            this.f17484n = null;
            y.b<String, Object> bVar = new y.b<>();
            this.f17485o = bVar;
            this.f17477g = new c(fVar.f17477g, bVar);
            this.f17472a = new Path(fVar.f17472a);
            this.f17473b = new Path(fVar.f17473b);
            this.f17478h = fVar.f17478h;
            this.f17479i = fVar.f17479i;
            this.f17480j = fVar.f17480j;
            this.f17481k = fVar.f17481k;
            this.f17482l = fVar.f17482l;
            this.f17483m = fVar.f17483m;
            String str = fVar.f17483m;
            if (str != null) {
                bVar.put(str, this);
            }
            this.f17484n = fVar.f17484n;
        }
    }
}
