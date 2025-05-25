package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.aZ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1357aZ extends KL {
    public static String[] A02 = {"aYZ348mE1NYrFcMBoebQMkiZFG78oX5w", "qZgy2fVZKkcRQxGeLIPji8yDZzfZsU0K", "FW", "4WpWxoGmbDHaVYPSEbV5W", "JuvmjYnKk99PR9XqbJ5bpADbGT7vNhdJ", "90qKQYWe37jbHMTFJzGbdEUnuOp61wed", "dYksIGNGyyMeZtC5mrM4so", "pL5NnltKvH9DFuMzl1s9TskXUqu4u7R4"};
    public final /* synthetic */ C1353aV A00;
    public final /* synthetic */ C0894Jg A01;

    public C1357aZ(C1353aV c1353aV, C0894Jg c0894Jg) {
        this.A00 = c1353aV;
        this.A01 = c0894Jg;
    }

    @Override // com.facebook.ads.redexgen.X.KL
    public final void A01() {
        C5P c5p;
        C5P c5p2;
        C5P c5p3;
        c5p = this.A00.A01;
        if (c5p.A06() != null) {
            c5p2 = this.A00.A01;
            AdListener A06 = c5p2.A06();
            c5p3 = this.A00.A01;
            if (A02[2].length() != 2) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[3] = "zGBwvDJj20KV94Zd2N0fZ";
            strArr[6] = "5j2wCmqr0QfuHbPw5sx74i";
            A06.onError(c5p3.A07(), L8.A00(this.A01));
        }
    }
}
