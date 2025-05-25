package com.facebook.ads.redexgen.X;

import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.cn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1492cn implements InterfaceC04420k {
    public final /* synthetic */ C1314Zs A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C1492cn(JSONObject jSONObject, C1314Zs c1314Zs, String str) {
        this.A02 = jSONObject;
        this.A00 = c1314Zs;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04420k
    public final String A6r() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04420k
    public final Collection<String> A7B() {
        return AbstractC04430l.A03(this.A00, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04420k
    public final EnumC04410j A7c() {
        return AbstractC04430l.A00(this.A02);
    }
}
