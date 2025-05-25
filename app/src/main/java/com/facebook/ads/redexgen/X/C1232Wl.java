package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;
import android.util.Log;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.TreeSet;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Wl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1232Wl implements HP {
    public static boolean A06;
    public static byte[] A07;
    public static String[] A08 = {"a", "OPKdUZ", "FA3afr", "VpzN4TRMQVrL1VTjAcAjDBVhYJ", "1", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "FJC", "ewZDjNMmwL0Ej173ZiyKA"};
    public static final HashSet<File> A09;
    public long A00;
    public boolean A01;
    public final InterfaceC1234Wn A02;
    public final HX A03;
    public final File A04;
    public final HashMap<String, ArrayList<HO>> A05;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 84);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A07 = new byte[]{14, 33, 32, 59, Field.FILLIN, 42, 61, 111, Field.NUMCHARS, Field.ASK, 34, Field.BARCODE, Field.QUOTE, 42, 12, Field.DDEAUTO, 44, Field.FILLIN, 42, 111, Field.ASK, 33, 60, 59, Field.DDEAUTO, 33, 44, 42, 111, 58, 60, 42, 60, 111, 59, Field.FILLIN, 42, 111, 41, 32, Field.QUOTE, 43, 42, 61, 117, 111, 115, Field.TOA, 77, 80, 76, Field.FILESIZE, 99, Field.SECTION, Field.INCLUDEPICTURE, Field.NOTEREF, Field.FILESIZE, 9, Field.MACROBUTTON, Field.IMPORT, 42, Field.AUTONUM, Field.BARCODE, 25, 59, Field.SYMBOL, Field.GOTOBUTTON, Field.BARCODE, 116, Field.MACROBUTTON, Field.AUTONUMOUT, Field.MACROBUTTON, Field.DDEAUTO, Field.MACROBUTTON, 59, Field.AUTONUM, Field.MACROBUTTON, 32, Field.BARCODE, 114, 115, 123, Field.BIDIOUTLINE, Field.FORMCHECKBOX, Field.LISTNUM, Field.SECTION, Field.FORMTEXT, Field.AUTOTEXT, 8, Field.SECTION, Field.FORMTEXT, 76, 77, 80, 8, 78, Field.SECTION, Field.INCLUDETEXT, 77, 8, 78, Field.TOA, Field.SECTION, Field.INCLUDETEXT, 77, 76, Field.PAGEREF, Field.FILLIN, Field.PAGEREF, Field.DDEAUTO, Field.QUOTE, 34, 25, Field.PAGEREF, 41, Field.DATA, Field.GOTOBUTTON, Field.QUOTE, Field.DATA, Field.GOTOBUTTON, 25, Field.GLOSSARY, Field.DATA, 34, Field.QUOTE, Field.USERADDRESS, 104, Field.QUOTE, Field.USERADDRESS, Field.GLOSSARY};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.HP
    public final synchronized void A4j(File file) throws HN {
        AbstractC0844Hf.A04(!this.A01);
        C1231Wk A00 = C1231Wk.A00(file, this.A03);
        AbstractC0844Hf.A04(A00 != null);
        HW A092 = this.A03.A09(A00.A04);
        AbstractC0844Hf.A01(A092);
        AbstractC0844Hf.A04(A092.A0D());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long A002 = AbstractC0839Ha.A00(A092.A05());
            if (A002 != -1) {
                AbstractC0844Hf.A04(A00.A02 + A00.A01 <= A002);
            }
            A0A(A00);
            this.A03.A0G();
            notifyAll();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.HP
    public final synchronized NavigableSet<HT> A6f(String str) {
        HW A092;
        AbstractC0844Hf.A04(!this.A01);
        A092 = this.A03.A09(str);
        return (A092 == null || A092.A0C()) ? new TreeSet() : new TreeSet((Collection) A092.A08());
    }

    static {
        A06();
        A09 = new HashSet<>();
    }

    public C1232Wl(File file, InterfaceC1234Wn interfaceC1234Wn) {
        this(file, interfaceC1234Wn, null, false);
    }

    public C1232Wl(File file, InterfaceC1234Wn interfaceC1234Wn, HX hx) {
        if (A0D(file)) {
            this.A04 = file;
            this.A02 = interfaceC1234Wn;
            this.A03 = hx;
            this.A05 = new HashMap<>();
            ConditionVariable conditionVariable = new ConditionVariable();
            new C0841Hc(this, A03(57, 24, 14), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A03(0, 46, 27) + file);
    }

    public C1232Wl(File file, InterfaceC1234Wn interfaceC1234Wn, byte[] bArr, boolean z10) {
        this(file, interfaceC1234Wn, new HX(file, bArr, z10));
    }

    private C1231Wk A00(String str, long j10) throws HN {
        C1231Wk span;
        HW A092 = this.A03.A09(str);
        if (A092 == null) {
            return C1231Wk.A02(str, j10);
        }
        while (true) {
            span = A092.A06(j10);
            if (!span.A05 || span.A03.exists()) {
                break;
            }
            A05();
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.HP
    /* renamed from: A01 */
    public final synchronized C1231Wk AGw(String str, long j10) throws InterruptedException, HN {
        C1231Wk span;
        while (true) {
            span = AGx(str, j10);
            if (span == null) {
                wait();
            }
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.HP
    /* renamed from: A02 */
    public final synchronized C1231Wk AGx(String str, long j10) throws HN {
        AbstractC0844Hf.A04(!this.A01);
        C1231Wk A00 = A00(str, j10);
        if (A00.A05) {
            C1231Wk cacheSpan = this.A03.A09(str).A07(A00);
            A0C(A00, cacheSpan);
            return cacheSpan;
        }
        HW A0A = this.A03.A0A(str);
        if (A0A.A0D()) {
            return null;
        }
        A0A.A0B(true);
        return A00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            return;
        }
        this.A03.A0E();
        File[] listFiles = this.A04.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (!file.getName().equals(A03(106, 24, 18))) {
                C1231Wk A00 = file.length() > 0 ? C1231Wk.A00(file, this.A03) : null;
                if (A00 != null) {
                    A0A(A00);
                } else {
                    file.delete();
                }
            }
        }
        this.A03.A0F();
        try {
            this.A03.A0G();
        } catch (HN e10) {
            Log.e(A03(46, 11, 116), A03(81, 25, 124), e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b8, code lost:
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A05() throws com.facebook.ads.redexgen.X.HN {
        /*
            r6 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.facebook.ads.redexgen.X.HX r0 = r6.A03
            java.util.Collection r0 = r0.A0D()
            java.util.Iterator r5 = r0.iterator()
        Lf:
            boolean r4 = r5.hasNext()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1232Wl.A08
            r0 = 4
            r1 = r2[r0]
            r0 = 3
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lb3
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1232Wl.A08
            java.lang.String r1 = "8RyyWH2sXbvtcybyvpgGuaSQPyMb"
            r0 = 7
            r2[r0] = r1
            if (r4 == 0) goto L72
            java.lang.Object r4 = r5.next()
            com.facebook.ads.redexgen.X.HW r4 = (com.facebook.ads.redexgen.X.HW) r4
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1232Wl.A08
            r0 = 4
            r1 = r2[r0]
            r0 = 3
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lb3
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1232Wl.A08
            java.lang.String r1 = "W"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "2"
            r0 = 0
            r2[r0] = r1
            java.util.TreeSet r0 = r4.A08()
            java.util.Iterator r0 = r0.iterator()
        L5a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lf
            java.lang.Object r2 = r0.next()
            com.facebook.ads.redexgen.X.HT r2 = (com.facebook.ads.redexgen.X.HT) r2
            java.io.File r1 = r2.A03
            boolean r1 = r1.exists()
            if (r1 != 0) goto L5a
            r3.add(r2)
            goto L5a
        L72:
            r4 = 0
        L73:
            int r5 = r3.size()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1232Wl.A08
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 7
            if (r1 == r0) goto L99
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1232Wl.A08
            java.lang.String r1 = "axYd4LGkVmpVYJMnCXpGOxz9igUktz"
            r0 = 6
            r2[r0] = r1
            if (r4 >= r5) goto La8
        L8c:
            java.lang.Object r1 = r3.get(r4)
            com.facebook.ads.redexgen.X.HT r1 = (com.facebook.ads.redexgen.X.HT) r1
            r0 = 0
            r6.A08(r1, r0)
            int r4 = r4 + 1
            goto L73
        L99:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1232Wl.A08
            java.lang.String r1 = "FKJgoO"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "R9ON5m"
            r0 = 2
            r2[r0] = r1
            if (r4 >= r5) goto La8
            goto L8c
        La8:
            com.facebook.ads.redexgen.X.HX r0 = r6.A03
            r0.A0F()
            com.facebook.ads.redexgen.X.HX r0 = r6.A03
            r0.A0G()
            return
        Lb3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1232Wl.A05():void");
    }

    private void A07(HT ht) {
        ArrayList<HO> arrayList = this.A05.get(ht.A04);
        if (arrayList != null) {
            for (int i10 = arrayList.size() - 1; i10 >= 0; i10--) {
                arrayList.get(i10).ADf(this, ht);
            }
        }
        this.A02.ADf(this, ht);
    }

    private void A08(HT ht, boolean z10) throws HN {
        HW A092 = this.A03.A09(ht.A04);
        if (A092 == null || !A092.A0E(ht)) {
            return;
        }
        long j10 = this.A00;
        String[] strArr = A08;
        if (strArr[4].length() != strArr[3].length()) {
            A08[7] = "C0qeCah7HNN5stexeGpu3wCMBFxC7Qm";
            this.A00 = j10 - ht.A01;
            if (z10) {
                try {
                    this.A03.A0H(A092.A03);
                    this.A03.A0G();
                } catch (Throwable th2) {
                    A07(ht);
                    throw th2;
                }
            }
            A07(ht);
            if (A08[7].length() != 7) {
                String[] strArr2 = A08;
                strArr2[1] = "Fhpc7L";
                strArr2[2] = "T7IVuP";
                return;
            }
        }
        throw new RuntimeException();
    }

    private void A0A(C1231Wk c1231Wk) {
        this.A03.A0A(c1231Wk.A04).A09(c1231Wk);
        this.A00 += c1231Wk.A01;
        A0B(c1231Wk);
    }

    private void A0B(C1231Wk c1231Wk) {
        ArrayList<HO> arrayList = this.A05.get(c1231Wk.A04);
        if (arrayList != null) {
            for (int i10 = arrayList.size() - 1; i10 >= 0; i10--) {
                arrayList.get(i10).ADe(this, c1231Wk);
            }
        }
        this.A02.ADe(this, c1231Wk);
    }

    private void A0C(C1231Wk c1231Wk, HT ht) {
        ArrayList<HO> arrayList = this.A05.get(c1231Wk.A04);
        if (arrayList != null) {
            for (int i10 = arrayList.size() - 1; i10 >= 0; i10--) {
                arrayList.get(i10).ADg(this, c1231Wk, ht);
            }
        }
        this.A02.ADg(this, c1231Wk, ht);
    }

    public static synchronized boolean A0D(File file) {
        synchronized (C1232Wl.class) {
            if (A06) {
                return true;
            }
            return A09.add(file.getAbsoluteFile());
        }
    }

    @Override // com.facebook.ads.redexgen.X.HP
    public final synchronized void A3w(String str, C0840Hb c0840Hb) throws HN {
        AbstractC0844Hf.A04(!this.A01);
        this.A03.A0I(str, c0840Hb);
        this.A03.A0G();
    }

    @Override // com.facebook.ads.redexgen.X.HP
    public final synchronized long A6d() {
        AbstractC0844Hf.A04(!this.A01);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.HP
    public final synchronized long A6e(String str, long j10, long j11) {
        HW cachedContent;
        AbstractC0844Hf.A04(!this.A01);
        cachedContent = this.A03.A09(str);
        return cachedContent != null ? cachedContent.A04(j10, j11) : -j11;
    }

    @Override // com.facebook.ads.redexgen.X.HP
    public final synchronized long A6u(String str) {
        return AbstractC0839Ha.A00(A6v(str));
    }

    @Override // com.facebook.ads.redexgen.X.HP
    public final synchronized HZ A6v(String str) {
        AbstractC0844Hf.A04(!this.A01);
        return this.A03.A0B(str);
    }

    @Override // com.facebook.ads.redexgen.X.HP
    public final synchronized void AF2(HT ht) {
        AbstractC0844Hf.A04(!this.A01);
        HW A092 = this.A03.A09(ht.A04);
        AbstractC0844Hf.A01(A092);
        AbstractC0844Hf.A04(A092.A0D());
        A092.A0B(false);
        this.A03.A0H(A092.A03);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.HP
    public final synchronized void AFc(HT ht) throws HN {
        AbstractC0844Hf.A04(!this.A01);
        A08(ht, true);
    }

    @Override // com.facebook.ads.redexgen.X.HP
    public final synchronized void AGN(String str, long j10) throws HN {
        C0840Hb mutations = new C0840Hb();
        AbstractC0839Ha.A05(mutations, j10);
        A3w(str, mutations);
    }

    @Override // com.facebook.ads.redexgen.X.HP
    public final synchronized File AGu(String str, long j10, long j11) throws HN {
        HW A092;
        AbstractC0844Hf.A04(!this.A01);
        A092 = this.A03.A09(str);
        AbstractC0844Hf.A01(A092);
        AbstractC0844Hf.A04(A092.A0D());
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            A05();
        }
        this.A02.ADh(this, str, j10, j11);
        return C1231Wk.A04(this.A04, A092.A02, j10, System.currentTimeMillis());
    }
}
