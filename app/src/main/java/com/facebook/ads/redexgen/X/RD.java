package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.widget.Button;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class RD extends Button {
    public static byte[] A07;
    public static String[] A08 = {"xcAgjuPXjiWMB1ssCuSZa5J", "MDq9KSsWLWIXMrqq85Bb", "5uEVnqsabDRdJRQ85jW9NMB9i", "gm0LtQz6WhkHdj5wX4JbuGG7BvRjVm91", "l1YawQMaGwDZUwnW", "7ZUqugjvimlTMP6MGoSM1hJ8SS3JK7y", "GCEj76jN8N56F9CXfv91ddVngBp", "DhtSUABtfeQAzaNHynIAsSOoxymmsGBP"};
    public String A00;
    public String A01;
    public boolean A02;
    public final Paint A03;
    public final Path A04;
    public final Path A05;
    public final Path A06;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A08[1].length() == 30) {
                throw new RuntimeException();
            }
            A08[1] = "l8iwcelfQsHaFWcAi";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 44);
            i13++;
        }
    }

    public static void A02() {
        A07 = new byte[]{19, 34, Field.AUTONUM, 48, Field.ASK, 18, Field.DDEAUTO, Field.QUOTE, 59};
    }

    static {
        A02();
    }

    public RD(C1314Zs c1314Zs) {
        this(c1314Zs, false);
    }

    public RD(C1314Zs c1314Zs, boolean z10) {
        super(c1314Zs);
        this.A02 = false;
        this.A01 = A00(5, 4, 110);
        this.A00 = A00(0, 5, 111);
        this.A04 = new Path();
        this.A05 = new Path();
        this.A06 = new Path();
        this.A03 = new RC(this, z10);
        A01();
        setClickable(true);
        M3.A0M(this, 0);
    }

    private void A01() {
        setContentDescription(this.A02 ? this.A01 : this.A00);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT < 17) {
            setLayerType(1, null);
        }
        float max = Math.max(canvas.getWidth(), canvas.getHeight()) / 100.0f;
        if (this.A02) {
            this.A06.rewind();
            float scaleFactor = max * 26.5f;
            float designedSize = max * 15.5f;
            this.A06.moveTo(scaleFactor, designedSize);
            float scaleFactor2 = max * 26.5f;
            float designedSize2 = 84.5f * max;
            this.A06.lineTo(scaleFactor2, designedSize2);
            float scaleFactor3 = 90.0f * max;
            float designedSize3 = 50.0f * max;
            this.A06.lineTo(scaleFactor3, designedSize3);
            this.A06.lineTo(26.5f * max, 15.5f * max);
            this.A06.close();
            canvas.drawPath(this.A06, this.A03);
        } else {
            this.A04.rewind();
            float scaleFactor4 = max * 29.0f;
            float designedSize4 = max * 21.0f;
            this.A04.moveTo(scaleFactor4, designedSize4);
            float scaleFactor5 = max * 29.0f;
            float designedSize5 = max * 79.0f;
            this.A04.lineTo(scaleFactor5, designedSize5);
            float scaleFactor6 = max * 45.0f;
            float designedSize6 = max * 79.0f;
            this.A04.lineTo(scaleFactor6, designedSize6);
            float designedSize7 = max * 21.0f;
            this.A04.lineTo(45.0f * max, designedSize7);
            float designedSize8 = max * 21.0f;
            this.A04.lineTo(29.0f * max, designedSize8);
            this.A04.close();
            this.A05.rewind();
            float scaleFactor7 = max * 55.0f;
            float designedSize9 = max * 21.0f;
            this.A05.moveTo(scaleFactor7, designedSize9);
            float scaleFactor8 = max * 55.0f;
            float designedSize10 = max * 79.0f;
            this.A05.lineTo(scaleFactor8, designedSize10);
            float designedSize11 = max * 71.0f;
            this.A05.lineTo(designedSize11, 79.0f * max);
            float designedSize12 = max * 21.0f;
            this.A05.lineTo(71.0f * max, designedSize12);
            this.A05.lineTo(55.0f * max, 21.0f * max);
            this.A05.close();
            canvas.drawPath(this.A04, this.A03);
            canvas.drawPath(this.A05, this.A03);
        }
        super.onDraw(canvas);
    }

    public void setChecked(boolean z10) {
        this.A02 = z10;
        A01();
        refreshDrawableState();
        invalidate();
    }

    public void setPauseAccessibilityLabel(String str) {
        if (str != null) {
            this.A00 = str;
            A01();
        }
    }

    public void setPlayAccessibilityLabel(String str) {
        if (str != null) {
            this.A01 = str;
            A01();
        }
    }
}
