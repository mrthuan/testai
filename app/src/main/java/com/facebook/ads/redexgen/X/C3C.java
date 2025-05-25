package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* renamed from: com.facebook.ads.redexgen.X.3C  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3C extends C3P implements QH {
    public static byte[] A07;
    public static String[] A08 = {"J7yX0QGw9CwhbXJlOgK1AZPNtt2UF0On", "oXMSY1TARkqssgt6s8jHvILUEU9", "ivvOLLZvAzFcQQYEM", "46hEJr0dkjUa2YxjnqHHZtVzHBYgDtfX", "qOyhICr4SrTKnx9gG6JsVKrXp45uLK", "kbgvhlczlSdLn8qANYfrfCagYhnCySOb", "Z6RoLzaVoBLmlhzvAeWOPUTl5laN13sF", "YB9cTMd7bVO"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public InterfaceC0963Mb A04;
    public boolean A05;
    public final CD A06;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 46);
            if (A08[0].charAt(21) != 'Z') {
                throw new RuntimeException();
            }
            A08[3] = "76s3uTgYoGqvxE8PFJZmOuk3NB8C1jhQ";
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-68, -69, -99, -82, -76, -78, -112, -75, -82, -69, -76, -78, -79};
    }

    static {
        A03();
    }

    public C3C(C1314Zs c1314Zs) {
        super(c1314Zs);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new CD(c1314Zs, new QE(), new QD());
        A02();
    }

    public C3C(C1314Zs c1314Zs, AttributeSet attributeSet) {
        super(c1314Zs, attributeSet);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new CD(c1314Zs, new QE(), new QD());
        A02();
    }

    public C3C(C1314Zs c1314Zs, AttributeSet attributeSet, int i10) {
        super(c1314Zs, attributeSet, i10);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new CD(c1314Zs, new QE(), new QD());
        A02();
    }

    private int A00(int i10) {
        int i11 = this.A00 * 2;
        int measuredWidth = getMeasuredWidth();
        int spacing = getPaddingLeft();
        int i12 = (measuredWidth - spacing) - i11;
        int itemSize = getAdapter().A0E();
        int numFullItems = 0;
        int spacing2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        while (spacing2 > i10) {
            numFullItems++;
            if (numFullItems >= itemSize) {
                return i10;
            }
            int spacing3 = numFullItems * i11;
            spacing2 = (int) ((i12 - spacing3) / (numFullItems + 0.333f));
        }
        return spacing2;
    }

    private void A02() {
        this.A06.A2A(0);
        setLayoutManager(this.A06);
        setSaveEnabled(false);
        setSnapDelegate(this);
        M3.A0K(this);
    }

    private void A04(int i10, int i11) {
        if (i10 == this.A03 && i11 == this.A02) {
            return;
        }
        this.A03 = i10;
        this.A02 = i11;
        if (A08[3].charAt(25) != 'B') {
            throw new RuntimeException();
        }
        A08[2] = "arB2ao";
        if (0 != 0) {
            throw new NullPointerException(A01(0, 13, 31));
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3P
    public final void A1y(int i10, boolean z10) {
        super.A1y(i10, z10);
        A04(i10, 0);
    }

    @Override // com.facebook.ads.redexgen.X.QH
    public final int A87(int i10) {
        int abs = Math.abs(i10);
        int scrollXAbs = ((C3P) this).A06;
        if (abs <= scrollXAbs) {
            return 0;
        }
        int scrollXAbs2 = this.A01;
        if (scrollXAbs2 == 0) {
            return 1;
        }
        int scrollXAbs3 = this.A01;
        return 1 + (abs / scrollXAbs3);
    }

    public int getChildSpacing() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.FL, android.view.View
    public final void onMeasure(int i10, int i11) {
        int height;
        int itemSize;
        super.onMeasure(i10, i11);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.A05) {
            int i12 = (int) LP.A02;
            int verticalPadding = C0877Im.A0F(getContext());
            height = (i12 * verticalPadding) + paddingTop;
        } else {
            int verticalPadding2 = getMeasuredWidth();
            height = Math.round(verticalPadding2 / 1.91f);
        }
        int verticalPadding3 = View.MeasureSpec.getMode(i11);
        switch (verticalPadding3) {
            case SlideAtom.USES_MASTER_SLIDE_ID /* -2147483648 */:
                int verticalPadding4 = View.MeasureSpec.getSize(i11);
                height = Math.min(verticalPadding4, height);
                break;
            case 1073741824:
                height = View.MeasureSpec.getSize(i11);
                break;
        }
        int height2 = height - paddingTop;
        if (this.A05) {
            int verticalPadding5 = MX.A09;
            itemSize = Math.min(verticalPadding5, height2);
        } else {
            itemSize = A00(height2);
        }
        int height3 = getMeasuredWidth();
        int verticalPadding6 = itemSize + paddingTop;
        setMeasuredDimension(height3, verticalPadding6);
        if (!this.A05) {
            int verticalPadding7 = this.A00;
            setChildWidth((verticalPadding7 * 2) + itemSize);
        }
    }

    @Override // com.facebook.ads.redexgen.X.FL
    public void setAdapter(AbstractC05364c abstractC05364c) {
        this.A06.A2H(abstractC05364c == null ? -1 : abstractC05364c.hashCode());
        super.setAdapter(abstractC05364c);
    }

    public void setChildSpacing(int i10) {
        this.A00 = i10;
    }

    public void setChildWidth(int i10) {
        this.A01 = i10;
        int measuredWidth = getMeasuredWidth();
        int pageWidth = getPaddingLeft();
        int i11 = measuredWidth - pageWidth;
        int pageWidth2 = getPaddingRight();
        int i12 = i11 - pageWidth2;
        CD cd2 = this.A06;
        int pageWidth3 = this.A01;
        cd2.A2I((i12 - pageWidth3) / 2);
        CD cd3 = this.A06;
        int pageWidth4 = this.A01;
        cd3.A2G(pageWidth4 / measuredWidth);
    }

    public void setCurrentPosition(int i10) {
        A1y(i10, false);
    }

    public void setOnPageChangedListener(InterfaceC0963Mb interfaceC0963Mb) {
        this.A04 = interfaceC0963Mb;
    }

    public void setShowTextInCarousel(boolean z10) {
        this.A05 = z10;
    }
}
