package com.google.android.flexbox;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.f;
import h7.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.hslf.record.SlideAtom;
import x0.h;

/* compiled from: FlexboxHelper.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final h7.a f9995a;

    /* renamed from: b  reason: collision with root package name */
    public boolean[] f9996b;
    public int[] c;

    /* renamed from: d  reason: collision with root package name */
    public long[] f9997d;

    /* renamed from: e  reason: collision with root package name */
    public long[] f9998e;

    /* compiled from: FlexboxHelper.java */
    /* renamed from: com.google.android.flexbox.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0156a {

        /* renamed from: a  reason: collision with root package name */
        public List<c> f9999a;

        /* renamed from: b  reason: collision with root package name */
        public int f10000b;
    }

    /* compiled from: FlexboxHelper.java */
    /* loaded from: classes.dex */
    public static class b implements Comparable<b> {

        /* renamed from: a  reason: collision with root package name */
        public int f10001a;

        /* renamed from: b  reason: collision with root package name */
        public int f10002b;

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            int i10 = this.f10002b;
            int i11 = bVar2.f10002b;
            if (i10 != i11) {
                return i10 - i11;
            }
            return this.f10001a - bVar2.f10001a;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Order{order=");
            sb2.append(this.f10002b);
            sb2.append(", index=");
            return f.n(sb2, this.f10001a, '}');
        }
    }

    public a(h7.a aVar) {
        this.f9995a = aVar;
    }

    public static ArrayList e(int i10, int i11, List list) {
        ArrayList arrayList = new ArrayList();
        c cVar = new c();
        cVar.f18052g = (i10 - i11) / 2;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (i12 == 0) {
                arrayList.add(cVar);
            }
            arrayList.add((c) list.get(i12));
            if (i12 == list.size() - 1) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public static int[] r(int i10, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i10];
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i12 = bVar.f10001a;
            iArr[i11] = i12;
            sparseIntArray.append(i12, bVar.f10002b);
            i11++;
        }
        return iArr;
    }

    public final void a(List<c> list, c cVar, int i10, int i11) {
        cVar.f18058m = i11;
        this.f9995a.d(cVar);
        cVar.f18061p = i10;
        list.add(cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x020a, code lost:
        if (r8 < (r13 + r15)) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.google.android.flexbox.a.C0156a r29, int r30, int r31, int r32, int r33, int r34, java.util.List<h7.c> r35) {
        /*
            Method dump skipped, instructions count: 991
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.a.b(com.google.android.flexbox.a$a, int, int, int, int, int, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            h7.b r0 = (h7.b) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.w()
            r4 = 1
            if (r1 >= r3) goto L1a
            int r1 = r0.w()
            goto L24
        L1a:
            int r3 = r0.k0()
            if (r1 <= r3) goto L26
            int r1 = r0.k0()
        L24:
            r3 = r4
            goto L27
        L26:
            r3 = 0
        L27:
            int r5 = r0.a0()
            if (r2 >= r5) goto L32
            int r2 = r0.a0()
            goto L3e
        L32:
            int r5 = r0.d0()
            if (r2 <= r5) goto L3d
            int r2 = r0.d0()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.v(r8, r1, r0, r7)
            h7.a r0 = r6.f9995a
            r0.j(r7, r8)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.a.c(android.view.View, int):void");
    }

    public final void d(int i10, List list) {
        int i11 = this.c[i10];
        if (i11 == -1) {
            i11 = 0;
        }
        if (list.size() > i11) {
            list.subList(i11, list.size()).clear();
        }
        int[] iArr = this.c;
        int length = iArr.length - 1;
        if (i10 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i10, length, -1);
        }
        long[] jArr = this.f9997d;
        int length2 = jArr.length - 1;
        if (i10 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i10, length2, 0L);
        }
    }

    public final ArrayList f(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            b bVar = new b();
            bVar.f10002b = ((h7.b) this.f9995a.f(i11).getLayoutParams()).getOrder();
            bVar.f10001a = i11;
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public final void g(int i10, int i11, int i12) {
        int mode;
        int size;
        h7.a aVar = this.f9995a;
        int flexDirection = aVar.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException(b.a.c("Invalid flex direction: ", flexDirection));
            }
            mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
        } else {
            mode = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
        }
        List<c> flexLinesInternal = aVar.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = aVar.getSumOfCrossSize() + i12;
            int i13 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f18052g = size - i12;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = aVar.getAlignContent();
                if (alignContent != 1) {
                    if (alignContent != 2) {
                        if (alignContent != 3) {
                            if (alignContent != 4) {
                                if (alignContent == 5 && sumOfCrossSize < size) {
                                    float size2 = (size - sumOfCrossSize) / flexLinesInternal.size();
                                    int size3 = flexLinesInternal.size();
                                    float f10 = 0.0f;
                                    while (i13 < size3) {
                                        c cVar = flexLinesInternal.get(i13);
                                        float f11 = cVar.f18052g + size2;
                                        if (i13 == flexLinesInternal.size() - 1) {
                                            f11 += f10;
                                            f10 = 0.0f;
                                        }
                                        int round = Math.round(f11);
                                        float f12 = (f11 - round) + f10;
                                        if (f12 > 1.0f) {
                                            round++;
                                            f12 -= 1.0f;
                                        } else if (f12 < -1.0f) {
                                            round--;
                                            f12 += 1.0f;
                                        }
                                        f10 = f12;
                                        cVar.f18052g = round;
                                        i13++;
                                    }
                                    return;
                                }
                                return;
                            } else if (sumOfCrossSize >= size) {
                                aVar.setFlexLines(e(size, sumOfCrossSize, flexLinesInternal));
                                return;
                            } else {
                                int size4 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                                ArrayList arrayList = new ArrayList();
                                c cVar2 = new c();
                                cVar2.f18052g = size4;
                                for (c cVar3 : flexLinesInternal) {
                                    arrayList.add(cVar2);
                                    arrayList.add(cVar3);
                                    arrayList.add(cVar2);
                                }
                                aVar.setFlexLines(arrayList);
                                return;
                            }
                        } else if (sumOfCrossSize < size) {
                            float size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                            ArrayList arrayList2 = new ArrayList();
                            int size6 = flexLinesInternal.size();
                            float f13 = 0.0f;
                            while (i13 < size6) {
                                arrayList2.add(flexLinesInternal.get(i13));
                                if (i13 != flexLinesInternal.size() - 1) {
                                    c cVar4 = new c();
                                    if (i13 == flexLinesInternal.size() - 2) {
                                        cVar4.f18052g = Math.round(f13 + size5);
                                        f13 = 0.0f;
                                    } else {
                                        cVar4.f18052g = Math.round(size5);
                                    }
                                    int i14 = cVar4.f18052g;
                                    float f14 = (size5 - i14) + f13;
                                    if (f14 > 1.0f) {
                                        cVar4.f18052g = i14 + 1;
                                        f14 -= 1.0f;
                                    } else if (f14 < -1.0f) {
                                        cVar4.f18052g = i14 - 1;
                                        f14 += 1.0f;
                                    }
                                    f13 = f14;
                                    arrayList2.add(cVar4);
                                }
                                i13++;
                            }
                            aVar.setFlexLines(arrayList2);
                            return;
                        } else {
                            return;
                        }
                    }
                    aVar.setFlexLines(e(size, sumOfCrossSize, flexLinesInternal));
                    return;
                }
                c cVar5 = new c();
                cVar5.f18052g = size - sumOfCrossSize;
                flexLinesInternal.add(0, cVar5);
            }
        }
    }

    public final void h(int i10, int i11, int i12) {
        int size;
        int paddingLeft;
        int paddingRight;
        h7.a aVar = this.f9995a;
        int flexItemCount = aVar.getFlexItemCount();
        boolean[] zArr = this.f9996b;
        int i13 = 0;
        if (zArr == null) {
            this.f9996b = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.f9996b = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i12 >= aVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = aVar.getFlexDirection();
        int flexDirection2 = aVar.getFlexDirection();
        if (flexDirection2 != 0 && flexDirection2 != 1) {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException(b.a.c("Invalid flex direction: ", flexDirection));
            }
            int mode = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode != 1073741824) {
                size = aVar.getLargestMainSize();
            }
            paddingLeft = aVar.getPaddingTop();
            paddingRight = aVar.getPaddingBottom();
        } else {
            int mode2 = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            int largestMainSize = aVar.getLargestMainSize();
            if (mode2 != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = aVar.getPaddingLeft();
            paddingRight = aVar.getPaddingRight();
        }
        int i14 = paddingRight + paddingLeft;
        int[] iArr = this.c;
        if (iArr != null) {
            i13 = iArr[i12];
        }
        List<c> flexLinesInternal = aVar.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i13 < size2) {
            c cVar = flexLinesInternal.get(i13);
            int i15 = cVar.f18050e;
            if (i15 < size && cVar.f18062q) {
                l(i10, i11, cVar, size, i14, false);
            } else if (i15 > size && cVar.f18063r) {
                q(i10, i11, cVar, size, i14, false);
            }
            i13++;
        }
    }

    public final void i(int i10) {
        int[] iArr = this.c;
        if (iArr == null) {
            this.c = new int[Math.max(i10, 10)];
        } else if (iArr.length < i10) {
            this.c = Arrays.copyOf(this.c, Math.max(iArr.length * 2, i10));
        }
    }

    public final void j(int i10) {
        long[] jArr = this.f9997d;
        if (jArr == null) {
            this.f9997d = new long[Math.max(i10, 10)];
        } else if (jArr.length < i10) {
            this.f9997d = Arrays.copyOf(this.f9997d, Math.max(jArr.length * 2, i10));
        }
    }

    public final void k(int i10) {
        long[] jArr = this.f9998e;
        if (jArr == null) {
            this.f9998e = new long[Math.max(i10, 10)];
        } else if (jArr.length < i10) {
            this.f9998e = Arrays.copyOf(this.f9998e, Math.max(jArr.length * 2, i10));
        }
    }

    public final void l(int i10, int i11, c cVar, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        float f10;
        h7.a aVar;
        int i16;
        h7.a aVar2;
        int max;
        double d10;
        h7.a aVar3;
        View view;
        double d11;
        float f11 = cVar.f18055j;
        if (f11 > 0.0f && i12 >= (i14 = cVar.f18050e)) {
            float f12 = (i12 - i14) / f11;
            cVar.f18050e = i13 + cVar.f18051f;
            if (!z10) {
                cVar.f18052g = SlideAtom.USES_MASTER_SLIDE_ID;
            }
            int i17 = 0;
            boolean z11 = false;
            int i18 = 0;
            float f13 = 0.0f;
            while (i17 < cVar.f18053h) {
                int i19 = cVar.f18060o + i17;
                h7.a aVar4 = this.f9995a;
                View b10 = aVar4.b(i19);
                if (b10 != null && b10.getVisibility() != 8) {
                    h7.b bVar = (h7.b) b10.getLayoutParams();
                    int flexDirection = aVar4.getFlexDirection();
                    if (flexDirection != 0 && flexDirection != 1) {
                        int measuredHeight = b10.getMeasuredHeight();
                        long[] jArr = this.f9998e;
                        if (jArr != null) {
                            measuredHeight = (int) (jArr[i19] >> 32);
                        }
                        int measuredWidth = b10.getMeasuredWidth();
                        long[] jArr2 = this.f9998e;
                        if (jArr2 != null) {
                            measuredWidth = (int) jArr2[i19];
                        }
                        if (!this.f9996b[i19] && bVar.Q() > 0.0f) {
                            float Q = (bVar.Q() * f12) + measuredHeight;
                            if (i17 == cVar.f18053h - 1) {
                                Q += f13;
                                f13 = 0.0f;
                            }
                            int round = Math.round(Q);
                            if (round > bVar.d0()) {
                                round = bVar.d0();
                                this.f9996b[i19] = true;
                                cVar.f18055j -= bVar.Q();
                                z11 = true;
                            } else {
                                float f14 = (Q - round) + f13;
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
                            int n10 = n(i10, bVar, cVar.f18058m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            b10.measure(n10, makeMeasureSpec);
                            measuredWidth = b10.getMeasuredWidth();
                            int measuredHeight2 = b10.getMeasuredHeight();
                            v(i19, n10, makeMeasureSpec, b10);
                            aVar3 = aVar4;
                            aVar3.j(b10, i19);
                            view = b10;
                            measuredHeight = measuredHeight2;
                        } else {
                            aVar3 = aVar4;
                            view = b10;
                        }
                        max = Math.max(i18, aVar3.l(view) + bVar.getMarginRight() + bVar.getMarginLeft() + measuredWidth);
                        cVar.f18050e = bVar.getMarginBottom() + bVar.getMarginTop() + measuredHeight + cVar.f18050e;
                        i15 = i14;
                        f10 = f12;
                    } else {
                        int measuredWidth2 = b10.getMeasuredWidth();
                        long[] jArr3 = this.f9998e;
                        if (jArr3 != null) {
                            measuredWidth2 = (int) jArr3[i19];
                        }
                        int measuredHeight3 = b10.getMeasuredHeight();
                        long[] jArr4 = this.f9998e;
                        if (jArr4 != null) {
                            long j10 = jArr4[i19];
                            aVar = aVar4;
                            i16 = i14;
                            measuredHeight3 = (int) (j10 >> 32);
                        } else {
                            aVar = aVar4;
                            i16 = i14;
                        }
                        if (!this.f9996b[i19] && bVar.Q() > 0.0f) {
                            float Q2 = (bVar.Q() * f12) + measuredWidth2;
                            if (i17 == cVar.f18053h - 1) {
                                Q2 += f13;
                                f13 = 0.0f;
                            }
                            int round2 = Math.round(Q2);
                            if (round2 > bVar.k0()) {
                                round2 = bVar.k0();
                                this.f9996b[i19] = true;
                                cVar.f18055j -= bVar.Q();
                                i15 = i16;
                                f10 = f12;
                                z11 = true;
                            } else {
                                float f15 = (Q2 - round2) + f13;
                                i15 = i16;
                                f10 = f12;
                                double d13 = f15;
                                if (d13 > 1.0d) {
                                    round2++;
                                    d10 = d13 - 1.0d;
                                } else if (d13 < -1.0d) {
                                    round2--;
                                    d10 = d13 + 1.0d;
                                } else {
                                    f13 = f15;
                                }
                                f13 = (float) d10;
                            }
                            int m10 = m(i11, bVar, cVar.f18058m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            b10.measure(makeMeasureSpec2, m10);
                            measuredWidth2 = b10.getMeasuredWidth();
                            measuredHeight3 = b10.getMeasuredHeight();
                            v(i19, makeMeasureSpec2, m10, b10);
                            aVar2 = aVar;
                            aVar2.j(b10, i19);
                        } else {
                            i15 = i16;
                            f10 = f12;
                            aVar2 = aVar;
                        }
                        max = Math.max(i18, aVar2.l(b10) + bVar.getMarginBottom() + bVar.getMarginTop() + measuredHeight3);
                        cVar.f18050e = bVar.getMarginRight() + bVar.getMarginLeft() + measuredWidth2 + cVar.f18050e;
                    }
                    cVar.f18052g = Math.max(cVar.f18052g, max);
                    i18 = max;
                } else {
                    i15 = i14;
                    f10 = f12;
                }
                i17++;
                f12 = f10;
                i14 = i15;
            }
            int i20 = i14;
            if (z11 && i20 != cVar.f18050e) {
                l(i10, i11, cVar, i12, i13, true);
            }
        }
    }

    public final int m(int i10, h7.b bVar, int i11) {
        h7.a aVar = this.f9995a;
        int h10 = aVar.h(i10, bVar.getMarginBottom() + bVar.getMarginTop() + aVar.getPaddingBottom() + aVar.getPaddingTop() + i11, bVar.getHeight());
        int size = View.MeasureSpec.getSize(h10);
        if (size > bVar.d0()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.d0(), View.MeasureSpec.getMode(h10));
        }
        if (size < bVar.a0()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.a0(), View.MeasureSpec.getMode(h10));
        }
        return h10;
    }

    public final int n(int i10, h7.b bVar, int i11) {
        h7.a aVar = this.f9995a;
        int c = aVar.c(i10, bVar.getMarginRight() + bVar.getMarginLeft() + aVar.getPaddingRight() + aVar.getPaddingLeft() + i11, bVar.getWidth());
        int size = View.MeasureSpec.getSize(c);
        if (size > bVar.k0()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.k0(), View.MeasureSpec.getMode(c));
        }
        if (size < bVar.w()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.w(), View.MeasureSpec.getMode(c));
        }
        return c;
    }

    public final void o(View view, c cVar, int i10, int i11, int i12, int i13) {
        h7.b bVar = (h7.b) view.getLayoutParams();
        h7.a aVar = this.f9995a;
        int alignItems = aVar.getAlignItems();
        if (bVar.u() != -1) {
            alignItems = bVar.u();
        }
        int i14 = cVar.f18052g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3) {
                        if (alignItems != 4) {
                            return;
                        }
                    } else if (aVar.getFlexWrap() != 2) {
                        int max = Math.max(cVar.f18057l - view.getBaseline(), bVar.getMarginTop());
                        view.layout(i10, i11 + max, i12, i13 + max);
                        return;
                    } else {
                        int max2 = Math.max(view.getBaseline() + (cVar.f18057l - view.getMeasuredHeight()), bVar.getMarginBottom());
                        view.layout(i10, i11 - max2, i12, i13 - max2);
                        return;
                    }
                } else {
                    int marginTop = ((bVar.getMarginTop() + (i14 - view.getMeasuredHeight())) - bVar.getMarginBottom()) / 2;
                    if (aVar.getFlexWrap() != 2) {
                        int i15 = i11 + marginTop;
                        view.layout(i10, i15, i12, view.getMeasuredHeight() + i15);
                        return;
                    }
                    int i16 = i11 - marginTop;
                    view.layout(i10, i16, i12, view.getMeasuredHeight() + i16);
                    return;
                }
            } else if (aVar.getFlexWrap() != 2) {
                int i17 = i11 + i14;
                view.layout(i10, (i17 - view.getMeasuredHeight()) - bVar.getMarginBottom(), i12, i17 - bVar.getMarginBottom());
                return;
            } else {
                view.layout(i10, bVar.getMarginTop() + view.getMeasuredHeight() + (i11 - i14), i12, bVar.getMarginTop() + view.getMeasuredHeight() + (i13 - i14));
                return;
            }
        }
        if (aVar.getFlexWrap() != 2) {
            view.layout(i10, bVar.getMarginTop() + i11, i12, bVar.getMarginTop() + i13);
        } else {
            view.layout(i10, i11 - bVar.getMarginBottom(), i12, i13 - bVar.getMarginBottom());
        }
    }

    public final void p(View view, c cVar, boolean z10, int i10, int i11, int i12, int i13) {
        h7.b bVar = (h7.b) view.getLayoutParams();
        int alignItems = this.f9995a.getAlignItems();
        if (bVar.u() != -1) {
            alignItems = bVar.u();
        }
        int i14 = cVar.f18052g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3 && alignItems != 4) {
                        return;
                    }
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int c = ((h.c(marginLayoutParams) + (i14 - view.getMeasuredWidth())) - h.b(marginLayoutParams)) / 2;
                    if (!z10) {
                        view.layout(i10 + c, i11, i12 + c, i13);
                        return;
                    } else {
                        view.layout(i10 - c, i11, i12 - c, i13);
                        return;
                    }
                }
            } else if (!z10) {
                view.layout(((i10 + i14) - view.getMeasuredWidth()) - bVar.getMarginRight(), i11, ((i12 + i14) - view.getMeasuredWidth()) - bVar.getMarginRight(), i13);
                return;
            } else {
                int marginLeft = bVar.getMarginLeft();
                view.layout(bVar.getMarginLeft() + view.getMeasuredWidth() + (i10 - i14), i11, marginLeft + view.getMeasuredWidth() + (i12 - i14), i13);
                return;
            }
        }
        if (!z10) {
            view.layout(bVar.getMarginLeft() + i10, i11, bVar.getMarginLeft() + i12, i13);
        } else {
            view.layout(i10 - bVar.getMarginRight(), i11, i12 - bVar.getMarginRight(), i13);
        }
    }

    public final void q(int i10, int i11, c cVar, int i12, int i13, boolean z10) {
        float f10;
        View view;
        int max;
        int i14;
        h7.a aVar;
        View view2;
        int i15;
        int i16 = cVar.f18050e;
        float f11 = cVar.f18056k;
        if (f11 > 0.0f && i12 <= i16) {
            float f12 = (i16 - i12) / f11;
            cVar.f18050e = i13 + cVar.f18051f;
            if (!z10) {
                cVar.f18052g = SlideAtom.USES_MASTER_SLIDE_ID;
            }
            int i17 = 0;
            boolean z11 = false;
            int i18 = 0;
            float f13 = 0.0f;
            while (i17 < cVar.f18053h) {
                int i19 = cVar.f18060o + i17;
                h7.a aVar2 = this.f9995a;
                View b10 = aVar2.b(i19);
                if (b10 != null && b10.getVisibility() != 8) {
                    h7.b bVar = (h7.b) b10.getLayoutParams();
                    int flexDirection = aVar2.getFlexDirection();
                    if (flexDirection != 0 && flexDirection != 1) {
                        int measuredHeight = b10.getMeasuredHeight();
                        long[] jArr = this.f9998e;
                        if (jArr != null) {
                            measuredHeight = (int) (jArr[i19] >> 32);
                        }
                        int measuredWidth = b10.getMeasuredWidth();
                        long[] jArr2 = this.f9998e;
                        if (jArr2 != null) {
                            measuredWidth = (int) jArr2[i19];
                        }
                        if (!this.f9996b[i19] && bVar.v() > 0.0f) {
                            float v10 = measuredHeight - (bVar.v() * f12);
                            if (i17 == cVar.f18053h - 1) {
                                v10 += f13;
                                f13 = 0.0f;
                            }
                            int round = Math.round(v10);
                            if (round < bVar.a0()) {
                                i15 = bVar.a0();
                                this.f9996b[i19] = true;
                                cVar.f18056k -= bVar.v();
                                z11 = true;
                            } else {
                                float f14 = (v10 - round) + f13;
                                double d10 = f14;
                                if (d10 > 1.0d) {
                                    round++;
                                    f14 -= 1.0f;
                                } else if (d10 < -1.0d) {
                                    round--;
                                    f14 += 1.0f;
                                }
                                f13 = f14;
                                i15 = round;
                            }
                            int n10 = n(i10, bVar, cVar.f18058m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                            b10.measure(n10, makeMeasureSpec);
                            measuredWidth = b10.getMeasuredWidth();
                            int measuredHeight2 = b10.getMeasuredHeight();
                            v(i19, n10, makeMeasureSpec, b10);
                            aVar = aVar2;
                            aVar.j(b10, i19);
                            view2 = b10;
                            measuredHeight = measuredHeight2;
                        } else {
                            aVar = aVar2;
                            view2 = b10;
                        }
                        max = Math.max(i18, aVar.l(view2) + bVar.getMarginRight() + bVar.getMarginLeft() + measuredWidth);
                        cVar.f18050e = bVar.getMarginBottom() + bVar.getMarginTop() + measuredHeight + cVar.f18050e;
                        f10 = f12;
                    } else {
                        int measuredWidth2 = b10.getMeasuredWidth();
                        long[] jArr3 = this.f9998e;
                        if (jArr3 != null) {
                            measuredWidth2 = (int) jArr3[i19];
                        }
                        int measuredHeight3 = b10.getMeasuredHeight();
                        long[] jArr4 = this.f9998e;
                        if (jArr4 != null) {
                            long j10 = jArr4[i19];
                            view = b10;
                            measuredHeight3 = (int) (j10 >> 32);
                        } else {
                            view = b10;
                        }
                        if (!this.f9996b[i19] && bVar.v() > 0.0f) {
                            float v11 = measuredWidth2 - (bVar.v() * f12);
                            boolean z12 = true;
                            if (i17 == cVar.f18053h - 1) {
                                v11 += f13;
                                f13 = 0.0f;
                            }
                            int round2 = Math.round(v11);
                            if (round2 < bVar.w()) {
                                i14 = bVar.w();
                                this.f9996b[i19] = true;
                                cVar.f18056k -= bVar.v();
                                f10 = f12;
                            } else {
                                float f15 = (v11 - round2) + f13;
                                f10 = f12;
                                boolean z13 = z11;
                                double d11 = f15;
                                if (d11 > 1.0d) {
                                    round2++;
                                    f15 -= 1.0f;
                                } else if (d11 < -1.0d) {
                                    round2--;
                                    f15 += 1.0f;
                                }
                                f13 = f15;
                                i14 = round2;
                                z12 = z13;
                            }
                            int m10 = m(i11, bVar, cVar.f18058m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                            view.measure(makeMeasureSpec2, m10);
                            measuredWidth2 = view.getMeasuredWidth();
                            int measuredHeight4 = view.getMeasuredHeight();
                            v(i19, makeMeasureSpec2, m10, view);
                            aVar2.j(view, i19);
                            z11 = z12;
                            measuredHeight3 = measuredHeight4;
                        } else {
                            f10 = f12;
                            z11 = z11;
                        }
                        max = Math.max(i18, aVar2.l(view) + bVar.getMarginBottom() + bVar.getMarginTop() + measuredHeight3);
                        cVar.f18050e = bVar.getMarginRight() + bVar.getMarginLeft() + measuredWidth2 + cVar.f18050e;
                    }
                    cVar.f18052g = Math.max(cVar.f18052g, max);
                    i18 = max;
                } else {
                    f10 = f12;
                    z11 = z11;
                }
                i17++;
                f12 = f10;
            }
            if (z11 && i16 != cVar.f18050e) {
                q(i10, i11, cVar, i12, i13, true);
            }
        }
    }

    public final void s(View view, int i10, int i11) {
        int measuredHeight;
        h7.b bVar = (h7.b) view.getLayoutParams();
        int marginLeft = (i10 - bVar.getMarginLeft()) - bVar.getMarginRight();
        h7.a aVar = this.f9995a;
        int min = Math.min(Math.max(marginLeft - aVar.l(view), bVar.w()), bVar.k0());
        long[] jArr = this.f9998e;
        if (jArr != null) {
            measuredHeight = (int) (jArr[i11] >> 32);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        v(i11, makeMeasureSpec2, makeMeasureSpec, view);
        aVar.j(view, i11);
    }

    public final void t(View view, int i10, int i11) {
        int measuredWidth;
        h7.b bVar = (h7.b) view.getLayoutParams();
        int marginTop = (i10 - bVar.getMarginTop()) - bVar.getMarginBottom();
        h7.a aVar = this.f9995a;
        int min = Math.min(Math.max(marginTop - aVar.l(view), bVar.a0()), bVar.d0());
        long[] jArr = this.f9998e;
        if (jArr != null) {
            measuredWidth = (int) jArr[i11];
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        v(i11, makeMeasureSpec, makeMeasureSpec2, view);
        aVar.j(view, i11);
    }

    public final void u(int i10) {
        int i11;
        View b10;
        h7.a aVar = this.f9995a;
        if (i10 >= aVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = aVar.getFlexDirection();
        if (aVar.getAlignItems() == 4) {
            int[] iArr = this.c;
            if (iArr != null) {
                i11 = iArr[i10];
            } else {
                i11 = 0;
            }
            List<c> flexLinesInternal = aVar.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            while (i11 < size) {
                c cVar = flexLinesInternal.get(i11);
                int i12 = cVar.f18053h;
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = cVar.f18060o + i13;
                    if (i13 < aVar.getFlexItemCount() && (b10 = aVar.b(i14)) != null && b10.getVisibility() != 8) {
                        h7.b bVar = (h7.b) b10.getLayoutParams();
                        if (bVar.u() == -1 || bVar.u() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    throw new IllegalArgumentException(b.a.c("Invalid flex direction: ", flexDirection));
                                }
                                s(b10, cVar.f18052g, i14);
                            } else {
                                t(b10, cVar.f18052g, i14);
                            }
                        }
                    }
                }
                i11++;
            }
            return;
        }
        for (c cVar2 : aVar.getFlexLinesInternal()) {
            Iterator it = cVar2.f18059n.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                View b11 = aVar.b(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        throw new IllegalArgumentException(b.a.c("Invalid flex direction: ", flexDirection));
                    }
                    s(b11, cVar2.f18052g, num.intValue());
                } else {
                    t(b11, cVar2.f18052g, num.intValue());
                }
            }
        }
    }

    public final void v(int i10, int i11, int i12, View view) {
        long[] jArr = this.f9997d;
        if (jArr != null) {
            jArr[i10] = (i11 & 4294967295L) | (i12 << 32);
        }
        long[] jArr2 = this.f9998e;
        if (jArr2 != null) {
            jArr2[i10] = (view.getMeasuredWidth() & 4294967295L) | (view.getMeasuredHeight() << 32);
        }
    }
}
