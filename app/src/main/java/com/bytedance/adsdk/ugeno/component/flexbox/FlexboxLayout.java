package com.bytedance.adsdk.ugeno.component.flexbox;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.cJ.Sf;
import com.bytedance.adsdk.ugeno.component.flexbox.fl;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* loaded from: classes.dex */
public class FlexboxLayout extends ViewGroup implements com.bytedance.adsdk.ugeno.component.flexbox.Qhi {
    private int[] ABk;
    private int CJ;
    private int Gm;
    private com.bytedance.adsdk.ugeno.ac HzH;
    private int Qhi;
    private Drawable ROR;
    private Drawable Sf;
    private int Tgh;
    private int WAv;

    /* renamed from: ac  reason: collision with root package name */
    private int f7885ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private int f7886fl;

    /* renamed from: hm  reason: collision with root package name */
    private int f7887hm;
    private List<ac> hpZ;
    private SparseIntArray iMK;
    private fl.Qhi kYc;
    private fl pA;

    /* renamed from: zc  reason: collision with root package name */
    private int f7888zc;

    /* loaded from: classes.dex */
    public static class Qhi extends ViewGroup.MarginLayoutParams implements cJ {
        public static final Parcelable.Creator<Qhi> CREATOR = new Parcelable.Creator<Qhi>() { // from class: com.bytedance.adsdk.ugeno.component.flexbox.FlexboxLayout.Qhi.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: Qhi */
            public Qhi createFromParcel(Parcel parcel) {
                return new Qhi(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: Qhi */
            public Qhi[] newArray(int i10) {
                return new Qhi[i10];
            }
        };
        private int CJ;
        private int Qhi;
        private int ROR;
        private int Sf;
        private int Tgh;
        private boolean WAv;

        /* renamed from: ac  reason: collision with root package name */
        private float f7889ac;
        private float cJ;

        /* renamed from: fl  reason: collision with root package name */
        private float f7890fl;

        /* renamed from: hm  reason: collision with root package name */
        private int f7891hm;

        public Qhi(Qhi qhi) {
            super((ViewGroup.MarginLayoutParams) qhi);
            this.Qhi = 1;
            this.cJ = 0.0f;
            this.f7889ac = 0.0f;
            this.CJ = -1;
            this.f7890fl = -1.0f;
            this.Tgh = -1;
            this.ROR = -1;
            this.Sf = 16777215;
            this.f7891hm = 16777215;
            this.Qhi = qhi.Qhi;
            this.cJ = qhi.cJ;
            this.f7889ac = qhi.f7889ac;
            this.CJ = qhi.CJ;
            this.f7890fl = qhi.f7890fl;
            this.Tgh = qhi.Tgh;
            this.ROR = qhi.ROR;
            this.Sf = qhi.Sf;
            this.f7891hm = qhi.f7891hm;
            this.WAv = qhi.WAv;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.cJ
        public int ABk() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.cJ
        public float CJ() {
            return this.cJ;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.cJ
        public boolean Gm() {
            return this.WAv;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.cJ
        public int Qhi() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.cJ
        public int ROR() {
            return this.Tgh;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.cJ
        public int Sf() {
            return this.ROR;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.cJ
        public int Tgh() {
            return this.CJ;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.cJ
        public int WAv() {
            return this.f7891hm;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.cJ
        public int ac() {
            return this.Qhi;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.cJ
        public int cJ() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.cJ
        public float fl() {
            return this.f7889ac;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.cJ
        public int hm() {
            return this.Sf;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.cJ
        public int hpZ() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.cJ
        public int iMK() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.cJ
        public int pA() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.Qhi);
            parcel.writeFloat(this.cJ);
            parcel.writeFloat(this.f7889ac);
            parcel.writeInt(this.CJ);
            parcel.writeFloat(this.f7890fl);
            parcel.writeInt(this.Tgh);
            parcel.writeInt(this.ROR);
            parcel.writeInt(this.Sf);
            parcel.writeInt(this.f7891hm);
            parcel.writeByte(this.WAv ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.cJ
        public float zc() {
            return this.f7890fl;
        }

        public void CJ(int i10) {
            this.CJ = i10;
        }

        public void Qhi(float f10) {
            this.cJ = f10;
        }

        public void ac(int i10) {
            this.Qhi = i10;
        }

        public void cJ(float f10) {
            this.f7889ac = f10;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.cJ
        public void Qhi(int i10) {
            this.Tgh = i10;
        }

        public void ac(float f10) {
            this.f7890fl = f10;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.cJ
        public void cJ(int i10) {
            this.ROR = i10;
        }

        public Qhi(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.Qhi = 1;
            this.cJ = 0.0f;
            this.f7889ac = 0.0f;
            this.CJ = -1;
            this.f7890fl = -1.0f;
            this.Tgh = -1;
            this.ROR = -1;
            this.Sf = 16777215;
            this.f7891hm = 16777215;
        }

        public Qhi(int i10, int i11) {
            super(new ViewGroup.LayoutParams(i10, i11));
            this.Qhi = 1;
            this.cJ = 0.0f;
            this.f7889ac = 0.0f;
            this.CJ = -1;
            this.f7890fl = -1.0f;
            this.Tgh = -1;
            this.ROR = -1;
            this.Sf = 16777215;
            this.f7891hm = 16777215;
        }

        public Qhi(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.Qhi = 1;
            this.cJ = 0.0f;
            this.f7889ac = 0.0f;
            this.CJ = -1;
            this.f7890fl = -1.0f;
            this.Tgh = -1;
            this.ROR = -1;
            this.Sf = 16777215;
            this.f7891hm = 16777215;
        }

        public Qhi(Parcel parcel) {
            super(0, 0);
            this.Qhi = 1;
            this.cJ = 0.0f;
            this.f7889ac = 0.0f;
            this.CJ = -1;
            this.f7890fl = -1.0f;
            this.Tgh = -1;
            this.ROR = -1;
            this.Sf = 16777215;
            this.f7891hm = 16777215;
            this.Qhi = parcel.readInt();
            this.cJ = parcel.readFloat();
            this.f7889ac = parcel.readFloat();
            this.CJ = parcel.readInt();
            this.f7890fl = parcel.readFloat();
            this.Tgh = parcel.readInt();
            this.ROR = parcel.readInt();
            this.Sf = parcel.readInt();
            this.f7891hm = parcel.readInt();
            this.WAv = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public FlexboxLayout(Context context) {
        super(context, null);
        this.Tgh = -1;
        this.pA = new fl(this);
        this.hpZ = new ArrayList();
        this.kYc = new fl.Qhi();
    }

    private boolean CJ(int i10, int i11) {
        return fl(i10, i11) ? Qhi() ? (this.WAv & 1) != 0 : (this.f7887hm & 1) != 0 : Qhi() ? (this.WAv & 2) != 0 : (this.f7887hm & 2) != 0;
    }

    private boolean Tgh(int i10) {
        if (i10 >= 0 && i10 < this.hpZ.size()) {
            for (int i11 = i10 + 1; i11 < this.hpZ.size(); i11++) {
                if (this.hpZ.get(i11).cJ() > 0) {
                    return false;
                }
            }
            if (Qhi()) {
                if ((this.f7887hm & 4) == 0) {
                    return false;
                }
                return true;
            } else if ((this.WAv & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean fl(int i10, int i11) {
        for (int i12 = 1; i12 <= i11; i12++) {
            View ac2 = ac(i10 - i12);
            if (ac2 != null && ac2.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.Qhi
    public int Qhi(View view) {
        return 0;
    }

    public View ac(int i10) {
        if (i10 >= 0) {
            int[] iArr = this.ABk;
            if (i10 >= iArr.length) {
                return null;
            }
            return getChildAt(iArr[i10]);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.iMK == null) {
            this.iMK = new SparseIntArray(getChildCount());
        }
        this.ABk = this.pA.Qhi(view, i10, layoutParams, this.iMK);
        super.addView(view, i10, layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.Qhi
    public View cJ(int i10) {
        return ac(i10);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof Qhi;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof Qhi) {
            return new Qhi((Qhi) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new Qhi((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new Qhi(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.Qhi
    public int getAlignContent() {
        return this.f7886fl;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.Qhi
    public int getAlignItems() {
        return this.CJ;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.ROR;
    }

    public Drawable getDividerDrawableVertical() {
        return this.Sf;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.Qhi
    public int getFlexDirection() {
        return this.Qhi;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.Qhi
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<ac> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.hpZ.size());
        for (ac acVar : this.hpZ) {
            if (acVar.cJ() != 0) {
                arrayList.add(acVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.Qhi
    public List<ac> getFlexLinesInternal() {
        return this.hpZ;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.Qhi
    public int getFlexWrap() {
        return this.cJ;
    }

    public int getJustifyContent() {
        return this.f7885ac;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.Qhi
    public int getLargestMainSize() {
        int i10 = SlideAtom.USES_MASTER_SLIDE_ID;
        for (ac acVar : this.hpZ) {
            i10 = Math.max(i10, acVar.f7895fl);
        }
        return i10;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.Qhi
    public int getMaxLine() {
        return this.Tgh;
    }

    public int getShowDividerHorizontal() {
        return this.f7887hm;
    }

    public int getShowDividerVertical() {
        return this.WAv;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.Qhi
    public int getSumOfCrossSize() {
        int i10;
        int i11;
        int size = this.hpZ.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            ac acVar = this.hpZ.get(i13);
            if (CJ(i13)) {
                if (Qhi()) {
                    i11 = this.Gm;
                } else {
                    i11 = this.f7888zc;
                }
                i12 += i11;
            }
            if (Tgh(i13)) {
                if (Qhi()) {
                    i10 = this.Gm;
                } else {
                    i10 = this.f7888zc;
                }
                i12 += i10;
            }
            i12 += acVar.ROR;
        }
        return i12;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.ac acVar = this.HzH;
        if (acVar != null) {
            acVar.Tgh();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.ac acVar = this.HzH;
        if (acVar != null) {
            acVar.ROR();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        if (this.Sf == null && this.ROR == null) {
            return;
        }
        if (this.f7887hm == 0 && this.WAv == 0) {
            return;
        }
        int Qhi2 = Sf.Qhi(this);
        int i10 = this.Qhi;
        boolean z12 = false;
        boolean z13 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        if (Qhi2 == 1) {
                            z12 = true;
                        }
                        if (this.cJ == 2) {
                            z12 = !z12;
                        }
                        cJ(canvas, z12, true);
                        return;
                    }
                    return;
                }
                if (Qhi2 != 1) {
                    z13 = false;
                }
                if (this.cJ == 2) {
                    z13 = !z13;
                }
                cJ(canvas, z13, false);
                return;
            }
            if (Qhi2 != 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.cJ == 2) {
                z12 = true;
            }
            Qhi(canvas, z11, z12);
            return;
        }
        if (Qhi2 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.cJ == 2) {
            z12 = true;
        }
        Qhi(canvas, z10, z12);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        com.bytedance.adsdk.ugeno.ac acVar = this.HzH;
        if (acVar != null) {
            acVar.fl();
        }
        int Qhi2 = Sf.Qhi(this);
        int i14 = this.Qhi;
        boolean z15 = false;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        if (Qhi2 == 1) {
                            z15 = true;
                        }
                        if (this.cJ == 2) {
                            z14 = !z15;
                        } else {
                            z14 = z15;
                        }
                        Qhi(z14, true, i10, i11, i12, i13);
                    } else {
                        throw new IllegalStateException("Invalid flex direction is set: " + this.Qhi);
                    }
                } else {
                    if (Qhi2 == 1) {
                        z15 = true;
                    }
                    if (this.cJ == 2) {
                        z13 = !z15;
                    } else {
                        z13 = z15;
                    }
                    Qhi(z13, false, i10, i11, i12, i13);
                }
            } else {
                if (Qhi2 != 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Qhi(z12, i10, i11, i12, i13);
            }
        } else {
            if (Qhi2 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            Qhi(z11, i10, i11, i12, i13);
        }
        com.bytedance.adsdk.ugeno.ac acVar2 = this.HzH;
        if (acVar2 != null) {
            acVar2.Qhi(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        com.bytedance.adsdk.ugeno.ac acVar = this.HzH;
        if (acVar != null) {
            int[] Qhi2 = acVar.Qhi(i10, i11);
            Qhi(Qhi2[0], Qhi2[1]);
        } else {
            Qhi(i10, i11);
        }
        com.bytedance.adsdk.ugeno.ac acVar2 = this.HzH;
        if (acVar2 != null) {
            acVar2.CJ();
        }
    }

    public void setAlignContent(int i10) {
        if (this.f7886fl != i10) {
            this.f7886fl = i10;
            requestLayout();
        }
    }

    public void setAlignItems(int i10) {
        if (this.CJ != i10) {
            this.CJ = i10;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.ROR) {
            return;
        }
        this.ROR = drawable;
        if (drawable != null) {
            this.Gm = drawable.getIntrinsicHeight();
        } else {
            this.Gm = 0;
        }
        cJ();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.Sf) {
            return;
        }
        this.Sf = drawable;
        if (drawable != null) {
            this.f7888zc = drawable.getIntrinsicWidth();
        } else {
            this.f7888zc = 0;
        }
        cJ();
        requestLayout();
    }

    public void setFlexDirection(int i10) {
        if (this.Qhi != i10) {
            this.Qhi = i10;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.Qhi
    public void setFlexLines(List<ac> list) {
        this.hpZ = list;
    }

    public void setFlexWrap(int i10) {
        if (this.cJ != i10) {
            this.cJ = i10;
            requestLayout();
        }
    }

    public void setJustifyContent(int i10) {
        if (this.f7885ac != i10) {
            this.f7885ac = i10;
            requestLayout();
        }
    }

    public void setMaxLine(int i10) {
        if (this.Tgh != i10) {
            this.Tgh = i10;
            requestLayout();
        }
    }

    public void setShowDivider(int i10) {
        setShowDividerVertical(i10);
        setShowDividerHorizontal(i10);
    }

    public void setShowDividerHorizontal(int i10) {
        if (i10 != this.f7887hm) {
            this.f7887hm = i10;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i10) {
        if (i10 != this.WAv) {
            this.WAv = i10;
            requestLayout();
        }
    }

    private void Qhi(int i10, int i11) {
        if (this.iMK == null) {
            this.iMK = new SparseIntArray(getChildCount());
        }
        if (this.pA.cJ(this.iMK)) {
            this.ABk = this.pA.Qhi(this.iMK);
        }
        int i12 = this.Qhi;
        if (i12 == 0 || i12 == 1) {
            cJ(i10, i11);
        } else if (i12 != 2 && i12 != 3) {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.Qhi);
        } else {
            ac(i10, i11);
        }
    }

    private void cJ(int i10, int i11) {
        this.hpZ.clear();
        this.kYc.Qhi();
        this.pA.Qhi(this.kYc, i10, i11);
        this.hpZ = this.kYc.Qhi;
        this.pA.Qhi(i10, i11);
        if (this.CJ == 3) {
            for (ac acVar : this.hpZ) {
                int i12 = SlideAtom.USES_MASTER_SLIDE_ID;
                for (int i13 = 0; i13 < acVar.Sf; i13++) {
                    View ac2 = ac(acVar.pA + i13);
                    if (ac2 != null && ac2.getVisibility() != 8) {
                        Qhi qhi = (Qhi) ac2.getLayoutParams();
                        if (this.cJ != 2) {
                            i12 = Math.max(i12, ac2.getMeasuredHeight() + Math.max(acVar.f7897zc - ac2.getBaseline(), ((ViewGroup.MarginLayoutParams) qhi).topMargin) + ((ViewGroup.MarginLayoutParams) qhi).bottomMargin);
                        } else {
                            i12 = Math.max(i12, ac2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) qhi).topMargin + Math.max(ac2.getBaseline() + (acVar.f7897zc - ac2.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) qhi).bottomMargin));
                        }
                    }
                }
                acVar.ROR = i12;
            }
        }
        this.pA.cJ(i10, i11, getPaddingBottom() + getPaddingTop());
        this.pA.Qhi();
        Qhi(this.Qhi, i10, i11, this.kYc.cJ);
    }

    private void ac(int i10, int i11) {
        this.hpZ.clear();
        this.kYc.Qhi();
        this.pA.cJ(this.kYc, i10, i11);
        this.hpZ = this.kYc.Qhi;
        this.pA.Qhi(i10, i11);
        this.pA.cJ(i10, i11, getPaddingRight() + getPaddingLeft());
        this.pA.Qhi();
        Qhi(this.Qhi, i10, i11, this.kYc.cJ);
    }

    private boolean fl(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.hpZ.get(i11).cJ() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean CJ(int i10) {
        if (i10 >= 0 && i10 < this.hpZ.size()) {
            if (fl(i10)) {
                return Qhi() ? (this.f7887hm & 1) != 0 : (this.WAv & 1) != 0;
            } else if (Qhi()) {
                return (this.f7887hm & 2) != 0;
            } else if ((this.WAv & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.Qhi
    public View Qhi(int i10) {
        return getChildAt(i10);
    }

    private void Qhi(int i10, int i11, int i12, int i13) {
        int paddingBottom;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (i10 == 0 || i10 == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else if (i10 != 2 && i10 != 3) {
            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i10)));
        } else {
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else if (mode == 0) {
            resolveSizeAndState = View.resolveSizeAndState(largestMainSize, i11, i13);
        } else if (mode == 1073741824) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else {
            throw new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(mode)));
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i13 = View.combineMeasuredStates(i13, 256);
            } else {
                size2 = paddingBottom;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else if (mode2 == 0) {
            resolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i12, i13);
        } else if (mode2 == 1073741824) {
            if (size2 < paddingBottom) {
                i13 = View.combineMeasuredStates(i13, 256);
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else {
            throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(mode2)));
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    private void cJ(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.hpZ.size();
        for (int i12 = 0; i12 < size; i12++) {
            ac acVar = this.hpZ.get(i12);
            for (int i13 = 0; i13 < acVar.Sf; i13++) {
                int i14 = acVar.pA + i13;
                View ac2 = ac(i14);
                if (ac2 != null && ac2.getVisibility() != 8) {
                    Qhi qhi = (Qhi) ac2.getLayoutParams();
                    if (CJ(i14, i13)) {
                        if (z11) {
                            top = ac2.getBottom() + ((ViewGroup.MarginLayoutParams) qhi).bottomMargin;
                        } else {
                            top = (ac2.getTop() - ((ViewGroup.MarginLayoutParams) qhi).topMargin) - this.Gm;
                        }
                        cJ(canvas, acVar.Qhi, top, acVar.ROR);
                    }
                    if (i13 == acVar.Sf - 1 && (this.f7887hm & 4) > 0) {
                        if (z11) {
                            bottom = (ac2.getTop() - ((ViewGroup.MarginLayoutParams) qhi).topMargin) - this.Gm;
                        } else {
                            bottom = ac2.getBottom() + ((ViewGroup.MarginLayoutParams) qhi).bottomMargin;
                        }
                        cJ(canvas, acVar.Qhi, bottom, acVar.ROR);
                    }
                }
            }
            if (CJ(i12)) {
                if (z10) {
                    i11 = acVar.f7894ac;
                } else {
                    i11 = acVar.Qhi - this.f7888zc;
                }
                Qhi(canvas, i11, paddingTop, max);
            }
            if (Tgh(i12) && (this.WAv & 4) > 0) {
                if (z10) {
                    i10 = acVar.Qhi - this.f7888zc;
                } else {
                    i10 = acVar.f7894ac;
                }
                Qhi(canvas, i10, paddingTop, max);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.Qhi
    public boolean Qhi() {
        int i10 = this.Qhi;
        return i10 == 0 || i10 == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void Qhi(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.component.flexbox.FlexboxLayout.Qhi(boolean, int, int, int, int):void");
    }

    private void cJ(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.ROR;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, i12 + i10, this.Gm + i11);
        this.ROR.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.Qhi
    public int cJ(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    private void cJ() {
        if (this.ROR == null && this.Sf == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void Qhi(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.component.flexbox.FlexboxLayout.Qhi(boolean, boolean, int, int, int, int):void");
    }

    private void Qhi(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.hpZ.size();
        for (int i12 = 0; i12 < size; i12++) {
            ac acVar = this.hpZ.get(i12);
            for (int i13 = 0; i13 < acVar.Sf; i13++) {
                int i14 = acVar.pA + i13;
                View ac2 = ac(i14);
                if (ac2 != null && ac2.getVisibility() != 8) {
                    Qhi qhi = (Qhi) ac2.getLayoutParams();
                    if (CJ(i14, i13)) {
                        if (z10) {
                            left = ac2.getRight() + ((ViewGroup.MarginLayoutParams) qhi).rightMargin;
                        } else {
                            left = (ac2.getLeft() - ((ViewGroup.MarginLayoutParams) qhi).leftMargin) - this.f7888zc;
                        }
                        Qhi(canvas, left, acVar.cJ, acVar.ROR);
                    }
                    if (i13 == acVar.Sf - 1 && (this.WAv & 4) > 0) {
                        if (z10) {
                            right = (ac2.getLeft() - ((ViewGroup.MarginLayoutParams) qhi).leftMargin) - this.f7888zc;
                        } else {
                            right = ac2.getRight() + ((ViewGroup.MarginLayoutParams) qhi).rightMargin;
                        }
                        Qhi(canvas, right, acVar.cJ, acVar.ROR);
                    }
                }
            }
            if (CJ(i12)) {
                if (z11) {
                    i11 = acVar.CJ;
                } else {
                    i11 = acVar.cJ - this.Gm;
                }
                cJ(canvas, paddingLeft, i11, max);
            }
            if (Tgh(i12) && (this.f7887hm & 4) > 0) {
                if (z11) {
                    i10 = acVar.cJ - this.Gm;
                } else {
                    i10 = acVar.CJ;
                }
                cJ(canvas, paddingLeft, i10, max);
            }
        }
    }

    private void Qhi(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.Sf;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, this.f7888zc + i10, i12 + i11);
        this.Sf.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.Qhi
    public int Qhi(View view, int i10, int i11) {
        int i12;
        int i13;
        if (Qhi()) {
            i12 = CJ(i10, i11) ? 0 + this.f7888zc : 0;
            if ((this.WAv & 4) <= 0) {
                return i12;
            }
            i13 = this.f7888zc;
        } else {
            i12 = CJ(i10, i11) ? 0 + this.Gm : 0;
            if ((this.f7887hm & 4) <= 0) {
                return i12;
            }
            i13 = this.Gm;
        }
        return i12 + i13;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.Qhi
    public void Qhi(ac acVar) {
        if (Qhi()) {
            if ((this.WAv & 4) > 0) {
                int i10 = acVar.f7895fl;
                int i11 = this.f7888zc;
                acVar.f7895fl = i10 + i11;
                acVar.Tgh += i11;
            }
        } else if ((this.f7887hm & 4) > 0) {
            int i12 = acVar.f7895fl;
            int i13 = this.Gm;
            acVar.f7895fl = i12 + i13;
            acVar.Tgh += i13;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.Qhi
    public int Qhi(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.Qhi
    public void Qhi(View view, int i10, int i11, ac acVar) {
        if (CJ(i10, i11)) {
            if (Qhi()) {
                int i12 = acVar.f7895fl;
                int i13 = this.f7888zc;
                acVar.f7895fl = i12 + i13;
                acVar.Tgh += i13;
                return;
            }
            int i14 = acVar.f7895fl;
            int i15 = this.Gm;
            acVar.f7895fl = i14 + i15;
            acVar.Tgh += i15;
        }
    }

    public void Qhi(com.bytedance.adsdk.ugeno.component.cJ cJVar) {
        this.HzH = cJVar;
    }
}
