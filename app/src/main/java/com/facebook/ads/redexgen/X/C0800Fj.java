package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.hpsf.Constants;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Fj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0800Fj extends AbstractC1437bu {
    public static byte[] A03;
    public long A00;
    public View A01;
    public C0783Ei A02;

    static {
        A05();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 81);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{20, 23, Field.ASK, -15, -16, -3, -3, -12, 1, -18, 1, -12, -11, 1, -12, 2, -9, -18, 3, -8, -4, -12, -5, 0, -7, 1, 6, -9, 8, -7, 10, -7, 5, 11, Field.ASK, Field.IMPORT, Field.NUMWORDS, Field.DATA, Field.DATA, Field.PAGEREF, Field.DATA, -42, Field.DDE, 30, 31, 34, Field.NUMWORDS, -42, Field.ASK, 23, Field.DATA, 41, 31, 36, 29, -42, 25, 30, 23, 31, 36, Field.NUMWORDS, 26, -42, 23, 26, 41, -42, -8, 23, 36, 36, Field.NUMWORDS, Field.DATA};
    }

    public C0800Fj(C0783Ei c0783Ei, C04761t c04761t) {
        super(c0783Ei, c04761t);
        this.A00 = 10000L;
        this.A02 = c0783Ei;
    }

    private C1440bx A01(Runnable runnable) {
        return new C1440bx(this, runnable);
    }

    private List<JSONObject> A04(C04771u c04771u) {
        ArrayList arrayList = new ArrayList();
        JSONObject A032 = c04771u.A03();
        String A033 = A03(22, 12, 71);
        if (A032.has(A033)) {
            try {
                this.A00 = A032.getJSONObject(A033).optInt(A03(3, 19, 62), Constants.CP_MAC_ROMAN);
                JSONArray adsArray = A032.getJSONArray(A03(0, 3, 98));
                if (adsArray.length() > 0) {
                    for (int i10 = 0; i10 < adsArray.length(); i10++) {
                        arrayList.add((JSONObject) adsArray.get(i10));
                    }
                }
            } catch (JSONException unused) {
                String A034 = A03(36, 38, 101);
                this.A02.A0E().A5F(C0894Jg.A01(AdErrorType.UNKNOWN_ERROR, A034).A03().getErrorCode(), A034);
                return arrayList;
            }
        } else {
            arrayList.add(A032);
        }
        return arrayList;
    }

    private void A06(InterfaceC1484cf interfaceC1484cf, JSONObject jSONObject, C8X c8x) {
        this.A0C = false;
        C1439bw c1439bw = new C1439bw(this, interfaceC1484cf, LV.A02(jSONObject, A03(34, 2, 114)));
        A0G().postDelayed(c1439bw, c8x.A05());
        interfaceC1484cf.A9p(this.A02, this.A09, this.A08.A08, A01(c1439bw), jSONObject, c8x);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1437bu
    public final void A0O() {
        if (this.A01 != null) {
            this.A02.A0E().A4K();
            this.A07.A0E(this.A01);
            return;
        }
        this.A02.A0E().A4L();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1437bu
    public final void A0Q(InterfaceC04460p interfaceC04460p, C8W c8w, C8U c8u, final C04771u c04771u) {
        this.A02.A0E().A4E();
        final InterfaceC1484cf interfaceC1484cf = (InterfaceC1484cf) interfaceC04460p;
        if (interfaceC1484cf.AH5()) {
            final List<JSONObject> A04 = A04(c04771u);
            A06(interfaceC1484cf, A04.get(0), c04771u.A01());
            if (A04.size() > 1) {
                A0G().postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.1v
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0800Fj.this.A0Z(interfaceC1484cf, A04, c04771u);
                    }
                }, this.A00);
                return;
            }
            return;
        }
        A06(interfaceC1484cf, c04771u.A03(), c04771u.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1437bu
    public final void A0T(String str) {
        this.A02.A0E().A4J(str != null);
        super.A0T(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1437bu
    public final void A0X(boolean z10) {
        super.A0X(z10);
        this.A01 = null;
    }

    public final /* synthetic */ void A0Z(InterfaceC1484cf interfaceC1484cf, List list, C04771u c04771u) {
        A06(interfaceC1484cf, (JSONObject) list.get(1), c04771u.A01());
    }
}
