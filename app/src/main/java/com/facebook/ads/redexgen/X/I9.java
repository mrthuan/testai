package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import lib.zj.office.fc.hwpf.usermodel.Field;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J \u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00030\u00030\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/instagram/common/viewpoint/core/ViewpointViewNode;", "Lcom/meta/analytics/dsp/uinode/DspViewableNode;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "getView", "()Landroid/view/View;", "viewRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "equals", "", "other", "", "getVisibleRectWithinViewport", "outGlobalVisibleRect", "Landroid/graphics/Rect;", "outGlobalRect", "viewportRect", "hashCode", "", "Companion", "fbandroid.java.com.instagram.common.viewpoint.core.core_an"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: assets/audience_network.dex */
public final class I9 implements DspViewableNode {
    public static byte[] A01;
    public static String[] A02 = {"qlxMVOnC9COcKZYZMIIp", "e0umeVRVCdZ74AfkeJbH87y4T07IZLh0", "i66o8C63ky1KE2dtbuTW4TOWqloIKDrs", "LkxvoQ7DD1pBAo3rq5X8aF2iImmrJAYT", "6eVsPVOukcdBuHl172QQtpwtpqadKDAQ", "cx1fs60kw", "R4DtDeY0gnGqEQjTJlumZIRTz9kcJt7M", "qFc9SandmZqx0yjNiQ6hc35paacWJuqv"};
    public static final C1527dY A03;
    public static final WeakHashMap<View, I9> A04;
    public final WeakReference<View> A00;

    public /* synthetic */ I9(View view, AbstractC1513d8 abstractC1513d8) {
        this(view);
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 29);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {Field.QUOTE, Field.SYMBOL, 56, 11, 32, Field.QUOTE, Field.DDEAUTO, Field.DDE, 32, 30, 41, Field.GLOSSARY, 56, Field.FORMTEXT, Field.BIDIOUTLINE, Field.ADDRESSBLOCK, 110, Field.FILESIZE, Field.FORMTEXT, Field.MERGESEQ, Field.NOTEREF, Field.FILESIZE, Byte.MAX_VALUE, 64, Field.LISTNUM, 64, Field.MERGESEQ, Field.FILESIZE, 76, 123, 76, 74, Field.ADDRESSBLOCK, Field.USERADDRESS, 33, Field.DDE, Field.BARCODE, 56, Field.FILLIN, 58, 60, 26, Field.DDE, 43, 60};
        String[] strArr = A02;
        if (strArr[2].charAt(28) != strArr[4].charAt(28)) {
            throw new RuntimeException();
        }
        A02[0] = "5c7wFedRmnB8vDCVoIYp";
        A01 = bArr;
    }

    static {
        A03();
        A03 = new C1527dY(null);
        A04 = new WeakHashMap<>();
    }

    public I9(View view) {
        this.A00 = new WeakReference<>(view);
    }

    @JvmStatic
    public static final I9 A00(View view) {
        return A03.A02(view);
    }

    @Override // com.facebook.ads.redexgen.X.DspViewableNode
    public final boolean A8l(Rect rect, Rect rect2, Rect rect3) {
        C1512d7.A07(rect, A01(13, 20, 52));
        C1512d7.A07(rect2, A01(0, 13, 81));
        C1512d7.A07(rect3, A01(33, 12, 85));
        View view = this.A00.get();
        if (view == null) {
            return false;
        }
        return AbstractC1526dX.A00(view, rect, rect2, rect3);
    }

    public final boolean equals(Object obj) {
        View view;
        if (obj == this) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = obj.getClass();
            String[] strArr = A02;
            if (strArr[2].charAt(28) != strArr[4].charAt(28)) {
                throw new RuntimeException();
            }
            A02[1] = "EpRMW7zpKY57PfT1pdGczBJUTQVGWfux";
            return C1512d7.A0A(cls, getClass()) && (view = this.A00.get()) != null && view == ((I9) obj).A00.get();
        }
        return false;
    }

    public final int hashCode() {
        View view = this.A00.get();
        if (view != null) {
            return view.hashCode();
        }
        return 0;
    }
}
