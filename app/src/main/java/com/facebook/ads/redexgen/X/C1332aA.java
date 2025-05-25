package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.aA  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1332aA extends KY {
    public static byte[] A01;
    public static String[] A02 = {"QJHZKkwEEt2XAA8qb811yZkloXTxKqNm", "0Eo8hyAH95ZWxpQDtz3kXr2Dg2BAnbpt", "yx1IzqDtrK1i7eGrpZodHZ", "KUuZPkausU2VOaHnsIAk0Hn07pOf06lA", "ddvRVBlQrtqHFM3JEeiDXs23nPXnVLtA", "0N8fJtCAvq63STI6q3YZ9dLrj33X3xUc", "d0kigy9sFkFC2aZLzfYLsKXCuWX9Z7p3", "u6xVOdZhMjB663K3VBvQukbaw71N5v3b"};
    public final /* synthetic */ AnonymousClass65 A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] ^ i12) ^ 122;
            if (A02[2].length() != 22) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[3] = "wsWgA7V3OPhtM2agFx6R9FkGRpDQ8hFC";
            strArr[5] = "5QDbKue07C6BH4ozhF9MSdyiVJUT25MO";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{43, Field.SYMBOL, Field.SYMBOL, Field.GLOSSARY, Field.USERADDRESS, Field.SYMBOL};
    }

    static {
        A02();
    }

    public C1332aA(AnonymousClass65 anonymousClass65) {
        this.A00 = anonymousClass65;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        Handler handler;
        JSONObject jSONObject;
        C05906f c05906f;
        String str;
        String str2;
        try {
            jSONObject = this.A00.A05;
            JSONArray jSONArray = jSONObject.getJSONArray(A00(0, 6, 48));
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                AnonymousClass63 assetData = AnonymousClass63.A00(jSONArray.getJSONObject(i10));
                this.A00.A09(assetData.A04, assetData);
            }
            c05906f = this.A00.A02;
            C1334aC c1334aC = new C1334aC(this);
            str = this.A00.A04;
            str2 = this.A00.A03;
            c05906f.A0W(c1334aC, new C6Y(str, str2));
        } catch (JSONException unused) {
            handler = this.A00.A00;
            handler.post(new C1333aB(this));
        }
    }
}
