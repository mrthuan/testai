package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public class WT extends KY {
    public static byte[] A01;
    public static String[] A02 = {"Cp4y0jGzgjmlhNOtolFVOVefspLcmrKL", "5GK8sLOcHtszB", "AOLPTOXU9sJ8f7mkW5imzLW9uvMXwnIa", "cYEf6saXY9z3veQOBiLayO", "AetyrNGNYAsiijDpUFLgJdlj31dZpeYf", "GwgqZOf2k60xdBESFLM8urtE7U9bH", "vGNTznilo2MQ1OpS5sYGGd", "eyCkGrJdBkkJqznMzmMtN6FzCpyOGqXF"};
    public final /* synthetic */ C7j A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[4].charAt(20) == '2') {
                throw new RuntimeException();
            }
            A02[5] = "yU9Q3i2imseGifaShK33hUjg5wmSv";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 100);
            i13++;
        }
    }

    public static void A02() {
        A01 = new byte[]{4, 16, 14, -49, 7, 2, 4, 6, 3, 16, 16, 12, -49, 2, 5, 20, -49, -19, -16, -28, -30, -19, 0, -28, -16, -10, -17, -11, -26, -13, -12, -2, 1, -11, -13, -2, -15, -11, 1, 7, 0, 6, -9, 4, 5, -13, -21, -25, -7, -5, -8, -21, -22, -27, -7, -21, -7, -7, -17, -11, -12, -27, -17, -22, Field.INCLUDEPICTURE, 59, Field.IMPORT, Field.TOA, Field.MERGESEQ, Field.NOTEREF, 59, 58, Field.AUTONUMLGL, Field.TOA, 59, Field.TOA, Field.TOA, Field.BARCODE, Field.FILESIZE, Field.INCLUDETEXT, Field.AUTONUMLGL, 74, Field.BARCODE, Field.INCLUDEPICTURE, 59};
    }

    static {
        A02();
    }

    public WT(C7j c7j) {
        this.A00 = c7j;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        Map map;
        AtomicInteger atomicInteger;
        SharedPreferences sharedPreferences = null;
        try {
            sharedPreferences = this.A00.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A00(0, 31, 61), this.A00), 0);
            Map<String, ?> all = sharedPreferences.getAll();
            if (all.size() > 1) {
                JI.A06(this.A00, S8.A00(this.A00), all);
            }
            sharedPreferences.edit().clear().apply();
            sharedPreferences.edit().putString(A00(45, 19, 34), this.A00.A08().A02()).putString(A00(64, 21, 114), C0956Lu.A02(this.A00.A08().A01())).apply();
        } catch (JSONException e10) {
            this.A00.A07().AA0(A00(31, 14, 46), 3502, new C8F(e10));
            sharedPreferences.edit().clear().apply();
        }
        synchronized (JI.class) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            map = JI.A02;
            for (Map.Entry entry : map.entrySet()) {
                edit.putInt((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
            }
            edit.apply();
            atomicInteger = JI.A03;
            atomicInteger.set(2);
        }
    }
}
