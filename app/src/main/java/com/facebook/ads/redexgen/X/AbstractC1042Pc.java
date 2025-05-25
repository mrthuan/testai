package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Pc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1042Pc {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C1041Pb>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C1041Pb>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C1041Pb A01(C1314Zs c1314Zs, AbstractC1456cD abstractC1456cD, int i10, PZ pz) {
        C1041Pb c1041Pb = new C1041Pb(c1314Zs, abstractC1456cD, c1314Zs.A01().A09(), i10);
        c1041Pb.A0b(pz);
        c1041Pb.A0X();
        A01.put(abstractC1456cD.A0l(), new WeakReference<>(c1041Pb));
        return c1041Pb;
    }

    public static C1041Pb A02(String str) {
        WeakReference<C1041Pb> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC1456cD abstractC1456cD, C1041Pb c1041Pb) {
        A01.put(abstractC1456cD.A0l(), new WeakReference<>(c1041Pb));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
