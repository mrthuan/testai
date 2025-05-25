package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.0v  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04520v {
    public static byte[] A03;
    public static String[] A04 = {"yonrCQ0uoeCYCSmT5ejKLJLtf9VOp321", "NDuBqnzzJqzb1WeHMragxAHoyIt26Von", "hWL4zdMk8yywijkAtqHNVn2pZmfj34f9", "9i7qyia1evnFwuCuocWilq3mxIKRQ8Gt", "sdkV7vC", "3a", "fP", "wcot"};
    public final LinkedHashSet<String> A01 = new LinkedHashSet<>();
    public JSONObject A00 = new JSONObject();
    public final AtomicReference<String> A02 = new AtomicReference<>(A01(0, 2, 32));

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-67, -65, -63, -65, -50, -3, 6, -5, 10, 17, 8, 12, -3, -4, -9, -7, -4, -9, 1, -4, -9, 7, 10, 1, -1, 1, 6, -7, 4, -19, -10, -21, -6, 1, -8, -4, -19, -20, -25, -15, -20, 25, 13, 36, 11, 15, 13, Field.NUMCHARS, Field.NUMCHARS, 17, 16, 11, 13, 30, 30, 13, Field.PAGEREF, 11, 24, 17, 26, 19, 32, 20, Field.GLOSSARY, Field.QUOTE, Field.QUOTE, Field.AUTONUMLGL, Field.GOTOBUTTON, Field.GOTOBUTTON, Field.PAGEREF, Field.DDEAUTO, Field.QUOTE, Field.PAGEREF, Field.MACROBUTTON, -1, -12, 1, -8, -2, -13, Field.PAGEREF, Field.NUMCHARS, 34, 33, 12, Field.NUMCHARS, 16, 16, 34, 31, 31, 18, Field.NUMWORDS, 16, 18, 12, 32, 18, 16, 32, 30, 21, Field.NUMWORDS, 26, 5, 22, 11, 24, 15, 21, 10};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0A(String str) throws JSONException, C8F {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                this.A00 = new JSONObject(str);
                HashMap hashMap = new HashMap();
                Iterator<String> keys = this.A00.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (this.A00.get(next) instanceof String) {
                        hashMap.put(next, A00(next, new JSONObject((String) this.A00.get(next))));
                    }
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    this.A00.put((String) entry.getKey(), entry.getValue());
                }
            }
        }
    }

    static {
        A02();
    }

    private final synchronized C1S A00(String str, JSONObject jSONObject) throws JSONException, C8F {
        C1S frequencyCappingData;
        if (str.equals(jSONObject.optString(A01(29, 12, 70), null))) {
            frequencyCappingData = new C1S(str);
            A03(frequencyCappingData, jSONObject);
        } else {
            C8F c8f = new C8F(new IllegalArgumentException());
            jSONObject.put(A01(5, 24, 86), str);
            c8f.A07(jSONObject);
            c8f.A05(1);
            throw c8f;
        }
        return frequencyCappingData;
    }

    private void A03(C1S c1s, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt(A01(75, 6, 77));
        int optInt2 = jSONObject.optInt(A01(101, 11, 100));
        int maxCappedArrayLength = jSONObject.optInt(A01(41, 23, 106), 50);
        long optLong = jSONObject.optLong(A01(2, 3, 28));
        String A01 = A01(64, 11, 126);
        if (jSONObject.has(A01)) {
            c1s.A06((JSONArray) jSONObject.get(A01));
        }
        String A012 = A01(81, 20, 107);
        if (jSONObject.has(A012)) {
            int cappingTimeSecs = jSONObject.optInt(A012);
            c1s.A04(cappingTimeSecs);
        }
        c1s.A05(optInt, optInt2, optLong, maxCappedArrayLength);
    }

    public final String A04() {
        String list = this.A02.get();
        if (list == null) {
            if (A04[0].charAt(21) != 'J') {
                throw new RuntimeException();
            }
            A04[7] = "Yd8WV87KlA8AS9IbyfadEkj";
            return A01(0, 2, 32);
        }
        return list;
    }

    public final synchronized JSONObject A05() {
        return this.A00;
    }

    public final synchronized void A06() {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.A01.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        this.A02.set(jSONArray.toString());
    }

    public final synchronized void A07(String str) {
        if (this.A01.size() >= C1S.A00()) {
            Iterator<String> it = this.A01.iterator();
            if (it.hasNext()) {
                this.A01.remove(it.next());
            }
        }
        this.A01.add(str);
        C6W.A03();
    }

    public final synchronized void A08(String str) throws JSONException {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                JSONArray jSONArray = new JSONArray(str);
                for (int i10 = 0; i10 < jSONArray.length() && i10 < C1S.A00(); i10++) {
                    this.A01.add(jSONArray.getString(i10));
                }
            }
        }
    }

    public final synchronized void A09(String str) {
        this.A01.remove(str);
        C6W.A03();
    }

    public final synchronized void A0B(JSONObject jSONObject) throws JSONException {
        C1S frequencyCappingData;
        String optString = jSONObject.optString(A01(29, 12, 70), null);
        if (optString == null) {
            return;
        }
        if (this.A00.has(optString) && (this.A00.get(optString) instanceof C1S)) {
            frequencyCappingData = (C1S) this.A00.get(optString);
        } else {
            frequencyCappingData = new C1S(optString);
        }
        A03(frequencyCappingData, jSONObject);
        this.A00.put(optString, frequencyCappingData);
    }
}
