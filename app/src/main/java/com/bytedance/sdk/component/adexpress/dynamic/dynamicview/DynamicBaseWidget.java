package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import a0.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.component.sdk.annotation.ColorInt;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.cJ.iMK;
import com.bytedance.sdk.component.adexpress.dynamic.ac.ROR;
import com.bytedance.sdk.component.adexpress.dynamic.ac.Sf;
import com.bytedance.sdk.component.adexpress.dynamic.ac.hm;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import com.bytedance.sdk.component.utils.qMt;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class DynamicBaseWidget extends FrameLayout implements IAnimation, Tgh, fl {
    private static final View.OnTouchListener EBS = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener bxS = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget.2
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };
    protected hm ABk;
    protected float CJ;
    protected Context Gm;
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi.cJ HzH;
    private float MQ;
    private float Qhi;
    protected int ROR;
    protected int Sf;
    protected float Tgh;
    protected int WAv;

    /* renamed from: ac  reason: collision with root package name */
    protected float f8207ac;
    private float cJ;

    /* renamed from: fl  reason: collision with root package name */
    protected float f8208fl;

    /* renamed from: hm  reason: collision with root package name */
    protected int f8209hm;
    protected boolean hpZ;
    protected DynamicRootView iMK;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.Qhi kYc;
    protected View pA;
    private qMt qMt;
    private float tP;

    /* renamed from: zc  reason: collision with root package name */
    protected Sf f8210zc;

    public DynamicBaseWidget(Context context, DynamicRootView dynamicRootView, hm hmVar) {
        super(context);
        boolean z10;
        this.Gm = context;
        this.iMK = dynamicRootView;
        this.ABk = hmVar;
        this.f8207ac = hmVar.Tgh();
        this.CJ = hmVar.ROR();
        this.f8208fl = hmVar.Sf();
        this.Tgh = hmVar.hm();
        this.f8209hm = (int) CQU.Qhi(this.Gm, this.f8207ac);
        this.WAv = (int) CQU.Qhi(this.Gm, this.CJ);
        this.ROR = (int) CQU.Qhi(this.Gm, this.f8208fl);
        this.Sf = (int) CQU.Qhi(this.Gm, this.Tgh);
        Sf sf2 = new Sf(hmVar.WAv());
        this.f8210zc = sf2;
        if (sf2.kYc() > 0) {
            this.ROR = (this.f8210zc.kYc() * 2) + this.ROR;
            this.Sf = (this.f8210zc.kYc() * 2) + this.Sf;
            this.f8209hm -= this.f8210zc.kYc();
            this.WAv -= this.f8210zc.kYc();
            List<hm> Gm = hmVar.Gm();
            if (Gm != null) {
                for (hm hmVar2 : Gm) {
                    hmVar2.ac(hmVar2.Tgh() + CQU.cJ(this.Gm, this.f8210zc.kYc()));
                    hmVar2.CJ(hmVar2.ROR() + CQU.cJ(this.Gm, this.f8210zc.kYc()));
                    hmVar2.Qhi(CQU.cJ(this.Gm, this.f8210zc.kYc()));
                    hmVar2.cJ(CQU.cJ(this.Gm, this.f8210zc.kYc()));
                }
            }
        }
        if (this.f8210zc.iMK() > 0.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.hpZ = z10;
        this.kYc = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.Qhi();
    }

    public boolean CJ() {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.pA;
        if (view == null) {
            view = this;
        }
        if (fl()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = EBS;
            onClickListener = bxS;
        }
        if (onTouchListener != null && onClickListener != null) {
            view.setOnTouchListener(onTouchListener);
            view.setOnClickListener(onClickListener);
            int Qhi = com.bytedance.sdk.component.adexpress.dynamic.cJ.Qhi.Qhi(this.f8210zc);
            if (Qhi != 2 && Qhi != 3) {
                view.setOnClickListener(onClickListener);
            } else {
                view.setOnClickListener(bxS);
            }
        }
        Qhi(view);
        cJ(view);
        return true;
    }

    public void Qhi(int i10) {
        Sf sf2 = this.f8210zc;
        if (sf2 != null && sf2.Qhi(i10)) {
            hm();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt != null && (getChildAt(i11) instanceof DynamicBaseWidget)) {
                    ((DynamicBaseWidget) childAt).Qhi(i10);
                }
            }
        }
    }

    public void ROR() {
        if (Sf()) {
            return;
        }
        View view = this.pA;
        if (view == null) {
            view = this;
        }
        com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi.cJ cJVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi.cJ(view, this.ABk.WAv().fl().pF());
        this.HzH = cJVar;
        cJVar.Qhi();
    }

    public boolean Sf() {
        hm hmVar = this.ABk;
        if (hmVar != null && hmVar.WAv() != null && this.ABk.WAv().fl() != null && this.ABk.WAv().fl().pF() != null) {
            return false;
        }
        return true;
    }

    public void Tgh() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.ROR, this.Sf);
        layoutParams.topMargin = this.WAv;
        int i10 = this.f8209hm;
        layoutParams.leftMargin = i10;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    public boolean ac() {
        hm();
        Tgh();
        CJ();
        return true;
    }

    public void cJ(View view) {
        ROR fl2;
        hm hmVar = this.ABk;
        if (hmVar == null || (fl2 = hmVar.WAv().fl()) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(fl2.LcF()));
    }

    public boolean fl() {
        Sf sf2 = this.f8210zc;
        if (sf2 != null && sf2.Eh() != 0) {
            return true;
        }
        return false;
    }

    public Drawable getBackgroundDrawable() {
        return Qhi(false, "");
    }

    public boolean getBeginInvisibleAndShow() {
        return this.hpZ;
    }

    public int getClickArea() {
        return this.f8210zc.Eh();
    }

    public GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.fl.Qhi getDynamicClickListener() {
        return this.iMK.getDynamicClickListener();
    }

    public int getDynamicHeight() {
        return this.Sf;
    }

    public ROR getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.ac.Tgh WAv;
        hm hmVar = this.ABk;
        if (hmVar == null || (WAv = hmVar.WAv()) == null) {
            return null;
        }
        return WAv.fl();
    }

    public int getDynamicWidth() {
        return this.ROR;
    }

    public String getImageObjectFit() {
        return this.f8210zc.Hf();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.tP;
    }

    public Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(Qhi(cJ(this.f8210zc.zn().replaceAll("/\\*.*\\*/", ""))));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.Qhi;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.cJ;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.MQ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ROR();
        Qhi();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        cJ();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.kYc.Qhi(canvas, this, this);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.Qhi qhi = this.kYc;
        View view = this.pA;
        if (view == null) {
            view = this;
        }
        qhi.Qhi(view, i10, i11);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        qMt qmt = this.qMt;
        if (qmt != null && z10) {
            qmt.onResume();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f10) {
        this.tP = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f10) {
        this.Qhi = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f10) {
        this.cJ = f10;
        postInvalidate();
    }

    public void setShouldInvisible(boolean z10) {
        this.hpZ = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f10) {
        this.MQ = f10;
        this.kYc.Qhi(this, f10);
    }

    private List<String> cJ(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            if (str.charAt(i12) == '(') {
                i10++;
                z10 = true;
            } else if (str.charAt(i12) == ')' && i10 - 1 == 0 && z10) {
                int i13 = i12 + 1;
                arrayList.add(str.substring(i11, i13));
                i11 = i13;
                z10 = false;
            }
        }
        return arrayList;
    }

    public void Qhi(View view) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(InMobiNetworkValues.WIDTH, this.ABk.Sf());
            jSONObject.put(InMobiNetworkValues.HEIGHT, this.ABk.hm());
            if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.Qhi.MQ, this.f8210zc.es());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.Qhi.qMt, this.ABk.WAv().cJ());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.Qhi.EBS, this.ABk.ac());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.Qhi.bxS, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.f8210zc.es());
            view.setTag(2097610715, this.ABk.WAv().cJ());
            view.setTag(2097610714, this.ABk.ac());
            view.setTag(2097610713, jSONObject.toString());
            int Qhi = com.bytedance.sdk.component.adexpress.dynamic.cJ.Qhi.Qhi(this.f8210zc);
            if (Qhi == 1) {
                view.setTag(2097610707, new Pair(this.f8210zc.CQU(), Long.valueOf(this.f8210zc.pM())));
                view.setTag(2097610708, Integer.valueOf(Qhi));
            }
        } catch (JSONException unused) {
        }
    }

    public void cJ() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi.cJ cJVar = this.HzH;
        if (cJVar != null) {
            cJVar.cJ();
        }
    }

    public Drawable Qhi(boolean z10, String str) {
        String[] split;
        int[] iArr;
        int aP;
        if (!TextUtils.isEmpty(this.f8210zc.zn())) {
            try {
                String zn2 = this.f8210zc.zn();
                String substring = zn2.substring(zn2.indexOf("(") + 1, zn2.length() - 1);
                if (substring.contains("rgba") && substring.contains("%")) {
                    split = new String[]{substring.substring(0, substring.indexOf(",")).trim(), substring.substring(substring.indexOf(",") + 1, substring.indexOf("%") + 1).trim(), substring.substring(substring.indexOf("%") + 2).trim()};
                    iArr = new int[]{Sf.Qhi(split[1]), Sf.Qhi(split[2])};
                } else {
                    split = substring.split(", ");
                    iArr = new int[]{Sf.Qhi(split[1].substring(0, 7)), Sf.Qhi(split[2].substring(0, 7))};
                }
                try {
                    double parseDouble = Double.parseDouble(substring.substring(substring.indexOf("linear-gradient(") + 1, substring.indexOf("deg")));
                    if (parseDouble > 225.0d && parseDouble < 315.0d) {
                        int i10 = iArr[1];
                        iArr[1] = iArr[0];
                        iArr[0] = i10;
                    }
                } catch (Exception unused) {
                }
                GradientDrawable Qhi = Qhi(Qhi(split[0]), iArr);
                Qhi.setShape(0);
                Qhi.setCornerRadius(CQU.Qhi(this.Gm, this.f8210zc.pA()));
                return Qhi;
            } catch (Exception unused2) {
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float Qhi2 = CQU.Qhi(this.Gm, this.f8210zc.pA());
        drawable.setCornerRadius(Qhi2);
        if (Qhi2 < 1.0f) {
            float Qhi3 = CQU.Qhi(this.Gm, this.f8210zc.sDy());
            float Qhi4 = CQU.Qhi(this.Gm, this.f8210zc.lB());
            float Qhi5 = CQU.Qhi(this.Gm, this.f8210zc.lG());
            float Qhi6 = CQU.Qhi(this.Gm, this.f8210zc.Jma());
            float[] fArr = new float[8];
            if (Qhi3 > 0.0f) {
                fArr[0] = Qhi3;
                fArr[1] = Qhi3;
            }
            if (Qhi4 > 0.0f) {
                fArr[2] = Qhi4;
                fArr[3] = Qhi4;
            }
            if (Qhi5 > 0.0f) {
                fArr[4] = Qhi5;
                fArr[5] = Qhi5;
            }
            if (Qhi6 > 0.0f) {
                fArr[6] = Qhi6;
                fArr[7] = Qhi6;
            }
            drawable.setCornerRadii(fArr);
        }
        if (z10) {
            aP = Color.parseColor(str);
        } else {
            aP = this.f8210zc.aP();
        }
        drawable.setColor(aP);
        if (this.f8210zc.HzH() > 0.0f) {
            drawable.setStroke((int) CQU.Qhi(this.Gm, this.f8210zc.HzH()), this.f8210zc.hpZ());
            return drawable;
        } else if (this.f8210zc.kYc() > 0) {
            drawable.setStroke(this.f8210zc.kYc(), this.f8210zc.hpZ());
            drawable.setAlpha(50);
            if (d.j(this.ABk, "video-vd")) {
                setLayerType(1, null);
                return new ac((int) Qhi2, this.f8210zc.kYc());
            }
            return drawable;
        } else {
            return drawable;
        }
    }

    public cJ Qhi(Bitmap bitmap) {
        return new Qhi(bitmap, null);
    }

    private Drawable[] Qhi(List<String> list) {
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            if (str.contains("linear-gradient")) {
                String[] split = str.substring(str.indexOf("(") + 1, str.length() - 1).split(", ");
                int length = split.length - 1;
                int[] iArr = new int[length];
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    iArr[i11] = Sf.Qhi(split[i12].substring(0, 7));
                    i11 = i12;
                }
                GradientDrawable Qhi = Qhi(Qhi(split[0]), iArr);
                Qhi.setShape(0);
                Qhi.setCornerRadius(CQU.Qhi(this.Gm, this.f8210zc.pA()));
                drawableArr[(list.size() - 1) - i10] = Qhi;
            }
        }
        return drawableArr;
    }

    public GradientDrawable Qhi(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            if (iArr.length == 1) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(iArr[0]);
                return gradientDrawable;
            }
            return new GradientDrawable(orientation, iArr);
        }
        return new GradientDrawable();
    }

    public GradientDrawable.Orientation Qhi(String str) {
        try {
            int parseFloat = (int) Float.parseFloat(str.substring(0, str.length() - 3));
            if (parseFloat <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (parseFloat <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (parseFloat <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    private void Qhi() {
        if (isShown()) {
            int Qhi = com.bytedance.sdk.component.adexpress.dynamic.cJ.Qhi.Qhi(this.f8210zc);
            if (Qhi == 2) {
                if (this.qMt == null) {
                    this.qMt = new qMt(getContext().getApplicationContext(), 1);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget.3
                };
                iMK renderRequest = this.iMK.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.pA();
                    renderRequest.qMt();
                    renderRequest.tP();
                }
            } else if (Qhi == 3) {
                if (this.qMt == null) {
                    this.qMt = new qMt(getContext().getApplicationContext(), 2);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget.4
                };
                iMK renderRequest2 = this.iMK.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.HzH();
                    renderRequest2.EBS();
                    renderRequest2.kYc();
                    renderRequest2.MQ();
                }
            }
            qMt qmt = this.qMt;
            if (qmt != null) {
                qmt.onResume();
            }
        }
    }
}
