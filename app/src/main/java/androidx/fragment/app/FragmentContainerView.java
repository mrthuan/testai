package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: FragmentContainerView.kt */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3711a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f3712b;
    public View.OnApplyWindowInsetsListener c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3713d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        kotlin.jvm.internal.g.e(context, "context");
        this.f3711a = new ArrayList();
        this.f3712b = new ArrayList();
        this.f3713d = true;
    }

    public final void a(View view) {
        if (this.f3712b.contains(view)) {
            this.f3711a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i10, ViewGroup.LayoutParams layoutParams) {
        Fragment fragment;
        kotlin.jvm.internal.g.e(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            fragment = (Fragment) tag;
        } else {
            fragment = null;
        }
        if (fragment != null) {
            super.addView(child, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        x0.s0 j10;
        kotlin.jvm.internal.g.e(insets, "insets");
        x0.s0 i10 = x0.s0.i(null, insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            kotlin.jvm.internal.g.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            j10 = x0.s0.i(null, onApplyWindowInsets);
        } else {
            j10 = x0.f0.j(this, i10);
        }
        kotlin.jvm.internal.g.d(j10, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!j10.f31498a.m()) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                x0.f0.b(getChildAt(i11), j10);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.g.e(canvas, "canvas");
        if (this.f3713d) {
            for (View view : this.f3711a) {
                super.drawChild(canvas, view, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j10) {
        kotlin.jvm.internal.g.e(canvas, "canvas");
        kotlin.jvm.internal.g.e(child, "child");
        if (this.f3713d) {
            ArrayList arrayList = this.f3711a;
            if ((!arrayList.isEmpty()) && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j10);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        kotlin.jvm.internal.g.e(view, "view");
        this.f3712b.remove(view);
        if (this.f3711a.remove(view)) {
            this.f3713d = true;
        }
        super.endViewTransition(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    public final <F extends Fragment> F getFragment() {
        u uVar;
        Fragment fragment;
        g0 supportFragmentManager;
        FragmentContainerView fragmentContainerView = this;
        while (true) {
            uVar = null;
            if (fragmentContainerView != 0) {
                Object tag = fragmentContainerView.getTag(R.id.fragment_container_view_tag);
                if (tag instanceof Fragment) {
                    fragment = (Fragment) tag;
                } else {
                    fragment = null;
                }
                if (fragment != null) {
                    break;
                }
                ViewParent parent = fragmentContainerView.getParent();
                if (parent instanceof View) {
                    fragmentContainerView = (View) parent;
                } else {
                    fragmentContainerView = 0;
                }
            } else {
                fragment = null;
                break;
            }
        }
        if (fragment != null) {
            if (fragment.D()) {
                supportFragmentManager = fragment.q();
            } else {
                throw new IllegalStateException("The Fragment " + fragment + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
        } else {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof u) {
                    uVar = (u) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (uVar != null) {
                supportFragmentManager = uVar.getSupportFragmentManager();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        }
        return (F) supportFragmentManager.C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        kotlin.jvm.internal.g.e(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View view = getChildAt(childCount);
                kotlin.jvm.internal.g.d(view, "view");
                a(view);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        kotlin.jvm.internal.g.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        View view = getChildAt(i10);
        kotlin.jvm.internal.g.d(view, "view");
        a(view);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        kotlin.jvm.internal.g.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            kotlin.jvm.internal.g.d(view, "view");
            a(view);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            kotlin.jvm.internal.g.d(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f3713d = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        kotlin.jvm.internal.g.e(listener, "listener");
        this.c = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        kotlin.jvm.internal.g.e(view, "view");
        if (view.getParent() == this) {
            this.f3712b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.g.e(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        String str;
        kotlin.jvm.internal.g.e(context, "context");
        this.f3711a = new ArrayList();
        this.f3712b = new ArrayList();
        this.f3713d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k1.a.f19555b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, g0 fm2) {
        super(context, attrs);
        View view;
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(attrs, "attrs");
        kotlin.jvm.internal.g.e(fm2, "fm");
        this.f3711a = new ArrayList();
        this.f3712b = new ArrayList();
        this.f3713d = true;
        String classAttribute = attrs.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, k1.a.f19555b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment C = fm2.C(id2);
        if (classAttribute != null && C == null) {
            if (id2 == -1) {
                throw new IllegalStateException(a6.h.d("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            y G = fm2.G();
            context.getClassLoader();
            Fragment a10 = G.a(classAttribute);
            kotlin.jvm.internal.g.d(a10, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a10.F = true;
            z<?> zVar = a10.f3687t;
            if ((zVar == null ? null : zVar.f3961d) != null) {
                a10.F = true;
            }
            a aVar = new a(fm2);
            aVar.f3911o = true;
            a10.G = this;
            aVar.c(getId(), a10, string, 1);
            if (!aVar.f3903g) {
                aVar.f3733p.z(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = fm2.c.e().iterator();
        while (it.hasNext()) {
            n0 n0Var = (n0) it.next();
            Fragment fragment = n0Var.c;
            if (fragment.f3691x == getId() && (view = fragment.H) != null && view.getParent() == null) {
                fragment.G = this;
                n0Var.b();
            }
        }
    }
