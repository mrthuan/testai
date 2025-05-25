package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class WJ extends C5Y implements DefaultMediaViewVideoRendererApi {
    public static byte[] A0F;
    public static String[] A0G = {"gicLODNc4Ss02ASp0SH6jYH1jReGCf7D", "ud1g41PfTpgHVgN2zMRJY9l5AGp7t", "qgXpVhlOa1wHLevNk8n", "YvRZAMwcrsdunGxdPmTtNWzK4vSRpQc4", "eiRiwAROr6ki2Hau4nBgoUP0cJGv3yGG", "AknM7mKZVSENDtzyALrGWQlwPvra0WAt", "RqySj6gASebQYnIOdgQzgXbIWVvFlmni", "rcToBCOkHOudlFUS35924ELLk4KD1"};
    public static final String A0H;
    public MediaViewVideoRenderer A00;
    public C1314Zs A01;
    public JP A02;
    public C0720Bu A04;
    public C7V A05;
    public C7O A06;
    public AbstractC1101Rj A07;
    public C1102Rk A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC1080Qo A0C = new WP(this);
    public final AtomicBoolean A0D = new AtomicBoolean(false);
    public final AtomicBoolean A0E = new AtomicBoolean(false);
    public JZ A03 = JZ.A03;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A0F = new byte[]{11, 44, Field.AUTONUMOUT, Field.QUOTE, Field.DDEAUTO, 43, Field.ASK, 98, 48, Field.FILLIN, 44, Field.ASK, Field.FILLIN, 48, Field.FILLIN, 48, 98, 33, 42, 43, Field.DDEAUTO, Field.ASK, 98, 33, Field.DDE, 44, 36, 43, Field.PAGEREF, 108, 7, Field.GLOSSARY, Field.DDEAUTO, Field.QUOTE, 43, Field.NUMCHARS, Field.QUOTE, Field.GLOSSARY, 61, Field.NUMCHARS, Field.QUOTE, Field.DDEAUTO, Field.GLOSSARY, Field.PAGEREF, 106, Field.QUOTE, Field.SYMBOL, 106, 36, Field.BARCODE, Field.ASK, Field.ASK, 113, 106, Field.BARCODE, 36, 43, Field.DATA, Field.ASK, Field.GLOSSARY, 106, Field.USERADDRESS, Field.PAGEREF, 106, 44, Field.QUOTE, 36, Field.DDEAUTO, 106, Field.QUOTE, Field.USERADDRESS, 100, 122, Field.SECTION, 78, 77, Field.INCLUDEPICTURE, 74, 15, Field.HTMLCONTROL, 64, 15, Field.TOA, Field.FORMTEXT, Field.SECTION, Field.MERGESEQ, 15, 98, 74, Field.MERGESEQ, Field.FORMTEXT, 78, 121, Field.FORMTEXT, 74, Field.HYPERLINK, 121, Field.FORMTEXT, Field.MERGESEQ, 74, 64, 15, 76, Field.FORMCHECKBOX, Field.FORMTEXT, Field.INCLUDEPICTURE, Field.MERGESEQ, 1};
    }

    static {
        A0E();
        A0H = WJ.class.getSimpleName();
    }

    private WO A00(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new WO(this, mediaViewVideoRendererApi);
    }

    private WN A01(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new WN(this, mediaViewVideoRendererApi);
    }

    private WL A02() {
        return new WL(this);
    }

    private C1102Rk A05() {
        return new C1102Rk(this.A00, 50, true, new WeakReference(this.A07), this.A01);
    }

    private void A09() {
        if (this.A04 != null) {
            C0720Bu c0720Bu = this.A04;
            if (A0G[6].charAt(16) != 'd') {
                throw new RuntimeException();
            }
            A0G[5] = "Ntv0Vby76dSesAjQjgB6ptCIElpzOEzL";
            ((C1081Qp) c0720Bu.getVideoView()).setViewImplInflationListener(this.A0C);
        }
    }

    private void A0A() {
        if (this.A04 != null) {
            this.A04.getVideoView().setOnTouchListener(new JO(this));
        }
    }

    private void A0B() {
        if (this.A04 != null) {
            ((C1081Qp) this.A04.getVideoView()).setViewImplInflationListener(null);
        }
    }

    private void A0C() {
        if (this.A00.getVisibility() == 0 && this.A09 && this.A00.hasWindowFocus()) {
            this.A08.A0U();
            return;
        }
        if (this.A04 != null) {
            EnumC1099Rh state = this.A04.getState();
            String[] strArr = A0G;
            if (strArr[7].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0G[4] = "z79LrkWpr7afRwAllWq14kp6jWBswbkV";
            if (state == EnumC1099Rh.A05) {
                this.A0B = true;
            }
        }
        this.A08.A0V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A03 = JZ.A03;
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(W7 w7, JP jp2) {
        String str;
        this.A0A = false;
        this.A0B = false;
        this.A02 = jp2;
        A09();
        C7V c7v = this.A05;
        if (w7 != null && w7.getAdCoverImage() != null) {
            JU adCoverImage = w7.getAdCoverImage();
            String[] strArr = A0G;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                throw new RuntimeException();
            }
            A0G[5] = "TnDtOWvYiNMfLmp09Wf7ctnD5adJ0dsa";
            str = adCoverImage.getUrl();
        } else {
            str = null;
        }
        c7v.setImage(str, new WM(this));
        this.A03 = w7.A18();
        this.A06.setPlayAccessibilityLabel(w7.A1E());
        this.A06.setPauseAccessibilityLabel(w7.A1D());
        this.A08.A0U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(EnumC1084Qs enumC1084Qs) {
        if (this.A04 != null) {
            this.A04.A0b(enumC1084Qs, 24);
        } else if (!AdInternalSettings.isDebugBuild()) {
        } else {
            Log.e(A0H, A06(30, 42, 7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0K() {
        if (this.A04 == null || this.A04.getState() == EnumC1099Rh.A06) {
            return false;
        }
        return this.A03 == JZ.A05 || this.A03 == JZ.A03;
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void initialize(Context context, MediaViewVideoRenderer mediaViewVideoRenderer, MediaViewVideoRendererApi mediaViewVideoRendererApi, int i10) {
        JR A01;
        ((C5Y) mediaViewVideoRendererApi.getAdComponentViewApi()).A00(this);
        switch (i10) {
            case 0:
                A01 = A01(mediaViewVideoRendererApi);
                break;
            case 1:
                A01 = A00(mediaViewVideoRendererApi);
                break;
            default:
                throw new IllegalArgumentException(A06(0, 30, 15));
        }
        ((C05665h) mediaViewVideoRendererApi).A06(A01);
        this.A01 = C05605b.A03(context);
        this.A00 = mediaViewVideoRenderer;
        this.A05 = new C7V(this.A01);
        this.A07 = A02();
        this.A08 = A05();
        float density = LP.A02;
        int bigPadding = (int) (2.0f * density);
        int smallPadding = (int) (25.0f * density);
        this.A06 = new C7O(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        this.A06.setPadding(bigPadding, smallPadding, smallPadding, bigPadding);
        this.A06.setLayoutParams(layoutParams);
        int i11 = 0;
        while (true) {
            int i12 = this.A00.getChildCount();
            if (A0G[2].length() == 26) {
                throw new RuntimeException();
            }
            A0G[6] = "7BCad5LO6te39ERddnjUHTKJR8zzbght";
            if (i11 < i12) {
                View childAt = this.A00.getChildAt(0);
                if (childAt instanceof C0720Bu) {
                    this.A04 = (C0720Bu) childAt;
                } else {
                    i11++;
                }
            }
        }
        if (this.A04 == null) {
            if (AdInternalSettings.isDebugBuild()) {
                Log.e(A0H, A06(72, 36, 98));
            }
        } else {
            this.A04.A0c(this.A05);
            C0720Bu c0720Bu = this.A04;
            C7O c7o = this.A06;
            String[] strArr = A0G;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                c0720Bu.A0c(c7o);
            } else {
                A0G[5] = "Z21owOXIiAfqNY46KReygSjUmuqXSFx4";
                c0720Bu.A0c(c7o);
            }
        }
        this.A08.A0W(0);
        this.A08.A0X(250);
        A01.AGT();
    }

    @Override // com.facebook.ads.redexgen.X.C5Y, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09 = true;
        A0C();
    }

    @Override // com.facebook.ads.redexgen.X.C5Y, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A09 = false;
        A0C();
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void onPrepared() {
        boolean A0p = C0877Im.A0p(this.A01);
        this.A00.setOnTouchListener(new JN(this, A0p));
        if (!A0p) {
            A0A();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C5Y, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        A0C();
    }

    @Override // com.facebook.ads.redexgen.X.C5Y, com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        A0C();
    }
}
