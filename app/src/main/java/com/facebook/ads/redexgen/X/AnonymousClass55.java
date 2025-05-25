package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.facebook.ads.AdError;
import com.google.android.gms.common.api.Api;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Arrays;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.55  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass55 implements Runnable {
    public static byte[] A07;
    public static String[] A08 = {"YAUr0vF6CX8YQIb3U2BTwiKsPx4egdml", "mCzYZBoaiKXOzjUHkKBQEDESozpM1xd6", "icS38dGHdjVFjizVfUSTymHnsbTrfSoO", "cz24QPO5JMZmQB4F0QhCndjSq8meDVtx", "FtYcbE5Uq8HUJyIzKb3J4QjvmALEd3tS", "OczTw8YbFDCs0vVm57WwAmFlfg0gTpir", "toWNn3QT1tQgvY3MKWHjSENw", "YozzgSFsuZbL3IkC1bDOEp8MFgumFV8x"};
    public OverScroller A01;
    public int A02;
    public int A03;
    public final /* synthetic */ FL A06;
    public Interpolator A00 = FL.A1A;
    public boolean A04 = false;
    public boolean A05 = false;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = copyOfRange[i13];
            if (A08[6].length() == 25) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[1] = "lXzWc938MQZaj6BgS1Y9BEfSDAuAR6qF";
            strArr[5] = "B8zmNNge3ag7Hwi7A1PWi4fqxiL6HNqU";
            copyOfRange[i13] = (byte) ((b10 - i12) - 123);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {64, Field.INCLUDETEXT, 14, Field.SECTION, Field.ADDIN, 96, Field.ADDRESSBLOCK, Field.LISTNUM, Field.LISTNUM};
        String[] strArr = A08;
        if (strArr[1].charAt(2) != strArr[5].charAt(2)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[7] = "TeOjcoFpg61NRcWtZ7RqEgvJb0vCzhPX";
        strArr2[0] = "wzSzDJFWC0w6xe3VuPJPH24U0YXOvF2u";
        A07 = bArr;
    }

    static {
        A03();
    }

    public AnonymousClass55(FL fl2) {
        this.A06 = fl2;
        this.A01 = new OverScroller(fl2.getContext(), FL.A1A);
    }

    private float A00(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private int A01(int i10, int i11, int i12, int i13) {
        int absDx;
        int containerSize = Math.abs(i10);
        int delta = Math.abs(i11);
        int duration = containerSize > delta ? 1 : 0;
        int halfContainerSize = (int) Math.sqrt((i12 * i12) + (i13 * i13));
        int absDx2 = (int) Math.sqrt((i10 * i10) + (i11 * i11));
        FL fl2 = this.A06;
        int width = duration != 0 ? fl2.getWidth() : fl2.getHeight();
        int velocity = width / 2;
        float A00 = velocity + (velocity * A00(Math.min(1.0f, (absDx2 * 1.0f) / width)));
        if (halfContainerSize > 0) {
            absDx = Math.round(Math.abs(A00 / halfContainerSize) * 1000.0f) * 4;
        } else {
            if (duration == 0) {
                containerSize = delta;
            }
            absDx = (int) (((containerSize / width) + 1.0f) * 300.0f);
        }
        int min = Math.min(absDx, (int) AdError.SERVER_ERROR_CODE);
        int absDx3 = A08[2].charAt(23);
        if (absDx3 != 110) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[7] = "0orcdyFTKXkoGK9yWPRw9CMcRo5SNB9j";
        strArr[0] = "sq5WBRFpbSiYOu42pzh1wsqhDGiHcevd";
        return min;
    }

    private final void A04() {
        this.A05 = false;
        this.A04 = true;
    }

    private final void A05() {
        this.A04 = false;
        if (this.A05) {
            A07();
        }
    }

    private final void A06(int i10, int i11, int i12, int i13) {
        A0B(i10, i11, A01(i10, i11, i12, i13));
    }

    public final void A07() {
        if (this.A04) {
            this.A05 = true;
            return;
        }
        this.A06.removeCallbacks(this);
        C3T.A0D(this.A06, this);
    }

    public final void A08() {
        this.A06.removeCallbacks(this);
        this.A01.abortAnimation();
    }

    public final void A09(int i10, int i11) {
        this.A06.setScrollState(2);
        this.A03 = 0;
        this.A02 = 0;
        this.A01.fling(0, 0, i10, i11, SlideAtom.USES_MASTER_SLIDE_ID, Api.BaseClientBuilder.API_PRIORITY_OTHER, SlideAtom.USES_MASTER_SLIDE_ID, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        A07();
    }

    public final void A0A(int i10, int i11) {
        A06(i10, i11, 0, 0);
    }

    public final void A0B(int i10, int i11, int i12) {
        A0C(i10, i11, i12, FL.A1A);
    }

    public final void A0C(int i10, int i11, int i12, Interpolator interpolator) {
        if (this.A00 != interpolator) {
            this.A00 = interpolator;
            this.A01 = new OverScroller(this.A06.getContext(), interpolator);
        }
        this.A06.setScrollState(2);
        this.A03 = 0;
        this.A02 = 0;
        this.A01.startScroll(0, 0, i10, i11, i12);
        if (Build.VERSION.SDK_INT < 23) {
            OverScroller overScroller = this.A01;
            if (A08[2].charAt(23) != 'n') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[1] = "88zIldbbkktihn9hTQ4sgRWvKPoy0Har";
            strArr[5] = "wazVAycqzf9kUc8ZZnvbPZ6jaLgaodB2";
            overScroller.computeScrollOffset();
        }
        A07();
    }

    public final void A0D(int i10, int i11, Interpolator interpolator) {
        int A01 = A01(i10, i11, 0, 0);
        if (interpolator == null) {
            interpolator = FL.A1A;
        }
        A0C(i10, i11, A01, interpolator);
        if (A08[6].length() == 25) {
            throw new RuntimeException();
        }
        A08[3] = "4ylqCkbib8Hqjgb9G4JU7JWl2ANwoVnp";
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr;
        boolean awakenScrollBars;
        boolean z10;
        if (this.A06.A06 == null) {
            A08();
            return;
        }
        A04();
        this.A06.A1I();
        OverScroller overScroller = this.A01;
        AnonymousClass51 anonymousClass51 = this.A06.A06.A02;
        if (overScroller.computeScrollOffset()) {
            iArr = this.A06.A16;
            int overscrollX = overScroller.getCurrX();
            int velY = overScroller.getCurrY();
            int vresult = overscrollX - this.A02;
            int velX = velY - this.A03;
            int i10 = 0;
            int i11 = 0;
            this.A02 = overscrollX;
            this.A03 = velY;
            int i12 = 0;
            int i13 = 0;
            if (this.A06.A1u(vresult, velX, iArr, null, 1)) {
                vresult -= iArr[0];
                velX -= iArr[1];
            }
            if (this.A06.A04 != null) {
                this.A06.A1J();
                this.A06.A1K();
                AbstractC04992q.A01(A02(0, 9, 115));
                FL fl2 = this.A06;
                AnonymousClass53 anonymousClass53 = this.A06.A0s;
                String[] strArr = A08;
                if (strArr[7].charAt(6) != strArr[0].charAt(6)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[1] = "nozOsXlmQMzJhvkopjwZaheFFVNTeY58";
                strArr2[5] = "LtzfvJebeScyRtmgs1USyUey2pVvSmq5";
                fl2.A1h(anonymousClass53);
                if (vresult != 0) {
                    AbstractC05484o abstractC05484o = this.A06.A06;
                    C05554w c05554w = this.A06.A0r;
                    FL fl3 = this.A06;
                    if (A08[4].charAt(19) != '9') {
                        A08[4] = "aF9lT9JucYAVgVWisB0rNkK4be7J2iGb";
                        i10 = abstractC05484o.A1d(vresult, c05554w, fl3.A0s);
                        i12 = vresult - i10;
                    } else {
                        i10 = abstractC05484o.A1d(vresult, c05554w, fl3.A0s);
                        i12 = vresult - i10;
                    }
                }
                if (velX != 0) {
                    AbstractC05484o abstractC05484o2 = this.A06.A06;
                    C05554w c05554w2 = this.A06.A0r;
                    if (A08[4].charAt(19) != 57) {
                        String[] strArr3 = A08;
                        strArr3[7] = "UcFH7yF8zZNprQitZtXhkmlCMHIdnioP";
                        strArr3[0] = "hCBROqFKcvdbLIHuO2wEis8Nwj1iktft";
                        i11 = abstractC05484o2.A1e(velX, c05554w2, this.A06.A0s);
                        i13 = velX - i11;
                    } else {
                        i11 = abstractC05484o2.A1e(velX, c05554w2, this.A06.A0s);
                        i13 = velX - i11;
                    }
                }
                AbstractC04992q.A00();
                this.A06.A1O();
                this.A06.A1L();
                this.A06.A1n(false);
                if (anonymousClass51 != null && !anonymousClass51.A0E() && anonymousClass51.A0F()) {
                    int x4 = this.A06.A0s.A03();
                    if (x4 == 0) {
                        anonymousClass51.A09();
                    } else if (anonymousClass51.A07() >= x4) {
                        anonymousClass51.A0A(x4 - 1);
                        anonymousClass51.A04(vresult - i12, velX - i13);
                    } else {
                        int y10 = vresult - i12;
                        if (A08[4].charAt(19) != 57) {
                            String[] strArr4 = A08;
                            strArr4[1] = "2vzJUgZGYJyf60lr7OoRSSfYHAbPRQwN";
                            strArr4[5] = "FZzkKBCO3vggmWhfitA4hZZwekV7eOzC";
                            anonymousClass51.A04(y10, velX - i13);
                        } else {
                            anonymousClass51.A04(y10, velX - i13);
                        }
                    }
                }
            }
            if (!this.A06.A0v.isEmpty()) {
                this.A06.invalidate();
            }
            if (this.A06.getOverScrollMode() != 2) {
                FL fl4 = this.A06;
                String[] strArr5 = A08;
                if (strArr5[7].charAt(6) != strArr5[0].charAt(6)) {
                    throw new RuntimeException();
                }
                A08[6] = OperatorName.NON_STROKING_CMYK;
                fl4.A1Z(vresult, velX);
            }
            int dy = i10;
            int hresult = i11;
            if (!this.A06.A1t(dy, hresult, i12, i13, null, 1) && (i12 != 0 || i13 != 0)) {
                int x10 = (int) overScroller.getCurrVelocity();
                int dx = 0;
                if (i12 != overscrollX) {
                    if (i12 < 0) {
                        dx = -x10;
                    } else {
                        dx = i12 > 0 ? x10 : 0;
                    }
                }
                if (i13 != velY) {
                    if (i13 < 0) {
                        x10 = -x10;
                    } else if (i13 <= 0) {
                        x10 = 0;
                    }
                } else {
                    x10 = 0;
                }
                if (this.A06.getOverScrollMode() != 2) {
                    this.A06.A1Y(dx, x10);
                }
                if ((dx != 0 || i12 == overscrollX || overScroller.getFinalX() == 0) && (x10 != 0 || i13 == velY || overScroller.getFinalY() == 0)) {
                    overScroller.abortAnimation();
                }
            }
            if (i10 != 0 || i11 != 0) {
                FL fl5 = this.A06;
                if (A08[6].length() != 25) {
                    A08[3] = "MhQkdHLAPY6K0mrvY0I8ZqPtgRA1J8Gx";
                    fl5.A1b(i10, i11);
                } else {
                    A08[6] = "5ZFiatMajPEhKsDar8BqfzNMKoQTJ";
                    fl5.A1b(i10, i11);
                }
            }
            awakenScrollBars = this.A06.awakenScrollBars();
            if (!awakenScrollBars) {
                this.A06.invalidate();
            }
            boolean z11 = (vresult == 0 && velX == 0) || (vresult != 0 && this.A06.A06.A20() && i10 == vresult) || (velX != 0 && this.A06.A06.A21() && i11 == velX);
            if (overScroller.isFinished() || (!z11 && !this.A06.A1r(1))) {
                this.A06.setScrollState(0);
                z10 = FL.A1E;
                if (z10) {
                    this.A06.A02.A02();
                }
                this.A06.A1X(1);
            } else {
                A07();
                if (this.A06.A03 != null) {
                    this.A06.A03.A0B(this.A06, vresult, velX);
                }
            }
        }
        if (anonymousClass51 != null) {
            if (anonymousClass51.A0E()) {
                anonymousClass51.A04(0, 0);
            }
            if (!this.A05) {
                anonymousClass51.A09();
            }
        }
        A05();
    }
}
