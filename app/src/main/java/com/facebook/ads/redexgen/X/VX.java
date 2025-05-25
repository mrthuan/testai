package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class VX extends AbstractC05534t {
    public static String[] A01 = {"LeWmJ2AEMrGR8tgfwsG9m8UwM76zwmUz", "6Bm", "ck2sw", "Oj1Ntvfg6dck0NxJmQASjzaKZXVqT4Sf", "CtYf7ZmPdO", "plI1JnuA", "RZR4g54lk6KTwqItkRA6ECctcTUw", "cGd5igXf7vOVCpmuGQi5cRxrBgQCM2pW"};
    public final /* synthetic */ C05263r A00;

    public VX(C05263r c05263r) {
        this.A00 = c05263r;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05534t
    public final void A0L(FL fl2, int i10) {
        int A23;
        MY my;
        super.A0L(fl2, i10);
        C1376at linearLayoutManager = this.A00.getLayoutManager();
        if (linearLayoutManager != null && (A23 = linearLayoutManager.A23()) >= 0) {
            C05263r c05263r = this.A00;
            int scrollPosition = A01[3].charAt(13);
            if (scrollPosition == 48) {
                throw new RuntimeException();
            }
            A01[5] = "JmqJ93Os7fwoNBdh";
            if (c05263r.getAdapter() == null || A23 >= this.A00.getAdapter().A0E() || (my = (MY) fl2.A1F(A23)) == null) {
                return;
            }
            my.AGH();
        }
    }
}
