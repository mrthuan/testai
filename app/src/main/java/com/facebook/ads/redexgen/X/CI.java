package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public final class CI extends VY implements View.OnClickListener, View.OnTouchListener {
    public static int A09;
    public static int A0A;
    public static int A0B;
    public static int A0C;
    public static int A0D;
    public static byte[] A0E;
    public static String[] A0F = {"KCgVVt0Ap7UjFwdZVPwtujaSBd4wOGh", "pwlBzpehZvT0dx09nfsqJf3x9Ohs0th5", "vfZ4vr2K2y2ARDvqPAWs6IAB7KSzcYkK", "bFCbuQIkoS9nYpv83ewRiG67IWanvmGf", "GLbAB0S4L", "VAKU94yPMVJGstkAs9GlkzAfXtUrDcQU", "ELeO8zIeBErz", "BBoYkiBeDILGrcaYIrD29JxsdoJmJVn4"};
    public int A00;
    public int A01;
    public JF A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;
    public final InputMethodManager A06;
    public final Runnable A07;
    public final String A08;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0F[6].length() != 12) {
                throw new RuntimeException();
            }
            A0F[6] = "rGUQ6sPwqM0P";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 26);
            i13++;
        }
    }

    public static void A09() {
        A0E = new byte[]{Field.GREETINGLINE, Field.ADDIN, Field.ADVANCE, Field.GREETINGLINE, 86, 98, 78, 82, Field.NOTEREF, Field.AUTOTEXT, Field.GREETINGLINE, Field.HYPERLINK, 36, Field.DATA, 42, 105, 33, Field.ASK, 36, 34, Field.PAGEREF, Field.DATA, Field.DATA, 44, 105, Field.ASK, Field.QUOTE, Field.AUTONUMOUT, 105, Field.PAGEREF, Field.ASK, 41, 41, 34, Field.AUTONUMLGL, 105, 36, 43, Field.DDEAUTO, 36, 44, 34, Field.QUOTE, 118, 122, 120, 59, 115, 116, 118, 112, 119, 122, 122, 126, 59, 116, 113, 102, 59, 124, 123, 97, 112, 103, 102, 97, 124, 97, 124, 116, 121, 59, 118, 121, 124, 118, 126, 112, 113, 2, 14, 12, Field.AUTOTEXT, 7, 0, 2, 4, 3, 14, 14, 10, Field.AUTOTEXT, 0, 5, 18, Field.AUTOTEXT, 15, 0, 21, 8, 23, 4, Field.AUTOTEXT, 0, 5, Field.USERADDRESS, 2, 13, 8, 2, 10, Field.AUTONUMLGL, Field.GOTOBUTTON, 44, 41, Field.DATA, 3, Field.EQ, Field.SYMBOL, Field.DATA, Field.AUTONUMOUT, Field.MACROBUTTON, 56, 30, 24, 14, 25, Field.AUTONUMOUT, 9, 30, 13, 13, 14, 25, 14, 15, Field.AUTONUMOUT, 8, 7, 2, 8, 0, Field.AUTONUMOUT, 2, 10, 9, Field.AUTONUMOUT, 8, 7, 2, 8, 0, 24, Field.ADDIN, Field.CONTROL, Field.SECTION, 86, 123, Field.FORMTEXT, Field.ADDIN, Field.SECTIONPAGES, Field.SECTIONPAGES, Field.SECTION, 86, Field.SECTION, 64, 123, Field.FORMCHECKBOX, Field.NOTEREF, 77, Field.FORMCHECKBOX, Field.AUTOTEXT, 123, 77, Field.FILESIZE, Field.FORMTEXT, 123, 80, Field.ADDRESSBLOCK, Field.ADVANCE, 77, 74, Field.INCLUDEPICTURE};
    }

    static {
        A09();
        A0B = 450;
        A09 = OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM;
        A0A = 50;
        A0D = 450;
        A0C = ShapeTypes.FLOW_CHART_EXTRACT;
    }

    public CI(C5Q c5q, C1314Zs c1314Zs, J7 j72, MR mr, String str, int i10) {
        super(c5q, c1314Zs, j72, mr);
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = false;
        this.A07 = new MU(this);
        this.A08 = str;
        this.A05 = new Handler(Looper.getMainLooper());
        this.A06 = (InputMethodManager) c1314Zs.getSystemService(A05(112, 12, 70));
        this.A04 = i10;
    }

    public static /* synthetic */ int A02(CI ci2) {
        int i10 = ci2.A00;
        ci2.A00 = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        M3.A0M(this, 1610612736);
    }

    private void A07() {
        if (this.A08 == null) {
            return;
        }
        if (AdPlacementType.BANNER.name().equals(this.A08)) {
            super.A07.A0E(A05(12, 31, 93), null);
        } else if (AdPlacementType.NATIVE.name().equals(this.A08)) {
            super.A07.A0E(A05(80, 32, 123), null);
        } else if (AdPlacementType.INTERSTITIAL.name().equals(this.A08)) {
            super.A07.A0E(A05(43, 37, 15), null);
        } else if (!AdPlacementType.REWARDED_VIDEO.name().equals(this.A08)) {
        } else {
            super.A07.A0E(EnumC1087Qv.A04.A03(), null);
        }
    }

    private void A08() {
        M3.A0M(this, 0);
    }

    public static /* synthetic */ boolean A0B(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.VY
    public final InterfaceC1006Ns A0E() {
        return new C1198Vc(this);
    }

    @Override // com.facebook.ads.redexgen.X.VY
    public final void A0F() {
        M3.A0M(this, 1610612736);
        setPadding(getResources().getConfiguration().orientation);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(new float[]{A0A, A0A, A0A, A0A, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(-1);
        this.A0B.setBackground(gradientDrawable);
        this.A0B.setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.ads.redexgen.X.MT
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return CI.A0B(view, motionEvent);
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        addView(this.A0B, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, this.A0B.getId());
        layoutParams2.addRule(12);
        this.A0E.setBackgroundColor(-1);
        addView(this.A0E, layoutParams2);
        this.A0E.setOnTouchListener(this);
        setOnClickListener(this);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, (int) (LP.A02 * 2.0f));
        layoutParams3.addRule(3, this.A0B.getId());
        this.A0C.setProgress(0);
        addView(this.A0C, layoutParams3);
        A06();
        this.A0A.A3q(this, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.VY
    public final void A0G() {
        A08();
        super.A07.A05().overridePendingTransition(0, 0);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, Resources.getSystem().getDisplayMetrics().heightPixels);
        translateAnimation.setDuration(A09);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new MW(this));
        startAnimation(translateAnimation);
    }

    @Override // com.facebook.ads.redexgen.X.VY
    public final void A0H(String str) {
        if (this.A04 > 0 && !this.A03) {
            this.A03 = true;
            this.A05.removeCallbacksAndMessages(null);
            Map<String, String> A05 = new O8().A03(null).A02(null).A05();
            A05.put(A05(0, 12, 39), str);
            if (this.A02 != null) {
                this.A02.A04(JE.A0J, A05);
            }
            A07();
            this.A09.AA9(super.A04, A05);
            if (C0877Im.A2J(super.A08)) {
                HashMap hashMap = new HashMap();
                hashMap.put(AbstractC1491cm.A03, Boolean.TRUE.toString());
                hashMap.put(AbstractC1491cm.A04, Boolean.TRUE.toString());
                hashMap.put(AbstractC1491cm.A05, Boolean.TRUE.toString());
                this.A09.AAI(super.A04, hashMap);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.VY, com.facebook.ads.redexgen.X.MS
    public final void A9q(Intent intent, Bundle bundle, C5Q c5q) {
        super.A9q(intent, bundle, c5q);
        this.A02 = new JF(super.A04, this.A09);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A08();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, Resources.getSystem().getDisplayMetrics().heightPixels, 0.0f);
        translateAnimation.setDuration(A0B);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new MV(this));
        startAnimation(translateAnimation);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            A0G();
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setPadding(configuration.orientation);
    }

    @Override // com.facebook.ads.redexgen.X.VY, com.facebook.ads.redexgen.X.MS
    public final void onDestroy() {
        super.onDestroy();
        this.A05.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
                if (this.A06 != null) {
                    InputMethodManager inputMethodManager = this.A06;
                    if (A0F[1].charAt(4) != 'z') {
                        throw new RuntimeException();
                    }
                    A0F[6] = "wSSlTu5XSXtb";
                    if (!inputMethodManager.isAcceptingText()) {
                        return false;
                    }
                    A0H(A05(ShapeTypes.FLOW_CHART_MAGNETIC_TAPE, 30, 62));
                    return false;
                }
                return false;
            case 1:
                this.A01++;
                if (this.A01 < 5) {
                    return false;
                }
                A0H(A05(124, 30, 113));
                return false;
            default:
                return false;
        }
    }

    private void setPadding(int i10) {
        if (i10 == 2) {
            setPadding(0, A0C, 0, 0);
        } else {
            setPadding(0, A0D, 0, 0);
        }
    }
}
