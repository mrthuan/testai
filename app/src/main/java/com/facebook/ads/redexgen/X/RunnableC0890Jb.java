package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Jb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0890Jb implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ C7j A00;
    public final /* synthetic */ C0893Je A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-66, -58, -72, -6, -5, 5, 6, 1, 4, 11, 3, -10, 1, 0, 3, 5, -6, -1, -8, -38, -51, -39, -35, -51, -37, -36, -57, -47, -52};
    }

    public RunnableC0890Jb(C0893Je c0893Je, String str, C7j c7j) {
        this.A01 = c0893Je;
        this.A02 = str;
        this.A00 = c7j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        List list2;
        ArrayList arrayList;
        List list3;
        int i10;
        int i11;
        int i12;
        if (KQ.A02(this)) {
            return;
        }
        try {
            C8F nvl = new C8F(A00(0, 3, 84));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(A00(3, 7, 118), jSONArray);
            jSONObject.put(A00(19, 10, 76), this.A02);
            list = this.A01.A0D;
            synchronized (list) {
                list2 = this.A01.A0D;
                arrayList = new ArrayList(list2);
                list3 = this.A01.A0D;
                list3.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0892Jd c0892Jd = (C0892Jd) it.next();
                StringBuilder append = new StringBuilder().append(A00(0, 0, 23));
                i10 = c0892Jd.A00;
                StringBuilder append2 = append.append(i10).append(';');
                i11 = c0892Jd.A02;
                StringBuilder append3 = append2.append(i11).append(';');
                i12 = c0892Jd.A01;
                jSONArray.put(append3.append(i12).toString());
            }
            nvl.A07(jSONObject);
            nvl.A05(1);
            this.A00.A07().AA1(A00(10, 9, 117), C8E.A2R, nvl);
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
