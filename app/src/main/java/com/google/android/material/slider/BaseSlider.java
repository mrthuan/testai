package com.google.android.material.slider;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.activity.r;
import com.google.android.gms.common.api.Api;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.a;
import com.google.android.material.slider.b;
import f2.v;
import f9.h;
import f9.m;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import lib.zj.office.fc.hslf.record.SlideAtom;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;
import w8.p;
import w8.s;
import w8.w;
import x0.f0;
import x0.n0;
import y0.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends com.google.android.material.slider.a<S>, T extends com.google.android.material.slider.b<S>> extends View {

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ int f12872i0 = 0;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public float F;
    public MotionEvent G;
    public boolean H;
    public float I;
    public float J;
    public ArrayList<Float> K;
    public int L;
    public int M;
    public float N;
    public float[] O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public ColorStateList V;
    public ColorStateList W;

    /* renamed from: a  reason: collision with root package name */
    public final Paint f12873a;

    /* renamed from: a0  reason: collision with root package name */
    public ColorStateList f12874a0;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f12875b;

    /* renamed from: b0  reason: collision with root package name */
    public ColorStateList f12876b0;
    public final Paint c;

    /* renamed from: c0  reason: collision with root package name */
    public ColorStateList f12877c0;

    /* renamed from: d  reason: collision with root package name */
    public final Paint f12878d;

    /* renamed from: d0  reason: collision with root package name */
    public final h f12879d0;

    /* renamed from: e  reason: collision with root package name */
    public final Paint f12880e;

    /* renamed from: e0  reason: collision with root package name */
    public Drawable f12881e0;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f12882f;

    /* renamed from: f0  reason: collision with root package name */
    public List<Drawable> f12883f0;

    /* renamed from: g  reason: collision with root package name */
    public final c f12884g;

    /* renamed from: g0  reason: collision with root package name */
    public float f12885g0;

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f12886h;

    /* renamed from: h0  reason: collision with root package name */
    public int f12887h0;

    /* renamed from: i  reason: collision with root package name */
    public BaseSlider<S, L, T>.b f12888i;

    /* renamed from: j  reason: collision with root package name */
    public int f12889j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f12890k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f12891l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f12892m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12893n;

    /* renamed from: o  reason: collision with root package name */
    public ValueAnimator f12894o;

    /* renamed from: p  reason: collision with root package name */
    public ValueAnimator f12895p;

    /* renamed from: q  reason: collision with root package name */
    public final int f12896q;

    /* renamed from: r  reason: collision with root package name */
    public int f12897r;

    /* renamed from: s  reason: collision with root package name */
    public int f12898s;

    /* renamed from: t  reason: collision with root package name */
    public int f12899t;

    /* renamed from: u  reason: collision with root package name */
    public int f12900u;

    /* renamed from: v  reason: collision with root package name */
    public int f12901v;

    /* renamed from: w  reason: collision with root package name */
    public int f12902w;

    /* renamed from: x  reason: collision with root package name */
    public int f12903x;

    /* renamed from: y  reason: collision with root package name */
    public int f12904y;

    /* renamed from: z  reason: collision with root package name */
    public int f12905z;

    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseSlider baseSlider = BaseSlider.this;
            Iterator it = baseSlider.f12890k.iterator();
            while (it.hasNext()) {
                m9.a aVar = (m9.a) it.next();
                aVar.L = 1.2f;
                aVar.J = floatValue;
                aVar.K = floatValue;
                aVar.M = f8.b.a(0.0f, 1.0f, 0.19f, 1.0f, floatValue);
                aVar.invalidateSelf();
            }
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.d.k(baseSlider);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public int f12907a = -1;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseSlider.this.f12884g.x(this.f12907a, 4);
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends d1.a {

        /* renamed from: q  reason: collision with root package name */
        public final BaseSlider<?, ?, ?> f12909q;

        /* renamed from: r  reason: collision with root package name */
        public final Rect f12910r;

        public c(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f12910r = new Rect();
            this.f12909q = baseSlider;
        }

        @Override // d1.a
        public final int n(float f10, float f11) {
            int i10 = 0;
            while (true) {
                BaseSlider<?, ?, ?> baseSlider = this.f12909q;
                if (i10 < baseSlider.getValues().size()) {
                    Rect rect = this.f12910r;
                    baseSlider.q(i10, rect);
                    if (rect.contains((int) f10, (int) f11)) {
                        return i10;
                    }
                    i10++;
                } else {
                    return -1;
                }
            }
        }

        @Override // d1.a
        public final void o(ArrayList arrayList) {
            for (int i10 = 0; i10 < this.f12909q.getValues().size(); i10++) {
                arrayList.add(Integer.valueOf(i10));
            }
        }

        @Override // d1.a
        public final boolean s(int i10, int i11, Bundle bundle) {
            float f10;
            float f11;
            BaseSlider<?, ?, ?> baseSlider = this.f12909q;
            if (!baseSlider.isEnabled()) {
                return false;
            }
            if (i11 != 4096 && i11 != 8192) {
                if (i11 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    float f12 = bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
                    int i12 = BaseSlider.f12872i0;
                    if (baseSlider.p(f12, i10)) {
                        baseSlider.r();
                        baseSlider.postInvalidate();
                        p(i10);
                        return true;
                    }
                }
                return false;
            }
            int i13 = BaseSlider.f12872i0;
            float f13 = baseSlider.N;
            if (f13 == 0.0f) {
                f13 = 1.0f;
            }
            if ((baseSlider.J - baseSlider.I) / f13 > 20) {
                f13 *= Math.round(f10 / f11);
            }
            if (i11 == 8192) {
                f13 = -f13;
            }
            if (baseSlider.h()) {
                f13 = -f13;
            }
            if (!baseSlider.p(com.google.android.play.core.assetpacks.c.m(baseSlider.getValues().get(i10).floatValue() + f13, baseSlider.getValueFrom(), baseSlider.getValueTo()), i10)) {
                return false;
            }
            baseSlider.r();
            baseSlider.postInvalidate();
            p(i10);
            return true;
        }

        @Override // d1.a
        public final void u(int i10, f fVar) {
            String str;
            String str2;
            fVar.b(f.a.f31963o);
            BaseSlider<?, ?, ?> baseSlider = this.f12909q;
            List<Float> values = baseSlider.getValues();
            float floatValue = values.get(i10).floatValue();
            float valueFrom = baseSlider.getValueFrom();
            float valueTo = baseSlider.getValueTo();
            if (baseSlider.isEnabled()) {
                if (floatValue > valueFrom) {
                    fVar.a(8192);
                }
                if (floatValue < valueTo) {
                    fVar.a(4096);
                }
            }
            fVar.f31951a.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, floatValue));
            fVar.h(SeekBar.class.getName());
            StringBuilder sb2 = new StringBuilder();
            if (baseSlider.getContentDescription() != null) {
                sb2.append(baseSlider.getContentDescription());
                sb2.append(",");
            }
            if (((int) floatValue) == floatValue) {
                str = "%.0f";
            } else {
                str = "%.2f";
            }
            String format = String.format(str, Float.valueOf(floatValue));
            String string = baseSlider.getContext().getString(R.string.arg_res_0x7f13024f);
            if (values.size() > 1) {
                if (i10 == baseSlider.getValues().size() - 1) {
                    str2 = baseSlider.getContext().getString(R.string.arg_res_0x7f13024d);
                } else if (i10 == 0) {
                    str2 = baseSlider.getContext().getString(R.string.arg_res_0x7f13024e);
                } else {
                    str2 = "";
                }
                string = str2;
            }
            sb2.append(String.format(Locale.US, "%s, %s", string, format));
            fVar.j(sb2.toString());
            Rect rect = this.f12910r;
            baseSlider.q(i10, rect);
            fVar.g(rect);
        }
    }

    /* loaded from: classes2.dex */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public float f12911a;

        /* renamed from: b  reason: collision with root package name */
        public float f12912b;
        public ArrayList<Float> c;

        /* renamed from: d  reason: collision with root package name */
        public float f12913d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f12914e;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f12911a = parcel.readFloat();
            this.f12912b = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.c = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f12913d = parcel.readFloat();
            this.f12914e = parcel.createBooleanArray()[0];
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeFloat(this.f12911a);
            parcel.writeFloat(this.f12912b);
            parcel.writeList(this.c);
            parcel.writeFloat(this.f12913d);
            parcel.writeBooleanArray(new boolean[]{this.f12914e});
        }
    }

    public BaseSlider(Context context) {
        this(context, null);
    }

    private float[] getActiveRange() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.K.size() == 1) {
            floatValue2 = this.I;
        }
        float l10 = l(floatValue2);
        float l11 = l(floatValue);
        return h() ? new float[]{l11, l10} : new float[]{l10, l11};
    }

    private float getValueOfTouchPosition() {
        double d10;
        float f10;
        int i10;
        float f11 = this.f12885g0;
        float f12 = this.N;
        if (f12 > 0.0f) {
            d10 = Math.round(f11 * i10) / ((int) ((this.J - this.I) / f12));
        } else {
            d10 = f11;
        }
        if (h()) {
            d10 = 1.0d - d10;
        }
        float f13 = this.J;
        return (float) ((d10 * (f13 - f10)) + this.I);
    }

    private float getValueOfTouchPositionAbsolute() {
        float f10 = this.f12885g0;
        if (h()) {
            f10 = 1.0f - f10;
        }
        float f11 = this.J;
        float f12 = this.I;
        return r.l(f11, f12, f10, f12);
    }

    private void setValuesInternal(ArrayList<Float> arrayList) {
        b9.d dVar;
        int i10;
        int i11;
        int i12;
        ViewGroup c10;
        int resourceId;
        v d10;
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.K.size() == arrayList.size() && this.K.equals(arrayList)) {
                return;
            }
            this.K = arrayList;
            int i13 = 1;
            this.U = true;
            this.M = 0;
            r();
            ArrayList arrayList2 = this.f12890k;
            if (arrayList2.size() > this.K.size()) {
                List<m9.a> subList = arrayList2.subList(this.K.size(), arrayList2.size());
                for (m9.a aVar : subList) {
                    WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                    if (f0.g.b(this) && (d10 = w.d(this)) != null) {
                        d10.a(aVar);
                        ViewGroup c11 = w.c(this);
                        if (c11 == null) {
                            aVar.getClass();
                        } else {
                            c11.removeOnLayoutChangeListener(aVar.B);
                        }
                    }
                }
                subList.clear();
            }
            while (arrayList2.size() < this.K.size()) {
                Context context = getContext();
                int i14 = this.f12889j;
                m9.a aVar2 = new m9.a(context, i14);
                TypedArray d11 = s.d(aVar2.f21861y, null, e8.a.f16487h0, 0, i14, new int[0]);
                Context context2 = aVar2.f21861y;
                aVar2.H = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
                m mVar = aVar2.f17164a.f17186a;
                mVar.getClass();
                m.a aVar3 = new m.a(mVar);
                aVar3.f17232k = aVar2.y();
                aVar2.setShapeAppearanceModel(new m(aVar3));
                CharSequence text = d11.getText(6);
                boolean equals = TextUtils.equals(aVar2.f21860x, text);
                p pVar = aVar2.A;
                if (!equals) {
                    aVar2.f21860x = text;
                    pVar.f31049d = true;
                    aVar2.invalidateSelf();
                }
                if (d11.hasValue(0) && (resourceId = d11.getResourceId(0, 0)) != 0) {
                    dVar = new b9.d(context2, resourceId);
                } else {
                    dVar = null;
                }
                if (dVar != null && d11.hasValue(1)) {
                    dVar.f5383j = b9.c.a(context2, d11, 1);
                }
                pVar.b(dVar, context2);
                TypedValue c12 = b9.b.c(context2, R.attr.colorOnBackground, m9.a.class.getCanonicalName());
                int i15 = c12.resourceId;
                if (i15 != 0) {
                    i10 = androidx.core.content.a.getColor(context2, i15);
                } else {
                    i10 = c12.data;
                }
                TypedValue c13 = b9.b.c(context2, 16842801, m9.a.class.getCanonicalName());
                int i16 = c13.resourceId;
                if (i16 != 0) {
                    i11 = androidx.core.content.a.getColor(context2, i16);
                } else {
                    i11 = c13.data;
                }
                aVar2.n(ColorStateList.valueOf(d11.getColor(7, o0.a.c(o0.a.d(i10, 153), o0.a.d(i11, 229)))));
                TypedValue c14 = b9.b.c(context2, R.attr.colorSurface, m9.a.class.getCanonicalName());
                int i17 = c14.resourceId;
                if (i17 != 0) {
                    i12 = androidx.core.content.a.getColor(context2, i17);
                } else {
                    i12 = c14.data;
                }
                aVar2.s(ColorStateList.valueOf(i12));
                aVar2.D = d11.getDimensionPixelSize(2, 0);
                aVar2.E = d11.getDimensionPixelSize(4, 0);
                aVar2.F = d11.getDimensionPixelSize(5, 0);
                aVar2.G = d11.getDimensionPixelSize(3, 0);
                d11.recycle();
                arrayList2.add(aVar2);
                WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
                if (f0.g.b(this) && (c10 = w.c(this)) != null) {
                    int[] iArr = new int[2];
                    c10.getLocationOnScreen(iArr);
                    aVar2.I = iArr[0];
                    c10.getWindowVisibleDisplayFrame(aVar2.C);
                    c10.addOnLayoutChangeListener(aVar2.B);
                }
            }
            if (arrayList2.size() == 1) {
                i13 = 0;
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((m9.a) it.next()).t(i13);
            }
            Iterator it2 = this.f12891l.iterator();
            while (it2.hasNext()) {
                com.google.android.material.slider.a aVar4 = (com.google.android.material.slider.a) it2.next();
                Iterator<Float> it3 = this.K.iterator();
                while (it3.hasNext()) {
                    it3.next().floatValue();
                    aVar4.a();
                }
            }
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    public final void a(Drawable drawable) {
        int i10 = this.C * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i10, i10);
            return;
        }
        float max = i10 / Math.max(intrinsicWidth, intrinsicHeight);
        drawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
        if (r2 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b() {
        /*
            r5 = this;
            int r0 = r5.f12904y
            int r0 = r0 / 2
            int r1 = r5.f12905z
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L11
            r4 = 3
            if (r1 != r4) goto Le
            goto Lf
        Le:
            r2 = r3
        Lf:
            if (r2 == 0) goto L1d
        L11:
            java.util.ArrayList r1 = r5.f12890k
            java.lang.Object r1 = r1.get(r3)
            m9.a r1 = (m9.a) r1
            int r3 = r1.getIntrinsicHeight()
        L1d:
            int r0 = r0 + r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.b():int");
    }

    public final ValueAnimator c(boolean z10) {
        float f10;
        ValueAnimator valueAnimator;
        int c10;
        TimeInterpolator d10;
        float f11 = 0.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (z10) {
            valueAnimator = this.f12895p;
        } else {
            valueAnimator = this.f12894o;
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            f10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        if (z10) {
            c10 = x8.a.c(getContext(), R.attr.motionDurationMedium4, 83);
            d10 = x8.a.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, f8.b.f17144e);
        } else {
            c10 = x8.a.c(getContext(), R.attr.motionDurationShort3, 117);
            d10 = x8.a.d(getContext(), R.attr.motionEasingEmphasizedAccelerateInterpolator, f8.b.c);
        }
        ofFloat.setDuration(c10);
        ofFloat.setInterpolator(d10);
        ofFloat.addUpdateListener(new a());
        return ofFloat;
    }

    public final void d(Canvas canvas, int i10, int i11, float f10, Drawable drawable) {
        canvas.save();
        canvas.translate((this.B + ((int) (l(f10) * i10))) - (drawable.getBounds().width() / 2.0f), i11 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f12884g.m(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f12873a.setColor(e(this.f12877c0));
        this.f12875b.setColor(e(this.f12876b0));
        this.f12880e.setColor(e(this.f12874a0));
        this.f12882f.setColor(e(this.W));
        Iterator it = this.f12890k.iterator();
        while (it.hasNext()) {
            m9.a aVar = (m9.a) it.next();
            if (aVar.isStateful()) {
                aVar.setState(getDrawableState());
            }
        }
        h hVar = this.f12879d0;
        if (hVar.isStateful()) {
            hVar.setState(getDrawableState());
        }
        Paint paint = this.f12878d;
        paint.setColor(e(this.V));
        paint.setAlpha(63);
    }

    public final int e(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean f(float f10) {
        double doubleValue = new BigDecimal(Float.toString(f10)).divide(new BigDecimal(Float.toString(this.N)), MathContext.DECIMAL64).doubleValue();
        if (Math.abs(Math.round(doubleValue) - doubleValue) < 1.0E-4d) {
            return true;
        }
        return false;
    }

    public final boolean g(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (motionEvent.getToolType(0) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return false;
        }
        ViewParent parent = getParent();
        while (true) {
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (!viewGroup.canScrollVertically(1) && !viewGroup.canScrollVertically(-1)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 && viewGroup.shouldDelayChildPressedState()) {
                    z11 = true;
                    break;
                }
                parent = parent.getParent();
            } else {
                z11 = false;
                break;
            }
        }
        if (!z11) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f12884g.f16044k;
    }

    public int getActiveThumbIndex() {
        return this.L;
    }

    public int getFocusedThumbIndex() {
        return this.M;
    }

    public int getHaloRadius() {
        return this.D;
    }

    public ColorStateList getHaloTintList() {
        return this.V;
    }

    public int getLabelBehavior() {
        return this.f12905z;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.N;
    }

    public float getThumbElevation() {
        return this.f12879d0.f17164a.f17198n;
    }

    public int getThumbRadius() {
        return this.C;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f12879d0.f17164a.f17188d;
    }

    public float getThumbStrokeWidth() {
        return this.f12879d0.f17164a.f17195k;
    }

    public ColorStateList getThumbTintList() {
        return this.f12879d0.f17164a.c;
    }

    public int getTickActiveRadius() {
        return this.Q;
    }

    public ColorStateList getTickActiveTintList() {
        return this.W;
    }

    public int getTickInactiveRadius() {
        return this.R;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f12874a0;
    }

    public ColorStateList getTickTintList() {
        if (this.f12874a0.equals(this.W)) {
            return this.W;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f12876b0;
    }

    public int getTrackHeight() {
        return this.A;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f12877c0;
    }

    public int getTrackSidePadding() {
        return this.B;
    }

    public ColorStateList getTrackTintList() {
        if (this.f12877c0.equals(this.f12876b0)) {
            return this.f12876b0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.S;
    }

    public float getValueFrom() {
        return this.I;
    }

    public float getValueTo() {
        return this.J;
    }

    public List<Float> getValues() {
        return new ArrayList(this.K);
    }

    public final boolean h() {
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        if (f0.e.d(this) == 1) {
            return true;
        }
        return false;
    }

    public final void i() {
        if (this.N <= 0.0f) {
            return;
        }
        t();
        int min = Math.min((int) (((this.J - this.I) / this.N) + 1.0f), (this.S / (this.A * 2)) + 1);
        float[] fArr = this.O;
        if (fArr == null || fArr.length != min * 2) {
            this.O = new float[min * 2];
        }
        float f10 = this.S / (min - 1);
        for (int i10 = 0; i10 < min * 2; i10 += 2) {
            float[] fArr2 = this.O;
            fArr2[i10] = ((i10 / 2.0f) * f10) + this.B;
            fArr2[i10 + 1] = b();
        }
    }

    public final boolean j(int i10) {
        int i11 = this.M;
        long j10 = i11 + i10;
        long size = this.K.size() - 1;
        if (j10 < 0) {
            j10 = 0;
        } else if (j10 > size) {
            j10 = size;
        }
        int i12 = (int) j10;
        this.M = i12;
        if (i12 == i11) {
            return false;
        }
        if (this.L != -1) {
            this.L = i12;
        }
        r();
        postInvalidate();
        return true;
    }

    public final void k(int i10) {
        if (h()) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            } else {
                i10 = -i10;
            }
        }
        j(i10);
    }

    public final float l(float f10) {
        float f11 = this.I;
        float f12 = (f10 - f11) / (this.J - f11);
        if (h()) {
            return 1.0f - f12;
        }
        return f12;
    }

    public final void m() {
        Iterator it = this.f12892m.iterator();
        while (it.hasNext()) {
            ((com.google.android.material.slider.b) it.next()).b();
        }
    }

    public boolean n() {
        boolean z10;
        if (this.L != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float l10 = (l(valueOfTouchPositionAbsolute) * this.S) + this.B;
        this.L = 0;
        float abs = Math.abs(this.K.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i10 = 1; i10 < this.K.size(); i10++) {
            float abs2 = Math.abs(this.K.get(i10).floatValue() - valueOfTouchPositionAbsolute);
            float l11 = (l(this.K.get(i10).floatValue()) * this.S) + this.B;
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            if (!h() ? l11 - l10 < 0.0f : l11 - l10 > 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (Float.compare(abs2, abs) < 0) {
                this.L = i10;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(l11 - l10) < this.f12896q) {
                    this.L = -1;
                    return false;
                } else if (z10) {
                    this.L = i10;
                }
            }
            abs = abs2;
        }
        if (this.L != -1) {
            return true;
        }
        return false;
    }

    public final void o(m9.a aVar, float f10) {
        String str;
        if (((int) f10) == f10) {
            str = "%.0f";
        } else {
            str = "%.2f";
        }
        String format = String.format(str, Float.valueOf(f10));
        if (!TextUtils.equals(aVar.f21860x, format)) {
            aVar.f21860x = format;
            aVar.A.f31049d = true;
            aVar.invalidateSelf();
        }
        int l10 = (this.B + ((int) (l(f10) * this.S))) - (aVar.getIntrinsicWidth() / 2);
        int b10 = b() - (this.E + this.C);
        aVar.setBounds(l10, b10 - aVar.getIntrinsicHeight(), aVar.getIntrinsicWidth() + l10, b10);
        Rect rect = new Rect(aVar.getBounds());
        w8.c.c(w.c(this), this, rect);
        aVar.setBounds(rect);
        v d10 = w.d(this);
        int i10 = d10.f17088a;
        ViewOverlay viewOverlay = d10.f17089b;
        switch (i10) {
            case 0:
                viewOverlay.add(aVar);
                return;
            default:
                viewOverlay.add(aVar);
                return;
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator it = this.f12890k.iterator();
        while (it.hasNext()) {
            m9.a aVar = (m9.a) it.next();
            ViewGroup c10 = w.c(this);
            if (c10 == null) {
                aVar.getClass();
            } else {
                aVar.getClass();
                int[] iArr = new int[2];
                c10.getLocationOnScreen(iArr);
                aVar.I = iArr[0];
                c10.getWindowVisibleDisplayFrame(aVar.C);
                c10.addOnLayoutChangeListener(aVar.B);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        BaseSlider<S, L, T>.b bVar = this.f12888i;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
        this.f12893n = false;
        Iterator it = this.f12890k.iterator();
        while (it.hasNext()) {
            m9.a aVar = (m9.a) it.next();
            v d10 = w.d(this);
            if (d10 != null) {
                d10.a(aVar);
                ViewGroup c10 = w.c(this);
                if (c10 == null) {
                    aVar.getClass();
                } else {
                    c10.removeOnLayoutChangeListener(aVar.B);
                }
            }
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x011b, code lost:
        if (r0 != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r13) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        c cVar = this.f12884g;
        if (!z10) {
            this.L = -1;
            cVar.j(this.M);
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 == 66) {
                        k(SlideAtom.USES_MASTER_SLIDE_ID);
                    }
                } else {
                    k(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                }
            } else {
                j(SlideAtom.USES_MASTER_SLIDE_ID);
            }
        } else {
            j(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
        cVar.w(this.M);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        float f10;
        float f11;
        if (!isEnabled()) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (this.K.size() == 1) {
            this.L = 0;
        }
        Float f12 = null;
        Boolean bool = null;
        if (this.L == -1) {
            if (i10 != 61) {
                if (i10 != 66) {
                    if (i10 != 81) {
                        if (i10 != 69) {
                            if (i10 != 70) {
                                switch (i10) {
                                    case 21:
                                        k(-1);
                                        bool = Boolean.TRUE;
                                        break;
                                    case 22:
                                        k(1);
                                        bool = Boolean.TRUE;
                                        break;
                                }
                            }
                        } else {
                            j(-1);
                            bool = Boolean.TRUE;
                        }
                    }
                    j(1);
                    bool = Boolean.TRUE;
                }
                this.L = this.M;
                postInvalidate();
                bool = Boolean.TRUE;
            } else if (keyEvent.hasNoModifiers()) {
                bool = Boolean.valueOf(j(1));
            } else if (keyEvent.isShiftPressed()) {
                bool = Boolean.valueOf(j(-1));
            } else {
                bool = Boolean.FALSE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return super.onKeyDown(i10, keyEvent);
        }
        boolean isLongPress = this.T | keyEvent.isLongPress();
        this.T = isLongPress;
        float f13 = 1.0f;
        if (isLongPress) {
            float f14 = this.N;
            if (f14 != 0.0f) {
                f13 = f14;
            }
            if ((this.J - this.I) / f13 > 20) {
                f13 *= Math.round(f10 / f11);
            }
        } else {
            float f15 = this.N;
            if (f15 != 0.0f) {
                f13 = f15;
            }
        }
        if (i10 != 21) {
            if (i10 != 22) {
                if (i10 != 69) {
                    if (i10 == 70 || i10 == 81) {
                        f12 = Float.valueOf(f13);
                    }
                } else {
                    f12 = Float.valueOf(-f13);
                }
            } else {
                if (h()) {
                    f13 = -f13;
                }
                f12 = Float.valueOf(f13);
            }
        } else {
            if (!h()) {
                f13 = -f13;
            }
            f12 = Float.valueOf(f13);
        }
        if (f12 != null) {
            if (p(f12.floatValue() + this.K.get(this.L).floatValue(), this.L)) {
                r();
                postInvalidate();
            }
            return true;
        }
        if (i10 != 23) {
            if (i10 != 61) {
                if (i10 != 66) {
                    return super.onKeyDown(i10, keyEvent);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return j(1);
            } else {
                if (!keyEvent.isShiftPressed()) {
                    return false;
                }
                return j(-1);
            }
        }
        this.L = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        this.T = false;
        return super.onKeyUp(i10, keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
        if (r1 != false) goto L10;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            int r6 = r4.f12904y
            int r0 = r4.f12905z
            r1 = 1
            r2 = 0
            if (r0 == r1) goto Lf
            r3 = 3
            if (r0 != r3) goto Lc
            goto Ld
        Lc:
            r1 = r2
        Ld:
            if (r1 == 0) goto L1b
        Lf:
            java.util.ArrayList r0 = r4.f12890k
            java.lang.Object r0 = r0.get(r2)
            m9.a r0 = (m9.a) r0
            int r2 = r0.getIntrinsicHeight()
        L1b:
            int r6 = r6 + r2
            r0 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r0)
            super.onMeasure(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.I = dVar.f12911a;
        this.J = dVar.f12912b;
        setValuesInternal(dVar.c);
        this.N = dVar.f12913d;
        if (dVar.f12914e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f12911a = this.I;
        dVar.f12912b = this.J;
        dVar.c = new ArrayList<>(this.K);
        dVar.f12913d = this.N;
        dVar.f12914e = hasFocus();
        return dVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        this.S = Math.max(i10 - (this.B * 2), 0);
        i();
        r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (r2 != 3) goto L13;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        v d10;
        super.onVisibilityChanged(view, i10);
        if (i10 == 0 || (d10 = w.d(this)) == null) {
            return;
        }
        Iterator it = this.f12890k.iterator();
        while (it.hasNext()) {
            d10.a((m9.a) it.next());
        }
    }

    public final boolean p(float f10, int i10) {
        float floatValue;
        float floatValue2;
        this.M = i10;
        if (Math.abs(f10 - this.K.get(i10).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.f12887h0 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f11 = this.I;
                minSeparation = r.l(f11, this.J, (minSeparation - this.B) / this.S, f11);
            }
        }
        if (h()) {
            minSeparation = -minSeparation;
        }
        int i11 = i10 + 1;
        if (i11 >= this.K.size()) {
            floatValue = this.J;
        } else {
            floatValue = this.K.get(i11).floatValue() - minSeparation;
        }
        int i12 = i10 - 1;
        if (i12 < 0) {
            floatValue2 = this.I;
        } else {
            floatValue2 = minSeparation + this.K.get(i12).floatValue();
        }
        this.K.set(i10, Float.valueOf(com.google.android.play.core.assetpacks.c.m(f10, floatValue2, floatValue)));
        Iterator it = this.f12891l.iterator();
        while (it.hasNext()) {
            this.K.get(i10).floatValue();
            ((com.google.android.material.slider.a) it.next()).a();
        }
        AccessibilityManager accessibilityManager = this.f12886h;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            BaseSlider<S, L, T>.b bVar = this.f12888i;
            if (bVar == null) {
                this.f12888i = new b();
            } else {
                removeCallbacks(bVar);
            }
            BaseSlider<S, L, T>.b bVar2 = this.f12888i;
            bVar2.f12907a = i10;
            postDelayed(bVar2, 200L);
            return true;
        }
        return true;
    }

    public final void q(int i10, Rect rect) {
        int l10 = this.B + ((int) (l(getValues().get(i10).floatValue()) * this.S));
        int b10 = b();
        int i11 = this.C;
        int i12 = this.f12902w;
        if (i11 <= i12) {
            i11 = i12;
        }
        int i13 = i11 / 2;
        rect.set(l10 - i13, b10 - i13, l10 + i13, b10 + i13);
    }

    public final void r() {
        if (!(!(getBackground() instanceof RippleDrawable)) && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int l10 = (int) ((l(this.K.get(this.M).floatValue()) * this.S) + this.B);
                int b10 = b();
                int i10 = this.D;
                a.b.f(background, l10 - i10, b10 - i10, l10 + i10, b10 + i10);
            }
        }
    }

    public final void s() {
        boolean z10;
        int max = Math.max(this.f12903x, Math.max(this.A + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + (this.C * 2)));
        boolean z11 = false;
        if (max == this.f12904y) {
            z10 = false;
        } else {
            this.f12904y = max;
            z10 = true;
        }
        int max2 = Math.max(Math.max(Math.max(this.C - this.f12898s, 0), Math.max((this.A - this.f12899t) / 2, 0)), Math.max(Math.max(this.Q - this.f12900u, 0), Math.max(this.R - this.f12901v, 0))) + this.f12897r;
        if (this.B != max2) {
            this.B = max2;
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            if (f0.g.c(this)) {
                this.S = Math.max(getWidth() - (this.B * 2), 0);
                i();
            }
            z11 = true;
        }
        if (z10) {
            requestLayout();
        } else if (z11) {
            postInvalidate();
        }
    }

    public void setActiveThumbIndex(int i10) {
        this.L = i10;
    }

    public void setCustomThumbDrawable(int i10) {
        setCustomThumbDrawable(getResources().getDrawable(i10));
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            drawableArr[i10] = getResources().getDrawable(iArr[i10]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        int i10;
        super.setEnabled(z10);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        setLayerType(i10, null);
    }

    public void setFocusedThumbIndex(int i10) {
        if (i10 >= 0 && i10 < this.K.size()) {
            this.M = i10;
            this.f12884g.w(i10);
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("index out of range");
    }

    public void setHaloRadius(int i10) {
        if (i10 == this.D) {
            return;
        }
        this.D = i10;
        Drawable background = getBackground();
        if (!(!(getBackground() instanceof RippleDrawable)) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setRadius(this.D);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(int i10) {
        setHaloRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.V)) {
            return;
        }
        this.V = colorStateList;
        Drawable background = getBackground();
        if (!(!(getBackground() instanceof RippleDrawable)) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        Paint paint = this.f12878d;
        paint.setColor(e(colorStateList));
        paint.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i10) {
        if (this.f12905z != i10) {
            this.f12905z = i10;
            requestLayout();
        }
    }

    public void setSeparationUnit(int i10) {
        this.f12887h0 = i10;
        this.U = true;
        postInvalidate();
    }

    public void setStepSize(float f10) {
        if (f10 >= 0.0f) {
            if (this.N != f10) {
                this.N = f10;
                this.U = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f10), Float.valueOf(this.I), Float.valueOf(this.J)));
    }

    public void setThumbElevation(float f10) {
        this.f12879d0.m(f10);
    }

    public void setThumbElevationResource(int i10) {
        setThumbElevation(getResources().getDimension(i10));
    }

    public void setThumbRadius(int i10) {
        if (i10 == this.C) {
            return;
        }
        this.C = i10;
        h hVar = this.f12879d0;
        m.a aVar = new m.a();
        float f10 = this.C;
        ge.a p10 = b.b.p(0);
        aVar.f17223a = p10;
        float a10 = m.a.a(p10);
        if (a10 != -1.0f) {
            aVar.e(a10);
        }
        aVar.f17224b = p10;
        float a11 = m.a.a(p10);
        if (a11 != -1.0f) {
            aVar.f(a11);
        }
        aVar.c = p10;
        float a12 = m.a.a(p10);
        if (a12 != -1.0f) {
            aVar.d(a12);
        }
        aVar.f17225d = p10;
        float a13 = m.a.a(p10);
        if (a13 != -1.0f) {
            aVar.c(a13);
        }
        aVar.b(f10);
        hVar.setShapeAppearanceModel(new m(aVar));
        int i11 = this.C * 2;
        hVar.setBounds(0, 0, i11, i11);
        Drawable drawable = this.f12881e0;
        if (drawable != null) {
            a(drawable);
        }
        for (Drawable drawable2 : this.f12883f0) {
            a(drawable2);
        }
        s();
    }

    public void setThumbRadiusResource(int i10) {
        setThumbRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f12879d0.s(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i10) {
        if (i10 != 0) {
            setThumbStrokeColor(androidx.core.content.a.getColorStateList(getContext(), i10));
        }
    }

    public void setThumbStrokeWidth(float f10) {
        this.f12879d0.t(f10);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i10) {
        if (i10 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i10));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        h hVar = this.f12879d0;
        if (colorStateList.equals(hVar.f17164a.c)) {
            return;
        }
        hVar.n(colorStateList);
        invalidate();
    }

    public void setTickActiveRadius(int i10) {
        if (this.Q != i10) {
            this.Q = i10;
            this.f12882f.setStrokeWidth(i10 * 2);
            s();
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.W)) {
            return;
        }
        this.W = colorStateList;
        this.f12882f.setColor(e(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(int i10) {
        if (this.R != i10) {
            this.R = i10;
            this.f12880e.setStrokeWidth(i10 * 2);
            s();
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f12874a0)) {
            return;
        }
        this.f12874a0 = colorStateList;
        this.f12880e.setColor(e(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f12876b0)) {
            return;
        }
        this.f12876b0 = colorStateList;
        this.f12875b.setColor(e(colorStateList));
        invalidate();
    }

    public void setTrackHeight(int i10) {
        if (this.A != i10) {
            this.A = i10;
            this.f12873a.setStrokeWidth(i10);
            this.f12875b.setStrokeWidth(this.A);
            s();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f12877c0)) {
            return;
        }
        this.f12877c0 = colorStateList;
        this.f12873a.setColor(e(colorStateList));
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f10) {
        this.I = f10;
        this.U = true;
        postInvalidate();
    }

    public void setValueTo(float f10) {
        this.J = f10;
        this.U = true;
        postInvalidate();
    }

    public void setValues(Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public final void t() {
        if (this.U) {
            float f10 = this.I;
            float f11 = this.J;
            if (f10 < f11) {
                if (f11 > f10) {
                    if (this.N > 0.0f && !f(f11 - f10)) {
                        throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.N), Float.valueOf(this.I), Float.valueOf(this.J)));
                    }
                    Iterator<Float> it = this.K.iterator();
                    while (it.hasNext()) {
                        Float next = it.next();
                        if (next.floatValue() >= this.I && next.floatValue() <= this.J) {
                            if (this.N > 0.0f && !f(next.floatValue() - this.I)) {
                                throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", next, Float.valueOf(this.I), Float.valueOf(this.N), Float.valueOf(this.N)));
                            }
                        } else {
                            throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", next, Float.valueOf(this.I), Float.valueOf(this.J)));
                        }
                    }
                    float minSeparation = getMinSeparation();
                    if (minSeparation >= 0.0f) {
                        float f12 = this.N;
                        if (f12 > 0.0f && minSeparation > 0.0f) {
                            if (this.f12887h0 == 1) {
                                if (minSeparation < f12 || !f(minSeparation)) {
                                    throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.N), Float.valueOf(this.N)));
                                }
                            } else {
                                throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.N)));
                            }
                        }
                        float f13 = this.N;
                        if (f13 != 0.0f) {
                            if (((int) f13) != f13) {
                                String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f13));
                            }
                            float f14 = this.I;
                            if (((int) f14) != f14) {
                                String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f14));
                            }
                            float f15 = this.J;
                            if (((int) f15) != f15) {
                                String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f15));
                            }
                        }
                        this.U = false;
                        return;
                    }
                    throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(minSeparation)));
                }
                throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.valueOf(this.J), Float.valueOf(this.I)));
            }
            throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(this.I), Float.valueOf(this.J)));
        }
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        a(newDrawable);
        this.f12881e0 = newDrawable;
        this.f12883f0.clear();
        postInvalidate();
    }

    public BaseSlider(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 2132018297), attributeSet, i10);
        this.f12890k = new ArrayList();
        this.f12891l = new ArrayList();
        this.f12892m = new ArrayList();
        this.f12893n = false;
        this.H = false;
        this.K = new ArrayList<>();
        this.L = -1;
        this.M = -1;
        this.N = 0.0f;
        this.P = true;
        this.T = false;
        h hVar = new h();
        this.f12879d0 = hVar;
        this.f12883f0 = Collections.emptyList();
        this.f12887h0 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f12873a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f12875b = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.c = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f12878d = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.f12880e = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.f12882f = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        Resources resources = context2.getResources();
        this.f12903x = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.f12897r = dimensionPixelOffset;
        this.B = dimensionPixelOffset;
        this.f12898s = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.f12899t = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.f12900u = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f12901v = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.E = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        TypedArray d10 = s.d(context2, attributeSet, e8.a.Y, i10, 2132018297, new int[0]);
        this.f12889j = d10.getResourceId(8, 2132018331);
        this.I = d10.getFloat(3, 0.0f);
        this.J = d10.getFloat(4, 1.0f);
        setValues(Float.valueOf(this.I));
        this.N = d10.getFloat(2, 0.0f);
        this.f12902w = (int) Math.ceil(d10.getDimension(9, (float) Math.ceil(w.b(getContext(), 48))));
        boolean hasValue = d10.hasValue(21);
        int i11 = hasValue ? 21 : 23;
        int i12 = hasValue ? 21 : 22;
        ColorStateList a10 = b9.c.a(context2, d10, i11);
        setTrackInactiveTintList(a10 == null ? androidx.core.content.a.getColorStateList(context2, R.color.material_slider_inactive_track_color) : a10);
        ColorStateList a11 = b9.c.a(context2, d10, i12);
        setTrackActiveTintList(a11 == null ? androidx.core.content.a.getColorStateList(context2, R.color.material_slider_active_track_color) : a11);
        hVar.n(b9.c.a(context2, d10, 10));
        if (d10.hasValue(13)) {
            setThumbStrokeColor(b9.c.a(context2, d10, 13));
        }
        setThumbStrokeWidth(d10.getDimension(14, 0.0f));
        ColorStateList a12 = b9.c.a(context2, d10, 5);
        setHaloTintList(a12 == null ? androidx.core.content.a.getColorStateList(context2, R.color.material_slider_halo_color) : a12);
        this.P = d10.getBoolean(20, true);
        boolean hasValue2 = d10.hasValue(15);
        int i13 = hasValue2 ? 15 : 17;
        int i14 = hasValue2 ? 15 : 16;
        ColorStateList a13 = b9.c.a(context2, d10, i13);
        setTickInactiveTintList(a13 == null ? androidx.core.content.a.getColorStateList(context2, R.color.material_slider_inactive_tick_marks_color) : a13);
        ColorStateList a14 = b9.c.a(context2, d10, i14);
        setTickActiveTintList(a14 == null ? androidx.core.content.a.getColorStateList(context2, R.color.material_slider_active_tick_marks_color) : a14);
        setThumbRadius(d10.getDimensionPixelSize(12, 0));
        setHaloRadius(d10.getDimensionPixelSize(6, 0));
        setThumbElevation(d10.getDimension(11, 0.0f));
        setTrackHeight(d10.getDimensionPixelSize(24, 0));
        setTickActiveRadius(d10.getDimensionPixelSize(18, 0));
        setTickInactiveRadius(d10.getDimensionPixelSize(19, 0));
        setLabelBehavior(d10.getInt(7, 0));
        if (!d10.getBoolean(0, true)) {
            setEnabled(false);
        }
        d10.recycle();
        setFocusable(true);
        setClickable(true);
        hVar.r(2);
        this.f12896q = ViewConfiguration.get(context2).getScaledTouchSlop();
        c cVar = new c(this);
        this.f12884g = cVar;
        f0.o(this, cVar);
        this.f12886h = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public void setValues(List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.f12881e0 = null;
        this.f12883f0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List<Drawable> list = this.f12883f0;
            Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
            a(newDrawable);
            list.add(newDrawable);
        }
        postInvalidate();
    }

    public void setLabelFormatter(com.google.android.material.slider.d dVar) {
    }
}
