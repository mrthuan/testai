package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.4k  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC05444k {
    public static byte[] A06;
    public static String[] A07 = {"7", "BOchn05cOqPQPKgaZhD7MWqYHqoCKx7o", "EPTevQXo6AzOyuxFlfcAvx5eJdnVP8", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "6fNY9lNhy7nUhuOGP7YDUX6WqdzgNzMN", "SLjIMlZrt8LApw5SyAUFDc4ipDag7tTu", "zXvx6U5xIRhnU3fWG5rnYTWUnq20aSrc", "c4GOdlXhzm3270NA43EFNLoVECdVoF38"};
    public InterfaceC05424i A04 = null;
    public ArrayList<RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> A05 = new ArrayList<>();
    public long A00 = 120;
    public long A03 = 120;
    public long A02 = 250;
    public long A01 = 250;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = (byte) ((copyOfRange[i13] - i12) - 109);
            String[] strArr = A07;
            if (strArr[6].charAt(25) == strArr[5].charAt(25)) {
                throw new RuntimeException();
            }
            A07[2] = "awpTB9u15TkHVvPjjOCd09Fy8dol99E";
            copyOfRange[i13] = b10;
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{76, Field.MERGESEQ, 30, Field.MERGESEQ, Field.FORMTEXT, 74, Field.USERADDRESS, Field.ADDIN, Field.FORMTEXT, 76, Field.MERGESEQ, 80, Field.QUOTE, Field.FORMTEXT, Field.MERGESEQ, Field.FORMTEXT, 80, Field.FILESIZE, Field.SECTIONPAGES, Field.SECTION};
    }

    public abstract boolean A0D(AnonymousClass56 anonymousClass56);

    public abstract boolean A0E(AnonymousClass56 anonymousClass56, C05434j c05434j, C05434j c05434j2);

    public abstract boolean A0F(AnonymousClass56 anonymousClass56, C05434j c05434j, C05434j c05434j2);

    public abstract boolean A0G(AnonymousClass56 anonymousClass56, C05434j c05434j, C05434j c05434j2);

    public abstract boolean A0H(AnonymousClass56 anonymousClass56, AnonymousClass56 anonymousClass562, C05434j c05434j, C05434j c05434j2);

    public abstract void A0I();

    public abstract void A0J();

    public abstract void A0K(AnonymousClass56 anonymousClass56);

    public abstract boolean A0L();

    static {
        A03();
    }

    public static int A00(AnonymousClass56 anonymousClass56) {
        int i10;
        i10 = anonymousClass56.A0C;
        int i11 = i10 & 14;
        if (anonymousClass56.A0Z()) {
            return 4;
        }
        int flags = i11 & 4;
        if (flags == 0) {
            int pos = anonymousClass56.A0J();
            int oldPos = anonymousClass56.A0G();
            if (pos != -1 && oldPos != -1 && pos != oldPos) {
                return i11 | 2048;
            }
            return i11;
        }
        return i11;
    }

    private final C05434j A01() {
        return new C05434j();
    }

    public final long A04() {
        return this.A00;
    }

    public final long A05() {
        return this.A01;
    }

    public final long A06() {
        return this.A02;
    }

    public final long A07() {
        return this.A03;
    }

    public final C05434j A08(AnonymousClass53 anonymousClass53, AnonymousClass56 anonymousClass56) {
        return A01().A01(anonymousClass56);
    }

    public final C05434j A09(AnonymousClass53 anonymousClass53, AnonymousClass56 anonymousClass56, int i10, List<Object> payloads) {
        return A01().A01(anonymousClass56);
    }

    public final void A0A() {
        int count = this.A05.size();
        if (0 < count) {
            this.A05.get(0);
            throw new NullPointerException(A02(0, 20, 112));
        } else {
            this.A05.clear();
        }
    }

    public final void A0B(InterfaceC05424i interfaceC05424i) {
        this.A04 = interfaceC05424i;
    }

    public final void A0C(AnonymousClass56 anonymousClass56) {
        if (this.A04 != null) {
            this.A04.AB9(anonymousClass56);
        }
    }

    public boolean A0M(AnonymousClass56 anonymousClass56, List<Object> payloads) {
        return A0D(anonymousClass56);
    }
}
