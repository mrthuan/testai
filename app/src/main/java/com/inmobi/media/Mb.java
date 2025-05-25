package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Mb implements B8 {

    /* renamed from: a  reason: collision with root package name */
    public final Pb f14499a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f14500b;

    public Mb(Pb networkRequest, LinkedHashSet inMobiUnifiedIdInterfaceSet) {
        kotlin.jvm.internal.g.e(networkRequest, "networkRequest");
        kotlin.jvm.internal.g.e(inMobiUnifiedIdInterfaceSet, "inMobiUnifiedIdInterfaceSet");
        this.f14499a = networkRequest;
        this.f14500b = inMobiUnifiedIdInterfaceSet;
    }

    public final void a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        synchronized (Lb.class) {
            if (this.f14499a.B.get()) {
                return;
            }
            Lb.a();
            N4.b(Nb.a(jSONObject, N4.b()));
            JSONObject a10 = Nb.a(N4.b());
            for (InMobiUnifiedIdInterface inMobiUnifiedIdInterface : this.f14500b) {
                if (a10 == null) {
                    Nb.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT));
                } else {
                    Nb.a(inMobiUnifiedIdInterface, a10, null);
                }
            }
            this.f14500b.clear();
            tf.d dVar = tf.d.f30009a;
        }
    }

    public final void a(D8 d82) {
        EnumC1849w3 enumC1849w3;
        EnumC1849w3 enumC1849w32;
        synchronized (Lb.class) {
            if (d82 != null) {
                try {
                    enumC1849w3 = d82.f14201a;
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                enumC1849w3 = null;
            }
            Objects.toString(enumC1849w3);
            Objects.toString(d82 != null ? d82.f14201a : null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (d82 != null && (enumC1849w32 = d82.f14201a) != null) {
                linkedHashMap.put("errorCode", enumC1849w32);
            }
            C1616eb c1616eb = C1616eb.f15034a;
            C1616eb.b("UnifiedIdNetworkResponseFailure", linkedHashMap, EnumC1686jb.f15238a);
            if (this.f14499a.B.get()) {
                return;
            }
            Lb.a();
            a();
            tf.d dVar = tf.d.f30009a;
        }
    }

    public final void a() {
        JSONObject a10 = Nb.a(N4.b());
        try {
            if (a10 != null) {
                try {
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                if (a10.has("ufids") && a10.getJSONArray("ufids").length() > 0) {
                    for (InMobiUnifiedIdInterface inMobiUnifiedIdInterface : this.f14500b) {
                        Nb.a(inMobiUnifiedIdInterface, a10, null);
                    }
                }
            }
            for (InMobiUnifiedIdInterface inMobiUnifiedIdInterface2 : this.f14500b) {
                Nb.a(inMobiUnifiedIdInterface2, null, new Error(InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT));
            }
        } finally {
            this.f14500b.clear();
        }
    }
}
