package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.bs  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1435bs implements AnonymousClass10 {
    public static byte[] A02;
    public final /* synthetic */ C0799Fi A00;
    public final /* synthetic */ Runnable A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{Field.FILESIZE, 20, 78, 64, 19, Field.AUTOTEXT, 78, 18, 77, 104, 109, 124, 120, 105, 126, 44, 101, Byte.MAX_VALUE, 44, 98, 121, 96, 96, 44, 99, 98, 44, 96, 99, 109, 104, Field.FILESIZE, 98, 120, 105, 126, Byte.MAX_VALUE, 120, 101, 120, 101, 109, 96, 77, 104, 59, Field.NUMCHARS, 6, 23, 0, 1, 6, Field.NUMWORDS, 6, Field.NUMWORDS, 19, 30, 82, Field.NUMWORDS, 31, 2, 0, 23, 1, 1, Field.NUMWORDS, 29, Field.NUMCHARS, 82, 20, Field.NUMWORDS, 0, 23, 22, Field.BARCODE, 48, 1, Field.BARCODE, 61, 42, Field.IMPORT, Field.DATA, Field.IMPORT, 42, Field.FILLIN, 101, 106, 96, 118, 107, 109, 96, 42, 109, 106, 112, 97, 106, 112, 42, 101, 103, 112, 109, 107, 106, 42, 82, 77, Field.SECTION, Field.FORMDROPDOWN, 34, Field.MACROBUTTON, 42, 109, 108, Field.MERGESEQ, 108, 118, 103, 112, 113, 118, 107, 118, 107, 99, 110, 78, 109, 101, 101, 107, 108, 101, Field.MERGESEQ, 111, 114, 112, 103, 113, 113, 107, 109, 108};
    }

    public C1435bs(C0799Fi c0799Fi, Runnable runnable) {
        this.A00 = c0799Fi;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    public final void ACC(C1478cZ c1478cZ, String str, boolean z10) {
        this.A00.A07.A0C();
        boolean clickUrlDefined = !TextUtils.isEmpty(str);
        if (z10 && clickUrlDefined) {
            try {
                Intent intent = new Intent(A00(85, 26, 62));
                intent.setData(L5.A00(str));
                C0928Kq.A0C(this.A00.A0B, intent);
            } catch (C0926Ko e10) {
                Throwable cause = e10.getCause();
                Throwable th2 = e10;
                if (cause != null) {
                    th2 = e10.getCause();
                }
                this.A00.A0B.A07().AA0(A00(74, 11, 100), C8E.A04, new C8F(th2));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    public final void ACD(C1478cZ c1478cZ) {
        this.A00.A07.A04();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    public final void ACE(C1478cZ c1478cZ) {
        this.A00.A07.A05();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    public final void ACF(C1478cZ c1478cZ) {
        if (c1478cZ != this.A00.A00) {
            return;
        }
        if (c1478cZ == null) {
            this.A00.A0B.A07().AA0(A00(111, 3, 121), C8E.A0X, new C8F(A00(8, 37, 54)));
            ACG(c1478cZ, AdError.internalError(AdError.INTERNAL_ERROR_2004));
            return;
        }
        this.A00.A0G().removeCallbacks(this.A01);
        this.A00.A01 = c1478cZ;
        this.A00.A0K();
        this.A00.A07.A0F(c1478cZ);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    public final void ACG(C1478cZ c1478cZ, AdError adError) {
        if (c1478cZ != this.A00.A00) {
            return;
        }
        this.A00.A0G().removeCallbacks(this.A01);
        this.A00.A0P(c1478cZ);
        this.A00.A0B.A0E().A5F(adError.getErrorCode(), adError.getErrorMessage());
        this.A00.A07.A0G(new C0894Jg(adError.getErrorCode(), adError.getErrorMessage()));
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    public final void ACH(C1478cZ c1478cZ) {
        AbstractC0907Ju.A05(A00(114, 31, 56), A00(45, 29, 72), A00(0, 8, 77));
        this.A00.A07.A0D();
        this.A00.A0N();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    public final void ACI() {
        this.A00.A07.A08();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    public final void ACJ() {
        this.A00.A07.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    public final void ACK() {
        this.A00.A07.A07();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass10
    public final void onInterstitialActivityDestroyed() {
        this.A00.A07.A02();
    }
}
