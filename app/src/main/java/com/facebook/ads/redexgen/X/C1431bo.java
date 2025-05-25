package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1431bo implements K8 {
    public static byte[] A0E;
    public static String[] A0F = {"gvO2SkJ6judPPNAAbU10EdMFrysfMOoq", "C8fayNw08H03MAMa0MYSKK0pyo1qSvcR", "zD", "tQ435k35SGtCPZ", "PU5xmRYaUesfDikXgdcM0c", "Sj", "IzP0LuOvX3krWKzZjoX9w767Mf8waFqk", "fiC8qpcDm8TluoxAfEpO8PomLrdxugFO"};
    public InterfaceC04801x A00;
    public C8W A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;
    public final AdSize A06;
    public final C04510u A07;
    public final C1314Zs A08;
    public final J7 A09;
    public final EnumC0898Jl A0A;
    public final K9 A0B;
    public final Runnable A0C;
    public final String A0D;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 81);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{-47, -46, -125, -45, -49, -60, -58, -56, -48, -56, -47, -41, -125, -52, -47, -125, -43, -56, -42, -45, -46, -47, -42, -56};
    }

    static {
        A05();
        M5.A02();
    }

    public C1431bo(C1314Zs c1314Zs, String str, EnumC0898Jl enumC0898Jl, AdSize adSize, int i10) {
        this.A08 = c1314Zs;
        this.A0D = str;
        this.A0A = enumC0898Jl;
        this.A06 = adSize;
        this.A04 = i10;
        this.A0B = new K9(this.A08);
        this.A0B.A0Q(this);
        this.A07 = new C04510u();
        this.A03 = true;
        this.A05 = new Handler();
        this.A0C = new C0796Ff(this);
        this.A09 = c1314Zs.A09();
        DynamicLoaderFactory.makeLoader(this.A08).getInitApi().onAdLoadInvoked(this.A08);
    }

    private List<C1473cU> A04() {
        C8W c8w = this.A01;
        ArrayList arrayList = new ArrayList(c8w.A02());
        for (C8U A04 = c8w.A04(); A04 != null; A04 = c8w.A04()) {
            InterfaceC04460p A00 = this.A07.A00(this.A08, AdPlacementType.NATIVE);
            if (A00 != null && A00.A82() == AdPlacementType.NATIVE) {
                C1473cU nativeAdapter = (C1473cU) A00;
                nativeAdapter.A0L(this.A08, new C0797Fg(this, arrayList, nativeAdapter), this.A09, new C04771u(A04.A04(), c8w.A05(), this.A0D, c8w.A05().A0C()), W7.A0K());
            }
        }
        return arrayList;
    }

    public final void A06() {
        this.A03 = false;
        this.A05.removeCallbacks(this.A0C);
    }

    public final void A07() {
        try {
            this.A0B.A0P(new K6(this.A08, this.A0D, this.A06 != null ? new C0941Lf(this.A06.getWidth(), this.A06.getHeight()) : null, this.A0A, this.A04, new C0903Jq(this.A08, null, null, null), AbstractC0947Ll.A01(C0877Im.A0L(this.A08)), this.A02, null, new C1424bh()));
        } catch (C0895Jh e10) {
            ABs(C0894Jg.A02(e10));
        }
    }

    public final void A08(InterfaceC04801x interfaceC04801x) {
        this.A00 = interfaceC04801x;
    }

    public final void A09(String str) {
        this.A02 = str;
    }

    public final boolean A0A() {
        return this.A01 == null || this.A01.A0H();
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void ABs(C0894Jg c0894Jg) {
        if (this.A03) {
            this.A05.postDelayed(this.A0C, 1800000L);
        }
        if (this.A00 != null) {
            this.A00.ABs(c0894Jg);
        }
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void ADj(Vu vu) {
        C8W A00 = vu.A00();
        if (A00 != null) {
            if (this.A03) {
                long A0A = A00.A05().A0A();
                if (A0A == 0) {
                    A0A = 1800000;
                }
                this.A05.postDelayed(this.A0C, A0A);
            }
            this.A01 = A00;
            List<C1473cU> A04 = A04();
            if (this.A00 != null) {
                boolean isEmpty = A04.isEmpty();
                String[] strArr = A0F;
                if (strArr[7].charAt(9) == strArr[6].charAt(9)) {
                    throw new RuntimeException();
                }
                A0F[0] = "Ma8ASQR7F1ZvPn5hHoXinNcVvjUetiuh";
                if (isEmpty) {
                    this.A00.ABs(C0894Jg.A01(AdErrorType.NO_FILL, A03(0, 0, 63)));
                    return;
                } else {
                    this.A00.ACq(A04);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException(A03(0, 24, 18));
    }
}
