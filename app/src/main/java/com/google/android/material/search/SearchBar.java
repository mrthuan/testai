package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.material.appbar.AppBarLayout;
import f9.h;
import f9.m;
import java.util.WeakHashMap;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import w8.s;
import w8.t;
import x0.f0;
import x0.n0;

/* loaded from: classes2.dex */
public class SearchBar extends Toolbar {

    /* renamed from: m0  reason: collision with root package name */
    public static final /* synthetic */ int f12789m0 = 0;
    public final TextView U;
    public final boolean V;
    public final boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public final d9.b f12790a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Drawable f12791b0;

    /* renamed from: c0  reason: collision with root package name */
    public final boolean f12792c0;

    /* renamed from: d0  reason: collision with root package name */
    public final boolean f12793d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f12794e0;

    /* renamed from: f0  reason: collision with root package name */
    public final Integer f12795f0;

    /* renamed from: g0  reason: collision with root package name */
    public Drawable f12796g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f12797h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f12798i0;

    /* renamed from: j0  reason: collision with root package name */
    public h f12799j0;

    /* renamed from: k0  reason: collision with root package name */
    public final AccessibilityManager f12800k0;

    /* renamed from: l0  reason: collision with root package name */
    public final com.google.android.tools.d f12801l0;

    public SearchBar(Context context) {
        this(context, null);
    }

