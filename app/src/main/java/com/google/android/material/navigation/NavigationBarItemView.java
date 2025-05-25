package com.google.android.material.navigation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.x0;
import java.util.WeakHashMap;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.n0;
import x0.y;
import y0.f;

/* loaded from: classes2.dex */
public abstract class NavigationBarItemView extends FrameLayout implements o.a {
    public static final int[] E = {16842912};
    public static final c F = new c();
    public static final d G = new d();
    public int A;
    public boolean B;
    public int C;
    public h8.a D;

    /* renamed from: a  reason: collision with root package name */
    public boolean f12684a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f12685b;
    public Drawable c;

    /* renamed from: d  reason: collision with root package name */
    public int f12686d;

    /* renamed from: e  reason: collision with root package name */
    public int f12687e;

    /* renamed from: f  reason: collision with root package name */
    public float f12688f;

    /* renamed from: g  reason: collision with root package name */
    public float f12689g;

    /* renamed from: h  reason: collision with root package name */
    public float f12690h;

    /* renamed from: i  reason: collision with root package name */
    public int f12691i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12692j;

    /* renamed from: k  reason: collision with root package name */
    public final FrameLayout f12693k;

    /* renamed from: l  reason: collision with root package name */
    public final View f12694l;

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f12695m;

    /* renamed from: n  reason: collision with root package name */
    public final ViewGroup f12696n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f12697o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f12698p;

    /* renamed from: q  reason: collision with root package name */
    public int f12699q;

    /* renamed from: r  reason: collision with root package name */
    public j f12700r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f12701s;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f12702t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f12703u;

    /* renamed from: v  reason: collision with root package name */
    public ValueAnimator f12704v;

    /* renamed from: w  reason: collision with root package name */
    public c f12705w;

    /* renamed from: x  reason: collision with root package name */
    public float f12706x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f12707y;

    /* renamed from: z  reason: collision with root package name */
    public int f12708z;

