package d0;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.tom_roush.fontbox.ttf.OpenTypeScript;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WidgetGroup.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: f  reason: collision with root package name */
    public static int f16029f;

    /* renamed from: b  reason: collision with root package name */
    public final int f16031b;
    public int c;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<ConstraintWidget> f16030a = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f16032d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f16033e = -1;

    /* compiled from: WidgetGroup.java */
    /* loaded from: classes.dex */
    public class a {
        public a(ConstraintWidget constraintWidget, androidx.constraintlayout.core.c cVar) {
            new WeakReference(constraintWidget);
            ConstraintAnchor constraintAnchor = constraintWidget.K;
            cVar.getClass();
            androidx.constraintlayout.core.c.n(constraintAnchor);
            androidx.constraintlayout.core.c.n(constraintWidget.L);
            androidx.constraintlayout.core.c.n(constraintWidget.M);
            androidx.constraintlayout.core.c.n(constraintWidget.N);
            androidx.constraintlayout.core.c.n(constraintWidget.O);
        }
    }

    public j(int i10) {
        this.f16031b = -1;
        int i11 = f16029f;
        f16029f = i11 + 1;
        this.f16031b = i11;
        this.c = i10;
    }

    public final void a(ArrayList<j> arrayList) {
        int size = this.f16030a.size();
        if (this.f16033e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                j jVar = arrayList.get(i10);
                if (this.f16033e == jVar.f16031b) {
                    c(this.c, jVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(androidx.constraintlayout.core.c cVar, int i10) {
        int n10;
        int n11;
        ArrayList<ConstraintWidget> arrayList = this.f16030a;
        if (arrayList.size() == 0) {
            return 0;
        }
        androidx.constraintlayout.core.widgets.d dVar = (androidx.constraintlayout.core.widgets.d) arrayList.get(0).W;
        cVar.t();
        dVar.e(cVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).e(cVar, false);
        }
        if (i10 == 0 && dVar.F0 > 0) {
            androidx.constraintlayout.core.widgets.b.a(dVar, cVar, arrayList, 0);
        }
        if (i10 == 1 && dVar.G0 > 0) {
            androidx.constraintlayout.core.widgets.b.a(dVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f16032d = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f16032d.add(new a(arrayList.get(i12), cVar));
        }
        if (i10 == 0) {
            n10 = androidx.constraintlayout.core.c.n(dVar.K);
            n11 = androidx.constraintlayout.core.c.n(dVar.M);
            cVar.t();
        } else {
            n10 = androidx.constraintlayout.core.c.n(dVar.L);
            n11 = androidx.constraintlayout.core.c.n(dVar.N);
            cVar.t();
        }
        return n11 - n10;
    }

    public final void c(int i10, j jVar) {
        Iterator<ConstraintWidget> it = this.f16030a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            int i11 = jVar.f16031b;
            if (hasNext) {
                ConstraintWidget next = it.next();
                ArrayList<ConstraintWidget> arrayList = jVar.f16030a;
                if (!arrayList.contains(next)) {
                    arrayList.add(next);
                }
                if (i10 == 0) {
                    next.f2849u0 = i11;
                } else {
                    next.f2851v0 = i11;
                }
            } else {
                this.f16033e = i11;
                return;
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.c;
        if (i10 == 0) {
            str = "Horizontal";
        } else if (i10 == 1) {
            str = "Vertical";
        } else if (i10 == 2) {
            str = PDTableAttributeObject.SCOPE_BOTH;
        } else {
            str = OpenTypeScript.UNKNOWN;
        }
        sb2.append(str);
        sb2.append(" [");
        String g10 = a6.h.g(sb2, this.f16031b, "] <");
        Iterator<ConstraintWidget> it = this.f16030a.iterator();
        while (it.hasNext()) {
            StringBuilder g11 = a0.d.g(g10, " ");
            g11.append(it.next().f2831l0);
            g10 = g11.toString();
        }
        return a6.h.c(g10, " >");
    }
}
