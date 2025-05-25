package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.Ec  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0778Ec implements Handler.Callback, XV, InterfaceC0826Gn, Eu, InterfaceC06559e, AB {
    public static byte[] A0V;
    public static String[] A0W = {"P6YxoLhkz5ibpkstopVZVyommDCQ", "ATQddAIWQ0owYjgYaCgc", "Qvf", "B0i3rKbSIcl8mqFdJDuay5LNvvemcw4", "y6g4Ls3CGE757uBbH2iTCdPLcyck5fnI", "NEX", "Ls5ai4PwJPSlX5bzXjpt", "Xwhc7JDkSZbpBXzUBO5xvnc0Yvh1Hw2q"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C06679q A04;
    public A1 A05;
    public Ev A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public ZA[] A0C;
    public final long A0D;
    public final Handler A0E;
    public final HandlerThread A0F;
    public final ZD A0G;
    public final ZB A0H;
    public final InterfaceC06729w A0J;
    public final AK A0L;
    public final AL A0M;
    public final AbstractC0827Go A0N;
    public final C0828Gp A0O;
    public final InterfaceC0847Hi A0P;
    public final InterfaceC0857Hs A0Q;
    public final ArrayList<C06659o> A0R;
    public final boolean A0S;
    public final ZA[] A0T;
    public final AF[] A0U;
    public final C06759z A0K = new C06759z();
    public AI A06 = AI.A04;
    public final C06669p A0I = new C06669p();

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0V, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 90);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ec, code lost:
        if (r8 == 3) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f1, code lost:
        if (r14.A0C.length != 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f3, code lost:
        r8 = A0q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0101, code lost:
        if (com.facebook.ads.redexgen.X.C0778Ec.A0W[1].length() == 3) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0103, code lost:
        com.facebook.ads.redexgen.X.C0778Ec.A0W[7] = "Pg4wdYPbV6RAArZs6bIYTAeWks45Tt58";
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010a, code lost:
        if (r8 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0114, code lost:
        if (r8 == 3) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0117, code lost:
        com.facebook.ads.redexgen.X.C0778Ec.A0W[3] = "J56eYHViHFeMgD9oGoA5EmJCsj5r0jg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011e, code lost:
        if (r8 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0121, code lost:
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0123, code lost:
        r14.A09 = r14.A08;
        A0N(2);
        A0H();
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A07() throws com.facebook.ads.redexgen.X.C06589h, java.io.IOException {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0778Ec.A07():void");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A0E() throws C06589h {
        if (this.A0K.A0P()) {
            float f10 = this.A0G.A85().A01;
            C06739x A0H = this.A0K.A0H();
            boolean z10 = true;
            for (C06739x A0G = this.A0K.A0G(); A0G != null && A0G.A06; A0G = A0G.A01) {
                if (A0G.A0I(f10)) {
                    String[] strArr = A0W;
                    if (strArr[5].length() != strArr[2].length()) {
                        throw new RuntimeException();
                    }
                    A0W[6] = "6mKidZrYKow0BOAnF1OB";
                    if (z10) {
                        C06739x A0G2 = this.A0K.A0G();
                        boolean A0S = this.A0K.A0S(A0G2);
                        boolean[] zArr = new boolean[this.A0T.length];
                        long A0B = A0G2.A0B(this.A05.A0A, A0S, zArr);
                        A0i(A0G2.A03, A0G2.A04);
                        if (this.A05.A00 != 4 && A0B != this.A05.A0A) {
                            this.A05 = this.A05.A04(this.A05.A04, A0B, this.A05.A01);
                            this.A0I.A04(4);
                            A0P(A0B);
                        }
                        int i10 = 0;
                        boolean[] zArr2 = new boolean[this.A0T.length];
                        for (int i11 = 0; i11 < this.A0T.length; i11++) {
                            ZA za2 = this.A0T[i11];
                            zArr2[i11] = za2.A8P() != 0;
                            FG fg2 = A0G2.A0A[i11];
                            if (fg2 != null) {
                                i10++;
                            }
                            if (zArr2[i11]) {
                                if (fg2 != za2.A8S()) {
                                    A0b(za2);
                                } else if (zArr[i11]) {
                                    za2.AFr(this.A03);
                                }
                            }
                        }
                        this.A05 = this.A05.A05(A0G2.A03, A0G2.A04);
                        A0p(zArr2, i10);
                    } else {
                        this.A0K.A0S(A0G);
                        if (A0G.A06) {
                            A0G.A0A(Math.max(A0G.A02.A03, A0G.A08(this.A03)), false);
                            A0i(A0G.A03, A0G.A04);
                        }
                    }
                    if (this.A05.A00 != 4) {
                        A09();
                        A0J();
                        this.A0Q.AGD(2);
                        return;
                    }
                    return;
                }
                if (A0G == A0H) {
                    z10 = false;
                }
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A0I() throws C06589h, IOException {
        C0778Ec c0778Ec = this;
        if (c0778Ec.A07 == null) {
            return;
        }
        int i10 = c0778Ec.A01;
        if (A0W[0].length() == 28) {
            A0W[6] = "8D1ARm0ZBQnnZCNoomKo";
            if (i10 > 0) {
                c0778Ec.A07.AAo();
                return;
            }
            A0C();
            C06739x A0F = c0778Ec.A0K.A0F();
            if (A0F == null || A0F.A0H()) {
                c0778Ec.A0k(false);
            } else if (!c0778Ec.A05.A08) {
                A09();
            }
            if (!c0778Ec.A0K.A0P()) {
                return;
            }
            C06739x A0G = c0778Ec.A0K.A0G();
            C06759z c06759z = c0778Ec.A0K;
            if (A0W[3].length() != 1) {
                A0W[1] = "ouJLsfuj4L5l2nuVgaPcx";
                C06739x A0H = c06759z.A0H();
                boolean z10 = false;
                while (c0778Ec.A08 && A0G != A0H && c0778Ec.A03 >= A0G.A01.A00) {
                    if (z10) {
                        A0A();
                    }
                    C06749y c06749y = A0G.A02;
                    if (A0W[1].length() == 3) {
                        throw new RuntimeException();
                    }
                    A0W[7] = "0M30bmT4hYz4ZuhjE8LXlv6wVKZ562xO";
                    int i11 = c06749y.A06 ? 0 : 3;
                    C06739x c06739x = A0G;
                    A0G = c0778Ec.A0K.A0C();
                    c0778Ec.A0V(c06739x);
                    c0778Ec.A05 = c0778Ec.A05.A04(A0G.A02.A04, A0G.A02.A03, A0G.A02.A00);
                    c0778Ec.A0I.A04(i11);
                    A0J();
                    z10 = true;
                }
                if (A0H.A02.A05) {
                    for (int i12 = 0; i12 < c0778Ec.A0T.length; i12++) {
                        ZA za2 = c0778Ec.A0T[i12];
                        FG fg2 = A0H.A0A[i12];
                        if (fg2 != null && za2.A8S() == fg2) {
                            boolean A8z = za2.A8z();
                            if (A0W[7].charAt(28) == 'w') {
                                throw new RuntimeException();
                            }
                            A0W[6] = "vXr9IuCvwlwtM4B4RQ4o";
                            if (A8z) {
                                za2.AGO();
                            }
                        }
                    }
                    return;
                } else if (A0H.A01 == null) {
                    return;
                } else {
                    C06739x c06739x2 = A0H.A01;
                    if (A0W[7].charAt(28) != 'w') {
                        A0W[3] = "jJFxzY6mdlXoyZQ0oDOcGo2";
                        if (!c06739x2.A06) {
                            return;
                        }
                    } else {
                        A0W[1] = "I";
                        if (!c06739x2.A06) {
                            return;
                        }
                    }
                    int i13 = 0;
                    while (true) {
                        int length = c0778Ec.A0T.length;
                        String[] strArr = A0W;
                        if (strArr[5].length() != strArr[2].length()) {
                            break;
                        }
                        String[] strArr2 = A0W;
                        strArr2[5] = "x3P";
                        strArr2[2] = "8Ip";
                        if (i13 >= length) {
                            C0828Gp c0828Gp = A0H.A04;
                            C06739x A0D = c0778Ec.A0K.A0D();
                            C0828Gp c0828Gp2 = A0D.A04;
                            boolean z11 = A0D.A08.AEo() != -9223372036854775807L;
                            int i14 = 0;
                            while (i14 < c0778Ec.A0T.length) {
                                ZA za3 = c0778Ec.A0T[i14];
                                if (c0828Gp.A00(i14)) {
                                    if (z11) {
                                        za3.AGO();
                                    } else if (za3.A9N()) {
                                        continue;
                                    } else {
                                        InterfaceC0824Gl A00 = c0828Gp2.A01.A00(i14);
                                        boolean A002 = c0828Gp2.A00(i14);
                                        boolean z12 = c0778Ec.A0U[i14].A8a() == 5;
                                        AG ag2 = c0828Gp.A03[i14];
                                        AG ag3 = c0828Gp2.A03[i14];
                                        if (A002) {
                                            boolean equals = ag3.equals(ag2);
                                            if (A0W[0].length() != 28) {
                                                throw new RuntimeException();
                                            }
                                            A0W[1] = "RcCRQWS";
                                            if (equals && !z12) {
                                                za3.AFh(A0v(A00), A0D.A0A[i14], A0D.A07());
                                            }
                                        }
                                        za3.AGO();
                                    }
                                }
                                i14++;
                                c0778Ec = this;
                            }
                            return;
                        }
                        ZA za4 = c0778Ec.A0T[i13];
                        FG fg3 = A0H.A0A[i13];
                        if (za4.A8S() != fg3) {
                            return;
                        }
                        if (fg3 != null && !za4.A8z()) {
                            return;
                        }
                        i13++;
                    }
                }
            }
        }
        throw new RuntimeException();
    }

    public static void A0K() {
        A0V = new byte[]{-59, -8, -17, -48, -20, -31, -7, -27, -14, -55, -19, -16, -20, -55, -18, -12, -27, -14, -18, -31, -20, -74, -23, -32, -63, -35, -46, -22, -42, -29, -70, -34, -31, -35, -70, -33, -27, -42, -29, -33, -46, -35, -85, -71, -46, -33, -43, -35, -42, -29, -85, -55, -48, -47, -44, -53, -48, -55, -126, -49, -57, -43, -43, -61, -55, -57, -43, -126, -43, -57, -48, -42, -126, -61, -56, -42, -57, -44, -126, -44, -57, -50, -57, -61, -43, -57, -112, 5, 42, 48, 33, Field.DDEAUTO, 42, 29, Field.DATA, -36, Field.DDEAUTO, Field.EQ, 42, 48, Field.PAGEREF, 41, 33, -36, 33, Field.DDEAUTO, Field.DDEAUTO, 43, Field.DDEAUTO, -22, 23, Field.MACROBUTTON, Field.DATA, 64, 41, Field.DATA, 42, Field.GOTOBUTTON, -25, 44, Field.SYMBOL, Field.SYMBOL, Field.AUTONUM, Field.SYMBOL, -11, -17, 11, 17, 14, -1, 1, -68, 1, 14, 14, 11, 14, -54, -61, -28, -33, -32, -112, -42, -47, -39, -36, -43, -44, -98, -50, -39, -67, -39, -41, -49, -63, -39, -36, -43};
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01e3, code lost:
        if (r6 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e9, code lost:
        if (r9.A01() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01eb, code lost:
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ed, code lost:
        r14.A05 = r14.A05.A04(r9, A02(r9, r1), r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f9, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01fa, code lost:
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0203, code lost:
        if (r6 == false) goto L87;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0S(com.facebook.ads.redexgen.X.C06649n r15) throws com.facebook.ads.redexgen.X.C06589h {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0778Ec.A0S(com.facebook.ads.redexgen.X.9n):void");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0T(com.facebook.ads.redexgen.X.C06679q r17) throws com.facebook.ads.redexgen.X.C06589h {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0778Ec.A0T(com.facebook.ads.redexgen.X.9q):void");
    }

    static {
        A0K();
    }

    public C0778Ec(ZA[] zaArr, AbstractC0827Go abstractC0827Go, C0828Gp c0828Gp, InterfaceC06729w interfaceC06729w, boolean z10, int i10, boolean z11, Handler handler, ZB zb2, InterfaceC0847Hi interfaceC0847Hi) {
        this.A0T = zaArr;
        this.A0N = abstractC0827Go;
        this.A0O = c0828Gp;
        this.A0J = interfaceC06729w;
        this.A08 = z10;
        this.A02 = i10;
        this.A0B = z11;
        this.A0E = handler;
        this.A0H = zb2;
        this.A0P = interfaceC0847Hi;
        this.A0D = interfaceC06729w.A6T();
        this.A0S = interfaceC06729w.AFs();
        this.A05 = new A1(AM.A01, -9223372036854775807L, TrackGroupArray.A04, c0828Gp);
        this.A0U = new AF[zaArr.length];
        for (int i11 = 0; i11 < zaArr.length; i11++) {
            zaArr[i11].AGS(i11);
            this.A0U[i11] = zaArr[i11].A6g();
        }
        this.A0G = new ZD(this, interfaceC0847Hi);
        this.A0R = new ArrayList<>();
        this.A0C = new ZA[0];
        this.A0M = new AL();
        this.A0L = new AK();
        abstractC0827Go.A00(this);
        this.A0F = new HandlerThread(A06(21, 29, 23), -16);
        this.A0F.start();
        this.A0Q = interfaceC0847Hi.A4y(this.A0F.getLooper(), this);
    }

    private int A00() {
        AM am2 = this.A05.A03;
        if (am2.A0E()) {
            return 0;
        }
        AL A0B = am2.A0B(am2.A05(this.A0B), this.A0M);
        if (A0W[3].length() != 1) {
            A0W[7] = "PHJg0XpOhfW99vW7Kex5sTOYyXlu8lIY";
            return A0B.A00;
        }
        throw new RuntimeException();
    }

    private int A01(int i10, AM am2, AM am3) {
        int i11 = i10;
        int maxIterations = -1;
        int A00 = am2.A00();
        for (int i12 = 0; i12 < A00 && maxIterations == -1; i12++) {
            i11 = am2.A03(i11, this.A0L, this.A0M, this.A02, this.A0B);
            if (i11 == -1) {
                break;
            }
            maxIterations = am3.A04(am2.A0A(i11, this.A0L, true).A03);
        }
        return maxIterations;
    }

    private long A02(Et et, long j10) throws C06589h {
        return A03(et, j10, this.A0K.A0G() != this.A0K.A0H());
    }

    private long A03(Et et, long j10, boolean z10) throws C06589h {
        A0H();
        this.A09 = false;
        A0N(2);
        C06739x A0G = this.A0K.A0G();
        C06739x c06739x = A0G;
        while (true) {
            if (c06739x == null) {
                break;
            } else if (A0t(et, j10, c06739x)) {
                this.A0K.A0S(c06739x);
                break;
            } else {
                c06739x = this.A0K.A0C();
            }
        }
        if (A0G != c06739x || z10) {
            for (ZA za2 : this.A0C) {
                A0b(za2);
            }
            this.A0C = new ZA[0];
            A0G = null;
        }
        if (c06739x != null) {
            A0V(A0G);
            if (c06739x.A05) {
                j10 = c06739x.A08.AGB(j10);
                c06739x.A08.A5W(j10 - this.A0D, this.A0S);
            }
            A0P(j10);
            if (A0W[3].length() == 1) {
                throw new RuntimeException();
            }
            A0W[0] = "LTHjNlNPyjt4lBWFjaooWNRC6TUk";
            A09();
        } else {
            this.A0K.A0O(true);
            A0P(j10);
        }
        this.A0Q.AGD(2);
        return j10;
    }

    private Pair<Integer, Long> A04(C06679q c06679q, boolean z10) {
        int A01;
        AM am2 = this.A05.A03;
        AM am3 = c06679q.A02;
        if (am2.A0E()) {
            return null;
        }
        if (am3.A0E()) {
            am3 = am2;
        }
        try {
            Pair<Integer, Long> A07 = am3.A07(this.A0M, this.A0L, c06679q.A00, c06679q.A01);
            if (am2 == am3) {
                return A07;
            }
            int A04 = am2.A04(am3.A0A(((Integer) A07.first).intValue(), this.A0L, true).A03);
            if (A04 != -1) {
                return Pair.create(Integer.valueOf(A04), (Long) A07.second);
            }
            if (!z10 || (A01 = A01(((Integer) A07.first).intValue(), am3, am2)) == -1) {
                return null;
            }
            return A05(am2, am2.A09(A01, this.A0L).A00, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new C06719v(am2, c06679q.A00, c06679q.A01);
        }
    }

    private Pair<Integer, Long> A05(AM am2, int i10, long j10) {
        return am2.A07(this.A0M, this.A0L, i10, j10);
    }

    private void A08() {
        A0N(4);
        A0o(false, true, false);
    }

    private void A09() {
        C06739x A0F = this.A0K.A0F();
        long nextLoadPositionUs = A0F.A06();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            A0k(false);
            return;
        }
        boolean AGi = this.A0J.AGi(nextLoadPositionUs - A0F.A08(this.A03), this.A0G.A85().A01);
        A0k(AGi);
        if (AGi) {
            A0F.A0F(this.A03);
        }
    }

    private void A0A() {
        int i10;
        boolean z10;
        int i11;
        if (this.A0I.A06(this.A05)) {
            Handler handler = this.A0E;
            i10 = this.A0I.A01;
            z10 = this.A0I.A03;
            if (z10) {
                C06669p c06669p = this.A0I;
                if (A0W[1].length() == 3) {
                    throw new RuntimeException();
                }
                A0W[1] = "RB7sIkNoTcpey07ODT8uORIhWJm";
                i11 = c06669p.A00;
            } else {
                i11 = -1;
            }
            handler.obtainMessage(0, i10, i11, this.A05).sendToTarget();
            this.A0I.A05(this.A05);
        }
    }

    private void A0B() throws IOException {
        C06739x A0F = this.A0K.A0F();
        C06739x A0H = this.A0K.A0H();
        if (A0F != null) {
            boolean z10 = A0F.A06;
            if (A0W[4].charAt(4) == 'c') {
                throw new RuntimeException();
            }
            A0W[7] = "N5Rg0nMtUPutdorU0pcWvntmMyKPkn9g";
            if (!z10) {
                if (A0H != null) {
                    C06739x loadingPeriodHolder = A0H.A01;
                    if (loadingPeriodHolder != A0F) {
                        return;
                    }
                }
                for (ZA za2 : this.A0C) {
                    if (!za2.A8z()) {
                        return;
                    }
                }
                A0F.A08.AAn();
            }
        }
    }

    private void A0C() throws IOException {
        this.A0K.A0M(this.A03);
        if (this.A0K.A0Q()) {
            C06749y A0I = this.A0K.A0I(this.A03, this.A05);
            String[] strArr = A0W;
            if (strArr[5].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0W[3] = "fu6rtQYuGz66gCmV8yC70qEpQFTVY";
            if (A0I == null) {
                this.A07.AAo();
                return;
            }
            XU mediaPeriod = this.A0K.A0K(this.A0U, this.A0N, this.A0J.A6O(), this.A07, this.A05.A03.A0A(A0I.A04.A02, this.A0L, true).A03, A0I);
            mediaPeriod.AEX(this, A0I.A03);
            A0k(true);
        }
    }

    private void A0D() {
        A0o(true, true, true);
        this.A0J.ADK();
        A0N(1);
        this.A0F.quit();
        synchronized (this) {
            this.A0A = true;
            notifyAll();
        }
    }

    private void A0F() {
        for (int size = this.A0R.size() - 1; size >= 0; size--) {
            if (!A0r(this.A0R.get(size))) {
                this.A0R.get(size).A03.A0A(false);
                this.A0R.remove(size);
            }
        }
        Collections.sort(this.A0R);
    }

    private void A0G() throws C06589h {
        this.A09 = false;
        this.A0G.A05();
        for (ZA za2 : this.A0C) {
            za2.start();
        }
    }

    private void A0H() throws C06589h {
        this.A0G.A06();
        for (ZA za2 : this.A0C) {
            A0c(za2);
        }
    }

    private void A0J() throws C06589h {
        long A0C;
        if (!this.A0K.A0P()) {
            return;
        }
        C06739x A0G = this.A0K.A0G();
        long AEo = A0G.A08.AEo();
        if (AEo != -9223372036854775807L) {
            A0P(AEo);
            if (AEo != this.A05.A0A) {
                this.A05 = this.A05.A04(this.A05.A04, AEo, this.A05.A01);
                this.A0I.A04(4);
            }
        } else {
            this.A03 = this.A0G.A04();
            long A08 = A0G.A08(this.A03);
            A0Q(this.A05.A0A, A08);
            this.A05.A0A = A08;
        }
        A1 a12 = this.A05;
        if (this.A0C.length == 0) {
            A0C = A0G.A02.A01;
        } else {
            A0C = A0G.A0C(true);
        }
        a12.A09 = A0C;
    }

    private void A0L(float f10) {
        InterfaceC0824Gl[] A01;
        for (C06739x A0E = this.A0K.A0E(); A0E != null; A0E = A0E.A01) {
            C0828Gp c0828Gp = A0E.A04;
            String[] strArr = A0W;
            if (strArr[5].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[5] = "3Do";
            strArr2[2] = "at3";
            if (c0828Gp != null) {
                for (InterfaceC0824Gl interfaceC0824Gl : A0E.A04.A01.A01()) {
                    if (interfaceC0824Gl != null) {
                        interfaceC0824Gl.AD5(f10);
                    }
                }
            }
        }
    }

    private void A0M(int i10) throws C06589h {
        this.A02 = i10;
        if (!this.A0K.A0R(i10)) {
            A0j(true);
        }
    }

    private void A0N(int i10) {
        if (this.A05.A00 != i10) {
            this.A05 = this.A05.A02(i10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
        if (r18 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
        if (r6 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        if (r18 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
        r13 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0O(int r17, boolean r18, int r19) throws com.facebook.ads.redexgen.X.C06589h {
        /*
            r16 = this;
            r3 = r16
            com.facebook.ads.redexgen.X.9z r0 = r3.A0K
            com.facebook.ads.redexgen.X.9x r4 = r0.A0G()
            com.facebook.ads.redexgen.X.ZA[] r0 = r3.A0T
            r5 = r17
            r7 = r0[r5]
            com.facebook.ads.redexgen.X.ZA[] r0 = r3.A0C
            r0[r19] = r7
            int r0 = r7.A8P()
            if (r0 != 0) goto L79
            com.facebook.ads.redexgen.X.Gp r0 = r4.A04
            com.facebook.ads.redexgen.X.AG[] r0 = r0.A03
            r8 = r0[r5]
            com.facebook.ads.redexgen.X.Gp r0 = r4.A04
            com.facebook.ads.redexgen.X.Gm r0 = r0.A01
            com.facebook.ads.redexgen.X.Gl r0 = r0.A00(r5)
            com.facebook.ads.internal.exoplayer2.thirdparty.Format[] r9 = A0v(r0)
            boolean r0 = r3.A08
            if (r0 == 0) goto L8b
            com.facebook.ads.redexgen.X.A1 r0 = r3.A05
            int r6 = r0.A00
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0778Ec.A0W
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 3
            if (r1 == r0) goto L8d
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0778Ec.A0W
            java.lang.String r1 = "QRz84tIq3wllCeb1capmh87EbVgo0fYM"
            r0 = 4
            r2[r0] = r1
            r0 = 3
            if (r6 != r0) goto L8b
            r6 = 1
        L49:
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0778Ec.A0W
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 28
            if (r1 == r0) goto L7a
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0778Ec.A0W
            java.lang.String r1 = "nWHC8GobiUTV1BRDhLkuPrvX5"
            r0 = 1
            r2[r0] = r1
            if (r18 != 0) goto L89
        L5f:
            if (r6 == 0) goto L89
            r13 = 1
        L62:
            com.facebook.ads.redexgen.X.FG[] r0 = r4.A0A
            r10 = r0[r5]
            long r11 = r3.A03
            long r14 = r4.A07()
            r7.A5r(r8, r9, r10, r11, r13, r14)
            com.facebook.ads.redexgen.X.ZD r0 = r3.A0G
            r0.A09(r7)
            if (r6 == 0) goto L79
            r7.start()
        L79:
            return
        L7a:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0778Ec.A0W
            java.lang.String r1 = "o7g"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "UGX"
            r0 = 2
            r2[r0] = r1
            if (r18 != 0) goto L89
            goto L5f
        L89:
            r13 = 0
            goto L62
        L8b:
            r6 = 0
            goto L49
        L8d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0778Ec.A0O(int, boolean, int):void");
    }

    private void A0P(long j10) throws C06589h {
        if (this.A0K.A0P()) {
            j10 = this.A0K.A0G().A09(j10);
        }
        this.A03 = j10;
        this.A0G.A07(this.A03);
        for (ZA za2 : this.A0C) {
            za2.AFr(this.A03);
            if (A0W[7].charAt(28) == 'w') {
                throw new RuntimeException();
            }
            A0W[6] = "Dkk1xe1nETG6SQ7gXcWE";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
        if (r5 >= r4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
        r0 = r3.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c0, code lost:
        if (r0 != r4) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c6, code lost:
        if (r3.A01 > r8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
        r0 = r7.A00;
        r7.A00 = r0 + 1;
        r1 = r7.A00;
        r0 = r7.A0R.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d6, code lost:
        if (r1 >= r0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d8, code lost:
        r1 = r7.A0R;
        r0 = r7.A00;
        r3 = r1.get(r0);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e5, code lost:
        if (r5 >= r4) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0Q(long r8, long r10) throws com.facebook.ads.redexgen.X.C06589h {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0778Ec.A0Q(long, long):void");
    }

    private void A0R(long j10, long j11) {
        this.A0Q.AFb(2);
        this.A0Q.AGE(2, j10 + j11);
    }

    private void A0V(C06739x c06739x) throws C06589h {
        C06739x A0G = this.A0K.A0G();
        if (A0G == null || c06739x == A0G) {
            return;
        }
        int i10 = 0;
        boolean[] zArr = new boolean[this.A0T.length];
        for (int i11 = 0; i11 < this.A0T.length; i11++) {
            ZA za2 = this.A0T[i11];
            zArr[i11] = za2.A8P() != 0;
            if (A0G.A04.A00(i11)) {
                i10++;
            }
            if (zArr[i11] && (!A0G.A04.A00(i11) || (za2.A9N() && za2.A8S() == c06739x.A0A[i11]))) {
                A0b(za2);
            }
        }
        this.A05 = this.A05.A05(A0G.A03, A0G.A04);
        A0p(zArr, i10);
    }

    private void A0W(A2 a22) {
        this.A0G.AGa(a22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(AD ad2) throws C06589h {
        if (ad2.A0D()) {
            return;
        }
        try {
            ad2.A04().A8t(ad2.A00(), ad2.A09());
        } finally {
            ad2.A0A(true);
        }
    }

    private void A0Y(AD ad2) throws C06589h {
        if (ad2.A02() == -9223372036854775807L) {
            A0Z(ad2);
            return;
        }
        if (this.A07 != null) {
            int i10 = this.A01;
            if (A0W[0].length() != 28) {
                throw new RuntimeException();
            }
            A0W[1] = "o1ZfKzJk47hV";
            if (i10 <= 0) {
                C06659o c06659o = new C06659o(ad2);
                if (!A0r(c06659o)) {
                    if (A0W[7].charAt(28) != 'w') {
                        A0W[3] = "aTDMkEWwCUERProrJoKbugoPR0RLmehL";
                        ad2.A0A(false);
                        return;
                    }
                    A0W[7] = "nEAZXjO4i2eVoKfOQOzMBl4A0pmuVndx";
                    ad2.A0A(false);
                    return;
                }
                ArrayList<C06659o> arrayList = this.A0R;
                if (A0W[7].charAt(28) == 'w') {
                    A0W[7] = "fj1HQu0C9Tc3paKg3KNI1jKNCUFeknU2";
                    arrayList.add(c06659o);
                    Collections.sort(this.A0R);
                    return;
                }
                A0W[6] = "0jg7HAqbvnSBdqVDarqZ";
                arrayList.add(c06659o);
                Collections.sort(this.A0R);
                return;
            }
        }
        this.A0R.add(new C06659o(ad2));
    }

    private void A0Z(AD ad2) throws C06589h {
        if (ad2.A03().getLooper() == this.A0Q.A7j()) {
            A0X(ad2);
            if (this.A05.A00 == 3 || this.A05.A00 == 2) {
                this.A0Q.AGD(2);
                return;
            }
            return;
        }
        this.A0Q.AB1(15, ad2).sendToTarget();
    }

    private void A0a(final AD ad2) {
        ad2.A03().post(new Runnable() { // from class: com.facebook.ads.redexgen.X.9m
            public static byte[] A02;
            public static String[] A03 = {"vvB9T8WK7bT4nFgbnm6TlGuNwpdmRtb5", "Hfw1oyg0BzWOVhb4zu8ELKkOELcM4f2B", "gmAcFU6mn3n0PFSsnO8fNJkU01ktZa8U", "xgpG2bMc1aVEQfTVOGXM8sfGOtJMcFPH", "2GhavpyJFuEpD", "Q3SxFnadra2JweXV0TQ7pCIkPNwW6CrH", "wegMd5NqqvgJ45W9ANASZrnEtp1A2mXR", "ALPTKzTzzHlEJ12cQtwgMkt"};

            public static String A00(int i10, int i11, int i12) {
                byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
                for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                    int i14 = (copyOfRange[i13] ^ i12) ^ 5;
                    String[] strArr = A03;
                    if (strArr[3].charAt(9) != strArr[5].charAt(9)) {
                        throw new RuntimeException();
                    }
                    A03[4] = "6EUX3tXbFxVZ50ys6tGf1eJDZb";
                    copyOfRange[i13] = (byte) i14;
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A02 = new byte[]{103, Field.LISTNUM, 77, 114, 78, Field.INCLUDEPICTURE, Field.HTMLCONTROL, Field.FORMCHECKBOX, 80, 107, Field.AUTOTEXT, 82, 78, 107, 76, 86, Field.FORMCHECKBOX, 80, 76, Field.INCLUDEPICTURE, 78, Field.FORMTEXT, 125, 118, 107, 99, 118, 112, 103, 118, 119, Field.MACROBUTTON, 118, 97, 97, 124, 97, Field.MACROBUTTON, 119, 118, Byte.MAX_VALUE, 122, 101, 118, 97, 122, 125, 116, Field.MACROBUTTON, 126, 118, 96, 96, 114, 116, 118, Field.MACROBUTTON, 124, 125, Field.MACROBUTTON, 118, 107, 103, 118, 97, 125, 114, Byte.MAX_VALUE, Field.MACROBUTTON, 103, 123, 97, 118, 114, 119, 61};
            }

            static {
                A01();
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (KQ.A02(this)) {
                    return;
                }
                try {
                    try {
                        C0778Ec.this.A0X(ad2);
                    } catch (C06589h e10) {
                        Log.e(A00(0, 21, 39), A00(21, 55, 22), e10);
                        throw new RuntimeException(e10);
                    }
                } catch (Throwable th2) {
                    KQ.A00(th2, this);
                }
            }
        });
    }

    private void A0b(ZA za2) throws C06589h {
        this.A0G.A08(za2);
        A0c(za2);
        za2.A5U();
    }

    private void A0c(ZA za2) throws C06589h {
        if (za2.A8P() == 2) {
            za2.stop();
        }
    }

    private void A0d(AI ai2) {
        this.A06 = ai2;
    }

    private void A0e(XU xu) {
        if (!this.A0K.A0T(xu)) {
            return;
        }
        this.A0K.A0M(this.A03);
        A09();
    }

    private void A0f(XU xu) throws C06589h {
        if (!this.A0K.A0T(xu)) {
            return;
        }
        C06739x A0F = this.A0K.A0F();
        A0F.A0E(this.A0G.A85().A01);
        A0i(A0F.A03, A0F.A04);
        if (!this.A0K.A0P()) {
            C06739x loadingPeriodHolder = this.A0K.A0C();
            A0P(loadingPeriodHolder.A02.A03);
            A0V(null);
        }
        A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.FH
    /* renamed from: A0g */
    public final void ABd(XU xu) {
        this.A0Q.AB1(10, xu).sendToTarget();
    }

    private void A0h(Ev ev, boolean z10, boolean z11) {
        this.A01++;
        A0o(true, z10, z11);
        this.A0J.onPrepared();
        this.A07 = ev;
        A0N(2);
        ev.AEa(this.A0H, true, this);
        this.A0Q.AGD(2);
    }

    private void A0i(TrackGroupArray trackGroupArray, C0828Gp c0828Gp) {
        this.A0J.ADq(this.A0T, trackGroupArray, c0828Gp.A01);
    }

    private void A0j(boolean z10) throws C06589h {
        Et et = this.A0K.A0G().A02.A04;
        long A03 = A03(et, this.A05.A0A, true);
        if (A03 != this.A05.A0A) {
            this.A05 = this.A05.A04(et, A03, this.A05.A01);
            if (z10) {
                C06669p c06669p = this.A0I;
                if (A0W[7].charAt(28) == 'w') {
                    throw new RuntimeException();
                }
                A0W[6] = "WBZ5bLJSEJN5yb0YmqU0";
                c06669p.A04(4);
            }
        }
    }

    private void A0k(boolean z10) {
        if (this.A05.A08 != z10) {
            this.A05 = this.A05.A06(z10);
        }
    }

    private void A0l(boolean z10) throws C06589h {
        this.A09 = false;
        this.A08 = z10;
        if (!z10) {
            A0H();
            A0J();
        } else if (this.A05.A00 == 3) {
            A0G();
            this.A0Q.AGD(2);
        } else if (this.A05.A00 != 2) {
        } else {
            this.A0Q.AGD(2);
        }
    }

    private void A0m(boolean z10) throws C06589h {
        this.A0B = z10;
        if (!this.A0K.A0V(z10)) {
            A0j(true);
        }
    }

    private void A0n(boolean z10, boolean z11) {
        A0o(true, z10, z10);
        this.A0I.A03(this.A01 + (z11 ? 1 : 0));
        this.A01 = 0;
        this.A0J.ADi();
        A0N(1);
    }

    private void A0o(boolean z10, boolean z11, boolean z12) {
        Object obj;
        long j10;
        C0828Gp c0828Gp;
        this.A0Q.AFb(2);
        this.A09 = false;
        this.A0G.A06();
        this.A03 = 0L;
        for (ZA za2 : this.A0C) {
            try {
                A0b(za2);
            } catch (C06589h | RuntimeException e10) {
                Log.e(A06(0, 21, 38), A06(ShapeTypes.FLOW_CHART_MULTIDOCUMENT, 12, 22), e10);
            }
        }
        this.A0C = new ZA[0];
        this.A0K.A0O(!z11);
        A0k(false);
        if (z11) {
            this.A04 = null;
        }
        if (z12) {
            this.A0K.A0N(AM.A01);
            Iterator<C06659o> it = this.A0R.iterator();
            while (it.hasNext()) {
                it.next().A03.A0A(false);
            }
            this.A0R.clear();
            this.A00 = 0;
        }
        AM am2 = z12 ? AM.A01 : this.A05.A03;
        if (z12) {
            obj = null;
        } else {
            obj = this.A05.A07;
        }
        Et et = z11 ? new Et(A00()) : this.A05.A04;
        long j11 = -9223372036854775807L;
        if (z11) {
            j10 = -9223372036854775807L;
        } else {
            j10 = this.A05.A0A;
        }
        if (!z11) {
            j11 = this.A05.A01;
        }
        int i10 = this.A05.A00;
        TrackGroupArray trackGroupArray = z12 ? TrackGroupArray.A04 : this.A05.A05;
        if (z12) {
            c0828Gp = this.A0O;
        } else {
            c0828Gp = this.A05.A06;
        }
        this.A05 = new A1(am2, obj, et, j10, j11, i10, false, trackGroupArray, c0828Gp);
        if (z10) {
            Ev ev = this.A07;
            if (A0W[7].charAt(28) == 'w') {
                throw new RuntimeException();
            }
            A0W[0] = "lRj2b7Ec0CIz5iiX5eE2KmWgCFvN";
            if (ev != null) {
                this.A07.AF4(this);
                this.A07 = null;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0p(boolean[] r9, int r10) throws com.facebook.ads.redexgen.X.C06589h {
        /*
            r8 = this;
            com.facebook.ads.redexgen.X.ZA[] r0 = new com.facebook.ads.redexgen.X.ZA[r10]
            r8.A0C = r0
            r7 = 0
            com.facebook.ads.redexgen.X.9z r0 = r8.A0K
            com.facebook.ads.redexgen.X.9x r6 = r0.A0G()
            r5 = 0
        Lc:
            com.facebook.ads.redexgen.X.ZA[] r0 = r8.A0T
            int r0 = r0.length
            if (r5 >= r0) goto L3f
            com.facebook.ads.redexgen.X.Gp r0 = r6.A04
            boolean r0 = r0.A00(r5)
            if (r0 == 0) goto L36
            boolean r4 = r9[r5]
            int r3 = r7 + 1
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0778Ec.A0W
            r0 = 4
            r1 = r1[r0]
            r0 = 4
            char r1 = r1.charAt(r0)
            r0 = 99
            if (r1 == r0) goto L39
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0778Ec.A0W
            java.lang.String r1 = "b6AxkSDoOdacq7WM3wR6"
            r0 = 6
            r2[r0] = r1
            r8.A0O(r5, r4, r7)
            r7 = r3
        L36:
            int r5 = r5 + 1
            goto Lc
        L39:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0778Ec.A0p(boolean[], int):void");
    }

    private boolean A0q() {
        C06739x A0G = this.A0K.A0G();
        long j10 = A0G.A02.A01;
        if (j10 != -9223372036854775807L) {
            long playingPeriodDurationUs = this.A05.A0A;
            if (playingPeriodDurationUs >= j10) {
                C06739x playingPeriodHolder = A0G.A01;
                if (playingPeriodHolder != null) {
                    C06739x playingPeriodHolder2 = A0G.A01;
                    if (!playingPeriodHolder2.A06) {
                        C06739x playingPeriodHolder3 = A0G.A01;
                        if (playingPeriodHolder3.A02.A04.A01()) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean A0r(C06659o c06659o) {
        if (c06659o.A02 == null) {
            Pair<Integer, Long> A04 = A04(new C06679q(c06659o.A03.A08(), c06659o.A03.A01(), AbstractC06529b.A00(c06659o.A03.A02())), false);
            if (A04 == null) {
                return false;
            }
            c06659o.A01(((Integer) A04.first).intValue(), ((Long) A04.second).longValue(), this.A05.A03.A0A(((Integer) A04.first).intValue(), this.A0L, true).A03);
        } else {
            int A042 = this.A05.A03.A04(c06659o.A02);
            if (A042 == -1) {
                return false;
            }
            c06659o.A00 = A042;
        }
        return true;
    }

    private boolean A0s(ZA za2) {
        C06739x A0H = this.A0K.A0H();
        C06739x readingPeriodHolder = A0H.A01;
        if (readingPeriodHolder != null) {
            C06739x readingPeriodHolder2 = A0H.A01;
            if (readingPeriodHolder2.A06 && za2.A8z()) {
                return true;
            }
        }
        return false;
    }

    private boolean A0t(Et et, long j10, C06739x c06739x) {
        if (et.equals(c06739x.A02.A04) && c06739x.A06) {
            this.A05.A03.A09(c06739x.A02.A04.A02, this.A0L);
            int A04 = this.A0L.A04(j10);
            if (A04 != -1) {
                int nextAdGroupIndex = (this.A0L.A09(A04) > c06739x.A02.A02 ? 1 : (this.A0L.A09(A04) == c06739x.A02.A02 ? 0 : -1));
                if (nextAdGroupIndex == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    private boolean A0u(boolean z10) {
        if (this.A0C.length == 0) {
            return A0q();
        }
        if (!z10) {
            return false;
        }
        if (this.A05.A08) {
            C06739x A0F = this.A0K.A0F();
            long A0C = A0F.A0C(!A0F.A02.A05);
            if (A0C != Long.MIN_VALUE) {
                InterfaceC06729w interfaceC06729w = this.A0J;
                long A08 = A0C - A0F.A08(this.A03);
                String[] strArr = A0W;
                if (strArr[5].length() != strArr[2].length()) {
                    throw new RuntimeException();
                }
                A0W[6] = "2cwTC9SumZz3To3yr3ji";
                if (!interfaceC06729w.AGl(A08, this.A0G.A85().A01, this.A09)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static Format[] A0v(InterfaceC0824Gl interfaceC0824Gl) {
        int length = interfaceC0824Gl != null ? interfaceC0824Gl.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i10 = 0; i10 < length; i10++) {
            Format A7U = interfaceC0824Gl.A7U(i10);
            if (A0W[3].length() == 1) {
                throw new RuntimeException();
            }
            A0W[6] = "MMfeLMq0kgXNQLSglZMb";
            formatArr[i10] = A7U;
        }
        return formatArr;
    }

    public final Looper A0w() {
        return this.A0F.getLooper();
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x0010 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void A0x() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A0A     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L7
            monitor-exit(r2)
            return
        L7:
            com.facebook.ads.redexgen.X.Hs r1 = r2.A0Q     // Catch: java.lang.Throwable -> L23
            r0 = 7
            r1.AGD(r0)     // Catch: java.lang.Throwable -> L23
            r1 = 0
        Le:
            boolean r0 = r2.A0A     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L18
            r2.wait()     // Catch: java.lang.InterruptedException -> L16 java.lang.Throwable -> L23
            goto Le
        L16:
            r1 = 1
            goto Le
        L18:
            if (r1 == 0) goto L21
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L23
            r0.interrupt()     // Catch: java.lang.Throwable -> L23
        L21:
            monitor-exit(r2)
            return
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0778Ec.A0x():void");
    }

    public final void A0y(AM am2, int i10, long j10) {
        this.A0Q.AB1(3, new C06679q(am2, i10, j10)).sendToTarget();
    }

    public final void A0z(Ev ev, boolean z10, boolean z11) {
        this.A0Q.AB0(0, z10 ? 1 : 0, z11 ? 1 : 0, ev).sendToTarget();
    }

    public final void A10(boolean z10) {
        this.A0Q.AAz(1, z10 ? 1 : 0, 0).sendToTarget();
    }

    public final void A11(boolean z10) {
        this.A0Q.AAz(6, z10 ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06559e
    public final void AD4(A2 a22) {
        this.A0E.obtainMessage(1, a22).sendToTarget();
        A0L(a22.A01);
    }

    @Override // com.facebook.ads.redexgen.X.XV
    public final void ADC(XU xu) {
        this.A0Q.AB1(9, xu).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.Eu
    public final void ADd(Ev ev, AM am2, Object obj) {
        this.A0Q.AB1(8, new C06649n(ev, am2, obj)).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.AB
    public final synchronized void AGF(AD ad2) {
        if (this.A0A) {
            Log.w(A06(0, 21, 38), A06(50, 37, 8));
            ad2.A0A(false);
            return;
        }
        this.A0Q.AB1(14, ad2).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String A06 = A06(0, 21, 38);
        try {
            switch (message.what) {
                case 0:
                    A0h((Ev) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    A0l(message.arg1 != 0);
                    break;
                case 2:
                    A07();
                    break;
                case 3:
                    A0T((C06679q) message.obj);
                    break;
                case 4:
                    A0W((A2) message.obj);
                    break;
                case 5:
                    A0d((AI) message.obj);
                    break;
                case 6:
                    A0n(message.arg1 != 0, true);
                    break;
                case 7:
                    A0D();
                    return true;
                case 8:
                    A0S((C06649n) message.obj);
                    break;
                case 9:
                    A0f((XU) message.obj);
                    break;
                case 10:
                    A0e((XU) message.obj);
                    break;
                case 11:
                    A0E();
                    break;
                case 12:
                    A0M(message.arg1);
                    break;
                case 13:
                    A0m(message.arg1 != 0);
                    break;
                case 14:
                    A0Y((AD) message.obj);
                    break;
                case 15:
                    A0a((AD) message.obj);
                    break;
                default:
                    return false;
            }
            A0A();
        } catch (C06589h e10) {
            Log.e(A06, A06(110, 15, 109), e10);
            A0n(false, false);
            this.A0E.obtainMessage(2, e10).sendToTarget();
            A0A();
        } catch (IOException e11) {
            Log.e(A06, A06(125, 13, 66), e11);
            A0n(false, false);
            this.A0E.obtainMessage(2, C06589h.A00(e11)).sendToTarget();
            A0A();
        } catch (RuntimeException e12) {
            Log.e(A06, A06(87, 23, 98), e12);
            A0n(false, false);
            this.A0E.obtainMessage(2, C06589h.A02(e12)).sendToTarget();
            String[] strArr = A0W;
            if (strArr[5].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0W[4] = "bcAD6CyDV16TZBS92I3KgCtMo20e3K69";
            A0A();
        }
        return true;
    }
}
