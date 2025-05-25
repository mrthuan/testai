package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Pair;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class K9 {
    public static byte[] A07;
    public static String[] A08 = {"gkSyaXwR", "2VU3Nz3voiV1lmdRee4U2QJOpqB0EmXx", "l2PJ1mhNLKomP6h8XAPCJTvwOfm7DNfm", "U14uMoZpedA5MoqMp8wF", "ZGFJtzG5houIZuhA5wVIi53yZAjLLlX2", "TKuU0S0TRmpOZ7a0gUh222TH0KiJMCsX", "Ntgwe7QRVjptK5Vt0gMbvLxTukJluaCr", "4nIPbhAhAn1Dg8Q4wgXTfE5Yoh5xfpBP"};
    public static final M6 A09;
    public static final Executor A0A;
    public static final AtomicReference<KD> A0B;
    public long A00;
    public K8 A01;
    public Map<String, String> A02;
    public final C2S A03;
    public final C1314Zs A04;
    public final KA A05;
    public final String A06;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 57);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{112, 115, -101, 113, 106, -101, -97, 106, -32, -15, -17, -21, -19, -25, -16, -19, -23, -14, -8, 3, -10, -23, -11, -7, -23, -9, -8, 3, -19, -24, -126, -84, Field.AUTOTEXTLIST, -117, -121, 115, Field.AUTOTEXTLIST, -62, -61, -108, -70, -67, -64, -64, -108, -26, -39, -41, -39, -35, -22, -39, -40, -39, -6, -85, -47, -12, -9, -9, -85, -16, -3, -3, -6, -3, -85, -18, -6, -17, -16, -85, -26, -80, -2, -24, -85, -80, -2, -33, -35, -26, -35, -22, -31, -37, -57, -66, -51, -48, -56, -53, -60, 10, 11, -30, 5, 8, 8, -28, 11, 11, 7, -35, -33, -36, -29, -42, -47, -46};
    }

    static {
        A0A();
        A09 = new M6();
        A0A = Executors.newCachedThreadPool(A09);
        A0B = new AtomicReference<>();
    }

    public K9(C1314Zs c1314Zs) {
        this(c1314Zs, C2T.A00(c1314Zs.A01()));
    }

    public K9(C1314Zs c1314Zs, C2S c2s) {
        this.A00 = -1L;
        this.A04 = c1314Zs;
        this.A05 = KA.A00();
        this.A06 = KE.A01(c1314Zs);
        this.A03 = c2s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1218Vx A02(long j10, K6 k62) {
        return new C1218Vx(this, k62, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        if (this.A04 == null || !S8.A0A(this.A04)) {
            return;
        }
        C8F c8f = new C8F(A05(8, 5, 102));
        c8f.A05(1);
        this.A04.A07().AA0(A05(86, 7, 32), C8E.A1x, c8f);
    }

    private void A0B(int i10, String str) {
        String A05 = A05(37, 16, 59);
        String A052 = A05(0, 8, 1);
        String A053 = A05(93, 10, 99);
        AbstractC0907Ju.A05(A053, A05, A052);
        AbstractC0907Ju.A04(A053, String.format(Locale.US, A05(53, 26, 82), Integer.valueOf(i10), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(C0894Jg c0894Jg) {
        if (this.A01 != null) {
            this.A01.ABs(c0894Jg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C0894Jg c0894Jg) {
        ExecutorC0959Lx.A00(new C1216Vv(this, c0894Jg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(Vu vu) {
        if (this.A01 != null) {
            this.A01.ADj(vu);
        } else if (vu.A00() == null || vu.A00().A06() == null) {
        } else {
            C0920Kh.A00(this.A04).A0D(vu.A00().A06().toString(), vu.A00().A0B());
        }
    }

    private void A0L(Vu vu) {
        InterfaceC06187p syncModule;
        ExecutorC0959Lx.A00(new C1217Vw(this, vu));
        if (C0877Im.A2R(this.A04) && (syncModule = this.A04.A05()) != null) {
            syncModule.A68();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(String str, long j10, K6 k62) {
        String str2;
        try {
            try {
                KC A06 = this.A05.A06(this.A04, str, j10);
                C8W A00 = A06.A00();
                if (A00 != null) {
                    C0877Im.A0T(this.A04).A2t(A00.A0A());
                    if (C0877Im.A0u(this.A04) && A00.A08() != null) {
                        AbstractC06318g.A04(this.A04.A01(), A00.A08());
                    }
                    if (C0877Im.A0v(this.A04) && A00.A0D() != null) {
                        AbstractC06318g.A05(this.A04.A01(), A00.A0D());
                    }
                    this.A04.A07().AAl();
                    this.A03.A0N(A00.A07());
                    K5.A05(A00.A05().A0B(), k62);
                    MH.A01(this.A04, A0A, A00);
                    C8F c8f = new C8F(A05(30, 7, 0) + LQ.A02());
                    c8f.A06(1);
                    c8f.A0A(false);
                    this.A04.A07().AAa(A05(79, 7, 63), C8E.A1W, c8f);
                }
                switch (A06.A01()) {
                    case A02:
                        Vu vu = (Vu) A06;
                        if (A00 != null) {
                            if (A00.A05().A0E()) {
                                K5.A07(str, k62);
                            }
                            if (this.A02 != null) {
                                str2 = this.A02.get(A05(13, 17, 107));
                            } else {
                                str2 = null;
                            }
                            if (!TextUtils.isEmpty(A06.A02()) && !TextUtils.isEmpty(str2)) {
                                this.A04.A02().AFp(this.A04, str2, A06.A02());
                            }
                        }
                        this.A04.A0E().A3I(C0956Lu.A01(this.A00));
                        A0L(vu);
                        return;
                    case A03:
                        C1215Vt c1215Vt = (C1215Vt) A06;
                        String A04 = c1215Vt.A04();
                        AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c1215Vt.A03(), AdErrorType.ERROR_MESSAGE);
                        A0B(c1215Vt.A03(), A04);
                        if (A04 == null) {
                            A04 = str;
                        }
                        this.A04.A0E().A3H(C0956Lu.A01(this.A00), adErrorTypeFromCode.getErrorCode(), A04, adErrorTypeFromCode.isPublicError());
                        A0D(C0894Jg.A01(adErrorTypeFromCode, A04));
                        return;
                    default:
                        AdErrorType adErrorType = AdErrorType.UNKNOWN_RESPONSE;
                        this.A04.A0E().A3H(C0956Lu.A01(this.A00), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                        A0D(C0894Jg.A01(adErrorType, str));
                        return;
                }
            } catch (Exception e10) {
                e = e10;
                String message = e.getMessage();
                AdErrorType adErrorType2 = AdErrorType.PARSER_FAILURE;
                this.A04.A0E().A3H(C0956Lu.A01(this.A00), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
                A0D(C0894Jg.A01(adErrorType2, message));
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(String str, long j10, K6 k62) {
        A0A.execute(new C1219Vy(this, str, j10, k62));
    }

    private boolean A0O(K6 k62) {
        String adPlacementType = k62.A06().toString();
        if (C0920Kh.A00(this.A04).A0F(adPlacementType)) {
            return false;
        }
        int A0A2 = C0920Kh.A00(this.A04).A0A(adPlacementType);
        int storedAdsCount = C0877Im.A0H(this.A04);
        int A092 = C0920Kh.A00(this.A04).A09(adPlacementType);
        if (A0A2 >= storedAdsCount || A0A2 > A092) {
            C0920Kh A00 = C0920Kh.A00(this.A04);
            String type = k62.A06().toString();
            Pair<String, String> A0B2 = A00.A0B(type);
            if (A0B2 != null) {
                Object obj = A0B2.second;
                String[] strArr = A08;
                String str = strArr[1];
                String str2 = strArr[4];
                int storedAdsCount2 = str.charAt(27);
                if (storedAdsCount2 == str2.charAt(27)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[5] = "wxWvHA1chxzz72CPhzVDSI5kTKVxH7gh";
                strArr2[2] = "qa9WwGn6xu1bvFfukLGFlV7cMdAOaohF";
                if (obj != null && A0B2.first != null) {
                    A0N(A0B2.second.toString(), 0L, k62);
                    return true;
                }
            }
        }
        return false;
    }

    public final void A0P(K6 k62) {
        this.A00 = System.currentTimeMillis();
        C8N.A0B(this.A04);
        A0B.get();
        if (0 != 0) {
            throw new NullPointerException(A05(103, 7, 52));
        }
        if (C0877Im.A02(this.A04) > 0 && A0O(k62)) {
            return;
        }
        if (K5.A08(k62)) {
            M8.A06.execute(new W0(this));
            String A02 = K5.A02(k62);
            if (A02 != null) {
                this.A04.A0E().AHL();
                A0N(A02, 0L, k62);
                return;
            }
            AdErrorType error = AdErrorType.LOAD_TOO_FREQUENTLY;
            this.A04.A0E().A3H(C0956Lu.A01(this.A00), error.getErrorCode(), error.getDefaultErrorMessage(), error.isPublicError());
            A0D(C0894Jg.A01(error, null));
            return;
        }
        A0A.execute(new C1220Vz(this, k62));
    }

    public final void A0Q(K8 k82) {
        this.A01 = k82;
    }
}
