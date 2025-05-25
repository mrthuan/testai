package com.inmobi.media;

import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.nb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1741nb extends Lambda implements cg.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1754ob f15352a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1741nb(C1754ob c1754ob) {
        super(1);
        this.f15352a = c1754ob;
    }

    @Override // cg.l
    public final Object invoke(Object obj) {
        Object obj2;
        I2 i22;
        Object obj3;
        Object obj4;
        H1 it = (H1) obj;
        kotlin.jvm.internal.g.e(it, "it");
        xc xcVar = null;
        H0 h02 = null;
        switch (it.f14310a) {
            case ShapeTypes.FLOW_CHART_EXTRACT /* 150 */:
                C1754ob c1754ob = this.f15352a;
                Map map = it.c;
                if (map != null) {
                    obj2 = map.get("data");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof I2) {
                    i22 = (I2) obj2;
                } else {
                    i22 = null;
                }
                c1754ob.a("CrashEventOccurred", i22);
                if (i22 != null && kotlin.jvm.internal.g.a(new JSONObject(i22.a()).optString(NamingTable.TAG, ""), "OutOfMemoryError")) {
                    StackTraceElement[] stackTraceElementArr = i22.f14339g;
                    if (stackTraceElementArr != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C1566b3 c1566b3 = C1566b3.f14952a;
                        linkedHashMap.put("manufacturer", c1566b3.l());
                        linkedHashMap.put("modelName", c1566b3.n());
                        linkedHashMap.put("osVersion", c1566b3.s());
                        Y2 a10 = c1566b3.a();
                        linkedHashMap.put("maxHeapSize", Long.valueOf(a10.f14870a));
                        linkedHashMap.put("freeHeapSize", Long.valueOf(a10.f14871b));
                        linkedHashMap.put("currentHeapSize", Long.valueOf(a10.c));
                        linkedHashMap.put("activeThreads", Integer.valueOf(Thread.activeCount()));
                        Set<Thread> keySet = Thread.getAllStackTraces().keySet();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj5 : keySet) {
                            String name = ((Thread) obj5).getName();
                            kotlin.jvm.internal.g.d(name, "getName(...)");
                            if (kotlin.text.k.O(name, "TIM-", false)) {
                                arrayList.add(obj5);
                            }
                        }
                        linkedHashMap.put("inmobiThreadCount", Integer.valueOf(arrayList.size()));
                        linkedHashMap.put("isSdkInvolved", Boolean.valueOf(Vb.b(stackTraceElementArr)));
                        C1616eb.b("OutOfMemoryEvent", linkedHashMap, EnumC1686jb.f15238a);
                        break;
                    } else {
                        kotlin.jvm.internal.g.i("stackTrace");
                        throw null;
                    }
                }
                break;
            case ShapeTypes.FLOW_CHART_MERGE /* 151 */:
                C1754ob c1754ob2 = this.f15352a;
                Map map2 = it.c;
                if (map2 != null) {
                    obj3 = map2.get("data");
                } else {
                    obj3 = null;
                }
                if (obj3 instanceof xc) {
                    xcVar = (xc) obj3;
                }
                c1754ob2.getClass();
                if (xcVar != null && Vb.a(xcVar) && !C1566b3.f14952a.E()) {
                    c1754ob2.a("MainThreadBlockedEvent", xcVar);
                    break;
                }
                break;
            case ShapeTypes.FLOW_CHART_OFFLINE_STORAGE /* 152 */:
                C1754ob c1754ob3 = this.f15352a;
                Map map3 = it.c;
                if (map3 != null) {
                    obj4 = map3.get("data");
                } else {
                    obj4 = null;
                }
                if (obj4 instanceof H0) {
                    h02 = (H0) obj4;
                }
                c1754ob3.a(h02);
                break;
        }
        return tf.d.f30009a;
    }
}
