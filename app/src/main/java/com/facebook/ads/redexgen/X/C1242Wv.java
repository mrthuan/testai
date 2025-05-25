package com.facebook.ads.redexgen.X;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.facebook.ads.redexgen.X.Wv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1242Wv {
    public static String[] A03 = {"ZyytKuNh7ntg7sY8uFdOkQQn3Zd8e", "OPYUEYxxfuFToCoqAJ7LijcBVLMkd", "hMaagKVbo326jUCFjE6xrMqdrUFYGLiL", "YWHqi729yDjGR8jfxkm0wnxT", "fBJq4naDVNOawpqdOhpwTAHQcatL3neF", "IBZtQd8oLy5hBWitakJgcXsasC5LRKBV", "BBZxvQdMJfTK4iSntx4hV9BXJvxyJ8bf", "qOO0IEqnjZtOEmSRMHkcuAad"};
    public HC<? extends HD> A00;
    public IOException A01;
    public final ExecutorService A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final <T extends HD> long A04(T t4, HB<T> hb2, int i10) {
        Looper myLooper = Looper.myLooper();
        AbstractC0844Hf.A04(myLooper != null);
        this.A01 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new HC(this, myLooper, t4, hb2, i10, elapsedRealtime).A06(0L);
        return elapsedRealtime;
    }

    public C1242Wv(String str) {
        this.A02 = IK.A0T(str);
    }

    public final void A05() {
        this.A00.A07(false);
    }

    public final void A06(int i10) throws IOException {
        if (this.A01 == null) {
            if (this.A00 != null) {
                HC<? extends HD> hc2 = this.A00;
                if (i10 == Integer.MIN_VALUE) {
                    i10 = this.A00.A03;
                }
                hc2.A05(i10);
                return;
            }
            return;
        }
        throw this.A01;
    }

    public final void A07(HE he2) {
        if (this.A00 != null) {
            HC<? extends HD> hc2 = this.A00;
            if (A03[1].length() != 29) {
                throw new RuntimeException();
            }
            A03[0] = "olNXxetGG";
            hc2.A07(true);
        }
        if (he2 != null) {
            this.A02.execute(new HF(he2));
        }
        this.A02.shutdown();
    }

    public final boolean A08() {
        return this.A00 != null;
    }
}
