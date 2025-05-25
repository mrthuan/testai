package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.cV  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1474cV extends KY {
    public final /* synthetic */ C1473cU A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C1474cV(C1473cU c1473cU, Map map, Map map2) {
        this.A00 = c1473cU;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        C1461cI c1461cI;
        C1314Zs c1314Zs;
        C1461cI c1461cI2;
        c1461cI = this.A00.A01;
        if (!TextUtils.isEmpty(c1461cI.A6r())) {
            HashMap hashMap = new HashMap();
            Map<String, String> extraData = this.A02;
            hashMap.putAll(extraData);
            Map<String, String> extraData2 = this.A01;
            hashMap.putAll(extraData2);
            c1314Zs = this.A00.A0A;
            J7 A09 = c1314Zs.A09();
            c1461cI2 = this.A00.A01;
            A09.AAU(c1461cI2.A6r(), hashMap);
        }
    }
}
