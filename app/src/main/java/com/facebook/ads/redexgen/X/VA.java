package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class VA extends RelativeLayout implements MS {
    public static byte[] A0b;
    public static String[] A0c = {"HOR7o31Iej4cYWuhQXExnEuENMywT0cc", "lMe4cl58LNQGNUAHyasApQ9JUE0svDiV", "D3sd2x1kxAGmbwUwbgSwAdGIbJmc5gOO", "0qcoppWNPh", "IKOWodR4Z8ze5gnDmb", "KTSiIx6w", "wnW3I4EzpNnUTo4gipPMifUFglZZiY67", "f8O"};
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final int A0h;
    public static final int A0i;
    public static final int A0j;
    public static final int A0k;
    public static final int A0l;
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final RelativeLayout.LayoutParams A0q;
    public View A00;
    public RelativeLayout A01;
    public RelativeLayout A02;
    public Toast A03;
    public C5Q A04;
    public LH A05;
    public View$OnClickListenerC1178Ui A06;
    public QV A07;
    public C1068Qc A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final AbstractC1456cD A0I;
    public final C04581b A0J;
    public final C5W A0K;
    public final C1314Zs A0L;
    public final J7 A0M;
    public final JF A0N;
    public final LH A0O;
    public final View$OnSystemUiVisibilityChangeListenerC0952Lq A0P;
    public final MR A0Q;
    public final N9 A0R;
    public final OR A0S;
    public final OS A0T;
    public final C1066Qa A0U;
    public final AtomicBoolean A0V;
    public final AtomicBoolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final MQ A0a;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 21
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public VA(C1314Zs c1314Zs, J7 j72, MR mr, AbstractC1456cD abstractC1456cD, String str, N9 n92, boolean z10) {
        super(c1314Zs);
        String A0D = A0D(0, 0, 113);
        this.A0A = A0D;
        this.A09 = A0D;
        this.A0K = new VH(this);
        this.A0W = new AtomicBoolean(false);
        this.A0V = new AtomicBoolean(false);
        this.A0F = false;
        this.A0H = true;
        this.A0C = false;
        this.A0B = false;
        this.A0Z = z10;
        this.A0L = c1314Zs;
        this.A0Q = mr;
        this.A0M = j72;
        this.A0I = abstractC1456cD;
        this.A0J = abstractC1456cD.A1P().A0E().A06();
        this.A0N = new JF(this.A0I.A1U(), this.A0M);
        this.A0R = n92;
        this.A08 = new C1068Qc(c1314Zs, this.A0R, str, this.A0Q);
        if (abstractC1456cD.A1P().A0E().A06() != null) {
            this.A0D = abstractC1456cD.A1P().A0E().A06().A0M();
            this.A0A = abstractC1456cD.A1P().A0E().A06().A0H();
            this.A09 = abstractC1456cD.A1P().A0E().A06().A0G();
        }
        this.A0E = this.A0I.A1P().A0O() && this.A0I.A1P().A0E().A02() > 0;
        this.A0Y = this.A0I.A1P().A0E().A0A();
        if (this.A0J == null) {
            this.A0Q.A4P(this.A0R.A7M());
            this.A0Q.A4P(this.A0R.A7I());
        }
        int A02 = this.A0J != null ? !this.A0J.A0O() ? (this.A0E && this.A0Y) ? this.A0I.A1P().A0E().A02() : this.A0J.A07() : this.A0J.A08() : 0;
        this.A0W.set(!this.A0J.A0L());
        this.A0O = new LH(A02, new VC(this, null));
        this.A0X = C0877Im.A0l(this.A0L);
        this.A0a = A07();
        if (this.A0J.A0O()) {
            this.A0a.A05();
        }
        this.A0U = new C1066Qa(this.A0L, this.A0M, this.A0I);
        AbstractC1015Ob.A00(c1314Zs, this, abstractC1456cD.A1P().A0E().A07());
        this.A0P = new View$OnSystemUiVisibilityChangeListenerC0952Lq(this);
        this.A0P.A05(EnumC0951Lp.A02);
        if (C0877Im.A29(this.A0L)) {
            this.A0a.setProgressSpinnerInvisible(true);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A0D(56, 9, 90), this.A0R.A83());
        this.A07 = new QV(this.A0L, this.A0I, this.A0J, this.A0M, new VB(this, null), hashMap);
        A0K();
        this.A0Q.A3q(this, new RelativeLayout.LayoutParams(-1, -1));
        A0H();
        this.A0S = new VG(this);
        this.A0T = new OS(this.A0L, this.A0a, this.A0I, (T7) null, this.A0Q, this.A0S, this.A06, this.A01, this.A07);
    }

    public static String A0D(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0b, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 107);
        }
        return new String(copyOfRange);
    }

    public static void A0N() {
        A0b = new byte[]{124, Field.DOCPROPERTY, 123, Field.FORMDROPDOWN, Field.FILESIZE, Field.INCLUDEPICTURE, Field.FORMDROPDOWN, 125, Field.EQ, Field.USERADDRESS, 59, Field.EQ, Field.SYMBOL, 13, 61, 32, 59, Field.AUTONUMLGL, 59, 60, 15, 0, 5, 15, 7, Field.MACROBUTTON, 31, 3, 25, 30, 15, 9, Field.USERADDRESS, Field.SYMBOL, Field.QUOTE, Field.GOTOBUTTON, Field.PAGEREF, 36, Field.QUOTE, Field.USERADDRESS, Field.QUOTE, Field.USERADDRESS, Field.AUTONUM, 59, Field.CONTROL, Field.HYPERLINK, 77, 80, Field.AUTOTEXT, Field.BIDIOUTLINE, 102, Field.LISTNUM, Field.DOCPROPERTY, 80, Field.LISTNUM, 82, Field.SECTION, Field.ADDRESSBLOCK, 80, 82, Field.ADVANCE, Field.BIDIOUTLINE, Field.ADVANCE, Field.SHAPE, Field.FILESIZE, 104, Byte.MAX_VALUE, 109, 123, 104, 126, Byte.MAX_VALUE, 126, Field.FILESIZE, 108, 115, 126, Byte.MAX_VALUE, 117, 30, 12, 11, 31, 0, 12, 30, Field.AUTONUM, 10, 5, 0, 10, 2};
    }

    static {
        A0N();
        A0o = (int) (LP.A02 * 64.0f);
        A0g = (int) (LP.A02 * 16.0f);
        A0p = (int) (LP.A02 * 12.0f);
        A0e = (int) (LP.A02 * 10.0f);
        A0q = new RelativeLayout.LayoutParams(-1, -1);
        A0h = (int) (LP.A02 * 48.0f);
        A0i = (int) (LP.A02 * 16.0f);
        A0n = (int) (LP.A02 * 14.0f);
        A0l = (int) (LP.A02 * 12.0f);
        A0m = AbstractC04982p.A01(-1, 77);
        A0d = (int) (LP.A02 * 8.0f);
        A0j = (int) (LP.A02 * 20.0f);
        A0k = (int) (LP.A02 * 13.0f);
        A0f = (int) (LP.A02 * 8.0f);
    }

    public VA(C1314Zs c1314Zs, J7 j72, MR mr, AbstractC1456cD abstractC1456cD, String str, N9 n92) {
        this(c1314Zs, j72, mr, abstractC1456cD, str, n92, false);
    }

    private FullScreenAdToolbar A07() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0L, this.A0Q, this.A0N, 0, this.A0I.A1J(), this.A0D);
        fullScreenAdToolbar.setFullscreen(true);
        fullScreenAdToolbar.A09(this.A0I.A1O().A01(), View$OnClickListenerC1178Ui.A08(this.A0I));
        fullScreenAdToolbar.setPageDetailsVisible(false);
        fullScreenAdToolbar.setPageDetails(this.A0I.A1S(), this.A0I.A1U(), this.A0J.A07(), this.A0I.A1T());
        fullScreenAdToolbar.setToolbarListener(new VD(this));
        return fullScreenAdToolbar;
    }

    private View$OnClickListenerC1178Ui A09() {
        if (this.A07 == null || this.A07.getViewabilityChecker() == null || this.A07.getTouchDataRecorder() == null) {
            return null;
        }
        View$OnClickListenerC1178Ui view$OnClickListenerC1178Ui = new View$OnClickListenerC1178Ui(this.A0L, this.A0R.A6p(), this.A0I.A1O().A01(), this.A0M, this.A0Q, this.A07.getViewabilityChecker(), this.A07.getTouchDataRecorder(), this.A0I.A1Q());
        M3.A0K(view$OnClickListenerC1178Ui);
        view$OnClickListenerC1178Ui.setText(this.A0I.A1P().A0G().A04());
        view$OnClickListenerC1178Ui.setTextSize(14.0f);
        view$OnClickListenerC1178Ui.setPadding(A0e, A0e, A0e, A0e);
        view$OnClickListenerC1178Ui.setOnClickListener(new View$OnClickListenerC0978Mq(this));
        return view$OnClickListenerC1178Ui;
    }

    private C1014Oa A0B() {
        C1314Zs c1314Zs = this.A0L;
        C1O A01 = this.A0I.A1O().A01();
        int i10 = !this.A0E ? 16 : 17;
        boolean z10 = this.A0E;
        String[] strArr = A0c;
        if (strArr[6].charAt(22) != strArr[1].charAt(22)) {
            String[] strArr2 = A0c;
            strArr2[7] = "YLS";
            strArr2[4] = "sNsC3VBoYaF6TxGjee";
            C1014Oa c1014Oa = new C1014Oa(c1314Zs, A01, true, i10, !z10 ? 14 : 13, 0);
            c1014Oa.A03(this.A0I.A1P().A0F().A08(), this.A0I.A1P().A0F().A07(), null, false, true);
            TextView descriptionTv = c1014Oa.getDescriptionTextView();
            descriptionTv.setAlpha(0.8f);
            descriptionTv.setMaxLines(1);
            descriptionTv.setEllipsize(TextUtils.TruncateAt.END);
            TextView descriptionTv2 = c1014Oa.getTitleTextView();
            descriptionTv2.setMaxLines(1);
            descriptionTv2.setEllipsize(TextUtils.TruncateAt.END);
            return c1014Oa;
        }
        throw new RuntimeException();
    }

    private void A0G() {
        String A01;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0h, A0h);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        OU ou = new OU(this.A0L);
        M3.A0M(ou, 0);
        M3.A0K(ou);
        new AsyncTaskC1183Un(ou, this.A0L).A05(A0h, A0h).A07(this.A0I.A1S().A01());
        TextView textView = new TextView(this.A0L);
        M3.A0K(textView);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(this.A0I.A1O().A01().A06(true));
        textView.setText(this.A0I.A1P().A0F().A08());
        textView.setTextSize(!this.A0D ? 16.0f : 17.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        OW ow = new OW(this.A0L, !this.A0D ? A0n : A0l, 5, A0m, -1);
        ow.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        TextView textView2 = new TextView(this.A0L);
        textView2.setTextColor(this.A0I.A1O().A01().A06(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        if (!this.A0D) {
            textView2.setTextSize(13.0f);
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams3.leftMargin = A0f;
        LinearLayout linearLayout = new LinearLayout(this.A0L);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, A0i);
        layoutParams4.topMargin = A0f / 2;
        layoutParams4.addRule(3, textView.getId());
        linearLayout.addView(ow, layoutParams2);
        linearLayout.addView(textView2, layoutParams3);
        RelativeLayout.LayoutParams ratingInfoContainerParams = new RelativeLayout.LayoutParams(-2, -2);
        ratingInfoContainerParams.leftMargin = A0f;
        ratingInfoContainerParams.addRule(1, ou.getId());
        ratingInfoContainerParams.addRule(15);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.addView(linearLayout, layoutParams4);
        relativeLayout.addView(textView);
        if (this.A02 != null) {
            this.A02.removeAllViews();
            this.A02.addView(relativeLayout, ratingInfoContainerParams);
            this.A02.addView(ou, layoutParams);
        }
        if (TextUtils.isEmpty(this.A0I.A1P().A0F().A05())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        ow.setRating(Float.parseFloat(this.A0I.A1P().A0F().A05()));
        if (this.A0I.A1P().A0F().A04() == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A0D(0, 1, 63));
        if (!this.A0D) {
            A01 = NumberFormat.getNumberInstance().format(Integer.parseInt(this.A0I.A1P().A0F().A04()));
        } else {
            A01 = LY.A01(Integer.parseInt(this.A0I.A1P().A0F().A04()));
        }
        sb2.append(A01);
        sb2.append(A0D(1, 1, 23));
        textView2.setText(sb2.toString());
    }

    private void A0H() {
        if (this.A0J.A0L()) {
            A0J();
        } else {
            A0M();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.A0P.A05(EnumC0951Lp.A03);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I() {
        this.A0G = true;
        if (this.A0I.A1P().A0O()) {
            this.A08.A05();
            this.A0Q.A4Q(this.A0R.A6F(), new C9R(0, 0));
        }
    }

    private void A0J() {
        Q7 A0F = new Q5(this.A0L, this.A0I.A1P().A0F(), this.A0I.A1S()).A0A(this.A0I.A1O().A01()).A0D(this.A0J.A0J()).A0C(this.A0J.A0E()).A09(AdError.SERVER_ERROR_CODE).A0E(this.A0D).A0B(this.A0A).A0F();
        JH.A04(A0F, this.A0N, JE.A0U);
        addView(A0F, A0q);
        A0F.A04(new VF(this));
    }

    private void A0K() {
        RelativeLayout.LayoutParams layoutParams;
        this.A06 = A09();
        this.A01 = new RelativeLayout(getContext());
        M3.A0K(this.A01);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(A0g, A0p, A0g, A0p);
        layoutParams2.addRule(12);
        this.A02 = new RelativeLayout(getContext());
        M3.A0K(this.A02);
        if (this.A0X) {
            A0G();
        } else {
            RelativeLayout relativeLayout = this.A02;
            C1014Oa A0B = A0B();
            RelativeLayout.LayoutParams appMetadataLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout.addView(A0B, appMetadataLayoutParams);
        }
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, 0, A0g, 0);
        this.A01.addView(this.A02, layoutParams3);
        if (this.A06 != null) {
            View$OnClickListenerC1178Ui view$OnClickListenerC1178Ui = this.A06;
            String[] strArr = A0c;
            if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
                throw new RuntimeException();
            }
            A0c[3] = "f";
            layoutParams3.addRule(0, view$OnClickListenerC1178Ui.getId());
            if (!this.A0D) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(6, this.A02.getId());
                layoutParams.addRule(8, this.A02.getId());
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                M3.A0S(this.A06, M3.A06(-16738826, A0d));
                if (Build.VERSION.SDK_INT >= 21) {
                    this.A06.setStateListAnimator(null);
                }
                this.A06.setPadding(A0j, A0k, A0j, A0k);
                M3.A0X(this.A06);
            }
            layoutParams.addRule(11);
            this.A01.addView(this.A06, layoutParams);
        }
        M3.A0K(this.A0a);
        RelativeLayout.LayoutParams adWebViewParams = new RelativeLayout.LayoutParams(-1, -2);
        adWebViewParams.addRule(10);
        RelativeLayout.LayoutParams iconAndMetaDataContainerParams = new RelativeLayout.LayoutParams(-1, -1);
        iconAndMetaDataContainerParams.setMargins(A0g, 0, A0g, 0);
        iconAndMetaDataContainerParams.addRule(3, this.A0a.getId());
        iconAndMetaDataContainerParams.addRule(2, this.A01.getId());
        this.A0a.setVisibility(4);
        this.A07.setVisibility(4);
        this.A01.setVisibility(4);
        addView(this.A0a, adWebViewParams);
        addView(this.A07, iconAndMetaDataContainerParams);
        addView(this.A01, layoutParams2);
        if (this.A0J.A0N()) {
            this.A07.A0B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L() {
        new JF(this.A0I.A1U(), this.A0M).A04(JE.A0x, null);
        this.A0V.set(true);
        M3.A0T(this);
        M3.A0H(this.A07);
        M3.A0b(this.A0T, this.A00, this.A07);
        if (this.A0D) {
            if (this.A0X) {
                M3.A0H(this.A0a);
            }
        } else {
            M3.A0L(this.A0a);
        }
        M3.A0L(this.A06);
        Pair<QZ, View> A03 = this.A0U.A03(this.A06);
        this.A00 = (View) A03.second;
        switch (C0979Mr.A00[((QZ) A03.first).ordinal()]) {
            case 1:
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, this.A0a.getToolbarHeight(), 0, 0);
                if (!this.A0D) {
                    M3.A0L(this.A01);
                    RelativeLayout relativeLayout = this.A01;
                    String[] strArr = A0c;
                    if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0c;
                    strArr2[0] = "NCG6dD1sAPFbWTySRxInyY8ppXyMF33j";
                    strArr2[2] = "WdNFAV1bp8QAHjjZXwWCxzFqJ2u0nxRS";
                    if (relativeLayout != null) {
                        layoutParams.addRule(2, this.A01.getId());
                    }
                    addView(this.A00, layoutParams);
                    return;
                }
                addView(new Q2(this.A0L, this.A0I.A1S(), this.A0I.A1P().A0F(), A09(), this.A09, new View$OnClickListenerC0977Mp(this)), new RelativeLayout.LayoutParams(-1, -1));
                removeView(this.A0a);
                return;
            case 2:
                if (this.A01 != null) {
                    M3.A0b(this.A01);
                }
                RelativeLayout.LayoutParams infoParams = new RelativeLayout.LayoutParams(-1, -1);
                addView(this.A00, infoParams);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M() {
        M3.A0T(this);
        if (!this.A0J.A0N()) {
            this.A07.A0B();
        }
        this.A0a.setVisibility(0);
        this.A07.setVisibility(0);
        if (this.A01 != null) {
            RelativeLayout relativeLayout = this.A01;
            String[] strArr = A0c;
            if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
                throw new RuntimeException();
            }
            A0c[3] = "XO2ZpTY6Mgvz2u";
            relativeLayout.setVisibility(0);
        }
        if (this.A06 != null && this.A0I.A1M() > 0 && this.A05 == null) {
            this.A05 = new LH(this.A0I.A1M(), new VE(this));
            this.A05.A07();
        }
        this.A0O.A07();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(int i10) {
        String valueOf = String.valueOf(i10);
        Toast toast = this.A03;
        String A0D = this.A0J.A0D();
        String progress = A0D(2, 6, 75);
        M3.A0Z(toast, A0D.replace(progress, valueOf), 49, 0, A0o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0U(boolean z10, String str) {
        this.A0C = true;
        HashMap hashMap = new HashMap();
        hashMap.put(A0D(8, 12, 57), z10 ? A0D(79, 13, 2) : A0D(44, 12, 82));
        hashMap.put(A0D(20, 12, 7), str);
        new OH(this.A0L, this.A0R.A6p(), this.A07.getViewabilityChecker(), this.A07.getTouchDataRecorder(), this.A0M, this.A0I.A1Q(), this.A0Q).A08(this.A0I.A1U(), this.A0I.A1P().A0G().A05(), hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0V() {
        return this.A0I.A0c().equals(A0D(65, 14, 113)) || (this.A0I.A0c().equals(A0D(32, 12, 60)) && this.A0I.A1P().A0Q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0W() {
        return this.A0Y && !this.A0F && !this.A0H && this.A0J.A07() < this.A0I.A1P().A0E().A02();
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void A9q(Intent intent, Bundle bundle, C5Q c5q) {
        this.A04 = c5q;
        this.A04.A0A(this.A0K);
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void ACz(boolean z10) {
        this.A0O.A06();
        this.A0B = true;
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void ADN(boolean z10) {
        if ((!this.A0Y || !this.A0H) && !this.A0F) {
            boolean z11 = this.A0W.get();
            String[] strArr = A0c;
            if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0c;
            strArr2[0] = "5YF9hd1VnayjDYXn8X9NIXHiJcVpNWhU";
            strArr2[2] = "6mHNY01g6eF3bUPoEn1oonlPgYyDS663";
            if (z11) {
                LH lh2 = this.A0O;
                String[] strArr3 = A0c;
                if (strArr3[6].charAt(22) != strArr3[1].charAt(22)) {
                    String[] strArr4 = A0c;
                    strArr4[7] = "SY9";
                    strArr4[4] = "T1jNCZgiG5fRSAcWDF";
                    if (lh2.A05()) {
                        return;
                    }
                } else {
                    String[] strArr5 = A0c;
                    strArr5[7] = "0UX";
                    strArr5[4] = "cSjXeSxWsZqlnq3791";
                    if (lh2.A05()) {
                        return;
                    }
                }
                this.A0O.A07();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void AFx(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public String getCurrentClientToken() {
        return this.A0I.A1U();
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void onDestroy() {
        this.A0P.A03();
        if (this.A04 != null) {
            this.A04.A0B(this.A0K);
        }
        if (this.A07 != null) {
            if (!TextUtils.isEmpty(this.A0I.A1U())) {
                this.A0M.A9x(this.A0I.A1U(), new O8().A03(this.A07.getViewabilityChecker()).A02(this.A07.getTouchDataRecorder()).A05());
            }
            this.A07.A0C();
        }
        this.A0O.A06();
        this.A0a.setToolbarListener(null);
        this.A03 = null;
        this.A04 = null;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            ADN(false);
        } else {
            ACz(false);
        }
    }

    public void setListener(MR mr) {
    }

    public void setServerSideRewardHandler(C1068Qc c1068Qc) {
        this.A08 = c1068Qc;
    }
}
