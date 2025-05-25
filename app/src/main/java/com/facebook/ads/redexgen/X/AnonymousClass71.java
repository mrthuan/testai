package com.facebook.ads.redexgen.X;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.sync.SyncModifiableBundle;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.ads.redexgen.X.71  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass71 implements InterfaceC0909Jw, SK {
    public static byte[] A0A;
    public static String[] A0B = {"IFN7jxPm5iUVHezzrmxS", "S0eu2eNSRgR", "zAFRaPaLH2briFok", "kmV", "0tQTfhSJ7", "pW9DdJxYDevwUXMYU", "23M9j", "tE9Nw4uJT9AR2sagm"};
    public final C7j A00;
    public final AnonymousClass80 A01;
    public final InterfaceC1108Rq A02;
    public final SL A03;
    public final ST A04;
    public final SU A05;
    public final String A06;
    public final Map<SG, C0912Jz> A09 = new HashMap();
    public final Map<SG, AnonymousClass79> A08 = new HashMap();
    public final List<SY> A07 = new ArrayList();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 21);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A04() throws Throwable {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        synchronized (this) {
            for (C0912Jz c0912Jz : this.A09.values()) {
                if (c0912Jz.A9b()) {
                    hashMap.put(c0912Jz, EnumC1119Sb.A05);
                } else {
                    hashMap.put(c0912Jz, EnumC1119Sb.A04);
                }
            }
            new AtomicReference();
            new AtomicReference();
            Iterator<AnonymousClass79> it = this.A08.values().iterator();
            while (it.hasNext()) {
                it.next();
                SF sf2 = null;
                if (sf2.A9b()) {
                    throw new NullPointerException(A01(349, 20, 51));
                }
            }
            Iterator<SY> it2 = this.A07.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw new NullPointerException(A01(424, 22, 120));
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        JSONObject A03 = A03(hashMap, hashMap2, hashMap3, hashMap4);
        String.format(Locale.US, A01(188, 33, 57), this.A06, A03.toString(2));
        this.A02.AET(this.A06, (A01(327, 8, 121) + URLEncoder.encode(A03.toString())).getBytes(), new C0906Jt(this, atomicReference, atomicReference2, countDownLatch));
        while (countDownLatch.getCount() > 0) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this) {
            if (atomicReference2.get() != null) {
                throw ((Throwable) atomicReference2.get());
            }
            Set<SX> A02 = A02((JSONObject) atomicReference.get());
            HashMap hashMap5 = new HashMap();
            HashMap hashMap6 = new HashMap();
            for (SX sx : A02) {
                sx.A3v(hashMap5, hashMap6);
            }
            this.A03.A66(A00((JSONObject) atomicReference.get()));
            Iterator<SY> it3 = this.A07.iterator();
            if (it3.hasNext()) {
                it3.next();
                throw new NullPointerException(A01(TTAdConstant.MATE_IS_NULL_CODE, 23, 20));
            }
        }
    }

    public static void A05() {
        A0A = new byte[]{102, -81, -71, 102, -72, -85, -71, -70, -72, -81, -87, -70, -85, -86, 116, 102, -103, -79, -81, -74, -74, -81, -76, -83, 102, -71, -65, -76, -87, -43, 4, 4, -76, -3, 2, -76, -10, -11, -9, -1, -5, 6, 3, 9, 2, -8, -62, -67, -37, -24, -24, -23, -18, -102, -35, -20, -33, -37, -18, -33, -102, -19, -33, -20, -16, -33, -20, -102, -36, -17, -24, -34, -26, -33, -102, -15, -29, -18, -30, -102, -24, -23, -24, -89, -19, -33, -20, -16, -33, -20, -102, -23, -15, -24, -33, -34, -102, -36, -17, -24, -34, -26, -33, -102, -61, -66, 123, -104, -85, -104, Field.CONTROL, -89, -87, -90, -102, -100, -86, -86, -96, -91, -98, Field.CONTROL, -90, -89, -85, -96, -90, -91, Field.CONTROL, -118, -81, -73, -94, -83, -86, -91, 97, -77, -90, -89, -77, -90, -76, -87, 97, -75, -86, -82, -90, 123, 97, 102, -91, -34, -11, 7, -80, 3, -11, 2, 6, -11, 2, -67, -1, 7, -2, -11, -12, -80, -14, 5, -2, -12, -4, -11, -80, -13, 2, -11, -15, 4, -11, -12, -54, -80, -75, 3, -95, -57, -68, -79, -74, -64, -67, -68, -73, -56, -81, -62, -73, -67, -68, 110, -64, -77, -65, -61, -77, -63, -62, 110, -62, -67, 110, 115, -63, -120, Field.HYPERLINK, 115, -63, -34, 4, -7, -18, -13, -3, -6, -7, -12, 5, -20, -1, -12, -6, -7, -85, -3, -16, -2, -5, -6, -7, -2, -16, -59, -107, -80, -2, -43, -5, -16, -27, -22, -12, -15, -16, -21, -4, -29, -10, -21, -15, -16, -94, -12, -9, -16, -94, -24, -29, -21, -18, -25, -26, -67, -94, -24, -15, -12, -27, -21, -16, -23, -94, -21, -16, -94, -89, -26, -94, -11, -25, -27, -15, -16, -26, -11, -28, -9, -16, -26, -18, -25, -11, -61, -49, -50, -44, -59, -40, -44, 124, 121, -116, 121, -90, -87, -82, -89, -91, -78, -80, -78, -87, -82, -76, -2, -17, 7, -6, -3, -17, -14, -53, -116, Byte.MAX_VALUE, Byte.MIN_VALUE, -116, Byte.MAX_VALUE, -115, -126, -10, -23, -11, -7, -23, -9, -8, -70, -83, -71, -67, -79, -70, -83, -69, -101, -63, -74, -85, -119, -74, -84, -102, -83, -69, -83, -68, -69, -82, -68, -71, -72, -73, -68, -82, 0, -14, -1, 3, -14, -1, -36, 4, -5, -14, -15, -49, 2, -5, -15, -7, -14, -48, -1, -14, -18, 1, -14, -15, -100, -94, -105, -116, -111, -101, -104, -105, -110, -93, -118, -99, -110, -104, -105, 111, -110, -105, -110, -100, -111, -114, -115, 0, 6, -5, -16, -11, -1, -4, -5, -10, 7, -18, 1, -10, -4, -5, -32, 1, -18, -1, 1, -14, -15, -11, -30, -13, -24, -26, -11, -32, -13, -26, -25, -13, -26, -12, -23, -32, -12};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private synchronized void A08(Throwable th2) {
        Iterator<SY> it = this.A07.iterator();
        if (it.hasNext()) {
            it.next();
            new HashMap();
            new HashMap();
            throw new NullPointerException(A01(TTAdConstant.MATE_IS_NULL_CODE, 23, 20));
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0909Jw
    public final synchronized SF A54(SG sg2) {
        if (sg2.A03() == SI.A04) {
            if (this.A09.containsKey(sg2)) {
                return this.A09.get(sg2);
            }
            C0912Jz c0912Jz = new C0912Jz(sg2);
            this.A09.put(sg2, c0912Jz);
            Iterator<SY> it = this.A07.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException(A01(377, 24, 120));
            }
            String.format(Locale.US, A01(153, 35, 123), sg2);
            return c0912Jz;
        }
        throw new IllegalArgumentException(A01(47, 59, 101));
    }

    static {
        A05();
    }

    public AnonymousClass71(C7j c7j, AnonymousClass80 anonymousClass80, InterfaceC1108Rq interfaceC1108Rq, String str, SU su, ST st, SJ sj2) {
        this.A00 = c7j;
        this.A01 = anonymousClass80;
        this.A02 = interfaceC1108Rq;
        this.A06 = str;
        this.A05 = su;
        this.A04 = st;
        this.A03 = sj2.A4r(this);
    }

    public static int A00(JSONObject jSONObject) throws JSONException {
        int time = jSONObject.getJSONObject(A01(335, 7, 5)).getInt(A01(446, 16, 108));
        if (time > 0) {
            return time;
        }
        throw new JSONException(String.format(Locale.US, A01(129, 24, 44), Integer.valueOf(time)));
    }

    private Set<SX> A02(JSONObject jSONObject) throws JSONException {
        HashSet hashSet = new HashSet();
        JSONObject jSONObject2 = jSONObject.getJSONObject(A01(369, 8, 52));
        JSONObject data = jSONObject.getJSONObject(A01(298, 7, 109));
        Iterator<C0912Jz> it = this.A09.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A0B;
            if (strArr[6].length() != strArr[0].length()) {
                String[] strArr2 = A0B;
                strArr2[1] = "GiFNWD8Qhge";
                strArr2[3] = "8JT";
                if (hasNext) {
                    final C0912Jz next = it.next();
                    switch (SW.A01[EnumC1120Sc.A00(jSONObject2.getString(next.A7Y().A04())).ordinal()]) {
                        case 1:
                            final JSONObject fingerprint = data.getJSONObject(next.A7Y().A04()).getJSONObject(A01(312, 4, 3));
                            final JSONObject responseObject = data.getJSONObject(next.A7Y().A04()).optJSONObject(A01(316, 11, 43));
                            hashSet.add(new AbstractC0904Jr(next, fingerprint, responseObject) { // from class: com.facebook.ads.redexgen.X.76
                                public final JSONObject A00;
                                public final JSONObject A01;

                                {
                                    EnumC1120Sc enumC1120Sc = EnumC1120Sc.A03;
                                    this.A00 = fingerprint;
                                    this.A01 = responseObject;
                                }

                                @Override // com.facebook.ads.redexgen.X.AbstractC0904Jr, com.facebook.ads.redexgen.X.SX
                                public final void A3v(Map<SF, EnumC1120Sc> map, Map<SyncModifiableBundle, SP> map2) {
                                    super.A00.A03(this.A00, this.A01);
                                    super.A3v(map, map2);
                                }
                            });
                            break;
                        case 2:
                            hashSet.add(new AbstractC0904Jr(next) { // from class: com.facebook.ads.redexgen.X.73
                                {
                                    EnumC1120Sc enumC1120Sc = EnumC1120Sc.A04;
                                }
                            });
                            break;
                        default:
                            throw new AssertionError();
                    }
                } else {
                    Iterator<AnonymousClass79> it2 = this.A08.values().iterator();
                    while (it2.hasNext()) {
                        it2.next();
                        SF sf2 = null;
                        switch (SW.A00[SP.A00(jSONObject2.getString(sf2.A7Y().A04())).ordinal()]) {
                            case 1:
                                hashSet.add(new AbstractC0905Js(null) { // from class: com.facebook.ads.redexgen.X.77
                                    {
                                        SP sp2 = SP.A03;
                                    }
                                });
                                break;
                            case 2:
                                hashSet.add(new AbstractC0905Js(null) { // from class: com.facebook.ads.redexgen.X.72
                                    public static byte[] A00;

                                    static {
                                        A01();
                                    }

                                    public static String A00(int i10, int i11, int i12) {
                                        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
                                        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                                            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 102);
                                        }
                                        return new String(copyOfRange);
                                    }

                                    public static void A01() {
                                        A00 = new byte[]{48, 34, Field.EQ, 15, 34, Field.DDEAUTO, Field.GOTOBUTTON, Field.ASK, Field.GLOSSARY, 34, 48, 16, Field.AUTONUM, 43, 32};
                                    }

                                    {
                                        SP sp2 = SP.A04;
                                    }

                                    @Override // com.facebook.ads.redexgen.X.AbstractC0905Js, com.facebook.ads.redexgen.X.SX
                                    public final void A3v(Map<SF, EnumC1120Sc> map, Map<SyncModifiableBundle, SP> map2) {
                                        throw new NullPointerException(A00(0, 15, 87));
                                    }
                                });
                                break;
                            default:
                                throw new AssertionError();
                        }
                    }
                    return hashSet;
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    private JSONObject A03(Map<SF, EnumC1119Sb> map, Map<SyncModifiableBundle, SO> map2, Map<SyncModifiableBundle, JSONObject> clientBundleData, Map<SyncModifiableBundle, JSONObject> clientBundleFingerprint) throws JSONException {
        String A01;
        JSONObject syncRequest = new JSONObject();
        for (Map.Entry<SF, EnumC1119Sb> entry : map.entrySet()) {
            syncRequest.put(entry.getKey().A7Y().A04(), entry.getValue().A03());
        }
        for (Map.Entry<SyncModifiableBundle, SO> entry2 : map2.entrySet()) {
            entry2.getKey();
            SF sf2 = null;
            String A04 = sf2.A7Y().A04();
            String A03 = entry2.getValue().A03();
            String[] strArr = A0B;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0B[4] = "GjL9vB6wh";
            syncRequest.put(A04, A03);
        }
        JSONObject jSONObject = new JSONObject();
        Iterator<Map.Entry<SF, EnumC1119Sb>> it = map.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            A01 = A01(316, 11, 43);
            if (!hasNext) {
                break;
            }
            Map.Entry<SF, EnumC1119Sb> next = it.next();
            if (next.getValue() == EnumC1119Sb.A05) {
                JSONObject updateData = new JSONObject();
                SF key = next.getKey();
                jSONObject.put(key.A7Y().A04(), updateData);
                if (next.getKey().A7Y().A05()) {
                    JSONObject request = key.A7T();
                    updateData.put(A01, request);
                } else {
                    updateData.put(A01, JSONObject.NULL);
                }
                SG A7Y = key.A7Y();
                String[] strArr2 = A0B;
                if (strArr2[7].length() != strArr2[2].length()) {
                    String[] strArr3 = A0B;
                    strArr3[1] = "cfjTgROdu8b";
                    strArr3[3] = "qIs";
                    jSONObject.put(A7Y.A04(), updateData);
                } else {
                    A0B[4] = "vaTQWmMwm";
                    jSONObject.put(A7Y.A04(), updateData);
                }
            }
        }
        for (Map.Entry<SyncModifiableBundle, SO> entry3 : map2.entrySet()) {
            JSONObject updateData2 = new JSONObject();
            SF key2 = entry3.getKey();
            JSONObject request2 = clientBundleFingerprint.get(entry3.getKey());
            updateData2.put(A01, request2);
            if (entry3.getValue() == SO.A05) {
                String A012 = A01(312, 4, 3);
                JSONObject request3 = clientBundleData.get(key2);
                updateData2.put(A012, request3);
                jSONObject.put(key2.A7Y().A04(), updateData2);
            } else {
                jSONObject.put(key2.A7Y().A04(), updateData2);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, String> entry4 : this.A05.A7L().entrySet()) {
            if (entry4.getValue() != null) {
                jSONObject2.put(entry4.getKey(), entry4.getValue());
            }
        }
        JSONObject bundleData = new JSONObject();
        bundleData.put(A01(342, 7, 111), syncRequest);
        bundleData.put(A01(298, 7, 109), jSONObject);
        bundleData.put(A01(305, 7, 75), jSONObject2);
        return bundleData;
    }

    public static void A06(String str, AtomicReference<JSONObject> atomicReference, AtomicReference<Throwable> atomicReference2) {
        String.format(Locale.US, A01(221, 28, 118), str);
        try {
            atomicReference.set((JSONObject) new JSONTokener(str).nextValue());
        } catch (ClassCastException | JSONException e10) {
            atomicReference2.set(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0909Jw, com.facebook.ads.redexgen.X.InterfaceC06187p
    public final void A68() {
        this.A03.A67();
    }

    @Override // com.facebook.ads.redexgen.X.SK
    public final void AFt() {
        if (this.A01.A9e()) {
            String str = A01(106, 23, 34) + this.A01.A76().A07() + A01(0, 29, 49);
            A08(new C1118Sa());
            return;
        }
        try {
            if (!C0877Im.A1x(this.A00) || this.A00.A03().A9T()) {
                A04();
                return;
            }
            throw new IllegalStateException(A01(29, 18, ShapeTypes.VERTICAL_SCROLL));
        } catch (Throwable th2) {
            String.format(Locale.US, A01(249, 49, 109), Integer.valueOf(this.A04.A01()));
            A08(th2);
            this.A03.A66(this.A04.A01());
        }
    }
}
