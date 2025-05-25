package com.facebook.ads.redexgen.X;

import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import java.util.Arrays;
import lib.zj.office.fc.hpsf.Constants;

/* loaded from: assets/audience_network.dex */
public final class N5 extends RelativeLayout implements InterfaceC1085Qt {
    public static byte[] A08;
    public static String[] A09 = {"QrML4Ecz92sfYCeCtaSnFCosFmipGlTz", "VhmrcYjsqpOA7Iy", "ZK9HRS350jRidth", "ZjYoflRzQYTDfI0m0JAvuVl9vp7GlkSu", "MmC", "ZvQ3uBw3DQ7M1xesozkO3pU9", "XD5i8EmzP8U96tjWoOsk6YaJBmNCgDM7", "cjtQcAKtxYCLU"};
    public static final int A0A;
    public int A00;
    public ObjectAnimator A01;
    public ProgressBar A02;
    public AbstractC06488x A03;
    public AbstractC06488x A04;
    public AbstractC06488x A05;
    public AbstractC06488x A06;
    public T7 A07;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 83);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        String[] strArr = A09;
        if (strArr[0].charAt(7) != strArr[6].charAt(7)) {
            throw new RuntimeException();
        }
        A09[4] = "F3xM2b87YXaGRbor1WnSFNsn05JfW";
        A08 = new byte[]{-5, -3, -6, -14, -3, -16, -2, -2};
    }

    static {
        A03();
        A0A = (int) (LP.A02 * 6.0f);
    }

    public N5(C1314Zs c1314Zs) {
        this(c1314Zs, A0A, -12549889, 0);
    }

    public N5(C1314Zs c1314Zs, int i10, int i11, int i12) {
        super(c1314Zs);
        this.A00 = -1;
        this.A06 = new R8() { // from class: com.facebook.ads.redexgen.X.7F
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC06488x
            /* renamed from: A00 */
            public final void A03(C9O c9o) {
                T7 t72;
                t72 = N5.this.A07;
                if (t72 != null) {
                    N5.this.A07(true);
                }
            }
        };
        this.A04 = new AbstractC1121Sd() { // from class: com.facebook.ads.redexgen.X.7E
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC06488x
            /* renamed from: A00 */
            public final void A03(C9P c9p) {
                N5.this.A02();
            }
        };
        this.A05 = new AbstractC1105Rn() { // from class: com.facebook.ads.redexgen.X.7D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC06488x
            /* renamed from: A00 */
            public final void A03(SZ sz) {
                T7 t72;
                t72 = N5.this.A07;
                if (t72 != null) {
                    N5.this.A07(true);
                }
            }
        };
        this.A03 = new AbstractC1127Sj() { // from class: com.facebook.ads.redexgen.X.7C
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC06488x
            /* renamed from: A00 */
            public final void A03(C9R c9r) {
                T7 t72;
                t72 = N5.this.A07;
                if (t72 != null) {
                    N5.this.A05();
                }
            }
        };
        this.A02 = new ProgressBar(c1314Zs, null, 16842872);
        A06(i11, i12);
        this.A02.setMax(Constants.CP_MAC_ROMAN);
        addView(this.A02, new RelativeLayout.LayoutParams(-1, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        if (this.A01 != null) {
            this.A01.cancel();
            this.A01.setTarget(null);
            this.A01 = null;
            this.A02.clearAnimation();
        }
    }

    public final void A05() {
        A02();
        this.A01 = ObjectAnimator.ofInt(this.A02, A01(0, 8, 56), 0, 0);
        this.A01.setDuration(0L);
        this.A01.setInterpolator(new LinearInterpolator());
        this.A01.start();
        this.A00 = -1;
    }

    public final void A06(int i10, int i11) {
        ColorDrawable colorDrawable = new ColorDrawable(i11);
        ColorDrawable colorDrawable2 = new ColorDrawable(i11);
        Drawable secProgressDr = new ScaleDrawable(new ColorDrawable(i10), 8388611, 1.0f, -1.0f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{colorDrawable, colorDrawable2, secProgressDr});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        this.A02.setProgressDrawable(layerDrawable);
    }

    public final void A07(boolean z10) {
        if (this.A07 == null) {
            return;
        }
        A02();
        int currentPositionInMillis = this.A07.getCurrentPositionInMillis();
        int duration = this.A07.getDuration();
        int i10 = duration > 0 ? (currentPositionInMillis * Constants.CP_MAC_ROMAN) / duration : 0;
        int position = this.A00;
        if (position >= i10 || duration <= currentPositionInMillis) {
            return;
        }
        if (z10) {
            ProgressBar progressBar = this.A02;
            int position2 = this.A00;
            this.A01 = ObjectAnimator.ofInt(progressBar, A01(0, 8, 56), position2, i10);
            ObjectAnimator objectAnimator = this.A01;
            int position3 = Math.min(250, duration - currentPositionInMillis);
            objectAnimator.setDuration(position3);
            this.A01.setInterpolator(new LinearInterpolator());
            this.A01.start();
        } else {
            this.A02.setProgress(i10);
        }
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1085Qt
    public final void A9r(T7 t72) {
        this.A07 = t72;
        t72.getEventBus().A03(this.A04, this.A05, this.A06, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1085Qt
    public final void AHD(T7 t72) {
        t72.getEventBus().A04(this.A06, this.A05, this.A04, this.A03);
        this.A07 = null;
    }
}
