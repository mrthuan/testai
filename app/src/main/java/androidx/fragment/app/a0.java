package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;

/* compiled from: FragmentLayoutInflaterFactory.java */
/* loaded from: classes.dex */
public final class a0 implements LayoutInflater.Factory2 {

    /* renamed from: a  reason: collision with root package name */
    public final g0 f3736a;

    public a0(g0 g0Var) {
        this.f3736a = g0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        n0 f10;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        g0 g0Var = this.f3736a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, g0Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k1.a.f19554a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z10 = Fragment.class.isAssignableFrom(y.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z10 = false;
                }
                if (z10) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment C = resourceId != -1 ? g0Var.C(resourceId) : null;
                    if (C == null && string != null) {
                        C = g0Var.D(string);
                    }
                    if (C == null && id2 != -1) {
                        C = g0Var.C(id2);
                    }
                    if (C == null) {
                        y G = g0Var.G();
                        context.getClassLoader();
                        C = G.a(attributeValue);
                        C.f3681n = true;
                        C.f3690w = resourceId != 0 ? resourceId : id2;
                        C.f3691x = id2;
                        C.f3692y = string;
                        C.f3682o = true;
                        C.f3686s = g0Var;
                        z<?> zVar = g0Var.f3794t;
                        C.f3687t = zVar;
                        Context context2 = zVar.f3962e;
                        C.F = true;
                        if ((zVar != null ? zVar.f3961d : null) != null) {
                            C.F = true;
                        }
                        f10 = g0Var.a(C);
                        if (g0.J(2)) {
                            C.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else if (!C.f3682o) {
                        C.f3682o = true;
                        C.f3686s = g0Var;
                        z<?> zVar2 = g0Var.f3794t;
                        C.f3687t = zVar2;
                        Context context3 = zVar2.f3962e;
                        C.F = true;
                        if ((zVar2 != null ? zVar2.f3961d : null) != null) {
                            C.F = true;
                        }
                        f10 = g0Var.f(C);
                        if (g0.J(2)) {
                            C.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    FragmentStrictMode.a aVar = FragmentStrictMode.f3929a;
                    FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(C, viewGroup);
                    FragmentStrictMode.c(fragmentTagUsageViolation);
                    FragmentStrictMode.a a10 = FragmentStrictMode.a(C);
                    if (a10.f3931a.contains(FragmentStrictMode.Flag.DETECT_FRAGMENT_TAG_USAGE) && FragmentStrictMode.e(a10, C.getClass(), FragmentTagUsageViolation.class)) {
                        FragmentStrictMode.b(a10, fragmentTagUsageViolation);
                    }
                    C.G = viewGroup;
                    f10.k();
                    f10.j();
                    View view2 = C.H;
                    if (view2 != null) {
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (C.H.getTag() == null) {
                            C.H.setTag(string);
                        }
                        C.H.addOnAttachStateChangeListener(new a(f10));
                        return C.H;
                    }
                    throw new IllegalStateException(a6.h.d("Fragment ", attributeValue, " did not create a view."));
                }
            }
            return null;
        }
        return null;
    }

    /* compiled from: FragmentLayoutInflaterFactory.java */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n0 f3737a;

        public a(n0 n0Var) {
            this.f3737a = n0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            n0 n0Var = this.f3737a;
            Fragment fragment = n0Var.c;
            n0Var.k();
            SpecialEffectsController.f((ViewGroup) fragment.H.getParent(), a0.this.f3736a).e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
