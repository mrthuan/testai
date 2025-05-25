package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.CircleLongPressView;
import com.bytedance.sdk.component.adexpress.widget.ClickSlideUpShakeView;
import com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView;
import com.bytedance.sdk.component.adexpress.widget.RippleView;
import com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView;
import com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;

/* loaded from: classes.dex */
public class InteractViewContainer extends FrameLayout implements WAv {
    private DynamicBrushMaskView ABk;
    private View CJ;
    private com.bytedance.sdk.component.adexpress.dynamic.ac.Gm Gm;
    private Context Qhi;
    private RippleView ROR;
    private View.OnTouchListener Sf;
    private String Tgh;
    private boolean WAv;

    /* renamed from: ac  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.ac.Sf f8218ac;
    private DynamicBaseWidget cJ;

    /* renamed from: fl  reason: collision with root package name */
    private hm f8219fl;

    /* renamed from: hm  reason: collision with root package name */
    private int f8220hm;

    /* renamed from: zc  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.cJ.iMK f8221zc;

    public InteractViewContainer(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.ac.Sf sf2) {
        super(context);
        this.Qhi = context;
        this.cJ = dynamicBaseWidget;
        this.f8218ac = sf2;
        ROR();
    }

    private void ROR() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.Tgh = this.f8218ac.ip();
        this.f8220hm = this.f8218ac.MND();
        this.WAv = this.f8218ac.dI();
        hm Qhi = Gm.Qhi(this.Qhi, this.cJ, this.f8218ac, this.Gm, this.f8221zc);
        this.f8219fl = Qhi;
        if (Qhi != null) {
            this.CJ = Qhi.ac();
            if (this.f8218ac.xyz()) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.Tgh, "6")) {
                if (this.f8218ac.dVA() && !TextUtils.isEmpty(this.f8218ac.zjb())) {
                    this.ROR = new RippleView(this.Qhi, com.bytedance.sdk.component.adexpress.dynamic.ac.Sf.Qhi(this.f8218ac.zjb()));
                } else {
                    this.ROR = new RippleView(this.Qhi, Color.parseColor("#99000000"));
                }
                FrameLayout frameLayout = new FrameLayout(this.Qhi);
                frameLayout.addView(this.ROR, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer.1
                    @Override // java.lang.Runnable
                    public void run() {
                        InteractViewContainer.this.ROR.cJ();
                    }
                });
            }
            if (!com.bytedance.sdk.component.adexpress.fl.cJ() && TextUtils.equals(this.Tgh, "20")) {
                this.ABk = (DynamicBrushMaskView) this.f8219fl.ac();
            }
            if (Qhi(this.Tgh) && com.bytedance.sdk.component.adexpress.fl.cJ()) {
                int parseColor = Color.parseColor("#99000000");
                if (this.f8218ac.dVA() && !TextUtils.isEmpty(this.f8218ac.zjb())) {
                    try {
                        parseColor = com.bytedance.sdk.component.adexpress.dynamic.ac.Sf.Qhi(this.f8218ac.zjb());
                    } catch (Exception unused) {
                    }
                }
                View view = new View(this.Qhi);
                view.setBackgroundColor(parseColor);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.f8219fl.ac());
            Qhi(this.f8219fl.ac());
            setVisibility(0);
        }
    }

    private boolean Sf() {
        if (this.f8218ac.dI() || TextUtils.equals("9", this.Tgh) || TextUtils.equals("16", this.Tgh) || TextUtils.equals("17", this.Tgh) || TextUtils.equals("18", this.Tgh) || TextUtils.equals("20", this.Tgh) || TextUtils.equals("29", this.Tgh) || TextUtils.equals("10", this.Tgh)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm() {
        if (this.Sf != null) {
            setOnClickListener((View.OnClickListener) this.cJ.getDynamicClickListener());
            performClick();
            if (!this.f8218ac.Gy()) {
                setVisibility(8);
            }
        }
    }

    public void CJ() {
        hm hmVar = this.f8219fl;
        if (hmVar != null) {
            hmVar.cJ();
        }
    }

    public void Tgh() {
        if (this.CJ != null && TextUtils.equals(this.Tgh, "2")) {
            View view = this.CJ;
            if (view instanceof CircleLongPressView) {
                ((CircleLongPressView) view).CJ();
            }
        }
    }

    public void ac() {
        hm hmVar = this.f8219fl;
        if (hmVar != null) {
            hmVar.Qhi();
        }
    }

    public void fl() {
        if (this.CJ != null && TextUtils.equals(this.Tgh, "2")) {
            View view = this.CJ;
            if (view instanceof CircleLongPressView) {
                ((CircleLongPressView) view).ac();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            hm hmVar = this.f8219fl;
            if (hmVar != null) {
                hmVar.cJ();
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ABk.cJ(e10.getMessage());
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.Sf instanceof com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi.ac) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private boolean Qhi(String str) {
        return TextUtils.equals(str, "24") || TextUtils.equals(str, "23") || TextUtils.equals(str, "25") || TextUtils.equals(str, "22") || TextUtils.equals(str, "1");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.WAv
    public void cJ() {
        if (Sf()) {
            setOnClickListener((View.OnClickListener) this.cJ.getDynamicClickListener());
            performClick();
            if (this.f8218ac.Gy()) {
                return;
            }
            setVisibility(8);
        }
    }

    public InteractViewContainer(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.ac.Sf sf2, com.bytedance.sdk.component.adexpress.dynamic.ac.Gm gm2, com.bytedance.sdk.component.adexpress.cJ.iMK imk) {
        super(context);
        this.Qhi = context;
        this.cJ = dynamicBaseWidget;
        this.f8218ac = sf2;
        this.Gm = gm2;
        this.f8221zc = imk;
        ROR();
    }

    private void Qhi(ViewGroup viewGroup) {
        if (this.CJ == null) {
            return;
        }
        String str = this.Tgh;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 48:
                if (str.equals(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES)) {
                    c = 0;
                    break;
                }
                break;
            case 49:
                if (str.equals("1")) {
                    c = 1;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c = 2;
                    break;
                }
                break;
            case 53:
                if (str.equals("5")) {
                    c = 3;
                    break;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    c = 4;
                    break;
                }
                break;
            case 55:
                if (str.equals("7")) {
                    c = 5;
                    break;
                }
                break;
            case 56:
                if (str.equals("8")) {
                    c = 6;
                    break;
                }
                break;
            case 57:
                if (str.equals("9")) {
                    c = 7;
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c = '\b';
                    break;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    c = '\t';
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c = '\n';
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c = 11;
                    break;
                }
                break;
            case 1571:
                if (str.equals("14")) {
                    c = '\f';
                    break;
                }
                break;
            case 1573:
                if (str.equals("16")) {
                    c = '\r';
                    break;
                }
                break;
            case 1574:
                if (str.equals("17")) {
                    c = 14;
                    break;
                }
                break;
            case 1575:
                if (str.equals("18")) {
                    c = 15;
                    break;
                }
                break;
            case 1598:
                if (str.equals("20")) {
                    c = 16;
                    break;
                }
                break;
            case 1600:
                if (str.equals("22")) {
                    c = 17;
                    break;
                }
                break;
            case 1601:
                if (str.equals("23")) {
                    c = 18;
                    break;
                }
                break;
            case 1602:
                if (str.equals("24")) {
                    c = 19;
                    break;
                }
                break;
            case 1603:
                if (str.equals("25")) {
                    c = 20;
                    break;
                }
                break;
            case 1607:
                if (str.equals("29")) {
                    c = 21;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.Sf = new com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi.Tgh(this, this.f8220hm);
                setBackgroundColor(Color.parseColor("#80000000"));
                break;
            case 1:
            case 4:
                if (!this.f8218ac.dVA() || TextUtils.isEmpty(this.f8218ac.zjb())) {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.Sf = new com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi.ROR(this);
                break;
            case 2:
            case 5:
                setBackgroundColor(Color.parseColor("#80000000"));
                this.Sf = new com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi.cJ(this, this);
                break;
            case 3:
                if (this.f8218ac.dVA() && !TextUtils.isEmpty(this.f8218ac.zjb())) {
                    setBackgroundColor(com.bytedance.sdk.component.adexpress.dynamic.ac.Sf.Qhi(this.f8218ac.zjb()));
                } else {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.Sf = new com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi.ac(this);
                this.CJ.setTag(2);
                break;
            case 6:
            case '\t':
                this.cJ.setClipChildren(false);
                this.cJ.setClipChildren(false);
                ViewGroup viewGroup2 = (ViewGroup) this.cJ.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                this.Sf = new com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi.ROR(this);
                break;
            case 7:
            case 14:
                this.CJ.setTag(2);
                break;
            case '\b':
                this.Sf = new com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi.fl(this, this.f8220hm, this.WAv);
                break;
            case '\n':
                this.Sf = new com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi.ac(this);
                this.CJ.setTag(2);
                break;
            case 11:
            case 19:
                if (this.Tgh.equals("24") && com.bytedance.sdk.component.adexpress.fl.cJ()) {
                    this.cJ.setClipChildren(false);
                    this.Sf = new com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi.ROR(this);
                    break;
                } else {
                    this.Sf = new com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi.Tgh(this, this.f8220hm);
                    break;
                }
            case '\f':
                this.Sf = new com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi.cJ(this, this);
                break;
            case '\r':
                View view = this.CJ;
                if (view != null && (view instanceof ShakeAnimationView) && ((ShakeAnimationView) view).getShakeLayout() != null) {
                    ((ShakeAnimationView) this.CJ).getShakeLayout().setTag(2);
                }
                this.CJ.setTag(2);
                break;
            case 15:
                View view2 = this.CJ;
                if (view2 != null && (view2 instanceof WriggleGuideAnimationView) && ((WriggleGuideAnimationView) view2).getWriggleLayout() != null) {
                    ((WriggleGuideAnimationView) this.CJ).getWriggleLayout().setTag(2);
                }
                this.CJ.setTag(2);
                break;
            case 16:
                this.Sf = new com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi.Qhi(this, this.f8220hm, viewGroup);
                break;
            case 17:
                if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
                    this.Sf = new com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi.hm(this, this.WAv);
                    break;
                } else {
                    this.Sf = new com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi.Sf(this, this.f8220hm, viewGroup);
                    break;
                }
            case 18:
                if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
                    this.Sf = new com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi.ROR(this);
                    break;
                }
                break;
            case 20:
                if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
                    this.Sf = new com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi.hm(this, this.WAv);
                    break;
                }
                break;
            case 21:
                View view3 = this.CJ;
                if (view3 != null && (view3 instanceof ClickSlideUpShakeView) && ((ClickSlideUpShakeView) view3).getShakeView() != null) {
                    ((ClickSlideUpShakeView) this.CJ).getShakeView().setTag(2);
                }
                this.Sf = new com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi.Tgh(this, this.f8220hm);
                break;
        }
        View.OnTouchListener onTouchListener = this.Sf;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
        if (Sf()) {
            this.CJ.setTag(2);
            setOnClickListener((View.OnClickListener) this.cJ.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.WAv
    public void Qhi() {
        DynamicBrushMaskView dynamicBrushMaskView;
        if (TextUtils.equals(this.Tgh, "6")) {
            RippleView rippleView = this.ROR;
            if (rippleView != null) {
                rippleView.ac();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer.2
                    @Override // java.lang.Runnable
                    public void run() {
                        InteractViewContainer.this.hm();
                    }
                }, 300L);
            }
        } else if (TextUtils.equals(this.Tgh, "20")) {
            if (!com.bytedance.sdk.component.adexpress.fl.cJ() && (dynamicBrushMaskView = this.ABk) != null) {
                dynamicBrushMaskView.Qhi();
            }
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer.3
                @Override // java.lang.Runnable
                public void run() {
                    InteractViewContainer.this.hm();
                }
            }, 400L);
        } else {
            hm();
        }
    }
}
