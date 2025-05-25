package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* loaded from: classes2.dex */
public final class F {

    /* renamed from: a  reason: collision with root package name */
    public final H8 f14240a;

    /* renamed from: b  reason: collision with root package name */
    public final InMobiAdRequestStatus f14241b;

    public F(H8 mResponse) {
        int i10;
        String str;
        kotlin.jvm.internal.g.e(mResponse, "mResponse");
        this.f14240a = mResponse;
        D8 d82 = mResponse.c;
        if (d82 != null) {
            EnumC1849w3 enumC1849w3 = d82.f14201a;
            if (enumC1849w3 == null) {
                i10 = -1;
            } else {
                i10 = E.f14208a[enumC1849w3.ordinal()];
            }
            switch (i10) {
                case 1:
                    this.f14241b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
                    return;
                case 2:
                    InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID);
                    this.f14241b = inMobiAdRequestStatus;
                    D8 d83 = mResponse.c;
                    if (d83 != null) {
                        str = d83.f14202b;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        inMobiAdRequestStatus.setCustomMessage(str);
                        return;
                    }
                    return;
                case 3:
                    this.f14241b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT);
                    return;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    this.f14241b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.SERVER_ERROR);
                    return;
                case 9:
                    this.f14241b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED);
                    return;
                default:
                    this.f14241b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
                    return;
            }
        }
    }
}
