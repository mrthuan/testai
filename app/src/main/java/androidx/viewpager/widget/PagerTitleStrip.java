package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

@ViewPager.e
/* loaded from: classes.dex */
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f4734o = {16842804, 16842901, 16842904, 16842927};

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f4735p = {16843660};

    /* renamed from: a  reason: collision with root package name */
    public ViewPager f4736a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f4737b;
    public final TextView c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f4738d;

    /* renamed from: e  reason: collision with root package name */
    public int f4739e;

    /* renamed from: f  reason: collision with root package name */
    public float f4740f;

    /* renamed from: g  reason: collision with root package name */
    public int f4741g;

    /* renamed from: h  reason: collision with root package name */
    public int f4742h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4743i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4744j;

    /* renamed from: k  reason: collision with root package name */
    public final a f4745k;

    /* renamed from: l  reason: collision with root package name */
    public WeakReference<j2.a> f4746l;

    /* renamed from: m  reason: collision with root package name */
    public int f4747m;

    /* renamed from: n  reason: collision with root package name */
    public int f4748n;

    /* loaded from: classes.dex */
    public class a extends DataSetObserver implements ViewPager.j, ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public int f4749a;

        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(ViewPager viewPager, j2.a aVar, j2.a aVar2) {
            PagerTitleStrip.this.a(aVar, aVar2);
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.b(pagerTitleStrip.f4736a.getCurrentItem(), pagerTitleStrip.f4736a.getAdapter());
            float f10 = pagerTitleStrip.f4740f;
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            pagerTitleStrip.c(f10, pagerTitleStrip.f4736a.getCurrentItem(), true);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i10) {
            this.f4749a = i10;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i10, float f10, int i11) {
            if (f10 > 0.5f) {
                i10++;
            }
            PagerTitleStrip.this.c(f10, i10, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i10) {
            if (this.f4749a == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.b(pagerTitleStrip.f4736a.getCurrentItem(), pagerTitleStrip.f4736a.getAdapter());
                float f10 = pagerTitleStrip.f4740f;
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                pagerTitleStrip.c(f10, pagerTitleStrip.f4736a.getCurrentItem(), true);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends SingleLineTransformationMethod {

        /* renamed from: a  reason: collision with root package name */
        public final Locale f4751a;

        public b(Context context) {
            this.f4751a = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public final CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f4751a);
            }
            return null;
        }
    }

    public PagerTitleStrip(Context context) {
        this(context, null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new b(textView.getContext()));
    }

    public final void a(j2.a aVar, j2.a aVar2) {
        a aVar3 = this.f4745k;
        if (aVar != null) {
            aVar.unregisterDataSetObserver(aVar3);
            this.f4746l = null;
        }
        if (aVar2 != null) {
            aVar2.registerDataSetObserver(aVar3);
            this.f4746l = new WeakReference<>(aVar2);
        }
        ViewPager viewPager = this.f4736a;
        if (viewPager != null) {
            this.f4739e = -1;
            this.f4740f = -1.0f;
            b(viewPager.getCurrentItem(), aVar2);
            requestLayout();
        }
    }

    public final void b(int i10, j2.a aVar) {
        int i11;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (aVar != null) {
            i11 = aVar.getCount();
        } else {
            i11 = 0;
        }
        this.f4743i = true;
        CharSequence charSequence3 = null;
        if (i10 >= 1 && aVar != null) {
            charSequence = aVar.getPageTitle(i10 - 1);
        } else {
            charSequence = null;
        }
        TextView textView = this.f4737b;
        textView.setText(charSequence);
        TextView textView2 = this.c;
        if (aVar != null && i10 < i11) {
            charSequence2 = aVar.getPageTitle(i10);
        } else {
            charSequence2 = null;
        }
        textView2.setText(charSequence2);
        int i12 = i10 + 1;
        if (i12 < i11 && aVar != null) {
            charSequence3 = aVar.getPageTitle(i12);
        }
        TextView textView3 = this.f4738d;
        textView3.setText(charSequence3);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), SlideAtom.USES_MASTER_SLIDE_ID);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), SlideAtom.USES_MASTER_SLIDE_ID);
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        textView2.measure(makeMeasureSpec, makeMeasureSpec2);
        textView3.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f4739e = i10;
        if (!this.f4744j) {
            c(this.f4740f, i10, false);
        }
        this.f4743i = false;
    }

    public void c(float f10, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (i10 != this.f4739e) {
            b(i10, this.f4736a.getAdapter());
        } else if (!z10 && f10 == this.f4740f) {
            return;
        }
        this.f4744j = true;
        TextView textView = this.f4737b;
        int measuredWidth = textView.getMeasuredWidth();
        TextView textView2 = this.c;
        int measuredWidth2 = textView2.getMeasuredWidth();
        TextView textView3 = this.f4738d;
        int measuredWidth3 = textView3.getMeasuredWidth();
        int i15 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i16 = paddingRight + i15;
        int i17 = (width - (paddingLeft + i15)) - i16;
        float f11 = f10 + 0.5f;
        if (f11 > 1.0f) {
            f11 -= 1.0f;
        }
        int i18 = ((width - i16) - ((int) (i17 * f11))) - i15;
        int i19 = measuredWidth2 + i18;
        int baseline = textView.getBaseline();
        int baseline2 = textView2.getBaseline();
        int baseline3 = textView3.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i20 = max - baseline;
        int i21 = max - baseline2;
        int i22 = max - baseline3;
        int max2 = Math.max(Math.max(textView.getMeasuredHeight() + i20, textView2.getMeasuredHeight() + i21), textView3.getMeasuredHeight() + i22);
        int i23 = this.f4742h & 112;
        if (i23 != 16) {
            if (i23 != 80) {
                i12 = i20 + paddingTop;
                i13 = i21 + paddingTop;
                i14 = paddingTop + i22;
                textView2.layout(i18, i13, i19, textView2.getMeasuredHeight() + i13);
                int min = Math.min(paddingLeft, (i18 - this.f4741g) - measuredWidth);
                textView.layout(min, i12, measuredWidth + min, textView.getMeasuredHeight() + i12);
                int max3 = Math.max((width - paddingRight) - measuredWidth3, i19 + this.f4741g);
                textView3.layout(max3, i14, max3 + measuredWidth3, textView3.getMeasuredHeight() + i14);
                this.f4740f = f10;
                this.f4744j = false;
            }
            i11 = (height - paddingBottom) - max2;
        } else {
            i11 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        }
        i12 = i20 + i11;
        i13 = i21 + i11;
        i14 = i11 + i22;
        textView2.layout(i18, i13, i19, textView2.getMeasuredHeight() + i13);
        int min2 = Math.min(paddingLeft, (i18 - this.f4741g) - measuredWidth);
        textView.layout(min2, i12, measuredWidth + min2, textView.getMeasuredHeight() + i12);
        int max32 = Math.max((width - paddingRight) - measuredWidth3, i19 + this.f4741g);
        textView3.layout(max32, i14, max32 + measuredWidth3, textView3.getMeasuredHeight() + i14);
        this.f4740f = f10;
        this.f4744j = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f4741g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        j2.a aVar;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            j2.a adapter = viewPager.getAdapter();
            a aVar2 = this.f4745k;
            viewPager.T = aVar2;
            if (viewPager.U == null) {
                viewPager.U = new ArrayList();
            }
            viewPager.U.add(aVar2);
            this.f4736a = viewPager;
            WeakReference<j2.a> weakReference = this.f4746l;
            if (weakReference != null) {
                aVar = weakReference.get();
            } else {
                aVar = null;
            }
            a(aVar, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f4736a;
        if (viewPager != null) {
            a(viewPager.getAdapter(), null);
            ViewPager viewPager2 = this.f4736a;
            ViewPager.j jVar = viewPager2.T;
            viewPager2.T = null;
            ArrayList arrayList = viewPager2.U;
            if (arrayList != null) {
                arrayList.remove(this.f4745k);
            }
            this.f4736a = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f4736a != null) {
            float f10 = this.f4740f;
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            c(f10, this.f4739e, true);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int max;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
            int size = View.MeasureSpec.getSize(i10);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, (int) (size * 0.2f), -2);
            this.f4737b.measure(childMeasureSpec2, childMeasureSpec);
            TextView textView = this.c;
            textView.measure(childMeasureSpec2, childMeasureSpec);
            this.f4738d.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i11) == 1073741824) {
                max = View.MeasureSpec.getSize(i11);
            } else {
                max = Math.max(getMinHeight(), textView.getMeasuredHeight() + paddingBottom);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(max, i11, textView.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (!this.f4743i) {
            super.requestLayout();
        }
    }

    public void setGravity(int i10) {
        this.f4742h = i10;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f10) {
        int i10 = ((int) (f10 * 255.0f)) & FunctionEval.FunctionID.EXTERNAL_FUNC;
        this.f4747m = i10;
        int i11 = (i10 << 24) | (this.f4748n & 16777215);
        this.f4737b.setTextColor(i11);
        this.f4738d.setTextColor(i11);
    }

    public void setTextColor(int i10) {
        this.f4748n = i10;
        this.c.setTextColor(i10);
        int i11 = (this.f4747m << 24) | (this.f4748n & 16777215);
        this.f4737b.setTextColor(i11);
        this.f4738d.setTextColor(i11);
    }

    public void setTextSpacing(int i10) {
        this.f4741g = i10;
        requestLayout();
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4739e = -1;
        this.f4740f = -1.0f;
        this.f4745k = new a();
        TextView textView = new TextView(context);
        this.f4737b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f4738d = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4734o);
        boolean z10 = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            textView.setTextAppearance(resourceId);
            textView2.setTextAppearance(resourceId);
            textView3.setTextAppearance(resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            float f10 = dimensionPixelSize;
            textView.setTextSize(0, f10);
            textView2.setTextSize(0, f10);
            textView3.setTextSize(0, f10);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            textView.setTextColor(color);
            textView2.setTextColor(color);
            textView3.setTextColor(color);
        }
        this.f4742h = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f4748n = textView2.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f4735p);
            z10 = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z10) {
            setSingleLineAllCaps(textView);
            setSingleLineAllCaps(textView2);
            setSingleLineAllCaps(textView3);
        } else {
            textView.setSingleLine();
            textView2.setSingleLine();
            textView3.setSingleLine();
        }
        this.f4741g = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
