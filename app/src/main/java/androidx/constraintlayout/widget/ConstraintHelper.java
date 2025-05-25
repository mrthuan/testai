package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.a;
import g0.d;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* renamed from: a  reason: collision with root package name */
    public int[] f3271a;

    /* renamed from: b  reason: collision with root package name */
    public int f3272b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public c0.b f3273d;

    /* renamed from: e  reason: collision with root package name */
    public String f3274e;

    /* renamed from: f  reason: collision with root package name */
    public String f3275f;

    /* renamed from: g  reason: collision with root package name */
    public View[] f3276g;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap<Integer, String> f3277h;

    public ConstraintHelper(Context context) {
        super(context);
        this.f3271a = new int[32];
        this.f3276g = null;
        this.f3277h = new HashMap<>();
        this.c = context;
        n(null);
    }

    public final void e(String str) {
        if (str == null || str.length() == 0 || this.c == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        int l10 = l(trim);
        if (l10 != 0) {
            this.f3277h.put(Integer.valueOf(l10), trim);
            f(l10);
        }
    }

    public final void f(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f3272b + 1;
        int[] iArr = this.f3271a;
        if (i11 > iArr.length) {
            this.f3271a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f3271a;
        int i12 = this.f3272b;
        iArr2[i12] = i10;
        this.f3272b = i12 + 1;
    }

    public final void g(String str) {
        ConstraintLayout constraintLayout;
        if (str == null || str.length() == 0 || this.c == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).Y) && childAt.getId() != -1) {
                f(childAt.getId());
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f3271a, this.f3272b);
    }

    public final void h() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            i((ConstraintLayout) parent);
        }
    }

    public final void i(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f3272b; i10++) {
            View c = constraintLayout.c(this.f3271a[i10]);
            if (c != null) {
                c.setVisibility(visibility);
                if (elevation > 0.0f) {
                    c.setTranslationZ(c.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int k(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int l(java.lang.String r5) {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r1 = 0
            if (r0 == 0) goto L10
            android.view.ViewParent r0 = r4.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            goto L11
        L10:
            r0 = r1
        L11:
            boolean r2 = r4.isInEditMode()
            if (r2 == 0) goto L3a
            if (r0 == 0) goto L3a
            boolean r2 = r5 instanceof java.lang.String
            if (r2 == 0) goto L2e
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r0.f3290m
            if (r2 == 0) goto L2e
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L2e
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r0.f3290m
            java.lang.Object r2 = r2.get(r5)
            goto L2f
        L2e:
            r2 = r1
        L2f:
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L3a
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L3b
        L3a:
            r2 = 0
        L3b:
            if (r2 != 0) goto L43
            if (r0 == 0) goto L43
            int r2 = r4.k(r0, r5)
        L43:
            if (r2 != 0) goto L4f
            java.lang.Class<g0.c> r0 = g0.c.class
            java.lang.reflect.Field r0 = r0.getField(r5)     // Catch: java.lang.Exception -> L4f
            int r2 = r0.getInt(r1)     // Catch: java.lang.Exception -> L4f
        L4f:
            if (r2 != 0) goto L61
            android.content.Context r0 = r4.c
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r2 = r1.getIdentifier(r5, r2, r0)
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintHelper.l(java.lang.String):int");
    }

    public final View[] m(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f3276g;
        if (viewArr == null || viewArr.length != this.f3272b) {
            this.f3276g = new View[this.f3272b];
        }
        for (int i10 = 0; i10 < this.f3272b; i10++) {
            this.f3276g[i10] = constraintLayout.c(this.f3271a[i10]);
        }
        return this.f3276g;
    }

    public void n(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f3274e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f3275f = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void o(a.C0012a c0012a, c0.b bVar, Constraints.a aVar, SparseArray sparseArray) {
        a.b bVar2 = c0012a.f3373e;
        int[] iArr = bVar2.f3407j0;
        int i10 = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar2.f3409k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] split = bVar2.f3409k0.split(",");
                    getContext();
                    int[] iArr2 = new int[split.length];
                    int i11 = 0;
                    for (String str2 : split) {
                        int l10 = l(str2.trim());
                        if (l10 != 0) {
                            iArr2[i11] = l10;
                            i11++;
                        }
                    }
                    if (i11 != split.length) {
                        iArr2 = Arrays.copyOf(iArr2, i11);
                    }
                    bVar2.f3407j0 = iArr2;
                } else {
                    bVar2.f3407j0 = null;
                }
            }
        }
        bVar.a();
        if (bVar2.f3407j0 == null) {
            return;
        }
        while (true) {
            int[] iArr3 = bVar2.f3407j0;
            if (i10 < iArr3.length) {
                ConstraintWidget constraintWidget = (ConstraintWidget) sparseArray.get(iArr3[i10]);
                if (constraintWidget != null) {
                    bVar.b(constraintWidget);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f3274e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f3275f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void s(c0.a aVar, SparseArray sparseArray) {
        aVar.a();
        for (int i10 = 0; i10 < this.f3272b; i10++) {
            aVar.b((ConstraintWidget) sparseArray.get(this.f3271a[i10]));
        }
    }

    public void setIds(String str) {
        this.f3274e = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f3272b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                e(str.substring(i10));
                return;
            } else {
                e(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f3275f = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f3272b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                g(str.substring(i10));
                return;
            } else {
                g(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f3274e = null;
        this.f3272b = 0;
        for (int i10 : iArr) {
            f(i10);
        }
    }

    @Override // android.view.View
    public final void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f3274e == null) {
            f(i10);
        }
    }

    public final void t() {
        if (this.f3273d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f3326q0 = this.f3273d;
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3271a = new int[32];
        this.f3276g = null;
        this.f3277h = new HashMap<>();
        this.c = context;
        n(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3271a = new int[32];
        this.f3276g = null;
        this.f3277h = new HashMap<>();
        this.c = context;
        n(attributeSet);
    }

    public void q() {
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void r(ConstraintLayout constraintLayout) {
    }

    public void p(ConstraintWidget constraintWidget, boolean z10) {
    }
}
