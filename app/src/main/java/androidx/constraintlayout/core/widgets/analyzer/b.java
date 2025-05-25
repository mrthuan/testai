package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: HelperReferences.java */
/* loaded from: classes.dex */
public final class b extends WidgetRun {
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, d0.d
    public final void a(d0.d dVar) {
        androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) this.f2874b;
        int i10 = aVar.f2859y0;
        DependencyNode dependencyNode = this.f2879h;
        Iterator it = dependencyNode.f2871l.iterator();
        int i11 = 0;
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = ((DependencyNode) it.next()).f2866g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (i10 != 0 && i10 != 2) {
            dependencyNode.d(i11 + aVar.A0);
        } else {
            dependencyNode.d(i12 + aVar.A0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget = this.f2874b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            DependencyNode dependencyNode = this.f2879h;
            dependencyNode.f2862b = true;
            androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) constraintWidget;
            int i10 = aVar.f2859y0;
            boolean z10 = aVar.f2860z0;
            ArrayList arrayList = dependencyNode.f2871l;
            int i11 = 0;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            dependencyNode.f2864e = DependencyNode.Type.BOTTOM;
                            while (i11 < aVar.f5503x0) {
                                ConstraintWidget constraintWidget2 = aVar.f5502w0[i11];
                                if (z10 || constraintWidget2.f2827j0 != 8) {
                                    DependencyNode dependencyNode2 = constraintWidget2.f2816e.f2880i;
                                    dependencyNode2.f2870k.add(dependencyNode);
                                    arrayList.add(dependencyNode2);
                                }
                                i11++;
                            }
                            m(this.f2874b.f2816e.f2879h);
                            m(this.f2874b.f2816e.f2880i);
                            return;
                        }
                        return;
                    }
                    dependencyNode.f2864e = DependencyNode.Type.TOP;
                    while (i11 < aVar.f5503x0) {
                        ConstraintWidget constraintWidget3 = aVar.f5502w0[i11];
                        if (z10 || constraintWidget3.f2827j0 != 8) {
                            DependencyNode dependencyNode3 = constraintWidget3.f2816e.f2879h;
                            dependencyNode3.f2870k.add(dependencyNode);
                            arrayList.add(dependencyNode3);
                        }
                        i11++;
                    }
                    m(this.f2874b.f2816e.f2879h);
                    m(this.f2874b.f2816e.f2880i);
                    return;
                }
                dependencyNode.f2864e = DependencyNode.Type.RIGHT;
                while (i11 < aVar.f5503x0) {
                    ConstraintWidget constraintWidget4 = aVar.f5502w0[i11];
                    if (z10 || constraintWidget4.f2827j0 != 8) {
                        DependencyNode dependencyNode4 = constraintWidget4.f2814d.f2880i;
                        dependencyNode4.f2870k.add(dependencyNode);
                        arrayList.add(dependencyNode4);
                    }
                    i11++;
                }
                m(this.f2874b.f2814d.f2879h);
                m(this.f2874b.f2814d.f2880i);
                return;
            }
            dependencyNode.f2864e = DependencyNode.Type.LEFT;
            while (i11 < aVar.f5503x0) {
                ConstraintWidget constraintWidget5 = aVar.f5502w0[i11];
                if (z10 || constraintWidget5.f2827j0 != 8) {
                    DependencyNode dependencyNode5 = constraintWidget5.f2814d.f2879h;
                    dependencyNode5.f2870k.add(dependencyNode);
                    arrayList.add(dependencyNode5);
                }
                i11++;
            }
            m(this.f2874b.f2814d.f2879h);
            m(this.f2874b.f2814d.f2880i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        ConstraintWidget constraintWidget = this.f2874b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            int i10 = ((androidx.constraintlayout.core.widgets.a) constraintWidget).f2859y0;
            DependencyNode dependencyNode = this.f2879h;
            if (i10 != 0 && i10 != 1) {
                constraintWidget.f2813c0 = dependencyNode.f2866g;
            } else {
                constraintWidget.f2812b0 = dependencyNode.f2866g;
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.c = null;
        this.f2879h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        return false;
    }

    public final void m(DependencyNode dependencyNode) {
        DependencyNode dependencyNode2 = this.f2879h;
        dependencyNode2.f2870k.add(dependencyNode);
        dependencyNode.f2871l.add(dependencyNode2);
    }
}