    /* loaded from: classes2.dex */
    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            boolean z10;
            NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
            if (navigationBarItemView.f12695m.getVisibility() == 0) {
                h8.a aVar = navigationBarItemView.D;
                if (aVar != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    Rect rect = new Rect();
                    ImageView imageView = navigationBarItemView.f12695m;
                    imageView.getDrawingRect(rect);
                    aVar.setBounds(rect);
                    aVar.h(imageView, null);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12710a;

        public b(int i10) {
            this.f12710a = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int[] iArr = NavigationBarItemView.E;
            NavigationBarItemView.this.g(this.f12710a);
        }
    }

    /* loaded from: classes2.dex */
    public static class c {
        public float a(float f10, float f11) {
            return 1.0f;
        }
    }

    /* loaded from: classes2.dex */
    public static class d extends c {
        @Override // com.google.android.material.navigation.NavigationBarItemView.c
        public final float a(float f10, float f11) {
            LinearInterpolator linearInterpolator = f8.b.f17141a;
            return (f10 * 0.6f) + 0.4f;
        }
    }

    public NavigationBarItemView(Context context) {
        super(context);
        this.f12684a = false;
        this.f12699q = -1;
        this.f12705w = F;
        this.f12706x = 0.0f;
        this.f12707y = false;
        this.f12708z = 0;
        this.A = 0;
        this.B = false;
        this.C = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f12693k = (FrameLayout) findViewById(R.id.navigation_bar_item_icon_container);
        this.f12694l = findViewById(R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(R.id.navigation_bar_item_icon_view);
        this.f12695m = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.navigation_bar_item_labels_group);
        this.f12696n = viewGroup;
        TextView textView = (TextView) findViewById(R.id.navigation_bar_item_small_label_view);
        this.f12697o = textView;
        TextView textView2 = (TextView) findViewById(R.id.navigation_bar_item_large_label_view);
        this.f12698p = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f12686d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f12687e = viewGroup.getPaddingBottom();
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.d.s(textView, 2);
        f0.d.s(textView2, 2);
        setFocusable(true);
        float textSize = textView.getTextSize();
        float textSize2 = textView2.getTextSize();
        this.f12688f = textSize - textSize2;
        this.f12689g = (textSize2 * 1.0f) / textSize;
        this.f12690h = (textSize * 1.0f) / textSize2;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(android.widget.TextView r4, int r5) {
        /*
            r4.setTextAppearance(r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto Lc
        La:
            r5 = r1
            goto L4c
        Lc:
            int[] r2 = e8.a.f16479d0
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r5.getValue(r1, r2)
            r5.recycle()
            if (r3 != 0) goto L21
            goto La
        L21:
            int r5 = r2.getComplexUnit()
            r3 = 2
            if (r5 != r3) goto L3e
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L4c
        L3e:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L4c:
            if (r5 == 0) goto L52
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationBarItemView.d(android.widget.TextView, int):void");
    }

    public static void e(float f10, float f11, int i10, TextView textView) {
        textView.setScaleX(f10);
        textView.setScaleY(f11);
        textView.setVisibility(i10);
    }

    public static void f(View view, int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i10;
        layoutParams.gravity = i11;
        view.setLayoutParams(layoutParams);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f12693k;
        if (frameLayout == null) {
            return this.f12695m;
        }
        return frameLayout;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < indexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconHeight() {
        int i10;
        h8.a aVar = this.D;
        if (aVar != null) {
            i10 = aVar.getMinimumHeight() / 2;
        } else {
            i10 = 0;
        }
        return this.f12695m.getMeasuredWidth() + Math.max(i10, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + i10;
    }

    private int getSuggestedIconWidth() {
        int minimumWidth;
        h8.a aVar = this.D;
        if (aVar == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = aVar.getMinimumWidth() - this.D.f18069e.f18079b.f18105r.intValue();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        int max = Math.max(minimumWidth, layoutParams.leftMargin);
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f12695m.getMeasuredWidth() + max;
    }

    public static void h(ViewGroup viewGroup, int i10) {
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), i10);
    }

    public final void a() {
        Drawable drawable = this.c;
        ColorStateList colorStateList = this.f12685b;
        FrameLayout frameLayout = this.f12693k;
        RippleDrawable rippleDrawable = null;
        boolean z10 = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f12707y && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(c9.a.c(this.f12685b), null, activeIndicatorDrawable);
                z10 = false;
            } else if (drawable == null) {
                drawable = new RippleDrawable(c9.a.a(this.f12685b), null, null);
            }
        }
        if (frameLayout != null) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.d.q(frameLayout, rippleDrawable);
        }
        WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
        f0.d.q(this, drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z10);
        }
    }

    public final void b(float f10, float f11) {
        float f12;
        float f13;
        View view = this.f12694l;
        if (view != null) {
            c cVar = this.f12705w;
            cVar.getClass();
            LinearInterpolator linearInterpolator = f8.b.f17141a;
            view.setScaleX((0.6f * f10) + 0.4f);
            view.setScaleY(cVar.a(f10, f11));
            int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            if (i10 == 0) {
                f12 = 0.8f;
            } else {
                f12 = 0.0f;
            }
            if (i10 == 0) {
                f13 = 1.0f;
            } else {
                f13 = 0.2f;
            }
            view.setAlpha(f8.b.a(0.0f, 1.0f, f12, f13, f10));
        }
        this.f12706x = f10;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public final void c(j jVar) {
        CharSequence charSequence;
        int i10;
        this.f12700r = jVar;
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setIcon(jVar.getIcon());
        setTitle(jVar.f2079e);
        setId(jVar.f2076a);
        if (!TextUtils.isEmpty(jVar.f2091q)) {
            setContentDescription(jVar.f2091q);
        }
        if (!TextUtils.isEmpty(jVar.f2092r)) {
            charSequence = jVar.f2092r;
        } else {
            charSequence = jVar.f2079e;
        }
        if (Build.VERSION.SDK_INT > 23) {
            x0.a(this, charSequence);
        }
        if (jVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        this.f12684a = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f12693k;
        if (frameLayout != null && this.f12707y) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void g(int i10) {
        boolean z10;
        int i11;
        View view = this.f12694l;
        if (view == null) {
            return;
        }
        int min = Math.min(this.f12708z, i10 - (this.C * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (this.B && this.f12691i == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i11 = min;
        } else {
            i11 = this.A;
        }
        layoutParams.height = i11;
        layoutParams.width = min;
        view.setLayoutParams(layoutParams);
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f12694l;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public h8.a getBadge() {
        return this.D;
    }

    public int getItemBackgroundResId() {
        return R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j getItemData() {
        return this.f12700r;
    }

    public int getItemDefaultMarginResId() {
        return R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f12699q;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.f12696n;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.f12696n;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        j jVar = this.f12700r;
        if (jVar != null && jVar.isCheckable() && this.f12700r.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, E);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        h8.a aVar = this.D;
        if (aVar != null && aVar.isVisible()) {
            j jVar = this.f12700r;
            CharSequence charSequence = jVar.f2079e;
            if (!TextUtils.isEmpty(jVar.f2091q)) {
                charSequence = this.f12700r.f2091q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.D.c()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) f.c.a(0, 1, getItemVisiblePosition(), false, isSelected(), 1).f31968a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) f.a.f31955g.f31964a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.arg_res_0x7f1301ba));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new b(i10));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f12694l;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        a();
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        int i10;
        this.f12707y = z10;
        a();
        View view = this.f12694l;
        if (view != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            view.setVisibility(i10);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i10) {
        this.A = i10;
        g(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i10) {
        this.C = i10;
        g(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.B = z10;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.f12708z = i10;
        g(getWidth());
    }

    public void setBadge(h8.a aVar) {
        boolean z10;
        boolean z11;
        h8.a aVar2 = this.D;
        if (aVar2 == aVar) {
            return;
        }
        boolean z12 = true;
        if (aVar2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ImageView imageView = this.f12695m;
        if (z10 && imageView != null) {
            if (aVar2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                setClipChildren(true);
                setClipToPadding(true);
                h8.a aVar3 = this.D;
                if (aVar3 != null) {
                    if (aVar3.d() != null) {
                        aVar3.d().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(aVar3);
                    }
                }
                this.D = null;
            }
        }
        this.D = aVar;
        if (imageView != null) {
            if (aVar == null) {
                z12 = false;
            }
            if (z12) {
                setClipChildren(false);
                setClipToPadding(false);
                h8.a aVar4 = this.D;
                Rect rect = new Rect();
                imageView.getDrawingRect(rect);
                aVar4.setBounds(rect);
                aVar4.h(imageView, null);
                if (aVar4.d() != null) {
                    aVar4.d().setForeground(aVar4);
                } else {
                    imageView.getOverlay().add(aVar4);
                }
            }
        }
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setChecked(boolean r13) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationBarItemView.setChecked(boolean):void");
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        y yVar;
        super.setEnabled(z10);
        this.f12697o.setEnabled(z10);
        this.f12698p.setEnabled(z10);
        this.f12695m.setEnabled(z10);
        if (z10) {
            Context context = getContext();
            if (Build.VERSION.SDK_INT >= 24) {
                yVar = new y(y.a.b(context, 1002));
            } else {
                yVar = new y(null);
            }
            f0.q(this, yVar);
            return;
        }
        f0.q(this, null);
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f12702t) {
            return;
        }
        this.f12702t = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f12703u = drawable;
            ColorStateList colorStateList = this.f12701s;
            if (colorStateList != null) {
                a.b.h(drawable, colorStateList);
            }
        }
        this.f12695m.setImageDrawable(drawable);
    }

    public void setIconSize(int i10) {
        ImageView imageView = this.f12695m;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f12701s = colorStateList;
        if (this.f12700r != null && (drawable = this.f12703u) != null) {
            a.b.h(drawable, colorStateList);
            this.f12703u.invalidateSelf();
        }
    }

    public void setItemBackground(int i10) {
        setItemBackground(i10 == 0 ? null : androidx.core.content.a.getDrawable(getContext(), i10));
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f12687e != i10) {
            this.f12687e = i10;
            j jVar = this.f12700r;
            if (jVar != null) {
                setChecked(jVar.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f12686d != i10) {
            this.f12686d = i10;
            j jVar = this.f12700r;
            if (jVar != null) {
                setChecked(jVar.isChecked());
            }
        }
    }

    public void setItemPosition(int i10) {
        this.f12699q = i10;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f12685b = colorStateList;
        a();
    }

    public void setLabelVisibilityMode(int i10) {
        boolean z10;
        if (this.f12691i != i10) {
            this.f12691i = i10;
            if (this.B && i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f12705w = G;
            } else {
                this.f12705w = F;
            }
            g(getWidth());
            j jVar = this.f12700r;
            if (jVar != null) {
                setChecked(jVar.isChecked());
            }
        }
    }

    public void setShifting(boolean z10) {
        if (this.f12692j != z10) {
            this.f12692j = z10;
            j jVar = this.f12700r;
            if (jVar != null) {
                setChecked(jVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i10) {
        TextView textView = this.f12698p;
        d(textView, i10);
        float textSize = this.f12697o.getTextSize();
        float textSize2 = textView.getTextSize();
        this.f12688f = textSize - textSize2;
        this.f12689g = (textSize2 * 1.0f) / textSize;
        this.f12690h = (textSize * 1.0f) / textSize2;
        textView.setTypeface(textView.getTypeface(), 1);
    }

    public void setTextAppearanceInactive(int i10) {
        TextView textView = this.f12697o;
        d(textView, i10);
        float textSize = textView.getTextSize();
        float textSize2 = this.f12698p.getTextSize();
        this.f12688f = textSize - textSize2;
        this.f12689g = (textSize2 * 1.0f) / textSize;
        this.f12690h = (textSize * 1.0f) / textSize2;
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f12697o.setTextColor(colorStateList);
            this.f12698p.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f12697o.setText(charSequence);
        this.f12698p.setText(charSequence);
        j jVar = this.f12700r;
        if (jVar == null || TextUtils.isEmpty(jVar.f2091q)) {
            setContentDescription(charSequence);
        }
        j jVar2 = this.f12700r;
        if (jVar2 != null && !TextUtils.isEmpty(jVar2.f2092r)) {
            charSequence = this.f12700r.f2092r;
        }
        if (Build.VERSION.SDK_INT > 23) {
            x0.a(this, charSequence);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.c = drawable;
        a();
    }
}
