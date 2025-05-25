package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.ads.redexgen.X.HD;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public final class HC<T extends HD> extends Handler implements Runnable {
    public static byte[] A0A;
    public static String[] A0B = {"jnbmIE2916PFpUTPOA8pGlKEXy6RHOsj", "9rhOhRNdxlxAg8zNXDvdXeOLZ3R", "9E94u0qc0K0USfGlf79CEW8gWN5Gt", "Qc5NHzHyAtQ93FWvZt19c61s8RDFcyv6", "ZqeOda301Fdz3JQ2hYEiJQV5PqrnYtOf", "ayOQ3imumLDr4CxNka1OeixDC9uOGZjB", "c8BnLV9KGCbGJHkN4eSXXrImznfnFd0b", "IX3a2OshrR8CckanHKp7BtIP31Kfs"};
    public int A00;
    public HB<T> A01;
    public IOException A02;
    public final int A03;
    public final long A04;
    public final T A05;
    public volatile Thread A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public final /* synthetic */ C1242Wv A09;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 43);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0A = new byte[]{105, 122, Field.AUTONUM, Field.SYMBOL, Field.ASK, 107, 78, 109, 99, 102, 86, 99, 113, 105, 8, Field.GOTOBUTTON, Field.MACROBUTTON, 8, 33, 10, 34, 42, Field.DATA, Field.AUTONUMLGL, Field.USERADDRESS, 103, 34, Field.AUTONUMLGL, Field.AUTONUMLGL, Field.DATA, Field.AUTONUMLGL, 103, 43, Field.DATA, Field.ASK, Field.QUOTE, Field.DDEAUTO, 41, 32, 103, Field.AUTONUMOUT, Field.MACROBUTTON, Field.AUTONUMLGL, 34, Field.ASK, 42, 100, Field.SHAPE, Field.ADVANCE, Field.TOA, Field.SECTION, Field.ADVANCE, 82, Field.FILESIZE, Field.ADVANCE, Field.DOCPROPERTY, 17, Field.ADVANCE, Field.INCLUDEPICTURE, Field.INCLUDEPICTURE, Field.GREETINGLINE, Field.INCLUDEPICTURE, 17, Field.ADDRESSBLOCK, Field.GREETINGLINE, 80, Field.DOCPROPERTY, Field.HYPERLINK, Field.SHAPE, 86, 17, Field.SECTIONPAGES, Field.FILESIZE, Field.INCLUDEPICTURE, Field.ADVANCE, 80, Field.BIDIOUTLINE, 41, 18, 25, 4, 12, 25, 31, 8, 25, 24, Field.BIDIOUTLINE, 25, 4, 31, 25, 12, 8, 21, 19, 18, Field.BIDIOUTLINE, 20, 29, 18, 24, 16, 21, 18, Field.NUMWORDS, Field.BIDIOUTLINE, 16, 19, 29, 24, Field.BIDIOUTLINE, 31, 19, 17, 12, 16, 25, 8, 25, 24, Field.DDEAUTO, 21, 30, 3, 11, 30, 24, 15, 30, 31, Field.HTMLCONTROL, 30, 3, 24, 30, 11, 15, 18, 20, 21, Field.HTMLCONTROL, 23, 20, 26, 31, 18, 21, Field.NUMCHARS, Field.HTMLCONTROL, 8, 15, 9, 30, 26, 22, 111, 108, 98, 103, Field.SYMBOL, Field.BARCODE, 96, 111, 112, 61};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            if (this.A08) {
                return;
            }
            if (message.what == 0) {
                A02();
            } else if (message.what == 4) {
                throw ((Error) message.obj);
            } else {
                A03();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.A04;
                if (this.A07) {
                    this.A01.ACQ(this.A05, elapsedRealtime, j10, false);
                    return;
                }
                switch (message.what) {
                    case 1:
                        this.A01.ACQ(this.A05, elapsedRealtime, j10, false);
                        return;
                    case 2:
                        try {
                            this.A01.ACS(this.A05, elapsedRealtime, j10);
                            return;
                        } catch (RuntimeException e10) {
                            Log.e(A01(6, 8, 41), A01(77, 44, 87), e10);
                            this.A09.A01 = new HH(e10);
                            return;
                        }
                    case 3:
                        this.A02 = (IOException) message.obj;
                        int ACT = this.A01.ACT(this.A05, elapsedRealtime, j10, this.A02);
                        if (ACT == 3) {
                            this.A09.A01 = this.A02;
                            return;
                        } else if (ACT != 2) {
                            int i10 = 1;
                            if (ACT != 1) {
                                i10 = 1 + this.A00;
                            }
                            this.A00 = i10;
                            A06(A00());
                            return;
                        } else {
                            return;
                        }
                    default:
                        return;
                }
            }
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }

    static {
        A04();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HB != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.HD> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    public HC(C1242Wv c1242Wv, Looper looper, T loadable, HB<T> hb2, int i10, long j10) {
        super(looper);
        this.A09 = c1242Wv;
        this.A05 = loadable;
        this.A01 = hb2;
        this.A03 = i10;
        this.A04 = j10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    private long A00() {
        return Math.min((this.A00 - 1) * 1000, 5000);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    private void A02() {
        ExecutorService executorService;
        HC hc2;
        this.A02 = null;
        executorService = this.A09.A02;
        hc2 = this.A09.A00;
        executorService.execute(hc2);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    private void A03() {
        this.A09.A00 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    public final void A05(int i10) throws IOException {
        if (this.A02 == null || this.A00 <= i10) {
            return;
        }
        throw this.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    public final void A06(long j10) {
        HC hc2;
        hc2 = this.A09.A00;
        AbstractC0844Hf.A04(hc2 == null);
        C1242Wv c1242Wv = this.A09;
        String[] strArr = A0B;
        if (strArr[5].charAt(15) != strArr[6].charAt(15)) {
            throw new RuntimeException();
        }
        A0B[1] = "zIFvZ9";
        c1242Wv.A00 = this;
        if (j10 > 0) {
            sendEmptyMessageDelayed(0, j10);
        } else {
            A02();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    public final void A07(boolean z10) {
        this.A08 = z10;
        this.A02 = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            this.A07 = true;
            this.A05.A4W();
            if (this.A06 != null) {
                Thread thread = this.A06;
                if (A0B[4].charAt(9) == 'w') {
                    throw new RuntimeException();
                }
                A0B[4] = "r4RNyVnork5imI2VujkZnwWbxz1Yztux";
                thread.interrupt();
            }
        }
        if (z10) {
            A03();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A01.ACQ(this.A05, elapsedRealtime, elapsedRealtime - this.A04, true);
            this.A01 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    @Override // java.lang.Runnable
    public final void run() {
        String A01 = A01(6, 8, 41);
        if (KQ.A02(this)) {
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            this.A06 = Thread.currentThread();
                            if (!this.A07) {
                                IH.A02(A01(ShapeTypes.FLOW_CHART_MAGNETIC_DRUM, 10, 40) + this.A05.getClass().getSimpleName() + A01(0, 6, 126));
                                try {
                                    this.A05.A9o();
                                } finally {
                                    IH.A00();
                                }
                            }
                            if (!this.A08) {
                                sendEmptyMessage(2);
                            }
                        } catch (Error e10) {
                            Log.e(A01, A01(46, 31, 26), e10);
                            if (!this.A08) {
                                obtainMessage(4, e10).sendToTarget();
                            }
                            throw e10;
                        } catch (InterruptedException unused) {
                            AbstractC0844Hf.A04(this.A07);
                            if (!this.A08) {
                                sendEmptyMessage(2);
                            }
                        }
                    } catch (Exception e11) {
                        Log.e(A01, A01(121, 35, 80), e11);
                        if (!this.A08) {
                            obtainMessage(3, new HH(e11)).sendToTarget();
                        }
                    }
                } catch (OutOfMemoryError e12) {
                    Log.e(A01, A01(14, 32, 108), e12);
                    if (!this.A08) {
                        obtainMessage(3, new HH(e12)).sendToTarget();
                    }
                }
            } catch (IOException e13) {
                if (!this.A08) {
                    obtainMessage(3, e13).sendToTarget();
                }
            }
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
