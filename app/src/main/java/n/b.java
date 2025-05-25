package n;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import n.e;
import p0.a;

/* compiled from: DrawableContainerCompat.java */
/* loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f22219m = 0;

    /* renamed from: a  reason: collision with root package name */
    public c f22220a;

    /* renamed from: b  reason: collision with root package name */
    public Rect f22221b;
    public Drawable c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f22222d;

    /* renamed from: f  reason: collision with root package name */
    public boolean f22224f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f22226h;

    /* renamed from: i  reason: collision with root package name */
    public a f22227i;

    /* renamed from: j  reason: collision with root package name */
    public long f22228j;

    /* renamed from: k  reason: collision with root package name */
    public long f22229k;

    /* renamed from: l  reason: collision with root package name */
    public C0295b f22230l;

    /* renamed from: e  reason: collision with root package name */
    public int f22223e = FunctionEval.FunctionID.EXTERNAL_FUNC;

    /* renamed from: g  reason: collision with root package name */
    public int f22225g = -1;

    /* compiled from: DrawableContainerCompat.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f22231a;

        public a(e eVar) {
            this.f22231a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = this.f22231a;
            bVar.a(true);
            bVar.invalidateSelf();
        }
    }

    /* compiled from: DrawableContainerCompat.java */
    /* loaded from: classes.dex */
    public static abstract class c extends Drawable.ConstantState {
        public boolean A;
        public ColorFilter B;
        public boolean C;
        public ColorStateList D;
        public PorterDuff.Mode E;
        public boolean F;
        public boolean G;

        /* renamed from: a  reason: collision with root package name */
        public final b f22233a;

        /* renamed from: b  reason: collision with root package name */
        public Resources f22234b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f22235d;

        /* renamed from: e  reason: collision with root package name */
        public int f22236e;

        /* renamed from: f  reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f22237f;

        /* renamed from: g  reason: collision with root package name */
        public Drawable[] f22238g;

        /* renamed from: h  reason: collision with root package name */
        public int f22239h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f22240i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f22241j;

        /* renamed from: k  reason: collision with root package name */
        public Rect f22242k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f22243l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f22244m;

        /* renamed from: n  reason: collision with root package name */
        public int f22245n;

        /* renamed from: o  reason: collision with root package name */
        public int f22246o;

        /* renamed from: p  reason: collision with root package name */
        public int f22247p;

        /* renamed from: q  reason: collision with root package name */
        public int f22248q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f22249r;

        /* renamed from: s  reason: collision with root package name */
        public int f22250s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f22251t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f22252u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f22253v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f22254w;

        /* renamed from: x  reason: collision with root package name */
        public int f22255x;

        /* renamed from: y  reason: collision with root package name */
        public int f22256y;

        /* renamed from: z  reason: collision with root package name */
        public int f22257z;

        public c(c cVar, b bVar, Resources resources) {
            Resources resources2;
            int i10;
            this.f22240i = false;
            this.f22243l = false;
            this.f22254w = true;
            this.f22256y = 0;
            this.f22257z = 0;
            this.f22233a = bVar;
            if (resources != null) {
                resources2 = resources;
            } else if (cVar != null) {
                resources2 = cVar.f22234b;
            } else {
                resources2 = null;
            }
            this.f22234b = resources2;
            if (cVar != null) {
                i10 = cVar.c;
            } else {
                i10 = 0;
            }
            int i11 = b.f22219m;
            i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
            i10 = i10 == 0 ? 160 : i10;
            this.c = i10;
            if (cVar != null) {
                this.f22235d = cVar.f22235d;
                this.f22236e = cVar.f22236e;
                this.f22252u = true;
                this.f22253v = true;
                this.f22240i = cVar.f22240i;
                this.f22243l = cVar.f22243l;
                this.f22254w = cVar.f22254w;
                this.f22255x = cVar.f22255x;
                this.f22256y = cVar.f22256y;
                this.f22257z = cVar.f22257z;
                this.A = cVar.A;
                this.B = cVar.B;
                this.C = cVar.C;
                this.D = cVar.D;
                this.E = cVar.E;
                this.F = cVar.F;
                this.G = cVar.G;
                if (cVar.c == i10) {
                    if (cVar.f22241j) {
                        this.f22242k = cVar.f22242k != null ? new Rect(cVar.f22242k) : null;
                        this.f22241j = true;
                    }
                    if (cVar.f22244m) {
                        this.f22245n = cVar.f22245n;
                        this.f22246o = cVar.f22246o;
                        this.f22247p = cVar.f22247p;
                        this.f22248q = cVar.f22248q;
                        this.f22244m = true;
                    }
                }
                if (cVar.f22249r) {
                    this.f22250s = cVar.f22250s;
                    this.f22249r = true;
                }
                if (cVar.f22251t) {
                    this.f22251t = true;
                }
                Drawable[] drawableArr = cVar.f22238g;
                this.f22238g = new Drawable[drawableArr.length];
                this.f22239h = cVar.f22239h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f22237f;
                if (sparseArray != null) {
                    this.f22237f = sparseArray.clone();
                } else {
                    this.f22237f = new SparseArray<>(this.f22239h);
                }
                int i12 = this.f22239h;
                for (int i13 = 0; i13 < i12; i13++) {
                    Drawable drawable = drawableArr[i13];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f22237f.put(i13, constantState);
                        } else {
                            this.f22238g[i13] = drawableArr[i13];
                        }
                    }
                }
                return;
            }
            this.f22238g = new Drawable[10];
            this.f22239h = 0;
        }

        public final int a(Drawable drawable) {
            int i10 = this.f22239h;
            if (i10 >= this.f22238g.length) {
                int i11 = i10 + 10;
                e.a aVar = (e.a) this;
                Drawable[] drawableArr = new Drawable[i11];
                Drawable[] drawableArr2 = aVar.f22238g;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
                }
                aVar.f22238g = drawableArr;
                int[][] iArr = new int[i11];
                System.arraycopy(aVar.H, 0, iArr, 0, i10);
                aVar.H = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f22233a);
            this.f22238g[i10] = drawable;
            this.f22239h++;
            this.f22236e = drawable.getChangingConfigurations() | this.f22236e;
            this.f22249r = false;
            this.f22251t = false;
            this.f22242k = null;
            this.f22241j = false;
            this.f22244m = false;
            this.f22252u = false;
            return i10;
        }

        public final void b() {
            this.f22244m = true;
            c();
            int i10 = this.f22239h;
            Drawable[] drawableArr = this.f22238g;
            this.f22246o = -1;
            this.f22245n = -1;
            this.f22248q = 0;
            this.f22247p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f22245n) {
                    this.f22245n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f22246o) {
                    this.f22246o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f22247p) {
                    this.f22247p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f22248q) {
                    this.f22248q = minimumHeight;
                }
            }
        }

        public final void c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f22237f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    int keyAt = this.f22237f.keyAt(i10);
                    Drawable[] drawableArr = this.f22238g;
                    Drawable newDrawable = this.f22237f.valueAt(i10).newDrawable(this.f22234b);
                    a.c.b(newDrawable, this.f22255x);
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f22233a);
                    drawableArr[keyAt] = mutate;
                }
                this.f22237f = null;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            int i10 = this.f22239h;
            Drawable[] drawableArr = this.f22238g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    if (a.b.b(drawable)) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = this.f22237f.get(i11);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final Drawable d(int i10) {
            int indexOfKey;
            Drawable drawable = this.f22238g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f22237f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f22237f.valueAt(indexOfKey).newDrawable(this.f22234b);
            a.c.b(newDrawable, this.f22255x);
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.f22233a);
            this.f22238g[i10] = mutate;
            this.f22237f.removeAt(indexOfKey);
            if (this.f22237f.size() == 0) {
                this.f22237f = null;
            }
            return mutate;
        }

        public abstract void e();

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f22235d | this.f22236e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f22224f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f22228j
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f22223e
            r3.setAlpha(r9)
            r13.f22228j = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            n.b$c r10 = r13.f22220a
            int r10 = r10.f22256y
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f22223e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f22228j = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f22222d
            if (r9 == 0) goto L61
            long r10 = r13.f22229k
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f22222d = r0
            r13.f22229k = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            n.b$c r4 = r13.f22220a
            int r4 = r4.f22257z
            int r3 = r3 / r4
            int r4 = r13.f22223e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f22229k = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            n.b$a r14 = r13.f22227i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        c cVar = this.f22220a;
        if (theme != null) {
            cVar.c();
            int i10 = cVar.f22239h;
            Drawable[] drawableArr = cVar.f22238g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null && a.b.b(drawable)) {
                    a.b.a(drawableArr[i11], theme);
                    cVar.f22236e |= drawableArr[i11].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                cVar.f22234b = resources;
                int i12 = resources.getDisplayMetrics().densityDpi;
                if (i12 == 0) {
                    i12 = 160;
                }
                int i13 = cVar.c;
                cVar.c = i12;
                if (i13 != i12) {
                    cVar.f22244m = false;
                    cVar.f22241j = false;
                    return;
                }
                return;
            }
            return;
        }
        cVar.getClass();
    }

    public c b() {
        throw null;
    }

    public final void c(Drawable drawable) {
        if (this.f22230l == null) {
            this.f22230l = new C0295b();
        }
        C0295b c0295b = this.f22230l;
        c0295b.f22232a = drawable.getCallback();
        drawable.setCallback(c0295b);
        try {
            if (this.f22220a.f22256y <= 0 && this.f22224f) {
                drawable.setAlpha(this.f22223e);
            }
            c cVar = this.f22220a;
            if (cVar.C) {
                drawable.setColorFilter(cVar.B);
            } else {
                if (cVar.F) {
                    a.b.h(drawable, cVar.D);
                }
                c cVar2 = this.f22220a;
                if (cVar2.G) {
                    a.b.i(drawable, cVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f22220a.f22254w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            a.c.b(drawable, a.c.a(this));
            a.C0322a.e(drawable, this.f22220a.A);
            Rect rect = this.f22221b;
            if (rect != null) {
                a.b.f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C0295b c0295b2 = this.f22230l;
            Drawable.Callback callback = c0295b2.f22232a;
            c0295b2.f22232a = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f22220a.canApplyTheme();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(int r10) {
        /*
            r9 = this;
            int r0 = r9.f22225g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            n.b$c r0 = r9.f22220a
            int r0 = r0.f22257z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f22222d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.c
            if (r0 == 0) goto L29
            r9.f22222d = r0
            n.b$c r0 = r9.f22220a
            int r0 = r0.f22257z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f22229k = r0
            goto L35
        L29:
            r9.f22222d = r4
            r9.f22229k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            n.b$c r0 = r9.f22220a
            int r1 = r0.f22239h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.c = r0
            r9.f22225g = r10
            if (r0 == 0) goto L5a
            n.b$c r10 = r9.f22220a
            int r10 = r10.f22256y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f22228j = r2
        L51:
            r9.c(r0)
            goto L5a
        L55:
            r9.c = r4
            r10 = -1
            r9.f22225g = r10
        L5a:
            long r0 = r9.f22228j
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f22229k
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L7c
        L67:
            n.b$a r10 = r9.f22227i
            if (r10 != 0) goto L76
            n.b$a r10 = new n.b$a
            r1 = r9
            n.e r1 = (n.e) r1
            r10.<init>(r1)
            r9.f22227i = r10
            goto L79
        L76:
            r9.unscheduleSelf(r10)
        L79:
            r9.a(r0)
        L7c:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.b.d(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f22222d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(c cVar) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f22223e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        c cVar = this.f22220a;
        return changingConfigurations | cVar.f22236e | cVar.f22235d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z10;
        c cVar = this.f22220a;
        if (cVar.f22252u) {
            z10 = cVar.f22253v;
        } else {
            cVar.c();
            cVar.f22252u = true;
            int i10 = cVar.f22239h;
            Drawable[] drawableArr = cVar.f22238g;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (drawableArr[i11].getConstantState() == null) {
                        cVar.f22253v = false;
                        z10 = false;
                        break;
                    }
                    i11++;
                } else {
                    cVar.f22253v = true;
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            this.f22220a.f22235d = getChangingConfigurations();
            return this.f22220a;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f22221b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        c cVar = this.f22220a;
        if (cVar.f22243l) {
            if (!cVar.f22244m) {
                cVar.b();
            }
            return cVar.f22246o;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        c cVar = this.f22220a;
        if (cVar.f22243l) {
            if (!cVar.f22244m) {
                cVar.b();
            }
            return cVar.f22245n;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        c cVar = this.f22220a;
        if (cVar.f22243l) {
            if (!cVar.f22244m) {
                cVar.b();
            }
            return cVar.f22248q;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        c cVar = this.f22220a;
        if (cVar.f22243l) {
            if (!cVar.f22244m) {
                cVar.b();
            }
            return cVar.f22247p;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.c;
        int i10 = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        c cVar = this.f22220a;
        if (cVar.f22249r) {
            return cVar.f22250s;
        }
        cVar.c();
        int i11 = cVar.f22239h;
        Drawable[] drawableArr = cVar.f22238g;
        if (i11 > 0) {
            i10 = drawableArr[0].getOpacity();
        }
        for (int i12 = 1; i12 < i11; i12++) {
            i10 = Drawable.resolveOpacity(i10, drawableArr[i12].getOpacity());
        }
        cVar.f22250s = i10;
        cVar.f22249r = true;
        return i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        boolean padding;
        c cVar = this.f22220a;
        boolean z10 = false;
        Rect rect2 = null;
        if (!cVar.f22240i) {
            Rect rect3 = cVar.f22242k;
            if (rect3 == null && !cVar.f22241j) {
                cVar.c();
                Rect rect4 = new Rect();
                int i10 = cVar.f22239h;
                Drawable[] drawableArr = cVar.f22238g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i12 = rect4.left;
                        if (i12 > rect2.left) {
                            rect2.left = i12;
                        }
                        int i13 = rect4.top;
                        if (i13 > rect2.top) {
                            rect2.top = i13;
                        }
                        int i14 = rect4.right;
                        if (i14 > rect2.right) {
                            rect2.right = i14;
                        }
                        int i15 = rect4.bottom;
                        if (i15 > rect2.bottom) {
                            rect2.bottom = i15;
                        }
                    }
                }
                cVar.f22241j = true;
                cVar.f22242k = rect2;
            } else {
                rect2 = rect3;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            } else {
                padding = false;
            }
        } else {
            Drawable drawable = this.c;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (this.f22220a.A && a.c.a(this) == 1) {
            z10 = true;
        }
        if (z10) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        c cVar = this.f22220a;
        if (cVar != null) {
            cVar.f22249r = false;
            cVar.f22251t = false;
        }
        if (drawable == this.c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f22220a.A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f22222d;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f22222d = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f22224f) {
                this.c.setAlpha(this.f22223e);
            }
        }
        if (this.f22229k != 0) {
            this.f22229k = 0L;
            z10 = true;
        }
        if (this.f22228j != 0) {
            this.f22228j = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f22226h && super.mutate() == this) {
            c b10 = b();
            b10.e();
            e(b10);
            this.f22226h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f22222d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        c cVar = this.f22220a;
        int i11 = this.f22225g;
        int i12 = cVar.f22239h;
        Drawable[] drawableArr = cVar.f22238g;
        boolean z10 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                boolean b10 = a.c.b(drawable, i10);
                if (i13 == i11) {
                    z10 = b10;
                }
            }
        }
        cVar.f22255x = i10;
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f22222d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f22222d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable == this.c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (!this.f22224f || this.f22223e != i10) {
            this.f22224f = true;
            this.f22223e = i10;
            Drawable drawable = this.c;
            if (drawable != null) {
                if (this.f22228j == 0) {
                    drawable.setAlpha(i10);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        c cVar = this.f22220a;
        if (cVar.A != z10) {
            cVar.A = z10;
            Drawable drawable = this.c;
            if (drawable != null) {
                a.C0322a.e(drawable, z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f22220a;
        cVar.C = true;
        if (cVar.B != colorFilter) {
            cVar.B = colorFilter;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        c cVar = this.f22220a;
        if (cVar.f22254w != z10) {
            cVar.f22254w = z10;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.c;
        if (drawable != null) {
            a.b.e(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f22221b;
        if (rect == null) {
            this.f22221b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            a.b.f(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        c cVar = this.f22220a;
        cVar.F = true;
        if (cVar.D != colorStateList) {
            cVar.D = colorStateList;
            p0.a.b(this.c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f22220a;
        cVar.G = true;
        if (cVar.E != mode) {
            cVar.E = mode;
            p0.a.c(this.c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f22222d;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    /* compiled from: DrawableContainerCompat.java */
    /* renamed from: n.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0295b implements Drawable.Callback {

        /* renamed from: a  reason: collision with root package name */
        public Drawable.Callback f22232a;

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f22232a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f22232a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
        }
    }
}
