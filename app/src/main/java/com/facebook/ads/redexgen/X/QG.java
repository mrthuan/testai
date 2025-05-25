package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class QG implements InterfaceC1085Qt {
    public static String[] A0C = {"2ZSu0wXuDbQnaud22BC", "QCmSLF", "fQxhtf", "E3sU0uCnWEnB3ZcSzOkvj4xNFgaNSXPe", "Ye0yKWwaCEsRuR61siA7kBVWrkv2bkox", "1q930HE08Ni0sTckStF", "wfAs2pJjw0biCEJKLi3nGPcNksloIp8Y", "ZBBhRoR6L"};
    public T7 A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AbstractC1121Sd A07 = new AbstractC1121Sd() { // from class: com.facebook.ads.redexgen.X.9N
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.AbstractC06488x
        /* renamed from: A00 */
        public final void A03(C9P c9p) {
            Handler handler;
            boolean A0D;
            handler = QG.this.A05;
            handler.removeCallbacksAndMessages(null);
            A0D = QG.this.A0D(RE.A04);
            if (A0D) {
                QG.this.A03();
                QG.this.A06(true, false);
            }
            QG.this.A03 = true;
        }
    };
    public final AbstractC1127Sj A06 = new AbstractC1127Sj() { // from class: com.facebook.ads.redexgen.X.9M
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.AbstractC06488x
        /* renamed from: A00 */
        public final void A03(C9R c9r) {
            QG.this.A03();
            QG.this.A06(false, false);
            QG.this.A03 = true;
        }
    };
    public final AbstractC1105Rn A08 = new C9K(this);
    public final R8 A09 = new R8() { // from class: com.facebook.ads.redexgen.X.9D
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.AbstractC06488x
        /* renamed from: A00 */
        public final void A03(C9O c9o) {
            boolean z10;
            boolean A0D;
            z10 = QG.this.A02;
            if (z10) {
                return;
            }
            A0D = QG.this.A0D(RE.A04);
            if (!A0D) {
                return;
            }
            QG.this.A03();
            QG.this.A06(true, false);
        }
    };
    public final AbstractC1089Qx A0A = new AnonymousClass98(this);
    public final Handler A05 = new Handler();
    public final List<RF> A0B = new ArrayList();
    public int A00 = AdError.SERVER_ERROR_CODE;

    public QG(boolean z10) {
        this.A02 = z10;
    }

    public static /* synthetic */ int A00(QG qg2) {
        return qg2.A00;
    }

    public static /* synthetic */ Handler A01(QG qg2) {
        return qg2.A05;
    }

    public void A03() {
        this.A05.removeCallbacksAndMessages(null);
        Iterator<RF> it = this.A0B.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0C[7].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[6] = "Y40dGjVL9Zscw9FMyiKWKh6z3JvZ0T5u";
            strArr[4] = "hO4VpYUkDoigTR3nwiJ8PFOPPoG0N1QG";
            if (hasNext) {
                it.next().cancel();
            } else {
                return;
            }
        }
    }

    public static /* synthetic */ void A04(QG qg2) {
        qg2.A03();
    }

    public static /* synthetic */ void A05(QG qg2, boolean z10, boolean z11) {
        qg2.A06(z10, z11);
    }

    public void A06(boolean z10, boolean z11) {
        for (RF rf2 : this.A0B) {
            rf2.A3u(z10, z11);
        }
    }

    public static /* synthetic */ boolean A07(QG qg2) {
        return qg2.A03;
    }

    public static /* synthetic */ boolean A08(QG qg2) {
        return qg2.A02;
    }

    public static /* synthetic */ boolean A09(QG qg2) {
        return qg2.A04;
    }

    public static /* synthetic */ boolean A0A(QG qg2, RE re2) {
        return qg2.A0D(re2);
    }

    public static /* synthetic */ boolean A0B(QG qg2, boolean z10) {
        qg2.A03 = z10;
        return z10;
    }

    public static /* synthetic */ boolean A0C(QG qg2, boolean z10) {
        qg2.A04 = z10;
        return z10;
    }

    public boolean A0D(RE re2) {
        for (RF rf2 : this.A0B) {
            if (rf2.A8Q() != re2) {
                return false;
            }
        }
        return true;
    }

    public final void A0E() {
        this.A0B.clear();
    }

    public final void A0F() {
        if (this.A02) {
            this.A05.removeCallbacksAndMessages(null);
            this.A02 = false;
        }
    }

    public final void A0G() {
        this.A04 = true;
        this.A03 = true;
        A06(false, false);
    }

    public final void A0H(int i10) {
        this.A00 = i10;
    }

    public final void A0I(RF rf2) {
        this.A0B.add(rf2);
    }

    public final boolean A0J() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1085Qt
    public final void A9r(T7 t72) {
        this.A01 = t72;
        t72.getEventBus().A03(this.A07, this.A0A, this.A08, this.A09, this.A06);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1085Qt
    public final void AHD(T7 t72) {
        A03();
        t72.getEventBus().A04(this.A06, this.A0A, this.A08, this.A09, this.A07);
        this.A01 = null;
    }
}
