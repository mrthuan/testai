package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.d0  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1505d0 implements AnonymousClass00 {
    public static byte[] A09;
    public static String[] A0A = {"jhQijRHeS2b3DC", "TrxlLGPRt74PJqIyPQ202SRMEezA", "IB0ZY9fOXgD7jLe6Y4PRk3dCNjPCK6", "H6fabJXG57DAkPtsQTSNUghzavXSaH69", "ufMT47zQTczJDi2Vdc2LdI1YLyWR3nOe", "Lk9ILhYpp3cxsVDBevZ7UGW4HuH86l", "wl", "vesbJwqYWy5viKlOFyHJIQca6g"};
    public static final String A0B;
    public final int A00;
    public final int A01;
    public final AnonymousClass08 A02;
    public final C0L A04;
    public final C7j A05;
    public final boolean A08;
    public final Map<String, File> A06 = Collections.synchronizedMap(new HashMap());
    public final Map<String, Semaphore> A07 = new HashMap();
    public final C0A A03 = new C0A();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0126: INVOKE  
      (r10v1 ?? I:com.facebook.ads.redexgen.X.0L)
      (r11 I:java.lang.String)
      (r12 I:int)
      (r13 I:java.lang.String)
      (r14 I:java.lang.Long)
      (r15 I:java.lang.Long)
      (r16 I:com.facebook.ads.redexgen.X.06)
     type: INTERFACE call: com.facebook.ads.redexgen.X.0L.AEs(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.06):void, block:B:43:0x011a */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0141: INVOKE  
      (r10v0 ?? I:com.facebook.ads.redexgen.X.0L)
      (r11 I:java.lang.String)
      (r12 I:int)
      (r13 I:java.lang.String)
      (r14 I:java.lang.Long)
      (r15 I:java.lang.Long)
      (r16 I:com.facebook.ads.redexgen.X.06)
     type: INTERFACE call: com.facebook.ads.redexgen.X.0L.AEs(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.06):void, block:B:49:0x0135 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0124: MOVE  (r16 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:43:0x011a */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x013f: MOVE  (r16 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:49:0x0135 */
    private File A02(AnonymousClass06 anonymousClass06, String str, String str2, int i10, AnonymousClass09 anonymousClass09) {
        AnonymousClass06 anonymousClass062;
        String AEs;
        AnonymousClass06 anonymousClass063;
        String AEs2;
        String A03 = A03(222, 22, 17);
        try {
            String str3 = str;
            long currentTimeMillis = System.currentTimeMillis();
            File file = new File(A01(this.A05), str2);
            C1501cw c1501cw = new C1501cw(file, new HM(C0877Im.A0P(this.A05)));
            if (c1501cw.A09()) {
                if (this.A08) {
                    String str4 = A03(49, 22, 36) + c1501cw.A00.getName();
                }
                this.A06.put(str3, file);
                c1501cw.A06();
                this.A04.AEt(str3, true, anonymousClass06);
                return file;
            }
            if (this.A08) {
                String str5 = A03(71, 26, 76) + c1501cw.A00.getName();
            }
            if (anonymousClass09.A04()) {
                this.A04.AEt(str3, false, anonymousClass06);
                for (int i11 = 0; i11 < this.A00; i11++) {
                    try {
                        C7j c7j = this.A05;
                        if (A0A[3].charAt(31) != '9') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A0A;
                        strArr[2] = "QJ6lhIf3SMnJsUHWjUzyv1yZJIRdgp";
                        strArr[5] = "f1TQksdEGnGezGtACwRIsNgGsb1lS2";
                        str3 = str3;
                        try {
                            A05(c7j, c1501cw, str3, i10, i11, currentTimeMillis);
                            break;
                        } catch (C0H e10) {
                            e = e10;
                            if (i11 == this.A00 - 1) {
                                A06(c1501cw);
                                if (e instanceof C1502cx) {
                                    throw ((C1502cx) e);
                                }
                                if (e instanceof C1499cu) {
                                    throw ((C1499cu) e);
                                }
                            }
                        }
                    } catch (C0H e11) {
                        e = e11;
                    }
                }
                int A032 = c1501cw.A03();
                c1501cw.A06();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                anonymousClass09.A00().A4q(file, this.A04);
                this.A06.put(str3, file);
                this.A04.AEs(str3, 2112, null, Long.valueOf(A032), Long.valueOf(currentTimeMillis2), anonymousClass06);
                return file;
            }
            return null;
        } catch (C1499cu e12) {
            this.A04.AEs(AEs2, 2113, e12.toString(), null, null, anonymousClass063);
            if (this.A08) {
                Log.e(A0B, A03, e12);
                return null;
            }
            return null;
        } catch (C1502cx e13) {
            this.A04.AEs(AEs, 2119, e13.toString(), null, null, anonymousClass062);
            if (this.A08) {
                Log.e(A0B, A03, e13);
                return null;
            }
            return null;
        }
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-95, -23, -30, -12, -95, -29, -26, -26, -17, -95, -22, -17, -11, -26, -13, -13, -10, -15, -11, -26, -27, -81, Byte.MIN_VALUE, 116, -70, -67, -64, -71, 116, -73, -64, -71, -75, -62, -71, -72, -114, 116, -52, -66, -33, 18, 18, 3, 11, 14, 18, -40, -66, -103, -73, -71, -66, -65, -60, -67, 118, -68, -65, -62, -69, 118, -71, -59, -61, -58, -62, -69, -54, -69, 118, -63, -33, -31, -26, -25, -20, -27, -98, -28, -25, -22, -29, -98, -20, -19, -14, -98, -31, -19, -21, -18, -22, -29, -14, -29, -98, -87, -57, -55, -50, -49, -44, -51, -122, -43, -52, -122, -121, -91, -78, 107, -72, 100, -89, -80, -77, -73, -87, 100, -89, -91, -89, -84, -87, 100, -86, -83, -80, -87, 114, -61, -31, -18, -89, -12, -96, -14, -27, -31, -28, -96, -31, -13, -13, -27, -12, -13, -82, -63, -33, -20, -91, -14, -98, -16, -29, -33, -30, -98, -22, -29, -20, -27, -14, -26, -98, -19, -28, -98, -124, -91, -84, -91, -76, -87, -82, -89, 96, -93, -95, -93, -88, -91, 96, -90, -87, -84, -91, 96, -95, -90, -76, -91, -78, 96, -91, -72, -93, -91, -91, -92, -87, -82, -89, 96, -78, -91, -76, -78, -71, 96, -95, -76, -76, -91, -83, -80, -76, -77, 122, 96, -120, -75, -75, -78, -75, 99, -90, -92, -90, -85, -84, -79, -86, 99, -73, -85, -88, 99, -87, -84, -81, -88, -89, -44, -44, -47, -44, -126, -59, -50, -57, -61, -48, -53, -48, -55, -126, -56, -53, -50, -57, -23, 22, 22, 19, 22, -60, 7, 16, 19, 23, 13, 18, 11, -60, 23, 19, 25, 22, 7, 9, -39, -2, -13, -1, -3, 0, -4, -11, 4, -11, -80, 2, -11, 3, 0, -1, -2, 3, -11, -66, 2, 32, Field.FILLIN, 23, Field.NUMCHARS, 21, -50, 34, 29, -50, 32, 19, 15, 18, -50, -31, -28, -18, -9, -83, -26, -23, -20, -27, -83, -29, -31, -29, -24, -27, -50, -32, -32, -46, -31, -89, -100, -100, -100, -77, -74, -71, -78, -121, 124, 124, 124, -82, -69, -79, -65, -68, -74, -79, -84, -82, -64, -64, -78, -63, 124};
    }

    static {
        A04();
        A0B = C1505d0.class.getSimpleName();
    }

    public C1505d0(C7j c7j, AnonymousClass08 anonymousClass08, C0L c0l) {
        this.A05 = c7j;
        this.A08 = anonymousClass08.A02();
        this.A00 = anonymousClass08.A00();
        this.A04 = c0l;
        this.A01 = anonymousClass08.A01();
        this.A02 = anonymousClass08;
    }

    public static C1503cy A00(Context context, String str) throws C0H {
        try {
            InputStream open = context.getAssets().open(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr, 0, bArr.length);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return new C1503cy(byteArrayOutputStream.toByteArray());
                }
            }
        } catch (IOException e10) {
            throw new C0H(A03(ShapeTypes.PLUS, 18, 78), e10);
        }
    }

    public static File A01(Context context) {
        return new File(context.getCacheDir(), A03(318, 15, 78));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0144 A[Catch: 0H -> 0x015f, all -> 0x01c6, TRY_LEAVE, TryCatch #14 {0H -> 0x015f, all -> 0x01c6, blocks: (B:12:0x007c, B:40:0x00f8, B:42:0x0100, B:50:0x0144, B:56:0x0157, B:48:0x013e), top: B:111:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148 A[Catch: 0H -> 0x009a, all -> 0x01fa, TRY_ENTER, TryCatch #15 {0H -> 0x009a, all -> 0x01fa, blocks: (B:9:0x0051, B:17:0x008b, B:54:0x0151, B:59:0x0162, B:51:0x0148, B:53:0x014e, B:45:0x0130, B:46:0x0137), top: B:109:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0157 A[Catch: 0H -> 0x015f, all -> 0x01c6, TRY_ENTER, TRY_LEAVE, TryCatch #14 {0H -> 0x015f, all -> 0x01c6, blocks: (B:12:0x007c, B:40:0x00f8, B:42:0x0100, B:50:0x0144, B:56:0x0157, B:48:0x013e), top: B:111:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A05(android.content.Context r24, com.facebook.ads.redexgen.X.C1501cw r25, java.lang.String r26, int r27, int r28, long r29) throws com.facebook.ads.redexgen.X.C0H {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1505d0.A05(android.content.Context, com.facebook.ads.redexgen.X.cw, java.lang.String, int, int, long):void");
    }

    private void A06(C1501cw c1501cw) {
        try {
            File A04 = c1501cw.A04();
            if (A04.exists()) {
                c1501cw.A06();
                boolean delete = A04.delete();
                if (this.A08) {
                    Log.i(A0B, A03(ShapeTypes.ACTION_BUTTON_DOCUMENT, 52, 14) + delete);
                }
            }
        } catch (Exception e10) {
            if (A0A[0].length() != 14) {
                throw new RuntimeException();
            }
            A0A[3] = "fJTJjiotuyJvZrF72L8221tI8VUznJb9";
            if (this.A08) {
                Log.e(A0B, A03(108, 23, 18), e10);
            }
        }
    }

    private boolean A07(C1501cw c1501cw) {
        try {
            c1501cw.A05();
            if (A0A[4].charAt(27) != 'R') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[7] = "zmS4hUlvHkaHxqc9Vg18exvolw";
            strArr[6] = "qC";
            return true;
        } catch (C1499cu e10) {
            if (this.A08) {
                Log.e(A0B, A03(244, 19, 48), e10);
                return false;
            }
            return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.09 != com.facebook.ads.cache.config.CacheRequestConfig<T> */
    public final <T> AnonymousClass02<T> A08(AnonymousClass06 anonymousClass06, AnonymousClass09<T> anonymousClass09) {
        Semaphore semaphore;
        if (anonymousClass09.A03()) {
            File file = this.A06.get(anonymousClass06.A09);
            if (file != null) {
                this.A04.AEt(anonymousClass06.A09, true, anonymousClass06);
                return anonymousClass09.A00().A3i(file, this.A04);
            }
            this.A04.AEt(anonymousClass06.A09, false, anonymousClass06);
            return new AnonymousClass02<>(false, null);
        }
        String str = anonymousClass06.A09;
        String str2 = anonymousClass06.A04;
        StringBuilder sb2 = new StringBuilder();
        String baseUrl = this.A03.A03(str);
        String extension = sb2.append(baseUrl).append(str2).toString();
        synchronized (this.A07) {
            semaphore = this.A07.get(extension);
            if (semaphore == null) {
                semaphore = new Semaphore(1);
                this.A07.put(extension, semaphore);
            }
            try {
            } catch (Throwable th2) {
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(extension);
                    throw th2;
                }
            }
        }
        try {
            semaphore.acquire();
            File A02 = A02(anonymousClass06, str, extension, this.A01, anonymousClass09);
            if (A02 != null) {
                AnonymousClass02<T> A3i = anonymousClass09.A00().A3i(A02, this.A04);
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(extension);
                }
                return A3i;
            }
            AnonymousClass02<T> anonymousClass02 = new AnonymousClass02<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(extension);
            }
            return anonymousClass02;
        } catch (InterruptedException unused) {
            if (this.A08) {
                StringBuilder sb3 = new StringBuilder();
                String baseUrl2 = A03(97, 11, 52);
                StringBuilder append = sb3.append(baseUrl2).append(str);
                String baseUrl3 = A03(0, 22, 79);
                append.append(baseUrl3).toString();
            }
            AnonymousClass02<T> anonymousClass022 = new AnonymousClass02<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(extension);
                return anonymousClass022;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass00
    public final AnonymousClass02<Bitmap> AFl(AnonymousClass06 anonymousClass06, boolean z10) {
        return A08(anonymousClass06, new AnonymousClass09(new C1508d3(anonymousClass06.A01, anonymousClass06.A00, this.A02.A04(), this.A02.A03(), z10)));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.09 != com.facebook.ads.cache.config.CacheRequestConfig<java.io.File> */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass00
    public final File AFm(AnonymousClass06 anonymousClass06) {
        AnonymousClass09 anonymousClass09 = new AnonymousClass09(new C1507d2());
        anonymousClass09.A01(true);
        anonymousClass09.A02(false);
        return (File) A08(anonymousClass06, anonymousClass09).A00();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass00
    public final String AFn(AnonymousClass06 anonymousClass06) {
        return (String) A08(anonymousClass06, new AnonymousClass09(new C1506d1())).A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.09 != com.facebook.ads.cache.config.CacheRequestConfig<java.lang.String> */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass00
    public final String AFo(AnonymousClass06 anonymousClass06) {
        AnonymousClass09 anonymousClass09 = new AnonymousClass09(new C1506d1());
        anonymousClass09.A01(true);
        anonymousClass09.A02(false);
        return (String) A08(anonymousClass06, anonymousClass09).A00();
    }
}
