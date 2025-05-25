package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.bY  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1415bY implements AnonymousClass22 {
    public static byte[] A0A;
    public static final String A0B;
    public long A02;
    public RewardedVideoAd A03;
    public C1E A04;
    public C0795Fe A05;
    public final C1314Zs A07;
    public final S2SRewardedVideoAdExtendedListener A08;
    public final C1405bO A09;
    public int A00 = 0;
    public boolean A06 = false;
    public long A01 = -1;

    public static String A09(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 14);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A0A = new byte[]{116, -95, Field.FORMDROPDOWN, -108, -105, Field.FORMDROPDOWN, -97, -94, -108, -105, Field.FORMDROPDOWN, -100, -90, Field.FORMDROPDOWN, -108, -97, -91, -104, -108, -105, -84, Field.FORMDROPDOWN, -100, -95, Field.FORMDROPDOWN, -93, -91, -94, -102, -91, -104, -90, -90, 97, Field.FORMDROPDOWN, -116, -94, -88, Field.FORMDROPDOWN, -90, -101, -94, -88, -97, -105, Field.FORMDROPDOWN, -86, -108, -100, -89, Field.FORMDROPDOWN, -103, -94, -91, Field.FORMDROPDOWN, -108, -105, Byte.MAX_VALUE, -94, -108, -105, -104, -105, Field.HTMLCONTROL, Field.BIDIOUTLINE, Field.FORMDROPDOWN, -89, -94, Field.FORMDROPDOWN, -107, -104, Field.FORMDROPDOWN, -106, -108, -97, -97, -104, -105, -60, -15, -15, -18, -15, -97, -21, -18, -32, -29, -24, -19, -26, -97, -15, -28, -10, -32, -15, -29, -28, -29, -97, -11, -24, -29, -28, -18, -97, -32, -29, -19, -4, -11};
    }

    static {
        A0A();
        A0B = C1415bY.class.getSimpleName();
    }

    public C1415bY(C1405bO c1405bO, C2I c2i, String str) {
        this.A09 = c1405bO;
        this.A07 = c1405bO.A0B;
        this.A08 = new C1402bL(str, c2i, this, c1405bO);
    }

    private void A0C(String str, AdExperienceType adExperienceType, boolean z10) {
        String extraHints;
        if (!this.A06 && this.A05 != null) {
            Log.w(A0B, A09(0, 78, 37));
        }
        A0D(false);
        this.A06 = false;
        C04761t c04761t = new C04761t(this.A09.A0D, EnumC0898Jl.A07, AdPlacementType.REWARDED_VIDEO, EnumC0896Jj.A08, 1, this.A09.A0C);
        c04761t.A08(z10);
        if (C0877Im.A2T(this.A07) && (extraHints = L6.A02(this.A07, this.A09.A06)) != null) {
            this.A09.A06 = extraHints;
        }
        c04761t.A06(this.A09.A06);
        c04761t.A07(this.A09.A07);
        this.A05 = new C0795Fe(this.A09.A0B, c04761t);
        this.A05.A0R(new C1417ba(this));
        this.A05.A0W(str, adExperienceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(boolean z10) {
        if (this.A05 != null) {
            this.A05.A0R(new C1416bZ(this));
            this.A05.A0X(z10);
            this.A05.A0J();
            this.A05 = null;
        }
    }

    public final long A0F() {
        if (this.A05 != null) {
            return this.A05.A0F();
        }
        return -1L;
    }

    public final C1405bO A0G() {
        return this.A09;
    }

    public final C1314Zs A0H() {
        return this.A07;
    }

    public final void A0I(RewardData rewardData) {
        this.A09.A03 = rewardData;
        if (this.A06 && this.A05 != null) {
            this.A05.A0Z(rewardData);
        }
    }

    public final void A0J(String str, AdExperienceType adExperienceType, boolean z10) {
        this.A01 = System.currentTimeMillis();
        try {
            A0C(str, adExperienceType, z10);
        } catch (Exception e10) {
            Log.e(A0B, A09(78, 31, 113), e10);
            this.A09.A0B.A07().AA0(A09(109, 3, 126), C8E.A0b, new C8F(e10));
            AdError internalError = AdError.internalError(AdError.INTERNAL_ERROR_2004);
            this.A09.A0B.A0E().A38(C0956Lu.A01(this.A01), internalError.getErrorCode(), internalError.getErrorMessage());
            this.A08.onError(this.A09.A6E(), internalError);
        }
    }

    public final boolean A0K() {
        return this.A05 == null || this.A05.A0Y();
    }

    public final boolean A0L() {
        return this.A06;
    }

    public final boolean A0M(int i10, long j10) {
        if (!this.A06) {
            this.A08.onError(this.A09.A6E(), AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            return false;
        } else if (this.A05 != null) {
            this.A02 = System.currentTimeMillis();
            this.A05.A08.A02(i10);
            this.A05.A08.A03(j10);
            this.A05.A0L();
            this.A06 = false;
            return true;
        } else {
            this.A06 = false;
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass22
    public final void destroy() {
        A0D(true);
    }
}
