package com.bytedance.adsdk.ugeno.component.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.activity.f;
import com.bytedance.adsdk.ugeno.cJ.ROR;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* compiled from: FlexboxHelper.java */
/* loaded from: classes.dex */
class fl {

    /* renamed from: ac  reason: collision with root package name */
    static final /* synthetic */ boolean f7898ac = true;
    private final com.bytedance.adsdk.ugeno.component.flexbox.Qhi CJ;
    int[] Qhi;
    private long[] Tgh;
    long[] cJ;

    /* renamed from: fl  reason: collision with root package name */
    private boolean[] f7899fl;

    /* compiled from: FlexboxHelper.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        List<ac> Qhi;
        int cJ;

        public void Qhi() {
            this.Qhi = null;
            this.cJ = 0;
        }
    }

    /* compiled from: FlexboxHelper.java */
    /* loaded from: classes.dex */
    public static class cJ implements Comparable<cJ> {
        int Qhi;
        int cJ;

        private cJ() {
        }

        @Override // java.lang.Comparable
        /* renamed from: Qhi */
        public int compareTo(cJ cJVar) {
            int i10 = this.cJ;
            int i11 = cJVar.cJ;
            if (i10 != i11) {
                return i10 - i11;
            }
            return this.Qhi - cJVar.Qhi;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Order{order=");
            sb2.append(this.cJ);
            sb2.append(", index=");
            return f.n(sb2, this.Qhi, '}');
        }
    }

    public fl(com.bytedance.adsdk.ugeno.component.flexbox.Qhi qhi) {
        this.CJ = qhi;
    }

    private int CJ(boolean z10) {
        if (z10) {
            return this.CJ.getPaddingBottom();
        }
        return this.CJ.getPaddingEnd();
    }

    private int Tgh(com.bytedance.adsdk.ugeno.component.flexbox.cJ cJVar, boolean z10) {
        if (z10) {
            return cJVar.hpZ();
        }
        return cJVar.pA();
    }

    private int ac(boolean z10) {
        if (z10) {
            return this.CJ.getPaddingTop();
        }
        return this.CJ.getPaddingStart();
    }

    private int fl(com.bytedance.adsdk.ugeno.component.flexbox.cJ cJVar, boolean z10) {
        if (z10) {
            return cJVar.iMK();
        }
        return cJVar.ABk();
    }

    public int Qhi(long j10) {
        return (int) j10;
    }

    public int cJ(long j10) {
        return (int) (j10 >> 32);
    }

    public int[] Qhi(View view, int i10, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.CJ.getFlexItemCount();
        List<cJ> cJ2 = cJ(flexItemCount);
        cJ cJVar = new cJ();
        if (view != null && (layoutParams instanceof com.bytedance.adsdk.ugeno.component.flexbox.cJ)) {
            cJVar.cJ = ((com.bytedance.adsdk.ugeno.component.flexbox.cJ) layoutParams).ac();
        } else {
            cJVar.cJ = 1;
        }
        if (i10 != -1 && i10 != flexItemCount) {
            if (i10 < this.CJ.getFlexItemCount()) {
                cJVar.Qhi = i10;
                while (i10 < flexItemCount) {
                    cJ2.get(i10).Qhi++;
                    i10++;
                }
            } else {
                cJVar.Qhi = flexItemCount;
            }
        } else {
            cJVar.Qhi = flexItemCount;
        }
        cJ2.add(cJVar);
        return Qhi(flexItemCount + 1, cJ2, sparseIntArray);
    }

    public long cJ(int i10, int i11) {
        return (i10 & 4294967295L) | (i11 << 32);
    }

    private int CJ(com.bytedance.adsdk.ugeno.component.flexbox.cJ cJVar, boolean z10) {
        if (z10) {
            return cJVar.pA();
        }
        return cJVar.hpZ();
    }

    private int ac(com.bytedance.adsdk.ugeno.component.flexbox.cJ cJVar, boolean z10) {
        if (z10) {
            return cJVar.ABk();
        }
        return cJVar.iMK();
    }

    private List<cJ> cJ(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            cJ cJVar = new cJ();
            cJVar.cJ = ((com.bytedance.adsdk.ugeno.component.flexbox.cJ) this.CJ.Qhi(i11).getLayoutParams()).ac();
            cJVar.Qhi = i11;
            arrayList.add(cJVar);
        }
        return arrayList;
    }

