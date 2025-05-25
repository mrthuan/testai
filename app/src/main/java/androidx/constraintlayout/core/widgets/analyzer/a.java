package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import java.util.Iterator;

/* compiled from: DimensionDependency.java */
/* loaded from: classes.dex */
public class a extends DependencyNode {

    /* renamed from: m  reason: collision with root package name */
    public int f2884m;

    public a(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof c) {
            this.f2864e = DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.f2864e = DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
    public final void d(int i10) {
        if (this.f2869j) {
            return;
        }
        this.f2869j = true;
        this.f2866g = i10;
        Iterator it = this.f2870k.iterator();
        while (it.hasNext()) {
            d0.d dVar = (d0.d) it.next();
            dVar.a(dVar);
        }
    }
}
