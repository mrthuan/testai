package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* renamed from: com.inmobi.media.v2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1835v2 {
    public static final Pair a(TreeMap treeMap) {
        if (treeMap.isEmpty()) {
            EmptyList emptyList = EmptyList.INSTANCE;
            return new Pair(emptyList, emptyList);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C1758p2 c1758p2 = new C1758p2();
        for (Map.Entry entry : treeMap.entrySet()) {
            String str = (String) entry.getKey();
            long a10 = c1758p2.a(str, ((Config) entry.getValue()).getAccountId$media_release());
            arrayList.add(str);
            arrayList2.add(Long.valueOf(a10));
        }
        return new Pair(arrayList, arrayList2);
    }
}
