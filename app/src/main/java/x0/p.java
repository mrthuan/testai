package x0;

import android.view.View;
import android.view.ViewParent;
import java.util.Objects;
import java.util.WeakHashMap;
import x0.f0;

/* compiled from: NestedScrollingChildHelper.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f31470a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f31471b;
    public final View c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f31472d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f31473e;

    public p(View view) {
        this.c = view;
    }

    public final boolean a(float f10, float f11, boolean z10) {
        ViewParent g10;
        if (!this.f31472d || (g10 = g(0)) == null) {
            return false;
        }
        try {
            return k0.a(g10, this.c, f10, f11, z10);
        } catch (AbstractMethodError unused) {
            Objects.toString(g10);
            return false;
        }
    }

    public final boolean b(float f10, float f11) {
        ViewParent g10;
        if (!this.f31472d || (g10 = g(0)) == null) {
            return false;
        }
        try {
            return k0.b(g10, this.c, f10, f11);
        } catch (AbstractMethodError unused) {
            Objects.toString(g10);
            return false;
        }
    }

    public final boolean c(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        ViewParent g10;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.f31472d || (g10 = g(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (this.f31473e == null) {
                this.f31473e = new int[2];
            }
            iArr3 = this.f31473e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view2 = this.c;
        if (g10 instanceof q) {
            ((q) g10).o(view2, i10, i11, iArr3, i12);
        } else if (i12 == 0) {
            try {
                k0.c(g10, view2, i10, i11, iArr3);
            } catch (AbstractMethodError unused) {
                Objects.toString(g10);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public final void d(int i10, int i11, int i12, int[] iArr) {
        f(0, i10, 0, i11, null, i12, iArr);
    }

    public final boolean e(int i10, int i11, int i12, int i13, int[] iArr) {
        return f(i10, i11, i12, i13, iArr, 0, null);
    }

    public final boolean f(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent g10;
        int i15;
        int i16;
        int[] iArr3;
        if (!this.f31472d || (g10 = g(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            if (this.f31473e == null) {
                this.f31473e = new int[2];
            }
            int[] iArr4 = this.f31473e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view2 = this.c;
        if (g10 instanceof r) {
            ((r) g10).j(view2, i10, i11, i12, i13, i14, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i12;
            iArr3[1] = iArr3[1] + i13;
            if (g10 instanceof q) {
                ((q) g10).k(view2, i10, i11, i12, i13, i14);
            } else if (i14 == 0) {
                try {
                    k0.d(g10, view2, i10, i11, i12, i13);
                } catch (AbstractMethodError unused) {
                    Objects.toString(g10);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    public final ViewParent g(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return this.f31471b;
        }
        return this.f31470a;
    }

    public final void h(boolean z10) {
        if (this.f31472d) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.i.z(this.c);
        }
        this.f31472d = z10;
    }

    public final boolean i(int i10, int i11) {
        boolean z10;
        boolean f10;
        if (g(i11) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        if (this.f31472d) {
            View view = this.c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z11 = parent instanceof q;
                if (z11) {
                    f10 = ((q) parent).l(view2, view, i10, i11);
                } else {
                    if (i11 == 0) {
                        try {
                            f10 = k0.f(parent, view2, view, i10);
                        } catch (AbstractMethodError unused) {
                            Objects.toString(parent);
                        }
                    }
                    f10 = false;
                }
                if (f10) {
                    if (i11 != 0) {
                        if (i11 == 1) {
                            this.f31471b = parent;
                        }
                    } else {
                        this.f31470a = parent;
                    }
                    if (z11) {
                        ((q) parent).m(view2, view, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            k0.e(parent, view2, view, i10);
                        } catch (AbstractMethodError unused2) {
                            Objects.toString(parent);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
        }
        return false;
    }

    public final void j(int i10) {
        ViewParent g10 = g(i10);
        if (g10 != null) {
            boolean z10 = g10 instanceof q;
            View view = this.c;
            if (z10) {
                ((q) g10).n(view, i10);
            } else if (i10 == 0) {
                try {
                    k0.g(g10, view);
                } catch (AbstractMethodError unused) {
                    Objects.toString(g10);
                }
            }
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f31471b = null;
                    return;
                }
                return;
            }
            this.f31470a = null;
        }
    }
}
