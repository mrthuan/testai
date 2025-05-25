package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.activity.r;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import f9.m;
import f9.q;
import java.util.ArrayList;
import java.util.Iterator;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import w8.o;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes2.dex */
public class g {
    public static final m1.a C = f8.b.c;
    public static final int D = R.attr.motionDurationLong2;
    public static final int E = R.attr.motionEasingEmphasizedInterpolator;
    public static final int F = R.attr.motionDurationMedium1;
    public static final int G = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] H = {16842919, 16842910};
    public static final int[] I = {16843623, 16842908, 16842910};
    public static final int[] J = {16842908, 16842910};
    public static final int[] K = {16843623, 16842910};
    public static final int[] L = {16842910};
    public static final int[] M = new int[0];
    public v8.f B;

    /* renamed from: a  reason: collision with root package name */
    public m f12537a;

    /* renamed from: b  reason: collision with root package name */
    public f9.h f12538b;
    public Drawable c;

    /* renamed from: d  reason: collision with root package name */
    public v8.b f12539d;

    /* renamed from: e  reason: collision with root package name */
    public LayerDrawable f12540e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12541f;

    /* renamed from: h  reason: collision with root package name */
    public float f12543h;

    /* renamed from: i  reason: collision with root package name */
    public float f12544i;

    /* renamed from: j  reason: collision with root package name */
    public float f12545j;

    /* renamed from: k  reason: collision with root package name */
    public int f12546k;

    /* renamed from: l  reason: collision with root package name */
    public Animator f12547l;

    /* renamed from: m  reason: collision with root package name */
    public f8.h f12548m;

    /* renamed from: n  reason: collision with root package name */
    public f8.h f12549n;

    /* renamed from: o  reason: collision with root package name */
    public float f12550o;

    /* renamed from: q  reason: collision with root package name */
    public int f12552q;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f12554s;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f12555t;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList<e> f12556u;

    /* renamed from: v  reason: collision with root package name */
    public final FloatingActionButton f12557v;

    /* renamed from: w  reason: collision with root package name */
    public final e9.b f12558w;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12542g = true;

    /* renamed from: p  reason: collision with root package name */
    public float f12551p = 1.0f;

    /* renamed from: r  reason: collision with root package name */
    public int f12553r = 0;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f12559x = new Rect();

    /* renamed from: y  reason: collision with root package name */
    public final RectF f12560y = new RectF();

    /* renamed from: z  reason: collision with root package name */
    public final RectF f12561z = new RectF();
    public final Matrix A = new Matrix();

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public class a extends f8.g {
        public a() {
        }

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            g.this.f12551p = f10;
            float[] fArr = this.f17149a;
            matrix.getValues(fArr);
            float[] fArr2 = this.f17150b;
            matrix2.getValues(fArr2);
            for (int i10 = 0; i10 < 9; i10++) {
                float f11 = fArr2[i10];
                float f12 = fArr[i10];
                fArr2[i10] = r.l(f11, f12, f10, f12);
            }
            Matrix matrix3 = this.c;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public class b extends h {
        @Override // com.google.android.material.floatingactionbutton.g.h
        public final float a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public class c extends h {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ g f12563e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v8.g gVar) {
            super(gVar);
            this.f12563e = gVar;
        }

        @Override // com.google.android.material.floatingactionbutton.g.h
        public final float a() {
            g gVar = this.f12563e;
            return gVar.f12543h + gVar.f12544i;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public class d extends h {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ g f12564e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(v8.g gVar) {
            super(gVar);
            this.f12564e = gVar;
        }

        @Override // com.google.android.material.floatingactionbutton.g.h
        public final float a() {
            g gVar = this.f12564e;
            return gVar.f12543h + gVar.f12545j;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public interface e {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public interface f {
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.g$g  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0168g extends h {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ g f12565e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0168g(v8.g gVar) {
            super(gVar);
            this.f12565e = gVar;
        }

        @Override // com.google.android.material.floatingactionbutton.g.h
        public final float a() {
            return this.f12565e.f12543h;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public abstract class h extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f12566a;

        /* renamed from: b  reason: collision with root package name */
        public float f12567b;
        public float c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ g f12568d;

        public h(v8.g gVar) {
            this.f12568d = gVar;
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            float f10 = (int) this.c;
            f9.h hVar = this.f12568d.f12538b;
            if (hVar != null) {
                hVar.m(f10);
            }
            this.f12566a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f10;
            boolean z10 = this.f12566a;
            g gVar = this.f12568d;
            if (!z10) {
                f9.h hVar = gVar.f12538b;
                if (hVar == null) {
                    f10 = 0.0f;
                } else {
                    f10 = hVar.f17164a.f17198n;
                }
                this.f12567b = f10;
                this.c = a();
                this.f12566a = true;
            }
            float f11 = this.f12567b;
            float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.c - f11)) + f11);
            f9.h hVar2 = gVar.f12538b;
            if (hVar2 != null) {
                hVar2.m(animatedFraction);
            }
        }
    }

    public g(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        this.f12557v = floatingActionButton;
        this.f12558w = bVar;
        o oVar = new o();
        v8.g gVar = (v8.g) this;
        oVar.a(H, d(new d(gVar)));
        oVar.a(I, d(new c(gVar)));
        oVar.a(J, d(new c(gVar)));
        oVar.a(K, d(new c(gVar)));
        oVar.a(L, d(new C0168g(gVar)));
        oVar.a(M, d(new b(gVar)));
        this.f12550o = floatingActionButton.getRotation();
    }

    public static ValueAnimator d(h hVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(C);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(hVar);
        valueAnimator.addUpdateListener(hVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final void a(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f12557v.getDrawable();
        if (drawable != null && this.f12552q != 0) {
            RectF rectF = this.f12560y;
            RectF rectF2 = this.f12561z;
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            int i10 = this.f12552q;
            rectF2.set(0.0f, 0.0f, i10, i10);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i11 = this.f12552q;
            matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
        }
    }

    public final AnimatorSet b(f8.h hVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f12557v;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, property, fArr);
        hVar.f("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, View.SCALE_X, f11);
        hVar.f("scale").a(ofFloat2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 26) {
            ofFloat2.setEvaluator(new v8.e());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, View.SCALE_Y, f11);
        hVar.f("scale").a(ofFloat3);
        if (i10 == 26) {
            ofFloat3.setEvaluator(new v8.e());
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.A;
        a(f12, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new f8.f(), new a(), new Matrix(matrix));
        hVar.f("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        com.google.android.play.core.assetpacks.c.O(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(int i10, int i11, float f10, float f11, float f12) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f12557v;
        ofFloat.addUpdateListener(new v8.d(this, floatingActionButton.getAlpha(), f10, floatingActionButton.getScaleX(), f11, floatingActionButton.getScaleY(), this.f12551p, f12, new Matrix(this.A)));
        arrayList.add(ofFloat);
        com.google.android.play.core.assetpacks.c.O(animatorSet, arrayList);
        animatorSet.setDuration(x8.a.c(floatingActionButton.getContext(), i10, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(x8.a.d(floatingActionButton.getContext(), i11, f8.b.f17142b));
        return animatorSet;
    }

    public float e() {
        throw null;
    }

    public void f(Rect rect) {
        int i10;
        float f10;
        if (this.f12541f) {
            i10 = (this.f12546k - this.f12557v.getSizeDimension()) / 2;
        } else {
            i10 = 0;
        }
        if (this.f12542g) {
            f10 = e() + this.f12545j;
        } else {
            f10 = 0.0f;
        }
        int max = Math.max(i10, (int) Math.ceil(f10));
        int max2 = Math.max(i10, (int) Math.ceil(f10 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        throw null;
    }

    public void h() {
        throw null;
    }

    public void i() {
        throw null;
    }

    public void j(int[] iArr) {
        throw null;
    }

    public void k(float f10, float f11, float f12) {
        throw null;
    }

    public final void l() {
        ArrayList<e> arrayList = this.f12556u;
        if (arrayList != null) {
            Iterator<e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void m(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable != null) {
            a.b.h(drawable, c9.a.c(colorStateList));
        }
    }

    public final void n(m mVar) {
        this.f12537a = mVar;
        f9.h hVar = this.f12538b;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(mVar);
        }
        Drawable drawable = this.c;
        if (drawable instanceof q) {
            ((q) drawable).setShapeAppearanceModel(mVar);
        }
        v8.b bVar = this.f12539d;
        if (bVar != null) {
            bVar.f30761o = mVar;
            bVar.invalidateSelf();
        }
    }

    public boolean o() {
        throw null;
    }

    public void p() {
        throw null;
    }

    public final void q() {
        Rect rect = this.f12559x;
        f(rect);
        t0.v(this.f12540e, "Didn't initialize content background");
        boolean o10 = o();
        e9.b bVar = this.f12558w;
        if (o10) {
            super/*android.widget.ImageButton*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.f12540e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            LayerDrawable layerDrawable = this.f12540e;
            FloatingActionButton.b bVar2 = (FloatingActionButton.b) bVar;
            if (layerDrawable != null) {
                super/*android.widget.ImageButton*/.setBackgroundDrawable(layerDrawable);
            } else {
                bVar2.getClass();
            }
        }
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        floatingActionButton.f12515l.set(i10, i11, i12, i13);
        int i14 = floatingActionButton.f12512i;
        floatingActionButton.setPadding(i10 + i14, i11 + i14, i12 + i14, i13 + i14);
    }
}
