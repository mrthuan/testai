package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.5E  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5E {
    public static byte[] A02;
    public static String[] A03 = {"TTkBeT", "dgqPpyxawDBTokVKz6usds7DGGljbLlG", "Om", "1", "lOfLhIubd0jJyTpTkNltmpZf14oHCLV9", "yX0qRkYxaN2cv8t3SuJSwpxSeia", "n9D4XHOOTGgVdLWa6Wuko3wZCERnKgc", "NKR9b6EIrIhl49GaATLNKeLdYiLud"};
    public final C1391bA<AnonymousClass56, C5C> A00 = new C1391bA<>();
    public final C05012s<AnonymousClass56> A01 = new C05012s<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 13);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {78, 118, 112, 119, Field.QUOTE, 115, 113, 108, 117, 106, 103, 102, Field.QUOTE, 101, 111, 98, 100, Field.QUOTE, Field.FORMDROPDOWN, Field.ADDIN, Field.FORMTEXT, Field.QUOTE, 108, 113, Field.QUOTE, Field.FORMDROPDOWN, 76, 80, Field.CONTROL};
        if (A03[1].charAt(27) != 'j') {
            throw new RuntimeException();
        }
        A03[0] = "DMTuNl";
        A02 = bArr;
    }

    static {
        A02();
    }

    private C05434j A00(AnonymousClass56 anonymousClass56, int i10) {
        C5C A0B;
        C05434j info;
        int A08 = this.A00.A08(anonymousClass56);
        if (A08 >= 0 && (A0B = this.A00.A0B(A08)) != null) {
            int i11 = A0B.A00;
            if (A03[2].length() != 2) {
                throw new RuntimeException();
            }
            A03[2] = "6x";
            if ((i11 & i10) != 0) {
                int index = i10 ^ (-1);
                A0B.A00 &= index;
                if (i10 == 4) {
                    info = A0B.A02;
                } else if (i10 == 8) {
                    info = A0B.A01;
                } else {
                    throw new IllegalArgumentException(A01(0, 29, 14));
                }
                int index2 = A0B.A00;
                if ((index2 & 12) == 0) {
                    this.A00.A0A(A08);
                    C5C.A02(A0B);
                }
                return info;
            }
        }
        return null;
    }

    public final C05434j A03(AnonymousClass56 anonymousClass56) {
        return A00(anonymousClass56, 8);
    }

    public final C05434j A04(AnonymousClass56 anonymousClass56) {
        return A00(anonymousClass56, 4);
    }

    public final AnonymousClass56 A05(long j10) {
        return this.A01.A08(j10);
    }

    public final void A06() {
        this.A00.clear();
        this.A01.A09();
    }

    public final void A07() {
        C5C.A01();
    }

    public final void A08(long j10, AnonymousClass56 anonymousClass56) {
        this.A01.A0B(j10, anonymousClass56);
    }

    public final void A09(AnonymousClass56 anonymousClass56) {
        C5C c5c = this.A00.get(anonymousClass56);
        if (c5c == null) {
            c5c = C5C.A00();
            this.A00.put(anonymousClass56, c5c);
        }
        c5c.A00 |= 1;
    }

    public final void A0A(AnonymousClass56 anonymousClass56) {
        C5C c5c = this.A00.get(anonymousClass56);
        if (c5c == null) {
            return;
        }
        c5c.A00 &= -2;
    }

    public final void A0B(AnonymousClass56 anonymousClass56) {
        int A06 = this.A01.A06() - 1;
        while (true) {
            if (A06 < 0) {
                break;
            } else if (anonymousClass56 == this.A01.A07(A06)) {
                this.A01.A0A(A06);
                break;
            } else {
                A06--;
            }
        }
        C5C info = this.A00.remove(anonymousClass56);
        if (info != null) {
            C5C.A02(info);
        }
    }

    public final void A0C(AnonymousClass56 anonymousClass56) {
        A0A(anonymousClass56);
    }

    public final void A0D(AnonymousClass56 anonymousClass56, C05434j c05434j) {
        C5C c5c = this.A00.get(anonymousClass56);
        if (c5c == null) {
            c5c = C5C.A00();
            this.A00.put(anonymousClass56, c5c);
        }
        c5c.A00 |= 2;
        c5c.A02 = c05434j;
    }

    public final void A0E(AnonymousClass56 anonymousClass56, C05434j c05434j) {
        C5C c5c = this.A00.get(anonymousClass56);
        if (c5c == null) {
            c5c = C5C.A00();
            this.A00.put(anonymousClass56, c5c);
        }
        c5c.A01 = c05434j;
        c5c.A00 |= 8;
    }

    public final void A0F(AnonymousClass56 anonymousClass56, C05434j c05434j) {
        C5C c5c = this.A00.get(anonymousClass56);
        if (c5c == null) {
            c5c = C5C.A00();
            this.A00.put(anonymousClass56, c5c);
        }
        c5c.A02 = c05434j;
        c5c.A00 |= 4;
    }

    public final void A0G(C5D c5d) {
        for (int size = this.A00.size() - 1; size >= 0; size--) {
            AnonymousClass56 A09 = this.A00.A09(size);
            C5C A0A = this.A00.A0A(size);
            if ((A0A.A00 & 3) == 3) {
                c5d.AHG(A09);
            } else {
                int index = A0A.A00;
                if ((index & 1) != 0) {
                    if (A0A.A02 == null) {
                        c5d.AHG(A09);
                    } else {
                        c5d.AEe(A09, A0A.A02, A0A.A01);
                    }
                } else if ((A0A.A00 & 14) == 14) {
                    c5d.AEc(A09, A0A.A02, A0A.A01);
                } else if ((A0A.A00 & 12) == 12) {
                    c5d.AEg(A09, A0A.A02, A0A.A01);
                } else {
                    int index2 = A0A.A00;
                    if ((index2 & 4) != 0) {
                        c5d.AEe(A09, A0A.A02, null);
                    } else {
                        int index3 = A0A.A00;
                        if ((index3 & 8) != 0) {
                            C05434j c05434j = A0A.A02;
                            if (A03[4].charAt(6) == 'y') {
                                throw new RuntimeException();
                            }
                            A03[7] = "pRTOxDzzIVV0VuKMKqyuKOShfW9n8";
                            c5d.AEc(A09, c05434j, A0A.A01);
                        } else {
                            continue;
                        }
                    }
                }
            }
            C5C.A02(A0A);
        }
    }

    public final boolean A0H(AnonymousClass56 anonymousClass56) {
        C5C record = this.A00.get(anonymousClass56);
        return (record == null || (record.A00 & 1) == 0) ? false : true;
    }

    public final boolean A0I(AnonymousClass56 anonymousClass56) {
        C5C record = this.A00.get(anonymousClass56);
        return (record == null || (record.A00 & 4) == 0) ? false : true;
    }
}
