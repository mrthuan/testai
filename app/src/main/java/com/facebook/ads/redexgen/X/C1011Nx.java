package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.ImageView;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Nx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1011Nx extends ImageView implements InterfaceC1085Qt {
    public static byte[] A06;
    public static String[] A07 = {"aghB38UhEEJpk0kXnwVgQHJdsNEW", "Z42NiOwJIVHIw0Yvb2zaIIHOyWtQtdjq", "3gFse8uXyFGORzgMyq8kaPi65dxCnZzv", "Jw8apcEAXkOZ3AQdkmgk3jwFJH7gSyWz", "3SkqDykKznuf11rk6OObVQ9S0DbCfrGf", "LUP6WVZdZh28wzzt0Y5b2oxyslCE6YSF", "OrWA41O07SU0jmvClar47c0fhMdTsOQM", "iv"};
    public static final int A08;
    public static final int A09;
    public T7 A00;
    public final Paint A01;
    public final RectF A02;
    public final C1314Zs A03;
    public final JF A04;
    public final AbstractC1071Qf A05;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A07[2].charAt(1) == 'n') {
                throw new RuntimeException();
            }
            A07[4] = "46k42TMmXNLOzm12QaWH4fref2fTAqwO";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 73);
            i13++;
        }
    }

    public static void A06() {
        A06 = new byte[]{44, 20, 21, 4, Field.SECTION, 32, 5};
    }

    static {
        A06();
        A09 = (int) (LP.A02 * 4.0f);
        A08 = (int) (LP.A02 * 6.0f);
    }

    public C1011Nx(C1314Zs c1314Zs, JF jf2) {
        this(c1314Zs, jf2, false);
    }

    public C1011Nx(C1314Zs c1314Zs, JF jf2, boolean z10) {
        super(c1314Zs);
        this.A05 = new AbstractC1071Qf() { // from class: com.facebook.ads.redexgen.X.7W
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC06488x
            /* renamed from: A00 */
            public final void A03(C1088Qw c1088Qw) {
                C1011Nx.this.A09();
            }
        };
        this.A04 = jf2;
        this.A03 = c1314Zs;
        if (z10) {
            this.A02 = new RectF();
        } else {
            this.A02 = null;
        }
        this.A01 = new Paint();
        this.A01.setColor(-1728053248);
        setColorFilter(-1);
        setPadding(A09, A09, A09, A09);
        setContentDescription(A03(0, 7, 40));
        A05();
        setOnClickListener(new R7(this));
    }

    private void A04() {
        setImageBitmap(MC.A01(MB.SOUND_OFF));
    }

    private void A05() {
        setImageBitmap(MC.A01(MB.SOUND_ON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A07() {
        return this.A00 != null && this.A00.getVolume() == 0.0f;
    }

    public final void A09() {
        if (this.A00 == null) {
            return;
        }
        if (A07()) {
            A04();
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1085Qt
    public final void A9r(T7 t72) {
        this.A00 = t72;
        if (this.A00 != null) {
            this.A00.getEventBus().A05(this.A05);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1085Qt
    public final void AHD(T7 t72) {
        if (this.A00 != null) {
            this.A00.getEventBus().A06(this.A05);
        }
        this.A00 = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        int x4 = getHeight();
        int y10 = x4 / 2;
        if (this.A02 != null) {
            RectF rectF = this.A02;
            int x10 = getWidth();
            float f10 = x10;
            int x11 = getHeight();
            rectF.set(0.0f, 0.0f, f10, x11);
            RectF rectF2 = this.A02;
            int x12 = A08;
            float f11 = x12;
            if (A07[3].charAt(1) == 84) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[5] = "zT7YbptMnSmKw0M5I4XTvaxbvvVXxWiN";
            strArr[1] = "NI8lQWe2kpQIwBdYvxwMMOMmXOv2vWWW";
            int x13 = A08;
            canvas.drawRoundRect(rectF2, f11, x13, this.A01);
        } else {
            int x14 = Math.min(width, y10);
            canvas.drawCircle(width, y10, x14, this.A01);
        }
        super.onDraw(canvas);
    }

    public void setBackgroundPaintColor(int i10) {
        this.A01.setColor(i10);
    }
}
