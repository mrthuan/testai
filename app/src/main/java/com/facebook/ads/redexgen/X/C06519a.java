package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.9a  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06519a extends AbstractC1160Tq {
    public static byte[] A0T;
    public static String[] A0U = {"", "YtQm2387uXJs", "MlRkJczYYxJD4Wwp0SHW4B9CEOUSnddR", "Rw6HEQ3C6e1KGOQ0gaz0SQKaqXM6WP6s", "SVsTOXJGQLTRlrov45UN9nTiloFn5X8Y", "Icuwm310fXqoj23c8ds7ElfBFjsMoXLO", "Pjvv6hw4WD5DyhE4XvR8T7jl", "KYBHBzoeYb2kbTAqfKJN2TrMGpQFpmBq"};
    public int A00;
    public JE A01;
    public AbstractC1022Oi A02;
    public QC A03;
    public C1068Qc A04;
    public EnumC1084Qs A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Handler A0F;
    public final C5W A0G;
    public final QB A0H;
    public final TC A0I;
    public final T7 A0J;
    public final C9S A0K;
    public final AbstractC1127Sj A0L;
    public final AbstractC1125Sh A0M;
    public final AbstractC1121Sd A0N;
    public final AbstractC1105Rn A0O;
    public final R9 A0P;
    public final R8 A0Q;
    public final C1011Nx A0R;
    public final N5 A0S;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0T, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0T = new byte[]{23, Field.BARCODE, 41, Field.GLOSSARY, Field.BARCODE, 17};
    }

    static {
        A0B();
    }

    public C06519a(C1314Zs c1314Zs, N9 n92, J7 j72, AbstractC1456cD abstractC1456cD, C05906f c05906f, MR mr) {
        super(c1314Zs, n92, j72, abstractC1456cD, c05906f, mr);
        this.A0G = new C1147Td(this);
        this.A0P = new A3(this);
        this.A0O = new AbstractC1105Rn() { // from class: com.facebook.ads.redexgen.X.9i
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC06488x
            /* renamed from: A00 */
            public final void A03(SZ sz) {
                C06519a.this.A0E = true;
                C06519a.this.A0V();
            }
        };
        this.A0N = new AbstractC1121Sd() { // from class: com.facebook.ads.redexgen.X.9g
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC06488x
            /* renamed from: A00 */
            public final void A03(C9P c9p) {
            }
        };
        this.A0Q = new R8() { // from class: com.facebook.ads.redexgen.X.9f
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC06488x
            /* renamed from: A00 */
            public final void A03(C9O c9o) {
                AbstractC1022Oi abstractC1022Oi;
                C06519a.this.A0L(c9o);
                C06519a.this.A0K(c9o);
                abstractC1022Oi = C06519a.this.A02;
                abstractC1022Oi.A0E(c9o);
            }
        };
        this.A0L = new AbstractC1127Sj() { // from class: com.facebook.ads.redexgen.X.9d
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC06488x
            /* renamed from: A00 */
            public final void A03(C9R c9r) {
                T7 t72;
                C06519a c06519a = C06519a.this;
                t72 = C06519a.this.A0J;
                c06519a.A0J(c9r, t72.getState() != EnumC1099Rh.A06, false);
            }
        };
        this.A0M = new C06539c(this);
        boolean z10 = false;
        this.A0D = false;
        this.A0E = false;
        this.A0C = false;
        this.A0B = false;
        this.A09 = false;
        this.A00 = 0;
        this.A06 = false;
        this.A08 = false;
        this.A01 = JE.A0a;
        this.A0F = new Handler(Looper.getMainLooper());
        this.A0H = new C1146Tc(this);
        this.A0J = new T7(super.A03);
        this.A0J.setFunnelLoggingHandler(super.A05);
        this.A0J.getEventBus().A03(this.A0P, this.A0O, this.A0N, this.A0Q, this.A0L, this.A0M);
        this.A0A = abstractC1456cD.A1E();
        this.A0K = new C9S(super.A03, super.A04, this.A0J, super.A01.A1U());
        if (C0877Im.A1q(super.A03)) {
            this.A0I = new TC(super.A03, super.A04, this.A0J, super.A01.A1U(), this.A0K, null);
        } else {
            this.A0I = null;
        }
        this.A04 = new C1068Qc(super.A03, super.A09, super.A01.A0m(), mr);
        this.A0R = new C1011Nx(super.A03, super.A05);
        this.A0S = new N5(super.A03);
        if (this.A0A) {
            this.A0S.setVisibility(8);
        }
        A0A();
        this.A0J.setVideoURI(super.A02.A0S(super.A01.A1P().A0E().A08()));
        A08();
        int A03 = super.A01.A1P().A0E().A03();
        if (C0877Im.A2F(super.A03)) {
            this.A0B = A03 == 0;
        } else {
            this.A0B = A03 <= 0;
        }
        if (super.A01.A1P().A0O() && super.A01.A1P().A0E().A02() > 0) {
            z10 = true;
        }
        this.A07 = z10;
        M3.A0M(this, super.A01.A1O().A01().A07(true));
        if (C0877Im.A29(super.A03)) {
            super.A07.setProgressSpinnerInvisible(true);
        }
    }

    private int A00(int i10, int i11, int i12) {
        int i13 = 0;
        if (this.A0A) {
            int completedVideoCycleDuration = this.A00;
            i13 = i12 * completedVideoCycleDuration;
        }
        int completedVideoCycleDuration2 = i10 / 1000;
        return (i11 - i13) - completedVideoCycleDuration2;
    }

    private AbstractC1022Oi A02(int i10) {
        C1025Ol A0K = new C1025Ol(super.A03, super.A04, super.A08, super.A01, this.A0J, super.A0A, super.A06).A0F(super.A07.getToolbarHeight()).A0J(super.A07).A0E(i10).A0G(this.A0R).A0K(this.A0S);
        if (super.A01.A1P().A0O() && C0877Im.A1T(super.A03) && super.A01.A1P().A0I() != null) {
            A0K.A0I(getPackageInstallListener());
        }
        return AbstractC1023Oj.A00(A0K.A0M(), null, true);
    }

    private void A07() {
        this.A0J.postDelayed(new C1145Tb(this), C0877Im.A0M(super.A03));
    }

    private void A08() {
        this.A0J.postDelayed(new C1150Tg(this), C0877Im.A0N(super.A03));
    }

    private void A09() {
        this.A0B = true;
        super.A07.A06();
        if (this.A02 != null) {
            this.A02.A0y();
        }
    }

    private void A0A() {
        this.A0J.A0c(this.A0S);
        this.A0J.A0c(this.A0R);
        if (!TextUtils.isEmpty(super.A01.A1P().A0E().A07())) {
            C7V c7v = new C7V(super.A03);
            this.A0J.A0c(c7v);
            c7v.setImage(super.A01.A1P().A0E().A07());
        }
        C7G c7g = new C7G(super.A03, true, super.A05);
        this.A0J.A0c(c7g);
        this.A0J.A0c(new OY(c7g, R5.A02, true));
        this.A0J.A0c(new C7L(super.A03));
    }

    private void A0C(JE je2) {
        new JF(super.A01.A1U(), super.A03.A09()).A04(je2, null);
        super.A08.A4P(super.A09.A6F());
        this.A04.A05();
        if (this.A02 instanceof BX) {
            ((BX) this.A02).A17();
        }
        this.A0F.postDelayed(new Q9(this), 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(JE je2) {
        if (!this.A06) {
            this.A08 = true;
            this.A01 = je2;
            return;
        }
        A0C(je2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(C9R c9r, boolean z10, boolean z11) {
        if (this.A03 != null) {
            this.A03.AFf();
        } else if (this.A0C) {
        } else {
            if (!z10 && this.A07 && this.A0A) {
                this.A00++;
                this.A0J.A0b(EnumC1084Qs.A02, 20);
                return;
            }
            if (!this.A0B) {
                A09();
            }
            this.A0C = true;
            if (this.A02 != null) {
                this.A02.A0D(c9r);
            }
            super.A07.setToolbarActionMessage(A06(0, 0, 98));
            A0N(z10, z11);
            super.A07.setToolbarActionMode(getCloseButtonStyle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(C9O c9o) {
        if (this.A0J.getState() == EnumC1099Rh.A02 && C0877Im.A1U(super.A03)) {
            this.A0J.postDelayed(new C1149Tf(this, c9o), TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(C9O c9o) {
        float f10;
        int A00 = c9o.A00();
        if (this.A07) {
            int totalSecondsForReward = super.A01.A1P().A0E().A02();
            int currentPosMs = super.A01.A1P().A0E().A04();
            int A002 = A00(A00, totalSecondsForReward, currentPosMs);
            if (!View$OnClickListenerC1178Ui.A08(super.A01)) {
                boolean A1F = super.A01.A1F();
                String A06 = A06(0, 0, 98);
                if (A1F || super.A01.A1D()) {
                    super.A07.setToolbarActionMessage(A06);
                } else if (A002 > 0) {
                    super.A07.setToolbarActionMessage(super.A01.A1T().A02().replace(A06(0, 6, 50), String.valueOf(A002)));
                } else {
                    super.A07.setToolbarActionMessage(A06);
                }
            }
            if (A002 <= 0) {
                A0N(false, false);
            }
        }
        boolean z10 = this.A0A;
        if (A0U[3].charAt(17) != 'M') {
            String[] strArr = A0U;
            strArr[7] = "uMQCRWrhYQnYLwhLQAgpxQMv5WWv5BZx";
            strArr[2] = "9L1nBY5kYCpH57KFfLoLkWPFyXHXe8tQ";
            if (!z10) {
                int A03 = super.A01.A1P().A0E().A03();
                String[] strArr2 = A0U;
                String str = strArr2[0];
                String str2 = strArr2[1];
                int length = str.length();
                int currentPosMs2 = str2.length();
                if (length != currentPosMs2) {
                    String[] strArr3 = A0U;
                    strArr3[7] = "qF0wWRoQYNHbRw7kiC8WRpThpP8Fmr54";
                    strArr3[2] = "3pcRB14MY6MyksHgyK5pJeiIhpnbS9OL";
                    int currentPosMs3 = this.A0J.getDuration();
                    f10 = Math.min(A03 * 1000.0f, currentPosMs3);
                }
            } else {
                int currentPosMs4 = super.A01.A1P().A0E().A03();
                f10 = currentPosMs4 * 1000.0f;
            }
            float f11 = A00;
            if (this.A0A) {
                float unskippableSeconds = this.A0J.getDuration() * this.A00;
                f11 += unskippableSeconds;
            }
            float f12 = f11 / f10;
            if (!super.A01.A1D()) {
                super.A07.setProgress(100.0f * f12);
            } else {
                int i10 = 0;
                float totalCurrentPosMs = f10 - f11;
                if (totalCurrentPosMs > 0.0f) {
                    int currentPosMs5 = (int) (f10 - f11);
                    i10 = currentPosMs5 / 1000;
                }
                super.A07.A08(100.0f * f12, i10);
            }
            int currentPosMs6 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
            if (currentPosMs6 >= 0 && !this.A0B) {
                A09();
                MQ mq = super.A07;
                int currentPosMs7 = getCloseButtonStyle();
                mq.setToolbarActionMode(currentPosMs7);
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(String str) {
        int i10 = 0;
        int i11 = 0;
        if (this.A0J != null) {
            i10 = this.A0J.getCurrentPositionInMillis();
            i11 = this.A0J.getDuration();
            this.A0J.A0Z(3);
        }
        super.A03.A0E().A3L(str);
        if (C0877Im.A1V(super.A03)) {
            A0J(new C9R(i10, i11), false, true);
            return;
        }
        super.A08.A4P(super.A09.A7M());
        super.A08.A4P(super.A09.A7I());
    }

    private synchronized void A0N(boolean z10, boolean z11) {
        if (this.A03 != null) {
            this.A07 = false;
            return;
        }
        if (this.A07 && !z10 && !z11) {
            super.A08.A4P(super.A09.A6F());
            this.A04.A05();
            this.A07 = false;
            if (this.A02 != null) {
                this.A02.A0w();
            }
            return;
        }
        this.A07 = false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1160Tq
    public final void A0W() {
        M3.A0L(this.A02);
        this.A0J.setVisibility(4);
        if (!super.A01.A1C()) {
            A0a();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1160Tq
    public final void A0Y(C5Q c5q) {
        c5q.A0A(this.A0G);
        int orientation = c5q.A05().getResources().getConfiguration().orientation;
        this.A02 = A02(orientation);
        addView(this.A02, AbstractC1160Tq.A0E);
        addView(super.A07, new FrameLayout.LayoutParams(-1, super.A07.getToolbarHeight()));
        M3.A0H(this.A02);
        M3.A0H(super.A07);
        if (super.A01.A1C() && (this.A02 instanceof BX)) {
            ((BX) this.A02).setVideoAdViewListener(this.A0H);
        }
        setUpFullscreenMode(this.A02 != null && this.A02.A11());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1160Tq
    public final boolean A0Z() {
        if (this.A02 != null) {
            boolean A12 = this.A02.A12(this.A07);
            String[] strArr = A0U;
            if (strArr[7].charAt(8) != strArr[2].charAt(8)) {
                throw new RuntimeException();
            }
            A0U[5] = "3q2LSuBAfmgZDuIIO8XYef2gzNnaMySy";
            if (A12) {
                return true;
            }
        }
        return false;
    }

    public final void A0a() {
        this.A0J.setVisibility(0);
        M3.A0L(super.A07);
        this.A0J.setVolume(super.A01.A1P().A0E().A09() ? 0.0f : 1.0f);
        this.A0J.A0b(EnumC1084Qs.A02, 20);
        if (this.A02 != null) {
            boolean z10 = this.A07;
            if (A0U[6].length() == 22) {
                throw new RuntimeException();
            }
            A0U[3] = "XEZroGEyqnXPxT1Op21Zo9PGFXXX4LGG";
            if (z10) {
                this.A02.A0x();
            }
        }
        if (this.A02 != null && !this.A0B) {
            this.A02.A0z();
        }
        A07();
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void ACz(boolean z10) {
        this.A06 = false;
        if (this.A0J.getVisibility() != 0 || this.A0J.A0j()) {
            return;
        }
        this.A05 = this.A0J.getVideoStartReason();
        this.A09 = z10;
        this.A0J.A0e(false, 13);
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void ADN(boolean z10) {
        this.A06 = true;
        if (this.A08) {
            this.A08 = false;
            A0C(this.A01);
        }
        if (this.A0J.getVisibility() != 0 || this.A0J.A0k() || this.A0C || this.A0J.getState() == EnumC1099Rh.A06 || this.A05 == null) {
            return;
        }
        if (!this.A09 || z10) {
            this.A0J.A0b(this.A05, 19);
        }
    }

    private int getCloseButtonStyle() {
        if (this.A02 != null) {
            return this.A02.getCloseButtonStyle();
        }
        return 0;
    }

    private LZ getPackageInstallListener() {
        return new C1148Te(this);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1160Tq, com.facebook.ads.redexgen.X.MS
    public final void onDestroy() {
        super.onDestroy();
        if (C0877Im.A1p(super.A03)) {
            super.A03.A0A().AHC(this.A0J);
        }
        if (this.A02 != null) {
            this.A02.A0v();
        }
        if (this.A0J != null) {
            if (!this.A0C) {
                this.A0J.A0a(EnumC1079Qn.A05);
            }
            this.A0J.getEventBus().A04(this.A0P, this.A0O, this.A0N, this.A0Q, this.A0L, this.A0M);
            this.A0J.A0V();
        }
        if (this.A0I != null) {
            this.A0I.A05();
        }
        C9S c9s = this.A0K;
        if (A0U[3].charAt(17) == 'M') {
            throw new RuntimeException();
        }
        A0U[5] = "JW7Ky8SZfj6uPXM0M3owDCnBT69Er2UJ";
        c9s.A0o();
        this.A0F.removeCallbacksAndMessages(null);
    }

    public void setServerSideRewardHandler(C1068Qc c1068Qc) {
        this.A04 = c1068Qc;
    }

    public void setVideoLeadingPlayableAdListener(QC qc2) {
        this.A03 = qc2;
    }
}
