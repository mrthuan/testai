package n;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import n.b;

/* compiled from: StateListDrawableCompat.java */
/* loaded from: classes.dex */
public class e extends b {

    /* renamed from: n  reason: collision with root package name */
    public a f22270n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f22271o;

    /* compiled from: StateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class a extends b.c {
        public int[][] H;

        public a(a aVar, e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.H = aVar.H;
            } else {
                this.H = new int[this.f22238g.length];
            }
        }

        @Override // n.b.c
        public void e() {
            int[] iArr;
            int[][] iArr2 = this.H;
            int[][] iArr3 = new int[iArr2.length];
            for (int length = iArr2.length - 1; length >= 0; length--) {
                int[] iArr4 = this.H[length];
                if (iArr4 != null) {
                    iArr = (int[]) iArr4.clone();
                } else {
                    iArr = null;
                }
                iArr3[length] = iArr;
            }
            this.H = iArr3;
        }

        public final int f(int[] iArr) {
            int[][] iArr2 = this.H;
            int i10 = this.f22239h;
            for (int i11 = 0; i11 < i10; i11++) {
                if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new e(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new e(this, resources);
        }
    }

    public e(a aVar, Resources resources) {
        e(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // n.b, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // n.b
    public void e(b.c cVar) {
        this.f22220a = cVar;
        int i10 = this.f22225g;
        if (i10 >= 0) {
            Drawable d10 = cVar.d(i10);
            this.c = d10;
            if (d10 != null) {
                c(d10);
            }
        }
        this.f22222d = null;
        if (cVar instanceof a) {
            this.f22270n = (a) cVar;
        }
    }

    @Override // n.b
    /* renamed from: f */
    public a b() {
        return new a(this.f22270n, this, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // n.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f22271o) {
            super.mutate();
            this.f22270n.e();
            this.f22271o = true;
        }
        return this;
    }

    @Override // n.b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int f10 = this.f22270n.f(iArr);
        if (f10 < 0) {
            f10 = this.f22270n.f(StateSet.WILD_CARD);
        }
        if (!d(f10) && !onStateChange) {
            return false;
        }
        return true;
    }

    public e() {
    }
}
