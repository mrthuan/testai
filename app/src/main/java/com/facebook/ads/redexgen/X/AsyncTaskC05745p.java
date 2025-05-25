package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.5p  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class AsyncTaskC05745p extends AsyncTask<C05765r, Void, Drawable> {
    public static byte[] A03;
    public static String[] A04 = {"Er5x4Nf8UA9tVLePD2EX", "DtYF9X90t5u", "I941X6fzqWLmgCmjxes", "iBgQ7OI2DFUGAw4NUel9vSUdaaiAzSqO", "QcmiodlDN7oY3kgnmckrDpvdiERsjn9V", "z", "b", "KLyCCmbDECCjA8c7XM6gY8wQDdZdMwfW"};
    public final InterfaceC05755q A00;
    public final C1314Zs A01;
    public final boolean A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final Drawable A00(C05765r... c05765rArr) {
        if (!KQ.A02(this) && c05765rArr != null) {
            try {
                if (c05765rArr.length >= 1) {
                    String str = c05765rArr[0].A01;
                    String str2 = c05765rArr[0].A00;
                    Bitmap A0N = new C05906f(this.A01).A0N(str, -1, -1);
                    if (A0N != null) {
                        return W7.A05(this.A01, A0N, this.A02, str2);
                    }
                    return null;
                }
            } catch (Throwable th2) {
                KQ.A00(th2, this);
                return null;
            }
        }
        return null;
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] ^ i12) ^ 36;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A04[2] = "XzO4PGfz9rpTObXE3Krp6";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{Field.FORMCHECKBOX, Field.FILESIZE, 78, Field.FILESIZE, 82, Field.TOA, Field.INCLUDEPICTURE};
    }

    static {
        A02();
    }

    public AsyncTaskC05745p(C1314Zs c1314Zs, InterfaceC05755q interfaceC05755q, boolean z10) {
        this.A01 = c1314Zs;
        this.A00 = interfaceC05755q;
        this.A02 = z10;
    }

    public /* synthetic */ AsyncTaskC05745p(C1314Zs c1314Zs, InterfaceC05755q interfaceC05755q, boolean z10, C1336aE c1336aE) {
        this(c1314Zs, interfaceC05755q, z10);
    }

    private final void A03(Drawable drawable) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.AC9(drawable);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Drawable doInBackground(C05765r[] c05765rArr) {
        if (KQ.A02(this)) {
            return null;
        }
        try {
            return A00(c05765rArr);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Drawable drawable) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            A03(drawable);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
