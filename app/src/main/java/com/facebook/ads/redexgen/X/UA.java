package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* loaded from: assets/audience_network.dex */
public class UA extends AbstractC1012Ny {
    public static byte[] A01;
    public static String[] A02 = {"Hi1Kp4OvuN0Mi1seIlZSQ9fXUMjjvE9p", "a9aQz404TSolCr57kPPHO7UwC5OuSOzH", "iZ3", "0R4wIBceXoURlcuySRfEAV2VVdZMdToQ", "Pns5aPZ6VZAIHBBYLIEekDbTjPHG0hEC", "QEtpGmawVai8H8emaUXHDe6205ss7rIx", "CSF", "KC7cPyOdjWwnXiGHMOi8VSLb8GeuOYES"};
    public final /* synthetic */ C1041Pb A00;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{-44, -23, -34, -47, -35, -39, -45, -49, -29, -44, -37, -49, -36, -47, -23, -43, -30, -49, -45, -33, -34, -28, -43, -34, -28, -49, -40, -43, -39, -41, -40, -28, -53, -32, -43, -56, -44, -48, -54, -58, -38, -53, -46, -58, -45, -56, -32, -52, -39, -58, -54, -42, -43, -37, -52, -43, -37, -58, -34, -48, -53, -37, -49};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int dynamicWebViewWidth = getDynamicWebViewWidth();
        int dynamicWebViewHeight = getDynamicWebViewHeight();
        if (dynamicWebViewWidth <= 0 || dynamicWebViewHeight <= 0) {
            super.onMeasure(i10, i11);
            return;
        }
        float f10 = dynamicWebViewWidth / dynamicWebViewHeight;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        boolean z10 = mode != 1073741824;
        boolean z11 = mode2 != 1073741824;
        int i12 = getResources().getDisplayMetrics().widthPixels;
        int i13 = getResources().getDisplayMetrics().heightPixels;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int width = viewGroup.getWidth();
            i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            i12 = width != 0 ? viewGroup.getWidth() : Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (viewGroup.getHeight() != 0) {
                i13 = viewGroup.getHeight();
            }
        }
        int A012 = A01(dynamicWebViewWidth, i12, i10);
        int A013 = A01(dynamicWebViewHeight, i13, i11);
        if ((z11 || z10) && Math.abs((A012 / A013) - f10) > 1.0E-7d) {
            boolean z12 = false;
            if (z11) {
                A013 = (int) (A012 / f10);
                z12 = true;
            }
            if (!z12 && z10) {
                float f11 = A013 * f10;
                if (A02[4].charAt(14) == 'W') {
                    throw new RuntimeException();
                }
                A02[4] = "z0LYwU9eQuMrdS04YY6f4w1GT5TpPfvp";
                A012 = (int) f11;
            }
        }
        setMeasuredDimension(A012, A013);
    }

    static {
        A04();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UA(C1041Pb c1041Pb, C1314Zs c1314Zs) {
        super(c1314Zs);
        this.A00 = c1041Pb;
        getSettings().setAllowFileAccess(true);
        setBackgroundColor(0);
    }

    private int A01(int i10, int i11, int i12) {
        int specMode = View.MeasureSpec.getMode(i12);
        int result = View.MeasureSpec.getSize(i12);
        switch (specMode) {
            case SlideAtom.USES_MASTER_SLIDE_ID /* -2147483648 */:
                int min = Math.min(i10, result);
                String[] strArr = A02;
                String str = strArr[0];
                String str2 = strArr[7];
                int specMode2 = str.charAt(6);
                if (specMode2 != str2.charAt(6)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[6] = "m6i";
                strArr2[2] = "Lyc";
                return Math.min(min, i11);
            case 0:
                return Math.min(i10, i11);
            case 1073741824:
                return result;
            default:
                return i10;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1012Ny
    public final WebChromeClient A0D() {
        return new PW(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1012Ny
    public final WebViewClient A0E() {
        return new PX(this.A00);
    }

    private int getDynamicWebViewHeight() {
        AbstractC1456cD abstractC1456cD;
        abstractC1456cD = this.A00.A09;
        return abstractC1456cD.A0o().optInt(A03(0, 32, 84));
    }

    private int getDynamicWebViewWidth() {
        AbstractC1456cD abstractC1456cD;
        abstractC1456cD = this.A00.A09;
        return abstractC1456cD.A0o().optInt(A03(32, 31, 75));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PQ pq;
        PQ pq2;
        pq = this.A00.A02;
        if (pq != null) {
            pq2 = this.A00.A02;
            pq2.ADo(this, motionEvent);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (A02[1].charAt(18) != 'P') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[0] = "8G0frzOI4hnuLOXw8ofdNPqhqb4ZK9tq";
        strArr[7] = "WF4GKlO7gB8U235davoNaDl6h9NjfHA4";
        return onTouchEvent;
    }
}
