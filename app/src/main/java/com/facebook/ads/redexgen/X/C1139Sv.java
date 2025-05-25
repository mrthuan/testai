package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Sv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1139Sv extends AbstractC06488x<C9O> {
    public static String[] A01 = {"Etf6rxr38TN0vQCp7eNtUvsDOmNclbJq", "tsAjjvZCMDWdS", "8hGTWRVePtIxVw2NOXuq9knVHvw3DPvW", "EWxkCjZIostDvyF", "5rZAWcCWfjjM2", "LrhlSMt3F2A2PPkpDiBfjHpLA", "jQk7ZNmPb7V9ueUuvUfiKmSE", "mvg7pIDRu6IgLugvRarlC3XDTGoYv5EO"};
    public final /* synthetic */ C9S A00;

    public C1139Sv(C9S c9s) {
        this.A00 = c9s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC06488x
    /* renamed from: A00 */
    public final void A03(C9O c9o) {
        T7 t72;
        T7 t73;
        int A00 = c9o.A00();
        int currentPositionMS = this.A00.A00;
        if (currentPositionMS > 0) {
            t72 = this.A00.A0C;
            int currentPositionMS2 = t72.getDuration();
            if (A00 == currentPositionMS2) {
                t73 = this.A00.A0C;
                int duration = t73.getDuration();
                int currentPositionMS3 = this.A00.A00;
                if (duration > currentPositionMS3) {
                    return;
                }
            }
        }
        C9S c9s = this.A00;
        if (A01[5].length() == 7) {
            throw new RuntimeException();
        }
        A01[5] = "7AA42mFgyTVlZSuOszNfTs49";
        c9s.A0j(A00);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06488x
    public final Class<C9O> A01() {
        return C9O.class;
    }
}
