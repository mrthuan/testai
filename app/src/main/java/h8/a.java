package h8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b9.d;
import f9.h;
import f9.m;
import h8.b;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import w8.p;
import w8.s;
import x0.f0;
import x0.n0;

/* compiled from: BadgeDrawable.java */
/* loaded from: classes2.dex */
public final class a extends Drawable implements p.b {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f18066a;

    /* renamed from: b  reason: collision with root package name */
    public final h f18067b;
    public final p c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f18068d;

    /* renamed from: e  reason: collision with root package name */
    public final b f18069e;

    /* renamed from: f  reason: collision with root package name */
    public float f18070f;

    /* renamed from: g  reason: collision with root package name */
    public float f18071g;

    /* renamed from: h  reason: collision with root package name */
    public int f18072h;

    /* renamed from: i  reason: collision with root package name */
    public float f18073i;

    /* renamed from: j  reason: collision with root package name */
    public float f18074j;

    /* renamed from: k  reason: collision with root package name */
    public float f18075k;

    /* renamed from: l  reason: collision with root package name */
    public WeakReference<View> f18076l;

    /* renamed from: m  reason: collision with root package name */
    public WeakReference<FrameLayout> f18077m;

    public a(Context context, b.a aVar) {
        int intValue;
        int intValue2;
        FrameLayout frameLayout;
        d dVar;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f18066a = weakReference;
        s.c(context, s.f31055b, "Theme.MaterialComponents");
        this.f18068d = new Rect();
        p pVar = new p(this);
        this.c = pVar;
        TextPaint textPaint = pVar.f31047a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        b bVar = new b(context, aVar);
        this.f18069e = bVar;
        boolean a10 = bVar.a();
        b.a aVar2 = bVar.f18079b;
        if (a10) {
            intValue = aVar2.f18094g.intValue();
        } else {
            intValue = aVar2.f18092e.intValue();
        }
        if (bVar.a()) {
            intValue2 = aVar2.f18095h.intValue();
        } else {
            intValue2 = aVar2.f18093f.intValue();
        }
        h hVar = new h(new m(m.a(context, intValue, intValue2)));
        this.f18067b = hVar;
        g();
        Context context2 = weakReference.get();
        if (context2 != null && pVar.f31051f != (dVar = new d(context2, aVar2.f18091d.intValue()))) {
            pVar.b(dVar, context2);
            textPaint.setColor(aVar2.c.intValue());
            invalidateSelf();
            i();
            invalidateSelf();
        }
        this.f18072h = ((int) Math.pow(10.0d, aVar2.f18098k - 1.0d)) - 1;
        pVar.f31049d = true;
        i();
        invalidateSelf();
        pVar.f31049d = true;
        g();
        i();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(aVar2.f18090b.intValue());
        if (hVar.f17164a.c != valueOf) {
            hVar.n(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(aVar2.c.intValue());
        invalidateSelf();
        WeakReference<View> weakReference2 = this.f18076l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = this.f18076l.get();
            WeakReference<FrameLayout> weakReference3 = this.f18077m;
            if (weakReference3 != null) {
                frameLayout = weakReference3.get();
            } else {
                frameLayout = null;
            }
            h(view, frameLayout);
        }
        i();
        setVisible(aVar2.f18104q.booleanValue(), false);
    }

    @Override // w8.p.b
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        int e10 = e();
        int i10 = this.f18072h;
        b bVar = this.f18069e;
        if (e10 <= i10) {
            return NumberFormat.getInstance(bVar.f18079b.f18099l).format(e());
        }
        Context context = this.f18066a.get();
        if (context == null) {
            return "";
        }
        return String.format(bVar.f18079b.f18099l, context.getString(R.string.arg_res_0x7f130277), Integer.valueOf(this.f18072h), "+");
    }

