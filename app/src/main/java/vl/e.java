package vl;

import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import vl.b;

/* compiled from: ScanMediaManager.java */
/* loaded from: classes3.dex */
public final class e implements b.a {

    /* renamed from: b  reason: collision with root package name */
    public static b.a f30849b;
    public static e c;

    /* renamed from: a  reason: collision with root package name */
    public b f30850a;

    static {
        ea.a.p("HGNQbjRlU2k7TStuFGcNcg==", "irRAZlR2");
    }

    @Override // vl.b.a
    public final void a(TreeMap<String, List<ul.b>> treeMap) {
        Object valueOf;
        ea.a.p("VWkmaQFoFWRocBRlFGIlb09zNyA5aFl0GyA=", "me3Hrpzy");
        if (treeMap == null) {
            valueOf = ea.a.p("IXVdbA==", "biCsk2xF");
        } else {
            valueOf = Integer.valueOf(treeMap.size());
        }
        Objects.toString(valueOf);
        this.f30850a = null;
        b.a aVar = f30849b;
        if (aVar != null && treeMap != null) {
            aVar.a(treeMap);
        }
    }

    @Override // vl.b.a
    public final void b(int i10) {
        b.a aVar = f30849b;
        if (aVar != null) {
            aVar.b(i10);
        }
    }

    @Override // vl.b.a
    public final void c() {
        b.a aVar = f30849b;
        if (aVar != null) {
            aVar.c();
        }
    }
}
