package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class DependencyNode implements d0.d {

    /* renamed from: d  reason: collision with root package name */
    public final WidgetRun f2863d;

    /* renamed from: f  reason: collision with root package name */
    public int f2865f;

    /* renamed from: g  reason: collision with root package name */
    public int f2866g;

    /* renamed from: a  reason: collision with root package name */
    public WidgetRun f2861a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2862b = false;
    public boolean c = false;

    /* renamed from: e  reason: collision with root package name */
    public Type f2864e = Type.UNKNOWN;

    /* renamed from: h  reason: collision with root package name */
    public int f2867h = 1;

    /* renamed from: i  reason: collision with root package name */
    public a f2868i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2869j = false;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f2870k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f2871l = new ArrayList();

    /* loaded from: classes.dex */
    public enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.f2863d = widgetRun;
    }

    @Override // d0.d
    public final void a(d0.d dVar) {
        ArrayList arrayList = this.f2871l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((DependencyNode) it.next()).f2869j) {
                return;
            }
        }
        this.c = true;
        WidgetRun widgetRun = this.f2861a;
        if (widgetRun != null) {
            widgetRun.a(this);
        }
        if (this.f2862b) {
            this.f2863d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        DependencyNode dependencyNode = null;
        int i10 = 0;
        while (it2.hasNext()) {
            DependencyNode dependencyNode2 = (DependencyNode) it2.next();
            if (!(dependencyNode2 instanceof a)) {
                i10++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i10 == 1 && dependencyNode.f2869j) {
            a aVar = this.f2868i;
            if (aVar != null) {
                if (aVar.f2869j) {
                    this.f2865f = this.f2867h * aVar.f2866g;
                } else {
                    return;
                }
            }
            d(dependencyNode.f2866g + this.f2865f);
        }
        WidgetRun widgetRun2 = this.f2861a;
        if (widgetRun2 != null) {
            widgetRun2.a(this);
        }
    }

    public final void b(d0.d dVar) {
        this.f2870k.add(dVar);
        if (this.f2869j) {
            dVar.a(dVar);
        }
    }

    public final void c() {
        this.f2871l.clear();
        this.f2870k.clear();
        this.f2869j = false;
        this.f2866g = 0;
        this.c = false;
        this.f2862b = false;
    }

    public void d(int i10) {
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

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2863d.f2874b.f2831l0);
        sb2.append(":");
        sb2.append(this.f2864e);
        sb2.append("(");
        if (this.f2869j) {
            obj = Integer.valueOf(this.f2866g);
        } else {
            obj = "unresolved";
        }
        sb2.append(obj);
        sb2.append(") <t=");
        sb2.append(this.f2871l.size());
        sb2.append(":d=");
        sb2.append(this.f2870k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
