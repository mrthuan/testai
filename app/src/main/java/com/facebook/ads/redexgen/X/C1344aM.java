package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.ads.DefaultMediaViewVideoRenderer;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.AdComponentView;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdComponentViewParentApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.tom_roush.fontbox.ttf.WGL4Names;
import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.aM  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1344aM extends C5Y implements MediaViewApi, Repairable, InterfaceC06097e {
    public static byte[] A0E;
    public static String[] A0F = {"opPNeHLRCwNMjghH70VvpS5N8kNNBiJu", "eEOY2RUjN4bpbDsCyz0GPhNNbfKnjNLD", "VFQc0pqb8IELGhnpfLoj2hUSBo2VhTCu", "GBUHck22", "gxS7cL5mKFosIlCCzwl1gr8LaZQoy", "JvRhV7isjcFk5", "Q8NK4BrUIZ6kI5bk", "yT7QEu4e"};
    public static final String A0G;
    public View A00;
    public View A01;
    public ImageView A02;
    public MediaView A03;
    public MediaViewListener A04;
    public MediaViewVideoRenderer A05;
    public AdComponentViewParentApi A06;
    public C1314Zs A07;
    public C3C A08;
    public O5 A09;
    public BN A0A;
    public QS A0B;
    public boolean A0C;
    public boolean A0D;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0F;
            if (strArr[6].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[6] = "ck5ggAbj2vioxfDq";
            strArr2[4] = "NneLGMvrJ83sFMBsADIKrHrKRcoTv";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 74);
            i13++;
        }
    }

    public static void A08() {
        A0E = new byte[]{-61, -31, -14, -17, -11, -13, -27, -20, -96, -14, -27, -18, -28, -27, -14, -27, -14, -96, -19, -11, -13, -12, -96, -30, -27, -96, -13, -27, -12, -96, -30, -27, -26, -17, -14, -27, -96, -18, -31, -12, -23, -10, -27, -63, -28, -82, 9, 5, 4, 56, Field.FILLIN, 44, Field.DATA, Field.EQ, Field.ASK, Field.DATA, 17, Field.DATA, Field.IMPORT, 58, Field.GOTOBUTTON, Field.AUTONUMLGL, Field.DDEAUTO, -52, -16, -28, -22, -24, -93, -11, -24, -15, -25, -24, -11, -24, -11, -93, -16, -8, -10, -9, -93, -27, -24, -93, -10, -24, -9, -93, -27, -24, -23, -14, -11, -24, -93, -15, -28, -9, -20, -7, -24, -60, -25, -79, -7, 29, 17, 23, 21, -48, 34, 21, 30, 20, 21, 34, 21, 34, -48, 29, Field.PAGEREF, Field.QUOTE, 36, -48, 18, 21, -48, Field.QUOTE, 21, 36, -48, 18, 21, 22, 31, 34, 21, -48, 30, 17, 36, 25, Field.ASK, 21, -14, 17, 30, 30, 21, 34, -15, 20, -34, -83, -46, -38, -59, -48, -51, -56, -124, -70, -51, -55, -37, -124, -57, -45, -46, -41, -40, -42, -39, -57, -40, -45, -42, -124, -44, -59, -42, -59, -47, -41, -124, -40, -35, -44, -55, -110, -62, -43, -24, -35, -22, -39, -108, -75, -40, -108, -67, -41, -29, -30, -108, -35, -25, -108, -30, -23, -32, -32, -94, -26, -7, -12, -11, -1, -80, 2, -11, -2, -12, -11, 2, -11, 2, -80, -3, 5, 3, 4, -80, -14, -11, -80, 3, -11, 4, -80, -14, -11, -10, -1, 2, -11, -80, -2, -15, 4, -7, 6, -11, -47, -12, -66, -41, -26, -33, -70, -58, -60, -123, -67, -72, -70, -68, -71, -58, -58, -62, -123, -72, -69, -54, -123, -59, -72, -53, -64, -51, -68, -123, -70, -61, -64, -70, -62, -68, -69, -15, -28, -33, -32, -22, -48, -19, -25, -72};
    }

    static {
        A08();
        A0G = MediaView.class.getSimpleName();
    }

    private void A05() {
        if (this.A0A != null) {
            this.A0A.setVisibility(8);
            C3T.A0A(this.A0A.getDynamicWebViewController().A0O(), new ColorDrawable(0));
            this.A03.removeView(this.A0A);
            this.A0A = null;
        }
    }

    private void A06() {
        if (!this.A0D) {
            if (this.A01 != null) {
                M3.A0J(this.A08);
            }
            float f10 = LP.A02;
            float density = 4.0f * f10;
            int hPadding = Math.round(density);
            float density2 = 12.0f * f10;
            int vPadding = Math.round(density2);
            this.A08.setChildSpacing(hPadding);
            this.A08.setPadding(0, vPadding, 0, vPadding);
            this.A08.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A01 = this.A08;
            this.A03.addView(this.A01, layoutParams);
            return;
        }
        throw new IllegalStateException(A04(0, 46, 54));
    }

    private void A07() {
        LU.A04(this.A03, LU.A0B);
        LU.A04(this.A09, LU.A0B);
        LU.A04(this.A05, LU.A0B);
        LU.A04(this.A01, LU.A0B);
    }

    private final void A09(View view, ViewGroup.LayoutParams layoutParams) {
        A01(false);
        this.A03.addView(view, layoutParams);
        A01(true);
    }

    private void A0A(View view, W7 w7) {
        if (this.A0B != null) {
            this.A03.removeView(this.A0B);
        }
        if (!w7.A1f()) {
            return;
        }
        String A1C = w7.A1C();
        if (this.A03.getContext() == null) {
            return;
        }
        this.A0B = QR.A01(this.A07, A1C);
        if (this.A0B != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(5, view.getId());
            layoutParams.addRule(7, view.getId());
            layoutParams.addRule(6, view.getId());
            layoutParams.addRule(8, view.getId());
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.addRule(16, view.getId());
                layoutParams.addRule(17, view.getId());
            }
            A09(this.A0B, layoutParams);
            this.A06.bringChildToFront(this.A0B);
        }
    }

    private void A0B(ImageView imageView) {
        if (!this.A0D) {
            ImageView imageView2 = this.A02;
            if (A0F[5].length() != 13) {
                throw new RuntimeException();
            }
            A0F[1] = "0pGJtKTiEG7M1QZmgSqLESVqtH6XSoGw";
            if (imageView2 != null) {
                M3.A0J(this.A02);
            }
            imageView.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(imageView, layoutParams);
            imageView.setId(M3.A00());
            this.A02 = imageView;
            return;
        }
        throw new IllegalStateException(A04(106, 49, 102));
    }

    private final void A0C(C1314Zs c1314Zs, AttributeSet attributeSet, int i10, int i11, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1314Zs, attributeSet, i10, i11));
        A0H(new O5(c1314Zs, attributeSet, i10, i11));
        this.A08 = new C3C(c1314Zs, attributeSet, i10);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1314Zs, attributeSet, i10, i11));
        A07();
    }

    private final void A0D(C1314Zs c1314Zs, AttributeSet attributeSet, int i10, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1314Zs, attributeSet, i10));
        A0H(new O5(c1314Zs, attributeSet, i10));
        this.A08 = new C3C(c1314Zs, attributeSet, i10);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1314Zs, attributeSet, i10));
        A07();
    }

    private final void A0E(C1314Zs c1314Zs, AttributeSet attributeSet, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1314Zs, attributeSet));
        A0H(new O5(c1314Zs, attributeSet));
        this.A08 = new C3C(c1314Zs, attributeSet);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1314Zs, attributeSet));
        A07();
    }

    private final void A0F(C1314Zs c1314Zs, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1314Zs));
        A0H(new O5(c1314Zs));
        this.A08 = new C3C(c1314Zs);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1314Zs));
        A07();
    }

    private void A0G(W7 w7, boolean z10, JU ju) {
        AsyncTaskC1183Un A04 = new AsyncTaskC1183Un(this.A02, this.A07).A04();
        if (z10) {
            A04.A06(new C1351aT(this, w7));
        }
        A04.A07(ju.getUrl());
    }

    private void A0H(O5 o52) {
        if (!this.A0D) {
            if (this.A09 != null) {
                this.A03.removeView(this.A09);
            }
            o52.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(o52, layoutParams);
            this.A09 = o52;
            return;
        }
        throw new IllegalStateException(A04(63, 43, 57));
    }

    private boolean A0I(NativeAd nativeAd) {
        List<NativeAd> carousel = ((C05695k) nativeAd.getNativeAdApi()).A03();
        if (carousel == null) {
            return false;
        }
        for (NativeAd nativeAd2 : carousel) {
            if (nativeAd2.getAdCoverImage() == null) {
                return false;
            }
        }
        if (A0F[5].length() != 13) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[6] = "NNKiamhSotpSBh0S";
        strArr[4] = "WQowSckFUFZtjqKDGN1yGWQ8HKryj";
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0J(NativeAd nativeAd) {
        return Build.VERSION.SDK_INT >= 14 && !TextUtils.isEmpty(((C05695k) nativeAd.getNativeAdApi()).A02());
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x02f1, code lost:
        if (r2.getAdCoverImage() != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02f3, code lost:
        new com.facebook.ads.redexgen.X.AsyncTaskC1183Un(r17.A03, r17.A07).A05(r17.A03.getHeight(), r17.A03.getWidth()).A06(new com.facebook.ads.redexgen.X.C1347aP(r17, r2)).A07(r2.getAdCoverImage().getUrl());
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0324, code lost:
        if (com.facebook.ads.internal.api.BuildConfigApi.isDebug() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0326, code lost:
        android.util.Log.i(com.facebook.ads.redexgen.X.C1344aM.A0G, A04(292, 9, 49) + ((com.facebook.ads.redexgen.X.C05695k) r18.getNativeAdApi()).A02());
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0350, code lost:
        A0A(r17.A05, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x037a, code lost:
        if (r2.getAdCoverImage() != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0L(com.facebook.ads.NativeAd r18) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1344aM.A0L(com.facebook.ads.NativeAd):void");
    }

    public final void A0M(NativeAdBaseApi nativeAdBaseApi, boolean z10) {
        C1314Zs A11 = ((W7) nativeAdBaseApi).A11();
        C1314Zs adObjectContext = this.A07;
        adObjectContext.A0K(A11);
        A11.A0N(this);
        this.A0D = true;
        W7 A0L = W7.A0L(nativeAdBaseApi);
        A0L.A1R(this.A03);
        this.A09.setVisibility(8);
        this.A09.setImage(null, null);
        this.A05.setVisibility(8);
        this.A05.unsetNativeAd();
        ((C05665h) this.A05.getMediaViewVideoRendererApi()).A03();
        if (this.A01 != null) {
            this.A01.setVisibility(8);
            if (this.A01 instanceof C1010Nw) {
                ((C1010Nw) this.A01).A04();
            } else {
                ((FL) this.A01).setAdapter(null);
            }
        }
        this.A02.setVisibility(0);
        bringChildToFront(this.A02);
        this.A00 = this.A02;
        JU adIcon = A0L.getAdIcon();
        if (adIcon != null) {
            C05906f A10 = A0L.A10();
            if (A0F[1].charAt(7) == 'A') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[3] = "8vonm0Gh";
            strArr[7] = "EfYx5Mmt";
            Bitmap A0M = A10.A0M(adIcon.getUrl());
            if (A0M != null) {
                this.A02.setImageBitmap(A0M);
                if (z10) {
                    this.A03.post(new C1352aU(this, A0L));
                }
            } else {
                A0G(A0L, z10, adIcon);
            }
        } else {
            W6 A15 = A0L.A15();
            AdErrorType adErrorType = AdErrorType.NATIVE_AD_IS_NOT_LOADED;
            A11.A0E().A38(A0L.A0x(), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            if (A15 != null) {
                A15.ABs(C0894Jg.A00(adErrorType));
            }
            Log.e(A04(46, 17, 121), adErrorType.getDefaultErrorMessage());
            if (nativeAdBaseApi.isAdLoaded()) {
                C1314Zs adObjectContext2 = this.A07;
                adObjectContext2.A07().AA0(A04(WGL4Names.NUMBER_OF_MAC_GLYPHS, 3, 44), C8E.A0W, new C8F(A04(192, 23, 42)));
            }
        }
        A0A(this.A02, A0L);
    }

    public final boolean A0N() {
        if (this.A01 != null) {
            View view = this.A01;
            if (A0F[5].length() != 13) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[3] = "f43XNCk8";
            strArr[7] = "DdRxJSTL";
            if (view.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06097e
    public final C1314Zs A6G() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.C5Y, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void bringChildToFront(View view) {
        if (view != this.A01 && view != this.A05 && view != this.A09) {
            ImageView imageView = this.A02;
            if (A0F[5].length() != 13) {
                throw new RuntimeException();
            }
            A0F[1] = "R8dYcckG0onv7yQggjKFRkmHXZbq9UJh";
            if (view != imageView) {
                return;
            }
        }
        this.A06.bringChildToFront(view);
        if (this.A0B != null) {
            this.A06.bringChildToFront(this.A0B);
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void destroy() {
        this.A05.pause(false);
        this.A05.getMediaViewVideoRendererApi().destroy();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final View getAdContentsView() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaHeight() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageHeight();
        }
        if (this.A05.getVisibility() == 0) {
            return this.A05.getMediaViewVideoRendererApi().getVideoView().getHeight();
        }
        if (this.A03.getVisibility() == 0) {
            return this.A03.getHeight();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
        if (r3.getVisibility() == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
        return r4.A05.getMediaViewVideoRendererApi().getVideoView().getWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
        if (r3.getVisibility() == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
        if (r4.A03.getVisibility() != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
        return r4.A03.getWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
        return 0;
     */
    @Override // com.facebook.ads.internal.api.MediaViewApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int getMediaWidth() {
        /*
            r4 = this;
            com.facebook.ads.redexgen.X.O5 r0 = r4.A09
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L35
            com.facebook.ads.redexgen.X.O5 r0 = r4.A09
            int r3 = r0.getImageWidth()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1344aM.A0F
            r0 = 2
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 31
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L28
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L28:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1344aM.A0F
            java.lang.String r1 = "us0p5hBNoGIfish2"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "DFvDCw92fILzmemlu9XfPwpsPQRiq"
            r0 = 4
            r2[r0] = r1
            return r3
        L35:
            com.facebook.ads.MediaViewVideoRenderer r3 = r4.A05
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1344aM.A0F
            r0 = 1
            r1 = r1[r0]
            r0 = 7
            char r1 = r1.charAt(r0)
            r0 = 65
            if (r1 == r0) goto L66
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1344aM.A0F
            java.lang.String r1 = "7zc9sXuG"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "ncWuDUJK"
            r0 = 7
            r2[r0] = r1
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L6d
        L57:
            com.facebook.ads.MediaViewVideoRenderer r0 = r4.A05
            com.facebook.ads.internal.api.MediaViewVideoRendererApi r0 = r0.getMediaViewVideoRendererApi()
            android.view.View r0 = r0.getVideoView()
            int r0 = r0.getWidth()
            return r0
        L66:
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L6d
            goto L57
        L6d:
            com.facebook.ads.MediaView r0 = r4.A03
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L7c
            com.facebook.ads.MediaView r0 = r4.A03
            int r0 = r0.getWidth()
            return r0
        L7c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1344aM.getMediaWidth():int");
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaView mediaView) {
        Context context = adViewConstructorParams.getContext();
        if (context instanceof C1314Zs) {
            this.A07 = (C1314Zs) context;
        } else {
            this.A07 = C05605b.A03(context);
        }
        this.A07.A0N(this);
        switch (adViewConstructorParams.getInitializationType()) {
            case 0:
                A0F(this.A07, mediaView);
                break;
            case 1:
                A0E(this.A07, adViewConstructorParams.getAttributeSet(), mediaView);
                break;
            case 2:
                C1314Zs c1314Zs = this.A07;
                AttributeSet attributeSet = adViewConstructorParams.getAttributeSet();
                if (A0F[1].charAt(7) == 'A') {
                    throw new RuntimeException();
                }
                A0F[1] = "4tObUcmoIw93Quo4uXvWt9YCbUPkknut";
                A0D(c1314Zs, attributeSet, adViewConstructorParams.getDefStyleAttr(), mediaView);
                break;
            case 3:
                A0C(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), adViewConstructorParams.getDefStyleRes(), mediaView);
                break;
            default:
                throw new IllegalArgumentException(A04(ShapeTypes.FLOW_CHART_MAGNETIC_DISK, 37, 26));
        }
        A01(true);
    }

    @Override // com.facebook.ads.redexgen.X.C5Y, com.facebook.ads.internal.api.AdComponentViewApi
    public final void onAttachedToView(AdComponentView adComponentView, AdComponentViewParentApi adComponentViewParentApi) {
        super.onAttachedToView(adComponentView, adComponentViewParentApi);
        this.A06 = adComponentViewParentApi;
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th2) {
        int width = this.A03.getWidth();
        int currentHeight = this.A03.getHeight();
        if (width > 0 && currentHeight > 0) {
            this.A03.repair(th2);
            this.A03.getLayoutParams().width = width;
            this.A03.getLayoutParams().height = currentHeight;
            this.A03.setBackgroundColor(-3355444);
            return;
        }
        this.A03.repair(th2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setListener(MediaViewListener mediaViewListener) {
        this.A04 = mediaViewListener;
        if (mediaViewListener == null) {
            ((C05665h) this.A05.getMediaViewVideoRendererApi()).A07(null);
        } else {
            ((C05665h) this.A05.getMediaViewVideoRendererApi()).A07(new C1345aN(this, mediaViewListener));
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        if (!this.A0D) {
            if (this.A05 != null) {
                this.A03.removeView(this.A05);
                this.A05.getMediaViewVideoRendererApi().destroy();
            }
            ((C05665h) mediaViewVideoRenderer.getMediaViewVideoRendererApi()).A05(this.A07.A09());
            mediaViewVideoRenderer.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            ((C1344aM) this.A03.getMediaViewApi()).A09(mediaViewVideoRenderer, layoutParams);
            this.A05 = mediaViewVideoRenderer;
            this.A0C = !(this.A05 instanceof DefaultMediaViewVideoRenderer);
            mediaViewVideoRenderer.setId(M3.A00());
            return;
        }
        throw new IllegalStateException(A04(215, 43, 70));
    }
}
