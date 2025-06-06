package com.iab.omid.library.inmobi.processor;

import android.view.View;
import com.iab.omid.library.inmobi.processor.a;
import com.iab.omid.library.inmobi.utils.e;
import com.iab.omid.library.inmobi.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a f13982a;

    public c(a aVar) {
        this.f13982a = aVar;
    }

    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.inmobi.internal.c c = com.iab.omid.library.inmobi.internal.c.c();
        if (c != null) {
            Collection<com.iab.omid.library.inmobi.adsession.a> a10 = c.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((a10.size() * 2) + 3);
            for (com.iab.omid.library.inmobi.adsession.a aVar : a10) {
                View c10 = aVar.c();
                if (c10 != null && h.e(c10) && (rootView = c10.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float c11 = h.c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.c(arrayList.get(size - 1)) > c11) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.inmobi.processor.a
    public JSONObject a(View view) {
        JSONObject a10 = com.iab.omid.library.inmobi.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.inmobi.utils.c.a(a10, e.a());
        return a10;
    }

    @Override // com.iab.omid.library.inmobi.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0183a interfaceC0183a, boolean z10, boolean z11) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0183a.a(it.next(), this.f13982a, jSONObject, z11);
        }
    }
}
