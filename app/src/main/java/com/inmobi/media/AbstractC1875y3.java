package com.inmobi.media;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.inmobi.media.y3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1875y3 extends AbstractC1860x1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1875y3(String tableName, String tableSchema) {
        super(tableName, tableSchema);
        kotlin.jvm.internal.g.e(tableName, "tableName");
        kotlin.jvm.internal.g.e(tableSchema, "tableSchema");
    }

    public final void a(List eventIdList) {
        kotlin.jvm.internal.g.e(eventIdList, "eventIdList");
        if (eventIdList.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int size = eventIdList.size() - 1;
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(eventIdList.get(i10));
            sb2.append(",");
        }
        sb2.append(eventIdList.get(eventIdList.size() - 1));
        a("id IN (" + ((Object) sb2) + ')', null);
    }

    public final ArrayList b(int i10) {
        ArrayList<AbstractC1873y1> a10 = AbstractC1860x1.a(this, null, null, null, null, "ts ASC", Integer.valueOf(i10), 15);
        ArrayList arrayList = new ArrayList();
        for (AbstractC1873y1 abstractC1873y1 : a10) {
            if (abstractC1873y1 != null) {
                arrayList.add(abstractC1873y1);
            }
        }
        return arrayList;
    }

    public final void a(long j10) {
        Context d10 = Ha.d();
        if (d10 != null) {
            ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
            AbstractC1838v5.a(d10, "batch_processing_info").a(androidx.activity.r.g(new StringBuilder(), this.f15618a, "_last_batch_process"), j10);
        }
    }

    public final void a(int i10) {
        ArrayList<AbstractC1873y1> a10 = AbstractC1860x1.a(this, null, null, null, null, "ts ASC", Integer.valueOf(i10), 15);
        ArrayList arrayList = new ArrayList();
        for (AbstractC1873y1 abstractC1873y1 : a10) {
            arrayList.add(abstractC1873y1 != null ? Integer.valueOf(abstractC1873y1.c) : null);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num != null) {
                arrayList2.add(num);
            }
        }
        a((List) arrayList2);
    }
}