    public final CharSequence c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        boolean f10 = f();
        b bVar = this.f18069e;
        if (f10) {
            if (bVar.f18079b.f18101n == 0 || (context = this.f18066a.get()) == null) {
                return null;
            }
            int e10 = e();
            int i10 = this.f18072h;
            b.a aVar = bVar.f18079b;
            if (e10 <= i10) {
                return context.getResources().getQuantityString(aVar.f18101n, e(), Integer.valueOf(e()));
            }
            return context.getString(aVar.f18102o, Integer.valueOf(i10));
        }
        return bVar.f18079b.f18100m;
    }

    public final FrameLayout d() {
        WeakReference<FrameLayout> weakReference = this.f18077m;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f18067b.draw(canvas);
            if (f()) {
                Rect rect = new Rect();
                String b10 = b();
                p pVar = this.c;
                pVar.f31047a.getTextBounds(b10, 0, b10.length(), rect);
                canvas.drawText(b10, this.f18070f, this.f18071g + (rect.height() / 2), pVar.f31047a);
            }
        }
    }

    public final int e() {
        if (f()) {
            return this.f18069e.f18079b.f18097j;
        }
        return 0;
    }

    public final boolean f() {
        return this.f18069e.a();
    }

    public final void g() {
        int intValue;
        int intValue2;
        Context context = this.f18066a.get();
        if (context == null) {
            return;
        }
        b bVar = this.f18069e;
        boolean a10 = bVar.a();
        b.a aVar = bVar.f18079b;
        if (a10) {
            intValue = aVar.f18094g.intValue();
        } else {
            intValue = aVar.f18092e.intValue();
        }
        if (bVar.a()) {
            intValue2 = aVar.f18095h.intValue();
        } else {
            intValue2 = aVar.f18093f.intValue();
        }
        this.f18067b.setShapeAppearanceModel(new m(m.a(context, intValue, intValue2)));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f18069e.f18079b.f18096i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f18068d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f18068d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(View view, FrameLayout frameLayout) {
        this.f18076l = new WeakReference<>(view);
        this.f18077m = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        i();
        invalidateSelf();
    }

    public final void i() {
        View view;
        float f10;
        float f11;
        float f12;
        int intValue;
        int intValue2;
        float f13;
        float f14;
        int i10;
        Context context = this.f18066a.get();
        WeakReference<View> weakReference = this.f18076l;
        FrameLayout frameLayout = null;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            Rect rect2 = this.f18068d;
            rect.set(rect2);
            Rect rect3 = new Rect();
            view.getDrawingRect(rect3);
            WeakReference<FrameLayout> weakReference2 = this.f18077m;
            if (weakReference2 != null) {
                frameLayout = weakReference2.get();
            }
            if (frameLayout != null) {
                frameLayout.offsetDescendantRectToMyCoords(view, rect3);
            }
            boolean f15 = f();
            b bVar = this.f18069e;
            if (!f15) {
                f10 = bVar.c;
            } else {
                f10 = bVar.f18080d;
            }
            this.f18073i = f10;
            if (f10 != -1.0f) {
                this.f18075k = f10;
                this.f18074j = f10;
            } else {
                if (!f()) {
                    f11 = bVar.f18082f;
                } else {
                    f11 = bVar.f18084h;
                }
                this.f18075k = Math.round(f11 / 2.0f);
                if (!f()) {
                    f12 = bVar.f18081e;
                } else {
                    f12 = bVar.f18083g;
                }
                this.f18074j = Math.round(f12 / 2.0f);
            }
            if (e() > 9) {
                this.f18074j = Math.max(this.f18074j, (this.c.a(b()) / 2.0f) + bVar.f18085i);
            }
            if (f()) {
                intValue = bVar.f18079b.f18108u.intValue();
            } else {
                intValue = bVar.f18079b.f18106s.intValue();
            }
            if (bVar.f18088l == 0) {
                intValue -= Math.round(this.f18075k);
            }
            b.a aVar = bVar.f18079b;
            int intValue3 = aVar.f18110w.intValue() + intValue;
            int intValue4 = aVar.f18103p.intValue();
            if (intValue4 != 8388691 && intValue4 != 8388693) {
                this.f18071g = rect3.top + intValue3;
            } else {
                this.f18071g = rect3.bottom - intValue3;
            }
            if (f()) {
                intValue2 = aVar.f18107t.intValue();
            } else {
                intValue2 = aVar.f18105r.intValue();
            }
            if (bVar.f18088l == 1) {
                if (f()) {
                    i10 = bVar.f18087k;
                } else {
                    i10 = bVar.f18086j;
                }
                intValue2 += i10;
            }
            int intValue5 = aVar.f18109v.intValue() + intValue2;
            int intValue6 = aVar.f18103p.intValue();
            if (intValue6 != 8388659 && intValue6 != 8388691) {
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                if (f0.e.d(view) == 0) {
                    f14 = (rect3.right + this.f18074j) - intValue5;
                } else {
                    f14 = (rect3.left - this.f18074j) + intValue5;
                }
                this.f18070f = f14;
            } else {
                WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
                if (f0.e.d(view) == 0) {
                    f13 = (rect3.left - this.f18074j) + intValue5;
                } else {
                    f13 = (rect3.right + this.f18074j) - intValue5;
                }
                this.f18070f = f13;
            }
            float f16 = this.f18070f;
            float f17 = this.f18071g;
            float f18 = this.f18074j;
            float f19 = this.f18075k;
            rect2.set((int) (f16 - f18), (int) (f17 - f19), (int) (f16 + f18), (int) (f17 + f19));
            float f20 = this.f18073i;
            int i11 = (f20 > (-1.0f) ? 1 : (f20 == (-1.0f) ? 0 : -1));
            h hVar = this.f18067b;
            if (i11 != 0) {
                hVar.setShapeAppearanceModel(hVar.f17164a.f17186a.g(f20));
            }
            if (!rect.equals(rect2)) {
                hVar.setBounds(rect2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, w8.p.b
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        b bVar = this.f18069e;
        bVar.f18078a.f18096i = i10;
        bVar.f18079b.f18096i = i10;
        this.c.f31047a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
