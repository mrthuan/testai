package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.x2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1861x2 {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f15619e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final H8 f15620a;

    /* renamed from: b  reason: collision with root package name */
    public final TreeMap f15621b;
    public final LinkedHashMap c;

    /* renamed from: d  reason: collision with root package name */
    public final C1771q2 f15622d;

    public C1861x2(C1822u2 networkRequest, H8 mNetworkResponse) {
        kotlin.jvm.internal.g.e(networkRequest, "networkRequest");
        kotlin.jvm.internal.g.e(mNetworkResponse, "mNetworkResponse");
        this.f15620a = mNetworkResponse;
        TreeMap treeMap = new TreeMap(networkRequest.f15487y);
        this.f15621b = treeMap;
        this.c = new LinkedHashMap();
        D8 d82 = mNetworkResponse.c;
        tf.d dVar = null;
        if (d82 != null) {
            for (Map.Entry entry : treeMap.entrySet()) {
                Object value = entry.getValue();
                kotlin.jvm.internal.g.d(value, "<get-value>(...)");
                C1848w2 c1848w2 = new C1848w2(null, (Config) value);
                c1848w2.c = new C1771q2((byte) 0, "Network error in fetching config.");
                LinkedHashMap linkedHashMap = this.c;
                Object key = entry.getKey();
                kotlin.jvm.internal.g.d(key, "<get-key>(...)");
                linkedHashMap.put(key, c1848w2);
            }
            this.f15622d = new C1771q2((byte) 0, d82.f14202b);
            Pair a10 = C1835v2.a(this.f15621b);
            LinkedHashMap B0 = kotlin.collections.q.B0(new Pair("errorCode", Integer.valueOf(d82.f14201a.f15576a)), new Pair(NamingTable.TAG, (List) a10.component1()), new Pair("lts", (List) a10.component2()), new Pair("networkType", C1566b3.q()));
            C1616eb c1616eb = C1616eb.f15034a;
            C1616eb.b("InvalidConfig", B0, EnumC1686jb.f15238a);
            dVar = tf.d.f30009a;
        }
        if (dVar == null) {
            try {
                JSONObject jSONObject = new JSONObject(this.f15620a.a());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    Config config = (Config) this.f15621b.get(next);
                    if (config != null) {
                        C1848w2 c1848w22 = new C1848w2(jSONObject2, config);
                        LinkedHashMap linkedHashMap2 = this.c;
                        kotlin.jvm.internal.g.b(next);
                        linkedHashMap2.put(next, c1848w22);
                    }
                }
                Pair a11 = C1835v2.a(this.f15621b);
                LinkedHashMap B02 = kotlin.collections.q.B0(new Pair(NamingTable.TAG, (List) a11.component1()), new Pair("lts", (List) a11.component2()));
                C1616eb c1616eb2 = C1616eb.f15034a;
                C1616eb.b("ConfigFetched", B02, EnumC1686jb.f15238a);
            } catch (JSONException e10) {
                String localizedMessage = e10.getLocalizedMessage();
                this.f15622d = new C1771q2((byte) 2, localizedMessage == null ? "Exception while parsing config" : localizedMessage);
                Pair a12 = C1835v2.a(this.f15621b);
                LinkedHashMap B03 = kotlin.collections.q.B0(new Pair("errorCode", (short) 1), new Pair(NamingTable.TAG, (List) a12.component1()), new Pair("lts", (List) a12.component2()), new Pair("networkType", C1566b3.q()));
                C1616eb c1616eb3 = C1616eb.f15034a;
                C1616eb.b("InvalidConfig", B03, EnumC1686jb.f15238a);
            }
        }
    }

    public final boolean a() {
        EnumC1849w3 enumC1849w3;
        EnumC1849w3 enumC1849w32;
        D8 d82 = this.f15620a.c;
        if (d82 != null) {
            enumC1849w3 = d82.f14201a;
        } else {
            enumC1849w3 = null;
        }
        if (enumC1849w3 != EnumC1849w3.f15558i) {
            if (d82 == null || (enumC1849w32 = d82.f14201a) == null) {
                enumC1849w32 = EnumC1849w3.f15554e;
            }
            int i10 = enumC1849w32.f15576a;
            if (500 > i10 || i10 >= 600) {
                return false;
            }
        }
        return true;
    }
}
