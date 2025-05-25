package com.facebook.ads.redexgen.X;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class XE implements InterfaceC0808Ft {
    public static byte[] A04;
    public static String[] A05 = {"cgQiINiiVsu26aPZ9Pgp8V4pQLBJh1", "STqVvaQvfsIBxOWUdRx7t9fX4dhB6WaE", "l10Uc2sObXQrfE5LSRWaITwRG6VP7m3G", "Li97firq2k3yJwXt43iS9teS3vokxfgN", "lEAcrUgQN40rK9SSjAwJ22cZB26GWfbz", "JzhYJjhyCfpGQZW0XGEf9gVBtclqQrE4", "eZRWN9ebZjj6lHeH8Be", "xK8S8Vs0X7"};
    public final int A00;
    public final List<XF> A01;
    public final long[] A02;
    public final long[] A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{Field.SECTION};
    }

    static {
        A01();
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0016 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public XE(java.util.List<com.facebook.ads.redexgen.X.XF> r8) {
        /*
            r7 = this;
            r7.<init>()
            r7.A01 = r8
            int r0 = r8.size()
            r7.A00 = r0
            int r0 = r7.A00
            int r0 = r0 * 2
            long[] r0 = new long[r0]
            r7.A02 = r0
            r6 = 0
        L14:
            int r0 = r7.A00
            if (r6 >= r0) goto L31
            java.lang.Object r5 = r8.get(r6)
            com.facebook.ads.redexgen.X.XF r5 = (com.facebook.ads.redexgen.X.XF) r5
            int r4 = r6 * 2
            long[] r2 = r7.A02
            long r0 = r5.A01
            r2[r4] = r0
            long[] r3 = r7.A02
            int r2 = r4 + 1
            long r0 = r5.A00
            r3[r2] = r0
            int r6 = r6 + 1
            goto L14
        L31:
            long[] r1 = r7.A02
            long[] r0 = r7.A02
            int r0 = r0.length
            long[] r0 = java.util.Arrays.copyOf(r1, r0)
            r7.A03 = r0
            long[] r0 = r7.A03
            java.util.Arrays.sort(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.XE.<init>(java.util.List):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0808Ft
    public final List<C0807Fs> A6x(long j10) {
        ArrayList arrayList = null;
        XF xf2 = null;
        SpannableStringBuilder spannableStringBuilder = null;
        int i10 = 0;
        while (true) {
            int i11 = this.A00;
            if (A05[7].length() == 14) {
                throw new RuntimeException();
            }
            A05[4] = "jlPWqnSdxT0Usk6otqcOvu4ShZWMKlZ7";
            if (i10 < i11) {
                if (this.A02[i10 * 2] <= j10 && j10 < this.A02[(i10 * 2) + 1]) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    XF xf3 = this.A01.get(i10);
                    if (xf3.A00()) {
                        if (xf2 == null) {
                            xf2 = xf3;
                        } else {
                            String A00 = A00(0, 1, 115);
                            if (spannableStringBuilder == null) {
                                spannableStringBuilder = new SpannableStringBuilder();
                                spannableStringBuilder.append(xf2.A0C).append((CharSequence) A00).append(xf3.A0C);
                            } else {
                                spannableStringBuilder.append((CharSequence) A00).append(xf3.A0C);
                            }
                        }
                    } else {
                        arrayList.add(xf3);
                    }
                }
                i10++;
            } else {
                if (spannableStringBuilder != null) {
                    arrayList.add(new XF(spannableStringBuilder));
                } else if (xf2 != null) {
                    arrayList.add(xf2);
                }
                if (arrayList != null) {
                    return arrayList;
                }
                return Collections.emptyList();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0808Ft
    public final long A7O(int i10) {
        boolean z10 = true;
        AbstractC0844Hf.A03(i10 >= 0);
        if (i10 >= this.A03.length) {
            z10 = false;
        }
        AbstractC0844Hf.A03(z10);
        return this.A03[i10];
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0808Ft
    public final int A7P() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0808Ft
    public final int A7r(long j10) {
        int A0A = IK.A0A(this.A03, j10, false, false);
        int index = this.A03.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
