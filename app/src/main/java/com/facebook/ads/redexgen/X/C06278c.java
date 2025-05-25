package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.dynamicloading.FlashPreferences;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.lang.Thread;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.8c  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06278c {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"i0FOsf0o9fpBvAlaEaGgnCYFRbNnwBKJ", "ZsBa2nEfyhltTo", "ZG6g5nWnUhxh", "6zjosiDwJWE47kuMvKAUCDrCWUeR8P3q", "Gh89HIHHDqfPtiuASbXLVil627eRz", "Lsbp3nhJR34oAmuvtJAouWbaxC4Ny9OM", "s0Y", "C"};
    public static final AtomicBoolean A04;
    public static final AtomicBoolean A05;
    public static final AtomicBoolean A06;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 33);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-87, -40, -42, -84, -41, -86, -87, -41, -54, -58, -59, -7, -24, -19, -23, -14, -25, -23, -46, -23, -8, -5, -13, -10, -17, -88, -103, -96, 117, -66, -61, -66, -55, -66, -74, -63, -66, -49, -74, -55, -66, -60, -61, 117, -56, -55, -74, -57, -55, -70, -71, -84, -67, -60, 121, -48, -70, -52, 121, -70, -59, -53, -66, -70, -67, -46, 121, -62, -57, -62, -51, -62, -70, -59, -62, -45, -66, -67, 122, 121, -84, -60, -62, -55, -55, -62, -57, -64, -121, -90, -68, -62, 109, -79, -68, -69, 116, -63, 109, -80, -82, -71, -71, 109, -114, -62, -79, -74, -78, -69, -80, -78, -101, -78, -63, -60, -68, -65, -72, -114, -79, -64, 123, -74, -69, -74, -63, -74, -82, -71, -74, -57, -78, 117, 118, 123, 109, -96, -68, -70, -78, 109, -77, -62, -69, -80, -63, -74, -68, -69, -82, -71, -74, -63, -58, 109, -70, -82, -58, 109, -69, -68, -63, 109, -60, -68, -65, -72, 109, -67, -65, -68, -67, -78, -65, -71, -58, 123, -120, -105, -112, -58, -52, -63, -45, -56, 0, 6, -5, 13, 2, -7, -3, 9, 8, 0, 3, 1, -42, -44, -35, -44, -31, -40, -46, -3, 2, -3, 8, -3, -11, 0, -3, 14, -7, -51, -46, -51, -40, -51, -59, -48, -51, -34, -55, -116, -115, -124, -46, -45, -40, -124, -57, -59, -48, -48, -55, -56, -110, 1, -10, 8, 9, -12, 7, -6, 8, 10, 1, 9};
    }

    static {
        A03();
        A06 = new AtomicBoolean();
        A04 = new AtomicBoolean();
        A05 = new AtomicBoolean();
    }

    public static C1298Zc A00() {
        return new C1298Zc();
    }

    public static C1297Zb A01(C1313Zr c1313Zr) {
        return new C1297Zb(c1313Zr);
    }

    public static void A04(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        ExecutorC0959Lx.A01.execute(new C1299Zd(initListener, initResult));
    }

    public static void A06(C1313Zr c1313Zr) {
        if (Io.A0P(c1313Zr) && !A05.getAndSet(true)) {
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = new AnonymousClass84(Thread.getDefaultUncaughtExceptionHandler(), c1313Zr, new ZZ());
                Thread.setDefaultUncaughtExceptionHandler(defaultUncaughtExceptionHandler);
            } catch (Exception e10) {
                c1313Zr.A07().AA0(A02(198, 7, 78), C8E.A1X, new C8F(e10));
            }
        }
    }

    public static void A07(C1313Zr c1313Zr) {
        A0H(c1313Zr, null, null, 3);
    }

    public static void A08(C1313Zr c1313Zr) {
        A0H(c1313Zr, null, null, 3);
    }

    public static void A09(C1313Zr c1313Zr) {
        if (C0877Im.A2D(c1313Zr)) {
            A0F(c1313Zr, 0);
        }
        if (C0877Im.A2L(c1313Zr)) {
            A0B(c1313Zr);
        }
    }

    public static void A0A(C1313Zr c1313Zr) {
        if (C0877Im.A2E(c1313Zr)) {
            String[] strArr = A03;
            if (strArr[1].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "XjvPwbQrSqkAxC";
            strArr2[6] = "skO";
            A0G(c1313Zr, null, 3);
        }
    }

    public static void A0B(C1313Zr c1313Zr) {
        M8.A06.execute(new C1300Ze(c1313Zr));
    }

    public static void A0C(C1313Zr c1313Zr) {
        C2B.A02(c1313Zr);
        AnonymousClass88.A0C(c1313Zr, new ZY(c1313Zr), new C1304Zi(), BuildConfigApi.isDebug());
        c1313Zr.A09();
        A0D(c1313Zr);
    }

    public static void A0D(C1313Zr c1313Zr) {
        if (ProcessUtils.isRemoteRenderingProcess()) {
            return;
        }
        SharedPreferences sharedPreferences = FlashPreferences.getSharedPreferences(c1313Zr);
        String string = sharedPreferences.getString(A02(ShapeTypes.CHART_STAR, 12, 121), null);
        String string2 = sharedPreferences.getString(A02(UnknownRecord.PHONETICPR_00EF, 11, 116), null);
        if (string != null && string2 != null) {
            C8D A07 = c1313Zr.A07();
            C8F c8f = new C8F(string2);
            String flashConfig = A02(ShapeTypes.MATH_NOT_EQUAL, 5, 63);
            A07.AAS(flashConfig, 3701, c8f);
        }
    }

    public static void A0F(C1313Zr c1313Zr, int i10) {
        AbstractC06137i.A01(c1313Zr);
        if (A04.getAndSet(true)) {
            return;
        }
        if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isDebuggerOn()) {
            AbstractC0907Ju.A02();
        }
        A06(c1313Zr);
        AbstractC0914Kb.A00(C0877Im.A0n(c1313Zr), BuildConfigApi.isDebug(), A00(), A01(c1313Zr));
        C6Q.A03(C0877Im.A04(c1313Zr));
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            S8.A09(new C1296Za(c1313Zr));
        }
        if (i10 == 3) {
            Log.e(A02(8, 17, 99), A02(89, 89, 44));
            c1313Zr.A07().AAS(A02(ShapeTypes.MATH_MULTIPLY, 3, 6), C8E.A0R, new C8F(A02(215, 24, 67)));
        }
        ActivityUtils.A04(c1313Zr, AudienceNetworkActivity.class);
        M8.A05(c1313Zr);
        JI.A05(c1313Zr);
        C04530w.A01(c1313Zr);
        if (C0877Im.A11(c1313Zr)) {
            C5J.A00(c1313Zr);
        }
        if (C0877Im.A1p(c1313Zr)) {
            ZQ.A02().A8G(c1313Zr);
        }
    }

    public static void A0G(C1313Zr c1313Zr, AudienceNetworkAds.InitListener initListener, int i10) {
        AbstractC06137i.A01(c1313Zr);
        boolean z10 = false;
        synchronized (C06278c.class) {
            boolean execute = A00;
            if (!execute) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        boolean execute2 = A01;
                        if (!execute2) {
                            A01 = true;
                            z10 = true;
                        }
                    }
                }
                A00 = true;
                z10 = true;
            }
        }
        if (z10) {
            A0F(c1313Zr, i10);
            M8.A08.execute(new C1301Zf(c1313Zr, initListener));
        } else if (i10 != 1) {
        } else {
            String A022 = A02(51, 38, 56);
            if (initListener != null) {
                A04(initListener, new C06268b(true, A022));
            } else {
                Log.w(A02(8, 17, 99), A022);
            }
        }
    }

    public static void A0H(C1313Zr c1313Zr, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, int i10) {
        AbstractC0907Ju.A05(A02(205, 10, 115), A02(25, 26, 52), A02(0, 8, 82));
        S8.A06();
        A0G(c1313Zr, initListener, i10);
    }

    public static synchronized boolean A0I() {
        boolean z10;
        synchronized (C06278c.class) {
            z10 = A00;
        }
        return z10;
    }
}
