package d0;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;

/* compiled from: RunGroup.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final WidgetRun f16027a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<WidgetRun> f16028b = new ArrayList<>();

    public i(WidgetRun widgetRun) {
        this.f16027a = null;
        this.f16027a = widgetRun;
    }

    public static long a(DependencyNode dependencyNode, long j10) {
        WidgetRun widgetRun = dependencyNode.f2863d;
        if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.b) {
            return j10;
        }
        ArrayList arrayList = dependencyNode.f2870k;
        int size = arrayList.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.f2863d != widgetRun) {
                    j11 = Math.min(j11, a(dependencyNode2, dependencyNode2.f2865f + j10));
                }
            }
        }
        if (dependencyNode == widgetRun.f2880i) {
            long j12 = widgetRun.j();
            DependencyNode dependencyNode3 = widgetRun.f2879h;
            long j13 = j10 - j12;
            return Math.min(Math.min(j11, a(dependencyNode3, j13)), j13 - dependencyNode3.f2865f);
        }
        return j11;
    }

    public static long b(DependencyNode dependencyNode, long j10) {
        WidgetRun widgetRun = dependencyNode.f2863d;
        if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.b) {
            return j10;
        }
        ArrayList arrayList = dependencyNode.f2870k;
        int size = arrayList.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.f2863d != widgetRun) {
                    j11 = Math.max(j11, b(dependencyNode2, dependencyNode2.f2865f + j10));
                }
            }
        }
        if (dependencyNode == widgetRun.f2879h) {
            long j12 = widgetRun.j();
            DependencyNode dependencyNode3 = widgetRun.f2880i;
            long j13 = j10 + j12;
            return Math.max(Math.max(j11, b(dependencyNode3, j13)), j13 - dependencyNode3.f2865f);
        }
        return j11;
    }
}
