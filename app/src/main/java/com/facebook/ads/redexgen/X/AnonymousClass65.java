package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.65  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass65 {
    public static byte[] A07;
    public static String[] A08 = {"AnF1hfDBxlCdLbiDFLPUuTr8rEIYbsCs", "DcTEZsyKQaFycdRSUI2qHgy2Whp5epDQ", "oumPRRvCFD06iOY6OIziseOiJT3r0Y1F", "T68w1lZpg2aHhxWtuqshCv95QbfqOWN4", "NXTzrqYb1pzocIC4FPaomVlkuxRd4v50", "22ngLnp9x9FhYwfhJQ2wIkSm", "Bx3CPZoq94eNKBlojUhsqxvx", "nU7JTpeEhpBFqPr5yRkbJ9HjbOYUZCS7"};
    public final Handler A00;
    public final AnonymousClass64 A01;
    public final C05906f A02;
    public final String A03;
    public final String A04;
    public final JSONObject A05;
    public final boolean A06;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 61);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{14, 32, 32, 18, 33, 32, -85, -82, -79, -86, -37, -33, -45, -39, -41, -61, -74, -79, -78, -68};
    }

    static {
        A07();
    }

    public AnonymousClass65(C05906f c05906f, JSONObject jSONObject, String str, String str2, boolean z10, AnonymousClass64 anonymousClass64) {
        this.A02 = c05906f;
        this.A05 = jSONObject;
        this.A03 = str;
        this.A04 = str2;
        this.A06 = z10 && A0A(this.A05);
        this.A01 = anonymousClass64;
        this.A00 = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z10, AnonymousClass63 anonymousClass63) {
        String A03 = A03(6, 4, 8);
        String A032 = A03(15, 5, 16);
        String A033 = A03(10, 5, 53);
        if (z10) {
            if (A033.equals(anonymousClass63.A02)) {
                this.A02.A0c(new C05886d(anonymousClass63.A03, -1, -1, this.A04, this.A03));
                return;
            } else if (A032.equals(anonymousClass63.A02)) {
                this.A02.A0Z(new C05866b(anonymousClass63.A03, this.A04, this.A03));
                return;
            } else if (!A03.equals(anonymousClass63.A02)) {
                return;
            } else {
                this.A02.A0Y(new C05866b(anonymousClass63.A03, this.A04, this.A03));
                return;
            }
        }
        boolean equals = A033.equals(anonymousClass63.A02);
        String[] strArr = A08;
        if (strArr[0].charAt(19) == strArr[7].charAt(19)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[1] = "flwbx6LrQCqeci7k9ke6latQGKdtr0Wf";
        strArr2[4] = "KvRVuDaSTwPscix8AFjTqHYTdR1zRqiC";
        if (equals) {
            this.A02.A0b(new C05886d(anonymousClass63.A03, -1, -1, this.A04, this.A03));
        } else if (A032.equals(anonymousClass63.A02)) {
            this.A02.A0a(new C05866b(anonymousClass63.A03, this.A04, this.A03));
        } else if (!A03.equals(anonymousClass63.A02)) {
        } else {
            this.A02.A0X(new C05866b(anonymousClass63.A03, this.A04, this.A03));
        }
    }

    public static boolean A0A(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.has(A03(0, 6, 112));
    }

    public final void A0B() {
        if (!this.A06) {
            this.A01.ABC();
        }
        M8.A06.execute(new C1332aA(this));
    }
}
