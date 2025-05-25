package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import y0.f;

/* loaded from: classes2.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.a {
    public final float[] A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public String[] F;
    public float G;
    public final ColorStateList H;

    /* renamed from: t  reason: collision with root package name */
    public final ClockHandView f13100t;

    /* renamed from: u  reason: collision with root package name */
    public final Rect f13101u;

    /* renamed from: v  reason: collision with root package name */
    public final RectF f13102v;

    /* renamed from: w  reason: collision with root package name */
    public final Rect f13103w;

    /* renamed from: x  reason: collision with root package name */
    public final SparseArray<TextView> f13104x;

    /* renamed from: y  reason: collision with root package name */
    public final b f13105y;

    /* renamed from: z  reason: collision with root package name */
    public final int[] f13106z;

    /* loaded from: classes2.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ClockFaceView clockFaceView = ClockFaceView.this;
            if (!clockFaceView.isShown()) {
                return true;
            }
            clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
            int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f13100t.f13111d) - clockFaceView.B;
            if (height != clockFaceView.f13122r) {
                clockFaceView.f13122r = height;
                clockFaceView.r();
                int i10 = clockFaceView.f13122r;
                ClockHandView clockHandView = clockFaceView.f13100t;
                clockHandView.f13119l = i10;
                clockHandView.invalidate();
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class b extends x0.a {
        public b() {
        }

        @Override // x0.a
        public final void d(View view, f fVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f31416a;
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f31951a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
            if (intValue > 0) {
                accessibilityNodeInfo.setTraversalAfter(ClockFaceView.this.f13104x.get(intValue - 1));
            }
            fVar.i(f.c.a(0, 1, intValue, false, view.isSelected(), 1));
            accessibilityNodeInfo.setClickable(true);
            fVar.b(f.a.f31955g);
        }

        @Override // x0.a
        public final boolean g(View view, int i10, Bundle bundle) {
            if (i10 == 16) {
                long uptimeMillis = SystemClock.uptimeMillis();
                ClockFaceView clockFaceView = ClockFaceView.this;
                view.getHitRect(clockFaceView.f13101u);
                float centerX = clockFaceView.f13101u.centerX();
                float centerY = clockFaceView.f13101u.centerY();
                clockFaceView.f13100t.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
                clockFaceView.f13100t.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
                return true;
            }
            return super.g(view, i10, bundle);
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.a
    public final void a(float f10) {
        if (Math.abs(this.G - f10) > 0.001f) {
            this.G = f10;
            s();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.b.a(1, this.F.length, 1).f31967a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        s();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.E / Math.max(Math.max(this.C / displayMetrics.heightPixels, this.D / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public final void r() {
        super.r();
        int i10 = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.f13104x;
            if (i10 < sparseArray.size()) {
                sparseArray.get(i10).setVisibility(0);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void s() {
        SparseArray<TextView> sparseArray;
        RectF rectF;
        Rect rect;
        boolean z10;
        Rect rect2;
        RadialGradient radialGradient;
        RectF rectF2 = this.f13100t.f13114g;
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        int i10 = 0;
        while (true) {
            sparseArray = this.f13104x;
            int size = sparseArray.size();
            rectF = this.f13102v;
            rect = this.f13101u;
            if (i10 >= size) {
                break;
            }
            TextView textView2 = sparseArray.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f10) {
                    textView = textView2;
                    f10 = height;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            TextView textView3 = sparseArray.get(i11);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                textView3.setSelected(z10);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f13103w);
                rectF.inset(rect2.left, rect2.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f13106z, this.A, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13101u = new Rect();
        this.f13102v = new RectF();
        this.f13103w = new Rect();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.f13104x = sparseArray;
        this.A = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e8.a.f16491l, i10, 2132018319);
        Resources resources = getResources();
        ColorStateList a10 = b9.c.a(context, obtainStyledAttributes, 1);
        this.H = a10;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f13100t = clockHandView;
        this.B = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = a10.getColorForState(new int[]{16842913}, a10.getDefaultColor());
        this.f13106z = new int[]{colorForState, colorForState, a10.getDefaultColor()};
        clockHandView.c.add(this);
        int defaultColor = androidx.core.content.a.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList a11 = b9.c.a(context, obtainStyledAttributes, 0);
        setBackgroundColor(a11 != null ? a11.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f13105y = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.F = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.F.length, size); i11++) {
            TextView textView = sparseArray.get(i11);
            if (i11 >= this.F.length) {
                removeView(textView);
                sparseArray.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.F[i11]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i12));
                z10 = i12 > 1 ? true : z10;
                f0.o(textView, this.f13105y);
                textView.setTextColor(this.H);
            }
        }
        ClockHandView clockHandView2 = this.f13100t;
        if (clockHandView2.f13110b && !z10) {
            clockHandView2.f13120m = 1;
        }
        clockHandView2.f13110b = z10;
        clockHandView2.invalidate();
        this.C = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.D = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.E = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }
}
