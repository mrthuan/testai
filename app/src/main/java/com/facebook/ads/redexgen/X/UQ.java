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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class UQ extends AbstractC1022Oi {
    public static byte[] A0k;
    public static String[] A0l = {"fr3Y9tf6ePgTPq", "pEcG", "X6n0DjY1D3c56kEYNT7NkudbHULcUpi8", "xLfqb7j3EStc", "2nglUwJ7J1gVDM", "1eQzmRPEbuFcZFemJlVYaDXjMdIAS51D", "mnsD3rfSZRPYnMaeA3V0PZWjFbonJuRI", "JvQjcWyuZKXxmxTpCuNSfYxSgxmPRmOD"};
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final int A0q;
    public static final int A0r;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public Handler A09;
    public View A0A;
    public InputMethodManager A0B;
    public LinearLayout A0C;
    public LinearLayout A0D;
    public RelativeLayout A0E;
    public TextView A0F;
    public AbstractC1456cD A0G;
    public C0997Nj A0H;
    public C0998Nk A0I;
    public C1194Uy A0J;
    public View$OnClickListenerC1178Ui A0K;
    public C1026Om A0L;
    public PD A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public final Handler A0a;
    public final View A0b;
    public final AbstractC04390h A0c;
    public final JF A0d;
    public final OR A0e;
    public final OS A0f;
    public final N5 A0g;
    public final Runnable A0h;
    public final Runnable A0i;
    public final Set<String> A0j;

    public static String A0J(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0k, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0l;
            if (strArr[3].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0l;
            strArr2[3] = "BAn7g4Tg6kNh";
            strArr2[1] = "sSvO";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 34);
            i13++;
        }
    }

    public static void A0X() {
        A0k = new byte[]{8, Field.BIDIOUTLINE, Field.FORMDROPDOWN, 86, Field.BIDIOUTLINE, Field.ADVANCE, 96, 76, 80, 74, 77, Field.BIDIOUTLINE, Field.LISTNUM, 121, 123, 106, 76, Byte.MAX_VALUE, 105, 86, 123, 119, 121, 118, 106, 124, 123, 101, 96, 97, 74, 120, 112, 97, 125, 122, 113, 77, Field.MERGESEQ, Field.ADDRESSBLOCK, 74, Field.HTMLCONTROL, Field.ADVANCE, Field.ADDIN, Field.HTMLCONTROL, Field.FORMDROPDOWN, 103, Field.GREETINGLINE, Field.ADDIN, Field.ADVANCE, 76, Field.ADDRESSBLOCK, 74, Field.ADDRESSBLOCK, Field.BIDIOUTLINE, 64, Field.GREETINGLINE, Field.AUTOTEXTLIST, Field.FORMDROPDOWN, Field.HYPERLINK, 64, 78, Field.CONTROL, 80, 102, Field.LISTNUM, 77, Field.HYPERLINK, 102, Field.HTMLCONTROL, 76, 77, 77, 86, Field.CONTROL, 119, 110, 105, Field.SHAPE, 119, 101, 98, Field.SHAPE, 105, 110, 115, 116, 97, 108, 108, Field.SHAPE, 98, 117, 116, 116, 111, 110, 41};
    }

    static {
        A0X();
        A0p = (int) (LP.A02 * 26.0f);
        A0m = (int) (LP.A02 * 4.0f);
        A0r = (int) (LP.A02 * 8.0f);
        A0n = (int) (LP.A02 * 24.0f);
        A0o = AbstractC04982p.A01(-1, 77);
        A0q = (int) (LP.A02 * 12.0f);
    }

    public UQ(C1026Om c1026Om) {
        super(c1026Om, true);
        this.A0X = false;
        this.A02 = -1;
        this.A0Y = false;
        this.A03 = 0;
        this.A0N = false;
        this.A0U = false;
        this.A0W = false;
        this.A0V = false;
        this.A0Z = false;
        this.A0R = false;
        this.A0T = false;
        this.A0S = false;
        this.A0Q = false;
        this.A08 = 0;
        this.A01 = 0;
        this.A0i = new P3(this);
        this.A0P = false;
        this.A0j = new HashSet();
        this.A0a = new Handler(Looper.getMainLooper());
        this.A0h = new Runnable() { // from class: com.facebook.ads.redexgen.X.Oy
            @Override // java.lang.Runnable
            public final void run() {
                UQ.this.A16();
            }
        };
        this.A09 = new Handler(Looper.getMainLooper());
        this.A0B = (InputMethodManager) c1026Om.A05().getSystemService(A0J(25, 12, 55));
        this.A0L = c1026Om;
        this.A0G = this.A0L.A04();
        this.A0d = new JF(c1026Om.A04().A1U(), c1026Om.A06());
        this.A0g = this.A0L.A0B();
        if (this.A0g != null) {
            M3.A0K(this.A0g);
        }
        this.A0b = this.A0L.A03();
        this.A0c = C04400i.A01(c1026Om.A05(), c1026Om.A06(), c1026Om.A04().A1U(), L5.A00(c1026Om.A04().A1P().A0G().A05()), new HashMap(), false, true, this.A0G.A1Q());
        AbstractC1015Ob.A00(c1026Om.A05(), this, c1026Om.A04().A1P().A0E().A07());
        setupLayoutConfiguration(false);
        A0T();
        A0P();
        postDelayed(new UT(this), 1000L);
        A0W();
        this.A0e = new US(this);
        T7 t72 = this.A0L.A02() instanceof T7 ? (T7) this.A0L.A02() : null;
        this.A0f = new OS(c1026Om, this.A0G, t72, this.A0L.A0A(), this.A0e, this.A0F, this.A0M, this.A0g, this.A0b);
        if (t72 != null && C0877Im.A1E(getAdContextWrapper())) {
            OB.A00(t72.getVideoImplView(), C0877Im.A1F(getAdContextWrapper()), new P4(this));
        } else if (t72 == null && this.A0A != null && C0877Im.A1C(getAdContextWrapper())) {
            OB.A00(this.A0A, C0877Im.A1D(getAdContextWrapper()), new P5(this));
        }
        this.A0E = null;
        this.A0K = null;
    }

    public UQ(C1026Om c1026Om, boolean z10) {
        this(c1026Om);
        String[] split;
        this.A0X = z10;
        AbstractC1456cD A04 = c1026Om.A04();
        this.A0Y = this.A0X && A04.A1G();
        if (this.A0X) {
            this.A02 = A04.A0Q();
            if (this.A02 == 0) {
                A16();
            } else if (this.A02 > 0 && this.A02 <= 10000) {
                this.A0a.postDelayed(this.A0h, this.A02);
            }
            String A0n2 = A04.A0n();
            if (!TextUtils.isEmpty(A0n2)) {
                for (String stringToCheck : A0n2.split(A0J(0, 1, 10))) {
                    this.A0j.add(stringToCheck);
                }
            }
        }
    }

    public static /* synthetic */ int A03(UQ uq) {
        int i10 = uq.A01;
        uq.A01 = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int A05(UQ uq) {
        int i10 = uq.A08;
        uq.A08 = i10 + 1;
        return i10;
    }

    private void A0K() {
        M3.A0J(this.A0D);
        this.A0D = new LinearLayout(this.A0L.A05());
        M3.A0R(this.A0D, getAdContextWrapper());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0N ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(12);
        this.A0D.setLayoutParams(layoutParams);
        addView(this.A0D, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0L */
    public void A16() {
        A0d(((C0815Ga) this.A0c).A0G().toString());
        A0g(true);
    }

    private void A0M() {
        ExecutorC0959Lx.A00(new Runnable() { // from class: com.facebook.ads.redexgen.X.Ox
            @Override // java.lang.Runnable
            public final void run() {
                UQ.this.A15();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        if (this.A0G.A17() && this.A0P) {
            this.A0P = false;
            A0e(A0J(37, 18, 26));
        }
    }

    private void A0O() {
        if (this.A0G.A17() && this.A0P) {
            this.A0P = false;
            Map<String, String> A05 = new O8().A03(null).A02(null).A05();
            A05.put(A0J(1, 12, 29), A0J(37, 18, 26));
            getAdEventManager().A9w(this.A0G.A1U(), A05);
        }
    }

    private void A0P() {
        M3.A0J(this.A0C);
        this.A0C = new LinearLayout(this.A0L.A05());
        this.A0C.setOrientation(1);
        M3.A0K(this.A0C);
        A0U();
        this.A0C.setBackgroundColor(-1);
        addView(this.A0C);
    }

    private void A0Q() {
        if (this.A0b != null) {
            M3.A0J(this.A0b);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC1022Oi.A08, AbstractC1022Oi.A08);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.setMargins(AbstractC1022Oi.A07, this.A07, AbstractC1022Oi.A07, AbstractC1022Oi.A07);
            addView(this.A0b, layoutParams);
        }
    }

    private void A0R() {
        if (this.A0g != null) {
            M3.A0J(this.A0g);
            this.A0g.setPadding(A0q, A0q, A0q, A0q);
            this.A0g.A06(-1, A0o);
            this.A0g.setTranslationY(0.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0p);
            layoutParams.addRule(12);
            addView(this.A0g, layoutParams);
        }
    }

    private void A0S() {
        MQ A09 = this.A0L.A09();
        if (A09 == null) {
            return;
        }
        A09.setPageDetailsVisible((this.A0O || A09.A0A()) ? false : true);
    }

    private void A0T() {
        this.A0A = this.A0L.A02();
        if (this.A0G.A17()) {
            this.A0A.setOnClickListener(new P6(this));
        }
        M3.A0J(this.A0A);
        M3.A0K(this.A0A);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        addView(this.A0A, 1, layoutParams);
        this.A0F = new TextView(this.A0L.A05());
        M3.A0K(this.A0F);
        this.A0F.setGravity(17);
        this.A0F.setTextColor(getColors().A05(true));
        this.A0F.setEllipsize(TextUtils.TruncateAt.END);
        this.A0F.setMaxLines(2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        layoutParams2.setMargins(A0r, A0r / 2, A0r, this.A0g == null ? A0r : A0p);
        addView(this.A0F, layoutParams2);
        M3.A0K(this.A0F);
        this.A0M = new PD(this.A0L.A05(), this.A0L.A04(), this.A0L.A06(), this.A0L.A0A(), this.A0L.A0C(), this.A0L.A08(), getColors(), new UR(this));
        this.A0M.setAutoClickTime(this.A0L.A04(), this.A0L.A09());
        M3.A0G(1001, this.A0M);
        addView(this.A0M);
        A0V();
        A0K();
        if (C0877Im.A12(this.A0L.A05())) {
            this.A0D.setOnClickListener(new P7(this));
            if (this.A0L.A09() != null) {
                this.A0L.A09().setCTAClickListener(new P8(this));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0U() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A05);
        if (A19()) {
            layoutParams.setMargins(0, this.A05 / 5, 0, 0);
            layoutParams.addRule(12);
            String[] strArr = A0l;
            if (strArr[6].charAt(18) != strArr[5].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0l;
            strArr2[3] = "lVu96jIJ4wtN";
            strArr2[1] = "vEsO";
            this.A0C.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A05 + 1, 0, 0);
        }
        LinearLayout linearLayout = this.A0C;
        String[] strArr3 = A0l;
        if (strArr3[4].length() != strArr3[0].length()) {
            linearLayout.setTranslationY(0.0f);
            this.A0C.setLayoutParams(layoutParams);
            return;
        }
        String[] strArr4 = A0l;
        strArr4[6] = "ao8FhOByUXKbyI2dbjVU10hQSvAA73UK";
        strArr4[5] = "1fPkz4yBU6BXLdgQ7SVXdDzzX5ZOz4LN";
        linearLayout.setTranslationY(0.0f);
        this.A0C.setLayoutParams(layoutParams);
    }

    private void A0V() {
        C1O adColors;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.A0N ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A0F.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0M.setLayoutParams(layoutParams);
        if (this.A0Y && this.A0K != null) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.A0N ? -2 : -1, -2);
            layoutParams2.addRule(12);
            layoutParams2.addRule(14);
            layoutParams2.setMargins(A0n, 0, A0n, A0n);
            if (getContext().getResources().getConfiguration().orientation == 1) {
                adColors = this.A0L.A04().A1O().A01();
            } else {
                adColors = this.A0L.A04().A1O().A00();
            }
            this.A0K.setUpButtonColors(adColors);
            if (this.A0N) {
                this.A0K.setPadding(A0n, 0, A0n, 0);
            }
            View$OnClickListenerC1178Ui view$OnClickListenerC1178Ui = this.A0K;
            String[] strArr = A0l;
            if (strArr[6].charAt(18) != strArr[5].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0l;
            strArr2[6] = "AuovlskRS4ra5LnKaHVdb744ygVoFjY2";
            strArr2[5] = "ls1L1tiwYnJTmONbQbVaT3PDhb5OoAVQ";
            view$OnClickListenerC1178Ui.setLayoutParams(layoutParams2);
        }
    }

    private void A0W() {
        A0R();
        A0Q();
        A0S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0d(String str) {
        C1194Uy c1194Uy;
        C1O A00;
        C1O A002;
        if (this.A0Y) {
            M3.A0J(this.A0E);
            M3.A0J(this.A0K);
        }
        M3.A0J(this.A0J);
        UV uv = new UV(this);
        if (this.A0L.A05().A0D() == null) {
            this.A0L.A05().A0E().A93();
        }
        if (!AbstractC0878In.A02(this.A0L.A05()) && this.A0L.A05().A0D() != null) {
            c1194Uy = new C1194Uy(this.A0L.A05(), this.A0L.A05().A0D(), uv);
        } else {
            c1194Uy = new C1194Uy(this.A0L.A05(), uv);
        }
        this.A0J = c1194Uy;
        if (this.A0X) {
            this.A0J.setInterceptRedirectRequest(new InterfaceC1005Nr() { // from class: com.facebook.ads.redexgen.X.UY
                @Override // com.facebook.ads.redexgen.X.InterfaceC1005Nr
                public final boolean A9c(String str2) {
                    return UQ.this.A1A(str2);
                }
            });
        }
        if (this.A0G.A1B() && Build.VERSION.SDK_INT > 16) {
            this.A0J.addJavascriptInterface(new C1017Od(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Ou
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UQ.this.A17(view);
                }
            }, this.A0J, new InterfaceC1016Oc() { // from class: com.facebook.ads.redexgen.X.UX
                @Override // com.facebook.ads.redexgen.X.InterfaceC1016Oc
                public final void ABW() {
                    UQ.this.A13();
                }
            }), C1017Od.A01());
        }
        this.A0J.setOnTouchListener(new P0(this));
        setUpBrowserControls(this.A0J);
        LinearLayout.LayoutParams webViewParams = new LinearLayout.LayoutParams(-1, -1);
        webViewParams.weight = 0.9f;
        if (this.A0Y || this.A0G.A1B()) {
            C1314Zs A05 = this.A0L.A05();
            String A0Y = this.A0L.A04().A0Y();
            if (this.A0L.A00() == 1) {
                A00 = this.A0L.A04().A1O().A01();
            } else {
                C1026Om c1026Om = this.A0L;
                String[] strArr = A0l;
                if (strArr[6].charAt(18) != strArr[5].charAt(18)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0l;
                strArr2[3] = "2TqJYCounOPF";
                strArr2[1] = "eAOM";
                A00 = c1026Om.A04().A1O().A00();
            }
            this.A0K = new View$OnClickListenerC1178Ui(A05, A0Y, A00, this.A0L.A04().A1P().A0G().A06(), this.A0L.A06(), this.A0L.A0A(), this.A0L.A0C(), this.A0L.A08(), this.A0L.A04().A1Q());
            this.A0K.setCta(this.A0L.A04().A1P().A0G(), this.A0L.A04().A1U(), new HashMap());
        }
        if (!this.A0Y || this.A0K == null) {
            this.A0C.addView(this.A0J, webViewParams);
        } else {
            this.A0E = new RelativeLayout(getContext());
            this.A0E.addView(this.A0J, new RelativeLayout.LayoutParams(-1, -1));
            M3.A0K(this.A0K);
            this.A0K.setRoundedCornersEnabled(A00());
            this.A0K.setViewShowsOverMedia(A0C());
            if (getContext().getResources().getConfiguration().orientation == 1) {
                A002 = this.A0L.A04().A1O().A01();
            } else {
                A002 = this.A0L.A04().A1O().A00();
            }
            this.A0K.setUpButtonColors(A002);
            if (this.A0N) {
                this.A0K.setPadding(A0n, 0, A0n, 0);
            }
            this.A0K.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Ov
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UQ.this.A18(view);
                }
            });
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.A0N ? -2 : -1, -2);
            layoutParams.addRule(12);
            layoutParams.addRule(14);
            layoutParams.setMargins(A0n, 0, A0n, A0n);
            this.A0E.addView(this.A0K, layoutParams);
            this.A0C.addView(this.A0E, webViewParams);
        }
        this.A0J.loadUrl(str);
    }

    private void A0e(String str) {
        Map<String, String> A05 = new O8().A03(null).A02(null).A05();
        A05.put(A0J(1, 12, 29), str);
        this.A0d.A04(JE.A0J, A05);
        this.A0L.A0A().A4P(this.A0G.A0Y());
        getAdEventManager().AA9(this.A0G.A1U(), A05);
        if (C0877Im.A2J(this.A0L.A05())) {
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractC1491cm.A03, Boolean.TRUE.toString());
            hashMap.put(AbstractC1491cm.A04, Boolean.TRUE.toString());
            hashMap.put(AbstractC1491cm.A05, Boolean.TRUE.toString());
            getAdEventManager().AAI(this.A0G.A1U(), hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0f(String str) {
        if (this.A0G.A1M() > 0) {
            if (this.A0G.A1b() && this.A0Q) {
                return;
            }
            this.A0Q = true;
            A0e(str);
        } else if (this.A0G.A16()) {
            A0N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0g(boolean z10) {
        this.A0O = z10;
        if (this.A0X && z10) {
            this.A0a.removeCallbacks(this.A0h);
        }
        ObjectAnimator objectAnimator = null;
        if (!z10) {
            this.A09.removeCallbacksAndMessages(null);
        } else {
            this.A01 = 0;
            this.A08 = 0;
            this.A0R = false;
            this.A0S = false;
            this.A0T = false;
            this.A0Q = false;
        }
        postDelayed(new UU(this, z10), 250L);
        String A0J = A0J(97, 1, 114);
        if (z10) {
            objectAnimator = ObjectAnimator.ofFloat(this.A0M, A0J, this.A0M.getY(), this.A05 / 5);
        }
        LinearLayout linearLayout = this.A0C;
        float y10 = this.A0C.getY();
        int i10 = this.A05;
        if (z10) {
            i10 /= 5;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, A0J, y10, i10);
        ofFloat.setDuration(500L);
        ObjectAnimator browserTransAnim = ObjectAnimator.ofFloat(this.A0A, A0J, this.A0A.getY(), 0.0f);
        browserTransAnim.setDuration(500L);
        int height = this.A0A.getHeight();
        int i11 = this.A05;
        if (z10) {
            i11 /= 5;
        }
        ValueAnimator duration = ValueAnimator.ofInt(height, i11).setDuration(500L);
        duration.addUpdateListener(new P1(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ofFloat, browserTransAnim, duration);
        if (objectAnimator != null) {
            objectAnimator.setDuration(500L);
            animatorSet.playTogether(objectAnimator);
        }
        animatorSet.addListener(new P2(this, z10));
        animatorSet.start();
    }

    private void A0h(boolean z10) {
        RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z10);
        M3.A0J(this.A0A);
        if (this.A0A == null) {
            this.A0A = this.A0L.A02();
            M3.A0K(this.A0A);
        }
        boolean z11 = this.A0O;
        String[] strArr = A0l;
        if (strArr[6].charAt(18) != strArr[5].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0l;
        strArr2[2] = "vsQMzuL85pElT0uyLkCOYkbLp6FYZ6Kp";
        strArr2[7] = "Jg0wEDfumSgIDDBadFZcUW5HjHx0Xq4t";
        if (z11) {
            layoutParams = new RelativeLayout.LayoutParams(-1, this.A05 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            if (C0877Im.A1C(getAdContextWrapper()) && getResources().getConfiguration().orientation == 2 && !(this.A0A instanceof T7)) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            }
            layoutParams.addRule(13);
            A0P();
        }
        this.A0A.setTranslationY(0.0f);
        addView(this.A0A, 1, layoutParams);
        A0K();
        A0V();
    }

    private boolean A0i() {
        return this.A0G.A1P().A0E().A0A() && this.A0V && !this.A0Z && !this.A0W;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final void A0v() {
        if (this.A0X) {
            this.A0a.removeCallbacks(this.A0h);
        }
        A0O();
        super.A0v();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final void A0w() {
        MQ A09 = this.A0L.A09();
        if (A09 != null) {
            A09.setPageDetailsVisible((A19() || A09.A0A()) ? false : true);
        }
        this.A0V = false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final void A0x() {
        if (this.A0L.A09() != null) {
            this.A0L.A09().setPageDetailsVisible(false);
        }
        this.A0V = true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final void A0y() {
        this.A0W = false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final void A0z() {
        this.A0W = this.A0G.A1P().A0E().A03() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A10(com.facebook.ads.redexgen.X.C1F r6, java.lang.String r7, double r8, android.os.Bundle r10) {
        /*
            r5 = this;
            super.A10(r6, r7, r8, r10)
            com.facebook.ads.redexgen.X.1M r0 = r6.A0F()
            java.lang.String r1 = r0.A07()
            if (r1 == 0) goto L17
            java.lang.String r0 = r1.trim()
            int r0 = r0.length()
            if (r0 != 0) goto L49
        L17:
            android.widget.LinearLayout r1 = r5.A0D
            r0 = 8
            com.facebook.ads.redexgen.X.M3.A0N(r1, r0)
            com.facebook.ads.redexgen.X.Om r0 = r5.A0L
            com.facebook.ads.redexgen.X.Zs r0 = r0.A05()
            boolean r0 = com.facebook.ads.redexgen.X.C0877Im.A12(r0)
            if (r0 == 0) goto L30
            android.widget.LinearLayout r1 = r5.A0D
            r0 = 0
            r1.setClickable(r0)
        L30:
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3d
            int r0 = r5.A06
            double r1 = (double) r0
            double r1 = r1 / r8
            int r0 = (int) r1
            r5.A03 = r0
        L3d:
            boolean r0 = r5.A0N
            if (r0 == 0) goto L46
            int r0 = r5.A04
        L43:
            r5.A03 = r0
            return
        L46:
            int r0 = r5.A03
            goto L43
        L49:
            android.widget.TextView r0 = r5.A0F
            r0.setText(r1)
            com.facebook.ads.redexgen.X.Om r0 = r5.A0L
            com.facebook.ads.redexgen.X.Zs r0 = r0.A05()
            boolean r0 = com.facebook.ads.redexgen.X.C0877Im.A12(r0)
            if (r0 == 0) goto L30
            android.widget.LinearLayout r4 = r5.A0D
            r3 = 1
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.UQ.A0l
            r0 = 2
            r1 = r2[r0]
            r0 = 7
            r2 = r2[r0]
            r0 = 25
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L81
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.UQ.A0l
            java.lang.String r1 = "eomTAZA5kOTO"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "I37n"
            r0 = 1
            r2[r0] = r1
            r4.setClickable(r3)
            goto L30
        L81:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.UQ.A10(com.facebook.ads.redexgen.X.1F, java.lang.String, double, android.os.Bundle):void");
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final boolean A11() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final boolean A12(boolean z10) {
        if (A19()) {
            A0g(false);
            return true;
        } else if (A0i()) {
            this.A0f.A07(this);
            return true;
        } else {
            return false;
        }
    }

    public final /* synthetic */ void A13() {
        this.A0L.A05().A0E().AAd();
    }

    public final /* synthetic */ void A14() {
        if (this.A0K != null) {
            this.A0L.A05().A0E().AAc();
            this.A0K.A09(A0J(61, 14, 27));
        }
    }

    public final /* synthetic */ void A15() {
        if (this.A0K != null) {
            this.A0L.A05().A0E().AAg();
            this.A0K.A09(A0J(75, 22, 34));
        }
    }

    public final /* synthetic */ void A17(View view) {
        A0M();
    }

    public final /* synthetic */ void A18(View view) {
        ExecutorC0959Lx.A00(new Runnable() { // from class: com.facebook.ads.redexgen.X.Ow
            @Override // java.lang.Runnable
            public final void run() {
                UQ.this.A14();
            }
        });
    }

    public final boolean A19() {
        return this.A0O;
    }

    public final /* synthetic */ boolean A1A(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.A0j.isEmpty()) {
            return true;
        }
        for (String str2 : this.A0j) {
            if (!str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public int getCloseButtonStyle() {
        if (A19()) {
            return 3;
        }
        if (this.A0W) {
            return 2;
        }
        if (this.A0G.A1P().A0E().A0A()) {
            return 1;
        }
        if (this.A0V) {
            return 4;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0h(A19());
        A0W();
        setupLayoutConfiguration(A19());
        A0U();
    }

    private void setUpBrowserControls(C1194Uy c1194Uy) {
        M3.A0J(this.A0H);
        this.A0H = new C0997Nj(this.A0L.A05(), c1194Uy, true);
        c1194Uy.setBrowserNavigationListener(this.A0H.getBrowserNavigationListener());
        M3.A0K(this.A0H);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0H.setListener(new UW(this));
        this.A0H.setOnTouchListener(new View$OnTouchListenerC1039Oz(this));
        this.A0C.addView(this.A0H, layoutParams);
        M3.A0J(this.A0I);
        this.A0I = new C0998Nk(this.A0L.A05(), null, 16842872);
        this.A0C.addView(this.A0I, new LinearLayout.LayoutParams(-1, A0m));
    }

    private void setupLayoutConfiguration(boolean z10) {
        this.A0N = getResources().getConfiguration().orientation == 2;
        this.A07 = this.A0L.A09() == null ? 0 : this.A0L.A09().getToolbarHeight();
        this.A0O = z10;
        this.A04 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) getAdContextWrapper().getSystemService(A0J(55, 6, 21));
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
                        Integer num = (Integer) Display.class.getMethod(A0J(13, 12, 60), new Class[0]).invoke(defaultDisplay, new Object[0]);
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
