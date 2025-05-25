package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import d0.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* loaded from: classes.dex */
public final class ConstraintAnchor {

    /* renamed from: b  reason: collision with root package name */
    public int f2800b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintWidget f2801d;

    /* renamed from: e  reason: collision with root package name */
    public final Type f2802e;

    /* renamed from: f  reason: collision with root package name */
    public ConstraintAnchor f2803f;

    /* renamed from: i  reason: collision with root package name */
    public SolverVariable f2806i;

    /* renamed from: a  reason: collision with root package name */
    public HashSet<ConstraintAnchor> f2799a = null;

    /* renamed from: g  reason: collision with root package name */
    public int f2804g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f2805h = SlideAtom.USES_MASTER_SLIDE_ID;

    /* loaded from: classes.dex */
    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2808a;

        static {
            int[] iArr = new int[Type.values().length];
            f2808a = iArr;
            try {
                iArr[Type.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2808a[Type.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2808a[Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2808a[Type.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2808a[Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2808a[Type.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2808a[Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2808a[Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2808a[Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f2801d = constraintWidget;
        this.f2802e = type;
    }

    public final void a(ConstraintAnchor constraintAnchor, int i10) {
        b(constraintAnchor, i10, SlideAtom.USES_MASTER_SLIDE_ID, false);
    }

    public final boolean b(ConstraintAnchor constraintAnchor, int i10, int i11, boolean z10) {
        if (constraintAnchor == null) {
            j();
            return true;
        } else if (!z10 && !i(constraintAnchor)) {
            return false;
        } else {
            this.f2803f = constraintAnchor;
            if (constraintAnchor.f2799a == null) {
                constraintAnchor.f2799a = new HashSet<>();
            }
            HashSet<ConstraintAnchor> hashSet = this.f2803f.f2799a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f2804g = i10;
            this.f2805h = i11;
            return true;
        }
    }

    public final void c(int i10, j jVar, ArrayList arrayList) {
        HashSet<ConstraintAnchor> hashSet = this.f2799a;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                d0.g.a(it.next().f2801d, i10, arrayList, jVar);
            }
        }
    }

    public final int d() {
        if (!this.c) {
            return 0;
        }
        return this.f2800b;
    }

    public final int e() {
        ConstraintAnchor constraintAnchor;
        if (this.f2801d.f2827j0 == 8) {
            return 0;
        }
        int i10 = this.f2805h;
        if (i10 != Integer.MIN_VALUE && (constraintAnchor = this.f2803f) != null && constraintAnchor.f2801d.f2827j0 == 8) {
            return i10;
        }
        return this.f2804g;
    }

    public final ConstraintAnchor f() {
        int[] iArr = a.f2808a;
        Type type = this.f2802e;
        int i10 = iArr[type.ordinal()];
        ConstraintWidget constraintWidget = this.f2801d;
        switch (i10) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return constraintWidget.M;
            case 3:
                return constraintWidget.K;
            case 4:
                return constraintWidget.N;
            case 5:
                return constraintWidget.L;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final boolean g() {
        HashSet<ConstraintAnchor> hashSet = this.f2799a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        if (this.f2803f != null) {
            return true;
        }
        return false;
    }

    public final boolean i(ConstraintAnchor constraintAnchor) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (constraintAnchor == null) {
            return false;
        }
        Type type = this.f2802e;
        ConstraintWidget constraintWidget = constraintAnchor.f2801d;
        Type type2 = constraintAnchor.f2802e;
        if (type2 == type) {
            if (type == Type.BASELINE && (!constraintWidget.F || !this.f2801d.F)) {
                return false;
            }
            return true;
        }
        switch (a.f2808a[type.ordinal()]) {
            case 1:
                if (type2 == Type.BASELINE || type2 == Type.CENTER_X || type2 == Type.CENTER_Y) {
                    return false;
                }
                return true;
            case 2:
            case 3:
                if (type2 != Type.LEFT && type2 != Type.RIGHT) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (constraintWidget instanceof f) {
                    if (z10 || type2 == Type.CENTER_X) {
                        z12 = true;
                    }
                    return z12;
                }
                return z10;
            case 4:
            case 5:
                if (type2 != Type.TOP && type2 != Type.BOTTOM) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (constraintWidget instanceof f) {
                    if (z11 || type2 == Type.CENTER_Y) {
                        z12 = true;
                    }
                    return z12;
                }
                return z11;
            case 6:
                if (type2 == Type.LEFT || type2 == Type.RIGHT) {
                    return false;
                }
                return true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final void j() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f2803f;
        if (constraintAnchor != null && (hashSet = constraintAnchor.f2799a) != null) {
            hashSet.remove(this);
            if (this.f2803f.f2799a.size() == 0) {
                this.f2803f.f2799a = null;
            }
        }
        this.f2799a = null;
        this.f2803f = null;
        this.f2804g = 0;
        this.f2805h = SlideAtom.USES_MASTER_SLIDE_ID;
        this.c = false;
        this.f2800b = 0;
    }

    public final void k() {
        SolverVariable solverVariable = this.f2806i;
        if (solverVariable == null) {
            this.f2806i = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        } else {
            solverVariable.c();
        }
    }

    public final void l(int i10) {
        this.f2800b = i10;
        this.c = true;
    }

    public final String toString() {
        return this.f2801d.f2831l0 + ":" + this.f2802e.toString();
    }
}
