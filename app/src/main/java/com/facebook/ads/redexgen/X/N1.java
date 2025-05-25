package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.adjust.sdk.network.ErrorCodes;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: assets/audience_network.dex */
public final class N1 extends LinearLayout {
    public static final int A08 = (int) (LP.A02 * 15.0f);
    public static final int A09 = (int) (LP.A02 * 10.0f);
    public static final int A0A = (int) (LP.A02 * 44.0f);
    public int A00;
    public boolean A01;
    public boolean A02;
    public final ImageView A03;
    public final LinearLayout A04;
    public final TextView A05;
    public final C1314Zs A06;
    public final OJ A07;

    public N1(C1314Zs c1314Zs, int i10, boolean z10) {
        super(c1314Zs);
        this.A01 = false;
        this.A06 = c1314Zs;
        this.A02 = z10;
        this.A03 = new ImageView(c1314Zs);
        this.A03.setPadding(A09, A09, A09, A09);
        this.A07 = new OJ(c1314Zs, this.A02);
        this.A07.setProgress(0.0f);
        this.A07.setPadding(A09, A09, A09, A09);
        this.A05 = new TextView(c1314Zs);
        setOrientation(0);
        this.A04 = new LinearLayout(c1314Zs);
        this.A00 = i10;
        A00();
    }

    private void A00() {
        setToolbarActionMode(this.A00);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(A0A, A0A);
        M3.A0Y(this.A05, true, 16);
        this.A05.setTextColor(-1);
        this.A05.setVisibility(8);
        this.A04.addView(this.A03, layoutParams2);
        this.A04.addView(this.A07, layoutParams2);
        addView(this.A04, layoutParams);
        LinearLayout.LayoutParams actionTextLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        actionTextLayoutParams.gravity = 17;
        addView(this.A05, actionTextLayoutParams);
    }

    private void A01() {
        int i10;
        OJ oj2 = this.A07;
        int i11 = 8;
        if (this.A00 == 2 || this.A00 == 6) {
            i10 = this.A01 ? 4 : 0;
        } else {
            i10 = 8;
        }
        oj2.setVisibility(i10);
        ImageView imageView = this.A03;
        if (this.A00 == 5) {
            i11 = 4;
        } else if (this.A00 != 2 && this.A00 != 6) {
            i11 = 0;
        }
        imageView.setVisibility(i11);
    }

    public final void A02() {
        setVisibility(4);
    }

    public final void A03(float f10, int i10) {
        this.A07.A02(f10, i10);
    }

    public final void A04(C1O c1o, boolean z10, boolean z11) {
        int A04 = c1o.A04(z10);
        OJ oj2 = this.A07;
        int accentColor = AbstractC04982p.A01(A04, 77);
        oj2.A03(accentColor, A04, 110);
        this.A03.setColorFilter(A04);
        if (z11) {
            TextView textView = this.A05;
            int accentColor2 = AbstractC04982p.A01(-1, 110);
            textView.setTextColor(accentColor2);
            return;
        }
        this.A05.setTextColor(A04);
    }

    public final boolean A05() {
        return !this.A05.getText().toString().isEmpty();
    }

    public final boolean A06() {
        return (this.A00 == 2 || this.A00 == 4) ? false : true;
    }

    public int getToolbarActionMode() {
        return this.A00;
    }

    public void setActionClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setInitialUnskippableSeconds(int i10) {
        if (i10 > 0) {
            setToolbarActionMode(2);
        }
    }

    public void setProgress(float f10) {
        this.A07.setProgressWithAnimation(f10);
    }

    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A07.setOnClickListener(onClickListener);
    }

    public void setProgressImage(MB mb2) {
        this.A07.setImage(mb2);
    }

    public void setProgressImmediate(float f10) {
        this.A07.clearAnimation();
        this.A07.setProgress(f10);
    }

    public void setProgressSpinnerInvisible(boolean z10) {
        this.A01 = z10;
        A01();
    }

    public void setToolbarActionMode(int i10) {
        MB mb2;
        this.A06.A0E().ADn(i10);
        this.A00 = i10;
        A01();
        setVisibility(0);
        if (Build.VERSION.SDK_INT >= 16) {
            this.A03.setImageAlpha(FunctionEval.FunctionID.EXTERNAL_FUNC);
        }
        this.A03.setPadding(A09, A09, A09, A09);
        switch (i10) {
            case 0:
                mb2 = MB.CROSS;
                break;
            case 1:
                if (!this.A02) {
                    mb2 = MB.SKIP_ARROW;
                    break;
                } else {
                    mb2 = MB.REDESIGN_SKIP_ICON;
                    break;
                }
            case 2:
            default:
                mb2 = MB.CROSS;
                break;
            case 3:
                mb2 = MB.MINIMIZE_ARROW;
                break;
            case 4:
                mb2 = MB.CROSS;
                this.A03.setVisibility(8);
                setVisibility(8);
                break;
            case 5:
                mb2 = MB.CROSS;
                break;
            case 6:
                mb2 = MB.CROSS;
                break;
            case 7:
                mb2 = MB.CROSS;
                if (Build.VERSION.SDK_INT >= 16) {
                    this.A03.setImageAlpha(110);
                }
                this.A03.setPadding(A08, A08, A08, A08);
                break;
        }
        this.A03.setImageBitmap(MC.A01(mb2));
        if (i10 == 1) {
            M3.A0G(ErrorCodes.SOCKET_TIMEOUT_EXCEPTION, this.A03);
            setVisibility(0);
            return;
        }
        M3.A0G(1002, this.A03);
    }

    public void setToolbarMessage(String str) {
        this.A05.setText(str);
        this.A05.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setToolbarMessageEnabled(boolean z10) {
        this.A05.setVisibility(z10 ? 0 : 4);
    }
}
