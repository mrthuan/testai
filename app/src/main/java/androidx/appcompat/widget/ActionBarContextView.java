package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c;
import java.util.WeakHashMap;
import lib.zj.office.fc.hslf.record.SlideAtom;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;

/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f2157i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f2158j;

    /* renamed from: k  reason: collision with root package name */
    public View f2159k;

    /* renamed from: l  reason: collision with root package name */
    public View f2160l;

    /* renamed from: m  reason: collision with root package name */
    public View f2161m;

    /* renamed from: n  reason: collision with root package name */
    public LinearLayout f2162n;

    /* renamed from: o  reason: collision with root package name */
    public TextView f2163o;

    /* renamed from: p  reason: collision with root package name */
    public TextView f2164p;

    /* renamed from: q  reason: collision with root package name */
    public final int f2165q;

    /* renamed from: r  reason: collision with root package name */
    public final int f2166r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2167s;

    /* renamed from: t  reason: collision with root package name */
    public final int f2168t;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q.a f2169a;

        public a(q.a aVar) {
            this.f2169a = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f2169a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public final void f(q.a aVar) {
        View view = this.f2159k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f2168t, (ViewGroup) this, false);
            this.f2159k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f2159k);
        }
        View findViewById = this.f2159k.findViewById(R.id.action_mode_close_button);
        this.f2160l = findViewById;
        findViewById.setOnClickListener(new a(aVar));
        androidx.appcompat.view.menu.h e10 = aVar.e();
        c cVar = this.f2481d;
        if (cVar != null) {
            cVar.i();
            c.a aVar2 = cVar.f2541u;
            if (aVar2 != null && aVar2.b()) {
                aVar2.f2120j.dismiss();
            }
        }
        c cVar2 = new c(getContext());
        this.f2481d = cVar2;
        cVar2.f2533m = true;
        cVar2.f2534n = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        e10.b(this.f2481d, this.f2480b);
        c cVar3 = this.f2481d;
        androidx.appcompat.view.menu.o oVar = cVar3.f2007h;
        if (oVar == null) {
            androidx.appcompat.view.menu.o oVar2 = (androidx.appcompat.view.menu.o) cVar3.f2003d.inflate(cVar3.f2005f, (ViewGroup) this, false);
            cVar3.f2007h = oVar2;
            oVar2.g(cVar3.c);
            cVar3.c(true);
        }
        androidx.appcompat.view.menu.o oVar3 = cVar3.f2007h;
        if (oVar != oVar3) {
            ((ActionMenuView) oVar3).setPresenter(cVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) oVar3;
        this.c = actionMenuView;
        WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
        f0.d.q(actionMenuView, null);
        addView(this.c, layoutParams);
    }

    public final void g() {
        int i10;
        if (this.f2162n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2162n = linearLayout;
            this.f2163o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f2164p = (TextView) this.f2162n.findViewById(R.id.action_bar_subtitle);
            int i11 = this.f2165q;
            if (i11 != 0) {
                this.f2163o.setTextAppearance(getContext(), i11);
            }
            int i12 = this.f2166r;
            if (i12 != 0) {
                this.f2164p.setTextAppearance(getContext(), i12);
            }
        }
        this.f2163o.setText(this.f2157i);
        this.f2164p.setText(this.f2158j);
        boolean z10 = !TextUtils.isEmpty(this.f2157i);
        boolean z11 = !TextUtils.isEmpty(this.f2158j);
        TextView textView = this.f2164p;
        int i13 = 0;
        if (z11) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        textView.setVisibility(i10);
        LinearLayout linearLayout2 = this.f2162n;
        if (!z10 && !z11) {
            i13 = 8;
        }
        linearLayout2.setVisibility(i13);
        if (this.f2162n.getParent() == null) {
            addView(this.f2162n);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f2158j;
    }

    public CharSequence getTitle() {
        return this.f2157i;
    }

    public final void h() {
        removeAllViews();
        this.f2161m = null;
        this.c = null;
        this.f2481d = null;
        View view = this.f2160l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f2481d;
        if (cVar != null) {
            cVar.i();
            c.a aVar = this.f2481d.f2541u;
            if (aVar != null && aVar.b()) {
                aVar.f2120j.dismiss();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int paddingRight;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean a10 = d1.a(this);
        if (a10) {
            paddingLeft = (i12 - i10) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f2159k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2159k.getLayoutParams();
            if (a10) {
                i14 = marginLayoutParams.rightMargin;
            } else {
                i14 = marginLayoutParams.leftMargin;
            }
            if (a10) {
                i15 = marginLayoutParams.leftMargin;
            } else {
                i15 = marginLayoutParams.rightMargin;
            }
            if (a10) {
                i16 = paddingLeft - i14;
            } else {
                i16 = paddingLeft + i14;
            }
            int d10 = androidx.appcompat.widget.a.d(this.f2159k, a10, i16, paddingTop, paddingTop2) + i16;
            if (a10) {
                i17 = d10 - i15;
            } else {
                i17 = d10 + i15;
            }
            paddingLeft = i17;
        }
        LinearLayout linearLayout = this.f2162n;
        if (linearLayout != null && this.f2161m == null && linearLayout.getVisibility() != 8) {
            paddingLeft += androidx.appcompat.widget.a.d(this.f2162n, a10, paddingLeft, paddingTop, paddingTop2);
        }
        View view2 = this.f2161m;
        if (view2 != null) {
            androidx.appcompat.widget.a.d(view2, a10, paddingLeft, paddingTop, paddingTop2);
        }
        if (a10) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i12 - i10) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            androidx.appcompat.widget.a.d(actionMenuView, !a10, paddingRight, paddingTop, paddingTop2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14 = 1073741824;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            if (View.MeasureSpec.getMode(i11) != 0) {
                int size = View.MeasureSpec.getSize(i10);
                int i15 = this.f2482e;
                if (i15 <= 0) {
                    i15 = View.MeasureSpec.getSize(i11);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i16 = i15 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, SlideAtom.USES_MASTER_SLIDE_ID);
                View view = this.f2159k;
                if (view != null) {
                    int c = androidx.appcompat.widget.a.c(paddingLeft, makeMeasureSpec, view);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2159k.getLayoutParams();
                    paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.c;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = androidx.appcompat.widget.a.c(paddingLeft, makeMeasureSpec, this.c);
                }
                LinearLayout linearLayout = this.f2162n;
                if (linearLayout != null && this.f2161m == null) {
                    if (this.f2167s) {
                        this.f2162n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f2162n.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.f2162n;
                        if (z10) {
                            i13 = 0;
                        } else {
                            i13 = 8;
                        }
                        linearLayout2.setVisibility(i13);
                    } else {
                        paddingLeft = androidx.appcompat.widget.a.c(paddingLeft, makeMeasureSpec, linearLayout);
                    }
                }
                View view2 = this.f2161m;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i17 = layoutParams.width;
                    if (i17 != -2) {
                        i12 = 1073741824;
                    } else {
                        i12 = Integer.MIN_VALUE;
                    }
                    if (i17 >= 0) {
                        paddingLeft = Math.min(i17, paddingLeft);
                    }
                    int i18 = layoutParams.height;
                    if (i18 == -2) {
                        i14 = Integer.MIN_VALUE;
                    }
                    if (i18 >= 0) {
                        i16 = Math.min(i18, i16);
                    }
                    this.f2161m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(i16, i14));
                }
                if (this.f2482e <= 0) {
                    int childCount = getChildCount();
                    int i19 = 0;
                    for (int i20 = 0; i20 < childCount; i20++) {
                        int measuredHeight = getChildAt(i20).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > i19) {
                            i19 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i19);
                    return;
                }
                setMeasuredDimension(size, i15);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i10) {
        this.f2482e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f2161m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f2161m = view;
        if (view != null && (linearLayout = this.f2162n) != null) {
            removeView(linearLayout);
            this.f2162n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2158j = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2157i = charSequence;
        g();
        x0.f0.p(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f2167s) {
            requestLayout();
        }
        this.f2167s = z10;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.a.f19431d, i10, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = m.a.a(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
        f0.d.q(this, drawable);
        this.f2165q = obtainStyledAttributes.getResourceId(5, 0);
        this.f2166r = obtainStyledAttributes.getResourceId(4, 0);
        this.f2482e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f2168t = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }
}
