package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class JD implements InterfaceC1543dq {
    public static boolean A06;
    public static byte[] A07;
    public static String[] A08 = {"q4sdjOooEVufGDgMwyNc9jWxRXQ4NKpo", "yaMKZNXBbeA6fw4ll6xnZl", "LnDp8JiwGSMQDya01UkwkftwucQ290J", "uAR9lTohqzoJg24TEcnvxnVGMAtVVlcu", "gX2x55Ut", "7esZ6Tms7", "A5370bVq", "dlMe6TUFAyxvhKGLzAxCUk9grhyb1S3t"};
    public final InterfaceC1547dv A02;
    public final WeakReference<View> A03;
    public final List<Rect> A04 = new LinkedList();
    public final List<Rect> A05 = new ArrayList();
    public final Rect A01 = new Rect();
    public final Rect A00 = new Rect();

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 25);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-21, -23, -8, -57, -16, -19, -12, -42, -23, -25, -8};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final void A02(List<Rect> list) {
        list.clear();
        this.A04.clear();
        View view = this.A03.get();
        if (view == null || !view.getGlobalVisibleRect(this.A01) || this.A01.isEmpty()) {
            return;
        }
        this.A04.add(this.A01);
        Iterator<SN> it = this.A02.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A00(0, 11, 107));
        }
        list.addAll(this.A04);
        String[] strArr = A08;
        if (strArr[6].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A08[5] = "4CMokHw9SxiYZ0wA3ytFK";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final void A03(List<Rect> list) {
        list.clear();
        this.A05.clear();
        View view = this.A03.get();
        if (view == null || !view.getGlobalVisibleRect(this.A01) || this.A01.isEmpty()) {
            return;
        }
        this.A05.add(this.A01);
        if (0 < this.A02.size()) {
            this.A02.A6C(0);
            throw new NullPointerException(A00(0, 11, 107));
        } else {
            list.addAll(this.A05);
        }
    }

    static {
        A01();
    }

    public JD(View view, InterfaceC1547dv interfaceC1547dv) {
        this.A03 = new WeakReference<>(view);
        this.A02 = interfaceC1547dv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1543dq
    public final void A8m(List<Rect> outList) {
        if (A06) {
            A03(outList);
        } else {
            A02(outList);
        }
    }
}
