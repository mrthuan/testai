package l3;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeData.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f20467a;

    /* renamed from: b  reason: collision with root package name */
    public PointF f20468b;
    public boolean c;

    public g(PointF pointF, boolean z10, List<j3.a> list) {
        this.f20468b = pointF;
        this.c = z10;
        this.f20467a = new ArrayList(list);
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f20467a.size() + "closed=" + this.c + '}';
    }

    public g() {
        this.f20467a = new ArrayList();
    }
}
