package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class JI {
    public static byte[] A00;
    public static final String A01;
    public static final Map<String, Integer> A02;
    public static final AtomicInteger A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 57);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-82, -96, -50, -27, -9, -96, -10, -31, -20, -11, -27, -70, -96, -111, -88, -124, -87, -77, -80, -95, -76, -93, -88, -87, -82, -89, 96, -84, -81, -93, -95, -84, 96, -93, -81, -75, -82, -76, -91, -78, -77, 122, 96, -4, 33, 22, Field.PAGEREF, 24, 32, 24, 33, Field.FILLIN, Field.NUMCHARS, 33, 26, -45, 22, 34, Field.DATA, 33, Field.FILLIN, 24, Field.PAGEREF, -19, -45, -7, Field.NUMCHARS, 16, 14, 25, -16, Field.NUMCHARS, 34, Field.NUMWORDS, 33, 18, 31, 32, -99, -96, -96, -91, -80, -91, -85, -86, -99, -88, -101, -91, -86, -94, -85, -35, -16, -16, -31, -23, -20, -16, -84, -86, -66, -80, -79, -67, -88, -82, -63, -84, -82, -71, -67, -78, -72, -73, -17, -5, -7, -70, -14, -19, -17, -15, -18, -5, -5, -9, -70, -19, -16, -1, -70, -40, -37, -49, -51, -40, -21, -49, -37, -31, -38, -32, -47, -34, -33, -87, -90, -71, -90, -95, -78, -95, -86, -80, -81, 24, Field.NUMWORDS, 15, 13, 24, 11, 15, Field.NUMWORDS, 33, 26, 32, 17, 30, 31, -47, -62, -38, -51, -48, -62, -59, -10, -9, -28, -26, -18, -9, -11, -28, -26, -24, -48, -46, -65, -47, -42, -51, -62, -47, -45, -64, -46, -41, -50, -61, -67, -63, -51, -62, -61};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A06(C7j c7j, InterfaceC1108Rq interfaceC1108Rq, Map<String, ?> map) throws JSONException {
        HashMap hashMap = new HashMap();
        hashMap.put(A01(93, 7, 67), A01(13, 1, 40));
        A09(c7j, hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(A01(188, 7, 36), A01(ShapeTypes.FLOW_CHART_DISPLAY, 14, 115));
        hashMap2.put(A01(195, 12, 37), String.valueOf(3501));
        hashMap2.put(A01(100, 16, 16), A01(14, 1, 62));
        hashMap2.put(A01(ShapeTypes.MATH_MULTIPLY, 10, 74), A01(65, 13, 116));
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        if (c7j.A04().A9O()) {
            String str = A01(15, 28, 7) + jSONObject.toString(2);
        }
        hashMap2.put(A01(78, 15, 3), jSONObject.toString());
        A09(c7j, hashMap2);
        C06328h A08 = c7j.A08();
        JSONObject A05 = C8G.A05(new C8I(A08.A01(), A08.A02(), hashMap2));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(A05);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(A01(ShapeTypes.FLOW_CHART_OR, 4, 12), new JSONObject(hashMap));
        jSONObject2.put(A01(ShapeTypes.FLOW_CHART_MERGE, 6, 3), jSONArray);
        S4 s4 = new S4();
        s4.put(A01(ShapeTypes.ACTION_BUTTON_SOUND, 7, 40), jSONObject2.toString());
        interfaceC1108Rq.AET(c7j.A04().A7R(), s4.A08(), new WS(c7j));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A09(C7j c7j, Map<String, String> map) {
        map.putAll(c7j.A03().A59());
    }

    static {
        A04();
        A01 = JI.class.getSimpleName();
        A03 = new AtomicInteger(0);
        A02 = new HashMap();
    }

    public static void A05(C7j c7j) {
        if (A0B(c7j)) {
            return;
        }
        synchronized (JI.class) {
            if (A03.get() != 0) {
                return;
            }
            A03.set(1);
            M8.A06.execute(new WT(c7j));
        }
    }

    public static void A08(C7j c7j, String str) {
        int value;
        int i10;
        if (A0B(c7j)) {
            return;
        }
        synchronized (JI.class) {
            if (A03.get() != 2) {
                if (A02.containsKey(str)) {
                    i10 = A02.get(str).intValue();
                } else {
                    i10 = 0;
                }
                value = i10 + 1;
                A02.put(str, Integer.valueOf(value));
            } else {
                SharedPreferences sharedPreferences = c7j.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(116, 31, 83), c7j), 0);
                value = sharedPreferences.getInt(str, 0) + 1;
                sharedPreferences.edit().putInt(str, value).apply();
            }
            if (c7j.A04().A9O()) {
                String str2 = A01(43, 22, 122) + str + A01(0, 13, 71) + value;
            }
        }
    }

    public static boolean A0A(double d10, int i10) {
        return i10 <= 0 || d10 >= 1.0d / ((double) i10);
    }

    public static boolean A0B(C7j c7j) {
        if (c7j.A04().A9O()) {
            return false;
        }
        if (!Io.A0U(c7j)) {
            return true;
        }
        return A0A(c7j.A08().A00(), Io.A0C(c7j));
    }
}
