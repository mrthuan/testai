package androidx.work;

import androidx.work.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import o2.f;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends f {
    @Override // o2.f
    public final b a(ArrayList arrayList) {
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((b) it.next()).f4910a));
        }
        aVar.a(hashMap);
        b bVar = new b(aVar.f4911a);
        b.c(bVar);
        return bVar;
    }
}
