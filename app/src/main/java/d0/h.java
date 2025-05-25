package d0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* compiled from: GuidelineReference.java */
/* loaded from: classes.dex */
public final class h extends WidgetRun {
    public h(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f2814d.f();
        constraintWidget.f2816e.f();
        this.f2877f = ((androidx.constraintlayout.core.widgets.f) constraintWidget).A0;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, d0.d
    public final void a(d dVar) {
        DependencyNode dependencyNode = this.f2879h;
        if (!dependencyNode.c || dependencyNode.f2869j) {
            return;
        }
        dependencyNode.d((int) ((((DependencyNode) dependencyNode.f2871l.get(0)).f2866g * ((androidx.constraintlayout.core.widgets.f) this.f2874b).f2934w0) + 0.5f));
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget = this.f2874b;
        androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
        int i10 = fVar.f2935x0;
        int i11 = fVar.f2936y0;
        int i12 = fVar.A0;
        DependencyNode dependencyNode = this.f2879h;
        if (i12 == 1) {
            if (i10 != -1) {
                dependencyNode.f2871l.add(constraintWidget.W.f2814d.f2879h);
                this.f2874b.W.f2814d.f2879h.f2870k.add(dependencyNode);
                dependencyNode.f2865f = i10;
            } else if (i11 != -1) {
                dependencyNode.f2871l.add(constraintWidget.W.f2814d.f2880i);
                this.f2874b.W.f2814d.f2880i.f2870k.add(dependencyNode);
                dependencyNode.f2865f = -i11;
            } else {
                dependencyNode.f2862b = true;
                dependencyNode.f2871l.add(constraintWidget.W.f2814d.f2880i);
                this.f2874b.W.f2814d.f2880i.f2870k.add(dependencyNode);
            }
            m(this.f2874b.f2814d.f2879h);
            m(this.f2874b.f2814d.f2880i);
            return;
        }
        if (i10 != -1) {
            dependencyNode.f2871l.add(constraintWidget.W.f2816e.f2879h);
            this.f2874b.W.f2816e.f2879h.f2870k.add(dependencyNode);
            dependencyNode.f2865f = i10;
        } else if (i11 != -1) {
            dependencyNode.f2871l.add(constraintWidget.W.f2816e.f2880i);
            this.f2874b.W.f2816e.f2880i.f2870k.add(dependencyNode);
            dependencyNode.f2865f = -i11;
        } else {
            dependencyNode.f2862b = true;
            dependencyNode.f2871l.add(constraintWidget.W.f2816e.f2880i);
            this.f2874b.W.f2816e.f2880i.f2870k.add(dependencyNode);
        }
        m(this.f2874b.f2816e.f2879h);
        m(this.f2874b.f2816e.f2880i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        ConstraintWidget constraintWidget = this.f2874b;
        int i10 = ((androidx.constraintlayout.core.widgets.f) constraintWidget).A0;
        DependencyNode dependencyNode = this.f2879h;
        if (i10 == 1) {
            constraintWidget.f2812b0 = dependencyNode.f2866g;
        } else {
            constraintWidget.f2813c0 = dependencyNode.f2866g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
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
