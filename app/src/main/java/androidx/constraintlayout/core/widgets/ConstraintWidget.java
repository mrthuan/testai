package androidx.constraintlayout.core.widgets;

import androidx.activity.r;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import com.google.android.gms.common.api.Api;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintWidget {
    public float A;
    public int B;
    public float C;
    public int[] D;
    public float E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final ConstraintAnchor K;
    public final ConstraintAnchor L;
    public final ConstraintAnchor M;
    public final ConstraintAnchor N;
    public final ConstraintAnchor O;
    public final ConstraintAnchor P;
    public final ConstraintAnchor Q;
    public final ConstraintAnchor R;
    public final ConstraintAnchor[] S;
    public final ArrayList<ConstraintAnchor> T;
    public final boolean[] U;
    public DimensionBehaviour[] V;
    public ConstraintWidget W;
    public int X;
    public int Y;
    public float Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f2810a0;

    /* renamed from: b  reason: collision with root package name */
    public d0.c f2811b;

    /* renamed from: b0  reason: collision with root package name */
    public int f2812b0;
    public d0.c c;

    /* renamed from: c0  reason: collision with root package name */
    public int f2813c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f2815d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f2817e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f2819f0;

    /* renamed from: g0  reason: collision with root package name */
    public float f2821g0;

    /* renamed from: h0  reason: collision with root package name */
    public float f2823h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f2825i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f2827j0;

    /* renamed from: k  reason: collision with root package name */
    public String f2828k;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f2829k0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2830l;

    /* renamed from: l0  reason: collision with root package name */
    public String f2831l0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2832m;

    /* renamed from: m0  reason: collision with root package name */
    public String f2833m0;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2834n;

    /* renamed from: n0  reason: collision with root package name */
    public int f2835n0;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2836o;

    /* renamed from: o0  reason: collision with root package name */
    public int f2837o0;

    /* renamed from: p  reason: collision with root package name */
    public int f2838p;

    /* renamed from: p0  reason: collision with root package name */
    public final float[] f2839p0;

    /* renamed from: q  reason: collision with root package name */
    public int f2840q;

    /* renamed from: q0  reason: collision with root package name */
    public final ConstraintWidget[] f2841q0;

    /* renamed from: r  reason: collision with root package name */
    public int f2842r;

    /* renamed from: r0  reason: collision with root package name */
    public final ConstraintWidget[] f2843r0;

    /* renamed from: s  reason: collision with root package name */
    public int f2844s;

    /* renamed from: s0  reason: collision with root package name */
    public ConstraintWidget f2845s0;

    /* renamed from: t  reason: collision with root package name */
    public int f2846t;

    /* renamed from: t0  reason: collision with root package name */
    public ConstraintWidget f2847t0;

    /* renamed from: u  reason: collision with root package name */
    public final int[] f2848u;

    /* renamed from: u0  reason: collision with root package name */
    public int f2849u0;

    /* renamed from: v  reason: collision with root package name */
    public int f2850v;

    /* renamed from: v0  reason: collision with root package name */
    public int f2851v0;

    /* renamed from: w  reason: collision with root package name */
    public int f2852w;

    /* renamed from: x  reason: collision with root package name */
    public float f2853x;

    /* renamed from: y  reason: collision with root package name */
    public int f2854y;

    /* renamed from: z  reason: collision with root package name */
    public int f2855z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2809a = false;

    /* renamed from: d  reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.c f2814d = null;

    /* renamed from: e  reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.d f2816e = null;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f2818f = {true, true};

    /* renamed from: g  reason: collision with root package name */
    public boolean f2820g = true;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2822h = true;

    /* renamed from: i  reason: collision with root package name */
    public int f2824i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f2826j = -1;

    /* loaded from: classes.dex */
    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2857a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f2858b;

        static {
            int[] iArr = new int[DimensionBehaviour.values().length];
            f2858b = iArr;
            try {
                iArr[DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2858b[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2858b[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2858b[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
            f2857a = iArr2;
            try {
                iArr2[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2857a[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2857a[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2857a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2857a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2857a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2857a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2857a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2857a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public ConstraintWidget() {
        new HashMap();
        this.f2830l = false;
        this.f2832m = false;
        this.f2834n = false;
        this.f2836o = false;
        this.f2838p = -1;
        this.f2840q = -1;
        this.f2842r = 0;
        this.f2844s = 0;
        this.f2846t = 0;
        this.f2848u = new int[2];
        this.f2850v = 0;
        this.f2852w = 0;
        this.f2853x = 1.0f;
        this.f2854y = 0;
        this.f2855z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER};
        this.E = 0.0f;
        this.F = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.K = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.L = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.M = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.N = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.O = constraintAnchor5;
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.P = constraintAnchor6;
        ConstraintAnchor constraintAnchor7 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        this.Q = constraintAnchor7;
        ConstraintAnchor constraintAnchor8 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.R = constraintAnchor8;
        this.S = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor8};
        ArrayList<ConstraintAnchor> arrayList = new ArrayList<>();
        this.T = arrayList;
        this.U = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.V = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.W = null;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.f2810a0 = -1;
        this.f2812b0 = 0;
        this.f2813c0 = 0;
        this.f2815d0 = 0;
        this.f2821g0 = 0.5f;
        this.f2823h0 = 0.5f;
        this.f2827j0 = 0;
        this.f2829k0 = false;
        this.f2831l0 = null;
        this.f2833m0 = null;
        this.f2835n0 = 0;
        this.f2837o0 = 0;
        this.f2839p0 = new float[]{-1.0f, -1.0f};
        this.f2841q0 = new ConstraintWidget[]{null, null};
        this.f2843r0 = new ConstraintWidget[]{null, null};
        this.f2845s0 = null;
        this.f2847t0 = null;
        this.f2849u0 = -1;
        this.f2851v0 = -1;
        arrayList.add(constraintAnchor);
        arrayList.add(constraintAnchor2);
        arrayList.add(constraintAnchor3);
        arrayList.add(constraintAnchor4);
        arrayList.add(constraintAnchor6);
        arrayList.add(constraintAnchor7);
        arrayList.add(constraintAnchor8);
        arrayList.add(constraintAnchor5);
    }

    public static void K(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    public static void L(StringBuilder sb2, String str, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    public static void s(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, float f10) {
        sb2.append(str);
        sb2.append(" :  {\n");
        L(sb2, "      size", i10, 0);
        L(sb2, "      min", i11, 0);
        L(sb2, "      max", i12, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        L(sb2, "      matchMin", i13, 0);
        L(sb2, "      matchDef", i14, 0);
        K(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    public static void t(StringBuilder sb2, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f2803f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(constraintAnchor.f2803f);
        sb2.append(OperatorName.SHOW_TEXT_LINE);
        if (constraintAnchor.f2805h != Integer.MIN_VALUE || constraintAnchor.f2804g != 0) {
            sb2.append(",");
            sb2.append(constraintAnchor.f2804g);
            if (constraintAnchor.f2805h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(constraintAnchor.f2805h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    public final boolean A(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i11 = i10 * 2;
        ConstraintAnchor[] constraintAnchorArr = this.S;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i11];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f2803f;
        if (constraintAnchor4 != null && constraintAnchor4.f2803f != constraintAnchor3 && (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i11 + 1]).f2803f) != null && constraintAnchor2.f2803f == constraintAnchor) {
            return true;
        }
        return false;
    }

    public final boolean B() {
        ConstraintAnchor constraintAnchor = this.K;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f2803f;
        if (constraintAnchor2 == null || constraintAnchor2.f2803f != constraintAnchor) {
            ConstraintAnchor constraintAnchor3 = this.M;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.f2803f;
            if (constraintAnchor4 != null && constraintAnchor4.f2803f == constraintAnchor3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean C() {
        ConstraintAnchor constraintAnchor = this.L;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f2803f;
        if (constraintAnchor2 == null || constraintAnchor2.f2803f != constraintAnchor) {
            ConstraintAnchor constraintAnchor3 = this.N;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.f2803f;
            if (constraintAnchor4 != null && constraintAnchor4.f2803f == constraintAnchor3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean D() {
        if (this.f2820g && this.f2827j0 != 8) {
            return true;
        }
        return false;
    }

    public boolean E() {
        if (!this.f2830l && (!this.K.c || !this.M.c)) {
            return false;
        }
        return true;
    }

    public boolean F() {
        if (!this.f2832m && (!this.L.c || !this.N.c)) {
            return false;
        }
        return true;
    }

    public void G() {
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.W = null;
        this.E = 0.0f;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.f2810a0 = -1;
        this.f2812b0 = 0;
        this.f2813c0 = 0;
        this.f2815d0 = 0;
        this.f2817e0 = 0;
        this.f2819f0 = 0;
        this.f2821g0 = 0.5f;
        this.f2823h0 = 0.5f;
        DimensionBehaviour[] dimensionBehaviourArr = this.V;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f2825i0 = null;
        this.f2827j0 = 0;
        this.f2833m0 = null;
        this.f2835n0 = 0;
        this.f2837o0 = 0;
        float[] fArr = this.f2839p0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f2838p = -1;
        this.f2840q = -1;
        int[] iArr = this.D;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f2844s = 0;
        this.f2846t = 0;
        this.f2853x = 1.0f;
        this.A = 1.0f;
        this.f2852w = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f2855z = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f2850v = 0;
        this.f2854y = 0;
        this.B = -1;
        this.C = 1.0f;
        boolean[] zArr = this.f2818f;
        zArr[0] = true;
        zArr[1] = true;
        this.H = false;
        boolean[] zArr2 = this.U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f2820g = true;
        int[] iArr2 = this.f2848u;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f2824i = -1;
        this.f2826j = -1;
    }

    public final void H() {
        ConstraintWidget constraintWidget = this.W;
        if (constraintWidget != null && (constraintWidget instanceof d)) {
            ((d) constraintWidget).getClass();
        }
        ArrayList<ConstraintAnchor> arrayList = this.T;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).j();
        }
    }

    public final void I() {
        this.f2830l = false;
        this.f2832m = false;
        this.f2834n = false;
        this.f2836o = false;
        ArrayList<ConstraintAnchor> arrayList = this.T;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintAnchor constraintAnchor = arrayList.get(i10);
            constraintAnchor.c = false;
            constraintAnchor.f2800b = 0;
        }
    }

    public void J(a0.b bVar) {
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.O.k();
        this.R.k();
        this.P.k();
        this.Q.k();
    }

    public final void M(int i10, int i11) {
        if (this.f2830l) {
            return;
        }
        this.K.l(i10);
        this.M.l(i11);
        this.f2812b0 = i10;
        this.X = i11 - i10;
        this.f2830l = true;
    }

    public final void N(int i10, int i11) {
        if (this.f2832m) {
            return;
        }
        this.L.l(i10);
        this.N.l(i11);
        this.f2813c0 = i10;
        this.Y = i11 - i10;
        if (this.F) {
            this.O.l(i10 + this.f2815d0);
        }
        this.f2832m = true;
    }

    public final void O(int i10) {
        this.Y = i10;
        int i11 = this.f2819f0;
        if (i10 < i11) {
            this.Y = i11;
        }
    }

    public final void P(DimensionBehaviour dimensionBehaviour) {
        this.V[0] = dimensionBehaviour;
    }

    public final void Q(DimensionBehaviour dimensionBehaviour) {
        this.V[1] = dimensionBehaviour;
    }

    public final void R(int i10) {
        this.X = i10;
        int i11 = this.f2817e0;
        if (i10 < i11) {
            this.X = i11;
        }
    }

    public void S(boolean z10, boolean z11) {
        int i10;
        int i11;
        androidx.constraintlayout.core.widgets.analyzer.c cVar = this.f2814d;
        boolean z12 = z10 & cVar.f2878g;
        androidx.constraintlayout.core.widgets.analyzer.d dVar = this.f2816e;
        boolean z13 = z11 & dVar.f2878g;
        int i12 = cVar.f2879h.f2866g;
        int i13 = dVar.f2879h.f2866g;
        int i14 = cVar.f2880i.f2866g;
        int i15 = dVar.f2880i.f2866g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i15 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (z12) {
            this.f2812b0 = i12;
        }
        if (z13) {
            this.f2813c0 = i13;
        }
        if (this.f2827j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        if (z12) {
            if (this.V[0] == DimensionBehaviour.FIXED && i17 < (i11 = this.X)) {
                i17 = i11;
            }
            this.X = i17;
            int i19 = this.f2817e0;
            if (i17 < i19) {
                this.X = i19;
            }
        }
        if (z13) {
            if (this.V[1] == DimensionBehaviour.FIXED && i18 < (i10 = this.Y)) {
                i18 = i10;
            }
            this.Y = i18;
            int i20 = this.f2819f0;
            if (i18 < i20) {
                this.Y = i20;
            }
        }
    }

    public void T(androidx.constraintlayout.core.c cVar, boolean z10) {
        int i10;
        int i11;
        androidx.constraintlayout.core.widgets.analyzer.d dVar;
        androidx.constraintlayout.core.widgets.analyzer.c cVar2;
        cVar.getClass();
        int n10 = androidx.constraintlayout.core.c.n(this.K);
        int n11 = androidx.constraintlayout.core.c.n(this.L);
        int n12 = androidx.constraintlayout.core.c.n(this.M);
        int n13 = androidx.constraintlayout.core.c.n(this.N);
        if (z10 && (cVar2 = this.f2814d) != null) {
            DependencyNode dependencyNode = cVar2.f2879h;
            if (dependencyNode.f2869j) {
                DependencyNode dependencyNode2 = cVar2.f2880i;
                if (dependencyNode2.f2869j) {
                    n10 = dependencyNode.f2866g;
                    n12 = dependencyNode2.f2866g;
                }
            }
        }
        if (z10 && (dVar = this.f2816e) != null) {
            DependencyNode dependencyNode3 = dVar.f2879h;
            if (dependencyNode3.f2869j) {
                DependencyNode dependencyNode4 = dVar.f2880i;
                if (dependencyNode4.f2869j) {
                    n11 = dependencyNode3.f2866g;
                    n13 = dependencyNode4.f2866g;
                }
            }
        }
        int i12 = n13 - n11;
        if (n12 - n10 < 0 || i12 < 0 || n10 == Integer.MIN_VALUE || n10 == Integer.MAX_VALUE || n11 == Integer.MIN_VALUE || n11 == Integer.MAX_VALUE || n12 == Integer.MIN_VALUE || n12 == Integer.MAX_VALUE || n13 == Integer.MIN_VALUE || n13 == Integer.MAX_VALUE) {
            n10 = 0;
            n11 = 0;
            n12 = 0;
            n13 = 0;
        }
        int i13 = n12 - n10;
        int i14 = n13 - n11;
        this.f2812b0 = n10;
        this.f2813c0 = n11;
        if (this.f2827j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.V;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i13 < (i11 = this.X)) {
            i13 = i11;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i14 < (i10 = this.Y)) {
            i14 = i10;
        }
        this.X = i13;
        this.Y = i14;
        int i15 = this.f2819f0;
        if (i14 < i15) {
            this.Y = i15;
        }
        int i16 = this.f2817e0;
        if (i13 < i16) {
            this.X = i16;
        }
        int i17 = this.f2852w;
        if (i17 > 0 && dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.X = Math.min(this.X, i17);
        }
        int i18 = this.f2855z;
        if (i18 > 0 && this.V[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.Y = Math.min(this.Y, i18);
        }
        int i19 = this.X;
        if (i13 != i19) {
            this.f2824i = i19;
        }
        int i20 = this.Y;
        if (i14 != i20) {
            this.f2826j = i20;
        }
    }

    public final void d(d dVar, androidx.constraintlayout.core.c cVar, HashSet<ConstraintWidget> hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            g.a(dVar, cVar, this);
            hashSet.remove(this);
            e(cVar, dVar.Z(64));
        }
        if (i10 == 0) {
            HashSet<ConstraintAnchor> hashSet2 = this.K.f2799a;
            if (hashSet2 != null) {
                Iterator<ConstraintAnchor> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f2801d.d(dVar, cVar, hashSet, i10, true);
                }
            }
            HashSet<ConstraintAnchor> hashSet3 = this.M.f2799a;
            if (hashSet3 != null) {
                Iterator<ConstraintAnchor> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f2801d.d(dVar, cVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> hashSet4 = this.L.f2799a;
        if (hashSet4 != null) {
            Iterator<ConstraintAnchor> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f2801d.d(dVar, cVar, hashSet, i10, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet5 = this.N.f2799a;
        if (hashSet5 != null) {
            Iterator<ConstraintAnchor> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f2801d.d(dVar, cVar, hashSet, i10, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet6 = this.O.f2799a;
        if (hashSet6 != null) {
            Iterator<ConstraintAnchor> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f2801d.d(dVar, cVar, hashSet, i10, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:276:0x03f8, code lost:
        if (r7 != r11) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00dc, code lost:
        if (r0.d() > r3.N0.get().d()) goto L406;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(androidx.constraintlayout.core.c r65, boolean r66) {
        /*
            Method dump skipped, instructions count: 2056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.e(androidx.constraintlayout.core.c, boolean):void");
    }

    public boolean f() {
        if (this.f2827j0 != 8) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0493 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x04d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:367:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(androidx.constraintlayout.core.c r30, boolean r31, boolean r32, boolean r33, boolean r34, androidx.constraintlayout.core.SolverVariable r35, androidx.constraintlayout.core.SolverVariable r36, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r37, boolean r38, androidx.constraintlayout.core.widgets.ConstraintAnchor r39, androidx.constraintlayout.core.widgets.ConstraintAnchor r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.g(androidx.constraintlayout.core.c, boolean, boolean, boolean, boolean, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void h(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i10) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z10;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type == type5) {
            if (type2 == type5) {
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.LEFT;
                ConstraintAnchor m10 = m(type6);
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.RIGHT;
                ConstraintAnchor m11 = m(type7);
                ConstraintAnchor.Type type8 = ConstraintAnchor.Type.TOP;
                ConstraintAnchor m12 = m(type8);
                ConstraintAnchor.Type type9 = ConstraintAnchor.Type.BOTTOM;
                ConstraintAnchor m13 = m(type9);
                boolean z11 = true;
                if ((m10 != null && m10.h()) || (m11 != null && m11.h())) {
                    z10 = false;
                } else {
                    h(type6, constraintWidget, type6, 0);
                    h(type7, constraintWidget, type7, 0);
                    z10 = true;
                }
                if ((m12 != null && m12.h()) || (m13 != null && m13.h())) {
                    z11 = false;
                } else {
                    h(type8, constraintWidget, type8, 0);
                    h(type9, constraintWidget, type9, 0);
                }
                if (z10 && z11) {
                    m(type5).a(constraintWidget.m(type5), 0);
                    return;
                } else if (z10) {
                    ConstraintAnchor.Type type10 = ConstraintAnchor.Type.CENTER_X;
                    m(type10).a(constraintWidget.m(type10), 0);
                    return;
                } else if (z11) {
                    ConstraintAnchor.Type type11 = ConstraintAnchor.Type.CENTER_Y;
                    m(type11).a(constraintWidget.m(type11), 0);
                    return;
                } else {
                    return;
                }
            }
            ConstraintAnchor.Type type12 = ConstraintAnchor.Type.LEFT;
            if (type2 != type12 && type2 != ConstraintAnchor.Type.RIGHT) {
                ConstraintAnchor.Type type13 = ConstraintAnchor.Type.TOP;
                if (type2 == type13 || type2 == ConstraintAnchor.Type.BOTTOM) {
                    h(type13, constraintWidget, type2, 0);
                    h(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                    m(type5).a(constraintWidget.m(type2), 0);
                    return;
                }
                return;
            }
            h(type12, constraintWidget, type2, 0);
            h(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
            m(type5).a(constraintWidget.m(type2), 0);
            return;
        }
        ConstraintAnchor.Type type14 = ConstraintAnchor.Type.CENTER_X;
        if (type == type14 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor m14 = m(type4);
            ConstraintAnchor m15 = constraintWidget.m(type2);
            ConstraintAnchor m16 = m(ConstraintAnchor.Type.RIGHT);
            m14.a(m15, 0);
            m16.a(m15, 0);
            m(type14).a(m15, 0);
            return;
        }
        ConstraintAnchor.Type type15 = ConstraintAnchor.Type.CENTER_Y;
        if (type == type15 && (type2 == (type3 = ConstraintAnchor.Type.TOP) || type2 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor m17 = constraintWidget.m(type2);
            m(type3).a(m17, 0);
            m(ConstraintAnchor.Type.BOTTOM).a(m17, 0);
            m(type15).a(m17, 0);
        } else if (type == type14 && type2 == type14) {
            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.LEFT;
            m(type16).a(constraintWidget.m(type16), 0);
            ConstraintAnchor.Type type17 = ConstraintAnchor.Type.RIGHT;
            m(type17).a(constraintWidget.m(type17), 0);
            m(type14).a(constraintWidget.m(type2), 0);
        } else if (type == type15 && type2 == type15) {
            ConstraintAnchor.Type type18 = ConstraintAnchor.Type.TOP;
            m(type18).a(constraintWidget.m(type18), 0);
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.BOTTOM;
            m(type19).a(constraintWidget.m(type19), 0);
            m(type15).a(constraintWidget.m(type2), 0);
        } else {
            ConstraintAnchor m18 = m(type);
            ConstraintAnchor m19 = constraintWidget.m(type2);
            if (m18.i(m19)) {
                ConstraintAnchor.Type type20 = ConstraintAnchor.Type.BASELINE;
                if (type == type20) {
                    ConstraintAnchor m20 = m(ConstraintAnchor.Type.TOP);
                    ConstraintAnchor m21 = m(ConstraintAnchor.Type.BOTTOM);
                    if (m20 != null) {
                        m20.j();
                    }
                    if (m21 != null) {
                        m21.j();
                    }
                } else if (type != ConstraintAnchor.Type.TOP && type != ConstraintAnchor.Type.BOTTOM) {
                    if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                        ConstraintAnchor m22 = m(type5);
                        if (m22.f2803f != m19) {
                            m22.j();
                        }
                        ConstraintAnchor f10 = m(type).f();
                        ConstraintAnchor m23 = m(type14);
                        if (m23.h()) {
                            f10.j();
                            m23.j();
                        }
                    }
                } else {
                    ConstraintAnchor m24 = m(type20);
                    if (m24 != null) {
                        m24.j();
                    }
                    ConstraintAnchor m25 = m(type5);
                    if (m25.f2803f != m19) {
                        m25.j();
                    }
                    ConstraintAnchor f11 = m(type).f();
                    ConstraintAnchor m26 = m(type15);
                    if (m26.h()) {
                        f11.j();
                        m26.j();
                    }
                }
                m18.a(m19, i10);
            }
        }
    }

    public final void i(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i10) {
        if (constraintAnchor.f2801d == this) {
            h(constraintAnchor.f2802e, constraintAnchor2.f2801d, constraintAnchor2.f2802e, i10);
        }
    }

    public void j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        this.f2838p = constraintWidget.f2838p;
        this.f2840q = constraintWidget.f2840q;
        this.f2844s = constraintWidget.f2844s;
        this.f2846t = constraintWidget.f2846t;
        int[] iArr = constraintWidget.f2848u;
        int i10 = iArr[0];
        int[] iArr2 = this.f2848u;
        iArr2[0] = i10;
        iArr2[1] = iArr[1];
        this.f2850v = constraintWidget.f2850v;
        this.f2852w = constraintWidget.f2852w;
        this.f2854y = constraintWidget.f2854y;
        this.f2855z = constraintWidget.f2855z;
        this.A = constraintWidget.A;
        this.B = constraintWidget.B;
        this.C = constraintWidget.C;
        int[] iArr3 = constraintWidget.D;
        this.D = Arrays.copyOf(iArr3, iArr3.length);
        this.E = constraintWidget.E;
        this.F = constraintWidget.F;
        this.G = constraintWidget.G;
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.V = (DimensionBehaviour[]) Arrays.copyOf(this.V, 2);
        ConstraintWidget constraintWidget4 = null;
        if (this.W == null) {
            constraintWidget2 = null;
        } else {
            constraintWidget2 = hashMap.get(constraintWidget.W);
        }
        this.W = constraintWidget2;
        this.X = constraintWidget.X;
        this.Y = constraintWidget.Y;
        this.Z = constraintWidget.Z;
        this.f2810a0 = constraintWidget.f2810a0;
        this.f2812b0 = constraintWidget.f2812b0;
        this.f2813c0 = constraintWidget.f2813c0;
        this.f2815d0 = constraintWidget.f2815d0;
        this.f2817e0 = constraintWidget.f2817e0;
        this.f2819f0 = constraintWidget.f2819f0;
        this.f2821g0 = constraintWidget.f2821g0;
        this.f2823h0 = constraintWidget.f2823h0;
        this.f2825i0 = constraintWidget.f2825i0;
        this.f2827j0 = constraintWidget.f2827j0;
        this.f2829k0 = constraintWidget.f2829k0;
        this.f2831l0 = constraintWidget.f2831l0;
        this.f2833m0 = constraintWidget.f2833m0;
        this.f2835n0 = constraintWidget.f2835n0;
        this.f2837o0 = constraintWidget.f2837o0;
        float[] fArr = constraintWidget.f2839p0;
        float f10 = fArr[0];
        float[] fArr2 = this.f2839p0;
        fArr2[0] = f10;
        fArr2[1] = fArr[1];
        ConstraintWidget[] constraintWidgetArr = constraintWidget.f2841q0;
        ConstraintWidget constraintWidget5 = constraintWidgetArr[0];
        ConstraintWidget[] constraintWidgetArr2 = this.f2841q0;
        constraintWidgetArr2[0] = constraintWidget5;
        constraintWidgetArr2[1] = constraintWidgetArr[1];
        ConstraintWidget[] constraintWidgetArr3 = constraintWidget.f2843r0;
        ConstraintWidget constraintWidget6 = constraintWidgetArr3[0];
        ConstraintWidget[] constraintWidgetArr4 = this.f2843r0;
        constraintWidgetArr4[0] = constraintWidget6;
        constraintWidgetArr4[1] = constraintWidgetArr3[1];
        ConstraintWidget constraintWidget7 = constraintWidget.f2845s0;
        if (constraintWidget7 == null) {
            constraintWidget3 = null;
        } else {
            constraintWidget3 = hashMap.get(constraintWidget7);
        }
        this.f2845s0 = constraintWidget3;
        ConstraintWidget constraintWidget8 = constraintWidget.f2847t0;
        if (constraintWidget8 != null) {
            constraintWidget4 = hashMap.get(constraintWidget8);
        }
        this.f2847t0 = constraintWidget4;
    }

    public final void k(androidx.constraintlayout.core.c cVar) {
        cVar.k(this.K);
        cVar.k(this.L);
        cVar.k(this.M);
        cVar.k(this.N);
        if (this.f2815d0 > 0) {
            cVar.k(this.O);
        }
    }

    public final void l() {
        if (this.f2814d == null) {
            this.f2814d = new androidx.constraintlayout.core.widgets.analyzer.c(this);
        }
        if (this.f2816e == null) {
            this.f2816e = new androidx.constraintlayout.core.widgets.analyzer.d(this);
        }
    }

    public ConstraintAnchor m(ConstraintAnchor.Type type) {
        switch (a.f2857a[type.ordinal()]) {
            case 1:
                return this.K;
            case 2:
                return this.L;
            case 3:
                return this.M;
            case 4:
                return this.N;
            case 5:
                return this.O;
            case 6:
                return this.R;
            case 7:
                return this.P;
            case 8:
                return this.Q;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final DimensionBehaviour n(int i10) {
        if (i10 == 0) {
            return this.V[0];
        }
        if (i10 == 1) {
            return this.V[1];
        }
        return null;
    }

    public final int o() {
        if (this.f2827j0 == 8) {
            return 0;
        }
        return this.Y;
    }

    public final ConstraintWidget p(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i10 == 0) {
            ConstraintAnchor constraintAnchor3 = this.M;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.f2803f;
            if (constraintAnchor4 != null && constraintAnchor4.f2803f == constraintAnchor3) {
                return constraintAnchor4.f2801d;
            }
            return null;
        } else if (i10 == 1 && (constraintAnchor2 = (constraintAnchor = this.N).f2803f) != null && constraintAnchor2.f2803f == constraintAnchor) {
            return constraintAnchor2.f2801d;
        } else {
            return null;
        }
    }

    public final ConstraintWidget q(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i10 == 0) {
            ConstraintAnchor constraintAnchor3 = this.K;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.f2803f;
            if (constraintAnchor4 != null && constraintAnchor4.f2803f == constraintAnchor3) {
                return constraintAnchor4.f2801d;
            }
            return null;
        } else if (i10 == 1 && (constraintAnchor2 = (constraintAnchor = this.L).f2803f) != null && constraintAnchor2.f2803f == constraintAnchor) {
            return constraintAnchor2.f2801d;
        } else {
            return null;
        }
    }

    public void r(StringBuilder sb2) {
        sb2.append("  " + this.f2828k + ":{\n");
        StringBuilder sb3 = new StringBuilder("    actualWidth:");
        sb3.append(this.X);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.Y);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f2812b0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f2813c0);
        sb2.append("\n");
        t(sb2, "left", this.K);
        t(sb2, "top", this.L);
        t(sb2, "right", this.M);
        t(sb2, "bottom", this.N);
        t(sb2, "baseline", this.O);
        t(sb2, "centerX", this.P);
        t(sb2, "centerY", this.Q);
        int i10 = this.X;
        int i11 = this.f2817e0;
        int i12 = this.D[0];
        int i13 = this.f2850v;
        int i14 = this.f2844s;
        float f10 = this.f2853x;
        float[] fArr = this.f2839p0;
        float f11 = fArr[0];
        s(sb2, "    width", i10, i11, i12, i13, i14, f10);
        int i15 = this.Y;
        int i16 = this.f2819f0;
        int i17 = this.D[1];
        int i18 = this.f2854y;
        int i19 = this.f2846t;
        float f12 = this.A;
        float f13 = fArr[1];
        s(sb2, "    height", i15, i16, i17, i18, i19, f12);
        float f14 = this.Z;
        int i20 = this.f2810a0;
        if (f14 != 0.0f) {
            sb2.append("    dimensionRatio");
            sb2.append(" :  [");
            sb2.append(f14);
            sb2.append(",");
            b.a.k(sb2, i20, "", "],\n");
        }
        K(sb2, "    horizontalBias", this.f2821g0, 0.5f);
        K(sb2, "    verticalBias", this.f2823h0, 0.5f);
        L(sb2, "    horizontalChainStyle", this.f2835n0, 0);
        L(sb2, "    verticalChainStyle", this.f2837o0, 0);
        sb2.append("  }");
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.f2833m0 == null) {
            str = "";
        } else {
            str = r.g(new StringBuilder("type: "), this.f2833m0, " ");
        }
        sb2.append(str);
        if (this.f2831l0 != null) {
            str2 = r.g(new StringBuilder("id: "), this.f2831l0, " ");
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.f2812b0);
        sb2.append(", ");
        sb2.append(this.f2813c0);
        sb2.append(") - (");
        sb2.append(this.X);
        sb2.append(" x ");
        return a6.h.g(sb2, this.Y, ")");
    }

    public final int u() {
        if (this.f2827j0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final int v() {
        ConstraintWidget constraintWidget = this.W;
        if (constraintWidget != null && (constraintWidget instanceof d)) {
            return ((d) constraintWidget).D0 + this.f2812b0;
        }
        return this.f2812b0;
    }

    public final int w() {
        ConstraintWidget constraintWidget = this.W;
        if (constraintWidget != null && (constraintWidget instanceof d)) {
            return ((d) constraintWidget).E0 + this.f2813c0;
        }
        return this.f2813c0;
    }

    public final boolean x(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (i10 == 0) {
            if (this.K.f2803f != null) {
                i14 = 1;
            } else {
                i14 = 0;
            }
            if (this.M.f2803f != null) {
                i15 = 1;
            } else {
                i15 = 0;
            }
            if (i14 + i15 < 2) {
                return true;
            }
            return false;
        }
        if (this.L.f2803f != null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (this.N.f2803f != null) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        int i16 = i11 + i12;
        if (this.O.f2803f != null) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        if (i16 + i13 < 2) {
            return true;
        }
        return false;
    }

    public final boolean y(int i10, int i11) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (i10 == 0) {
            ConstraintAnchor constraintAnchor5 = this.K;
            ConstraintAnchor constraintAnchor6 = constraintAnchor5.f2803f;
            if (constraintAnchor6 != null && constraintAnchor6.c && (constraintAnchor4 = (constraintAnchor3 = this.M).f2803f) != null && constraintAnchor4.c) {
                if ((constraintAnchor4.d() - constraintAnchor3.e()) - (constraintAnchor5.e() + constraintAnchor5.f2803f.d()) >= i11) {
                    return true;
                }
                return false;
            }
        } else {
            ConstraintAnchor constraintAnchor7 = this.L;
            ConstraintAnchor constraintAnchor8 = constraintAnchor7.f2803f;
            if (constraintAnchor8 != null && constraintAnchor8.c && (constraintAnchor2 = (constraintAnchor = this.N).f2803f) != null && constraintAnchor2.c) {
                if ((constraintAnchor2.d() - constraintAnchor.e()) - (constraintAnchor7.e() + constraintAnchor7.f2803f.d()) >= i11) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final void z(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i10, int i11) {
        m(type).b(constraintWidget.m(type2), i10, i11, true);
    }
}
