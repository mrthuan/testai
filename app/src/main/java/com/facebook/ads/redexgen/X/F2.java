package com.facebook.ads.redexgen.X;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;

/* loaded from: assets/audience_network.dex */
public class F2 implements Runnable {
    public static String[] A02 = {"x1ImPPPTYQz955", "lS7Iq3mlhvp0NAoRRVHA8Oz5HQvhl3iY", StandardStructureTypes.WP, "d92B", "5RRWdgCxNSFTqcCfS84JRr0EKxmlldxS", "ey8EnIzWKuMibGIPcoL68MAWlf1vFZl7", "obfMwY5lf3G4LNEo9oJdTQQoEgEvrjKt", "oJ"};
    public final /* synthetic */ F6 A00;
    public final /* synthetic */ F9 A01;

    public F2(F6 f62, F9 f92) {
        this.A00 = f62;
        this.A01 = f92;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A01.ADI(this.A00.A00, this.A00.A01);
        } catch (Throwable th2) {
            String[] strArr = A02;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "irnzGaE0pC1AeQFnqDAUM03C1zRYWmmH";
            strArr2[4] = "FybO5yP9NPMGTQGFbzlQjGz2anjCZr15";
            KQ.A00(th2, this);
        }
    }
}
