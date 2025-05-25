package com.bytedance.adsdk.ugeno.swiper.indicator;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.cJ.hm;
import com.bytedance.adsdk.ugeno.swiper.cJ;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DotIndicator extends LinearLayout {
    private Context CJ;
    private List<View> Qhi;
    private int ROR;
    private boolean Sf;
    private int Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private int f7957ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private int f7958fl;

    /* renamed from: hm  reason: collision with root package name */
    private int f7959hm;

    public DotIndicator(Context context) {
        super(context);
        this.cJ = -65536;
        this.f7957ac = -16776961;
        this.f7958fl = 5;
        this.Tgh = 20;
        this.ROR = 20;
        this.CJ = context;
        this.Qhi = new ArrayList();
        Qhi();
    }

    public void Qhi(int i10, int i11) {
        for (View view : this.Qhi) {
            view.setBackground(cJ(this.f7957ac));
        }
        i10 = (i10 < 0 || i10 >= this.Qhi.size()) ? 0 : 0;
        if (this.Qhi.size() > 0) {
            this.Qhi.get(i10).setBackground(cJ(this.cJ));
            this.f7959hm = i11;
        }
    }

    public void cJ() {
        View view = new View(getContext());
        view.setClickable(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.Tgh, this.ROR);
        int i10 = this.f7958fl;
        layoutParams.leftMargin = i10;
        layoutParams.rightMargin = i10;
        addView(view, layoutParams);
        view.setBackground(cJ(this.f7957ac));
        this.Qhi.add(view);
    }

    public int getSize() {
        return this.Qhi.size();
    }

    public void setLoop(boolean z10) {
        this.Sf = z10;
    }

    public void setSelectedColor(int i10) {
        this.cJ = i10;
    }

    public void setUnSelectedColor(int i10) {
        this.f7957ac = i10;
    }

    public void Qhi() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        setGravity(17);
        setOrientation(0);
        layoutParams.bottomMargin = (int) hm.Qhi(this.CJ, 10.0f);
        setLayoutParams(layoutParams);
    }

    private GradientDrawable cJ(int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    public void Qhi(int i10) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.Tgh, this.ROR);
        int i11 = this.f7958fl;
        layoutParams.leftMargin = i11;
        layoutParams.rightMargin = i11;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.Tgh, this.ROR);
        int i12 = this.f7958fl;
        layoutParams2.leftMargin = i12;
        layoutParams2.rightMargin = i12;
        int Qhi = cJ.Qhi(this.Sf, this.f7959hm, this.Qhi.size());
        int Qhi2 = cJ.Qhi(this.Sf, i10, this.Qhi.size());
        if (this.Qhi.size() == 0) {
            Qhi2 = 0;
        }
        if (!this.Qhi.isEmpty() && cJ.Qhi(Qhi, this.Qhi) && cJ.Qhi(Qhi2, this.Qhi)) {
            this.Qhi.get(Qhi).setBackground(cJ(this.f7957ac));
            this.Qhi.get(Qhi).setLayoutParams(layoutParams2);
            this.Qhi.get(Qhi2).setBackground(cJ(this.cJ));
            this.Qhi.get(Qhi2).setLayoutParams(layoutParams);
            this.f7959hm = i10;
        }
    }
}
