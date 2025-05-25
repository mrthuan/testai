package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.Jg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0894Jg {
    public final AdErrorType A00;
    public final String A01;

    public C0894Jg(int i10, String str) {
        this(AdErrorType.adErrorTypeFromCode(i10), str);
    }

    public C0894Jg(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C0894Jg A00(AdErrorType adErrorType) {
        return new C0894Jg(adErrorType, (String) null);
    }

    public static C0894Jg A01(AdErrorType adErrorType, String str) {
        return new C0894Jg(adErrorType, str);
    }

    public static C0894Jg A02(C0895Jh c0895Jh) {
        return new C0894Jg(c0895Jh.A00(), c0895Jh.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
