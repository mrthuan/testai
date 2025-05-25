package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class ZF<T> implements C9C<T> {
    public static byte[] A06;
    public static String[] A07 = {"EKA8QeB4steRJ5RPBpFUjw3mjvi5", "fve4ITv79qbm2xvzEK1yqXI", "ABPapESs8CyLRtVNwfFPA7A05iROvZsV", "0Lyphf8QRYP2FOEDF4CKVyWqrMlG", "sjHSRvprFPL1Hzs2shXil", "0UuY0i89chpuUt8804PTKlfzEuvvqf4a", "FkeetCIpWmPLoPieiedf1X3IWnyHYH7Q", "bw9eqk6z"};
    public AnonymousClass94 A00;
    public AnonymousClass94 A01;
    public List<ZF<T>.RecordFileBasedFetch> A02 = new ArrayList();
    public boolean A03;
    public final AnonymousClass93 A04;
    public final C9J A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {Field.INCLUDETEXT, 102, 105, Field.FILLIN, 104, 105, 107, 126, Field.FILLIN, 99, 98, 107, 98, 115, 98, Field.FILLIN, 100, 114, 117, 116, 104, 117, 116, Field.FILLIN, 119, 104, 110, 105, 115, 110, 105, 96, Field.FILLIN, 102, 115, Field.FILLIN, 115, 111, 98, Field.FILLIN, 99, 102, 115, 102, 101, 102, 116, 98, Field.FILLIN, 116, 115, 102, 117, 115, Field.CONTROL, 97, 102, 103, 123, 102, Field.AUTONUMOUT, 100, 123, 103, 125, 96, 125, 123, 122, Field.AUTONUMOUT, 125, 103, Field.AUTONUMOUT, 117, 96, Field.AUTONUMOUT, 60, Field.EQ, 112, 56, Field.EQ, 112, 61, 56, Field.AUTONUMOUT, 117, 122, 112, Field.AUTONUMOUT, 102, 113, 119, 123, 102, 112, Field.AUTONUMOUT, 114, 125, 120, 113, Field.AUTONUMOUT, 103, 113, 101, 97, 113, 122, 119, 113, Field.AUTONUMOUT, 103, 96, 117, 102, 96, 103, Field.AUTONUMOUT, 117, 96, Field.AUTONUMOUT, 60, Field.EQ, 112, 56, Field.EQ, 112, 61, Field.DDEAUTO, Field.AUTONUMOUT, 112, 117, 96, 117, Field.AUTONUMOUT, 124, 117, 103, Field.AUTONUMOUT, 100, 102, 123, 118, 117, 118, 120, 109, Field.AUTONUMOUT, 118, 113, 113, 122, Field.AUTONUMOUT, 120, 123, 103, 96, Field.NUMCHARS, 42, Field.DDE, 44, 48, Field.DDE, Byte.MAX_VALUE, Field.GLOSSARY, 48, 44, Field.AUTONUM, 43, Field.AUTONUM, 48, Field.EQ, Byte.MAX_VALUE, Field.AUTONUM, 44, Byte.MAX_VALUE, Field.USERADDRESS, 43, Byte.MAX_VALUE, 119, 122, 59, 115, 122, 59, 118, 115, Byte.MAX_VALUE, 61, 42, 43, Byte.MAX_VALUE, Field.DDE, 58, 60, 48, Field.DDE, 59, Byte.MAX_VALUE, Field.SYMBOL, Field.AUTONUM, Field.MACROBUTTON, 58, Byte.MAX_VALUE, 44, 58, Field.DDEAUTO, 42, 58, Field.EQ, 60, 58, Byte.MAX_VALUE, 48, Field.EQ, Field.MACROBUTTON, Field.ASK, Byte.MAX_VALUE, Field.IMPORT, Field.USERADDRESS, 44, Byte.MAX_VALUE, Field.SYMBOL, Field.AUTONUM, Field.MACROBUTTON, 58, Byte.MAX_VALUE, 122, 59, 101, Byte.MAX_VALUE, 59, Field.USERADDRESS, 43, Field.USERADDRESS, Byte.MAX_VALUE, Field.IMPORT, Field.USERADDRESS, 44, Byte.MAX_VALUE, Field.GLOSSARY, Field.DDE, 48, 61, Field.USERADDRESS, 61, Field.MACROBUTTON, Field.ASK, Byte.MAX_VALUE, 61, 58, 58, Field.EQ, Byte.MAX_VALUE, Field.MACROBUTTON, 48, 44, 43, 97, Field.FORMTEXT, 78, Field.MERGESEQ, Field.SECTIONPAGES, Field.INCLUDEPICTURE, 7, Field.FORMDROPDOWN, Field.NOTEREF, 7, Field.FORMTEXT, Field.INCLUDEPICTURE, Field.INCLUDEPICTURE, 7, Field.INCLUDEPICTURE, Field.FORMTEXT, Field.FORMDROPDOWN, Field.FORMTEXT, 7, Field.FORMDROPDOWN, Field.NOTEREF, 7, Field.MERGESEQ, Field.NOTEREF, 64, 8, Field.GLOSSARY, Field.FILLIN, 34, 43, 42, 110, 58, 33, 110, Field.DDE, 34, 43, Field.GLOSSARY, 60, 110, 42, Field.GLOSSARY, 58, Field.GLOSSARY, 44, Field.GLOSSARY, 61, 43, 11, 44, 36, 33, Field.DATA, 41, 109, Field.SYMBOL, 34, 109, 43, Field.DATA, Field.SYMBOL, Field.DDEAUTO, Field.PAGEREF, 109, 41, 44, Field.SYMBOL, 44, 109, 43, Field.BARCODE, 34, 32, 109, 33, 34, 42, 102, Field.SECTION, Field.TOA, 76, Field.FILESIZE, Field.INCLUDETEXT, 0, Field.ADVANCE, Field.AUTOTEXT, 0, Field.FORMCHECKBOX, Field.FILESIZE, Field.ADVANCE, 0, 82, Field.FILESIZE, Field.INCLUDEPICTURE, Field.AUTOTEXT, 82, Field.INCLUDETEXT, 0, Field.INCLUDEPICTURE, Field.AUTOTEXT, Field.DOCPROPERTY, 78, Field.ADVANCE, Field.TOA, 110, 102, 99, 106, 107, Field.GLOSSARY, 123, 96, Field.GLOSSARY, 122, Byte.MAX_VALUE, 107, 110, 123, 106, Field.GLOSSARY, 105, 102, 99, 106, Field.GLOSSARY, 124, 106, 126, 122, 106, 97, 108, 106, 48, 7, 1, 13, 16, 6, 36, 11, 14, 7, 32, 3, 17, 7, 6, 48, 7, 1, 13, 16, 6, Field.ASK, 3, 22, 3, 0, 3, 17, 7, Field.SECTIONPAGES, 1, 14, 13, 17, 7, 6, 119, 64, Field.FORMTEXT, 74, Field.CONTROL, Field.SECTION, 99, 76, Field.TOA, 64, 103, Field.INCLUDETEXT, 86, 64, Field.SECTION, 119, 64, Field.FORMTEXT, 74, Field.CONTROL, Field.SECTION, 97, Field.INCLUDETEXT, Field.ADDIN, Field.INCLUDETEXT, Field.FORMCHECKBOX, Field.INCLUDETEXT, 86, 64, 5, 76, 86, 5, Field.FORMTEXT, Field.TOA, 74, 86, 64, Field.SECTION, 119, 76, Field.TOA, 76, 77, Field.DOCPROPERTY, 76, 2, 112, Field.FORMCHECKBOX, Field.SECTION, 77, 80, Field.FORMTEXT, 100, Field.MERGESEQ, 78, Field.FORMCHECKBOX, 96, Field.INCLUDEPICTURE, Field.ADDIN, Field.FORMCHECKBOX, Field.FORMTEXT, 112, Field.FORMCHECKBOX, Field.SECTION, 77, 80, Field.FORMTEXT, 102, Field.INCLUDEPICTURE, 86, Field.INCLUDEPICTURE, 64, Field.INCLUDEPICTURE, Field.ADDIN, Field.FORMCHECKBOX, 2, Field.INCLUDETEXT, Field.FORMCHECKBOX, 86, Field.SECTION, 74, Field.FORMTEXT, 80, Field.CONTROL, 86, 74, Field.CONTROL, 26, 31, 10, 31};
        if (A07[6].charAt(28) == 'd') {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[5] = "G0nCZJj0prSQWtMWq2fjymNjpmI3wJ1o";
        strArr[2] = "hmxAaa3VGXWJOtMylrC9mnhyviZ0JnjG";
        A06 = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/ZF<TT;>.RecordFileBasedFetch;)Z */
    public synchronized boolean A06(ZG zg2) {
        if (this.A02.remove(zg2)) {
            if (zg2.A62() > 0 && zg2.A01().A02.A05(zg2.A01().A01).equals(this.A01)) {
                this.A01 = zg2.A00().A02;
            }
            return true;
        }
        return false;
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    public ZF(AnonymousClass99 anonymousClass99, C9H c9h) throws IOException {
        this.A05 = new C9J(anonymousClass99.A04(A00(515, 4, 103)), c9h);
        this.A04 = new AnonymousClass93(new File(anonymousClass99.A05(), A00(509, 6, 60)));
        this.A00 = this.A04.A03();
        A05(c9h);
        this.A01 = this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A02(int i10, int i11) throws IOException {
        this.A00 = new AnonymousClass94(i10, i11);
        this.A04.A04(this.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZG != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/ZF<TT;>.RecordFileBasedFetch;)V */
    public synchronized void A03(ZG zg2) throws C9L {
        if (!this.A03) {
            if (A06(zg2)) {
                if (zg2.A62() == 0) {
                    return;
                }
                if (this.A00.A04(zg2.A00().A02) == 0) {
                    try {
                        for (C9G c9g : zg2.A00) {
                            if (c9g.A00 == this.A05.A07() && this.A05.A0D()) {
                                A02(this.A05.A06(), 0);
                            } else {
                                A02(this.A05.A06(), zg2.A00().A00);
                                break;
                            }
                        }
                        if (this.A01.A04(this.A00) < 0) {
                            this.A01 = this.A00;
                        }
                        return;
                    } catch (IOException e10) {
                        throw new C9L(A00(361, 30, 22), e10);
                    }
                }
                throw new C9L(A00(0, 54, 30));
            }
            throw new C9L(A00(466, 43, 59));
        }
        throw new C9L(A00(427, 39, 60));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0066 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A05(com.facebook.ads.redexgen.X.C9H r13) throws java.io.IOException {
        /*
            r12 = this;
            com.facebook.ads.redexgen.X.9J r0 = r12.A05
            int r0 = r0.A06()
            r5 = 0
            com.facebook.ads.redexgen.X.94 r3 = new com.facebook.ads.redexgen.X.94
            r3.<init>(r0, r5)
            com.facebook.ads.redexgen.X.94 r0 = r12.A00
            int r0 = r3.A04(r0)
            r4 = 3
            r11 = 2
            r10 = 1
            if (r0 <= 0) goto L5c
            java.util.Locale r7 = java.util.Locale.US
            com.facebook.ads.redexgen.X.94 r0 = r12.A00
            int r0 = r0.A02()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            com.facebook.ads.redexgen.X.94 r0 = r12.A00
            int r0 = r0.A03()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            int r0 = r3.A02()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r3.A03()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 4
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r6[r5] = r9
            r6[r10] = r8
            r6[r11] = r2
            r6[r4] = r1
            r2 = 54
            r1 = 102(0x66, float:1.43E-43)
            r0 = 13
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.String r0 = java.lang.String.format(r7, r0, r6)
            r13.AFj(r0)
            r12.A00 = r3
        L5b:
            return
        L5c:
            int r1 = r3.A02()
            com.facebook.ads.redexgen.X.94 r0 = r12.A00
            int r0 = r0.A02()
            if (r1 >= r0) goto L5b
            com.facebook.ads.redexgen.X.9J r0 = r12.A05
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L7c
            com.facebook.ads.redexgen.X.94 r3 = new com.facebook.ads.redexgen.X.94
            com.facebook.ads.redexgen.X.9J r0 = r12.A05
            int r0 = r0.A06()
            r3.<init>(r0, r5)
            goto L5c
        L7c:
            java.util.Locale r7 = java.util.Locale.US
            com.facebook.ads.redexgen.X.94 r0 = r12.A00
            int r0 = r0.A02()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            com.facebook.ads.redexgen.X.94 r0 = r12.A00
            int r0 = r0.A03()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r3.A02()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r5] = r2
            r6[r10] = r1
            r6[r11] = r0
            r2 = 156(0x9c, float:2.19E-43)
            r1 = 101(0x65, float:1.42E-43)
            r0 = 70
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.String r0 = java.lang.String.format(r7, r0, r6)
            r13.AFj(r0)
            com.facebook.ads.redexgen.X.9J r0 = r12.A05
            int r2 = r0.A06()
            com.facebook.ads.redexgen.X.9J r0 = r12.A05
            int r1 = r0.A07()
            com.facebook.ads.redexgen.X.94 r0 = new com.facebook.ads.redexgen.X.94
            r0.<init>(r2, r1)
            r12.A00 = r0
            com.facebook.ads.redexgen.X.93 r1 = r12.A04
            com.facebook.ads.redexgen.X.94 r0 = r12.A00
            r1.A04(r0)
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZF.A05(com.facebook.ads.redexgen.X.9H):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZG != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.X.C9C
    public final synchronized C9B A61(byte[] bArr, int[] iArr) throws C9L {
        ZF<T>.RecordFileBasedFetch zg2;
        if (!this.A03) {
            int i10 = 0;
            int i11 = 0;
            try {
                ArrayList arrayList = new ArrayList();
                boolean mayHaveMoreData = true;
                while (true) {
                    AnonymousClass97 A0A = this.A05.A0A(this.A01.A02(), this.A01.A03(), bArr, i10, iArr, i11);
                    int A00 = A0A.A01().A00();
                    int storageOffset = A0A.A01().A01();
                    int i12 = A00 - storageOffset;
                    int storageOffset2 = A0A.A01().A02();
                    i10 += storageOffset2;
                    i11 += i12;
                    if (A0A.A01().A03() == AnonymousClass95.A03) {
                        arrayList.add(A0A);
                    }
                    if (A0A.A01().A03() == AnonymousClass95.A04) {
                        break;
                    } else if (A0A.A01().A03() == AnonymousClass95.A05) {
                        int countsOffset = this.A05.A06();
                        int storageOffset3 = this.A05.A08();
                        int countsOffset2 = countsOffset + storageOffset3;
                        int storageOffset4 = this.A01.A02();
                        if (countsOffset2 == storageOffset4 + 1) {
                            mayHaveMoreData = false;
                            break;
                        }
                        int storageOffset5 = this.A01.A02();
                        this.A01 = new AnonymousClass94(storageOffset5 + 1, 0);
                    } else {
                        this.A01 = this.A01.A05(i12);
                    }
                }
                zg2 = new ZG(this, arrayList, mayHaveMoreData);
                this.A02.add(zg2);
                if (!arrayList.isEmpty()) {
                    AnonymousClass94 anonymousClass94 = zg2.A01().A02;
                    int storageOffset6 = zg2.A01().A01;
                    this.A01 = anonymousClass94.A05(storageOffset6);
                }
            } catch (IOException e10) {
                throw new C9L(A00(306, 29, 84), e10);
            }
        } else {
            throw new C9L(A00(391, 36, 123));
        }
        return zg2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.C9C
    public final synchronized int A8B() throws C9L {
        int A09;
        if (!this.A03) {
            try {
                A09 = this.A05.A09();
                int A02 = this.A00.A02();
                int count = this.A05.A06();
                if (A02 == count) {
                    int count2 = this.A00.A03();
                    A09 -= count2;
                }
            } catch (IOException e10) {
                throw new C9L(A00(335, 26, 57), e10);
            }
        } else {
            throw new C9L(A00(427, 39, 60));
        }
        return A09;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.C9C
    public final synchronized void AH3(byte[] bArr) throws C9L {
        if (!this.A03) {
            try {
                this.A05.A0C(bArr);
            } catch (IOException e10) {
                throw new C9L(A00(257, 25, 62), e10);
            }
        } else {
            throw new C9L(A00(427, 39, 60));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.C9C
    public final synchronized void clear() throws C9L {
        try {
            this.A05.A0B();
            A02(this.A05.A06(), 0);
            this.A02.clear();
        } catch (IOException e10) {
            throw new C9L(A00(282, 24, 87), e10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        this.A02.clear();
        this.A04.close();
        this.A05.close();
    }
}
