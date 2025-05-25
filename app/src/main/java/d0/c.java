package d0;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ChainRun.java */
/* loaded from: classes.dex */
public final class c extends WidgetRun {

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<WidgetRun> f16017k;

    /* renamed from: l  reason: collision with root package name */
    public int f16018l;

    public c(int i10, ConstraintWidget constraintWidget) {
        super(constraintWidget);
        ConstraintWidget constraintWidget2;
        WidgetRun widgetRun;
        boolean z10;
        int i11;
        WidgetRun widgetRun2;
        this.f16017k = new ArrayList<>();
        this.f2877f = i10;
        ConstraintWidget constraintWidget3 = this.f2874b;
        ConstraintWidget q5 = constraintWidget3.q(i10);
        while (true) {
            constraintWidget2 = constraintWidget3;
            constraintWidget3 = q5;
            if (constraintWidget3 == null) {
                break;
            }
            q5 = constraintWidget3.q(this.f2877f);
        }
        this.f2874b = constraintWidget2;
        int i12 = this.f2877f;
        if (i12 == 0) {
            widgetRun = constraintWidget2.f2814d;
        } else if (i12 == 1) {
            widgetRun = constraintWidget2.f2816e;
        } else {
            widgetRun = null;
        }
        ArrayList<WidgetRun> arrayList = this.f16017k;
        arrayList.add(widgetRun);
        ConstraintWidget p10 = constraintWidget2.p(this.f2877f);
        while (p10 != null) {
            int i13 = this.f2877f;
            if (i13 == 0) {
                widgetRun2 = p10.f2814d;
            } else if (i13 == 1) {
                widgetRun2 = p10.f2816e;
            } else {
                widgetRun2 = null;
            }
            arrayList.add(widgetRun2);
            p10 = p10.p(this.f2877f);
        }
        Iterator<WidgetRun> it = arrayList.iterator();
        while (it.hasNext()) {
            WidgetRun next = it.next();
            int i14 = this.f2877f;
            if (i14 == 0) {
                next.f2874b.f2811b = this;
            } else if (i14 == 1) {
                next.f2874b.c = this;
            }
        }
        if (this.f2877f == 0 && ((androidx.constraintlayout.core.widgets.d) this.f2874b.W).B0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && arrayList.size() > 1) {
            this.f2874b = ((WidgetRun) androidx.appcompat.view.menu.d.b(arrayList, 1)).f2874b;
        }
        if (this.f2877f == 0) {
            i11 = this.f2874b.f2835n0;
        } else {
            i11 = this.f2874b.f2837o0;
        }
        this.f16018l = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:271:0x03b1, code lost:
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, d0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(d0.d r27) {
        /*
            Method dump skipped, instructions count: 976
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.c.a(d0.d):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ArrayList<WidgetRun> arrayList = this.f16017k;
        Iterator<WidgetRun> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = arrayList.get(0).f2874b;
        ConstraintWidget constraintWidget2 = arrayList.get(size - 1).f2874b;
        int i10 = this.f2877f;
        DependencyNode dependencyNode = this.f2880i;
        DependencyNode dependencyNode2 = this.f2879h;
        if (i10 == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.K;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.M;
            DependencyNode i11 = WidgetRun.i(constraintAnchor, 0);
            int e10 = constraintAnchor.e();
            ConstraintWidget m10 = m();
            if (m10 != null) {
                e10 = m10.K.e();
            }
            if (i11 != null) {
                WidgetRun.b(dependencyNode2, i11, e10);
            }
            DependencyNode i12 = WidgetRun.i(constraintAnchor2, 0);
            int e11 = constraintAnchor2.e();
            ConstraintWidget n10 = n();
            if (n10 != null) {
                e11 = n10.M.e();
            }
            if (i12 != null) {
                WidgetRun.b(dependencyNode, i12, -e11);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.L;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.N;
            DependencyNode i13 = WidgetRun.i(constraintAnchor3, 1);
            int e12 = constraintAnchor3.e();
            ConstraintWidget m11 = m();
            if (m11 != null) {
                e12 = m11.L.e();
            }
            if (i13 != null) {
                WidgetRun.b(dependencyNode2, i13, e12);
            }
            DependencyNode i14 = WidgetRun.i(constraintAnchor4, 1);
            int e13 = constraintAnchor4.e();
            ConstraintWidget n11 = n();
            if (n11 != null) {
                e13 = n11.N.e();
            }
            if (i14 != null) {
                WidgetRun.b(dependencyNode, i14, -e13);
            }
        }
        dependencyNode2.f2861a = this;
        dependencyNode.f2861a = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        int i10 = 0;
        while (true) {
            ArrayList<WidgetRun> arrayList = this.f16017k;
            if (i10 < arrayList.size()) {
                arrayList.get(i10).e();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.c = null;
        Iterator<WidgetRun> it = this.f16017k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final long j() {
        ArrayList<WidgetRun> arrayList = this.f16017k;
        int size = arrayList.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            WidgetRun widgetRun = arrayList.get(i10);
            j10 = widgetRun.f2880i.f2865f + widgetRun.j() + j10 + widgetRun.f2879h.f2865f;
        }
        return j10;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        ArrayList<WidgetRun> arrayList = this.f16017k;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!arrayList.get(i10).k()) {
                return false;
            }
        }
        return true;
    }

    public final ConstraintWidget m() {
        int i10 = 0;
        while (true) {
            ArrayList<WidgetRun> arrayList = this.f16017k;
            if (i10 < arrayList.size()) {
                ConstraintWidget constraintWidget = arrayList.get(i10).f2874b;
                if (constraintWidget.f2827j0 != 8) {
                    return constraintWidget;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final ConstraintWidget n() {
        ArrayList<WidgetRun> arrayList = this.f16017k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ConstraintWidget constraintWidget = arrayList.get(size).f2874b;
            if (constraintWidget.f2827j0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        if (this.f2877f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb2.append(str);
        Iterator<WidgetRun> it = this.f16017k.iterator();
        while (it.hasNext()) {
            sb2.append("<");
            sb2.append(it.next());
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
