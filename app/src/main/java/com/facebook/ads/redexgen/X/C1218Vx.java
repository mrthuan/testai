package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Vx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1218Vx implements InterfaceC1109Rr {
    public static byte[] A03;
    public static String[] A04 = {"vUQacvUb1jgaOB1nXCILUaEr4ItZ5QEs", "N", "ozPzI", "iemFS7qx3ItQSdDQeBrvuJ9y9CMkfIqY", "EwROMxnfRd6F7268i4EpvPtVg3hQf", "a", "qVu8", "3RxrE6NsEsLt8TXu"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ K6 A01;
    public final /* synthetic */ K9 A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{82, Field.CONTROL, 4, 82, 0, 80, 80, 4, 60, Field.USERADDRESS, Field.SYMBOL, 61, 105, Field.BARCODE, 111, Field.USERADDRESS, 44, Field.AUTONUMLGL, 41, Field.DATA, Field.QUOTE, 30, 5, 3, 22, 18, 15, 9, 8, Field.BIDIOUTLINE, Field.FORMTEXT, 78, 120, 111, 107, 120, 111, 61, 120, 111, 111, 114, 111, 61, 114, 126, 126, 104, 111, 111, 120, 121, 124, 74, Field.ADDRESSBLOCK, Field.AUTOTEXTLIST, 74, Field.ADDRESSBLOCK, 15, Field.ADDRESSBLOCK, 74, Field.SHAPE, Field.INCLUDEPICTURE, Field.FORMTEXT, 74, Field.MERGESEQ, 15, Field.BIDIOUTLINE, Field.LISTNUM, 76, 76, 74, Field.BIDIOUTLINE, Field.BIDIOUTLINE, Field.TOA, Field.LISTNUM, Field.INCLUDEPICTURE, Field.INCLUDEPICTURE, 86, Field.BARCODE, Field.USERADDRESS, 19, Field.BARCODE, 61, 32, 60, Field.AUTONUMLGL, 36, Field.AUTONUMLGL, 16, 17, 58, 13, 13, 16, 13};
    }

    static {
        A01();
    }

    public C1218Vx(K9 k92, K6 k62, long j10) {
        this.A02 = k92;
        this.A01 = k62;
        this.A00 = j10;
    }

    private final void A02(S3 s32) {
        C1314Zs c1314Zs;
        long j10;
        C1314Zs c1314Zs2;
        long j11;
        KA ka2;
        C1314Zs c1314Zs3;
        C1314Zs c1314Zs4;
        long j12;
        K5.A06(this.A01);
        try {
            InterfaceC1107Rp response = s32.A00();
            if (response != null) {
                String A6X = response.A6X();
                ka2 = this.A02.A05;
                c1314Zs3 = this.A02.A04;
                KC serverResponse = ka2.A06(c1314Zs3, A6X, this.A00);
                if (serverResponse.A01() == KB.A03) {
                    C1215Vt c1215Vt = (C1215Vt) serverResponse;
                    String A042 = c1215Vt.A04();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c1215Vt.A03(), AdErrorType.ERROR_MESSAGE);
                    if (A042 != null) {
                        A6X = A042;
                    }
                    c1314Zs4 = this.A02.A04;
                    C0S A0E = c1314Zs4.A0E();
                    j12 = this.A02.A00;
                    A0E.A3H(C0956Lu.A01(j12), adErrorTypeFromCode.getErrorCode(), A6X, adErrorTypeFromCode.isPublicError());
                    this.A02.A0D(C0894Jg.A01(adErrorTypeFromCode, A6X));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String message = s32.getMessage();
            c1314Zs2 = this.A02.A04;
            C0S A0E2 = c1314Zs2.A0E();
            j11 = this.A02.A00;
            long A01 = C0956Lu.A01(j11);
            int errorCode = adErrorType.getErrorCode();
            boolean isPublicError = adErrorType.isPublicError();
            if (A04[2].length() == 29) {
                throw new RuntimeException();
            }
            A04[4] = "NZ18w";
            A0E2.A3H(A01, errorCode, message, isPublicError);
            this.A02.A0D(C0894Jg.A01(adErrorType, message));
        } catch (JSONException e10) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String errorMessage = s32.getMessage();
            c1314Zs = this.A02.A04;
            C0S A0E3 = c1314Zs.A0E();
            j10 = this.A02.A00;
            A0E3.A3H(C0956Lu.A01(j10), adErrorType2.getErrorCode(), A00(16, 15, 30) + e10.getMessage(), adErrorType2.isPublicError());
            this.A02.A0D(C0894Jg.A01(adErrorType2, errorMessage));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1109Rr
    public final void ABa(InterfaceC1107Rp interfaceC1107Rp) {
        C1314Zs c1314Zs;
        C1314Zs c1314Zs2;
        AbstractC0907Ju.A05(A00(79, 10, 40), A00(52, 27, 87), A00(0, 8, 30));
        if (interfaceC1107Rp != null) {
            String A6X = interfaceC1107Rp.A6X();
            c1314Zs = this.A02.A04;
            int A02 = C0877Im.A02(c1314Zs);
            String[] strArr = A04;
            String str = strArr[5];
            String response = strArr[1];
            if (str.length() != response.length()) {
                throw new RuntimeException();
            }
            A04[2] = "kblvpkFa8oUK1ItVGqcsW93nH";
            if (A02 > 0) {
                c1314Zs2 = this.A02.A04;
                C0920Kh.A00(c1314Zs2).A0C(A6X);
            }
            K5.A06(this.A01);
            this.A02.A0N(A6X, this.A00, this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1109Rr
    public final void ABt(Exception exc) {
        C1314Zs c1314Zs;
        long j10;
        AbstractC0907Ju.A05(A00(89, 7, 7), A00(31, 21, 101), A00(8, 8, 114));
        if (S3.class.equals(exc.getClass())) {
            A02((S3) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String errorMessage = exc.getMessage();
        c1314Zs = this.A02.A04;
        C0S A0E = c1314Zs.A0E();
        j10 = this.A02.A00;
        A0E.A3H(C0956Lu.A01(j10), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A02.A0D(C0894Jg.A01(adErrorType, errorMessage));
    }
}