    private void ac(int i10) {
        boolean[] zArr = this.f7899fl;
        if (zArr == null) {
            this.f7899fl = new boolean[Math.max(i10, 10)];
        } else if (zArr.length < i10) {
            this.f7899fl = new boolean[Math.max(zArr.length * 2, i10)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    public boolean cJ(SparseIntArray sparseIntArray) {
        int flexItemCount = this.CJ.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i10 = 0; i10 < flexItemCount; i10++) {
            View Qhi2 = this.CJ.Qhi(i10);
            if (Qhi2 != null && ((com.bytedance.adsdk.ugeno.component.flexbox.cJ) Qhi2.getLayoutParams()).ac() != sparseIntArray.get(i10)) {
                return true;
            }
        }
        return false;
    }

    public void cJ(Qhi qhi, int i10, int i11) {
        Qhi(qhi, i11, i10, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, -1, (List<ac>) null);
    }

    private int cJ(boolean z10) {
        if (z10) {
            return this.CJ.getPaddingEnd();
        }
        return this.CJ.getPaddingBottom();
    }

    public int[] Qhi(SparseIntArray sparseIntArray) {
        int flexItemCount = this.CJ.getFlexItemCount();
        return Qhi(flexItemCount, cJ(flexItemCount), sparseIntArray);
    }

    private int cJ(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int[] Qhi(int i10, List<cJ> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i10];
        int i11 = 0;
        for (cJ cJVar : list) {
            int i12 = cJVar.Qhi;
            iArr[i11] = i12;
            sparseIntArray.append(i12, cJVar.cJ);
            i11++;
        }
        return iArr;
    }

    private int cJ(com.bytedance.adsdk.ugeno.component.flexbox.cJ cJVar, boolean z10) {
        if (z10) {
            return cJVar.cJ();
        }
        return cJVar.Qhi();
    }

    private void cJ(int i10, int i11, ac acVar, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        int i16;
        int i17 = acVar.f7895fl;
        float f10 = acVar.Gm;
        float f11 = 0.0f;
        if (f10 <= 0.0f || i12 > i17) {
            return;
        }
        float f12 = (i17 - i12) / f10;
        acVar.f7895fl = i13 + acVar.Tgh;
        if (!z10) {
            acVar.ROR = SlideAtom.USES_MASTER_SLIDE_ID;
        }
        int i18 = 0;
        boolean z11 = false;
        int i19 = 0;
        float f13 = 0.0f;
        while (i18 < acVar.Sf) {
            int i20 = acVar.pA + i18;
            View cJ2 = this.CJ.cJ(i20);
            if (cJ2 == null || cJ2.getVisibility() == 8) {
                i14 = i17;
                i15 = i18;
            } else {
                com.bytedance.adsdk.ugeno.component.flexbox.cJ cJVar = (com.bytedance.adsdk.ugeno.component.flexbox.cJ) cJ2.getLayoutParams();
                int flexDirection = this.CJ.getFlexDirection();
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = cJ2.getMeasuredHeight();
                    long[] jArr = this.Tgh;
                    if (jArr != null) {
                        measuredHeight = cJ(jArr[i20]);
                    }
                    int measuredWidth = cJ2.getMeasuredWidth();
                    long[] jArr2 = this.Tgh;
                    if (jArr2 != null) {
                        measuredWidth = Qhi(jArr2[i20]);
                    }
                    if (this.f7899fl[i20] || cJVar.fl() <= f11) {
                        i14 = i17;
                        i15 = i18;
                    } else {
                        float fl2 = measuredHeight - (cJVar.fl() * f12);
                        if (i18 == acVar.Sf - 1) {
                            fl2 += f13;
                            f13 = f11;
                        }
                        int round = Math.round(fl2);
                        if (round < cJVar.Sf()) {
                            round = cJVar.Sf();
                            this.f7899fl[i20] = true;
                            acVar.Gm -= cJVar.fl();
                            i14 = i17;
                            i15 = i18;
                            z11 = true;
                        } else {
                            float f14 = (fl2 - round) + f13;
                            i14 = i17;
                            i15 = i18;
                            double d10 = f14;
                            if (d10 > 1.0d) {
                                round++;
                                f14 -= 1.0f;
                            } else if (d10 < -1.0d) {
                                round--;
                                f14 += 1.0f;
                            }
                            f13 = f14;
                        }
                        int Qhi2 = Qhi(i10, cJVar, acVar.ABk);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        cJ2.measure(Qhi2, makeMeasureSpec);
                        measuredWidth = cJ2.getMeasuredWidth();
                        int measuredHeight2 = cJ2.getMeasuredHeight();
                        Qhi(i20, Qhi2, makeMeasureSpec, cJ2);
                        measuredHeight = measuredHeight2;
                    }
                    i16 = Math.max(i19, cJVar.pA() + cJVar.ABk() + measuredWidth + this.CJ.Qhi(cJ2));
                    acVar.f7895fl = cJVar.hpZ() + cJVar.iMK() + measuredHeight + acVar.f7895fl;
                } else {
                    i14 = i17;
                    int i21 = i18;
                    int measuredWidth2 = cJ2.getMeasuredWidth();
                    long[] jArr3 = this.Tgh;
                    if (jArr3 != null) {
                        measuredWidth2 = Qhi(jArr3[i20]);
                    }
                    int measuredHeight3 = cJ2.getMeasuredHeight();
                    long[] jArr4 = this.Tgh;
                    if (jArr4 != null) {
                        measuredHeight3 = cJ(jArr4[i20]);
                    }
                    if (this.f7899fl[i20] || cJVar.fl() <= 0.0f) {
                        i15 = i21;
                    } else {
                        float fl3 = measuredWidth2 - (cJVar.fl() * f12);
                        i15 = i21;
                        if (i15 == acVar.Sf - 1) {
                            fl3 += f13;
                            f13 = 0.0f;
                        }
                        int round2 = Math.round(fl3);
                        if (round2 < cJVar.ROR()) {
                            round2 = cJVar.ROR();
                            this.f7899fl[i20] = true;
                            acVar.Gm -= cJVar.fl();
                            z11 = true;
                        } else {
                            float f15 = (fl3 - round2) + f13;
                            double d11 = f15;
                            if (d11 > 1.0d) {
                                round2++;
                                f15 -= 1.0f;
                            } else if (d11 < -1.0d) {
                                round2--;
                                f15 += 1.0f;
                            }
                            f13 = f15;
                        }
                        int cJ3 = cJ(i11, cJVar, acVar.ABk);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        cJ2.measure(makeMeasureSpec2, cJ3);
                        int measuredWidth3 = cJ2.getMeasuredWidth();
                        int measuredHeight4 = cJ2.getMeasuredHeight();
                        Qhi(i20, makeMeasureSpec2, cJ3, cJ2);
                        measuredWidth2 = measuredWidth3;
                        measuredHeight3 = measuredHeight4;
                    }
                    int max = Math.max(i19, cJVar.hpZ() + cJVar.iMK() + measuredHeight3 + this.CJ.Qhi(cJ2));
                    acVar.f7895fl = cJVar.pA() + cJVar.ABk() + measuredWidth2 + acVar.f7895fl;
                    i16 = max;
                }
                acVar.ROR = Math.max(acVar.ROR, i16);
                i19 = i16;
            }
            i18 = i15 + 1;
            i17 = i14;
            f11 = 0.0f;
        }
        int i22 = i17;
        if (!z11 || i22 == acVar.f7895fl) {
            return;
        }
        cJ(i10, i11, acVar, i12, i13, true);
    }

    public void Qhi(Qhi qhi, int i10, int i11) {
        Qhi(qhi, i10, i11, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, -1, (List<ac>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Qhi(Qhi qhi, int i10, int i11, int i12, int i13, int i14, List<ac> list) {
        Qhi qhi2;
        int i15;
        int i16;
        int i17;
        int cJ2;
        int combineMeasuredStates;
        List<ac> list2;
        int i18;
        View view;
        int i19;
        ac acVar;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        ac acVar2;
        ac acVar3;
        int i25;
        int i26 = i10;
        boolean Qhi2 = this.CJ.Qhi();
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        ArrayList arrayList = list == null ? new ArrayList() : list;
        qhi.Qhi = arrayList;
        int i27 = i14 == -1 ? 1 : 0;
        int Qhi3 = Qhi(Qhi2);
        int cJ3 = cJ(Qhi2);
        int ac2 = ac(Qhi2);
        int CJ = CJ(Qhi2);
        ac acVar4 = new ac();
        int i28 = i13;
        acVar4.pA = i28;
        int i29 = cJ3 + Qhi3;
        acVar4.f7895fl = i29;
        int flexItemCount = this.CJ.getFlexItemCount();
        int i30 = 0;
        int i31 = Integer.MIN_VALUE;
        int i32 = 0;
        int i33 = i27;
        int i34 = i11;
        int i35 = 0;
        ac acVar5 = acVar4;
        while (true) {
            if (i28 >= flexItemCount) {
                qhi2 = qhi;
                break;
            }
            View cJ4 = this.CJ.cJ(i28);
            if (cJ4 == null) {
                if (Qhi(i28, flexItemCount, acVar5)) {
                    Qhi(arrayList, acVar5, i28, i35);
                }
            } else if (cJ4.getVisibility() == 8) {
                acVar5.f7896hm++;
                acVar5.Sf++;
                if (Qhi(i28, flexItemCount, acVar5)) {
                    Qhi(arrayList, acVar5, i28, i35);
                }
            } else {
                if (cJ4 instanceof CompoundButton) {
                    Qhi((CompoundButton) cJ4);
                }
                com.bytedance.adsdk.ugeno.component.flexbox.cJ cJVar = (com.bytedance.adsdk.ugeno.component.flexbox.cJ) cJ4.getLayoutParams();
                int i36 = flexItemCount;
                if (cJVar.Tgh() == 4) {
                    acVar5.iMK.add(Integer.valueOf(i28));
                }
                int Qhi4 = Qhi(cJVar, Qhi2);
                if (cJVar.zc() != -1.0f && mode == 1073741824) {
                    Qhi4 = Math.round(cJVar.zc() * size);
                }
                if (Qhi2) {
                    i15 = size;
                    cJ2 = this.CJ.Qhi(i26, i29 + ac(cJVar, true) + CJ(cJVar, true), Qhi4);
                    i16 = mode;
                    int cJ5 = this.CJ.cJ(i34, ac2 + CJ + fl(cJVar, true) + Tgh(cJVar, true) + i35, cJ(cJVar, true));
                    cJ4.measure(cJ2, cJ5);
                    Qhi(i28, cJ2, cJ5, cJ4);
                    i17 = i35;
                } else {
                    i15 = size;
                    i16 = mode;
                    i17 = i35;
                    int Qhi5 = this.CJ.Qhi(i34, ac2 + CJ + fl(cJVar, false) + Tgh(cJVar, false) + i35, cJ(cJVar, false));
                    cJ2 = this.CJ.cJ(i26, ac(cJVar, false) + i29 + CJ(cJVar, false), Qhi4);
                    cJ4.measure(Qhi5, cJ2);
                    Qhi(i28, Qhi5, cJ2, cJ4);
                }
                int i37 = cJ2;
                Qhi(cJ4, i28);
                combineMeasuredStates = View.combineMeasuredStates(i30, cJ4.getMeasuredState());
                int i38 = acVar5.f7895fl;
                int Qhi6 = Qhi(cJ4, Qhi2) + ac(cJVar, Qhi2);
                ac acVar6 = acVar5;
                int i39 = i17;
                int i40 = i28;
                int i41 = i29;
                list2 = arrayList;
                if (Qhi(cJ4, i16, i15, i38, CJ(cJVar, Qhi2) + Qhi6, cJVar, i40, i32, arrayList.size())) {
                    if (acVar6.cJ() > 0) {
                        i28 = i40;
                        if (i28 > 0) {
                            i25 = i28 - 1;
                            acVar3 = acVar6;
                        } else {
                            acVar3 = acVar6;
                            i25 = 0;
                        }
                        Qhi(list2, acVar3, i25, i39);
                        i35 = acVar3.ROR + i39;
                    } else {
                        i28 = i40;
                        i35 = i39;
                    }
                    if (Qhi2) {
                        if (cJVar.cJ() == -1) {
                            com.bytedance.adsdk.ugeno.component.flexbox.Qhi qhi3 = this.CJ;
                            i18 = i11;
                            view = cJ4;
                            view.measure(i37, qhi3.cJ(i18, cJVar.hpZ() + cJVar.iMK() + qhi3.getPaddingTop() + this.CJ.getPaddingBottom() + i35, cJVar.cJ()));
                            Qhi(view, i28);
                        } else {
                            i18 = i11;
                            view = cJ4;
                        }
                    } else {
                        i18 = i11;
                        view = cJ4;
                        if (cJVar.Qhi() == -1) {
                            com.bytedance.adsdk.ugeno.component.flexbox.Qhi qhi4 = this.CJ;
                            view.measure(qhi4.Qhi(i18, cJVar.pA() + cJVar.ABk() + qhi4.getPaddingLeft() + this.CJ.getPaddingRight() + i35, cJVar.Qhi()), i37);
                            Qhi(view, i28);
                        }
                    }
                    acVar = new ac();
                    i19 = 1;
                    acVar.Sf = 1;
                    i29 = i41;
                    acVar.f7895fl = i29;
                    acVar.pA = i28;
                    i21 = Integer.MIN_VALUE;
                    i20 = 0;
                } else {
                    i18 = i11;
                    view = cJ4;
                    i28 = i40;
                    i29 = i41;
                    i19 = 1;
                    acVar6.Sf++;
                    acVar = acVar6;
                    i35 = i39;
                    i20 = i32 + 1;
                    i21 = i31;
                }
                acVar.HzH = (acVar.HzH ? 1 : 0) | (cJVar.CJ() != 0.0f ? i19 : 0);
                acVar.kYc = (acVar.kYc ? 1 : 0) | (cJVar.fl() != 0.0f ? i19 : 0);
                int[] iArr = this.Qhi;
                if (iArr != null) {
                    iArr[i28] = list2.size();
                }
                acVar.f7895fl = Qhi(view, Qhi2) + ac(cJVar, Qhi2) + CJ(cJVar, Qhi2) + acVar.f7895fl;
                acVar.WAv = cJVar.CJ() + acVar.WAv;
                acVar.Gm = cJVar.fl() + acVar.Gm;
                this.CJ.Qhi(view, i28, i20, acVar);
                int max = Math.max(i21, cJ(view, Qhi2) + fl(cJVar, Qhi2) + Tgh(cJVar, Qhi2) + this.CJ.Qhi(view));
                acVar.ROR = Math.max(acVar.ROR, max);
                if (Qhi2) {
                    if (this.CJ.getFlexWrap() != 2) {
                        acVar.f7897zc = Math.max(acVar.f7897zc, cJVar.iMK() + view.getBaseline());
                    } else {
                        acVar.f7897zc = Math.max(acVar.f7897zc, cJVar.hpZ() + (view.getMeasuredHeight() - view.getBaseline()));
                    }
                }
                i22 = i36;
                if (Qhi(i28, i22, acVar)) {
                    Qhi(list2, acVar, i28, i35);
                    i35 += acVar.ROR;
                }
                i23 = i14;
                if (i23 == -1 || list2.size() <= 0 || list2.get(list2.size() - i19).hpZ < i23 || i28 < i23 || i33 != 0) {
                    i24 = i12;
                } else {
                    i35 = -acVar.Qhi();
                    i24 = i12;
                    i33 = i19;
                }
                if (i35 > i24 && i33 != 0) {
                    qhi2 = qhi;
                    i30 = combineMeasuredStates;
                    break;
                }
                acVar2 = acVar;
                i34 = i18;
                i32 = i20;
                i31 = max;
                i28++;
                arrayList = list2;
                size = i15;
                mode = i16;
                i26 = i10;
                flexItemCount = i22;
                acVar5 = acVar2;
                i30 = combineMeasuredStates;
            }
            i23 = i14;
            combineMeasuredStates = i30;
            list2 = arrayList;
            i15 = size;
            i16 = mode;
            acVar2 = acVar5;
            i22 = flexItemCount;
            i18 = i11;
            i28++;
            arrayList = list2;
            size = i15;
            mode = i16;
            i26 = i10;
            flexItemCount = i22;
            acVar5 = acVar2;
            i30 = combineMeasuredStates;
        }
        qhi2.cJ = i30;
    }

    private int cJ(int i10, com.bytedance.adsdk.ugeno.component.flexbox.cJ cJVar, int i11) {
        com.bytedance.adsdk.ugeno.component.flexbox.Qhi qhi = this.CJ;
        int cJ2 = qhi.cJ(i10, cJVar.hpZ() + cJVar.iMK() + qhi.getPaddingTop() + this.CJ.getPaddingBottom() + i11, cJVar.cJ());
        int size = View.MeasureSpec.getSize(cJ2);
        if (size > cJVar.WAv()) {
            return View.MeasureSpec.makeMeasureSpec(cJVar.WAv(), View.MeasureSpec.getMode(cJ2));
        }
        return size < cJVar.Sf() ? View.MeasureSpec.makeMeasureSpec(cJVar.Sf(), View.MeasureSpec.getMode(cJ2)) : cJ2;
    }

    public void cJ(int i10, int i11, int i12) {
        int i13;
        int i14;
        int flexDirection = this.CJ.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            i13 = mode;
            i14 = size;
        } else if (flexDirection != 2 && flexDirection != 3) {
            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
        } else {
            i13 = View.MeasureSpec.getMode(i10);
            i14 = View.MeasureSpec.getSize(i10);
        }
        List<ac> flexLinesInternal = this.CJ.getFlexLinesInternal();
        if (i13 == 1073741824) {
            int sumOfCrossSize = this.CJ.getSumOfCrossSize() + i12;
            int i15 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).ROR = i14 - i12;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = this.CJ.getAlignContent();
                if (alignContent == 1) {
                    int i16 = i14 - sumOfCrossSize;
                    ac acVar = new ac();
                    acVar.ROR = i16;
                    flexLinesInternal.add(0, acVar);
                } else if (alignContent == 2) {
                    this.CJ.setFlexLines(Qhi(flexLinesInternal, i14, sumOfCrossSize));
                } else if (alignContent == 3) {
                    if (sumOfCrossSize < i14) {
                        float size2 = (i14 - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size3 = flexLinesInternal.size();
                        float f10 = 0.0f;
                        while (i15 < size3) {
                            arrayList.add(flexLinesInternal.get(i15));
                            if (i15 != flexLinesInternal.size() - 1) {
                                ac acVar2 = new ac();
                                if (i15 == flexLinesInternal.size() - 2) {
                                    acVar2.ROR = Math.round(f10 + size2);
                                    f10 = 0.0f;
                                } else {
                                    acVar2.ROR = Math.round(size2);
                                }
                                int i17 = acVar2.ROR;
                                float f11 = (size2 - i17) + f10;
                                if (f11 > 1.0f) {
                                    acVar2.ROR = i17 + 1;
                                    f11 -= 1.0f;
                                } else if (f11 < -1.0f) {
                                    acVar2.ROR = i17 - 1;
                                    f11 += 1.0f;
                                }
                                f10 = f11;
                                arrayList.add(acVar2);
                            }
                            i15++;
                        }
                        this.CJ.setFlexLines(arrayList);
                    }
                } else if (alignContent == 4) {
                    if (sumOfCrossSize >= i14) {
                        this.CJ.setFlexLines(Qhi(flexLinesInternal, i14, sumOfCrossSize));
                        return;
                    }
                    int size4 = (i14 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    ac acVar3 = new ac();
                    acVar3.ROR = size4;
                    for (ac acVar4 : flexLinesInternal) {
                        arrayList2.add(acVar3);
                        arrayList2.add(acVar4);
                        arrayList2.add(acVar3);
                    }
                    this.CJ.setFlexLines(arrayList2);
                } else if (alignContent == 5 && sumOfCrossSize < i14) {
                    float size5 = (i14 - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f12 = 0.0f;
                    while (i15 < size6) {
                        ac acVar5 = flexLinesInternal.get(i15);
                        float f13 = acVar5.ROR + size5;
                        if (i15 == flexLinesInternal.size() - 1) {
                            f13 += f12;
                            f12 = 0.0f;
                        }
                        int round = Math.round(f13);
                        float f14 = (f13 - round) + f12;
                        if (f14 > 1.0f) {
                            round++;
                            f14 -= 1.0f;
                        } else if (f14 < -1.0f) {
                            round--;
                            f14 += 1.0f;
                        }
                        f12 = f14;
                        acVar5.ROR = round;
                        i15++;
                    }
                }
            }
        }
    }

    private void Qhi(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.component.flexbox.cJ cJVar = (com.bytedance.adsdk.ugeno.component.flexbox.cJ) compoundButton.getLayoutParams();
        int ROR = cJVar.ROR();
        int Sf = cJVar.Sf();
        Drawable Qhi2 = com.bytedance.adsdk.ugeno.cJ.Tgh.Qhi(compoundButton);
        int minimumWidth = Qhi2 == null ? 0 : Qhi2.getMinimumWidth();
        int minimumHeight = Qhi2 != null ? Qhi2.getMinimumHeight() : 0;
        if (ROR == -1) {
            ROR = minimumWidth;
        }
        cJVar.Qhi(ROR);
        if (Sf == -1) {
            Sf = minimumHeight;
        }
        cJVar.cJ(Sf);
    }

    private int Qhi(boolean z10) {
        if (z10) {
            return this.CJ.getPaddingStart();
        }
        return this.CJ.getPaddingTop();
    }

    private int Qhi(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private void cJ(View view, int i10, int i11) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.component.flexbox.cJ cJVar = (com.bytedance.adsdk.ugeno.component.flexbox.cJ) view.getLayoutParams();
        int min = Math.min(Math.max(((i10 - cJVar.ABk()) - cJVar.pA()) - this.CJ.Qhi(view), cJVar.ROR()), cJVar.hm());
        long[] jArr = this.Tgh;
        if (jArr != null) {
            measuredHeight = cJ(jArr[i11]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        Qhi(i11, makeMeasureSpec2, makeMeasureSpec, view);
    }

    private int Qhi(com.bytedance.adsdk.ugeno.component.flexbox.cJ cJVar, boolean z10) {
        if (z10) {
            return cJVar.Qhi();
        }
        return cJVar.cJ();
    }

    private boolean Qhi(View view, int i10, int i11, int i12, int i13, com.bytedance.adsdk.ugeno.component.flexbox.cJ cJVar, int i14, int i15, int i16) {
        if (this.CJ.getFlexWrap() == 0) {
            return false;
        }
        if (cJVar.Gm()) {
            return true;
        }
        if (i10 == 0) {
            return false;
        }
        int maxLine = this.CJ.getMaxLine();
        if (maxLine == -1 || maxLine > i16 + 1) {
            int Qhi2 = this.CJ.Qhi(view, i14, i15);
            if (Qhi2 > 0) {
                i13 += Qhi2;
            }
            return i11 < i12 + i13;
        }
        return false;
    }

    private boolean Qhi(int i10, int i11, ac acVar) {
        return i10 == i11 - 1 && acVar.cJ() != 0;
    }

    private void Qhi(List<ac> list, ac acVar, int i10, int i11) {
        acVar.ABk = i11;
        this.CJ.Qhi(acVar);
        acVar.hpZ = i10;
        list.add(acVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void Qhi(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.bytedance.adsdk.ugeno.component.flexbox.cJ r0 = (com.bytedance.adsdk.ugeno.component.flexbox.cJ) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.ROR()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.ROR()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.hm()
            if (r1 <= r3) goto L26
            int r1 = r0.hm()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.Sf()
            if (r2 >= r5) goto L32
            int r2 = r0.Sf()
            goto L3e
        L32:
            int r5 = r0.WAv()
            if (r2 <= r5) goto L3d
            int r2 = r0.WAv()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L50
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.Qhi(r8, r1, r0, r7)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.component.flexbox.fl.Qhi(android.view.View, int):void");
    }

    public void Qhi(int i10, int i11) {
        Qhi(i10, i11, 0);
    }

    public void Qhi(int i10, int i11, int i12) {
        int size;
        int paddingLeft;
        int paddingRight;
        ac(this.CJ.getFlexItemCount());
        if (i12 >= this.CJ.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.CJ.getFlexDirection();
        int flexDirection2 = this.CJ.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            int largestMainSize = this.CJ.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.CJ.getPaddingLeft();
            paddingRight = this.CJ.getPaddingRight();
        } else if (flexDirection2 != 2 && flexDirection2 != 3) {
            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
        } else {
            int mode2 = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode2 != 1073741824) {
                size = this.CJ.getLargestMainSize();
            }
            paddingLeft = this.CJ.getPaddingTop();
            paddingRight = this.CJ.getPaddingBottom();
        }
        int i13 = paddingLeft + paddingRight;
        int[] iArr = this.Qhi;
        List<ac> flexLinesInternal = this.CJ.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i14 = iArr != null ? iArr[i12] : 0; i14 < size2; i14++) {
            ac acVar = flexLinesInternal.get(i14);
            int i15 = acVar.f7895fl;
            if (i15 < size && acVar.HzH) {
                Qhi(i10, i11, acVar, size, i13, false);
            } else if (i15 > size && acVar.kYc) {
                cJ(i10, i11, acVar, size, i13, false);
            }
        }
    }

    private void Qhi(int i10, int i11, ac acVar, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        int i16;
        double d10;
        int i17;
        double d11;
        float f10 = acVar.WAv;
        float f11 = 0.0f;
        if (f10 <= 0.0f || i12 < (i14 = acVar.f7895fl)) {
            return;
        }
        float f12 = (i12 - i14) / f10;
        acVar.f7895fl = i13 + acVar.Tgh;
        if (!z10) {
            acVar.ROR = SlideAtom.USES_MASTER_SLIDE_ID;
        }
        int i18 = 0;
        boolean z11 = false;
        int i19 = 0;
        float f13 = 0.0f;
        while (i18 < acVar.Sf) {
            int i20 = acVar.pA + i18;
            View cJ2 = this.CJ.cJ(i20);
            if (cJ2 == null || cJ2.getVisibility() == 8) {
                i15 = i14;
            } else {
                com.bytedance.adsdk.ugeno.component.flexbox.cJ cJVar = (com.bytedance.adsdk.ugeno.component.flexbox.cJ) cJ2.getLayoutParams();
                int flexDirection = this.CJ.getFlexDirection();
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = cJ2.getMeasuredHeight();
                    long[] jArr = this.Tgh;
                    if (jArr != null) {
                        measuredHeight = cJ(jArr[i20]);
                    }
                    int measuredWidth = cJ2.getMeasuredWidth();
                    long[] jArr2 = this.Tgh;
                    if (jArr2 != null) {
                        measuredWidth = Qhi(jArr2[i20]);
                    }
                    if (this.f7899fl[i20] || cJVar.CJ() <= f11) {
                        i17 = i14;
                    } else {
                        float CJ = (cJVar.CJ() * f12) + measuredHeight;
                        if (i18 == acVar.Sf - 1) {
                            CJ += f13;
                            f13 = f11;
                        }
                        int round = Math.round(CJ);
                        if (round > cJVar.WAv()) {
                            round = cJVar.WAv();
                            this.f7899fl[i20] = true;
                            acVar.WAv -= cJVar.CJ();
                            i17 = i14;
                            z11 = true;
                        } else {
                            float f14 = (CJ - round) + f13;
                            i17 = i14;
                            double d12 = f14;
                            if (d12 > 1.0d) {
                                round++;
                                d11 = d12 - 1.0d;
                            } else if (d12 < -1.0d) {
                                round--;
                                d11 = d12 + 1.0d;
                            } else {
                                f13 = f14;
                            }
                            f13 = (float) d11;
                        }
                        int Qhi2 = Qhi(i10, cJVar, acVar.ABk);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        cJ2.measure(Qhi2, makeMeasureSpec);
                        measuredWidth = cJ2.getMeasuredWidth();
                        int measuredHeight2 = cJ2.getMeasuredHeight();
                        Qhi(i20, Qhi2, makeMeasureSpec, cJ2);
                        measuredHeight = measuredHeight2;
                    }
                    i16 = Math.max(i19, cJVar.pA() + cJVar.ABk() + measuredWidth + this.CJ.Qhi(cJ2));
                    acVar.f7895fl = cJVar.hpZ() + cJVar.iMK() + measuredHeight + acVar.f7895fl;
                    i15 = i17;
                } else {
                    int i21 = i14;
                    int measuredWidth2 = cJ2.getMeasuredWidth();
                    long[] jArr3 = this.Tgh;
                    if (jArr3 != null) {
                        measuredWidth2 = Qhi(jArr3[i20]);
                    }
                    int measuredHeight3 = cJ2.getMeasuredHeight();
                    long[] jArr4 = this.Tgh;
                    i15 = i21;
                    if (jArr4 != null) {
                        measuredHeight3 = cJ(jArr4[i20]);
                    }
                    if (!this.f7899fl[i20] && cJVar.CJ() > 0.0f) {
                        float CJ2 = (cJVar.CJ() * f12) + measuredWidth2;
                        if (i18 == acVar.Sf - 1) {
                            CJ2 += f13;
                            f13 = 0.0f;
                        }
                        int round2 = Math.round(CJ2);
                        if (round2 > cJVar.hm()) {
                            round2 = cJVar.hm();
                            this.f7899fl[i20] = true;
                            acVar.WAv -= cJVar.CJ();
                            z11 = true;
                        } else {
                            float f15 = (CJ2 - round2) + f13;
                            double d13 = f15;
                            if (d13 > 1.0d) {
                                round2++;
                                d10 = d13 - 1.0d;
                            } else {
                                if (d13 < -1.0d) {
                                    round2--;
                                    d10 = d13 + 1.0d;
                                }
                                f13 = f15;
                            }
                            f15 = (float) d10;
                            f13 = f15;
                        }
                        int cJ3 = cJ(i11, cJVar, acVar.ABk);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        cJ2.measure(makeMeasureSpec2, cJ3);
                        int measuredWidth3 = cJ2.getMeasuredWidth();
                        int measuredHeight4 = cJ2.getMeasuredHeight();
                        Qhi(i20, makeMeasureSpec2, cJ3, cJ2);
                        measuredWidth2 = measuredWidth3;
                        measuredHeight3 = measuredHeight4;
                    }
                    int max = Math.max(i19, cJVar.hpZ() + cJVar.iMK() + measuredHeight3 + this.CJ.Qhi(cJ2));
                    acVar.f7895fl = cJVar.pA() + cJVar.ABk() + measuredWidth2 + acVar.f7895fl;
                    i16 = max;
                }
                acVar.ROR = Math.max(acVar.ROR, i16);
                i19 = i16;
            }
            i18++;
            i14 = i15;
            f11 = 0.0f;
        }
        int i22 = i14;
        if (!z11 || i22 == acVar.f7895fl) {
            return;
        }
        Qhi(i10, i11, acVar, i12, i13, true);
    }

    private int Qhi(int i10, com.bytedance.adsdk.ugeno.component.flexbox.cJ cJVar, int i11) {
        com.bytedance.adsdk.ugeno.component.flexbox.Qhi qhi = this.CJ;
        int Qhi2 = qhi.Qhi(i10, cJVar.pA() + cJVar.ABk() + qhi.getPaddingLeft() + this.CJ.getPaddingRight() + i11, cJVar.Qhi());
        int size = View.MeasureSpec.getSize(Qhi2);
        if (size > cJVar.hm()) {
            return View.MeasureSpec.makeMeasureSpec(cJVar.hm(), View.MeasureSpec.getMode(Qhi2));
        }
        return size < cJVar.ROR() ? View.MeasureSpec.makeMeasureSpec(cJVar.ROR(), View.MeasureSpec.getMode(Qhi2)) : Qhi2;
    }

    private List<ac> Qhi(List<ac> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        ac acVar = new ac();
        acVar.ROR = (i10 - i11) / 2;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (i12 == 0) {
                arrayList.add(acVar);
            }
            arrayList.add(list.get(i12));
            if (i12 == list.size() - 1) {
                arrayList.add(acVar);
            }
        }
        return arrayList;
    }

    public void Qhi() {
        Qhi(0);
    }

    public void Qhi(int i10) {
        View cJ2;
        if (i10 >= this.CJ.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.CJ.getFlexDirection();
        if (this.CJ.getAlignItems() == 4) {
            int[] iArr = this.Qhi;
            List<ac> flexLinesInternal = this.CJ.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i11 = iArr != null ? iArr[i10] : 0; i11 < size; i11++) {
                ac acVar = flexLinesInternal.get(i11);
                int i12 = acVar.Sf;
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = acVar.pA + i13;
                    if (i13 < this.CJ.getFlexItemCount() && (cJ2 = this.CJ.cJ(i14)) != null && cJ2.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.component.flexbox.cJ cJVar = (com.bytedance.adsdk.ugeno.component.flexbox.cJ) cJ2.getLayoutParams();
                        if (cJVar.Tgh() == -1 || cJVar.Tgh() == 4) {
                            if (flexDirection == 0 || flexDirection == 1) {
                                Qhi(cJ2, acVar.ROR, i14);
                            } else if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                            } else {
                                cJ(cJ2, acVar.ROR, i14);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (ac acVar2 : this.CJ.getFlexLinesInternal()) {
            for (Integer num : acVar2.iMK) {
                View cJ3 = this.CJ.cJ(num.intValue());
                if (flexDirection == 0 || flexDirection == 1) {
                    Qhi(cJ3, acVar2.ROR, num.intValue());
                } else if (flexDirection != 2 && flexDirection != 3) {
                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                } else {
                    cJ(cJ3, acVar2.ROR, num.intValue());
                }
            }
        }
    }

    private void Qhi(View view, int i10, int i11) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.component.flexbox.cJ cJVar = (com.bytedance.adsdk.ugeno.component.flexbox.cJ) view.getLayoutParams();
        int min = Math.min(Math.max(((i10 - cJVar.iMK()) - cJVar.hpZ()) - this.CJ.Qhi(view), cJVar.Sf()), cJVar.WAv());
        long[] jArr = this.Tgh;
        if (jArr != null) {
            measuredWidth = Qhi(jArr[i11]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        Qhi(i11, makeMeasureSpec, makeMeasureSpec2, view);
    }

    public void Qhi(View view, ac acVar, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.component.flexbox.cJ cJVar = (com.bytedance.adsdk.ugeno.component.flexbox.cJ) view.getLayoutParams();
        int alignItems = this.CJ.getAlignItems();
        if (cJVar.Tgh() != -1) {
            alignItems = cJVar.Tgh();
        }
        int i14 = acVar.ROR;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.CJ.getFlexWrap() != 2) {
                    int i15 = i11 + i14;
                    view.layout(i10, (i15 - view.getMeasuredHeight()) - cJVar.hpZ(), i12, i15 - cJVar.hpZ());
                    return;
                }
                view.layout(i10, cJVar.iMK() + view.getMeasuredHeight() + (i11 - i14), i12, cJVar.iMK() + view.getMeasuredHeight() + (i13 - i14));
                return;
            } else if (alignItems == 2) {
                int iMK = ((cJVar.iMK() + (i14 - view.getMeasuredHeight())) - cJVar.hpZ()) / 2;
                if (this.CJ.getFlexWrap() != 2) {
                    int i16 = i11 + iMK;
                    view.layout(i10, i16, i12, view.getMeasuredHeight() + i16);
                    return;
                }
                int i17 = i11 - iMK;
                view.layout(i10, i17, i12, view.getMeasuredHeight() + i17);
                return;
            } else if (alignItems == 3) {
                if (this.CJ.getFlexWrap() != 2) {
                    int max = Math.max(acVar.f7897zc - view.getBaseline(), cJVar.iMK());
                    view.layout(i10, i11 + max, i12, i13 + max);
                    return;
                }
                int max2 = Math.max(view.getBaseline() + (acVar.f7897zc - view.getMeasuredHeight()), cJVar.hpZ());
                view.layout(i10, i11 - max2, i12, i13 - max2);
                return;
            } else if (alignItems != 4) {
                return;
            }
        }
        if (this.CJ.getFlexWrap() != 2) {
            view.layout(i10, cJVar.iMK() + i11, i12, cJVar.iMK() + i13);
        } else {
            view.layout(i10, i11 - cJVar.hpZ(), i12, i13 - cJVar.hpZ());
        }
    }

    public void Qhi(View view, ac acVar, boolean z10, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.component.flexbox.cJ cJVar = (com.bytedance.adsdk.ugeno.component.flexbox.cJ) view.getLayoutParams();
        int alignItems = this.CJ.getAlignItems();
        if (cJVar.Tgh() != -1) {
            alignItems = cJVar.Tgh();
        }
        int i14 = acVar.ROR;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z10) {
                    view.layout(((i10 + i14) - view.getMeasuredWidth()) - cJVar.pA(), i11, ((i12 + i14) - view.getMeasuredWidth()) - cJVar.pA(), i13);
                    return;
                }
                int ABk = cJVar.ABk();
                view.layout(cJVar.ABk() + view.getMeasuredWidth() + (i10 - i14), i11, ABk + view.getMeasuredWidth() + (i12 - i14), i13);
                return;
            } else if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int Qhi2 = ((ROR.Qhi(marginLayoutParams) + (i14 - view.getMeasuredWidth())) - ROR.cJ(marginLayoutParams)) / 2;
                if (!z10) {
                    view.layout(i10 + Qhi2, i11, i12 + Qhi2, i13);
                    return;
                } else {
                    view.layout(i10 - Qhi2, i11, i12 - Qhi2, i13);
                    return;
                }
            } else if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z10) {
            view.layout(cJVar.ABk() + i10, i11, cJVar.ABk() + i12, i13);
        } else {
            view.layout(i10 - cJVar.pA(), i11, i12 - cJVar.pA(), i13);
        }
    }

    private void Qhi(int i10, int i11, int i12, View view) {
        long[] jArr = this.cJ;
        if (jArr != null) {
            jArr[i10] = cJ(i11, i12);
        }
        long[] jArr2 = this.Tgh;
        if (jArr2 != null) {
            jArr2[i10] = cJ(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
