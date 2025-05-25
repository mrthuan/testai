package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import org.xmlpull.v1.XmlPullParserException;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ConstraintSet.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f3362g = {0, 4, 8};

    /* renamed from: h  reason: collision with root package name */
    public static final SparseIntArray f3363h;

    /* renamed from: i  reason: collision with root package name */
    public static final SparseIntArray f3364i;

    /* renamed from: a  reason: collision with root package name */
    public String f3365a;

    /* renamed from: b  reason: collision with root package name */
    public String f3366b = "";
    public int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, ConstraintAttribute> f3367d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f3368e = true;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<Integer, C0012a> f3369f = new HashMap<>();

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0012a {

        /* renamed from: a  reason: collision with root package name */
        public int f3370a;

        /* renamed from: b  reason: collision with root package name */
        public String f3371b;
        public final d c = new d();

        /* renamed from: d  reason: collision with root package name */
        public final c f3372d = new c();

        /* renamed from: e  reason: collision with root package name */
        public final b f3373e = new b();

        /* renamed from: f  reason: collision with root package name */
        public final e f3374f = new e();

        /* renamed from: g  reason: collision with root package name */
        public HashMap<String, ConstraintAttribute> f3375g = new HashMap<>();

        /* renamed from: h  reason: collision with root package name */
        public C0013a f3376h;

        /* compiled from: ConstraintSet.java */
        /* renamed from: androidx.constraintlayout.widget.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0013a {

            /* renamed from: a  reason: collision with root package name */
            public int[] f3377a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            public int[] f3378b = new int[10];
            public int c = 0;

            /* renamed from: d  reason: collision with root package name */
            public int[] f3379d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            public float[] f3380e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            public int f3381f = 0;

            /* renamed from: g  reason: collision with root package name */
            public int[] f3382g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            public String[] f3383h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            public int f3384i = 0;

            /* renamed from: j  reason: collision with root package name */
            public int[] f3385j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            public boolean[] f3386k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            public int f3387l = 0;

            public final void a(float f10, int i10) {
                int i11 = this.f3381f;
                int[] iArr = this.f3379d;
                if (i11 >= iArr.length) {
                    this.f3379d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f3380e;
                    this.f3380e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f3379d;
                int i12 = this.f3381f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f3380e;
                this.f3381f = i12 + 1;
                fArr2[i12] = f10;
            }

            public final void b(int i10, int i11) {
                int i12 = this.c;
                int[] iArr = this.f3377a;
                if (i12 >= iArr.length) {
                    this.f3377a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f3378b;
                    this.f3378b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f3377a;
                int i13 = this.c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f3378b;
                this.c = i13 + 1;
                iArr4[i13] = i11;
            }

            public final void c(int i10, String str) {
                int i11 = this.f3384i;
                int[] iArr = this.f3382g;
                if (i11 >= iArr.length) {
                    this.f3382g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f3383h;
                    this.f3383h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f3382g;
                int i12 = this.f3384i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f3383h;
                this.f3384i = i12 + 1;
                strArr2[i12] = str;
            }

            public final void d(int i10, boolean z10) {
                int i11 = this.f3387l;
                int[] iArr = this.f3385j;
                if (i11 >= iArr.length) {
                    this.f3385j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f3386k;
                    this.f3386k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f3385j;
                int i12 = this.f3387l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f3386k;
                this.f3387l = i12 + 1;
                zArr2[i12] = z10;
            }

            public final void e(C0012a c0012a) {
                for (int i10 = 0; i10 < this.c; i10++) {
                    int i11 = this.f3377a[i10];
                    int i12 = this.f3378b[i10];
                    int[] iArr = a.f3362g;
                    if (i11 != 6) {
                        if (i11 != 7) {
                            if (i11 != 8) {
                                if (i11 != 27) {
                                    if (i11 != 28) {
                                        if (i11 != 41) {
                                            if (i11 != 42) {
                                                if (i11 != 61) {
                                                    if (i11 != 62) {
                                                        if (i11 != 72) {
                                                            if (i11 != 73) {
                                                                if (i11 != 88) {
                                                                    if (i11 != 89) {
                                                                        if (i11 != 2) {
                                                                            if (i11 != 31) {
                                                                                if (i11 != 34) {
                                                                                    if (i11 != 38) {
                                                                                        if (i11 != 64) {
                                                                                            if (i11 != 66) {
                                                                                                if (i11 != 76) {
                                                                                                    if (i11 != 78) {
                                                                                                        if (i11 != 97) {
                                                                                                            if (i11 != 93) {
                                                                                                                if (i11 != 94) {
                                                                                                                    switch (i11) {
                                                                                                                        case 11:
                                                                                                                            c0012a.f3373e.Q = i12;
                                                                                                                            continue;
                                                                                                                        case 12:
                                                                                                                            c0012a.f3373e.R = i12;
                                                                                                                            continue;
                                                                                                                        case 13:
                                                                                                                            c0012a.f3373e.N = i12;
                                                                                                                            continue;
                                                                                                                        case 14:
                                                                                                                            c0012a.f3373e.P = i12;
                                                                                                                            continue;
                                                                                                                        case 15:
                                                                                                                            c0012a.f3373e.S = i12;
                                                                                                                            continue;
                                                                                                                        case 16:
                                                                                                                            c0012a.f3373e.O = i12;
                                                                                                                            continue;
                                                                                                                        case 17:
                                                                                                                            c0012a.f3373e.f3396e = i12;
                                                                                                                            continue;
                                                                                                                        case 18:
                                                                                                                            c0012a.f3373e.f3398f = i12;
                                                                                                                            continue;
                                                                                                                        default:
                                                                                                                            switch (i11) {
                                                                                                                                case 21:
                                                                                                                                    c0012a.f3373e.f3394d = i12;
                                                                                                                                    continue;
                                                                                                                                case 22:
                                                                                                                                    c0012a.c.f3444b = i12;
                                                                                                                                    continue;
                                                                                                                                case 23:
                                                                                                                                    c0012a.f3373e.c = i12;
                                                                                                                                    continue;
                                                                                                                                case 24:
                                                                                                                                    c0012a.f3373e.G = i12;
                                                                                                                                    continue;
                                                                                                                                    continue;
                                                                                                                                default:
                                                                                                                                    switch (i11) {
                                                                                                                                        case 54:
                                                                                                                                            c0012a.f3373e.Y = i12;
                                                                                                                                            continue;
                                                                                                                                        case 55:
                                                                                                                                            c0012a.f3373e.Z = i12;
                                                                                                                                            continue;
                                                                                                                                        case 56:
                                                                                                                                            c0012a.f3373e.f3390a0 = i12;
                                                                                                                                            continue;
                                                                                                                                        case 57:
                                                                                                                                            c0012a.f3373e.f3392b0 = i12;
                                                                                                                                            continue;
                                                                                                                                        case 58:
                                                                                                                                            c0012a.f3373e.f3393c0 = i12;
                                                                                                                                            continue;
                                                                                                                                        case 59:
                                                                                                                                            c0012a.f3373e.f3395d0 = i12;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                        default:
                                                                                                                                            switch (i11) {
                                                                                                                                                case 82:
                                                                                                                                                    c0012a.f3372d.c = i12;
                                                                                                                                                    continue;
                                                                                                                                                case 83:
                                                                                                                                                    c0012a.f3374f.f3455i = i12;
                                                                                                                                                    continue;
                                                                                                                                                case 84:
                                                                                                                                                    c0012a.f3372d.f3439j = i12;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                            }
                                                                                                                                    }
                                                                                                                            }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    c0012a.f3373e.T = i12;
                                                                                                                }
                                                                                                            } else {
                                                                                                                c0012a.f3373e.M = i12;
                                                                                                            }
                                                                                                        } else {
                                                                                                            c0012a.f3373e.f3419p0 = i12;
                                                                                                        }
                                                                                                    } else {
                                                                                                        c0012a.c.c = i12;
                                                                                                    }
                                                                                                } else {
                                                                                                    c0012a.f3372d.f3434e = i12;
                                                                                                }
                                                                                            } else {
                                                                                                c0012a.f3372d.f3435f = i12;
                                                                                            }
                                                                                        } else {
                                                                                            c0012a.f3372d.f3432b = i12;
                                                                                        }
                                                                                    } else {
                                                                                        c0012a.f3370a = i12;
                                                                                    }
                                                                                } else {
                                                                                    c0012a.f3373e.I = i12;
                                                                                }
                                                                            } else {
                                                                                c0012a.f3373e.L = i12;
                                                                            }
                                                                        } else {
                                                                            c0012a.f3373e.J = i12;
                                                                        }
                                                                    } else {
                                                                        c0012a.f3372d.f3442m = i12;
                                                                    }
                                                                } else {
                                                                    c0012a.f3372d.f3441l = i12;
                                                                }
                                                            } else {
                                                                c0012a.f3373e.f3403h0 = i12;
                                                            }
                                                        } else {
                                                            c0012a.f3373e.f3401g0 = i12;
                                                        }
                                                    } else {
                                                        c0012a.f3373e.B = i12;
                                                    }
                                                } else {
                                                    c0012a.f3373e.A = i12;
                                                }
                                            } else {
                                                c0012a.f3373e.X = i12;
                                            }
                                        } else {
                                            c0012a.f3373e.W = i12;
                                        }
                                    } else {
                                        c0012a.f3373e.H = i12;
                                    }
                                } else {
                                    c0012a.f3373e.F = i12;
                                }
                            } else {
                                c0012a.f3373e.K = i12;
                            }
                        } else {
                            c0012a.f3373e.E = i12;
                        }
                    } else {
                        c0012a.f3373e.D = i12;
                    }
                }
                for (int i13 = 0; i13 < this.f3381f; i13++) {
                    int i14 = this.f3379d[i13];
                    float f10 = this.f3380e[i13];
                    int[] iArr2 = a.f3362g;
                    if (i14 != 19) {
                        if (i14 != 20) {
                            if (i14 != 37) {
                                if (i14 != 60) {
                                    if (i14 != 63) {
                                        if (i14 != 79) {
                                            if (i14 != 85) {
                                                if (i14 != 39) {
                                                    if (i14 != 40) {
                                                        switch (i14) {
                                                            case 43:
                                                                c0012a.c.f3445d = f10;
                                                                continue;
                                                            case 44:
                                                                e eVar = c0012a.f3374f;
                                                                eVar.f3460n = f10;
                                                                eVar.f3459m = true;
                                                                continue;
                                                            case 45:
                                                                c0012a.f3374f.c = f10;
                                                                continue;
                                                            case 46:
                                                                c0012a.f3374f.f3450d = f10;
                                                                continue;
                                                            case 47:
                                                                c0012a.f3374f.f3451e = f10;
                                                                continue;
                                                            case 48:
                                                                c0012a.f3374f.f3452f = f10;
                                                                continue;
                                                            case 49:
                                                                c0012a.f3374f.f3453g = f10;
                                                                continue;
                                                            case 50:
                                                                c0012a.f3374f.f3454h = f10;
                                                                continue;
                                                            case 51:
                                                                c0012a.f3374f.f3456j = f10;
                                                                continue;
                                                            case 52:
                                                                c0012a.f3374f.f3457k = f10;
                                                                continue;
                                                            case 53:
                                                                c0012a.f3374f.f3458l = f10;
                                                                continue;
                                                            default:
                                                                switch (i14) {
                                                                    case 67:
                                                                        c0012a.f3372d.f3437h = f10;
                                                                        continue;
                                                                    case 68:
                                                                        c0012a.c.f3446e = f10;
                                                                        continue;
                                                                    case 69:
                                                                        c0012a.f3373e.f3397e0 = f10;
                                                                        continue;
                                                                    case 70:
                                                                        c0012a.f3373e.f3399f0 = f10;
                                                                        continue;
                                                                        continue;
                                                                }
                                                        }
                                                    } else {
                                                        c0012a.f3373e.U = f10;
                                                    }
                                                } else {
                                                    c0012a.f3373e.V = f10;
                                                }
                                            } else {
                                                c0012a.f3372d.f3438i = f10;
                                            }
                                        } else {
                                            c0012a.f3372d.f3436g = f10;
                                        }
                                    } else {
                                        c0012a.f3373e.C = f10;
                                    }
                                } else {
                                    c0012a.f3374f.f3449b = f10;
                                }
                            } else {
                                c0012a.f3373e.f3428y = f10;
                            }
                        } else {
                            c0012a.f3373e.f3427x = f10;
                        }
                    } else {
                        c0012a.f3373e.f3400g = f10;
                    }
                }
                for (int i15 = 0; i15 < this.f3384i; i15++) {
                    int i16 = this.f3382g[i15];
                    String str = this.f3383h[i15];
                    int[] iArr3 = a.f3362g;
                    if (i16 != 5) {
                        if (i16 != 65) {
                            if (i16 != 74) {
                                if (i16 != 77) {
                                    if (i16 == 90) {
                                        c0012a.f3372d.f3440k = str;
                                    }
                                } else {
                                    c0012a.f3373e.f3411l0 = str;
                                }
                            } else {
                                b bVar = c0012a.f3373e;
                                bVar.f3409k0 = str;
                                bVar.f3407j0 = null;
                            }
                        } else {
                            c0012a.f3372d.f3433d = str;
                        }
                    } else {
                        c0012a.f3373e.f3429z = str;
                    }
                }
                for (int i17 = 0; i17 < this.f3387l; i17++) {
                    int i18 = this.f3385j[i17];
                    boolean z10 = this.f3386k[i17];
                    int[] iArr4 = a.f3362g;
                    if (i18 != 44) {
                        if (i18 != 75) {
                            if (i18 != 80) {
                                if (i18 == 81) {
                                    c0012a.f3373e.f3415n0 = z10;
                                }
                            } else {
                                c0012a.f3373e.f3413m0 = z10;
                            }
                        } else {
                            c0012a.f3373e.f3417o0 = z10;
                        }
                    } else {
                        c0012a.f3374f.f3459m = z10;
                    }
                }
            }
        }

        public final void a(ConstraintLayout.b bVar) {
            b bVar2 = this.f3373e;
            bVar.f3301e = bVar2.f3404i;
            bVar.f3303f = bVar2.f3406j;
            bVar.f3305g = bVar2.f3408k;
            bVar.f3307h = bVar2.f3410l;
            bVar.f3309i = bVar2.f3412m;
            bVar.f3311j = bVar2.f3414n;
            bVar.f3313k = bVar2.f3416o;
            bVar.f3315l = bVar2.f3418p;
            bVar.f3317m = bVar2.f3420q;
            bVar.f3319n = bVar2.f3421r;
            bVar.f3321o = bVar2.f3422s;
            bVar.f3328s = bVar2.f3423t;
            bVar.f3329t = bVar2.f3424u;
            bVar.f3330u = bVar2.f3425v;
            bVar.f3331v = bVar2.f3426w;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.G;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.J;
            bVar.A = bVar2.S;
            bVar.B = bVar2.R;
            bVar.f3333x = bVar2.O;
            bVar.f3335z = bVar2.Q;
            bVar.E = bVar2.f3427x;
            bVar.F = bVar2.f3428y;
            bVar.f3323p = bVar2.A;
            bVar.f3325q = bVar2.B;
            bVar.f3327r = bVar2.C;
            bVar.G = bVar2.f3429z;
            bVar.T = bVar2.D;
            bVar.U = bVar2.E;
            bVar.I = bVar2.U;
            bVar.H = bVar2.V;
            bVar.K = bVar2.X;
            bVar.J = bVar2.W;
            bVar.W = bVar2.f3413m0;
            bVar.X = bVar2.f3415n0;
            bVar.L = bVar2.Y;
            bVar.M = bVar2.Z;
            bVar.P = bVar2.f3390a0;
            bVar.Q = bVar2.f3392b0;
            bVar.N = bVar2.f3393c0;
            bVar.O = bVar2.f3395d0;
            bVar.R = bVar2.f3397e0;
            bVar.S = bVar2.f3399f0;
            bVar.V = bVar2.F;
            bVar.c = bVar2.f3400g;
            bVar.f3294a = bVar2.f3396e;
            bVar.f3296b = bVar2.f3398f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f3394d;
            String str = bVar2.f3411l0;
            if (str != null) {
                bVar.Y = str;
            }
            bVar.Z = bVar2.f3419p0;
            bVar.setMarginStart(bVar2.L);
            bVar.setMarginEnd(bVar2.K);
            bVar.a();
        }

        /* renamed from: b */
        public final C0012a clone() {
            C0012a c0012a = new C0012a();
            c0012a.f3373e.a(this.f3373e);
            c0012a.f3372d.a(this.f3372d);
            d dVar = c0012a.c;
            dVar.getClass();
            d dVar2 = this.c;
            dVar.f3443a = dVar2.f3443a;
            dVar.f3444b = dVar2.f3444b;
            dVar.f3445d = dVar2.f3445d;
            dVar.f3446e = dVar2.f3446e;
            dVar.c = dVar2.c;
            c0012a.f3374f.a(this.f3374f);
            c0012a.f3370a = this.f3370a;
            c0012a.f3376h = this.f3376h;
            return c0012a;
        }

        public final void c(int i10, ConstraintLayout.b bVar) {
            this.f3370a = i10;
            int i11 = bVar.f3301e;
            b bVar2 = this.f3373e;
            bVar2.f3404i = i11;
            bVar2.f3406j = bVar.f3303f;
            bVar2.f3408k = bVar.f3305g;
            bVar2.f3410l = bVar.f3307h;
            bVar2.f3412m = bVar.f3309i;
            bVar2.f3414n = bVar.f3311j;
            bVar2.f3416o = bVar.f3313k;
            bVar2.f3418p = bVar.f3315l;
            bVar2.f3420q = bVar.f3317m;
            bVar2.f3421r = bVar.f3319n;
            bVar2.f3422s = bVar.f3321o;
            bVar2.f3423t = bVar.f3328s;
            bVar2.f3424u = bVar.f3329t;
            bVar2.f3425v = bVar.f3330u;
            bVar2.f3426w = bVar.f3331v;
            bVar2.f3427x = bVar.E;
            bVar2.f3428y = bVar.F;
            bVar2.f3429z = bVar.G;
            bVar2.A = bVar.f3323p;
            bVar2.B = bVar.f3325q;
            bVar2.C = bVar.f3327r;
            bVar2.D = bVar.T;
            bVar2.E = bVar.U;
            bVar2.F = bVar.V;
            bVar2.f3400g = bVar.c;
            bVar2.f3396e = bVar.f3294a;
            bVar2.f3398f = bVar.f3296b;
            bVar2.c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f3394d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.G = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.M = bVar.D;
            bVar2.U = bVar.I;
            bVar2.V = bVar.H;
            bVar2.X = bVar.K;
            bVar2.W = bVar.J;
            bVar2.f3413m0 = bVar.W;
            bVar2.f3415n0 = bVar.X;
            bVar2.Y = bVar.L;
            bVar2.Z = bVar.M;
            bVar2.f3390a0 = bVar.P;
            bVar2.f3392b0 = bVar.Q;
            bVar2.f3393c0 = bVar.N;
            bVar2.f3395d0 = bVar.O;
            bVar2.f3397e0 = bVar.R;
            bVar2.f3399f0 = bVar.S;
            bVar2.f3411l0 = bVar.Y;
            bVar2.O = bVar.f3333x;
            bVar2.Q = bVar.f3335z;
            bVar2.N = bVar.f3332w;
            bVar2.P = bVar.f3334y;
            bVar2.S = bVar.A;
            bVar2.R = bVar.B;
            bVar2.T = bVar.C;
            bVar2.f3419p0 = bVar.Z;
            bVar2.K = bVar.getMarginEnd();
            bVar2.L = bVar.getMarginStart();
        }

        public final void d(int i10, Constraints.a aVar) {
            c(i10, aVar);
            this.c.f3445d = aVar.f3345r0;
            float f10 = aVar.f3348u0;
            e eVar = this.f3374f;
            eVar.f3449b = f10;
            eVar.c = aVar.f3349v0;
            eVar.f3450d = aVar.f3350w0;
            eVar.f3451e = aVar.f3351x0;
            eVar.f3452f = aVar.f3352y0;
            eVar.f3453g = aVar.f3353z0;
            eVar.f3454h = aVar.A0;
            eVar.f3456j = aVar.B0;
            eVar.f3457k = aVar.C0;
            eVar.f3458l = aVar.D0;
            eVar.f3460n = aVar.f3347t0;
            eVar.f3459m = aVar.f3346s0;
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: q0  reason: collision with root package name */
        public static final SparseIntArray f3388q0;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f3394d;

        /* renamed from: j0  reason: collision with root package name */
        public int[] f3407j0;

        /* renamed from: k0  reason: collision with root package name */
        public String f3409k0;

        /* renamed from: l0  reason: collision with root package name */
        public String f3411l0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f3389a = false;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3391b = false;

        /* renamed from: e  reason: collision with root package name */
        public int f3396e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f3398f = -1;

        /* renamed from: g  reason: collision with root package name */
        public float f3400g = -1.0f;

        /* renamed from: h  reason: collision with root package name */
        public boolean f3402h = true;

        /* renamed from: i  reason: collision with root package name */
        public int f3404i = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f3406j = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f3408k = -1;

        /* renamed from: l  reason: collision with root package name */
        public int f3410l = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f3412m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f3414n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f3416o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f3418p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f3420q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f3421r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f3422s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f3423t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f3424u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f3425v = -1;

        /* renamed from: w  reason: collision with root package name */
        public int f3426w = -1;

        /* renamed from: x  reason: collision with root package name */
        public float f3427x = 0.5f;

        /* renamed from: y  reason: collision with root package name */
        public float f3428y = 0.5f;

        /* renamed from: z  reason: collision with root package name */
        public String f3429z = null;
        public int A = -1;
        public int B = 0;
        public float C = 0.0f;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = SlideAtom.USES_MASTER_SLIDE_ID;
        public int O = SlideAtom.USES_MASTER_SLIDE_ID;
        public int P = SlideAtom.USES_MASTER_SLIDE_ID;
        public int Q = SlideAtom.USES_MASTER_SLIDE_ID;
        public int R = SlideAtom.USES_MASTER_SLIDE_ID;
        public int S = SlideAtom.USES_MASTER_SLIDE_ID;
        public int T = SlideAtom.USES_MASTER_SLIDE_ID;
        public float U = -1.0f;
        public float V = -1.0f;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a0  reason: collision with root package name */
        public int f3390a0 = 0;

        /* renamed from: b0  reason: collision with root package name */
        public int f3392b0 = 0;

        /* renamed from: c0  reason: collision with root package name */
        public int f3393c0 = 0;

        /* renamed from: d0  reason: collision with root package name */
        public int f3395d0 = 0;

        /* renamed from: e0  reason: collision with root package name */
        public float f3397e0 = 1.0f;

        /* renamed from: f0  reason: collision with root package name */
        public float f3399f0 = 1.0f;

        /* renamed from: g0  reason: collision with root package name */
        public int f3401g0 = -1;

        /* renamed from: h0  reason: collision with root package name */
        public int f3403h0 = 0;

        /* renamed from: i0  reason: collision with root package name */
        public int f3405i0 = -1;

        /* renamed from: m0  reason: collision with root package name */
        public boolean f3413m0 = false;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f3415n0 = false;

        /* renamed from: o0  reason: collision with root package name */
        public boolean f3417o0 = true;

        /* renamed from: p0  reason: collision with root package name */
        public int f3419p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3388q0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 41);
            sparseIntArray.append(16, 42);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
        }

        public final void a(b bVar) {
            this.f3389a = bVar.f3389a;
            this.c = bVar.c;
            this.f3391b = bVar.f3391b;
            this.f3394d = bVar.f3394d;
            this.f3396e = bVar.f3396e;
            this.f3398f = bVar.f3398f;
            this.f3400g = bVar.f3400g;
            this.f3402h = bVar.f3402h;
            this.f3404i = bVar.f3404i;
            this.f3406j = bVar.f3406j;
            this.f3408k = bVar.f3408k;
            this.f3410l = bVar.f3410l;
            this.f3412m = bVar.f3412m;
            this.f3414n = bVar.f3414n;
            this.f3416o = bVar.f3416o;
            this.f3418p = bVar.f3418p;
            this.f3420q = bVar.f3420q;
            this.f3421r = bVar.f3421r;
            this.f3422s = bVar.f3422s;
            this.f3423t = bVar.f3423t;
            this.f3424u = bVar.f3424u;
            this.f3425v = bVar.f3425v;
            this.f3426w = bVar.f3426w;
            this.f3427x = bVar.f3427x;
            this.f3428y = bVar.f3428y;
            this.f3429z = bVar.f3429z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f3390a0 = bVar.f3390a0;
            this.f3392b0 = bVar.f3392b0;
            this.f3393c0 = bVar.f3393c0;
            this.f3395d0 = bVar.f3395d0;
            this.f3397e0 = bVar.f3397e0;
            this.f3399f0 = bVar.f3399f0;
            this.f3401g0 = bVar.f3401g0;
            this.f3403h0 = bVar.f3403h0;
            this.f3405i0 = bVar.f3405i0;
            this.f3411l0 = bVar.f3411l0;
            int[] iArr = bVar.f3407j0;
            if (iArr != null && bVar.f3409k0 == null) {
                this.f3407j0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f3407j0 = null;
            }
            this.f3409k0 = bVar.f3409k0;
            this.f3413m0 = bVar.f3413m0;
            this.f3415n0 = bVar.f3415n0;
            this.f3417o0 = bVar.f3417o0;
            this.f3419p0 = bVar.f3419p0;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.d.f17352o);
            this.f3391b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                SparseIntArray sparseIntArray = f3388q0;
                int i11 = sparseIntArray.get(index);
                switch (i11) {
                    case 1:
                        this.f3420q = a.o(obtainStyledAttributes, index, this.f3420q);
                        break;
                    case 2:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 3:
                        this.f3418p = a.o(obtainStyledAttributes, index, this.f3418p);
                        break;
                    case 4:
                        this.f3416o = a.o(obtainStyledAttributes, index, this.f3416o);
                        break;
                    case 5:
                        this.f3429z = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 7:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 8:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 9:
                        this.f3426w = a.o(obtainStyledAttributes, index, this.f3426w);
                        break;
                    case 10:
                        this.f3425v = a.o(obtainStyledAttributes, index, this.f3425v);
                        break;
                    case 11:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 12:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 13:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 14:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 15:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 16:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 17:
                        this.f3396e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3396e);
                        break;
                    case 18:
                        this.f3398f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3398f);
                        break;
                    case 19:
                        this.f3400g = obtainStyledAttributes.getFloat(index, this.f3400g);
                        break;
                    case 20:
                        this.f3427x = obtainStyledAttributes.getFloat(index, this.f3427x);
                        break;
                    case 21:
                        this.f3394d = obtainStyledAttributes.getLayoutDimension(index, this.f3394d);
                        break;
                    case 22:
                        this.c = obtainStyledAttributes.getLayoutDimension(index, this.c);
                        break;
                    case 23:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 24:
                        this.f3404i = a.o(obtainStyledAttributes, index, this.f3404i);
                        break;
                    case 25:
                        this.f3406j = a.o(obtainStyledAttributes, index, this.f3406j);
                        break;
                    case 26:
                        this.F = obtainStyledAttributes.getInt(index, this.F);
                        break;
                    case 27:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 28:
                        this.f3408k = a.o(obtainStyledAttributes, index, this.f3408k);
                        break;
                    case 29:
                        this.f3410l = a.o(obtainStyledAttributes, index, this.f3410l);
                        break;
                    case 30:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 31:
                        this.f3423t = a.o(obtainStyledAttributes, index, this.f3423t);
                        break;
                    case 32:
                        this.f3424u = a.o(obtainStyledAttributes, index, this.f3424u);
                        break;
                    case 33:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 34:
                        this.f3414n = a.o(obtainStyledAttributes, index, this.f3414n);
                        break;
                    case 35:
                        this.f3412m = a.o(obtainStyledAttributes, index, this.f3412m);
                        break;
                    case 36:
                        this.f3428y = obtainStyledAttributes.getFloat(index, this.f3428y);
                        break;
                    case 37:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 38:
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 39:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 40:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 41:
                        a.p(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        a.p(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.A = a.o(obtainStyledAttributes, index, this.A);
                                continue;
                            case 62:
                                this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                continue;
                            case 63:
                                this.C = obtainStyledAttributes.getFloat(index, this.C);
                                continue;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f3397e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 70:
                                        this.f3399f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        continue;
                                    case 72:
                                        this.f3401g0 = obtainStyledAttributes.getInt(index, this.f3401g0);
                                        continue;
                                    case 73:
                                        this.f3403h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3403h0);
                                        continue;
                                    case 74:
                                        this.f3409k0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.f3417o0 = obtainStyledAttributes.getBoolean(index, this.f3417o0);
                                        continue;
                                    case 76:
                                        this.f3419p0 = obtainStyledAttributes.getInt(index, this.f3419p0);
                                        continue;
                                    case 77:
                                        this.f3421r = a.o(obtainStyledAttributes, index, this.f3421r);
                                        continue;
                                    case 78:
                                        this.f3422s = a.o(obtainStyledAttributes, index, this.f3422s);
                                        continue;
                                    case 79:
                                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                        continue;
                                    case 80:
                                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                        continue;
                                    case 81:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        continue;
                                    case 82:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 83:
                                        this.f3392b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3392b0);
                                        continue;
                                    case 84:
                                        this.f3390a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3390a0);
                                        continue;
                                    case 85:
                                        this.f3395d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3395d0);
                                        continue;
                                    case 86:
                                        this.f3393c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3393c0);
                                        continue;
                                    case 87:
                                        this.f3413m0 = obtainStyledAttributes.getBoolean(index, this.f3413m0);
                                        continue;
                                    case 88:
                                        this.f3415n0 = obtainStyledAttributes.getBoolean(index, this.f3415n0);
                                        continue;
                                    case 89:
                                        this.f3411l0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.f3402h = obtainStyledAttributes.getBoolean(index, this.f3402h);
                                        continue;
                                    case 91:
                                        Integer.toHexString(index);
                                        sparseIntArray.get(index);
                                        continue;
                                    default:
                                        Integer.toHexString(index);
                                        sparseIntArray.get(index);
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: n  reason: collision with root package name */
        public static final SparseIntArray f3430n;

        /* renamed from: a  reason: collision with root package name */
        public boolean f3431a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f3432b = -1;
        public int c = 0;

        /* renamed from: d  reason: collision with root package name */
        public String f3433d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f3434e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f3435f = 0;

        /* renamed from: g  reason: collision with root package name */
        public float f3436g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f3437h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public float f3438i = Float.NaN;

        /* renamed from: j  reason: collision with root package name */
        public int f3439j = -1;

        /* renamed from: k  reason: collision with root package name */
        public String f3440k = null;

        /* renamed from: l  reason: collision with root package name */
        public int f3441l = -3;

        /* renamed from: m  reason: collision with root package name */
        public int f3442m = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3430n = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void a(c cVar) {
            this.f3431a = cVar.f3431a;
            this.f3432b = cVar.f3432b;
            this.f3433d = cVar.f3433d;
            this.f3434e = cVar.f3434e;
            this.f3435f = cVar.f3435f;
            this.f3437h = cVar.f3437h;
            this.f3436g = cVar.f3436g;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.d.f17354q);
            this.f3431a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f3430n.get(index)) {
                    case 1:
                        this.f3437h = obtainStyledAttributes.getFloat(index, this.f3437h);
                        break;
                    case 2:
                        this.f3434e = obtainStyledAttributes.getInt(index, this.f3434e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f3433d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f3433d = b0.c.c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f3435f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f3432b = a.o(obtainStyledAttributes, index, this.f3432b);
                        break;
                    case 6:
                        this.c = obtainStyledAttributes.getInteger(index, this.c);
                        break;
                    case 7:
                        this.f3436g = obtainStyledAttributes.getFloat(index, this.f3436g);
                        break;
                    case 8:
                        this.f3439j = obtainStyledAttributes.getInteger(index, this.f3439j);
                        break;
                    case 9:
                        this.f3438i = obtainStyledAttributes.getFloat(index, this.f3438i);
                        break;
                    case 10:
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f3442m = resourceId;
                            if (resourceId != -1) {
                                this.f3441l = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i11 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f3440k = string;
                            if (string.indexOf(PackagingURIHelper.FORWARD_SLASH_STRING) > 0) {
                                this.f3442m = obtainStyledAttributes.getResourceId(index, -1);
                                this.f3441l = -2;
                                break;
                            } else {
                                this.f3441l = -1;
                                break;
                            }
                        } else {
                            this.f3441l = obtainStyledAttributes.getInteger(index, this.f3442m);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3443a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f3444b = 0;
        public int c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f3445d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f3446e = Float.NaN;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.d.f17363z);
            this.f3443a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.f3445d = obtainStyledAttributes.getFloat(index, this.f3445d);
                } else if (index == 0) {
                    int i11 = obtainStyledAttributes.getInt(index, this.f3444b);
                    this.f3444b = i11;
                    this.f3444b = a.f3362g[i11];
                } else if (index == 4) {
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                } else if (index == 3) {
                    this.f3446e = obtainStyledAttributes.getFloat(index, this.f3446e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: o  reason: collision with root package name */
        public static final SparseIntArray f3447o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f3448a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f3449b = 0.0f;
        public float c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f3450d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f3451e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f3452f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f3453g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f3454h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public int f3455i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f3456j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f3457k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f3458l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public boolean f3459m = false;

        /* renamed from: n  reason: collision with root package name */
        public float f3460n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3447o = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void a(e eVar) {
            this.f3448a = eVar.f3448a;
            this.f3449b = eVar.f3449b;
            this.c = eVar.c;
            this.f3450d = eVar.f3450d;
            this.f3451e = eVar.f3451e;
            this.f3452f = eVar.f3452f;
            this.f3453g = eVar.f3453g;
            this.f3454h = eVar.f3454h;
            this.f3455i = eVar.f3455i;
            this.f3456j = eVar.f3456j;
            this.f3457k = eVar.f3457k;
            this.f3458l = eVar.f3458l;
            this.f3459m = eVar.f3459m;
            this.f3460n = eVar.f3460n;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.d.C);
            this.f3448a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f3447o.get(index)) {
                    case 1:
                        this.f3449b = obtainStyledAttributes.getFloat(index, this.f3449b);
                        break;
                    case 2:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 3:
                        this.f3450d = obtainStyledAttributes.getFloat(index, this.f3450d);
                        break;
                    case 4:
                        this.f3451e = obtainStyledAttributes.getFloat(index, this.f3451e);
                        break;
                    case 5:
                        this.f3452f = obtainStyledAttributes.getFloat(index, this.f3452f);
                        break;
                    case 6:
                        this.f3453g = obtainStyledAttributes.getDimension(index, this.f3453g);
                        break;
                    case 7:
                        this.f3454h = obtainStyledAttributes.getDimension(index, this.f3454h);
                        break;
                    case 8:
                        this.f3456j = obtainStyledAttributes.getDimension(index, this.f3456j);
                        break;
                    case 9:
                        this.f3457k = obtainStyledAttributes.getDimension(index, this.f3457k);
                        break;
                    case 10:
                        this.f3458l = obtainStyledAttributes.getDimension(index, this.f3458l);
                        break;
                    case 11:
                        this.f3459m = true;
                        this.f3460n = obtainStyledAttributes.getDimension(index, this.f3460n);
                        break;
                    case 12:
                        this.f3455i = a.o(obtainStyledAttributes, index, this.f3455i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3363h = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f3364i = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static C0012a d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        C0012a c0012a = new C0012a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, g0.d.f17343f);
        r(c0012a, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return c0012a;
    }

    public static int[] i(Barrier barrier, String str) {
        int i10;
        HashMap<String, Integer> hashMap;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            Integer num = null;
            try {
                i10 = g0.c.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, FacebookMediationAdapter.KEY_ID, context.getPackageName());
            }
            if (i10 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.f3290m) != null && hashMap.containsKey(trim)) {
                    num = constraintLayout.f3290m.get(trim);
                }
                if (num != null && (num instanceof Integer)) {
                    i10 = num.intValue();
                }
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        if (i12 != split.length) {
            return Arrays.copyOf(iArr, i12);
        }
        return iArr;
    }

    public static C0012a j(Context context, AttributeSet attributeSet, boolean z10) {
        int[] iArr;
        C0012a c0012a = new C0012a();
        if (z10) {
            iArr = g0.d.f17343f;
        } else {
            iArr = g0.d.f17340b;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (z10) {
            r(c0012a, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i10 = 0;
            while (true) {
                b bVar = c0012a.f3373e;
                if (i10 < indexCount) {
                    int index = obtainStyledAttributes.getIndex(i10);
                    d dVar = c0012a.c;
                    e eVar = c0012a.f3374f;
                    c cVar = c0012a.f3372d;
                    if (index != 1 && 23 != index && 24 != index) {
                        cVar.f3431a = true;
                        bVar.f3391b = true;
                        dVar.f3443a = true;
                        eVar.f3448a = true;
                    }
                    SparseIntArray sparseIntArray = f3363h;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            bVar.f3420q = o(obtainStyledAttributes, index, bVar.f3420q);
                            break;
                        case 2:
                            bVar.J = obtainStyledAttributes.getDimensionPixelSize(index, bVar.J);
                            break;
                        case 3:
                            bVar.f3418p = o(obtainStyledAttributes, index, bVar.f3418p);
                            break;
                        case 4:
                            bVar.f3416o = o(obtainStyledAttributes, index, bVar.f3416o);
                            break;
                        case 5:
                            bVar.f3429z = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            bVar.D = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.D);
                            break;
                        case 7:
                            bVar.E = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.E);
                            break;
                        case 8:
                            bVar.K = obtainStyledAttributes.getDimensionPixelSize(index, bVar.K);
                            break;
                        case 9:
                            bVar.f3426w = o(obtainStyledAttributes, index, bVar.f3426w);
                            break;
                        case 10:
                            bVar.f3425v = o(obtainStyledAttributes, index, bVar.f3425v);
                            break;
                        case 11:
                            bVar.Q = obtainStyledAttributes.getDimensionPixelSize(index, bVar.Q);
                            break;
                        case 12:
                            bVar.R = obtainStyledAttributes.getDimensionPixelSize(index, bVar.R);
                            break;
                        case 13:
                            bVar.N = obtainStyledAttributes.getDimensionPixelSize(index, bVar.N);
                            break;
                        case 14:
                            bVar.P = obtainStyledAttributes.getDimensionPixelSize(index, bVar.P);
                            break;
                        case 15:
                            bVar.S = obtainStyledAttributes.getDimensionPixelSize(index, bVar.S);
                            break;
                        case 16:
                            bVar.O = obtainStyledAttributes.getDimensionPixelSize(index, bVar.O);
                            break;
                        case 17:
                            bVar.f3396e = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.f3396e);
                            break;
                        case 18:
                            bVar.f3398f = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.f3398f);
                            break;
                        case 19:
                            bVar.f3400g = obtainStyledAttributes.getFloat(index, bVar.f3400g);
                            break;
                        case 20:
                            bVar.f3427x = obtainStyledAttributes.getFloat(index, bVar.f3427x);
                            break;
                        case 21:
                            bVar.f3394d = obtainStyledAttributes.getLayoutDimension(index, bVar.f3394d);
                            break;
                        case 22:
                            dVar.f3444b = f3362g[obtainStyledAttributes.getInt(index, dVar.f3444b)];
                            break;
                        case 23:
                            bVar.c = obtainStyledAttributes.getLayoutDimension(index, bVar.c);
                            break;
                        case 24:
                            bVar.G = obtainStyledAttributes.getDimensionPixelSize(index, bVar.G);
                            break;
                        case 25:
                            bVar.f3404i = o(obtainStyledAttributes, index, bVar.f3404i);
                            break;
                        case 26:
                            bVar.f3406j = o(obtainStyledAttributes, index, bVar.f3406j);
                            break;
                        case 27:
                            bVar.F = obtainStyledAttributes.getInt(index, bVar.F);
                            break;
                        case 28:
                            bVar.H = obtainStyledAttributes.getDimensionPixelSize(index, bVar.H);
                            break;
                        case 29:
                            bVar.f3408k = o(obtainStyledAttributes, index, bVar.f3408k);
                            break;
                        case 30:
                            bVar.f3410l = o(obtainStyledAttributes, index, bVar.f3410l);
                            break;
                        case 31:
                            bVar.L = obtainStyledAttributes.getDimensionPixelSize(index, bVar.L);
                            break;
                        case 32:
                            bVar.f3423t = o(obtainStyledAttributes, index, bVar.f3423t);
                            break;
                        case 33:
                            bVar.f3424u = o(obtainStyledAttributes, index, bVar.f3424u);
                            break;
                        case 34:
                            bVar.I = obtainStyledAttributes.getDimensionPixelSize(index, bVar.I);
                            break;
                        case 35:
                            bVar.f3414n = o(obtainStyledAttributes, index, bVar.f3414n);
                            break;
                        case 36:
                            bVar.f3412m = o(obtainStyledAttributes, index, bVar.f3412m);
                            break;
                        case 37:
                            bVar.f3428y = obtainStyledAttributes.getFloat(index, bVar.f3428y);
                            break;
                        case 38:
                            c0012a.f3370a = obtainStyledAttributes.getResourceId(index, c0012a.f3370a);
                            break;
                        case 39:
                            bVar.V = obtainStyledAttributes.getFloat(index, bVar.V);
                            break;
                        case 40:
                            bVar.U = obtainStyledAttributes.getFloat(index, bVar.U);
                            break;
                        case 41:
                            bVar.W = obtainStyledAttributes.getInt(index, bVar.W);
                            break;
                        case 42:
                            bVar.X = obtainStyledAttributes.getInt(index, bVar.X);
                            break;
                        case 43:
                            dVar.f3445d = obtainStyledAttributes.getFloat(index, dVar.f3445d);
                            break;
                        case 44:
                            eVar.f3459m = true;
                            eVar.f3460n = obtainStyledAttributes.getDimension(index, eVar.f3460n);
                            break;
                        case 45:
                            eVar.c = obtainStyledAttributes.getFloat(index, eVar.c);
                            break;
                        case 46:
                            eVar.f3450d = obtainStyledAttributes.getFloat(index, eVar.f3450d);
                            break;
                        case 47:
                            eVar.f3451e = obtainStyledAttributes.getFloat(index, eVar.f3451e);
                            break;
                        case 48:
                            eVar.f3452f = obtainStyledAttributes.getFloat(index, eVar.f3452f);
                            break;
                        case 49:
                            eVar.f3453g = obtainStyledAttributes.getDimension(index, eVar.f3453g);
                            break;
                        case 50:
                            eVar.f3454h = obtainStyledAttributes.getDimension(index, eVar.f3454h);
                            break;
                        case 51:
                            eVar.f3456j = obtainStyledAttributes.getDimension(index, eVar.f3456j);
                            break;
                        case 52:
                            eVar.f3457k = obtainStyledAttributes.getDimension(index, eVar.f3457k);
                            break;
                        case 53:
                            eVar.f3458l = obtainStyledAttributes.getDimension(index, eVar.f3458l);
                            break;
                        case 54:
                            bVar.Y = obtainStyledAttributes.getInt(index, bVar.Y);
                            break;
                        case 55:
                            bVar.Z = obtainStyledAttributes.getInt(index, bVar.Z);
                            break;
                        case 56:
                            bVar.f3390a0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f3390a0);
                            break;
                        case 57:
                            bVar.f3392b0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f3392b0);
                            break;
                        case 58:
                            bVar.f3393c0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f3393c0);
                            break;
                        case 59:
                            bVar.f3395d0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f3395d0);
                            break;
                        case 60:
                            eVar.f3449b = obtainStyledAttributes.getFloat(index, eVar.f3449b);
                            break;
                        case 61:
                            bVar.A = o(obtainStyledAttributes, index, bVar.A);
                            break;
                        case 62:
                            bVar.B = obtainStyledAttributes.getDimensionPixelSize(index, bVar.B);
                            break;
                        case 63:
                            bVar.C = obtainStyledAttributes.getFloat(index, bVar.C);
                            break;
                        case 64:
                            cVar.f3432b = o(obtainStyledAttributes, index, cVar.f3432b);
                            break;
                        case 65:
                            if (obtainStyledAttributes.peekValue(index).type == 3) {
                                cVar.f3433d = obtainStyledAttributes.getString(index);
                                break;
                            } else {
                                cVar.f3433d = b0.c.c[obtainStyledAttributes.getInteger(index, 0)];
                                break;
                            }
                        case 66:
                            cVar.f3435f = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            cVar.f3437h = obtainStyledAttributes.getFloat(index, cVar.f3437h);
                            break;
                        case 68:
                            dVar.f3446e = obtainStyledAttributes.getFloat(index, dVar.f3446e);
                            break;
                        case 69:
                            bVar.f3397e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            bVar.f3399f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            break;
                        case 72:
                            bVar.f3401g0 = obtainStyledAttributes.getInt(index, bVar.f3401g0);
                            break;
                        case 73:
                            bVar.f3403h0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f3403h0);
                            break;
                        case 74:
                            bVar.f3409k0 = obtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            bVar.f3417o0 = obtainStyledAttributes.getBoolean(index, bVar.f3417o0);
                            break;
                        case 76:
                            cVar.f3434e = obtainStyledAttributes.getInt(index, cVar.f3434e);
                            break;
                        case 77:
                            bVar.f3411l0 = obtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            dVar.c = obtainStyledAttributes.getInt(index, dVar.c);
                            break;
                        case 79:
                            cVar.f3436g = obtainStyledAttributes.getFloat(index, cVar.f3436g);
                            break;
                        case 80:
                            bVar.f3413m0 = obtainStyledAttributes.getBoolean(index, bVar.f3413m0);
                            break;
                        case 81:
                            bVar.f3415n0 = obtainStyledAttributes.getBoolean(index, bVar.f3415n0);
                            break;
                        case 82:
                            cVar.c = obtainStyledAttributes.getInteger(index, cVar.c);
                            break;
                        case 83:
                            eVar.f3455i = o(obtainStyledAttributes, index, eVar.f3455i);
                            break;
                        case 84:
                            cVar.f3439j = obtainStyledAttributes.getInteger(index, cVar.f3439j);
                            break;
                        case 85:
                            cVar.f3438i = obtainStyledAttributes.getFloat(index, cVar.f3438i);
                            break;
                        case 86:
                            int i11 = obtainStyledAttributes.peekValue(index).type;
                            if (i11 == 1) {
                                int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                cVar.f3442m = resourceId;
                                if (resourceId == -1) {
                                    break;
                                } else {
                                    cVar.f3441l = -2;
                                    break;
                                }
                            } else if (i11 == 3) {
                                String string = obtainStyledAttributes.getString(index);
                                cVar.f3440k = string;
                                if (string.indexOf(PackagingURIHelper.FORWARD_SLASH_STRING) > 0) {
                                    cVar.f3442m = obtainStyledAttributes.getResourceId(index, -1);
                                    cVar.f3441l = -2;
                                    break;
                                } else {
                                    cVar.f3441l = -1;
                                    break;
                                }
                            } else {
                                cVar.f3441l = obtainStyledAttributes.getInteger(index, cVar.f3442m);
                                break;
                            }
                        case 87:
                            Integer.toHexString(index);
                            sparseIntArray.get(index);
                            break;
                        case 88:
                        case 89:
                        case 90:
                        default:
                            Integer.toHexString(index);
                            sparseIntArray.get(index);
                            break;
                        case 91:
                            bVar.f3421r = o(obtainStyledAttributes, index, bVar.f3421r);
                            break;
                        case 92:
                            bVar.f3422s = o(obtainStyledAttributes, index, bVar.f3422s);
                            break;
                        case 93:
                            bVar.M = obtainStyledAttributes.getDimensionPixelSize(index, bVar.M);
                            break;
                        case 94:
                            bVar.T = obtainStyledAttributes.getDimensionPixelSize(index, bVar.T);
                            break;
                        case 95:
                            p(bVar, obtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            p(bVar, obtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            bVar.f3419p0 = obtainStyledAttributes.getInt(index, bVar.f3419p0);
                            break;
                    }
                    i10++;
                } else if (bVar.f3409k0 != null) {
                    bVar.f3407j0 = null;
                }
            }
        }
        obtainStyledAttributes.recycle();
        return c0012a;
    }

    public static int o(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        if (resourceId == -1) {
            return typedArray.getInt(i10, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void p(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.p(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void q(ConstraintLayout.b bVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i10 = 0;
            int i11 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase(StandardStructureTypes.H)) {
                        i10 = 1;
                    } else {
                        i10 = -1;
                    }
                }
                i11 = i10;
                i10 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i10, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i11 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                } else {
                    String substring4 = str.substring(i10);
                    if (substring4.length() > 0) {
                        Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.G = str;
    }

    public static void r(C0012a c0012a, TypedArray typedArray) {
        int i10;
        int indexCount = typedArray.getIndexCount();
        C0012a.C0013a c0013a = new C0012a.C0013a();
        c0012a.f3376h = c0013a;
        c cVar = c0012a.f3372d;
        int i11 = 0;
        cVar.f3431a = false;
        b bVar = c0012a.f3373e;
        bVar.f3391b = false;
        d dVar = c0012a.c;
        dVar.f3443a = false;
        e eVar = c0012a.f3374f;
        eVar.f3448a = false;
        int i12 = 0;
        while (i12 < indexCount) {
            int index = typedArray.getIndex(i12);
            int i13 = f3364i.get(index);
            SparseIntArray sparseIntArray = f3363h;
            switch (i13) {
                case 2:
                    i10 = i11;
                    c0013a.b(2, typedArray.getDimensionPixelSize(index, bVar.J));
                    continue;
                    i12++;
                    i11 = i10;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    i10 = i11;
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    continue;
                    i12++;
                    i11 = i10;
                case 5:
                    i10 = i11;
                    c0013a.c(5, typedArray.getString(index));
                    continue;
                    i12++;
                    i11 = i10;
                case 6:
                    i10 = i11;
                    c0013a.b(6, typedArray.getDimensionPixelOffset(index, bVar.D));
                    continue;
                    i12++;
                    i11 = i10;
                case 7:
                    i10 = i11;
                    c0013a.b(7, typedArray.getDimensionPixelOffset(index, bVar.E));
                    continue;
                    i12++;
                    i11 = i10;
                case 8:
                    i10 = i11;
                    c0013a.b(8, typedArray.getDimensionPixelSize(index, bVar.K));
                    continue;
                    i12++;
                    i11 = i10;
                case 11:
                    i10 = i11;
                    c0013a.b(11, typedArray.getDimensionPixelSize(index, bVar.Q));
                    continue;
                    i12++;
                    i11 = i10;
                case 12:
                    i10 = i11;
                    c0013a.b(12, typedArray.getDimensionPixelSize(index, bVar.R));
                    continue;
                    i12++;
                    i11 = i10;
                case 13:
                    i10 = i11;
                    c0013a.b(13, typedArray.getDimensionPixelSize(index, bVar.N));
                    continue;
                    i12++;
                    i11 = i10;
                case 14:
                    i10 = i11;
                    c0013a.b(14, typedArray.getDimensionPixelSize(index, bVar.P));
                    continue;
                    i12++;
                    i11 = i10;
                case 15:
                    i10 = i11;
                    c0013a.b(15, typedArray.getDimensionPixelSize(index, bVar.S));
                    continue;
                    i12++;
                    i11 = i10;
                case 16:
                    i10 = i11;
                    c0013a.b(16, typedArray.getDimensionPixelSize(index, bVar.O));
                    continue;
                    i12++;
                    i11 = i10;
                case 17:
                    i10 = i11;
                    c0013a.b(17, typedArray.getDimensionPixelOffset(index, bVar.f3396e));
                    continue;
                    i12++;
                    i11 = i10;
                case 18:
                    i10 = i11;
                    c0013a.b(18, typedArray.getDimensionPixelOffset(index, bVar.f3398f));
                    continue;
                    i12++;
                    i11 = i10;
                case 19:
                    i10 = i11;
                    c0013a.a(typedArray.getFloat(index, bVar.f3400g), 19);
                    continue;
                    i12++;
                    i11 = i10;
                case 20:
                    i10 = i11;
                    c0013a.a(typedArray.getFloat(index, bVar.f3427x), 20);
                    continue;
                    i12++;
                    i11 = i10;
                case 21:
                    i10 = i11;
                    c0013a.b(21, typedArray.getLayoutDimension(index, bVar.f3394d));
                    continue;
                    i12++;
                    i11 = i10;
                case 22:
                    i10 = i11;
                    c0013a.b(22, f3362g[typedArray.getInt(index, dVar.f3444b)]);
                    continue;
                    i12++;
                    i11 = i10;
                case 23:
                    i10 = i11;
                    c0013a.b(23, typedArray.getLayoutDimension(index, bVar.c));
                    continue;
                    i12++;
                    i11 = i10;
                case 24:
                    i10 = i11;
                    c0013a.b(24, typedArray.getDimensionPixelSize(index, bVar.G));
                    continue;
                    i12++;
                    i11 = i10;
                case 27:
                    i10 = i11;
                    c0013a.b(27, typedArray.getInt(index, bVar.F));
                    continue;
                    i12++;
                    i11 = i10;
                case 28:
                    i10 = i11;
                    c0013a.b(28, typedArray.getDimensionPixelSize(index, bVar.H));
                    continue;
                    i12++;
                    i11 = i10;
                case 31:
                    i10 = i11;
                    c0013a.b(31, typedArray.getDimensionPixelSize(index, bVar.L));
                    continue;
                    i12++;
                    i11 = i10;
                case 34:
                    i10 = i11;
                    c0013a.b(34, typedArray.getDimensionPixelSize(index, bVar.I));
                    continue;
                    i12++;
                    i11 = i10;
                case 37:
                    i10 = i11;
                    c0013a.a(typedArray.getFloat(index, bVar.f3428y), 37);
                    continue;
                    i12++;
                    i11 = i10;
                case 38:
                    i10 = i11;
                    int resourceId = typedArray.getResourceId(index, c0012a.f3370a);
                    c0012a.f3370a = resourceId;
                    c0013a.b(38, resourceId);
                    continue;
                    i12++;
                    i11 = i10;
                case 39:
                    i10 = i11;
                    c0013a.a(typedArray.getFloat(index, bVar.V), 39);
                    continue;
                    i12++;
                    i11 = i10;
                case 40:
                    i10 = i11;
                    c0013a.a(typedArray.getFloat(index, bVar.U), 40);
                    continue;
                    i12++;
                    i11 = i10;
                case 41:
                    i10 = i11;
                    c0013a.b(41, typedArray.getInt(index, bVar.W));
                    continue;
                    i12++;
                    i11 = i10;
                case 42:
                    i10 = i11;
                    c0013a.b(42, typedArray.getInt(index, bVar.X));
                    continue;
                    i12++;
                    i11 = i10;
                case 43:
                    i10 = i11;
                    c0013a.a(typedArray.getFloat(index, dVar.f3445d), 43);
                    continue;
                    i12++;
                    i11 = i10;
                case 44:
                    i10 = i11;
                    c0013a.d(44, true);
                    c0013a.a(typedArray.getDimension(index, eVar.f3460n), 44);
                    continue;
                    i12++;
                    i11 = i10;
                case 45:
                    i10 = i11;
                    c0013a.a(typedArray.getFloat(index, eVar.c), 45);
                    continue;
                    i12++;
                    i11 = i10;
                case 46:
                    i10 = i11;
                    c0013a.a(typedArray.getFloat(index, eVar.f3450d), 46);
                    continue;
                    i12++;
                    i11 = i10;
                case 47:
                    i10 = i11;
                    c0013a.a(typedArray.getFloat(index, eVar.f3451e), 47);
                    continue;
                    i12++;
                    i11 = i10;
                case 48:
                    i10 = i11;
                    c0013a.a(typedArray.getFloat(index, eVar.f3452f), 48);
                    continue;
                    i12++;
                    i11 = i10;
                case 49:
                    i10 = i11;
                    c0013a.a(typedArray.getDimension(index, eVar.f3453g), 49);
                    continue;
                    i12++;
                    i11 = i10;
                case 50:
                    i10 = i11;
                    c0013a.a(typedArray.getDimension(index, eVar.f3454h), 50);
                    continue;
                    i12++;
                    i11 = i10;
                case 51:
                    i10 = i11;
                    c0013a.a(typedArray.getDimension(index, eVar.f3456j), 51);
                    continue;
                    i12++;
                    i11 = i10;
                case 52:
                    i10 = i11;
                    c0013a.a(typedArray.getDimension(index, eVar.f3457k), 52);
                    continue;
                    i12++;
                    i11 = i10;
                case 53:
                    i10 = i11;
                    c0013a.a(typedArray.getDimension(index, eVar.f3458l), 53);
                    continue;
                    i12++;
                    i11 = i10;
                case 54:
                    i10 = i11;
                    c0013a.b(54, typedArray.getInt(index, bVar.Y));
                    continue;
                    i12++;
                    i11 = i10;
                case 55:
                    i10 = i11;
                    c0013a.b(55, typedArray.getInt(index, bVar.Z));
                    continue;
                    i12++;
                    i11 = i10;
                case 56:
                    i10 = i11;
                    c0013a.b(56, typedArray.getDimensionPixelSize(index, bVar.f3390a0));
                    continue;
                    i12++;
                    i11 = i10;
                case 57:
                    i10 = i11;
                    c0013a.b(57, typedArray.getDimensionPixelSize(index, bVar.f3392b0));
                    continue;
                    i12++;
                    i11 = i10;
                case 58:
                    i10 = i11;
                    c0013a.b(58, typedArray.getDimensionPixelSize(index, bVar.f3393c0));
                    continue;
                    i12++;
                    i11 = i10;
                case 59:
                    i10 = i11;
                    c0013a.b(59, typedArray.getDimensionPixelSize(index, bVar.f3395d0));
                    continue;
                    i12++;
                    i11 = i10;
                case 60:
                    i10 = i11;
                    c0013a.a(typedArray.getFloat(index, eVar.f3449b), 60);
                    continue;
                    i12++;
                    i11 = i10;
                case 62:
                    i10 = i11;
                    c0013a.b(62, typedArray.getDimensionPixelSize(index, bVar.B));
                    continue;
                    i12++;
                    i11 = i10;
                case 63:
                    i10 = i11;
                    c0013a.a(typedArray.getFloat(index, bVar.C), 63);
                    continue;
                    i12++;
                    i11 = i10;
                case 64:
                    i10 = i11;
                    c0013a.b(64, o(typedArray, index, cVar.f3432b));
                    continue;
                    i12++;
                    i11 = i10;
                case 65:
                    i10 = i11;
                    if (typedArray.peekValue(index).type == 3) {
                        c0013a.c(65, typedArray.getString(index));
                        continue;
                    } else {
                        c0013a.c(65, b0.c.c[typedArray.getInteger(index, i10)]);
                    }
                    i12++;
                    i11 = i10;
                case 66:
                    i10 = 0;
                    c0013a.b(66, typedArray.getInt(index, 0));
                    continue;
                    i12++;
                    i11 = i10;
                case 67:
                    c0013a.a(typedArray.getFloat(index, cVar.f3437h), 67);
                    break;
                case 68:
                    c0013a.a(typedArray.getFloat(index, dVar.f3446e), 68);
                    break;
                case 69:
                    c0013a.a(typedArray.getFloat(index, 1.0f), 69);
                    break;
                case 70:
                    c0013a.a(typedArray.getFloat(index, 1.0f), 70);
                    break;
                case 71:
                    break;
                case 72:
                    c0013a.b(72, typedArray.getInt(index, bVar.f3401g0));
                    break;
                case 73:
                    c0013a.b(73, typedArray.getDimensionPixelSize(index, bVar.f3403h0));
                    break;
                case 74:
                    c0013a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0013a.d(75, typedArray.getBoolean(index, bVar.f3417o0));
                    break;
                case 76:
                    c0013a.b(76, typedArray.getInt(index, cVar.f3434e));
                    break;
                case 77:
                    c0013a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0013a.b(78, typedArray.getInt(index, dVar.c));
                    break;
                case 79:
                    c0013a.a(typedArray.getFloat(index, cVar.f3436g), 79);
                    break;
                case 80:
                    c0013a.d(80, typedArray.getBoolean(index, bVar.f3413m0));
                    break;
                case 81:
                    c0013a.d(81, typedArray.getBoolean(index, bVar.f3415n0));
                    break;
                case 82:
                    c0013a.b(82, typedArray.getInteger(index, cVar.c));
                    break;
                case 83:
                    c0013a.b(83, o(typedArray, index, eVar.f3455i));
                    break;
                case 84:
                    c0013a.b(84, typedArray.getInteger(index, cVar.f3439j));
                    break;
                case 85:
                    c0013a.a(typedArray.getFloat(index, cVar.f3438i), 85);
                    break;
                case 86:
                    int i14 = typedArray.peekValue(index).type;
                    if (i14 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        cVar.f3442m = resourceId2;
                        c0013a.b(89, resourceId2);
                        if (cVar.f3442m != -1) {
                            cVar.f3441l = -2;
                            c0013a.b(88, -2);
                            break;
                        }
                    } else if (i14 == 3) {
                        String string = typedArray.getString(index);
                        cVar.f3440k = string;
                        c0013a.c(90, string);
                        if (cVar.f3440k.indexOf(PackagingURIHelper.FORWARD_SLASH_STRING) > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            cVar.f3442m = resourceId3;
                            c0013a.b(89, resourceId3);
                            cVar.f3441l = -2;
                            c0013a.b(88, -2);
                            break;
                        } else {
                            cVar.f3441l = -1;
                            c0013a.b(88, -1);
                            break;
                        }
                    } else {
                        int integer = typedArray.getInteger(index, cVar.f3442m);
                        cVar.f3441l = integer;
                        c0013a.b(88, integer);
                        break;
                    }
                    break;
                case 87:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
                case 93:
                    c0013a.b(93, typedArray.getDimensionPixelSize(index, bVar.M));
                    break;
                case 94:
                    c0013a.b(94, typedArray.getDimensionPixelSize(index, bVar.T));
                    break;
                case 95:
                    p(c0013a, typedArray, index, i11);
                    break;
                case 96:
                    p(c0013a, typedArray, index, 1);
                    break;
                case 97:
                    c0013a.b(97, typedArray.getInt(index, bVar.f3419p0));
                    break;
                case 98:
                    if (MotionLayout.F0) {
                        int resourceId4 = typedArray.getResourceId(index, c0012a.f3370a);
                        c0012a.f3370a = resourceId4;
                        if (resourceId4 == -1) {
                            c0012a.f3371b = typedArray.getString(index);
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c0012a.f3371b = typedArray.getString(index);
                        break;
                    } else {
                        c0012a.f3370a = typedArray.getResourceId(index, c0012a.f3370a);
                        break;
                    }
                    break;
                case 99:
                    c0013a.d(99, typedArray.getBoolean(index, bVar.f3402h));
                    break;
            }
            i10 = 0;
            i12++;
            i11 = i10;
        }
    }

    public static String t(int i10) {
        switch (i10) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public final void a(ConstraintLayout constraintLayout) {
        C0012a c0012a;
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            HashMap<Integer, C0012a> hashMap = this.f3369f;
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                f0.a.d(childAt);
            } else if (this.f3368e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (hashMap.containsKey(Integer.valueOf(id2)) && (c0012a = hashMap.get(Integer.valueOf(id2))) != null) {
                    ConstraintAttribute.e(childAt, c0012a.f3375g);
                }
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        View findViewById;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, C0012a> hashMap = this.f3369f;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                f0.a.d(childAt);
            } else if (this.f3368e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id2 != -1 && hashMap.containsKey(Integer.valueOf(id2))) {
                    hashSet.remove(Integer.valueOf(id2));
                    C0012a c0012a = hashMap.get(Integer.valueOf(id2));
                    if (c0012a != null) {
                        if (childAt instanceof Barrier) {
                            b bVar = c0012a.f3373e;
                            bVar.f3405i0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id2);
                            barrier.setType(bVar.f3401g0);
                            barrier.setMargin(bVar.f3403h0);
                            barrier.setAllowsGoneWidget(bVar.f3417o0);
                            int[] iArr = bVar.f3407j0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f3409k0;
                                if (str != null) {
                                    int[] i11 = i(barrier, str);
                                    bVar.f3407j0 = i11;
                                    barrier.setReferencedIds(i11);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        c0012a.a(bVar2);
                        ConstraintAttribute.e(childAt, c0012a.f3375g);
                        childAt.setLayoutParams(bVar2);
                        d dVar = c0012a.c;
                        if (dVar.c == 0) {
                            childAt.setVisibility(dVar.f3444b);
                        }
                        childAt.setAlpha(dVar.f3445d);
                        e eVar = c0012a.f3374f;
                        childAt.setRotation(eVar.f3449b);
                        childAt.setRotationX(eVar.c);
                        childAt.setRotationY(eVar.f3450d);
                        childAt.setScaleX(eVar.f3451e);
                        childAt.setScaleY(eVar.f3452f);
                        if (eVar.f3455i != -1) {
                            if (((View) childAt.getParent()).findViewById(eVar.f3455i) != null) {
                                float bottom = (findViewById.getBottom() + findViewById.getTop()) / 2.0f;
                                float right = (findViewById.getRight() + findViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f3453g)) {
                                childAt.setPivotX(eVar.f3453g);
                            }
                            if (!Float.isNaN(eVar.f3454h)) {
                                childAt.setPivotY(eVar.f3454h);
                            }
                        }
                        childAt.setTranslationX(eVar.f3456j);
                        childAt.setTranslationY(eVar.f3457k);
                        childAt.setTranslationZ(eVar.f3458l);
                        if (eVar.f3459m) {
                            childAt.setElevation(eVar.f3460n);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0012a c0012a2 = hashMap.get(num);
            if (c0012a2 != null) {
                b bVar3 = c0012a2.f3373e;
                if (bVar3.f3405i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = bVar3.f3407j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f3409k0;
                        if (str2 != null) {
                            int[] i12 = i(barrier2, str2);
                            bVar3.f3407j0 = i12;
                            barrier2.setReferencedIds(i12);
                        }
                    }
                    barrier2.setType(bVar3.f3401g0);
                    barrier2.setMargin(bVar3.f3403h0);
                    androidx.constraintlayout.widget.b bVar4 = ConstraintLayout.f3278p;
                    ConstraintLayout.b bVar5 = new ConstraintLayout.b();
                    barrier2.t();
                    c0012a2.a(bVar5);
                    constraintLayout.addView(barrier2, bVar5);
                }
                if (bVar3.f3389a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    androidx.constraintlayout.widget.b bVar6 = ConstraintLayout.f3278p;
                    ConstraintLayout.b bVar7 = new ConstraintLayout.b();
                    c0012a2.a(bVar7);
                    constraintLayout.addView(guideline, bVar7);
                }
            }
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = constraintLayout.getChildAt(i13);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).j(constraintLayout);
            }
        }
    }

    public final void e(int i10, int i11) {
        C0012a c0012a;
        HashMap<Integer, C0012a> hashMap = this.f3369f;
        if (!hashMap.containsKey(Integer.valueOf(i10)) || (c0012a = hashMap.get(Integer.valueOf(i10))) == null) {
            return;
        }
        b bVar = c0012a.f3373e;
        switch (i11) {
            case 1:
                bVar.f3406j = -1;
                bVar.f3404i = -1;
                bVar.G = -1;
                bVar.N = SlideAtom.USES_MASTER_SLIDE_ID;
                return;
            case 2:
                bVar.f3410l = -1;
                bVar.f3408k = -1;
                bVar.H = -1;
                bVar.P = SlideAtom.USES_MASTER_SLIDE_ID;
                return;
            case 3:
                bVar.f3414n = -1;
                bVar.f3412m = -1;
                bVar.I = 0;
                bVar.O = SlideAtom.USES_MASTER_SLIDE_ID;
                return;
            case 4:
                bVar.f3416o = -1;
                bVar.f3418p = -1;
                bVar.J = 0;
                bVar.Q = SlideAtom.USES_MASTER_SLIDE_ID;
                return;
            case 5:
                bVar.f3420q = -1;
                bVar.f3421r = -1;
                bVar.f3422s = -1;
                bVar.M = 0;
                bVar.T = SlideAtom.USES_MASTER_SLIDE_ID;
                return;
            case 6:
                bVar.f3423t = -1;
                bVar.f3424u = -1;
                bVar.L = 0;
                bVar.S = SlideAtom.USES_MASTER_SLIDE_ID;
                return;
            case 7:
                bVar.f3425v = -1;
                bVar.f3426w = -1;
                bVar.K = 0;
                bVar.R = SlideAtom.USES_MASTER_SLIDE_ID;
                return;
            case 8:
                bVar.C = -1.0f;
                bVar.B = -1;
                bVar.A = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public final void f(ConstraintLayout constraintLayout) {
        int i10;
        int i11;
        a aVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, C0012a> hashMap = aVar.f3369f;
        hashMap.clear();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = constraintLayout.getChildAt(i12);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (aVar.f3368e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                hashMap.put(Integer.valueOf(id2), new C0012a());
            }
            C0012a c0012a = hashMap.get(Integer.valueOf(id2));
            if (c0012a == null) {
                i10 = childCount;
            } else {
                HashMap<String, ConstraintAttribute> hashMap2 = aVar.f3367d;
                HashMap<String, ConstraintAttribute> hashMap3 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    ConstraintAttribute constraintAttribute = hashMap2.get(str);
                    try {
                    } catch (IllegalAccessException e10) {
                        e = e10;
                        i11 = childCount;
                    } catch (NoSuchMethodException e11) {
                        e = e11;
                        i11 = childCount;
                    } catch (InvocationTargetException e12) {
                        e = e12;
                        i11 = childCount;
                    }
                    if (str.equals("BackgroundColor")) {
                        hashMap3.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        i11 = childCount;
                        try {
                            hashMap3.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                        } catch (IllegalAccessException e13) {
                            e = e13;
                            e.printStackTrace();
                            childCount = i11;
                        } catch (NoSuchMethodException e14) {
                            e = e14;
                            e.printStackTrace();
                            childCount = i11;
                        } catch (InvocationTargetException e15) {
                            e = e15;
                            e.printStackTrace();
                            childCount = i11;
                        }
                        childCount = i11;
                    }
                }
                i10 = childCount;
                c0012a.f3375g = hashMap3;
                c0012a.c(id2, bVar);
                int visibility = childAt.getVisibility();
                d dVar = c0012a.c;
                dVar.f3444b = visibility;
                dVar.f3445d = childAt.getAlpha();
                float rotation = childAt.getRotation();
                e eVar = c0012a.f3374f;
                eVar.f3449b = rotation;
                eVar.c = childAt.getRotationX();
                eVar.f3450d = childAt.getRotationY();
                eVar.f3451e = childAt.getScaleX();
                eVar.f3452f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    eVar.f3453g = pivotX;
                    eVar.f3454h = pivotY;
                }
                eVar.f3456j = childAt.getTranslationX();
                eVar.f3457k = childAt.getTranslationY();
                eVar.f3458l = childAt.getTranslationZ();
                if (eVar.f3459m) {
                    eVar.f3460n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
                    b bVar2 = c0012a.f3373e;
                    bVar2.f3417o0 = allowsGoneWidget;
                    bVar2.f3407j0 = barrier.getReferencedIds();
                    bVar2.f3401g0 = barrier.getType();
                    bVar2.f3403h0 = barrier.getMargin();
                }
            }
            i12++;
            aVar = this;
            childCount = i10;
        }
    }

    public final void g(int i10, int i11, int i12) {
        HashMap<Integer, C0012a> hashMap = this.f3369f;
        Integer valueOf = Integer.valueOf((int) R.id.viewMarkEditType);
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(valueOf, new C0012a());
        }
        C0012a c0012a = hashMap.get(valueOf);
        if (c0012a == null) {
            return;
        }
        b bVar = c0012a.f3373e;
        switch (i10) {
            case 1:
                if (i12 == 1) {
                    bVar.f3404i = i11;
                    bVar.f3406j = -1;
                } else if (i12 == 2) {
                    bVar.f3406j = i11;
                    bVar.f3404i = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + t(i12) + " undefined");
                }
                bVar.G = 0;
                return;
            case 2:
                if (i12 == 1) {
                    bVar.f3408k = i11;
                    bVar.f3410l = -1;
                } else if (i12 == 2) {
                    bVar.f3410l = i11;
                    bVar.f3408k = -1;
                } else {
                    throw new IllegalArgumentException("right to " + t(i12) + " undefined");
                }
                bVar.H = 0;
                return;
            case 3:
                if (i12 == 3) {
                    bVar.f3412m = i11;
                    bVar.f3414n = -1;
                    bVar.f3420q = -1;
                    bVar.f3421r = -1;
                    bVar.f3422s = -1;
                } else if (i12 == 4) {
                    bVar.f3414n = i11;
                    bVar.f3412m = -1;
                    bVar.f3420q = -1;
                    bVar.f3421r = -1;
                    bVar.f3422s = -1;
                } else {
                    throw new IllegalArgumentException("right to " + t(i12) + " undefined");
                }
                bVar.I = 0;
                return;
            case 4:
                if (i12 == 4) {
                    bVar.f3418p = i11;
                    bVar.f3416o = -1;
                    bVar.f3420q = -1;
                    bVar.f3421r = -1;
                    bVar.f3422s = -1;
                } else if (i12 == 3) {
                    bVar.f3416o = i11;
                    bVar.f3418p = -1;
                    bVar.f3420q = -1;
                    bVar.f3421r = -1;
                    bVar.f3422s = -1;
                } else {
                    throw new IllegalArgumentException("right to " + t(i12) + " undefined");
                }
                bVar.J = 0;
                return;
            case 5:
                if (i12 == 5) {
                    bVar.f3420q = i11;
                    bVar.f3418p = -1;
                    bVar.f3416o = -1;
                    bVar.f3412m = -1;
                    bVar.f3414n = -1;
                    return;
                } else if (i12 == 3) {
                    bVar.f3421r = i11;
                    bVar.f3418p = -1;
                    bVar.f3416o = -1;
                    bVar.f3412m = -1;
                    bVar.f3414n = -1;
                    return;
                } else if (i12 == 4) {
                    bVar.f3422s = i11;
                    bVar.f3418p = -1;
                    bVar.f3416o = -1;
                    bVar.f3412m = -1;
                    bVar.f3414n = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + t(i12) + " undefined");
                }
            case 6:
                if (i12 == 6) {
                    bVar.f3424u = i11;
                    bVar.f3423t = -1;
                } else if (i12 == 7) {
                    bVar.f3423t = i11;
                    bVar.f3424u = -1;
                } else {
                    throw new IllegalArgumentException("right to " + t(i12) + " undefined");
                }
                bVar.L = 0;
                return;
            case 7:
                if (i12 == 7) {
                    bVar.f3426w = i11;
                    bVar.f3425v = -1;
                } else if (i12 == 6) {
                    bVar.f3425v = i11;
                    bVar.f3426w = -1;
                } else {
                    throw new IllegalArgumentException("right to " + t(i12) + " undefined");
                }
                bVar.K = 0;
                return;
            default:
                throw new IllegalArgumentException(t(i10) + " to " + t(i12) + " unknown");
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        HashMap<Integer, C0012a> hashMap = this.f3369f;
        if (!hashMap.containsKey(Integer.valueOf(i10))) {
            hashMap.put(Integer.valueOf(i10), new C0012a());
        }
        C0012a c0012a = hashMap.get(Integer.valueOf(i10));
        if (c0012a == null) {
            return;
        }
        b bVar = c0012a.f3373e;
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    bVar.f3404i = i12;
                    bVar.f3406j = -1;
                    return;
                } else if (i13 == 2) {
                    bVar.f3406j = i12;
                    bVar.f3404i = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + t(i13) + " undefined");
                }
            case 2:
                if (i13 == 1) {
                    bVar.f3408k = i12;
                    bVar.f3410l = -1;
                    return;
                } else if (i13 == 2) {
                    bVar.f3410l = i12;
                    bVar.f3408k = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + t(i13) + " undefined");
                }
            case 3:
                if (i13 == 3) {
                    bVar.f3412m = i12;
                    bVar.f3414n = -1;
                    bVar.f3420q = -1;
                    bVar.f3421r = -1;
                    bVar.f3422s = -1;
                    return;
                } else if (i13 == 4) {
                    bVar.f3414n = i12;
                    bVar.f3412m = -1;
                    bVar.f3420q = -1;
                    bVar.f3421r = -1;
                    bVar.f3422s = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + t(i13) + " undefined");
                }
            case 4:
                if (i13 == 4) {
                    bVar.f3418p = i12;
                    bVar.f3416o = -1;
                    bVar.f3420q = -1;
                    bVar.f3421r = -1;
                    bVar.f3422s = -1;
                    return;
                } else if (i13 == 3) {
                    bVar.f3416o = i12;
                    bVar.f3418p = -1;
                    bVar.f3420q = -1;
                    bVar.f3421r = -1;
                    bVar.f3422s = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + t(i13) + " undefined");
                }
            case 5:
                if (i13 == 5) {
                    bVar.f3420q = i12;
                    bVar.f3418p = -1;
                    bVar.f3416o = -1;
                    bVar.f3412m = -1;
                    bVar.f3414n = -1;
                    return;
                } else if (i13 == 3) {
                    bVar.f3421r = i12;
                    bVar.f3418p = -1;
                    bVar.f3416o = -1;
                    bVar.f3412m = -1;
                    bVar.f3414n = -1;
                    return;
                } else if (i13 == 4) {
                    bVar.f3422s = i12;
                    bVar.f3418p = -1;
                    bVar.f3416o = -1;
                    bVar.f3412m = -1;
                    bVar.f3414n = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + t(i13) + " undefined");
                }
            case 6:
                if (i13 == 6) {
                    bVar.f3424u = i12;
                    bVar.f3423t = -1;
                    return;
                } else if (i13 == 7) {
                    bVar.f3423t = i12;
                    bVar.f3424u = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + t(i13) + " undefined");
                }
            case 7:
                if (i13 == 7) {
                    bVar.f3426w = i12;
                    bVar.f3425v = -1;
                    return;
                } else if (i13 == 6) {
                    bVar.f3425v = i12;
                    bVar.f3426w = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + t(i13) + " undefined");
                }
            default:
                throw new IllegalArgumentException(t(i11) + " to " + t(i13) + " unknown");
        }
    }

    public final C0012a k(int i10) {
        HashMap<Integer, C0012a> hashMap = this.f3369f;
        if (!hashMap.containsKey(Integer.valueOf(i10))) {
            hashMap.put(Integer.valueOf(i10), new C0012a());
        }
        return hashMap.get(Integer.valueOf(i10));
    }

    public final C0012a l(int i10) {
        HashMap<Integer, C0012a> hashMap = this.f3369f;
        if (hashMap.containsKey(Integer.valueOf(i10))) {
            return hashMap.get(Integer.valueOf(i10));
        }
        return null;
    }

    public final void m(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType != 2) {
                        continue;
                    } else {
                        String name = xml.getName();
                        C0012a j10 = j(context, Xml.asAttributeSet(xml), false);
                        if (name.equalsIgnoreCase("Guideline")) {
                            j10.f3373e.f3389a = true;
                        }
                        this.f3369f.put(Integer.valueOf(j10.f3370a), j10);
                        continue;
                    }
                } else {
                    xml.getName();
                    continue;
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cb, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(android.content.Context r10, android.content.res.XmlResourceParser r11) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.n(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public final void s(int i10, int i11) {
        C0012a k10 = k(R.id.slideContainer);
        switch (i10) {
            case 1:
                k10.f3373e.G = i11;
                return;
            case 2:
                k10.f3373e.H = i11;
                return;
            case 3:
                k10.f3373e.I = i11;
                return;
            case 4:
                k10.f3373e.J = i11;
                return;
            case 5:
                k10.f3373e.M = i11;
                return;
            case 6:
                k10.f3373e.L = i11;
                return;
            case 7:
                k10.f3373e.K = i11;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }
}
