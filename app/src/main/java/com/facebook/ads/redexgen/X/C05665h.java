package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.VideoAutoplayBehavior;
import com.facebook.ads.VideoStartReason;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.5h  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05665h implements MediaViewVideoRendererApi {
    public static byte[] A0G;
    public static String[] A0H = {"4Iqv8cTE9pbJV", "CYHnjvYzZ1Zp8VPlfffkEyqwlctrpQBL", "X8G7CA2UCcBTYjTzfkqICRpH9C9x48uG", "IuynGJFHahmt0", "YKtJTe5IUh", "gPGIa6LKGgSGxdMiTt4aCF2OLs57juUg", "T83", "DMaEshMk8cfihQw150z6d7U8VPkriS4i"};
    public static final String A0I;
    public MediaViewVideoRenderer A00;
    public VideoAutoplayBehavior A01;
    public C1314Zs A03;
    public JR A04;
    public C0720Bu A05;
    public boolean A06;
    public boolean A07;
    public NativeAd A08;
    public final R9 A0D = new FJ(this);
    public final AbstractC1105Rn A0C = new FB(this);
    public final AbstractC1121Sd A0B = new FA(this);
    public final R1 A0E = new F3(this);
    public final AbstractC1127Sj A09 = new Es(this);
    public final AbstractC1071Qf A0F = new Em(this);
    public final AbstractC1125Sh A0A = new C0785El(this);
    public C5Y A02 = new C5Y();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 3);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0G = new byte[]{31, 56, 32, Field.IMPORT, 58, Field.BARCODE, Field.GOTOBUTTON, 118, 0, Field.BARCODE, Field.MACROBUTTON, 33, 118, Field.AUTONUMLGL, Field.SYMBOL, 56, Field.PAGEREF, 34, 36, Field.QUOTE, Field.AUTONUMLGL, 34, Field.SYMBOL, 36, 118, Field.ASK, Field.IMPORT, 36, Field.IMPORT, 59, Field.PAGEREF, 118, 34, Field.GLOSSARY, Field.ASK, Field.MACROBUTTON, 120, 126, Field.NOTEREF, Field.NOTEREF, Field.FORMTEXT, Field.INCLUDETEXT, Field.INCLUDEPICTURE, 74, 13, 64, Field.HYPERLINK, Field.GREETINGLINE, Field.AUTOTEXTLIST, 13, Field.AUTOTEXT, Field.NOTEREF, 13, Field.ADDRESSBLOCK, Field.SHAPE, Field.NOTEREF, 78, Field.NOTEREF, Field.TOA, Field.NOTEREF, Field.TOA, 13, Field.AUTOTEXT, Field.ADVANCE, 13, 76, 13, 78, 76, Field.SECTION, Field.SECTION, 13, Field.AUTOTEXTLIST, Field.SECTIONPAGES, 13, Field.NOTEREF, Field.INCLUDEPICTURE, 74, 76, 74, Field.NOTEREF, 126, Field.NOTEREF, Field.NOTEREF, Field.FORMTEXT, 1, 13, 76, Field.INCLUDEPICTURE, Field.TOA, 13, Field.MERGESEQ, Field.SECTIONPAGES, Field.SECTION, Field.SECTION, Field.SECTIONPAGES, Field.LISTNUM, Field.NOTEREF, Field.TOA, 13, Field.AUTOTEXT, Field.ADVANCE, 13, 76, 13, 78, 76, Field.SECTION, Field.SECTION, 13, Field.AUTOTEXTLIST, Field.SECTIONPAGES, 13, Field.TOA, Field.INCLUDETEXT, Field.GREETINGLINE, Field.NOTEREF, Field.INCLUDEPICTURE, 74, 76, 74, Field.NOTEREF, 126, Field.NOTEREF, Field.NOTEREF, Field.FORMTEXT, 3, Field.ASK, 43, Field.EQ, Field.FILLIN, 44, Field.PAGEREF, Field.QUOTE, Field.PAGEREF, Field.FILLIN, 17, Field.FILLIN, Field.FILLIN, 41, 98, 33, Field.QUOTE, Field.DDEAUTO, Field.DDEAUTO, Field.FILLIN, Field.ASK, 98, Field.AUTONUMLGL, 43, Field.AUTONUM, 42, Field.DDE, Field.IMPORT, Field.AUTONUM, 98, Field.FILLIN, 44, Field.PAGEREF, Field.QUOTE, Field.PAGEREF, Field.FILLIN, 17, Field.FILLIN, Field.FILLIN, 41, 108, 108, 103, 110, 104, 110, 108, Field.LISTNUM, 108, 108, 98, 41, 106, 104, 101, 101, 108, 109, 41, 126, 96, 125, 97, 102, 124, 125, 41, 109, 96, 122, 108, 103, 110, 104, 110, 108, Field.LISTNUM, 108, 108, 98, Field.FILLIN};
    }

    static {
        A02();
        A0I = MediaViewVideoRenderer.class.getSimpleName();
    }

    public final void A03() {
        this.A00.pause(false);
        this.A05.setClientToken(null);
        this.A05.setVideoMPD(null);
        this.A05.setVideoURI((Uri) null);
        this.A05.setVideoCTA(null);
        this.A05.setNativeAd(null);
        this.A01 = VideoAutoplayBehavior.DEFAULT;
        if (this.A08 != null) {
            W7.A0L(this.A08.getInternalNativeAd()).A1e(false, false);
        }
        this.A08 = null;
        if (this.A04 != null) {
            JR jr = this.A04;
            if (A0H[6].length() != 3) {
                throw new RuntimeException();
            }
            A0H[6] = "qaG";
            jr.AHF();
        }
    }

    public final void A04(NativeAd nativeAd) {
        this.A08 = nativeAd;
        C1314Zs A11 = ((W7) nativeAd.getInternalNativeAd()).A11();
        C1314Zs adObjectContext = this.A03;
        adObjectContext.A0K(A11);
        C05695k c05695k = (C05695k) nativeAd.getNativeAdApi();
        this.A05.setClientToken(W7.A0L(nativeAd.getInternalNativeAd()).A1B());
        this.A05.setVideoMPD(c05695k.A01());
        this.A05.setVideoURI(c05695k.A02());
        C1473cU A0y = W7.A0L(nativeAd.getInternalNativeAd()).A0y();
        if (A0y != null) {
            this.A05.setVideoProgressReportIntervalMs(A0y.A0B());
        }
        this.A05.setVideoCTA(nativeAd.getAdCallToAction());
        this.A05.setNativeAd(nativeAd);
        this.A01 = c05695k.getVideoAutoplayBehavior();
        if (this.A04 != null) {
            this.A04.AGY(nativeAd);
        }
    }

    public final void A05(J7 j72) {
        this.A05.setAdEventManager(j72);
    }

    public final void A06(JR jr) {
        this.A04 = jr;
    }

    public final void A07(InterfaceC0966Me interfaceC0966Me) {
        this.A05.setListener(interfaceC0966Me);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void destroy() {
        this.A05.A0V();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void disengageSeek(VideoStartReason videoStartReason) {
        if (!this.A06) {
            if (AdInternalSettings.isDebugBuild()) {
                String str = A0I;
                String A01 = A01(ShapeTypes.VERTICAL_SCROLL, 40, 65);
                if (A0H[6].length() != 3) {
                    throw new RuntimeException();
                }
                String[] strArr = A0H;
                strArr[0] = "GDpgiWeynUT3r";
                strArr[4] = "Fcrjr5dO1W";
                Log.w(str, A01);
                return;
            }
            return;
        }
        this.A06 = false;
        if (this.A07) {
            this.A05.A0b(AbstractC0961Lz.A00(videoStartReason), 3);
        }
        this.A00.onSeekDisengaged();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void engageSeek() {
        if (this.A06) {
            if (AdInternalSettings.isDebugBuild()) {
                Log.w(A0I, A01(ShapeTypes.ACTION_BUTTON_END, 40, 10));
                return;
            }
            return;
        }
        this.A06 = true;
        this.A07 = EnumC1099Rh.A0A.equals(this.A05.getState());
        this.A05.A0e(false, 1);
        this.A00.onSeekEngaged();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this.A02;
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final int getCurrentTimeMs() {
        return this.A05.getCurrentPositionInMillis();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final int getDuration() {
        return this.A05.getDuration();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final View getVideoView() {
        return this.A05.getVideoView();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final float getVolume() {
        return this.A05.getVolume();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaViewVideoRenderer mediaViewVideoRenderer) {
        C1314Zs A03;
        this.A00 = mediaViewVideoRenderer;
        Context context = adViewConstructorParams.getContext();
        if (context instanceof C1314Zs) {
            A03 = (C1314Zs) context;
        } else {
            A03 = C05605b.A03(context);
        }
        this.A03 = A03;
        switch (adViewConstructorParams.getInitializationType()) {
            case 0:
                this.A05 = new C0720Bu(A03);
                break;
            case 1:
                this.A05 = new C0720Bu(A03, adViewConstructorParams.getAttributeSet());
                break;
            case 2:
                this.A05 = new C0720Bu(A03, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr());
                break;
            case 3:
                this.A05 = new C0720Bu(A03, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleRes());
                break;
            default:
                throw new IllegalArgumentException(A01(0, 37, 85));
        }
        this.A05.setEnableBackgroundVideo(mediaViewVideoRenderer.shouldAllowBackgroundPlayback());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.A05.setLayoutParams(layoutParams);
        this.A02.addView(this.A05, -1, layoutParams);
        LU.A04(this.A05, LU.A0B);
        this.A05.getEventBus().A03(this.A0D, this.A0C, this.A0B, this.A0E, this.A09, this.A0F, this.A0A);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void pause(boolean z10) {
        this.A05.A0e(z10, 2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void play(VideoStartReason videoStartReason) {
        this.A05.A0b(AbstractC0961Lz.A00(videoStartReason), 2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void seekTo(int i10) {
        if (!this.A06) {
            boolean isDebugBuild = AdInternalSettings.isDebugBuild();
            String[] strArr = A0H;
            if (strArr[0].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A0H[1] = "0wh1LQIbECU2tB2xLmMlqLa216eizCy3";
            if (isDebugBuild) {
                Log.w(A0I, A01(37, 90, 46));
                return;
            }
            return;
        }
        this.A05.A0Y(i10);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void setVolume(float f10) {
        this.A05.setVolume(f10);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final boolean shouldAutoplay() {
        if (this.A05 == null || this.A05.getState() == EnumC1099Rh.A06) {
            return false;
        }
        return this.A01 == VideoAutoplayBehavior.ON || this.A01 == VideoAutoplayBehavior.DEFAULT;
    }
}
