package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public final class SA extends AsyncTask<String, Void, SB> {
    public static byte[] A05;
    public static String[] A06 = {"naFNcZuGe", "C9JAYYW4", "8H9N3VrVfLlJ9IUdYMoO", "YylQBw7bkupjVtNcwFivzoGwGcTau", "utPcy8I9vNMcCezdgtn", "ehhspVm5", "7sb5kaLRz1R8p", "m"};
    public static final String A07;
    public static final Set<String> A08;
    public C7j A00;
    public InterfaceC1107Rp A01;
    public S9 A02;
    public Map<String, String> A03;
    public Map<String, String> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final SB A00(String... strArr) {
        if (KQ.A02(this)) {
            return null;
        }
        String[] strArr2 = A06;
        if (strArr2[4].length() != strArr2[7].length()) {
            String[] strArr3 = A06;
            strArr3[3] = "OBWBCzNqNMhSgl0vUrcBODbII9DBW";
            strArr3[2] = "nuEeWi2rsMih0JuNdplL";
            try {
                String str = strArr[0];
                if (!TextUtils.isEmpty(str) && !A08.contains(str)) {
                    String A02 = A02(str);
                    if (this.A03 != null && !this.A03.isEmpty()) {
                        for (Map.Entry<String, String> entry : this.A03.entrySet()) {
                            A02 = A03(A02, entry.getKey(), entry.getValue());
                        }
                    }
                    int i10 = 1;
                    while (true) {
                        int i11 = i10 + 1;
                        if (i10 > 2) {
                            return null;
                        }
                        if (A06(A02)) {
                            return new SB(this.A01);
                        }
                        i10 = i11;
                    }
                }
                return null;
            } catch (Throwable th2) {
                KQ.A00(th2, this);
                return null;
            }
        }
        throw new RuntimeException();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 103);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{Field.MERGESEQ, Field.USERADDRESS, 43, 105, 56, 15, 15, 18, 15, Field.ADDRESSBLOCK, 18, 13, 24, 19, 20, 19, 26, Field.ADDRESSBLOCK, 8, 15, 17, Field.FORMCHECKBOX, Field.ADDRESSBLOCK, 15, 0, 15, 2, 1, 9, Field.AUTONUM, Field.DDE, Field.AUTONUMOUT, Field.AUTONUMOUT};
    }

    static {
        A04();
        A07 = SA.class.getSimpleName();
        A08 = new HashSet();
        A08.add(A01(0, 1, 15));
        A08.add(A01(29, 4, 63));
    }

    public SA(C7j c7j) {
        this(c7j, null, null);
    }

    public SA(C7j c7j, Map<String, String> extraData) {
        this(c7j, extraData, null);
    }

    public SA(C7j c7j, Map<String, String> extraData, Map<String, String> postData) {
        this.A00 = c7j;
        this.A03 = extraData != null ? new HashMap(extraData) : null;
        this.A04 = postData != null ? new HashMap(postData) : null;
    }

    private String A02(String str) {
        try {
            return A03(str, A01(23, 6, 9), LV.A01(this.A00.A03().A6P()));
        } catch (Exception unused) {
            return str;
        }
    }

    private String A03(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String A01 = A01(3, 1, 49);
        if (str.contains(A01)) {
            A01 = A01(1, 1, ShapeTypes.VERTICAL_SCROLL);
        }
        StringBuilder append = new StringBuilder().append(str).append(A01).append(str2);
        String prepend = A01(2, 1, 113);
        StringBuilder append2 = append.append(prepend);
        String prepend2 = URLEncoder.encode(str3);
        return append2.append(prepend2).toString();
    }

    private final void A05(SB response) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            if (this.A02 != null) {
                this.A02.AEf(response);
            }
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }

    private boolean A06(String str) {
        InterfaceC1107Rp AER;
        InterfaceC1108Rq A00 = S8.A00(this.A00);
        try {
            if (this.A04 == null || this.A04.size() == 0) {
                AER = A00.AER(str, new S4());
            } else {
                S4 params = new S4();
                params.A05(this.A04);
                AER = A00.AES(str, params.A08());
            }
            this.A01 = AER;
        } catch (Exception e10) {
            Log.e(A07, A01(4, 19, 26) + str, e10);
        }
        return this.A01 != null && this.A01.A8R() == 200;
    }

    public final void A07(S9 s92) {
        this.A02 = s92;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ SB doInBackground(String[] strArr) {
        if (KQ.A02(this)) {
            return null;
        }
        try {
            return A00(strArr);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        if (this.A02 != null) {
            this.A02.AEd();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(SB sb2) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            A05(sb2);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
