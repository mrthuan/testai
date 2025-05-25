package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Nh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0995Nh implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0997Nj A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-23, -22, -9, -3, -4, -62, -22, -12, -23, -10, -13, -32, -19, -34, -32, -30, -13, -24, -11, -24, -13, -8, 16, 29, 19, 33, 30, 24, 19, -35, 24, 29, Field.QUOTE, 20, 29, Field.QUOTE, -35, 16, 18, Field.QUOTE, 24, 30, 29, -35, 5, -8, -12, 6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        C1314Zs c1314Zs;
        C1314Zs c1314Zs2;
        C1314Zs c1314Zs3;
        InterfaceC0996Ni interfaceC0996Ni;
        if (KQ.A02(this)) {
            return;
        }
        try {
            str = this.A00.A07;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String A00 = A00(0, 11, 12);
            str2 = this.A00.A07;
            if (A00.equals(str2)) {
                return;
            }
            String A002 = A00(22, 26, 51);
            str3 = this.A00.A07;
            Intent intent = new Intent(A002, L5.A00(str3));
            intent.addFlags(268435456);
            c1314Zs = this.A00.A0B;
            c1314Zs.A0E().A95();
            try {
                c1314Zs3 = this.A00.A0B;
                C0928Kq.A0C(c1314Zs3, intent);
                interfaceC0996Ni = this.A00.A05;
                interfaceC0996Ni.ACs();
            } catch (C0926Ko e10) {
                Throwable cause = e10.getCause();
                Throwable th2 = e10;
                if (cause != null) {
                    th2 = e10.getCause();
                }
                c1314Zs2 = this.A00.A0B;
                c1314Zs2.A07().AA0(A00(11, 11, 3), C8E.A00, new C8F(th2));
            }
        } catch (Throwable th3) {
            KQ.A00(th3, this);
        }
    }

    public View$OnClickListenerC0995Nh(C0997Nj c0997Nj) {
        this.A00 = c0997Nj;
    }
}
