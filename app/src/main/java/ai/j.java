package ai;

import java.util.Comparator;

/* compiled from: ViewContainer.java */
/* loaded from: classes3.dex */
public final class j implements Comparator<e> {
    @Override // java.util.Comparator
    public final int compare(e eVar, e eVar2) {
        if (eVar.a() <= eVar2.b()) {
            return -1;
        }
        return 1;
    }
}
