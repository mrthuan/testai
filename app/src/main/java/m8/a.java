package m8;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import f9.h;
import f9.m;
import f9.q;
import java.util.WeakHashMap;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import x0.f0;
import x0.n0;

/* compiled from: MaterialButtonHelper.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f21841a;

    /* renamed from: b  reason: collision with root package name */
    public m f21842b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f21843d;

    /* renamed from: e  reason: collision with root package name */
    public int f21844e;

    /* renamed from: f  reason: collision with root package name */
    public int f21845f;

    /* renamed from: g  reason: collision with root package name */
    public int f21846g;

    /* renamed from: h  reason: collision with root package name */
    public int f21847h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f21848i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f21849j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f21850k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f21851l;

    /* renamed from: m  reason: collision with root package name */
    public h f21852m;

    /* renamed from: q  reason: collision with root package name */
    public boolean f21856q;

    /* renamed from: s  reason: collision with root package name */
    public RippleDrawable f21858s;

    /* renamed from: t  reason: collision with root package name */
    public int f21859t;

    /* renamed from: n  reason: collision with root package name */
    public boolean f21853n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f21854o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f21855p = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f21857r = true;

    public a(MaterialButton materialButton, m mVar) {
        this.f21841a = materialButton;
        this.f21842b = mVar;
    }

    public final q a() {
        RippleDrawable rippleDrawable = this.f21858s;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 1) {
            if (this.f21858s.getNumberOfLayers() > 2) {
                return (q) this.f21858s.getDrawable(2);
            }
            return (q) this.f21858s.getDrawable(1);
        }
        return null;
    }

    public final h b(boolean z10) {
        RippleDrawable rippleDrawable = this.f21858s;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 0) {
            return (h) ((LayerDrawable) ((InsetDrawable) this.f21858s.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
        }
        return null;
    }

    public final void c(m mVar) {
        this.f21842b = mVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(mVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(mVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(mVar);
        }
    }

    public final void d(int i10, int i11) {
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        MaterialButton materialButton = this.f21841a;
        int f10 = f0.e.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int e10 = f0.e.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i12 = this.f21844e;
        int i13 = this.f21845f;
        this.f21845f = i11;
        this.f21844e = i10;
        if (!this.f21854o) {
            e();
        }
        f0.e.k(materialButton, f10, (paddingTop + i10) - i12, e10, (paddingBottom + i11) - i13);
    }

    public final void e() {
        int i10;
        h hVar = new h(this.f21842b);
        MaterialButton materialButton = this.f21841a;
        hVar.k(materialButton.getContext());
        a.b.h(hVar, this.f21849j);
        PorterDuff.Mode mode = this.f21848i;
        if (mode != null) {
            a.b.i(hVar, mode);
        }
        ColorStateList colorStateList = this.f21850k;
        hVar.t(this.f21847h);
        hVar.s(colorStateList);
        h hVar2 = new h(this.f21842b);
        hVar2.setTint(0);
        float f10 = this.f21847h;
        if (this.f21853n) {
            i10 = t0.K(materialButton, R.attr.colorSurface);
        } else {
            i10 = 0;
        }
        hVar2.t(f10);
        hVar2.s(ColorStateList.valueOf(i10));
        h hVar3 = new h(this.f21842b);
        this.f21852m = hVar3;
        a.b.g(hVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(c9.a.c(this.f21851l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{hVar2, hVar}), this.c, this.f21844e, this.f21843d, this.f21845f), this.f21852m);
        this.f21858s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        h b10 = b(false);
        if (b10 != null) {
            b10.m(this.f21859t);
            b10.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        int i10 = 0;
        h b10 = b(false);
        h b11 = b(true);
        if (b10 != null) {
            ColorStateList colorStateList = this.f21850k;
            b10.t(this.f21847h);
            b10.s(colorStateList);
            if (b11 != null) {
                float f10 = this.f21847h;
                if (this.f21853n) {
                    i10 = t0.K(this.f21841a, R.attr.colorSurface);
                }
                b11.t(f10);
                b11.s(ColorStateList.valueOf(i10));
            }
        }
    }
}
