package com.inmobi.media;

import android.util.Base64;
import java.util.BitSet;

/* loaded from: classes2.dex */
public final class E1 {

    /* renamed from: a  reason: collision with root package name */
    public BitSet f14211a;

    public final void a(String b64String) {
        byte[] bArr;
        BitSet bitSet;
        kotlin.jvm.internal.g.e(b64String, "b64String");
        try {
            bArr = Base64.decode(b64String, 0);
        } catch (Exception e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
            bArr = null;
        }
        if (bArr != null) {
            if (C1566b3.f14952a.x()) {
                bitSet = BitSet.valueOf(bArr);
            } else {
                BitSet bitSet2 = new BitSet(bArr.length * 8);
                int i10 = 0;
                for (byte b10 : bArr) {
                    int i11 = 0;
                    while (i11 < 8) {
                        boolean z10 = true;
                        int i12 = i10 + 1;
                        if (((b10 >> ((byte) i11)) & 1) != 1) {
                            z10 = false;
                        }
                        bitSet2.set(i10, z10);
                        i11++;
                        i10 = i12;
                    }
                }
                bitSet = bitSet2;
            }
            this.f14211a = bitSet;
        }
    }
}
