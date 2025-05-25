package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Uy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1194Uy extends AbstractC1012Ny {
    public static ValueCallback A08;
    public static boolean A09;
    public static boolean A0A;
    public static byte[] A0B;
    public static String[] A0C = {"r5lFqG0C0bBGIxytTEblkmz8pOWiln6U", "Y5tMFhpuLobi6U3v3neZGAzEpbrZh2e0", "35iZKMkwZFt7WP5rciHAZ1WswbletKXm", "1wdh7bxI31pnh6pFTaTypUqx", "X0GEkrMG66X1N8QG", "HQ8AmQiqT9dTkfwWyhZ7u2ZNdQoS7Fbv", "yjHJSxajRdLfdjSgilcNPSPFyTq4dELg", "ut8cBtSHXrZx3QiSKTpc7NoA9ie10da9"};
    public static final String A0D;
    public static final Set<String> A0E;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public C1314Zs A04;
    public C1002No A05;
    public InterfaceC1006Ns A06;
    public C1009Nv A07;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 50);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0B = new byte[]{43, Field.IMPORT, Field.IMPORT, Field.MACROBUTTON, 100, 120, 120, 124, Byte.MAX_VALUE};
    }

    static {
        A08();
        A0D = C1194Uy.class.getSimpleName();
        A0E = new HashSet(2);
        A09 = false;
        A0A = false;
        A0E.add(A05(0, 4, 113));
        A0E.add(A05(4, 5, 62));
    }

    public C1194Uy(C1314Zs c1314Zs, Activity activity, InterfaceC1006Ns interfaceC1006Ns) {
        super(activity, c1314Zs);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A0A(c1314Zs, interfaceC1006Ns);
    }

    public C1194Uy(C1314Zs c1314Zs, InterfaceC1006Ns interfaceC1006Ns) {
        super(c1314Zs);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A0A(c1314Zs, interfaceC1006Ns);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1012Ny
    /* renamed from: A04 */
    public final C1009Nv A0E() {
        return new C1009Nv(new WeakReference(this.A04), new WeakReference(this.A06), new WeakReference(this.A05));
    }

    private void A07() {
        if (this.A02 > -1 && this.A00 > -1 && this.A01 > -1) {
            this.A05.A05(false);
        }
    }

    public static void A09(int i10, int i11, Intent intent) {
        if (A08 != null && i10 == 1001) {
            if (Build.VERSION.SDK_INT >= 21) {
                A08.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i11, intent));
            } else {
                A08.onReceiveValue(intent.getData());
            }
            A08 = null;
        }
    }

    private void A0A(C1314Zs c1314Zs, InterfaceC1006Ns interfaceC1006Ns) {
        this.A04 = c1314Zs;
        this.A06 = interfaceC1006Ns;
        this.A05 = new C1002No(this);
        A09 = AbstractC0878In.A03(this.A04);
        A0A = AbstractC0878In.A04(this.A04);
        WebSettings settings = getSettings();
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        setWebChromeClient(A0D());
        this.A07 = A0E();
        setWebViewClient(this.A07);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1012Ny
    public final WebChromeClient A0D() {
        return new C1008Nu(new WeakReference(this.A04), new WeakReference(this.A06), new WeakReference(this.A05));
    }

    public final void A0F(long j10) {
        if (this.A00 < 0) {
            this.A00 = j10;
        }
        A07();
        String[] strArr = A0C;
        if (strArr[6].charAt(18) == strArr[0].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[4] = "TnIn5PelVgDBsDwa";
        strArr2[3] = "kaGwwHcDVWZGOuagxs1W4ZQa";
    }

    public final void A0G(long j10) {
        if (this.A01 < 0) {
            this.A01 = j10;
        }
        A07();
    }

    public final void A0H(long j10) {
        if (this.A02 < 0) {
            this.A02 = j10;
        }
        A07();
        String[] strArr = A0C;
        if (strArr[5].charAt(4) == strArr[7].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[6] = "DwC46XxC2zY9iA5O924mXxlTXzY8IGhb";
        strArr2[0] = "1LscF1ZcfF08U7LpSibJFf3LFm8iDmJu";
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1012Ny, android.webkit.WebView
    public final void destroy() {
        this.A06 = null;
        O4.A03(this);
        super.destroy();
    }

    public long getDomContentLoadedMs() {
        return this.A00;
    }

    public String getFirstUrl() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        if (copyBackForwardList.getSize() > 0) {
            return copyBackForwardList.getItemAtIndex(0).getUrl();
        }
        return getUrl();
    }

    public long getLoadFinishMs() {
        return this.A01;
    }

    public long getResponseEndMs() {
        return this.A02;
    }

    public long getScrollReadyMs() {
        return this.A03;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A03 < 0 && computeVerticalScrollRange() > getHeight()) {
            this.A03 = System.currentTimeMillis();
        }
    }

    public void setBrowserNavigationListener(InterfaceC1007Nt interfaceC1007Nt) {
        this.A07.A06(new WeakReference<>(interfaceC1007Nt));
    }

    public void setInterceptRedirectRequest(InterfaceC1005Nr interfaceC1005Nr) {
        this.A07.A05(interfaceC1005Nr);
    }
}
