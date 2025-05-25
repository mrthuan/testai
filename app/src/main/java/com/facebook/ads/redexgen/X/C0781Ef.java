package com.facebook.ads.redexgen.X;

import android.database.Cursor;
import android.util.Log;
import android.util.Pair;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Ef  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0781Ef implements ZM {
    public static byte[] A03;
    public static String[] A04 = {"u3ex4KQMIW041lf", "3AptpGjhH", "gmUldlaQs1iDW8SjyulR1SveXx4W0WHx", "1qDQcvNZxrP96rda7KCur1LyuVNWU8kp", "CAWPS90lsy", "t8qLCZBFlDEhGKoHyGYF6SljofbMSV", "olmaGtOYwcY5nta5it0d5AQEWYClhN", "QuuHkAQHaV7iF"};
    public boolean A00 = true;
    public final C1313Zr A01;
    public final C06207s A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-37, -7, 6, -65, 12, -72, -4, -3, 4, -3, 12, -3, -72, -7, 12, 12, -3, 5, 8, 12, 11, -72, -3, 16, -5, -3, -3, -4, -3, -4, -72, -3, 14, -3, 6, 12, 11, -58, -87, -84, -66, -79, -84, -1, 18, 18, 3, 11, 14, 18, 8, 5, 24, 5, -75, -80, -33, -47, -33, -33, -43, -37, -38, -53, -43, -48, -51, -65, -51, -51, -61, -55, -56, -71, -50, -61, -57, -65, 18, 7, 11, 3, 3, -2, -6, -12, -3, -18, -8, -13, -18, -13, -22, -33};
    }

    static {
        A04();
    }

    public C0781Ef(C1313Zr c1313Zr) {
        this.A01 = c1313Zr;
        this.A02 = new C06207s(c1313Zr);
    }

    private JSONArray A01(Cursor cursor) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(54, 2, 12), cursor.getString(C1312Zq.A04.A00));
            jSONObject.put(A00(82, 8, 79), cursor.getString(C1312Zq.A09.A00));
            jSONObject.put(A00(90, 4, 58), cursor.getString(C1312Zq.A0A.A00));
            jSONObject.put(A00(78, 4, 94), C0956Lu.A02(cursor.getDouble(C1312Zq.A08.A00)));
            jSONObject.put(A00(66, 12, 26), C0956Lu.A02(cursor.getDouble(C1312Zq.A07.A00)));
            jSONObject.put(A00(56, 10, 44), cursor.getString(C1312Zq.A06.A00));
            String string = cursor.getString(C1312Zq.A03.A00);
            jSONObject.put(A00(50, 4, 100), string != null ? new JSONObject(string) : new JSONObject());
            jSONObject.put(A00(43, 7, 94), cursor.getString(C1312Zq.A02.A00));
            jSONObject.put(A00(38, 5, 8), this.A01.A03().A7f());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    private JSONArray A02(Cursor cursor) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(54, 2, 12), cursor.getString(2));
            jSONObject.put(A00(82, 8, 79), cursor.getString(0));
            jSONObject.put(A00(90, 4, 58), cursor.getString(4));
            jSONObject.put(A00(78, 4, 94), C0956Lu.A02(cursor.getDouble(5)));
            jSONObject.put(A00(66, 12, 26), C0956Lu.A02(cursor.getDouble(6)));
            jSONObject.put(A00(56, 10, 44), cursor.getString(7));
            String string = cursor.getString(8);
            jSONObject.put(A00(50, 4, 100), string != null ? new JSONObject(string) : new JSONObject());
            jSONObject.put(A00(43, 7, 94), cursor.getString(9));
            jSONObject.put(A00(38, 5, 8), this.A01.A03().A7f());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static JSONObject A03(Cursor cursor) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        while (cursor.moveToNext()) {
            jSONObject.put(cursor.getString(C1311Zp.A03.A00), cursor.getString(C1311Zp.A02.A00));
        }
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass90
    public final int A4e(int i10) {
        int i11 = 0;
        if (i10 > -1) {
            try {
                i11 = this.A02.A08(i10);
            } catch (Exception e10) {
                if (this.A01.A04().A9O()) {
                    Log.e(ZM.A00, A00(0, 38, 88), e10);
                }
            }
        }
        this.A02.A0I();
        if (this.A00) {
            this.A02.A0J();
        }
        return i11;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass91
    public final void A4f() {
        this.A02.A0H();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass90
    public final boolean A5P(String str) {
        return this.A02.A0K(str);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass90
    public final JSONArray A6M() {
        Cursor cursor = null;
        try {
            cursor = this.A02.A0A();
            JSONArray jSONArray = null;
            if (cursor.getCount() > 0) {
                jSONArray = A01(cursor);
            }
            if (cursor != null) {
                cursor.close();
            }
            return jSONArray;
        } catch (JSONException unused) {
            if (cursor != null) {
                cursor.close();
                return null;
            }
            return null;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass90
    public final JSONObject A6N() {
        Cursor cursor = null;
        try {
            cursor = this.A02.A0B();
            JSONObject jSONObject = null;
            if (cursor.getCount() > 0) {
                jSONObject = A03(cursor);
            }
            if (cursor != null) {
                cursor.close();
            }
            return jSONObject;
        } catch (JSONException unused) {
            if (cursor != null) {
                cursor.close();
                return null;
            }
            return null;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass90
    public final int A7N() {
        Cursor cursor = null;
        try {
            cursor = this.A02.A09();
            return cursor.moveToFirst() ? cursor.getInt(0) : 0;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass90
    public final String A7Q(String str) {
        String str2 = null;
        Cursor A0D = this.A02.A0D(str);
        if (A0D != null) {
            boolean moveToNext = A0D.moveToNext();
            String[] strArr = A04;
            String str3 = strArr[4];
            String eventType = strArr[0];
            if (str3.length() == eventType.length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "rCLG4kGmKo";
            strArr2[0] = "2rihfjjJxsL3teC";
            if (moveToNext && A0D.getCount() > 0) {
                String eventType2 = C1312Zq.A0A.A01;
                str2 = A0D.getString(A0D.getColumnIndex(eventType2));
            }
            A0D.close();
        }
        return str2;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass90
    public final Pair<JSONObject, JSONArray> A8X(int i10) {
        Cursor cursor = null;
        try {
            try {
                cursor = this.A02.A0C(i10);
                JSONArray events = null;
                JSONObject tokens = null;
                if (cursor.getCount() > 0) {
                    tokens = A03(cursor);
                    events = A02(cursor);
                }
                Pair<JSONObject, JSONArray> pair = new Pair<>(tokens, events);
                if (cursor != null) {
                    cursor.close();
                }
                return pair;
            } catch (JSONException unused) {
                Pair<JSONObject, JSONArray> pair2 = new Pair<>(null, null);
                if (cursor != null) {
                    cursor.close();
                }
                return pair2;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass90
    public final boolean A9B(String str) {
        return this.A02.A0L(str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8y != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass91
    public final void AHh(J4 j42, AbstractC06498y<String> abstractC06498y) {
        this.A02.A0G(j42.A08(), j42.A05().A00, j42.A06().toString(), j42.A04(), j42.A03(), j42.A07(), j42.A09(), abstractC06498y);
    }
}
