package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import d0.i;

/* loaded from: classes.dex */
public abstract class WidgetRun implements d0.d {

    /* renamed from: a  reason: collision with root package name */
    public int f2873a;

    /* renamed from: b  reason: collision with root package name */
    public ConstraintWidget f2874b;
    public i c;

    /* renamed from: d  reason: collision with root package name */
    public ConstraintWidget.DimensionBehaviour f2875d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.constraintlayout.core.widgets.analyzer.a f2876e = new androidx.constraintlayout.core.widgets.analyzer.a(this);

    /* renamed from: f  reason: collision with root package name */
    public int f2877f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2878g = false;

    /* renamed from: h  reason: collision with root package name */
    public final DependencyNode f2879h = new DependencyNode(this);

    /* renamed from: i  reason: collision with root package name */
    public final DependencyNode f2880i = new DependencyNode(this);

    /* renamed from: j  reason: collision with root package name */
    public RunType f2881j = RunType.NONE;

    /* loaded from: classes.dex */
    public enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2883a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f2883a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2883a[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2883a[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2883a[ConstraintAnchor.Type.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2883a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.f2874b = constraintWidget;
    }

    public static void b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i10) {
        dependencyNode.f2871l.add(dependencyNode2);
        dependencyNode.f2865f = i10;
        dependencyNode2.f2870k.add(dependencyNode);
    }

    public static DependencyNode h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f2803f;
        if (constraintAnchor2 == null) {
            return null;
        }
        int i10 = a.f2883a[constraintAnchor2.f2802e.ordinal()];
        ConstraintWidget constraintWidget = constraintAnchor2.f2801d;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return null;
                        }
                        return constraintWidget.f2816e.f2880i;
                    }
                    return constraintWidget.f2816e.f2887k;
                }
                return constraintWidget.f2816e.f2879h;
            }
            return constraintWidget.f2814d.f2880i;
        }
        return constraintWidget.f2814d.f2879h;
    }

    public static DependencyNode i(ConstraintAnchor constraintAnchor, int i10) {
        WidgetRun widgetRun;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f2803f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f2801d;
        if (i10 == 0) {
            widgetRun = constraintWidget.f2814d;
        } else {
            widgetRun = constraintWidget.f2816e;
        }
        int i11 = a.f2883a[constraintAnchor2.f2802e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.f2880i;
        }
        return widgetRun.f2879h;
    }

    public final void c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i10, androidx.constraintlayout.core.widgets.analyzer.a aVar) {
        dependencyNode.f2871l.add(dependencyNode2);
        dependencyNode.f2871l.add(this.f2876e);
        dependencyNode.f2867h = i10;
        dependencyNode.f2868i = aVar;
        dependencyNode2.f2870k.add(dependencyNode);
        aVar.f2870k.add(dependencyNode);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        int max;
        if (i11 == 0) {
            ConstraintWidget constraintWidget = this.f2874b;
            int i12 = constraintWidget.f2852w;
            max = Math.max(constraintWidget.f2850v, i10);
            if (i12 > 0) {
                max = Math.min(i12, i10);
            }
            if (max == i10) {
                return i10;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f2874b;
            int i13 = constraintWidget2.f2855z;
            max = Math.max(constraintWidget2.f2854y, i10);
            if (i13 > 0) {
                max = Math.min(i13, i10);
            }
            if (max == i10) {
                return i10;
            }
        }
        return max;
    }

    public long j() {
        androidx.constraintlayout.core.widgets.analyzer.a aVar = this.f2876e;
        if (aVar.f2869j) {
            return aVar.f2866g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
        if (r10.f2873a == 3) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(androidx.constraintlayout.core.widgets.ConstraintAnchor r13, androidx.constraintlayout.core.widgets.ConstraintAnchor r14, int r15) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.WidgetRun.l(androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int):void");
    }

    @Override // d0.d
    public void a(d0.d dVar) {
    }
}
