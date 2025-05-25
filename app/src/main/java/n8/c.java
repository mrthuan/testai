package n8;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.google.android.material.card.MaterialCardView;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import f9.e;
import f9.h;
import f9.l;
import f9.m;
import java.util.WeakHashMap;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.n0;

/* compiled from: MaterialCardViewHelper.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: y  reason: collision with root package name */
    public static final double f22345y = Math.cos(Math.toRadians(45.0d));

    /* renamed from: z  reason: collision with root package name */
    public static final ColorDrawable f22346z;

    /* renamed from: a  reason: collision with root package name */
    public final MaterialCardView f22347a;
    public final h c;

    /* renamed from: d  reason: collision with root package name */
    public final h f22349d;

    /* renamed from: e  reason: collision with root package name */
    public int f22350e;

    /* renamed from: f  reason: collision with root package name */
    public int f22351f;

    /* renamed from: g  reason: collision with root package name */
    public int f22352g;

    /* renamed from: h  reason: collision with root package name */
    public int f22353h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f22354i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f22355j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f22356k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f22357l;

    /* renamed from: m  reason: collision with root package name */
    public m f22358m;

    /* renamed from: n  reason: collision with root package name */
    public ColorStateList f22359n;

    /* renamed from: o  reason: collision with root package name */
    public RippleDrawable f22360o;

    /* renamed from: p  reason: collision with root package name */
    public LayerDrawable f22361p;

    /* renamed from: q  reason: collision with root package name */
    public h f22362q;

    /* renamed from: s  reason: collision with root package name */
    public boolean f22364s;

    /* renamed from: t  reason: collision with root package name */
    public ValueAnimator f22365t;

    /* renamed from: u  reason: collision with root package name */
    public final TimeInterpolator f22366u;

    /* renamed from: v  reason: collision with root package name */
    public final int f22367v;

    /* renamed from: w  reason: collision with root package name */
    public final int f22368w;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f22348b = new Rect();

    /* renamed from: r  reason: collision with root package name */
    public boolean f22363r = false;

    /* renamed from: x  reason: collision with root package name */
    public float f22369x = 0.0f;

    static {
        ColorDrawable colorDrawable;
        if (Build.VERSION.SDK_INT <= 28) {
            colorDrawable = new ColorDrawable();
        } else {
            colorDrawable = null;
        }
        f22346z = colorDrawable;
    }

    public c(MaterialCardView materialCardView, AttributeSet attributeSet, int i10) {
        this.f22347a = materialCardView;
        h hVar = new h(materialCardView.getContext(), attributeSet, i10, 2132018239);
        this.c = hVar;
        hVar.k(materialCardView.getContext());
        hVar.q();
        m mVar = hVar.f17164a.f17186a;
        mVar.getClass();
        m.a aVar = new m.a(mVar);
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, e8.a.f16486h, i10, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            aVar.b(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f22349d = new h();
        h(new m(aVar));
        this.f22366u = x8.a.d(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, f8.b.f17141a);
        this.f22367v = x8.a.c(materialCardView.getContext(), R.attr.motionDurationShort2, OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
        this.f22368w = x8.a.c(materialCardView.getContext(), R.attr.motionDurationShort1, OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
        obtainStyledAttributes.recycle();
    }

    public static float b(ge.a aVar, float f10) {
        if (aVar instanceof l) {
            return (float) ((1.0d - f22345y) * f10);
        }
        if (aVar instanceof e) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        ge.a aVar = this.f22358m.f17212a;
        h hVar = this.c;
        return Math.max(Math.max(b(aVar, hVar.j()), b(this.f22358m.f17213b, hVar.f17164a.f17186a.f17216f.a(hVar.h()))), Math.max(b(this.f22358m.c, hVar.f17164a.f17186a.f17217g.a(hVar.h())), b(this.f22358m.f17214d, hVar.f17164a.f17186a.f17218h.a(hVar.h()))));
    }

    public final LayerDrawable c() {
        if (this.f22360o == null) {
            this.f22362q = new h(this.f22358m);
            this.f22360o = new RippleDrawable(this.f22356k, null, this.f22362q);
        }
        if (this.f22361p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f22360o, this.f22349d, this.f22355j});
            this.f22361p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f22361p;
    }

    public final b d(Drawable drawable) {
        int i10;
        int i11;
        float f10;
        MaterialCardView materialCardView = this.f22347a;
        if (materialCardView.getUseCompatPadding()) {
            float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
            float f11 = 0.0f;
            if (i()) {
                f10 = a();
            } else {
                f10 = 0.0f;
            }
            int ceil = (int) Math.ceil(maxCardElevation + f10);
            float maxCardElevation2 = materialCardView.getMaxCardElevation();
            if (i()) {
                f11 = a();
            }
            i10 = (int) Math.ceil(maxCardElevation2 + f11);
            i11 = ceil;
        } else {
            i10 = 0;
            i11 = 0;
        }
        return new b(drawable, i10, i11, i10, i11);
    }

    public final void e(int i10, int i11) {
        int i12;
        int i13;
        boolean z10;
        int i14;
        boolean z11;
        int i15;
        boolean z12;
        int i16;
        int i17;
        int i18;
        int i19;
        float f10;
        if (this.f22361p != null) {
            MaterialCardView materialCardView = this.f22347a;
            boolean z13 = false;
            if (materialCardView.getUseCompatPadding()) {
                float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
                float f11 = 0.0f;
                if (i()) {
                    f10 = a();
                } else {
                    f10 = 0.0f;
                }
                i12 = (int) Math.ceil((maxCardElevation + f10) * 2.0f);
                float maxCardElevation2 = materialCardView.getMaxCardElevation();
                if (i()) {
                    f11 = a();
                }
                i13 = (int) Math.ceil((maxCardElevation2 + f11) * 2.0f);
            } else {
                i12 = 0;
                i13 = 0;
            }
            int i20 = this.f22352g;
            if ((i20 & 8388613) == 8388613) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i14 = ((i10 - this.f22350e) - this.f22351f) - i13;
            } else {
                i14 = this.f22350e;
            }
            if ((i20 & 80) == 80) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i15 = this.f22350e;
            } else {
                i15 = ((i11 - this.f22350e) - this.f22351f) - i12;
            }
            int i21 = i15;
            if ((i20 & 8388613) == 8388613) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                i16 = this.f22350e;
            } else {
                i16 = ((i10 - this.f22350e) - this.f22351f) - i13;
            }
            if ((i20 & 80) == 80) {
                z13 = true;
            }
            if (z13) {
                i17 = ((i11 - this.f22350e) - this.f22351f) - i12;
            } else {
                i17 = this.f22350e;
            }
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            if (f0.e.d(materialCardView) == 1) {
                i19 = i16;
                i18 = i14;
            } else {
                i18 = i16;
                i19 = i14;
            }
            this.f22361p.setLayerInset(2, i19, i17, i18, i21);
        }
    }

    public final void f(boolean z10, boolean z11) {
        float f10;
        int i10;
        Drawable drawable = this.f22355j;
        if (drawable != null) {
            int i11 = 0;
            float f11 = 0.0f;
            if (z11) {
                if (z10) {
                    f11 = 1.0f;
                }
                if (z10) {
                    f10 = 1.0f - this.f22369x;
                } else {
                    f10 = this.f22369x;
                }
                ValueAnimator valueAnimator = this.f22365t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f22365t = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f22369x, f11);
                this.f22365t = ofFloat;
                ofFloat.addUpdateListener(new a(this, 0));
                this.f22365t.setInterpolator(this.f22366u);
                ValueAnimator valueAnimator2 = this.f22365t;
                if (z10) {
                    i10 = this.f22367v;
                } else {
                    i10 = this.f22368w;
                }
                valueAnimator2.setDuration(i10 * f10);
                this.f22365t.start();
                return;
            }
            if (z10) {
                i11 = FunctionEval.FunctionID.EXTERNAL_FUNC;
            }
            drawable.setAlpha(i11);
            if (z10) {
                f11 = 1.0f;
            }
            this.f22369x = f11;
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f22355j = mutate;
            a.b.h(mutate, this.f22357l);
            f(this.f22347a.isChecked(), false);
        } else {
            this.f22355j = f22346z;
        }
        LayerDrawable layerDrawable = this.f22361p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f22355j);
        }
    }

    public final void h(m mVar) {
        this.f22358m = mVar;
        h hVar = this.c;
        hVar.setShapeAppearanceModel(mVar);
        hVar.f17184v = !hVar.l();
        h hVar2 = this.f22349d;
        if (hVar2 != null) {
            hVar2.setShapeAppearanceModel(mVar);
        }
        h hVar3 = this.f22362q;
        if (hVar3 != null) {
            hVar3.setShapeAppearanceModel(mVar);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f22347a;
        if (materialCardView.getPreventCornerOverlap() && this.c.l() && materialCardView.getUseCompatPadding()) {
            return true;
        }
        return false;
    }

    public final void j() {
        boolean z10;
        float f10;
        MaterialCardView materialCardView = this.f22347a;
        boolean z11 = true;
        if (materialCardView.getPreventCornerOverlap() && !this.c.l()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && !i()) {
            z11 = false;
        }
        float f11 = 0.0f;
        if (z11) {
            f10 = a();
        } else {
            f10 = 0.0f;
        }
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            f11 = (float) ((1.0d - f22345y) * materialCardView.getCardViewRadius());
        }
        int i10 = (int) (f10 - f11);
        Rect rect = this.f22348b;
        materialCardView.c.set(rect.left + i10, rect.top + i10, rect.right + i10, rect.bottom + i10);
        CardView.f2723g.d0(materialCardView.f2727e);
    }

    public final void k() {
        boolean z10 = this.f22363r;
        MaterialCardView materialCardView = this.f22347a;
        if (!z10) {
            materialCardView.setBackgroundInternal(d(this.c));
        }
        materialCardView.setForeground(d(this.f22354i));
    }
}
