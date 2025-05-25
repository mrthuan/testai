package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.os.Build;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.8l  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06368l {
    public static String A00;
    public static LM A01;
    public static byte[] A02;
    public static String[] A03 = {"voSC7", "XZAhka0CvCOYv4I2O5x3YaAw3CbuYBFN", "p9gqIJ2nr", "98tXqko6jTMLdbqfVFP5nvRcnbiOcAti", "T2H4NPeAA8j3XC4jkS0zz8rIAu9TBODq", "PgqQ", "DWYdqAxgZwpx5TFll0r56voildH8EXHj", "oGCSEutn0BLuvxJJ07JBH6t"};
    public static final Map<String, Integer> A04;
    public static final AtomicInteger A05;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[3].charAt(19) != strArr[6].charAt(19)) {
                throw new RuntimeException();
            }
            A03[1] = "U3LMWoXZ5NcjJWeamIlVlKUbevsxyVyN";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 91);
            i13++;
        }
    }

    public static void A05() {
        A02 = new byte[]{115, 6, 1, 23};
    }

    static {
        A05();
        A00 = null;
        A05 = new AtomicInteger(0);
        A04 = new HashMap();
    }

    public static synchronized LM A00(C7j c7j) {
        LM lm2;
        synchronized (C06368l.class) {
            if (A01 == null) {
                A01 = LN.A00(c7j);
            }
            lm2 = A01;
        }
        return lm2;
    }

    public static Integer A01(String str) {
        synchronized (A04) {
            Integer num = A04.get(str);
            if (num == null) {
                return 0;
            }
            return num;
        }
    }

    public static void A06(C7j c7j, String str, Map<String, String> params) {
        String str2;
        if (A0A(c7j)) {
            str2 = C0921Kj.A03(str);
        } else {
            str2 = A00;
        }
        if (str2 != null) {
            String fingerprint = A02(1, 3, 28);
            params.put(fingerprint, str2);
        }
    }

    public static void A07(final C7j c7j, boolean z10) {
        if (!A05.compareAndSet(0, 1)) {
            return;
        }
        A00(c7j);
        try {
            final SharedPreferences A002 = KJ.A00(c7j);
            final C8O c8o = new C8O(c7j);
            final String str = Build.FINGERPRINT + A02(0, 1, 19) + c8o.A06();
            A00 = A002.getString(str, null);
            FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: com.facebook.ads.redexgen.X.8k
                public static byte[] A04;
                public static String[] A05 = {"dMyKB8n8mY8sFmfmCsf5VwvZBLoVpPiR", "TBvdqjLuIRaxglwGY5TjNnUOxCNoUnNv", "FK0GmuaP9q8EyodOlfs4PJ6Rrg0VVoxV", "1UM", "Fv6ZlsmxNYwaZ6XY1w8nvtw6Sd1Ai0k0", "lERcqI9wEyu6Ta8yIDBCfbsl7aq4DQ3Q", "fq", "Qdyh6wSbko6o8Mj4qT2RTqVvwzMlz"};

                public static String A01(int i10, int i11, int i12) {
                    byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
                    for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                        copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 46);
                    }
                    return new String(copyOfRange);
                }

                public static void A02() {
                    A04 = new byte[]{Field.PAGEREF, 105, 103, 122, 105, 121, 61, Field.EQ, Field.MACROBUTTON, 112, Field.BARCODE, 48, 58, 44, Field.EQ, Field.IMPORT, 58, 112, Field.DATA, 59, 48, 58, Field.IMPORT, 48, Field.SYMBOL, 48, 32, Field.GOTOBUTTON, Field.QUOTE, 58, Field.USERADDRESS, Field.DDEAUTO, Field.EQ, 58, Field.USERADDRESS, 99, 97, 106, 97, 118, 109, 103};
                }

                static {
                    A02();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
                    if (r1.equals(r0) != false) goto L19;
                 */
                @Override // java.util.concurrent.Callable
                /* renamed from: A00 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Boolean call() throws java.lang.Exception {
                    /*
                        Method dump skipped, instructions count: 246
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.CallableC06358k.call():java.lang.Boolean");
                }
            });
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z10) {
                futureTask.get();
            }
        } catch (Exception unused) {
            A05.set(0);
        }
    }

    public static void A08(C7j c7j, boolean z10, String str) {
        if (A0A(c7j)) {
            A09(c7j, z10, str);
        } else {
            A07(c7j, z10);
        }
    }

    public static void A09(C7j c7j, boolean z10, final String str) {
        if (str == null) {
            str = c7j.getPackageName();
        }
        if (A0B(str)) {
            return;
        }
        A00(c7j);
        final C0921Kj c0921Kj = new C0921Kj(c7j, str);
        try {
            c0921Kj.A06();
            FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: com.facebook.ads.redexgen.X.8j
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* renamed from: A00 */
                public final Boolean call() throws Exception {
                    Map map;
                    Map map2;
                    C0921Kj.this.A05();
                    map = C06368l.A04;
                    synchronized (map) {
                        map2 = C06368l.A04;
                        map2.put(str, 2);
                    }
                    return true;
                }
            });
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z10) {
                futureTask.get();
            }
        } catch (Exception unused) {
            synchronized (A04) {
                A04.put(str, 0);
            }
        }
    }

    public static boolean A0A(C7j c7j) {
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            boolean A2g = C0877Im.A2g(c7j);
            if (A03[4].charAt(29) == 'E') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "Hubg";
            strArr[0] = "jm3dJ";
            if (!A2g) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0B(String str) {
        synchronized (A04) {
            int status = A01(str).intValue();
            if (status != 0) {
                return true;
            }
            A04.put(str, 1);
            return false;
        }
    }
}