    private void setNavigationIconDecorative(boolean z10) {
        Drawable drawable;
        ImageButton b10 = t.b(this);
        if (b10 == null) {
            return;
        }
        b10.setClickable(!z10);
        b10.setFocusable(!z10);
        Drawable background = b10.getBackground();
        if (background != null) {
            this.f12796g0 = background;
        }
        if (z10) {
            drawable = null;
        } else {
            drawable = this.f12796g0;
        }
        b10.setBackgroundDrawable(drawable);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.V && this.f12794e0 == null && !(view instanceof ActionMenuView)) {
            this.f12794e0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i10, layoutParams);
    }

    public View getCenterView() {
        return this.f12794e0;
    }

    public float getCompatElevation() {
        h hVar = this.f12799j0;
        if (hVar != null) {
            return hVar.f17164a.f17198n;
        }
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        return f0.i.i(this);
    }

    public float getCornerSize() {
        return this.f12799j0.j();
    }

    public CharSequence getHint() {
        return this.U.getHint();
    }

    public int getMenuResId() {
        return this.f12797h0;
    }

    public int getStrokeColor() {
        return this.f12799j0.f17164a.f17188d.getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.f12799j0.f17164a.f17195k;
    }

    public CharSequence getText() {
        return this.U.getText();
    }

    public TextView getTextView() {
        return this.U;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void k(int i10) {
        super.k(i10);
        this.f12797h0 = i10;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.b.Y(this, this.f12799j0);
        if (this.W && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_vertical);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            int i10 = marginLayoutParams.leftMargin;
            if (i10 == 0) {
                i10 = dimensionPixelSize;
            }
            marginLayoutParams.leftMargin = i10;
            int i11 = marginLayoutParams.topMargin;
            if (i11 == 0) {
                i11 = dimensionPixelSize2;
            }
            marginLayoutParams.topMargin = i11;
            int i12 = marginLayoutParams.rightMargin;
            if (i12 != 0) {
                dimensionPixelSize = i12;
            }
            marginLayoutParams.rightMargin = dimensionPixelSize;
            int i13 = marginLayoutParams.bottomMargin;
            if (i13 != 0) {
                dimensionPixelSize2 = i13;
            }
            marginLayoutParams.bottomMargin = dimensionPixelSize2;
        }
        t();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        CharSequence text = getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (isEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f12794e0;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
            int i14 = measuredWidth + measuredWidth2;
            int measuredHeight = this.f12794e0.getMeasuredHeight();
            int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
            int i15 = measuredHeight + measuredHeight2;
            View view2 = this.f12794e0;
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            if (f0.e.d(this) == 1) {
                view2.layout(getMeasuredWidth() - i14, measuredHeight2, getMeasuredWidth() - measuredWidth2, i15);
            } else {
                view2.layout(measuredWidth2, measuredHeight2, i14, i15);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        View view = this.f12794e0;
        if (view != null) {
            view.measure(i10, i11);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f5506a);
        setText(aVar.c);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        String charSequence;
        a aVar = new a((Toolbar.i) super.onSaveInstanceState());
        CharSequence text = getText();
        if (text == null) {
            charSequence = null;
        } else {
            charSequence = text.toString();
        }
        aVar.c = charSequence;
        return aVar;
    }

    public void setCenterView(View view) {
        View view2 = this.f12794e0;
        if (view2 != null) {
            removeView(view2);
            this.f12794e0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z10) {
        this.f12798i0 = z10;
        t();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h hVar = this.f12799j0;
        if (hVar != null) {
            hVar.m(f10);
        }
    }

    public void setHint(CharSequence charSequence) {
        this.U.setHint(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        int i10;
        int K;
        if (this.f12792c0 && drawable != null) {
            Integer num = this.f12795f0;
            if (num != null) {
                K = num.intValue();
            } else {
                if (drawable == this.f12791b0) {
                    i10 = R.attr.colorOnSurfaceVariant;
                } else {
                    i10 = R.attr.colorOnSurface;
                }
                K = t0.K(this, i10);
            }
            drawable = drawable.mutate();
            a.b.g(drawable, K);
        }
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        boolean z10;
        if (this.f12793d0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        if (onClickListener == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setNavigationIconDecorative(z10);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z10) {
        this.f12790a0.getClass();
    }

    public void setStrokeColor(int i10) {
        if (getStrokeColor() != i10) {
            this.f12799j0.s(ColorStateList.valueOf(i10));
        }
    }

    public void setStrokeWidth(float f10) {
        if (getStrokeWidth() != f10) {
            this.f12799j0.t(f10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.U.setText(charSequence);
    }

    public final void t() {
        if (getLayoutParams() instanceof AppBarLayout.e) {
            AppBarLayout.e eVar = (AppBarLayout.e) getLayoutParams();
            if (this.f12798i0) {
                if (eVar.f12019a == 0) {
                    eVar.f12019a = 53;
                }
            } else if (eVar.f12019a == 53) {
                eVar.f12019a = 0;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* renamed from: g  reason: collision with root package name */
        public boolean f12802g;

        public ScrollingViewBehavior() {
            this.f12802g = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            super.d(coordinatorLayout, view, view2);
            if (!this.f12802g && (view2 instanceof AppBarLayout)) {
                this.f12802g = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(0.0f);
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12802g = false;
        }
    }

    /* loaded from: classes2.dex */
    public static class a extends c1.a {
        public static final Parcelable.Creator<a> CREATOR = new C0170a();
        public String c;

        /* renamed from: com.google.android.material.search.SearchBar$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0170a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new a[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readString();
        }

        @Override // c1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5506a, i10);
            parcel.writeString(this.c);
        }

        public a(Toolbar.i iVar) {
            super(iVar);
        }
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    public void setHint(int i10) {
        this.U.setHint(i10);
    }

    public void setText(int i10) {
        this.U.setText(i10);
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 2132018173), attributeSet, i10);
        this.f12797h0 = -1;
        this.f12801l0 = new com.google.android.tools.d(this, 4);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", InMobiNetworkValues.TITLE) == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
                    throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
                }
            } else {
                throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
            }
        }
        Drawable a10 = m.a.a(context2, R.drawable.ic_search_black_24);
        this.f12791b0 = a10;
        this.f12790a0 = new d9.b();
        TypedArray d10 = s.d(context2, attributeSet, e8.a.T, i10, 2132018173, new int[0]);
        m mVar = new m(m.c(context2, attributeSet, i10, 2132018173));
        float dimension = d10.getDimension(5, 0.0f);
        this.W = d10.getBoolean(3, true);
        this.f12798i0 = d10.getBoolean(4, true);
        boolean z10 = d10.getBoolean(7, false);
        this.f12793d0 = d10.getBoolean(6, false);
        this.f12792c0 = d10.getBoolean(11, true);
        if (d10.hasValue(8)) {
            this.f12795f0 = Integer.valueOf(d10.getColor(8, -1));
        }
        int resourceId = d10.getResourceId(0, -1);
        String string = d10.getString(1);
        String string2 = d10.getString(2);
        float dimension2 = d10.getDimension(10, -1.0f);
        int color = d10.getColor(9, 0);
        d10.recycle();
        if (!z10) {
            setNavigationIcon(getNavigationIcon() != null ? getNavigationIcon() : a10);
            setNavigationIconDecorative(true);
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_bar, this);
        this.V = true;
        TextView textView = (TextView) findViewById(R.id.search_bar_text_view);
        this.U = textView;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.i.s(this, dimension);
        if (resourceId != -1) {
            textView.setTextAppearance(resourceId);
        }
        setText(string);
        setHint(string2);
        if (getNavigationIcon() == null) {
            x0.h.h((ViewGroup.MarginLayoutParams) textView.getLayoutParams(), getResources().getDimensionPixelSize(R.dimen.m3_searchbar_text_margin_start_no_navigation_icon));
        }
        h hVar = new h(mVar);
        this.f12799j0 = hVar;
        hVar.k(getContext());
        this.f12799j0.m(dimension);
        if (dimension2 >= 0.0f) {
            h hVar2 = this.f12799j0;
            hVar2.t(dimension2);
            hVar2.s(ColorStateList.valueOf(color));
        }
        int K = t0.K(this, R.attr.colorSurface);
        int K2 = t0.K(this, R.attr.colorControlHighlight);
        this.f12799j0.n(ColorStateList.valueOf(K));
        ColorStateList valueOf = ColorStateList.valueOf(K2);
        h hVar3 = this.f12799j0;
        f0.d.q(this, new RippleDrawable(valueOf, hVar3, hVar3));
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f12800k0 = accessibilityManager;
        if (accessibilityManager != null) {
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                setFocusableInTouchMode(true);
            }
            addOnAttachStateChangeListener(new d9.a(this));
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
