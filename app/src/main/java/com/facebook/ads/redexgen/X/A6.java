package com.facebook.ads.redexgen.X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public final class A6 extends U6 {
    public static byte[] A0k;
    public static String[] A0l = {"uilIZmuHzpP0N9Y8quer6Kb2u", "9UUD4l8CpJqeXgkdEQyriIYmJbPiqOP7", "EZE4mnuFogdbCIqsVVCLHtYnmK0aZj", "syebs7ncPc1rj4O1rMWtVdBIydy8e5", "8mpGklwdfsm8yo", "l0wQPHeYLTHnG4", "V5rJxyMt8frjvUGIYtzHbFROecFIJypl", "I99F1f62ejGluaFUQtWt4OKUQ"};
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final int A0q;
    public static final int A0r;
    public static final int A0s;
    public static final int A0t;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Handler A08;
    public InputMethodManager A09;
    public LinearLayout A0A;
    public LinearLayout A0B;
    public TextView A0C;
    public C1O A0D;
    public C0997Nj A0E;
    public C0998Nk A0F;
    public C1194Uy A0G;
    public PD A0H;
    public EnumC1084Qs A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final AbstractC04390h A0T;
    public final C1314Zs A0U;
    public final JF A0V;
    public final FullScreenAdToolbar A0W;
    public final Q4 A0X;
    public final TC A0Y;
    public final T7 A0Z;
    public final C9S A0a;
    public final AbstractC1127Sj A0b;
    public final AbstractC1125Sh A0c;
    public final AbstractC1121Sd A0d;
    public final AbstractC1105Rn A0e;
    public final R9 A0f;
    public final R8 A0g;
    public final C1011Nx A0h;
    public final N5 A0i;
    public final Runnable A0j;

    public static String A0J(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0k, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 55);
        }
        return new String(copyOfRange);
    }

    public static void A0V() {
        byte[] bArr = {-15, -6, -9, -15, -7, -19, 1, -3, 3, 0, -15, -13, -70, -72, -57, -91, -76, -54, -101, -72, -68, -70, -69, -57, -38, -33, -31, -26, -27, -48, -34, -42, -27, -39, -32, -43, -42, -44, -58, -45, -60, -51, -54, -60, -52, -64, -57, -54, -51, -43, -58, -45, -58, -59, Field.DDE, 31, 36, 26, Field.PAGEREF, Field.DDE, -63};
        String[] strArr = A0l;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0l;
        strArr2[4] = "nVqp18ph7ekHb6";
        strArr2[5] = "wg1nH4uIQgdKmM";
        A0k = bArr;
    }

    static {
        A0V();
        A0m = (int) (LP.A02 * 4.0f);
        A0n = (int) (LP.A02 * 8.0f);
        A0o = AbstractC04982p.A01(-1, 77);
        A0s = (int) (LP.A02 * 26.0f);
        A0t = (int) (LP.A02 * 12.0f);
        A0q = (int) (LP.A02 * 12.0f);
        A0r = (int) (LP.A02 * 44.0f);
        A0p = (int) (LP.A02 * 8.0f);
    }

    public A6(C1314Zs c1314Zs, J7 j72, FullScreenAdToolbar fullScreenAdToolbar, AbstractC1456cD abstractC1456cD, C05906f c05906f, N9 n92, int i10, MR mr, JF jf2, int i11, boolean z10, boolean z11, Q4 q42) {
        super(c1314Zs, n92, j72, abstractC1456cD, i10, z10, z11, mr);
        C1O A00;
        this.A03 = 0;
        this.A0J = false;
        this.A0Q = false;
        this.A0N = false;
        this.A0P = false;
        this.A0O = false;
        this.A0M = false;
        this.A07 = 0;
        this.A02 = 0;
        this.A0j = new RunnableC1065Pz(this);
        this.A0L = false;
        this.A0S = false;
        this.A01 = 0.0f;
        this.A0f = new C0676Aa(this);
        this.A0e = new AT(this);
        this.A0d = new AE(this);
        this.A0g = new A9(this);
        this.A0b = new A8(this);
        this.A0c = new A7(this);
        this.A0W = fullScreenAdToolbar;
        this.A08 = new Handler(Looper.getMainLooper());
        this.A09 = (InputMethodManager) c1314Zs.getSystemService(A0J(24, 12, 58));
        this.A0T = C04400i.A01(c1314Zs, j72, abstractC1456cD.A1U(), L5.A00(abstractC1456cD.A1P().A0G().A05()), new HashMap(), false, true, abstractC1456cD.A1Q());
        this.A0U = c1314Zs;
        this.A0V = jf2;
        this.A0h = new C1011Nx(this.A0U, this.A0V);
        this.A0i = new N5(this.A0U);
        this.A0X = q42;
        if (i11 == 1) {
            A00 = super.A05.A1O().A01();
        } else {
            A00 = super.A05.A1O().A00();
        }
        this.A0D = A00;
        this.A0Z = new T7(this.A0U);
        this.A0Z.getEventBus().A03(this.A0f, this.A0e, this.A0d, this.A0g, this.A0b, this.A0c);
        this.A0a = new C9S(c1314Zs, j72, this.A0Z, abstractC1456cD.A1U());
        A0S();
        this.A0Z.setVideoURI(c05906f.A0S(super.A05.A1P().A0E().A08()));
        A0P();
        A0M();
        A0L();
        AbstractC1015Ob.A00(this.A0U, this, abstractC1456cD.A1P().A0E().A07());
        setupLayoutConfiguration(false);
        A0R();
        A0Q();
        postDelayed(new C1165Tv(this), 1000L);
        if (C0877Im.A1p(this.A0U)) {
            this.A0U.A0A().AHO(this.A0Z, super.A05.A1U(), true);
        }
        if (C0877Im.A1q(this.A0U)) {
            this.A0Y = new TC(this.A0U, j72, this.A0Z, super.A05.A1U(), this.A0a, null);
        } else {
            this.A0Y = null;
        }
        A0W(abstractC1456cD.A1P());
    }

    public static /* synthetic */ float A03(A6 a62, float f10) {
        float f11 = a62.A01 + f10;
        a62.A01 = f11;
        return f11;
    }

    public static /* synthetic */ int A05(A6 a62) {
        int i10 = a62.A02;
        a62.A02 = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int A07(A6 a62) {
        int i10 = a62.A07;
        a62.A07 = i10 + 1;
        return i10;
    }

    private void A0K() {
        M3.A0J(this.A0B);
        this.A0B = new LinearLayout(this.A0U);
        M3.A0R(this.A0B, this.A0U);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0J ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(12);
        this.A0B.setLayoutParams(layoutParams);
        addView(this.A0B, 2);
    }

    private void A0L() {
        this.A0i.A06(-1, A0o);
        this.A0i.setPadding(A0t, A0t, A0t, A0t);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0s);
        layoutParams.addRule(12);
        addView(this.A0i, layoutParams);
    }

    private void A0M() {
        this.A0h.setPadding(A0q, A0q, A0q, A0q);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0r, A0r);
        layoutParams.setMargins(0, MQ.A00, A0p, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0Z, videoViewParams);
        addView(this.A0h, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        if (super.A05.A17() && this.A0L) {
            this.A0L = false;
            A0f(A0J(36, 18, 42));
        }
    }

    private void A0O() {
        if (super.A05.A17() && this.A0L) {
            this.A0L = false;
            Map<String, String> A05 = new O8().A03(null).A02(null).A05();
            A05.put(A0J(0, 12, 87), A0J(36, 18, 42));
            super.A07.A9w(super.A05.A1U(), A05);
        }
    }

    private void A0P() {
        postDelayed(new C1167Tx(this), C0877Im.A0N(this.A0U));
    }

    private void A0Q() {
        M3.A0J(this.A0A);
        this.A0A = new LinearLayout(this.A0U);
        this.A0A.setOrientation(1);
        M3.A0K(this.A0A);
        A0T();
        this.A0A.setBackgroundColor(-1);
        addView(this.A0A);
    }

    private void A0R() {
        View view = this.A0Z;
        if (super.A05.A17()) {
            view.setOnClickListener(new Q1(this));
        }
        M3.A0J(view);
        M3.A0K(view);
        RelativeLayout.LayoutParams mediaLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
        mediaLayoutParams.addRule(15);
        addView(view, 1, mediaLayoutParams);
        this.A0C = new TextView(this.A0U);
        View mMediaView = this.A0C;
        M3.A0K(mMediaView);
        this.A0C.setGravity(17);
        this.A0C.setTextColor(getColors().A05(true));
        this.A0C.setEllipsize(TextUtils.TruncateAt.END);
        this.A0C.setMaxLines(2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(A0n, A0n / 2, A0n, A0s);
        View mMediaView2 = this.A0C;
        addView(mMediaView2, layoutParams);
        View mMediaView3 = this.A0C;
        M3.A0K(mMediaView3);
        this.A0H = new PD(this.A0U, super.A05, super.A07, super.A0A, super.A0C, super.A09, getColors(), new U0(this));
        View mMediaView4 = this.A0H;
        M3.A0G(1001, mMediaView4);
        View mMediaView5 = this.A0H;
        addView(mMediaView5);
        A0U();
        A0K();
        if (C0877Im.A12(this.A0U)) {
            this.A0B.setOnClickListener(new View$OnClickListenerC1059Pt(this));
            View mMediaView6 = this.A0W;
            if (mMediaView6 != null) {
                this.A0W.setCTAClickListener(new View$OnClickListenerC1060Pu(this));
            }
        }
    }

    private void A0S() {
        this.A0Z.A0c(this.A0i);
        this.A0Z.A0c(this.A0h);
        if (!TextUtils.isEmpty(super.A05.A1P().A0E().A07())) {
            C7V c7v = new C7V(this.A0U);
            this.A0Z.A0c(c7v);
            c7v.setImage(super.A05.A1P().A0E().A07());
        }
        this.A0Z.A0c(new C7L(this.A0U));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0T() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A05);
        if (this.A0K) {
            layoutParams.setMargins(0, this.A05 / 5, 0, 0);
            layoutParams.addRule(12);
            this.A0A.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A05 + 1, 0, 0);
        }
        LinearLayout linearLayout = this.A0A;
        String[] strArr = A0l;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A0l[1] = "4k5LHuHIhnjzZvLx7p7MkTP5YYpiYy7M";
        linearLayout.setTranslationY(0.0f);
        this.A0A.setLayoutParams(layoutParams);
    }

    private void A0U() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.A0J ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A0C.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0H.setLayoutParams(layoutParams);
    }

    private void A0W(C1F c1f) {
        double A00 = AbstractC1019Of.A00(c1f);
        String A07 = c1f.A0F().A07();
        if (A07 == null || A07.trim().length() == 0) {
            M3.A0N(this.A0B, 8);
            if (C0877Im.A12(this.A0U)) {
                this.A0B.setClickable(false);
            }
        } else {
            this.A0C.setText(A07);
            if (C0877Im.A12(this.A0U)) {
                this.A0B.setClickable(true);
            }
        }
        if (A00 > 0.0d) {
            this.A03 = (int) (this.A06 / A00);
        }
        this.A03 = this.A0J ? this.A04 : this.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0d(C9O c9o) {
        if (this.A0Z.getState() == EnumC1099Rh.A02 && C0877Im.A1U(this.A0U)) {
            postDelayed(new C1166Tw(this, c9o), TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0e(String str) {
        C1194Uy c1194Uy;
        M3.A0J(this.A0G);
        C1169Tz c1169Tz = new C1169Tz(this);
        if (this.A0U.A0D() == null) {
            this.A0U.A0E().A93();
        }
        boolean A02 = AbstractC0878In.A02(this.A0U);
        if (A0l[6].charAt(12) != 'v') {
            throw new RuntimeException();
        }
        String[] strArr = A0l;
        strArr[4] = "Q7cFr2gPd7sCHl";
        strArr[5] = "KP59UR8sut1qsy";
        if (A02 || this.A0U.A0D() == null) {
            c1194Uy = new C1194Uy(this.A0U, c1169Tz);
        } else {
            c1194Uy = new C1194Uy(this.A0U, this.A0U.A0D(), c1169Tz);
        }
        this.A0G = c1194Uy;
        this.A0G.setOnTouchListener(new View$OnTouchListenerC1061Pv(this));
        setUpBrowserControls(this.A0G);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A0A.addView(this.A0G, layoutParams);
        this.A0G.loadUrl(str);
    }

    private void A0f(String str) {
        Map<String, String> A05 = new O8().A03(null).A02(null).A05();
        A05.put(A0J(0, 12, 87), str);
        this.A0V.A04(JE.A0J, A05);
        super.A0A.A4P(super.A05.A0Y());
        super.A07.AA9(super.A05.A1U(), A05);
        if (C0877Im.A2J(this.A0U)) {
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractC1491cm.A03, Boolean.TRUE.toString());
            hashMap.put(AbstractC1491cm.A04, Boolean.TRUE.toString());
            hashMap.put(AbstractC1491cm.A05, Boolean.TRUE.toString());
            super.A07.AAI(super.A05.A1U(), hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0g(String str) {
        if (super.A05.A1M() > 0) {
            if (super.A05.A1b()) {
                boolean z10 = this.A0M;
                if (A0l[1].charAt(27) != 'i') {
                    throw new RuntimeException();
                }
                String[] strArr = A0l;
                strArr[4] = "wgFga5xemtqUSQ";
                strArr[5] = "c72BHAWejdxIIo";
                if (z10) {
                    return;
                }
            }
            this.A0M = true;
            A0f(str);
            return;
        }
        boolean A16 = super.A05.A16();
        if (A0l[1].charAt(27) == 'i') {
            String[] strArr2 = A0l;
            strArr2[4] = "tZ3pnOdiXKjC0M";
            strArr2[5] = "WpWfv8IGy682Ke";
            if (!A16) {
                return;
            }
        } else if (!A16) {
            return;
        }
        A0N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0h(boolean z10) {
        this.A0K = z10;
        ObjectAnimator browserTransAnim = null;
        if (z10) {
            this.A02 = 0;
            this.A07 = 0;
            this.A0N = false;
            this.A0O = false;
            this.A0P = false;
            this.A0M = false;
        } else {
            Handler handler = this.A08;
            String[] strArr = A0l;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0l;
            strArr2[2] = "oSgdFQK8N6jMCdYHFrH2lNgRRSqq6R";
            strArr2[3] = "578emeYNAgGRKMd25cCRfBfCVjWlDp";
            handler.removeCallbacksAndMessages(null);
        }
        String A0J = A0J(60, 1, 17);
        if (z10) {
            browserTransAnim = ObjectAnimator.ofFloat(this.A0H, A0J, this.A0H.getY(), this.A05 / 5);
        }
        LinearLayout linearLayout = this.A0A;
        float y10 = this.A0A.getY();
        int i10 = this.A05;
        if (z10) {
            i10 /= 5;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, A0J, y10, i10);
        ofFloat.setDuration(500L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.A0Z, A0J, this.A0Z.getY(), 0.0f);
        ofFloat2.setDuration(500L);
        int height = this.A0Z.getHeight();
        int i11 = this.A05;
        if (z10) {
            i11 /= 5;
        }
        ValueAnimator duration = ValueAnimator.ofInt(height, i11).setDuration(500L);
        duration.addUpdateListener(new C1063Px(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ofFloat, ofFloat2, duration);
        if (browserTransAnim != null) {
            browserTransAnim.setDuration(500L);
            animatorSet.playTogether(browserTransAnim);
        }
        animatorSet.addListener(new C1064Py(this, z10));
        animatorSet.start();
    }

    private void A0i(boolean z10) {
        RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z10);
        M3.A0J(this.A0Z);
        if (this.A0K) {
            layoutParams = new RelativeLayout.LayoutParams(-1, this.A05 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            A0Q();
        }
        this.A0Z.setTranslationY(0.0f);
        addView(this.A0Z, 1, layoutParams);
        A0K();
        A0U();
    }

    private final boolean A0j() {
        return this.A0K;
    }

    @Override // com.facebook.ads.redexgen.X.U6
    public final void A0z() {
        A0O();
        if (C0877Im.A1p(this.A0U)) {
            this.A0U.A0A().AHC(this.A0Z);
        }
        if (this.A0Y != null) {
            TC tc2 = this.A0Y;
            if (A0l[6].charAt(12) != 'v') {
                throw new RuntimeException();
            }
            A0l[6] = "qZF2LURQ0N2avpQsVigAjVMCIAfnIk4T";
            tc2.A05();
        }
        if (this.A0Z != null) {
            this.A0Z.getEventBus().A04(this.A0f, this.A0e, this.A0d, this.A0g, this.A0b, this.A0c);
            M3.A0H(this.A0Z);
            this.A0Z.A0V();
        }
        this.A0a.A0o();
        M3.A0b(this.A0Z, this.A0i, this.A0h);
        super.A0C.A0V();
    }

    @Override // com.facebook.ads.redexgen.X.U6
    public final void A11() {
    }

    @Override // com.facebook.ads.redexgen.X.U6
    public final void A12() {
        this.A0Z.setVolume(super.A05.A1P().A0E().A09() ? 0.0f : 1.0f);
        this.A0Z.A0b(EnumC1084Qs.A02, 20);
    }

    @Override // com.facebook.ads.redexgen.X.U6
    public final void A13(boolean z10) {
        if (this.A0Z.A0j()) {
            return;
        }
        this.A0I = this.A0Z.getVideoStartReason();
        this.A0R = z10;
        this.A0Z.A0e(false, 13);
    }

    @Override // com.facebook.ads.redexgen.X.U6
    public final void A14(boolean z10) {
        if (this.A0Z.getState() != EnumC1099Rh.A06) {
            EnumC1084Qs enumC1084Qs = this.A0I;
            String[] strArr = A0l;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0l;
            strArr2[4] = "XPxqC5lbhdZAQT";
            strArr2[5] = "OGUEg1S7IFb9ga";
            if (enumC1084Qs != null) {
                if (!this.A0R || z10) {
                    this.A0Z.A0b(this.A0I, 19);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.U6
    public final boolean A15() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.U6
    public final boolean A16() {
        return false;
    }

    public C1O getColors() {
        return this.A0D;
    }

    @Override // com.facebook.ads.redexgen.X.U6
    public Q3 getFullScreenAdStyle() {
        return new Q3(true, Q3.A06, super.A05.A1O().A01(), View$OnClickListenerC1178Ui.A08(super.A05), super.A05.A1O().A01().A07(true), super.A05.A1P().A0E().A07());
    }

    @Override // com.facebook.ads.redexgen.X.U6
    public C0957Lv getTouchDataRecorder() {
        return super.A09;
    }

    @Override // com.facebook.ads.redexgen.X.U6, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0i(A0j());
        setupLayoutConfiguration(A0j());
        A0T();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            A14(false);
        } else {
            A13(false);
        }
    }

    private void setUpBrowserControls(C1194Uy c1194Uy) {
        M3.A0J(this.A0E);
        this.A0E = new C0997Nj(this.A0U, c1194Uy);
        c1194Uy.setBrowserNavigationListener(this.A0E.getBrowserNavigationListener());
        M3.A0K(this.A0E);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0E.setListener(new C1168Ty(this));
        this.A0E.setOnTouchListener(new View$OnTouchListenerC1062Pw(this));
        this.A0A.addView(this.A0E, layoutParams);
        M3.A0J(this.A0F);
        this.A0F = new C0998Nk(this.A0U, null, 16842872);
        this.A0A.addView(this.A0F, new LinearLayout.LayoutParams(-1, A0m));
    }

    private void setupLayoutConfiguration(boolean z10) {
        this.A0J = getResources().getConfiguration().orientation == 2;
        this.A0K = z10;
        this.A04 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) this.A0U.getSystemService(A0J(54, 6, ShapeTypes.VERTICAL_SCROLL));
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics windowMetrics = windowManager.getCurrentWindowMetrics();
                point.y = windowMetrics.getBounds().bottom - windowMetrics.getBounds().top;
            } else {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                if (Build.VERSION.SDK_INT >= 17) {
                    defaultDisplay.getRealSize(point);
                } else {
                    try {
                        Integer num = (Integer) Display.class.getMethod(A0J(12, 12, 28), new Class[0]).invoke(defaultDisplay, new Object[0]);
                        point.y = num != null ? num.intValue() : 0;
                    } catch (Exception unused) {
                    }
                }
            }
        }
        this.A05 = point.y > 0 ? point.y : this.A04;
        this.A03 = this.A04;
    }
}
