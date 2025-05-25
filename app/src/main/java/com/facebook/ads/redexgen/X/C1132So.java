package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.So  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1132So {
    public static byte[] A0L;
    public static String[] A0M = {"pLRRT7xfKKmC", "sDjB9WgW1E6gHf8gwZURHsTrfoUrQz1T", "uiJP8xmaVv", "5XKoBHy1xynVgVvyT837PyBbXD1HwArb", "BpJCepaU8WbBulVTB", "9USxYKvyty1bKFarGQoBTCJfC9", "y9X2NkRV2raN2WQBQaXrllWfrJ", "7FHQr1tSmfn5NF7ZWaBxZ9Q6x0"};
    public int A01;
    public int A02;
    public InterfaceC1077Ql A03;
    public boolean A05;
    public boolean A07;
    public boolean A08;
    public boolean A0B;
    public final C1401bK A0C;
    public final C1314Zs A0D;
    public final J7 A0E;
    public final InterfaceC1076Qk A0F;
    public final InterfaceC1082Qq A0G;
    public final C1083Qr A0H;
    public final String A0J;
    public final Map<String, String> A0K;
    public final Object A0I = new Object();
    public boolean A06 = false;
    public boolean A09 = false;
    public boolean A0A = false;
    public int A00 = 0;
    public String A04 = null;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 34 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public C1132So(C1314Zs c1314Zs, J7 j72, InterfaceC1076Qk interfaceC1076Qk, String str, boolean z10, int i10, int i11, boolean z11, Bundle bundle, Map<String, String> map, InterfaceC1082Qq interfaceC1082Qq) {
        this.A02 = 0;
        this.A01 = 0;
        this.A05 = false;
        this.A0B = false;
        this.A07 = false;
        this.A0D = c1314Zs;
        this.A0E = j72;
        this.A0F = interfaceC1076Qk;
        this.A0J = str;
        this.A0K = map;
        this.A08 = z10;
        this.A07 = z11;
        this.A0G = interfaceC1082Qq;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1134Sq(this, 0.5d, -1.0d, 2.0d, true));
        arrayList.add(new C1133Sp(this, 1.0E-7d, -1.0d, 0.001d, false));
        if (bundle != null) {
            this.A0C = new C1401bK(arrayList, bundle.getBundle(A0G(6, 16, 57)), this.A0G);
            this.A02 = bundle.getInt(A0G(97, 18, 74));
            this.A01 = bundle.getInt(A0G(79, 18, 108));
        } else {
            this.A02 = i10;
            this.A01 = i11;
            this.A0C = new C1401bK(arrayList, this.A0G);
        }
        this.A05 = C0877Im.A2K(this.A0D);
        this.A0B = C0877Im.A2O(this.A0D);
        this.A0H = new C1083Qr(new Handler(), this);
    }

    public static String A0G(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 49);
        }
        return new String(copyOfRange);
    }

    public static void A0N() {
        A0L = new byte[]{-86, -84, -67, -78, -72, -73, -53, -50, -69, -33, -53, -42, -45, -34, -29, -73, -53, -40, -53, -47, -49, -36, -75, -56, -67, -63, -71, -77, -63, -57, -65, -48, -59, -55, -63, -71, -70, -63, -76, -74, -55, -66, -62, -70, -76, -62, -56, -42, -41, -34, -47, -24, -26, -37, -33, -41, -47, -33, -27, -49, -32, -49, -40, -34, -55, -45, -40, -50, -49, -30, -69, -50, -59, -58, -62, -73, -49, -69, -56, 9, -2, 16, 17, -33, 12, 18, 11, 1, -2, 15, 22, -15, 6, 10, 2, -22, -16, -25, -36, -18, -17, -53, -19, -22, -30, -19, -32, -18, -18, -49, -28, -24, -32, -56, -50, -46, -56, -58, -39, -60, -46, -40, -17, -27, -8, -10, -31, -17, -11, -38, -46, -35, -39, -5, -3, -16, -5, -5, -1, -62, -58, -69, -65, -73, -44, -37, 6, -5, -1, -9, -30, -40, -51, -18, -28, -27, -4, -14, -13, -25, -2, -6, -12, -20, -13, -19, -12, -28, -30, -41, -37, -45, -51, -37, -31, -85, -84, -108, -89, -88, -93, 31, 32, 10, 19, 20, 10, -70, -69, -79, -91, -68, -63, -77, -72, -82, -71, -63};
    }

    static {
        A0N();
    }

    private final float A0F() {
        return M0.A00(this.A0D) * this.A0F.getVolume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A0I(EnumC1078Qm enumC1078Qm) {
        int currentPositionInMillis = this.A0F.getCurrentPositionInMillis();
        int i10 = this.A00 + 1;
        this.A00 = i10;
        return A0J(enumC1078Qm, currentPositionInMillis, i10);
    }

    private Map<String, String> A0J(EnumC1078Qm enumC1078Qm, int i10, int i11) {
        HashMap hashMap = new HashMap();
        M0.A03(hashMap, this.A0F.getVideoStartReason() == EnumC1084Qs.A02, !this.A0F.A9U());
        A0T(hashMap);
        A0R(hashMap);
        A0V(hashMap, i10);
        A0U(hashMap);
        A0S(hashMap);
        A0m(enumC1078Qm, hashMap);
        hashMap.put(A0G(0, 6, 24), String.valueOf(enumC1078Qm.A00));
        hashMap.put(A0G(59, 11, 57), String.valueOf(i11));
        return hashMap;
    }

    private void A0L() {
        if (this.A07 && this.A06) {
            return;
        }
        A0Q(this.A0J, A0I(EnumC1078Qm.A04));
    }

    private void A0M() {
        if (this.A07 && this.A06) {
            return;
        }
        String str = this.A0J;
        String[] strArr = A0M;
        if (strArr[2].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0M[6] = "FJm4aBnN5GbAhpBnCwQDj";
        A0Q(str, A0I(EnumC1078Qm.A0A));
    }

    private final void A0O(int i10, boolean z10, boolean z11) {
        if (i10 <= 0.0d || i10 < this.A02) {
            return;
        }
        if (i10 > this.A02) {
            this.A0C.A06((i10 - this.A02) / 1000.0f, A0F());
            double A8i = this.A0G.A8i();
            if (A8i < 0.5d && C0877Im.A1Y(this.A0D)) {
                this.A0D.A0E().AHM(String.valueOf(A8i));
            }
            this.A02 = i10;
            if (z11 || i10 - this.A01 >= 5000) {
                String str = this.A0J;
                EnumC1078Qm enumC1078Qm = EnumC1078Qm.A09;
                int i11 = this.A00 + 1;
                this.A00 = i11;
                A0Q(str, A0J(enumC1078Qm, i10, i11));
                this.A01 = this.A02;
                this.A0C.A05();
                return;
            }
        }
        if (z10) {
            if (this.A07 && this.A06) {
                return;
            }
            this.A06 = true;
            String str2 = this.A0J;
            EnumC1078Qm enumC1078Qm2 = EnumC1078Qm.A09;
            int i12 = this.A00 + 1;
            this.A00 = i12;
            A0Q(str2, A0J(enumC1078Qm2, i10, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(String str, Map<String, String> data) {
        this.A0E.AAb(str, data);
        if (this.A03 != null) {
            this.A03.ACZ();
        }
    }

    private void A0R(Map<String, String> params) {
        C2R A03 = this.A0C.A03();
        C2Q A00 = A03.A00();
        params.put(A0G(ShapeTypes.MATH_NOT_EQUAL, 3, 120), String.valueOf(A00.A00()));
        params.put(A0G(ShapeTypes.PLAQUE_TABS, 3, 108), String.valueOf(A00.A06()));
        params.put(A0G(ShapeTypes.CHART_PLUS, 5, 19), String.valueOf(A00.A03()));
        params.put(A0G(ShapeTypes.ACTION_BUTTON_END, 8, 61), String.valueOf(A00.A02() * 1000.0d));
        params.put(A0G(47, 12, 65), String.valueOf(A00.A01() * 1000.0d));
        params.put(A0G(122, 7, 81), String.valueOf(A00.A04() * 1000.0d));
        if (this.A04 != null) {
            params.put(A0G(ShapeTypes.FUNNEL, 6, 4), this.A04);
        }
        C2Q A01 = A03.A01();
        params.put(A0G(ShapeTypes.FLOW_CHART_EXTRACT, 3, 59), String.valueOf(A01.A00()));
        params.put(A0G(153, 3, 71), String.valueOf(A01.A06()));
        params.put(A0G(ShapeTypes.FLOW_CHART_MAGNETIC_DRUM, 5, 85), String.valueOf(A01.A03()));
        params.put(A0G(22, 8, 35), String.valueOf(A01.A02() * 1000.0d));
        params.put(A0G(35, 12, 36), String.valueOf(A01.A01() * 1000.0d));
        params.put(A0G(115, 7, 52), String.valueOf(A01.A04() * 1000.0d));
    }

    private void A0S(Map<String, String> params) {
        if (this.A0K != null) {
            params.putAll(this.A0K);
        }
    }

    private void A0T(Map<String, String> map) {
        map.put(A0G(70, 9, 37), String.valueOf(this.A0F.A9R()));
        map.put(A0G(ShapeTypes.FLOW_CHART_DECISION, 4, 90), Long.toString(this.A0F.getInitialBufferTime()));
    }

    private void A0U(Map<String, String> params) {
        Rect rect = new Rect();
        this.A0F.getGlobalVisibleRect(rect);
        params.put(A0G(ShapeTypes.FLOW_CHART_DOCUMENT, 2, 90), String.valueOf(rect.top));
        params.put(A0G(ShapeTypes.PLUS, 2, 60), String.valueOf(rect.left));
        params.put(A0G(129, 2, 57), String.valueOf(this.A0F.getMeasuredHeight()));
        params.put(A0G(144, 2, 51), String.valueOf(this.A0F.getMeasuredWidth()));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.A0D.getSystemService(A0G(192, 6, 25))).getDefaultDisplay().getMetrics(displayMetrics);
        params.put(A0G(ShapeTypes.ACTION_BUTTON_BLANK, 3, 83), String.valueOf(displayMetrics.heightPixels));
        params.put(A0G(164, 3, 76), String.valueOf(displayMetrics.widthPixels));
    }

    private void A0V(Map<String, String> map, int i10) {
        map.put(A0G(30, 5, 43), String.valueOf(System.currentTimeMillis()));
        map.put(A0G(ShapeTypes.FLOW_CHART_TERMINATOR, 5, 33), String.valueOf(this.A01 / 1000.0f));
        map.put(A0G(ShapeTypes.FLOW_CHART_SUMMING_JUNCTION, 4, 97), String.valueOf(i10 / 1000.0f));
    }

    public final int A0a() {
        return this.A02;
    }

    public final Bundle A0b() {
        A0k(A0a(), A0a());
        Bundle bundle = new Bundle();
        bundle.putInt(A0G(97, 18, 74), this.A02);
        bundle.putInt(A0G(79, 18, 108), this.A01);
        bundle.putBundle(A0G(6, 16, 57), this.A0C.A02());
        return bundle;
    }

    public final void A0c() {
        if (this.A07 && this.A06) {
            return;
        }
        A0Q(this.A0J, A0I(EnumC1078Qm.A07));
    }

    public final void A0d() {
        if (this.A07 && this.A06) {
            return;
        }
        A0Q(this.A0J, A0I(EnumC1078Qm.A08));
    }

    public final void A0e() {
        if (A0F() < 0.05d) {
            synchronized (this.A0I) {
                if (this.A08) {
                    A0L();
                    this.A08 = false;
                }
            }
            return;
        }
        synchronized (this.A0I) {
            if (!this.A08) {
                A0M();
                this.A08 = true;
            }
        }
    }

    public final void A0f() {
        this.A0D.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.A0H);
    }

    public final void A0g() {
        this.A0D.getContentResolver().unregisterContentObserver(this.A0H);
    }

    public final void A0h(int i10) {
        if (this.A07 && this.A06) {
            return;
        }
        this.A0C.A04();
        A0Q(this.A0J, A0I(EnumC1078Qm.A05));
        if (this.A05) {
            A0O(i10, false, true);
        } else {
            A0O(i10, false, ((double) i10) < 2000.0d);
        }
        if (this.A0B) {
            this.A0C.A05();
        }
    }

    public final void A0i(int i10) {
        A0O(i10, true, false);
        if (!this.A07) {
            this.A01 = 0;
            this.A02 = 0;
        }
        this.A0C.A05();
        this.A0C.A04();
    }

    public final void A0j(int i10) {
        A0O(i10, false, false);
    }

    public final void A0k(int i10, int i11) {
        A0O(i10, true, false);
        this.A01 = i11;
        this.A02 = i11;
        this.A0C.A05();
        this.A0C.A04();
    }

    public final void A0l(InterfaceC1077Ql interfaceC1077Ql) {
        this.A03 = interfaceC1077Ql;
    }

    public void A0m(EnumC1078Qm enumC1078Qm, Map<String, String> params) {
    }

    public final void A0n(C1132So c1132So) {
        c1132So.A06 = this.A06;
        c1132So.A07 = this.A07;
        c1132So.A0A = this.A0A;
        c1132So.A09 = this.A09;
        c1132So.A02 = this.A02;
        c1132So.A01 = this.A01;
    }
}
