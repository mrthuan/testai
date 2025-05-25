package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.LinearLayoutCompat;
import l.a;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes.dex */
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    public j0 f2351a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayoutCompat f2352b;
    public AppCompatSpinner c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2353d;

    /* renamed from: e  reason: collision with root package name */
    public int f2354e;

    /* renamed from: f  reason: collision with root package name */
    public int f2355f;

    /* renamed from: g  reason: collision with root package name */
    public int f2356g;

    /* renamed from: h  reason: collision with root package name */
    public int f2357h;

    /* loaded from: classes.dex */
    public class a extends BaseAdapter {
        public a() {
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return ScrollingTabContainerView.this.f2352b.getChildCount();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i10) {
            return ((b) ScrollingTabContainerView.this.f2352b.getChildAt(i10)).f2359a;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
                scrollingTabContainerView.getClass();
                b bVar = new b(scrollingTabContainerView.getContext(), (a.c) getItem(i10));
                bVar.setBackgroundDrawable(null);
                bVar.setLayoutParams(new AbsListView.LayoutParams(-1, scrollingTabContainerView.f2356g));
                return bVar;
            }
            b bVar2 = (b) view;
            bVar2.f2359a = (a.c) getItem(i10);
            bVar2.a();
            return view;
        }
    }

    /* loaded from: classes.dex */
    public class b extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        public a.c f2359a;

        /* renamed from: b  reason: collision with root package name */
        public AppCompatTextView f2360b;
        public AppCompatImageView c;

        /* renamed from: d  reason: collision with root package name */
        public View f2361d;

        public b(Context context, a.c cVar) {
            super(context, null, R.attr.actionBarTabStyle);
            Drawable drawable;
            int resourceId;
            this.f2359a = cVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16842964}, R.attr.actionBarTabStyle, 0);
            if (obtainStyledAttributes.hasValue(0)) {
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    drawable = m.a.a(context, resourceId);
                } else {
                    drawable = obtainStyledAttributes.getDrawable(0);
                }
                setBackgroundDrawable(drawable);
            }
            obtainStyledAttributes.recycle();
            setGravity(8388627);
            a();
        }

        public final void a() {
            a.c cVar = this.f2359a;
            View b10 = cVar.b();
            CharSequence charSequence = null;
            if (b10 != null) {
                ViewParent parent = b10.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b10);
                    }
                    addView(b10);
                }
                this.f2361d = b10;
                AppCompatTextView appCompatTextView = this.f2360b;
                if (appCompatTextView != null) {
                    appCompatTextView.setVisibility(8);
                }
                AppCompatImageView appCompatImageView = this.c;
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(8);
                    this.c.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f2361d;
            if (view != null) {
                removeView(view);
                this.f2361d = null;
            }
            Drawable c = cVar.c();
            CharSequence d10 = cVar.d();
            if (c != null) {
                if (this.c == null) {
                    AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView2.setLayoutParams(layoutParams);
                    addView(appCompatImageView2, 0);
                    this.c = appCompatImageView2;
                }
                this.c.setImageDrawable(c);
                this.c.setVisibility(0);
            } else {
                AppCompatImageView appCompatImageView3 = this.c;
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setVisibility(8);
                    this.c.setImageDrawable(null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(d10);
            if (z10) {
                if (this.f2360b == null) {
                    AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext(), null, R.attr.actionBarTabTextStyle);
                    appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView2.setLayoutParams(layoutParams2);
                    addView(appCompatTextView2);
                    this.f2360b = appCompatTextView2;
                }
                this.f2360b.setText(d10);
                this.f2360b.setVisibility(0);
            } else {
                AppCompatTextView appCompatTextView3 = this.f2360b;
                if (appCompatTextView3 != null) {
                    appCompatTextView3.setVisibility(8);
                    this.f2360b.setText((CharSequence) null);
                }
            }
            AppCompatImageView appCompatImageView4 = this.c;
            if (appCompatImageView4 != null) {
                appCompatImageView4.setContentDescription(cVar.a());
            }
            if (!z10) {
                charSequence = cVar.a();
            }
            x0.a(this, charSequence);
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            if (scrollingTabContainerView.f2354e > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = scrollingTabContainerView.f2354e;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        @Override // android.view.View
        public final void setSelected(boolean z10) {
            boolean z11;
            if (isSelected() != z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2363a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f2363a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f2363a) {
                return;
            }
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            scrollingTabContainerView.getClass();
            scrollingTabContainerView.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.f2363a = false;
        }
    }

    static {
        new DecelerateInterpolator();
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        new c();
        setHorizontalScrollBarEnabled(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, k.a.f19429a, R.attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(13, 0);
        layoutDimension = context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs) ? layoutDimension : Math.min(layoutDimension, context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f2355f = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
        this.f2352b = linearLayoutCompat;
        addView(linearLayoutCompat, new ViewGroup.LayoutParams(-2, -1));
    }

    public final void a() {
        boolean z10;
        AppCompatSpinner appCompatSpinner = this.c;
        if (appCompatSpinner != null && appCompatSpinner.getParent() == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        removeView(this.c);
        addView(this.f2352b, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.c.getSelectedItemPosition());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j0 j0Var = this.f2351a;
        if (j0Var != null) {
            post(j0Var);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, k.a.f19429a, R.attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f2355f = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j0 j0Var = this.f2351a;
        if (j0Var != null) {
            removeCallbacks(j0Var);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((b) view).f2359a.e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        boolean z11;
        int mode = View.MeasureSpec.getMode(i10);
        boolean z12 = true;
        if (mode == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        setFillViewport(z10);
        LinearLayoutCompat linearLayoutCompat = this.f2352b;
        int childCount = linearLayoutCompat.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.f2354e = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.f2354e = View.MeasureSpec.getSize(i10) / 2;
            }
            this.f2354e = Math.min(this.f2354e, this.f2355f);
        } else {
            this.f2354e = -1;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f2356g, 1073741824);
        if (!z10 && this.f2353d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            linearLayoutCompat.measure(0, makeMeasureSpec);
            if (linearLayoutCompat.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                AppCompatSpinner appCompatSpinner = this.c;
                if (appCompatSpinner == null || appCompatSpinner.getParent() != this) {
                    z12 = false;
                }
                if (!z12) {
                    if (this.c == null) {
                        AppCompatSpinner appCompatSpinner2 = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
                        appCompatSpinner2.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
                        appCompatSpinner2.setOnItemSelectedListener(this);
                        this.c = appCompatSpinner2;
                    }
                    removeView(linearLayoutCompat);
                    addView(this.c, new ViewGroup.LayoutParams(-2, -1));
                    if (this.c.getAdapter() == null) {
                        this.c.setAdapter((SpinnerAdapter) new a());
                    }
                    Runnable runnable = this.f2351a;
                    if (runnable != null) {
                        removeCallbacks(runnable);
                        this.f2351a = null;
                    }
                    this.c.setSelection(this.f2357h);
                }
            } else {
                a();
            }
        } else {
            a();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i10, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z10 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f2357h);
        }
    }

    public void setAllowCollapse(boolean z10) {
        this.f2353d = z10;
    }

    public void setContentHeight(int i10) {
        this.f2356g = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        boolean z10;
        this.f2357h = i10;
        LinearLayoutCompat linearLayoutCompat = this.f2352b;
        int childCount = linearLayoutCompat.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayoutCompat.getChildAt(i11);
            if (i11 == i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            childAt.setSelected(z10);
            if (z10) {
                View childAt2 = linearLayoutCompat.getChildAt(i10);
                Runnable runnable = this.f2351a;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                j0 j0Var = new j0(this, childAt2);
                this.f2351a = j0Var;
                post(j0Var);
            }
        }
        AppCompatSpinner appCompatSpinner = this.c;
        if (appCompatSpinner != null && i10 >= 0) {
            appCompatSpinner.setSelection(i10);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
