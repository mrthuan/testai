package b9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import n0.f;

/* compiled from: TextAppearance.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f5375a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5376b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5377d;

    /* renamed from: e  reason: collision with root package name */
    public final float f5378e;

    /* renamed from: f  reason: collision with root package name */
    public final float f5379f;

    /* renamed from: g  reason: collision with root package name */
    public final float f5380g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5381h;

    /* renamed from: i  reason: collision with root package name */
    public final float f5382i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f5383j;

    /* renamed from: k  reason: collision with root package name */
    public float f5384k;

    /* renamed from: l  reason: collision with root package name */
    public final int f5385l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5386m = false;

    /* renamed from: n  reason: collision with root package name */
    public Typeface f5387n;

    /* compiled from: TextAppearance.java */
    /* loaded from: classes2.dex */
    public class a extends f.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r.d f5388a;

        public a(r.d dVar) {
            this.f5388a = dVar;
        }

        @Override // n0.f.e
        public final void c(int i10) {
            d.this.f5386m = true;
            this.f5388a.f(i10);
        }

        @Override // n0.f.e
        public final void d(Typeface typeface) {
            d dVar = d.this;
            dVar.f5387n = Typeface.create(typeface, dVar.c);
            dVar.f5386m = true;
            this.f5388a.j(dVar.f5387n, false);
        }
    }

    public d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, e8.a.f16479d0);
        this.f5384k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f5383j = c.a(context, obtainStyledAttributes, 3);
        c.a(context, obtainStyledAttributes, 4);
        c.a(context, obtainStyledAttributes, 5);
        this.c = obtainStyledAttributes.getInt(2, 0);
        this.f5377d = obtainStyledAttributes.getInt(1, 1);
        int i11 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f5385l = obtainStyledAttributes.getResourceId(i11, 0);
        this.f5376b = obtainStyledAttributes.getString(i11);
        obtainStyledAttributes.getBoolean(14, false);
        this.f5375a = c.a(context, obtainStyledAttributes, 6);
        this.f5378e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f5379f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f5380g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, e8.a.I);
        this.f5381h = obtainStyledAttributes2.hasValue(0);
        this.f5382i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f5387n;
        int i10 = this.c;
        if (typeface == null && (str = this.f5376b) != null) {
            this.f5387n = Typeface.create(str, i10);
        }
        if (this.f5387n == null) {
            int i11 = this.f5377d;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        this.f5387n = Typeface.DEFAULT;
                    } else {
                        this.f5387n = Typeface.MONOSPACE;
                    }
                } else {
                    this.f5387n = Typeface.SERIF;
                }
            } else {
                this.f5387n = Typeface.SANS_SERIF;
            }
            this.f5387n = Typeface.create(this.f5387n, i10);
        }
    }

    public final Typeface b(Context context) {
        Typeface b10;
        if (this.f5386m) {
            return this.f5387n;
        }
        if (!context.isRestricted()) {
            try {
                int i10 = this.f5385l;
                ThreadLocal<TypedValue> threadLocal = n0.f.f22291a;
                if (context.isRestricted()) {
                    b10 = null;
                } else {
                    b10 = n0.f.b(context, i10, new TypedValue(), 0, null, false, false);
                }
                this.f5387n = b10;
                if (b10 != null) {
                    this.f5387n = Typeface.create(b10, this.c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        a();
        this.f5386m = true;
        return this.f5387n;
    }

    public final void c(Context context, r.d dVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i10 = this.f5385l;
        if (i10 == 0) {
            this.f5386m = true;
        }
        if (this.f5386m) {
            dVar.j(this.f5387n, true);
            return;
        }
        try {
            a aVar = new a(dVar);
            ThreadLocal<TypedValue> threadLocal = n0.f.f22291a;
            if (context.isRestricted()) {
                aVar.a(-4);
            } else {
                n0.f.b(context, i10, new TypedValue(), 0, aVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f5386m = true;
            dVar.f(1);
        } catch (Exception unused2) {
            this.f5386m = true;
            dVar.f(-3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.content.Context r8) {
        /*
            r7 = this;
            int r1 = r7.f5385l
            if (r1 == 0) goto L1c
            java.lang.ThreadLocal<android.util.TypedValue> r0 = n0.f.f22291a
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto Ld
            goto L1c
        Ld:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r0 = r8
            android.graphics.Typeface r8 = n0.f.b(r0, r1, r2, r3, r4, r5, r6)
            goto L1d
        L1c:
            r8 = 0
        L1d:
            if (r8 == 0) goto L21
            r8 = 1
            goto L22
        L21:
            r8 = 0
        L22:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.d.d(android.content.Context):boolean");
    }

    public final void e(Context context, TextPaint textPaint, r.d dVar) {
        int i10;
        int i11;
        f(context, textPaint, dVar);
        ColorStateList colorStateList = this.f5383j;
        if (colorStateList != null) {
            i10 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i10 = -16777216;
        }
        textPaint.setColor(i10);
        ColorStateList colorStateList2 = this.f5375a;
        if (colorStateList2 != null) {
            i11 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i11 = 0;
        }
        textPaint.setShadowLayer(this.f5380g, this.f5378e, this.f5379f, i11);
    }

    public final void f(Context context, TextPaint textPaint, r.d dVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f5387n);
        c(context, new e(this, context, textPaint, dVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z10;
        float f10;
        Typeface a10 = h.a(context.getResources().getConfiguration(), typeface);
        if (a10 != null) {
            typeface = a10;
        }
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.c;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setFakeBoldText(z10);
        if ((i10 & 2) != 0) {
            f10 = -0.25f;
        } else {
            f10 = 0.0f;
        }
        textPaint.setTextSkewX(f10);
        textPaint.setTextSize(this.f5384k);
        if (this.f5381h) {
            textPaint.setLetterSpacing(this.f5382i);
        }
    }
}
