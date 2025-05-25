package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Fh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0798Fh extends AbstractC1437bu {
    public static byte[] A00;
    public static String[] A01 = {"5V5lzA70kRKZvNcqBnXwT00Z041t6ONl", "kRuh8LYE7MIIox", "vbi5lrus1TtIcXopJBSqGum5Kl452Sg0", "JcNQ6WafPgnmx1aBDePIhrwzaceROyrU", "60x4BO5hhvvMWgz", "65jgyaanPJJ2TdYJaJc79ygQBnrUrWFq", "zOX7nuTxFizV3LeqTcyyEc2wd", "PvIxiwPRiyIOar7lINjn4bFuW"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{42, Field.GLOSSARY, 107, 34, 56, 107, Field.PAGEREF, 36, Field.BARCODE, 107, Field.SYMBOL, Field.DDEAUTO, 42, Field.GLOSSARY, Field.GOTOBUTTON, 107, 36, Field.SYMBOL, 107, 42, Field.FILLIN, Field.SYMBOL, Field.DDEAUTO, 42, Field.GLOSSARY, Field.GOTOBUTTON, 107, Field.GLOSSARY, 34, 56, 59, Field.FILLIN, 42, Field.GOTOBUTTON, Field.DDEAUTO, Field.GLOSSARY, 20, 21, Field.NUMCHARS, 17, 9};
    }

    static {
        A03();
    }

    public C0798Fh(C1314Zs c1314Zs, C04761t c04761t) {
        super(c1314Zs, c04761t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(36, 5, 12), String.valueOf(System.currentTimeMillis() - j10));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(List<String> trackingUrls, Map<String, String> extraData) {
        if (trackingUrls != null) {
            boolean isEmpty = trackingUrls.isEmpty();
            if (A01[3].charAt(25) != 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "86KHDrV9NKgfIZAVdUdv4tP2w";
            strArr[7] = "hnWt117Y9rLxZfnYOmFuZ36IL";
            if (isEmpty) {
                return;
            }
            Iterator<String> it = trackingUrls.iterator();
            while (it.hasNext()) {
                new SA(this.A0B, extraData).execute(it.next());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1437bu
    public final void A0O() {
        C1473cU c1473cU = (C1473cU) this.A01;
        if (c1473cU.A0R()) {
            AbstractC04470q abstractC04470q = this.A07;
            if (A01[3].charAt(25) != 'c') {
                throw new RuntimeException();
            }
            A01[4] = "SmlVqZ";
            if (abstractC04470q != null) {
                this.A07.A0B(c1473cU);
                return;
            }
            return;
        }
        throw new IllegalStateException(A00(0, 36, 55));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1437bu
    public final void A0Q(InterfaceC04460p interfaceC04460p, C8W c8w, C8U c8u, C04771u c04771u) {
        C1473cU c1473cU = (C1473cU) interfaceC04460p;
        long currentTimeMillis = System.currentTimeMillis();
        C1434br c1434br = new C1434br(this, c04771u, c1473cU, currentTimeMillis, c8u);
        A0G().postDelayed(c1434br, c8w.A05().A05());
        c1473cU.A0L(this.A0B, new C1433bq(this, c1434br, currentTimeMillis, c8u), this.A09, c04771u, W7.A0K());
    }
}
