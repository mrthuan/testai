package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Api;
import java.util.WeakHashMap;
import lib.zj.office.fc.hslf.record.SlideAtom;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2148a;

    /* renamed from: b  reason: collision with root package name */
    public ScrollingTabContainerView f2149b;
    public View c;

    /* renamed from: d  reason: collision with root package name */
    public View f2150d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f2151e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f2152f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f2153g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2154h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2155i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2156j;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2151e;
        if (drawable != null && drawable.isStateful()) {
            this.f2151e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f2152f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f2152f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f2153g;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f2153g.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f2149b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2151e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2152f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f2153g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.c = findViewById(R.id.action_bar);
        this.f2150d = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f2148a && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        ScrollingTabContainerView scrollingTabContainerView = this.f2149b;
        boolean z12 = true;
        boolean z13 = false;
        if (scrollingTabContainerView != null && scrollingTabContainerView.getVisibility() != 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (scrollingTabContainerView != null && scrollingTabContainerView.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i14 = ((FrameLayout.LayoutParams) scrollingTabContainerView.getLayoutParams()).bottomMargin;
            scrollingTabContainerView.layout(i10, (measuredHeight - scrollingTabContainerView.getMeasuredHeight()) - i14, i12, measuredHeight - i14);
        }
        if (this.f2154h) {
            Drawable drawable2 = this.f2153g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z12 = z13;
        } else {
            if (this.f2151e != null) {
                if (this.c.getVisibility() == 0) {
                    this.f2151e.setBounds(this.c.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
                } else {
                    View view = this.f2150d;
                    if (view != null && view.getVisibility() == 0) {
                        this.f2151e.setBounds(this.f2150d.getLeft(), this.f2150d.getTop(), this.f2150d.getRight(), this.f2150d.getBottom());
                    } else {
                        this.f2151e.setBounds(0, 0, 0, 0);
                    }
                }
                z13 = true;
            }
            this.f2155i = z11;
            if (z11 && (drawable = this.f2152f) != null) {
                drawable.setBounds(scrollingTabContainerView.getLeft(), scrollingTabContainerView.getTop(), scrollingTabContainerView.getRight(), scrollingTabContainerView.getBottom());
            }
            z12 = z13;
        }
        if (z12) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        if (this.c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i13 = this.f2156j) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i13, View.MeasureSpec.getSize(i11)), SlideAtom.USES_MASTER_SLIDE_ID);
        }
        super.onMeasure(i10, i11);
        if (this.c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        ScrollingTabContainerView scrollingTabContainerView = this.f2149b;
        if (scrollingTabContainerView != null && scrollingTabContainerView.getVisibility() != 8 && mode != 1073741824) {
            View view = this.c;
            boolean z11 = true;
            int i14 = 0;
            if (view != null && view.getVisibility() != 8 && view.getMeasuredHeight() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                i14 = a(this.c);
            } else {
                View view2 = this.f2150d;
                if (view2 != null && view2.getVisibility() != 8 && view2.getMeasuredHeight() != 0) {
                    z11 = false;
                }
                if (!z11) {
                    i14 = a(this.f2150d);
                }
            }
            if (mode == Integer.MIN_VALUE) {
                i12 = View.MeasureSpec.getSize(i11);
            } else {
                i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f2149b) + i14, i12));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f2151e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f2151e);
        }
        this.f2151e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.c;
            if (view != null) {
                this.f2151e.setBounds(view.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f2154h ? this.f2151e != null || this.f2152f != null : this.f2153g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2153g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2153g);
        }
        this.f2153g = drawable;
        boolean z10 = this.f2154h;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.f2153g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.f2151e != null || this.f2152f != null) : this.f2153g == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        boolean z10;
        Drawable drawable2;
        Drawable drawable3 = this.f2152f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2152f);
        }
        this.f2152f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2155i && (drawable2 = this.f2152f) != null) {
                drawable2.setBounds(this.f2149b.getLeft(), this.f2149b.getTop(), this.f2149b.getRight(), this.f2149b.getBottom());
            }
        }
        if (!this.f2154h ? !(this.f2151e != null || this.f2152f != null) : this.f2153g == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        ScrollingTabContainerView scrollingTabContainerView2 = this.f2149b;
        if (scrollingTabContainerView2 != null) {
            removeView(scrollingTabContainerView2);
        }
        this.f2149b = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        int i10;
        this.f2148a = z10;
        if (z10) {
            i10 = 393216;
        } else {
            i10 = 262144;
        }
        setDescendantFocusability(i10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f2151e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f2152f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f2153g;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2151e;
        boolean z10 = this.f2154h;
        if ((drawable == drawable2 && !z10) || ((drawable == this.f2152f && this.f2155i) || ((drawable == this.f2153g && z10) || super.verifyDrawable(drawable)))) {
            return true;
        }
        return false;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b(this);
        WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
        f0.d.q(this, bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.a.f19429a);
        boolean z10 = false;
        this.f2151e = obtainStyledAttributes.getDrawable(0);
        this.f2152f = obtainStyledAttributes.getDrawable(2);
        this.f2156j = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f2154h = true;
            this.f2153g = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f2154h ? !(this.f2151e != null || this.f2152f != null) : this.f2153g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
