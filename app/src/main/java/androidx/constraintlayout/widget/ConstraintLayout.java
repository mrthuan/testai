package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.g;
import androidx.constraintlayout.core.widgets.i;
import com.google.android.gms.common.api.Api;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import d0.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: p  reason: collision with root package name */
    public static androidx.constraintlayout.widget.b f3278p;

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<View> f3279a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<ConstraintHelper> f3280b;
    public final d c;

    /* renamed from: d  reason: collision with root package name */
    public int f3281d;

    /* renamed from: e  reason: collision with root package name */
    public int f3282e;

    /* renamed from: f  reason: collision with root package name */
    public int f3283f;

    /* renamed from: g  reason: collision with root package name */
    public int f3284g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3285h;

    /* renamed from: i  reason: collision with root package name */
    public int f3286i;

    /* renamed from: j  reason: collision with root package name */
    public androidx.constraintlayout.widget.a f3287j;

    /* renamed from: k  reason: collision with root package name */
    public g0.a f3288k;

    /* renamed from: l  reason: collision with root package name */
    public int f3289l;

    /* renamed from: m  reason: collision with root package name */
    public HashMap<String, Integer> f3290m;

    /* renamed from: n  reason: collision with root package name */
    public final SparseArray<ConstraintWidget> f3291n;

    /* renamed from: o  reason: collision with root package name */
    public final c f3292o;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3293a;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            f3293a = iArr;
            try {
                iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3293a[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3293a[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3293a[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements b.InterfaceC0188b {

        /* renamed from: a  reason: collision with root package name */
        public final ConstraintLayout f3337a;

        /* renamed from: b  reason: collision with root package name */
        public int f3338b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f3339d;

        /* renamed from: e  reason: collision with root package name */
        public int f3340e;

        /* renamed from: f  reason: collision with root package name */
        public int f3341f;

        /* renamed from: g  reason: collision with root package name */
        public int f3342g;

        public c(ConstraintLayout constraintLayout) {
            this.f3337a = constraintLayout;
        }

        public static boolean a(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                if ((mode == Integer.MIN_VALUE || mode == 0) && i12 == size) {
                    return true;
                }
                return false;
            }
            return false;
        }

        @SuppressLint({"WrongCall"})
        public final void b(ConstraintWidget constraintWidget, b.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            boolean z16;
            int baseline;
            int i15;
            boolean z17;
            boolean z18;
            boolean z19;
            boolean z20;
            int i16;
            boolean z21;
            boolean z22;
            boolean z23;
            int childMeasureSpec;
            int i17;
            boolean z24;
            boolean z25;
            boolean z26;
            if (constraintWidget == null) {
                return;
            }
            if (constraintWidget.f2827j0 == 8 && !constraintWidget.G) {
                aVar.f16011e = 0;
                aVar.f16012f = 0;
                aVar.f16013g = 0;
            } else if (constraintWidget.W == null) {
            } else {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f16008a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar.f16009b;
                int i18 = aVar.c;
                int i19 = aVar.f16010d;
                int i20 = this.f3338b + this.c;
                int i21 = this.f3339d;
                View view = (View) constraintWidget.f2825i0;
                int[] iArr = a.f3293a;
                int i22 = iArr[dimensionBehaviour.ordinal()];
                ConstraintAnchor constraintAnchor = constraintWidget.M;
                ConstraintAnchor constraintAnchor2 = constraintWidget.K;
                if (i22 != 1) {
                    if (i22 != 2) {
                        if (i22 != 3) {
                            if (i22 != 4) {
                                makeMeasureSpec = 0;
                            } else {
                                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3341f, i21, -2);
                                if (constraintWidget.f2844s == 1) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                int i23 = aVar.f16016j;
                                if (i23 == 1 || i23 == 2) {
                                    if (view.getMeasuredHeight() == constraintWidget.o()) {
                                        z25 = true;
                                    } else {
                                        z25 = false;
                                    }
                                    if (aVar.f16016j != 2 && z24 && ((!z24 || !z25) && !(view instanceof Placeholder) && !constraintWidget.E())) {
                                        z26 = false;
                                    } else {
                                        z26 = true;
                                    }
                                    if (z26) {
                                        childMeasureSpec = View.MeasureSpec.makeMeasureSpec(constraintWidget.u(), 1073741824);
                                    }
                                }
                            }
                        } else {
                            int i24 = this.f3341f;
                            if (constraintAnchor2 != null) {
                                i17 = constraintAnchor2.f2804g + 0;
                            } else {
                                i17 = 0;
                            }
                            if (constraintAnchor != null) {
                                i17 += constraintAnchor.f2804g;
                            }
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i24, i21 + i17, -1);
                        }
                    } else {
                        childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3341f, i21, -2);
                    }
                    makeMeasureSpec = childMeasureSpec;
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                }
                int i25 = iArr[dimensionBehaviour2.ordinal()];
                if (i25 != 1) {
                    if (i25 != 2) {
                        if (i25 != 3) {
                            if (i25 != 4) {
                                makeMeasureSpec2 = 0;
                            } else {
                                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3342g, i20, -2);
                                if (constraintWidget.f2846t == 1) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                int i26 = aVar.f16016j;
                                if (i26 == 1 || i26 == 2) {
                                    if (view.getMeasuredWidth() == constraintWidget.u()) {
                                        z22 = true;
                                    } else {
                                        z22 = false;
                                    }
                                    if (aVar.f16016j != 2 && z21 && ((!z21 || !z22) && !(view instanceof Placeholder) && !constraintWidget.F())) {
                                        z23 = false;
                                    } else {
                                        z23 = true;
                                    }
                                    if (z23) {
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.o(), 1073741824);
                                    }
                                }
                            }
                        } else {
                            int i27 = this.f3342g;
                            if (constraintAnchor2 != null) {
                                i16 = constraintWidget.L.f2804g + 0;
                            } else {
                                i16 = 0;
                            }
                            if (constraintAnchor != null) {
                                i16 += constraintWidget.N.f2804g;
                            }
                            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i27, i20 + i16, -1);
                        }
                    } else {
                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3342g, i20, -2);
                    }
                } else {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
                }
                d dVar = (d) constraintWidget.W;
                ConstraintLayout constraintLayout = ConstraintLayout.this;
                if (dVar != null && g.b(constraintLayout.f3286i, 256) && view.getMeasuredWidth() == constraintWidget.u() && view.getMeasuredWidth() < dVar.u() && view.getMeasuredHeight() == constraintWidget.o() && view.getMeasuredHeight() < dVar.o() && view.getBaseline() == constraintWidget.f2815d0 && !constraintWidget.D()) {
                    if (a(constraintWidget.I, makeMeasureSpec, constraintWidget.u()) && a(constraintWidget.J, makeMeasureSpec2, constraintWidget.o())) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    if (z20) {
                        aVar.f16011e = constraintWidget.u();
                        aVar.f16012f = constraintWidget.o();
                        aVar.f16013g = constraintWidget.f2815d0;
                        return;
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour == dimensionBehaviour3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (dimensionBehaviour2 == dimensionBehaviour3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (dimensionBehaviour2 != dimensionBehaviour4 && dimensionBehaviour2 != ConstraintWidget.DimensionBehaviour.FIXED) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (dimensionBehaviour != dimensionBehaviour4 && dimensionBehaviour != ConstraintWidget.DimensionBehaviour.FIXED) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z10 && constraintWidget.Z > 0.0f) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z11 && constraintWidget.Z > 0.0f) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (view == null) {
                    return;
                }
                b bVar = (b) view.getLayoutParams();
                int i28 = aVar.f16016j;
                if (i28 != 1 && i28 != 2 && z10 && constraintWidget.f2844s == 0 && z11 && constraintWidget.f2846t == 0) {
                    i15 = -1;
                    baseline = 0;
                    z16 = false;
                    i10 = 0;
                    i12 = 0;
                } else {
                    if ((view instanceof VirtualLayout) && (constraintWidget instanceof i)) {
                        ((VirtualLayout) view).u((i) constraintWidget, makeMeasureSpec, makeMeasureSpec2);
                    } else {
                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                    }
                    constraintWidget.I = makeMeasureSpec;
                    constraintWidget.J = makeMeasureSpec2;
                    constraintWidget.f2820g = false;
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    int baseline2 = view.getBaseline();
                    int i29 = constraintWidget.f2850v;
                    if (i29 > 0) {
                        i10 = Math.max(i29, measuredWidth);
                    } else {
                        i10 = measuredWidth;
                    }
                    int i30 = constraintWidget.f2852w;
                    if (i30 > 0) {
                        i10 = Math.min(i30, i10);
                    }
                    int i31 = constraintWidget.f2854y;
                    if (i31 > 0) {
                        i12 = Math.max(i31, measuredHeight);
                        i11 = makeMeasureSpec2;
                    } else {
                        i11 = makeMeasureSpec2;
                        i12 = measuredHeight;
                    }
                    int i32 = constraintWidget.f2855z;
                    if (i32 > 0) {
                        i12 = Math.min(i32, i12);
                    }
                    if (!g.b(constraintLayout.f3286i, 1)) {
                        if (z14 && z12) {
                            i10 = (int) ((i12 * constraintWidget.Z) + 0.5f);
                        } else if (z15 && z13) {
                            i12 = (int) ((i10 / constraintWidget.Z) + 0.5f);
                        }
                    }
                    if (measuredWidth == i10 && measuredHeight == i12) {
                        baseline = baseline2;
                        z16 = false;
                    } else {
                        if (measuredWidth != i10) {
                            i13 = 1073741824;
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                        } else {
                            i13 = 1073741824;
                        }
                        if (measuredHeight != i12) {
                            i14 = View.MeasureSpec.makeMeasureSpec(i12, i13);
                        } else {
                            i14 = i11;
                        }
                        view.measure(makeMeasureSpec, i14);
                        constraintWidget.I = makeMeasureSpec;
                        constraintWidget.J = i14;
                        z16 = false;
                        constraintWidget.f2820g = false;
                        int measuredWidth2 = view.getMeasuredWidth();
                        int measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        i10 = measuredWidth2;
                        i12 = measuredHeight2;
                    }
                    i15 = -1;
                }
                if (baseline != i15) {
                    z17 = true;
                } else {
                    z17 = z16;
                }
                if (i10 == aVar.c && i12 == aVar.f16010d) {
                    z18 = z16;
                } else {
                    z18 = true;
                }
                aVar.f16015i = z18;
                if (bVar.f3298c0) {
                    z19 = true;
                } else {
                    z19 = z17;
                }
                if (z19 && baseline != -1 && constraintWidget.f2815d0 != baseline) {
                    aVar.f16015i = true;
                }
                aVar.f16011e = i10;
                aVar.f16012f = i12;
                aVar.f16014h = z19;
                aVar.f16013g = baseline;
            }
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.f3279a = new SparseArray<>();
        this.f3280b = new ArrayList<>(4);
        this.c = new d();
        this.f3281d = 0;
        this.f3282e = 0;
        this.f3283f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f3284g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f3285h = true;
        this.f3286i = 257;
        this.f3287j = null;
        this.f3288k = null;
        this.f3289l = -1;
        this.f3290m = new HashMap<>();
        this.f3291n = new SparseArray<>();
        this.f3292o = new c(this);
        e(null, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public static androidx.constraintlayout.widget.b getSharedValues() {
        if (f3278p == null) {
            f3278p = new androidx.constraintlayout.widget.b();
        }
        return f3278p;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x02d0 -> B:153:0x02d1). Please submit an issue!!! */
    public final void b(boolean z10, View view, ConstraintWidget constraintWidget, b bVar, SparseArray<ConstraintWidget> sparseArray) {
        float f10;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        int i10;
        int i11;
        float f11;
        int i12;
        float f12;
        bVar.a();
        constraintWidget.f2827j0 = view.getVisibility();
        if (bVar.f3304f0) {
            constraintWidget.G = true;
            constraintWidget.f2827j0 = 8;
        }
        constraintWidget.f2825i0 = view;
        if (view instanceof ConstraintHelper) {
            ((ConstraintHelper) view).p(constraintWidget, this.c.B0);
        }
        int i13 = -1;
        if (bVar.f3300d0) {
            f fVar = (f) constraintWidget;
            int i14 = bVar.f3320n0;
            int i15 = bVar.f3322o0;
            float f13 = bVar.f3324p0;
            int i16 = (f13 > (-1.0f) ? 1 : (f13 == (-1.0f) ? 0 : -1));
            if (i16 != 0) {
                if (i16 > 0) {
                    fVar.f2934w0 = f13;
                    fVar.f2935x0 = -1;
                    fVar.f2936y0 = -1;
                    return;
                }
                return;
            } else if (i14 != -1) {
                if (i14 > -1) {
                    fVar.f2934w0 = -1.0f;
                    fVar.f2935x0 = i14;
                    fVar.f2936y0 = -1;
                    return;
                }
                return;
            } else if (i15 != -1 && i15 > -1) {
                fVar.f2934w0 = -1.0f;
                fVar.f2935x0 = -1;
                fVar.f2936y0 = i15;
                return;
            } else {
                return;
            }
        }
        int i17 = bVar.f3306g0;
        int i18 = bVar.f3308h0;
        int i19 = bVar.f3310i0;
        int i20 = bVar.f3312j0;
        int i21 = bVar.f3314k0;
        int i22 = bVar.f3316l0;
        float f14 = bVar.f3318m0;
        int i23 = bVar.f3323p;
        if (i23 != -1) {
            ConstraintWidget constraintWidget6 = sparseArray.get(i23);
            if (constraintWidget6 != null) {
                float f15 = bVar.f3327r;
                int i24 = bVar.f3325q;
                ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
                f12 = 0.0f;
                constraintWidget.z(type, constraintWidget6, type, i24, 0);
                constraintWidget.E = f15;
            } else {
                f12 = 0.0f;
            }
            f10 = f12;
        } else {
            if (i17 != -1) {
                ConstraintWidget constraintWidget7 = sparseArray.get(i17);
                if (constraintWidget7 != null) {
                    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.LEFT;
                    f10 = 0.0f;
                    constraintWidget.z(type2, constraintWidget7, type2, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i21);
                } else {
                    f10 = 0.0f;
                }
            } else {
                f10 = 0.0f;
                if (i18 != -1 && (constraintWidget2 = sparseArray.get(i18)) != null) {
                    constraintWidget.z(ConstraintAnchor.Type.LEFT, constraintWidget2, ConstraintAnchor.Type.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i21);
                }
            }
            if (i19 != -1) {
                ConstraintWidget constraintWidget8 = sparseArray.get(i19);
                if (constraintWidget8 != null) {
                    constraintWidget.z(ConstraintAnchor.Type.RIGHT, constraintWidget8, ConstraintAnchor.Type.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i22);
                }
            } else if (i20 != -1 && (constraintWidget3 = sparseArray.get(i20)) != null) {
                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.z(type3, constraintWidget3, type3, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i22);
            }
            int i25 = bVar.f3309i;
            if (i25 != -1) {
                ConstraintWidget constraintWidget9 = sparseArray.get(i25);
                if (constraintWidget9 != null) {
                    ConstraintAnchor.Type type4 = ConstraintAnchor.Type.TOP;
                    constraintWidget.z(type4, constraintWidget9, type4, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f3333x);
                }
            } else {
                int i26 = bVar.f3311j;
                if (i26 != -1 && (constraintWidget4 = sparseArray.get(i26)) != null) {
                    constraintWidget.z(ConstraintAnchor.Type.TOP, constraintWidget4, ConstraintAnchor.Type.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f3333x);
                }
            }
            int i27 = bVar.f3313k;
            if (i27 != -1) {
                ConstraintWidget constraintWidget10 = sparseArray.get(i27);
                if (constraintWidget10 != null) {
                    constraintWidget.z(ConstraintAnchor.Type.BOTTOM, constraintWidget10, ConstraintAnchor.Type.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f3335z);
                }
            } else {
                int i28 = bVar.f3315l;
                if (i28 != -1 && (constraintWidget5 = sparseArray.get(i28)) != null) {
                    ConstraintAnchor.Type type5 = ConstraintAnchor.Type.BOTTOM;
                    constraintWidget.z(type5, constraintWidget5, type5, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f3335z);
                }
            }
            int i29 = bVar.f3317m;
            if (i29 != -1) {
                q(constraintWidget, bVar, sparseArray, i29, ConstraintAnchor.Type.BASELINE);
            } else {
                int i30 = bVar.f3319n;
                if (i30 != -1) {
                    q(constraintWidget, bVar, sparseArray, i30, ConstraintAnchor.Type.TOP);
                } else {
                    int i31 = bVar.f3321o;
                    if (i31 != -1) {
                        q(constraintWidget, bVar, sparseArray, i31, ConstraintAnchor.Type.BOTTOM);
                    }
                }
            }
            if (f14 >= f10) {
                constraintWidget.f2821g0 = f14;
            }
            float f16 = bVar.F;
            if (f16 >= f10) {
                constraintWidget.f2823h0 = f16;
            }
        }
        if (z10 && ((i12 = bVar.T) != -1 || bVar.U != -1)) {
            int i32 = bVar.U;
            constraintWidget.f2812b0 = i12;
            constraintWidget.f2813c0 = i32;
        }
        int i33 = 0;
        if (!bVar.f3295a0) {
            if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
                if (bVar.W) {
                    constraintWidget.P(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                } else {
                    constraintWidget.P(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                }
                constraintWidget.m(ConstraintAnchor.Type.LEFT).f2804g = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                constraintWidget.m(ConstraintAnchor.Type.RIGHT).f2804g = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            } else {
                constraintWidget.P(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                constraintWidget.R(0);
            }
        } else {
            constraintWidget.P(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.R(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                constraintWidget.P(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        }
        if (!bVar.f3297b0) {
            if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
                if (bVar.X) {
                    constraintWidget.Q(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                } else {
                    constraintWidget.Q(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                }
                constraintWidget.m(ConstraintAnchor.Type.TOP).f2804g = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                constraintWidget.m(ConstraintAnchor.Type.BOTTOM).f2804g = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            } else {
                constraintWidget.Q(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                constraintWidget.O(0);
            }
        } else {
            constraintWidget.Q(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.O(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                constraintWidget.Q(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        }
        String str = bVar.G;
        if (str != null && str.length() != 0) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i13 = 0;
                } else if (substring.equalsIgnoreCase(StandardStructureTypes.H)) {
                    i10 = 1;
                    i13 = 1;
                    i11 = indexOf + i10;
                }
                i10 = 1;
                i11 = indexOf + i10;
            } else {
                i10 = 1;
                i11 = 0;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - i10) {
                String substring2 = str.substring(i11, indexOf2);
                String substring3 = str.substring(indexOf2 + i10);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > f10 && parseFloat2 > f10) {
                        if (i13 == 1) {
                            f11 = Math.abs(parseFloat2 / parseFloat);
                        } else {
                            f11 = Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
                f11 = f10;
            } else {
                String substring4 = str.substring(i11);
                if (substring4.length() > 0) {
                    f11 = Float.parseFloat(substring4);
                }
                f11 = f10;
            }
            if (f11 > f10) {
                constraintWidget.Z = f11;
                constraintWidget.f2810a0 = i13;
            }
        } else {
            constraintWidget.Z = f10;
        }
        float f17 = bVar.H;
        float[] fArr = constraintWidget.f2839p0;
        fArr[0] = f17;
        fArr[1] = bVar.I;
        constraintWidget.f2835n0 = bVar.J;
        constraintWidget.f2837o0 = bVar.K;
        int i34 = bVar.Z;
        if (i34 >= 0 && i34 <= 3) {
            constraintWidget.f2842r = i34;
        }
        int i35 = bVar.L;
        int i36 = bVar.N;
        int i37 = bVar.P;
        float f18 = bVar.R;
        constraintWidget.f2844s = i35;
        constraintWidget.f2850v = i36;
        if (i37 == Integer.MAX_VALUE) {
            i37 = 0;
        }
        constraintWidget.f2852w = i37;
        constraintWidget.f2853x = f18;
        if (f18 > f10 && f18 < 1.0f && i35 == 0) {
            constraintWidget.f2844s = 2;
        }
        int i38 = bVar.M;
        int i39 = bVar.O;
        int i40 = bVar.Q;
        float f19 = bVar.S;
        constraintWidget.f2846t = i38;
        constraintWidget.f2854y = i39;
        if (i40 != Integer.MAX_VALUE) {
            i33 = i40;
        }
        constraintWidget.f2855z = i33;
        constraintWidget.A = f19;
        if (f19 > f10 && f19 < 1.0f && i38 == 0) {
            constraintWidget.f2846t = 2;
        }
    }

    public final View c(int i10) {
        return this.f3279a.get(i10);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    public final ConstraintWidget d(View view) {
        if (view == this) {
            return this.c;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof b) {
                return ((b) view.getLayoutParams()).f3326q0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof b) {
                return ((b) view.getLayoutParams()).f3326q0;
            }
            return null;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.f3280b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.get(i10).r(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((parseInt / 1080.0f) * width);
                        int i13 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i12;
                        float f11 = i13;
                        float f12 = i12 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float parseInt4 = i13 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, parseInt4, paint);
                        canvas.drawLine(f12, parseInt4, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f12, f11, paint);
                    }
                }
            }
        }
    }

    public final void e(AttributeSet attributeSet, int i10, int i11) {
        d dVar = this.c;
        dVar.f2825i0 = this;
        c cVar = this.f3292o;
        dVar.A0 = cVar;
        dVar.f2907y0.f16023f = cVar;
        this.f3279a.put(getId(), this);
        this.f3287j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g0.d.c, i10, i11);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == 16) {
                    this.f3281d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3281d);
                } else if (index == 17) {
                    this.f3282e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3282e);
                } else if (index == 14) {
                    this.f3283f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3283f);
                } else if (index == 15) {
                    this.f3284g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3284g);
                } else if (index == 113) {
                    this.f3286i = obtainStyledAttributes.getInt(index, this.f3286i);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            g(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f3288k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
                        this.f3287j = aVar;
                        aVar.m(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f3287j = null;
                    }
                    this.f3289l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        dVar.J0 = this.f3286i;
        androidx.constraintlayout.core.c.f2777p = dVar.Z(512);
    }

    public final boolean f() {
        boolean z10;
        if ((getContext().getApplicationInfo().flags & 4194304) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f3285h = true;
        super.forceLayout();
    }

    public void g(int i10) {
        this.f3288k = new g0.a(getContext(), this, i10);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f3284g;
    }

    public int getMaxWidth() {
        return this.f3283f;
    }

    public int getMinHeight() {
        return this.f3282e;
    }

    public int getMinWidth() {
        return this.f3281d;
    }

    public int getOptimizationLevel() {
        return this.c.J0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        d dVar = this.c;
        if (dVar.f2828k == null) {
            int id3 = getId();
            if (id3 != -1) {
                dVar.f2828k = getContext().getResources().getResourceEntryName(id3);
            } else {
                dVar.f2828k = "parent";
            }
        }
        if (dVar.f2831l0 == null) {
            dVar.f2831l0 = dVar.f2828k;
        }
        Iterator<ConstraintWidget> it = dVar.f5504w0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            View view = (View) next.f2825i0;
            if (view != null) {
                if (next.f2828k == null && (id2 = view.getId()) != -1) {
                    next.f2828k = getContext().getResources().getResourceEntryName(id2);
                }
                if (next.f2831l0 == null) {
                    next.f2831l0 = next.f2828k;
                }
            }
        }
        dVar.r(sb2);
        return sb2.toString();
    }

    public final void h(int i10, int i11, int i12, boolean z10, boolean z11, int i13) {
        c cVar = this.f3292o;
        int i14 = cVar.f3340e;
        int resolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f3339d, i10, 0);
        int min = Math.min(this.f3283f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f3284g, View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x04d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b6 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(androidx.constraintlayout.core.widgets.d r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.i(androidx.constraintlayout.core.widgets.d, int, int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = bVar.f3326q0;
            if ((childAt.getVisibility() != 8 || bVar.f3300d0 || bVar.f3302e0 || isInEditMode) && !bVar.f3304f0) {
                int v10 = constraintWidget.v();
                int w7 = constraintWidget.w();
                int u7 = constraintWidget.u() + v10;
                int o10 = constraintWidget.o() + w7;
                childAt.layout(v10, w7, u7, o10);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(v10, w7, u7, o10);
                }
            }
        }
        ArrayList<ConstraintHelper> arrayList = this.f3280b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                arrayList.get(i15).q();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        String resourceName;
        int id2;
        ConstraintWidget constraintWidget;
        int i12 = 0;
        boolean z10 = true;
        if (!this.f3285h) {
            int childCount = getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                } else if (getChildAt(i13).isLayoutRequested()) {
                    this.f3285h = true;
                    break;
                } else {
                    i13++;
                }
            }
        }
        boolean f10 = f();
        d dVar = this.c;
        dVar.B0 = f10;
        if (this.f3285h) {
            this.f3285h = false;
            int childCount2 = getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 < childCount2) {
                    if (getChildAt(i14).isLayoutRequested()) {
                        break;
                    }
                    i14++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                boolean isInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i15 = 0; i15 < childCount3; i15++) {
                    ConstraintWidget d10 = d(getChildAt(i15));
                    if (d10 != null) {
                        d10.G();
                    }
                }
                if (isInEditMode) {
                    for (int i16 = 0; i16 < childCount3; i16++) {
                        View childAt = getChildAt(i16);
                        try {
                            resourceName = getResources().getResourceName(childAt.getId());
                            p(resourceName, Integer.valueOf(childAt.getId()));
                            int indexOf = resourceName.indexOf(47);
                            if (indexOf != -1) {
                                resourceName = resourceName.substring(indexOf + 1);
                            }
                            id2 = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id2 != 0) {
                            View view = this.f3279a.get(id2);
                            if (view == null && (view = findViewById(id2)) != null && view != this && view.getParent() == this) {
                                onViewAdded(view);
                            }
                            if (view != this) {
                                if (view == null) {
                                    constraintWidget = null;
                                } else {
                                    constraintWidget = ((b) view.getLayoutParams()).f3326q0;
                                }
                                constraintWidget.f2831l0 = resourceName;
                            }
                        }
                        constraintWidget = dVar;
                        constraintWidget.f2831l0 = resourceName;
                    }
                }
                if (this.f3289l != -1) {
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt2 = getChildAt(i17);
                        if (childAt2.getId() == this.f3289l && (childAt2 instanceof Constraints)) {
                            this.f3287j = ((Constraints) childAt2).getConstraintSet();
                        }
                    }
                }
                androidx.constraintlayout.widget.a aVar = this.f3287j;
                if (aVar != null) {
                    aVar.c(this);
                }
                dVar.f5504w0.clear();
                ArrayList<ConstraintHelper> arrayList = this.f3280b;
                int size = arrayList.size();
                if (size > 0) {
                    int i18 = 0;
                    while (i12 < size) {
                        ConstraintHelper constraintHelper = arrayList.get(i12);
                        if (constraintHelper.isInEditMode()) {
                            constraintHelper.setIds(constraintHelper.f3274e);
                        }
                        c0.b bVar = constraintHelper.f3273d;
                        if (bVar != null) {
                            bVar.a();
                            while (i18 < constraintHelper.f3272b) {
                                int i19 = constraintHelper.f3271a[i18];
                                View c10 = c(i19);
                                if (c10 == null) {
                                    Integer valueOf = Integer.valueOf(i19);
                                    HashMap<Integer, String> hashMap = constraintHelper.f3277h;
                                    String str = hashMap.get(valueOf);
                                    int k10 = constraintHelper.k(this, str);
                                    if (k10 != 0) {
                                        constraintHelper.f3271a[i18] = k10;
                                        hashMap.put(Integer.valueOf(k10), str);
                                        c10 = c(k10);
                                    }
                                }
                                if (c10 != null) {
                                    constraintHelper.f3273d.b(d(c10));
                                }
                                i18++;
                            }
                            constraintHelper.f3273d.c();
                        }
                        i12++;
                        i18 = 0;
                    }
                }
                for (int i20 = 0; i20 < childCount3; i20++) {
                    View childAt3 = getChildAt(i20);
                    if (childAt3 instanceof Placeholder) {
                        Placeholder placeholder = (Placeholder) childAt3;
                        if (placeholder.f3355a == -1 && !placeholder.isInEditMode()) {
                            placeholder.setVisibility(placeholder.c);
                        }
                        View findViewById = findViewById(placeholder.f3355a);
                        placeholder.f3356b = findViewById;
                        if (findViewById != null) {
                            ((b) findViewById.getLayoutParams()).f3304f0 = true;
                            placeholder.f3356b.setVisibility(0);
                            placeholder.setVisibility(0);
                        }
                    }
                }
                SparseArray<ConstraintWidget> sparseArray = this.f3291n;
                sparseArray.clear();
                sparseArray.put(0, dVar);
                sparseArray.put(getId(), dVar);
                for (int i21 = 0; i21 < childCount3; i21++) {
                    View childAt4 = getChildAt(i21);
                    sparseArray.put(childAt4.getId(), d(childAt4));
                }
                for (int i22 = 0; i22 < childCount3; i22++) {
                    View childAt5 = getChildAt(i22);
                    ConstraintWidget d11 = d(childAt5);
                    if (d11 != null) {
                        b bVar2 = (b) childAt5.getLayoutParams();
                        dVar.f5504w0.add(d11);
                        ConstraintWidget constraintWidget2 = d11.W;
                        if (constraintWidget2 != null) {
                            ((c0.c) constraintWidget2).f5504w0.remove(d11);
                            d11.G();
                        }
                        d11.W = dVar;
                        b(isInEditMode, childAt5, d11, bVar2, sparseArray);
                    }
                }
            }
            if (z10) {
                dVar.f2906x0.c(dVar);
            }
        }
        i(dVar, this.f3286i, i10, i11);
        h(i10, i11, dVar.u(), dVar.K0, dVar.L0, dVar.o());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget d10 = d(view);
        if ((view instanceof Guideline) && !(d10 instanceof f)) {
            b bVar = (b) view.getLayoutParams();
            f fVar = new f();
            bVar.f3326q0 = fVar;
            bVar.f3300d0 = true;
            fVar.V(bVar.V);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.t();
            ((b) view.getLayoutParams()).f3302e0 = true;
            ArrayList<ConstraintHelper> arrayList = this.f3280b;
            if (!arrayList.contains(constraintHelper)) {
                arrayList.add(constraintHelper);
            }
        }
        this.f3279a.put(view.getId(), view);
        this.f3285h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f3279a.remove(view.getId());
        ConstraintWidget d10 = d(view);
        this.c.f5504w0.remove(d10);
        d10.G();
        this.f3280b.remove(view);
        this.f3285h = true;
    }

    public final void p(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.f3290m == null) {
                this.f3290m = new HashMap<>();
            }
            int indexOf = str.indexOf(PackagingURIHelper.FORWARD_SLASH_STRING);
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f3290m.put(str, Integer.valueOf(num.intValue()));
        }
    }

    public final void q(ConstraintWidget constraintWidget, b bVar, SparseArray<ConstraintWidget> sparseArray, int i10, ConstraintAnchor.Type type) {
        View view = this.f3279a.get(i10);
        ConstraintWidget constraintWidget2 = sparseArray.get(i10);
        if (constraintWidget2 != null && view != null && (view.getLayoutParams() instanceof b)) {
            bVar.f3298c0 = true;
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BASELINE;
            if (type == type2) {
                b bVar2 = (b) view.getLayoutParams();
                bVar2.f3298c0 = true;
                bVar2.f3326q0.F = true;
            }
            constraintWidget.m(type2).b(constraintWidget2.m(type), bVar.D, bVar.C, true);
            constraintWidget.F = true;
            constraintWidget.m(ConstraintAnchor.Type.TOP).j();
            constraintWidget.m(ConstraintAnchor.Type.BOTTOM).j();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f3285h = true;
        super.requestLayout();
    }

    public void setConstraintSet(androidx.constraintlayout.widget.a aVar) {
        this.f3287j = aVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        int id2 = getId();
        SparseArray<View> sparseArray = this.f3279a;
        sparseArray.remove(id2);
        super.setId(i10);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f3284g) {
            return;
        }
        this.f3284g = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f3283f) {
            return;
        }
        this.f3283f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f3282e) {
            return;
        }
        this.f3282e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f3281d) {
            return;
        }
        this.f3281d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(g0.b bVar) {
        g0.a aVar = this.f3288k;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f3286i = i10;
        d dVar = this.c;
        dVar.J0 = i10;
        androidx.constraintlayout.core.c.f2777p = dVar.Z(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3279a = new SparseArray<>();
        this.f3280b = new ArrayList<>(4);
        this.c = new d();
        this.f3281d = 0;
        this.f3282e = 0;
        this.f3283f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f3284g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f3285h = true;
        this.f3286i = 257;
        this.f3287j = null;
        this.f3288k = null;
        this.f3289l = -1;
        this.f3290m = new HashMap<>();
        this.f3291n = new SparseArray<>();
        this.f3292o = new c(this);
        e(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3279a = new SparseArray<>();
        this.f3280b = new ArrayList<>(4);
        this.c = new d();
        this.f3281d = 0;
        this.f3282e = 0;
        this.f3283f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f3284g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f3285h = true;
        this.f3286i = 257;
        this.f3287j = null;
        this.f3288k = null;
        this.f3289l = -1;
        this.f3290m = new HashMap<>();
        this.f3291n = new SparseArray<>();
        this.f3292o = new c(this);
        e(attributeSet, i10, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f3279a = new SparseArray<>();
        this.f3280b = new ArrayList<>(4);
        this.c = new d();
        this.f3281d = 0;
        this.f3282e = 0;
        this.f3283f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f3284g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f3285h = true;
        this.f3286i = 257;
        this.f3287j = null;
        this.f3288k = null;
        this.f3289l = -1;
        this.f3290m = new HashMap<>();
        this.f3291n = new SparseArray<>();
        this.f3292o = new c(this);
        e(attributeSet, i10, i11);
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public final int C;
        public final int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;

        /* renamed from: a  reason: collision with root package name */
        public int f3294a;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f3295a0;

        /* renamed from: b  reason: collision with root package name */
        public int f3296b;

        /* renamed from: b0  reason: collision with root package name */
        public boolean f3297b0;
        public float c;

        /* renamed from: c0  reason: collision with root package name */
        public boolean f3298c0;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f3299d;

        /* renamed from: d0  reason: collision with root package name */
        public boolean f3300d0;

        /* renamed from: e  reason: collision with root package name */
        public int f3301e;

        /* renamed from: e0  reason: collision with root package name */
        public boolean f3302e0;

        /* renamed from: f  reason: collision with root package name */
        public int f3303f;

        /* renamed from: f0  reason: collision with root package name */
        public boolean f3304f0;

        /* renamed from: g  reason: collision with root package name */
        public int f3305g;

        /* renamed from: g0  reason: collision with root package name */
        public int f3306g0;

        /* renamed from: h  reason: collision with root package name */
        public int f3307h;

        /* renamed from: h0  reason: collision with root package name */
        public int f3308h0;

        /* renamed from: i  reason: collision with root package name */
        public int f3309i;

        /* renamed from: i0  reason: collision with root package name */
        public int f3310i0;

        /* renamed from: j  reason: collision with root package name */
        public int f3311j;

        /* renamed from: j0  reason: collision with root package name */
        public int f3312j0;

        /* renamed from: k  reason: collision with root package name */
        public int f3313k;

        /* renamed from: k0  reason: collision with root package name */
        public int f3314k0;

        /* renamed from: l  reason: collision with root package name */
        public int f3315l;

        /* renamed from: l0  reason: collision with root package name */
        public int f3316l0;

        /* renamed from: m  reason: collision with root package name */
        public int f3317m;

        /* renamed from: m0  reason: collision with root package name */
        public float f3318m0;

        /* renamed from: n  reason: collision with root package name */
        public int f3319n;

        /* renamed from: n0  reason: collision with root package name */
        public int f3320n0;

        /* renamed from: o  reason: collision with root package name */
        public int f3321o;

        /* renamed from: o0  reason: collision with root package name */
        public int f3322o0;

        /* renamed from: p  reason: collision with root package name */
        public int f3323p;

        /* renamed from: p0  reason: collision with root package name */
        public float f3324p0;

        /* renamed from: q  reason: collision with root package name */
        public int f3325q;

        /* renamed from: q0  reason: collision with root package name */
        public ConstraintWidget f3326q0;

        /* renamed from: r  reason: collision with root package name */
        public float f3327r;

        /* renamed from: s  reason: collision with root package name */
        public int f3328s;

        /* renamed from: t  reason: collision with root package name */
        public int f3329t;

        /* renamed from: u  reason: collision with root package name */
        public int f3330u;

        /* renamed from: v  reason: collision with root package name */
        public int f3331v;

        /* renamed from: w  reason: collision with root package name */
        public final int f3332w;

        /* renamed from: x  reason: collision with root package name */
        public int f3333x;

        /* renamed from: y  reason: collision with root package name */
        public final int f3334y;

        /* renamed from: z  reason: collision with root package name */
        public int f3335z;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f3336a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f3336a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3294a = -1;
            this.f3296b = -1;
            this.c = -1.0f;
            this.f3299d = true;
            this.f3301e = -1;
            this.f3303f = -1;
            this.f3305g = -1;
            this.f3307h = -1;
            this.f3309i = -1;
            this.f3311j = -1;
            this.f3313k = -1;
            this.f3315l = -1;
            this.f3317m = -1;
            this.f3319n = -1;
            this.f3321o = -1;
            this.f3323p = -1;
            this.f3325q = 0;
            this.f3327r = 0.0f;
            this.f3328s = -1;
            this.f3329t = -1;
            this.f3330u = -1;
            this.f3331v = -1;
            this.f3332w = SlideAtom.USES_MASTER_SLIDE_ID;
            this.f3333x = SlideAtom.USES_MASTER_SLIDE_ID;
            this.f3334y = SlideAtom.USES_MASTER_SLIDE_ID;
            this.f3335z = SlideAtom.USES_MASTER_SLIDE_ID;
            this.A = SlideAtom.USES_MASTER_SLIDE_ID;
            this.B = SlideAtom.USES_MASTER_SLIDE_ID;
            this.C = SlideAtom.USES_MASTER_SLIDE_ID;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f3295a0 = true;
            this.f3297b0 = true;
            this.f3298c0 = false;
            this.f3300d0 = false;
            this.f3302e0 = false;
            this.f3304f0 = false;
            this.f3306g0 = -1;
            this.f3308h0 = -1;
            this.f3310i0 = -1;
            this.f3312j0 = -1;
            this.f3314k0 = SlideAtom.USES_MASTER_SLIDE_ID;
            this.f3316l0 = SlideAtom.USES_MASTER_SLIDE_ID;
            this.f3318m0 = 0.5f;
            this.f3326q0 = new ConstraintWidget();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.d.c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = a.f3336a.get(index);
                switch (i11) {
                    case 1:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f3323p);
                        this.f3323p = resourceId;
                        if (resourceId == -1) {
                            this.f3323p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f3325q = obtainStyledAttributes.getDimensionPixelSize(index, this.f3325q);
                        break;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f3327r) % 360.0f;
                        this.f3327r = f10;
                        if (f10 < 0.0f) {
                            this.f3327r = (360.0f - f10) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f3294a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3294a);
                        break;
                    case 6:
                        this.f3296b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3296b);
                        break;
                    case 7:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f3301e);
                        this.f3301e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f3301e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f3303f);
                        this.f3303f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f3303f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f3305g);
                        this.f3305g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f3305g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f3307h);
                        this.f3307h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f3307h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f3309i);
                        this.f3309i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f3309i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f3311j);
                        this.f3311j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f3311j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f3313k);
                        this.f3313k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f3313k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f3315l);
                        this.f3315l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f3315l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f3317m);
                        this.f3317m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f3317m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f3328s);
                        this.f3328s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f3328s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f3329t);
                        this.f3329t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f3329t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f3330u);
                        this.f3330u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f3330u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f3331v);
                        this.f3331v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f3331v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f3332w = obtainStyledAttributes.getDimensionPixelSize(index, this.f3332w);
                        break;
                    case 22:
                        this.f3333x = obtainStyledAttributes.getDimensionPixelSize(index, this.f3333x);
                        break;
                    case 23:
                        this.f3334y = obtainStyledAttributes.getDimensionPixelSize(index, this.f3334y);
                        break;
                    case 24:
                        this.f3335z = obtainStyledAttributes.getDimensionPixelSize(index, this.f3335z);
                        break;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.W = obtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = obtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = obtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 30:
                        this.F = obtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 31:
                        this.L = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.M = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case 36:
                        try {
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                androidx.constraintlayout.widget.a.q(this, obtainStyledAttributes.getString(index));
                                continue;
                            case 45:
                                this.H = obtainStyledAttributes.getFloat(index, this.H);
                                continue;
                            case 46:
                                this.I = obtainStyledAttributes.getFloat(index, this.I);
                                continue;
                            case 47:
                                this.J = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.K = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                continue;
                            case 50:
                                this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                continue;
                            case 51:
                                this.Y = obtainStyledAttributes.getString(index);
                                continue;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f3319n);
                                this.f3319n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f3319n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f3321o);
                                this.f3321o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f3321o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                continue;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                continue;
                            default:
                                switch (i11) {
                                    case 64:
                                        androidx.constraintlayout.widget.a.p(this, obtainStyledAttributes, index, 0);
                                        continue;
                                        continue;
                                    case 65:
                                        androidx.constraintlayout.widget.a.p(this, obtainStyledAttributes, index, 1);
                                        continue;
                                    case 66:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 67:
                                        this.f3299d = obtainStyledAttributes.getBoolean(index, this.f3299d);
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public final void a() {
            this.f3300d0 = false;
            this.f3295a0 = true;
            this.f3297b0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.W) {
                this.f3295a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.X) {
                this.f3297b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f3295a0 = false;
                if (i10 == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f3297b0 = false;
                if (i11 == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = true;
                }
            }
            if (this.c != -1.0f || this.f3294a != -1 || this.f3296b != -1) {
                this.f3300d0 = true;
                this.f3295a0 = true;
                this.f3297b0 = true;
                if (!(this.f3326q0 instanceof f)) {
                    this.f3326q0 = new f();
                }
                ((f) this.f3326q0).V(this.V);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b() {
            super(-2, -2);
            this.f3294a = -1;
            this.f3296b = -1;
            this.c = -1.0f;
            this.f3299d = true;
            this.f3301e = -1;
            this.f3303f = -1;
            this.f3305g = -1;
            this.f3307h = -1;
            this.f3309i = -1;
            this.f3311j = -1;
            this.f3313k = -1;
            this.f3315l = -1;
            this.f3317m = -1;
            this.f3319n = -1;
            this.f3321o = -1;
            this.f3323p = -1;
            this.f3325q = 0;
            this.f3327r = 0.0f;
            this.f3328s = -1;
            this.f3329t = -1;
            this.f3330u = -1;
            this.f3331v = -1;
            this.f3332w = SlideAtom.USES_MASTER_SLIDE_ID;
            this.f3333x = SlideAtom.USES_MASTER_SLIDE_ID;
            this.f3334y = SlideAtom.USES_MASTER_SLIDE_ID;
            this.f3335z = SlideAtom.USES_MASTER_SLIDE_ID;
            this.A = SlideAtom.USES_MASTER_SLIDE_ID;
            this.B = SlideAtom.USES_MASTER_SLIDE_ID;
            this.C = SlideAtom.USES_MASTER_SLIDE_ID;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f3295a0 = true;
            this.f3297b0 = true;
            this.f3298c0 = false;
            this.f3300d0 = false;
            this.f3302e0 = false;
            this.f3304f0 = false;
            this.f3306g0 = -1;
            this.f3308h0 = -1;
            this.f3310i0 = -1;
            this.f3312j0 = -1;
            this.f3314k0 = SlideAtom.USES_MASTER_SLIDE_ID;
            this.f3316l0 = SlideAtom.USES_MASTER_SLIDE_ID;
            this.f3318m0 = 0.5f;
            this.f3326q0 = new ConstraintWidget();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3294a = -1;
            this.f3296b = -1;
            this.c = -1.0f;
            this.f3299d = true;
            this.f3301e = -1;
            this.f3303f = -1;
            this.f3305g = -1;
            this.f3307h = -1;
            this.f3309i = -1;
            this.f3311j = -1;
            this.f3313k = -1;
            this.f3315l = -1;
            this.f3317m = -1;
            this.f3319n = -1;
            this.f3321o = -1;
            this.f3323p = -1;
            this.f3325q = 0;
            this.f3327r = 0.0f;
            this.f3328s = -1;
            this.f3329t = -1;
            this.f3330u = -1;
            this.f3331v = -1;
            this.f3332w = SlideAtom.USES_MASTER_SLIDE_ID;
            this.f3333x = SlideAtom.USES_MASTER_SLIDE_ID;
            this.f3334y = SlideAtom.USES_MASTER_SLIDE_ID;
            this.f3335z = SlideAtom.USES_MASTER_SLIDE_ID;
            this.A = SlideAtom.USES_MASTER_SLIDE_ID;
            this.B = SlideAtom.USES_MASTER_SLIDE_ID;
            this.C = SlideAtom.USES_MASTER_SLIDE_ID;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f3295a0 = true;
            this.f3297b0 = true;
            this.f3298c0 = false;
            this.f3300d0 = false;
            this.f3302e0 = false;
            this.f3304f0 = false;
            this.f3306g0 = -1;
            this.f3308h0 = -1;
            this.f3310i0 = -1;
            this.f3312j0 = -1;
            this.f3314k0 = SlideAtom.USES_MASTER_SLIDE_ID;
            this.f3316l0 = SlideAtom.USES_MASTER_SLIDE_ID;
            this.f3318m0 = 0.5f;
            this.f3326q0 = new ConstraintWidget();
        }
    }
}
