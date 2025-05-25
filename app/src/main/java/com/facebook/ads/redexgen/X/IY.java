package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class IY {
    public static byte[] A0C;
    public static String[] A0D = {"BFYupl041rgrpPHBAL17e4amakVaJs19", "t7ZHn98FTQSdKZmdkDCbFfAfZFL04WJz", "OOn72A8bgSgJAII4XRKdcP1mTJZZMITd", "Y00rtDOLKtpzZ90qcvDeA6", "XDFvLW3bL06xBDOz9498I4batM91pn61", "4tWrkQXDix4at5XMVf", "CR24dGTUbsuTHAJzfoRGWGiXpvXt0s6u", "ycylc2SD1kh1eh0udCCSekr9NBfH0WvW"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A08;
    public final WindowManager A09;
    public final IW A0A;
    public final IX A0B;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 84);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{20, 25, 3, 0, Field.NUMCHARS, 17, 9, 33, Field.BARCODE, 56, Field.GOTOBUTTON, Field.SYMBOL, 33};
    }

    static {
        A04();
    }

    public IY() {
        this(null);
    }

    public IY(Context context) {
        if (context != null) {
            context = context.getApplicationContext();
            this.A09 = (WindowManager) context.getSystemService(A02(7, 6, 2));
        } else {
            this.A09 = null;
        }
        if (this.A09 != null) {
            this.A0A = IK.A02 >= 17 ? A01(context) : null;
            this.A0B = IX.A00();
        } else {
            this.A0A = null;
            this.A0B = null;
        }
        this.A06 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
    }

    public static long A00(long snappedAfterNs, long j10, long snappedBeforeDiff) {
        long snappedBeforeNs;
        long vsyncCount = snappedBeforeDiff * ((snappedAfterNs - j10) / snappedBeforeDiff);
        long snappedAfterDiff = j10 + vsyncCount;
        if (snappedAfterNs <= snappedAfterDiff) {
            snappedBeforeNs = snappedAfterDiff - snappedBeforeDiff;
        } else {
            snappedBeforeNs = snappedAfterDiff;
            String[] strArr = A0D;
            if (strArr[2].charAt(6) != strArr[1].charAt(6)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[6] = "RSgGKx7E1LvNImGU4MlSenI1iZojkx1y";
            strArr2[4] = "mOkLH1GNKUdbhHvlcQZOnMGTeWYD6PJS";
            snappedAfterDiff += snappedBeforeDiff;
        }
        long vsyncCount2 = snappedAfterDiff - snappedAfterNs;
        int i10 = (vsyncCount2 > (snappedAfterNs - snappedBeforeNs) ? 1 : (vsyncCount2 == (snappedAfterNs - snappedBeforeNs) ? 0 : -1));
        String[] strArr3 = A0D;
        if (strArr3[6].charAt(3) != strArr3[4].charAt(3)) {
            String[] strArr4 = A0D;
            strArr4[2] = "8eASqq8qOvmTayVh8jwUHm0gJrEDzEVn";
            strArr4[1] = "LD0Nmv8oLla5crNdFxvJscCRMlmoHgH7";
            return i10 < 0 ? snappedAfterDiff : snappedBeforeNs;
        }
        throw new RuntimeException();
    }

    private IW A01(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(A02(0, 7, 36));
        if (displayManager == null) {
            return null;
        }
        return new IW(this, displayManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        Display defaultDisplay = this.A09.getDefaultDisplay();
        if (defaultDisplay != null) {
            this.A06 = (long) (1.0E9d / defaultDisplay.getRefreshRate());
            this.A07 = (this.A06 * 80) / 100;
        }
    }

    private boolean A06(long j10, long j11) {
        long j12 = j10 - this.A04;
        long elapsedFrameTimeNs = this.A05;
        return Math.abs((j11 - elapsedFrameTimeNs) - j12) > 20000000;
    }

    public final long A07(long j10, long j11) {
        long j12 = 1000 * j10;
        long j13 = j12;
        long j14 = j11;
        if (this.A08) {
            if (j10 != this.A02) {
                this.A01++;
                this.A00 = this.A03;
            }
            int i10 = (this.A01 > 6L ? 1 : (this.A01 == 6L ? 0 : -1));
            String[] strArr = A0D;
            if (strArr[6].charAt(3) == strArr[4].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[7] = "2gygkWnthuPbjuT2hIIVeqIrs3stcVRy";
            strArr2[0] = "UsqizDZgOivAIisGc2cDeINmhgX4WJcO";
            if (i10 >= 0) {
                long j15 = this.A00 + ((j12 - this.A04) / this.A01);
                if (!A06(j15, j11)) {
                    j14 = (this.A05 + j15) - this.A04;
                    j13 = j15;
                } else {
                    this.A08 = false;
                }
            } else if (A06(j12, j11)) {
                this.A08 = false;
            }
        }
        if (!this.A08) {
            this.A04 = j12;
            this.A05 = j11;
            this.A01 = 0L;
            this.A08 = true;
        }
        this.A02 = j10;
        this.A03 = j13;
        if (this.A0B == null || this.A06 == -9223372036854775807L) {
            return j14;
        }
        long j16 = this.A0B.A04;
        if (j16 == -9223372036854775807L) {
            return j14;
        }
        return A00(j14, j16, this.A06) - this.A07;
    }

    public final void A08() {
        if (this.A09 != null) {
            if (this.A0A != null) {
                this.A0A.A01();
            }
            this.A0B.A07();
        }
    }

    public final void A09() {
        this.A08 = false;
        if (this.A09 != null) {
            this.A0B.A06();
            if (this.A0A != null) {
                this.A0A.A00();
            }
            A03();
        }
    }
}
