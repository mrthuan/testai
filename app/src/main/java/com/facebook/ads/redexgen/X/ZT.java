package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.bridge.fbsdk.FBLoginASID;
import com.facebook.ads.internal.bridge.gms.AdvertisingId;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ZT implements InterfaceC06177o {
    public static byte[] A01;
    public final C7j A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 57);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-20, 25, 15, 29, 26, 20, 15};
    }

    public ZT(C7j c7j) {
        this.A00 = c7j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06177o
    public final String A6c() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06177o
    public final String A7R() {
        return KE.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06177o
    public final String A7S() {
        return FBLoginASID.getFBLoginASID();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06177o
    public final String A7n() {
        return AdInternalSettings.getMediationService();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06177o
    public final String A7t() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06177o
    public final C7n A8D() {
        AdvertisingId advertisingIdInfoDirectly = AdvertisingId.getAdvertisingIdInfoDirectly(this.A00);
        if (advertisingIdInfoDirectly == null) {
            return null;
        }
        return new ZU(this, advertisingIdInfoDirectly);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06177o
    public final String A8d() {
        return AdInternalSettings.getUrlPrefix();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06177o
    public final String A8f() {
        return A00(0, 7, 114);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06177o
    public final String A8g() {
        return BuildConfigApi.getVersionName(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06177o
    public final boolean A9O() {
        return BuildConfigApi.isDebug();
    }
}
