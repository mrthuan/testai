package n;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import n.b;
import n.e;
import y.j;

/* compiled from: AnimatedStateListDrawableCompat.java */
/* loaded from: classes.dex */
public final class a extends n.e {

    /* renamed from: p  reason: collision with root package name */
    public b f22208p;

    /* renamed from: q  reason: collision with root package name */
    public f f22209q;

    /* renamed from: r  reason: collision with root package name */
    public int f22210r;

    /* renamed from: s  reason: collision with root package name */
    public int f22211s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f22212t;

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: n.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0294a extends f {

        /* renamed from: a  reason: collision with root package name */
        public final Animatable f22213a;

        public C0294a(Animatable animatable) {
            this.f22213a = animatable;
        }

        @Override // n.a.f
        public final void c() {
            this.f22213a.start();
        }

        @Override // n.a.f
        public final void d() {
            this.f22213a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class b extends e.a {
        public y.f<Long> I;
        public j<Integer> J;

        public b(b bVar, a aVar, Resources resources) {
            super(bVar, aVar, resources);
            if (bVar != null) {
                this.I = bVar.I;
                this.J = bVar.J;
                return;
            }
            this.I = new y.f<>();
            this.J = new j<>();
        }

        @Override // n.e.a, n.b.c
        public final void e() {
            this.I = this.I.clone();
            this.J = this.J.clone();
        }

        @Override // n.e.a, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // n.e.a, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: a  reason: collision with root package name */
        public final g2.d f22214a;

        public c(g2.d dVar) {
            this.f22214a = dVar;
        }

        @Override // n.a.f
        public final void c() {
            this.f22214a.start();
        }

        @Override // n.a.f
        public final void d() {
            this.f22214a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class d extends f {

        /* renamed from: a  reason: collision with root package name */
        public final ObjectAnimator f22215a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f22216b;

        public d(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            int i10;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z10) {
                i10 = numberOfFrames - 1;
            } else {
                i10 = 0;
            }
            int i11 = z10 ? 0 : numberOfFrames - 1;
            e eVar = new e(animationDrawable, z10);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
            o.a.a(ofInt, true);
            ofInt.setDuration(eVar.c);
            ofInt.setInterpolator(eVar);
            this.f22216b = z11;
            this.f22215a = ofInt;
        }

        @Override // n.a.f
        public final boolean a() {
            return this.f22216b;
        }

        @Override // n.a.f
        public final void b() {
            this.f22215a.reverse();
        }

        @Override // n.a.f
        public final void c() {
            this.f22215a.start();
        }

        @Override // n.a.f
        public final void d() {
            this.f22215a.cancel();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class e implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        public int[] f22217a;

        /* renamed from: b  reason: collision with root package name */
        public int f22218b;
        public int c;

        public e(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f22218b = numberOfFrames;
            int[] iArr = this.f22217a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f22217a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f22217a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.c = i10;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11;
            int i10 = (int) ((f10 * this.c) + 0.5f);
            int i11 = this.f22218b;
            int[] iArr = this.f22217a;
            int i12 = 0;
            while (i12 < i11) {
                int i13 = iArr[i12];
                if (i10 < i13) {
                    break;
                }
                i10 -= i13;
                i12++;
            }
            if (i12 < i11) {
                f11 = i10 / this.c;
            } else {
                f11 = 0.0f;
            }
            return (i12 / i11) + f11;
        }
    }

    public a() {
        this(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x026d, code lost:
        r4.onStateChange(r4.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0274, code lost:
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static n.a g(android.content.Context r23, android.content.res.Resources.Theme r24, android.content.res.Resources r25, android.util.AttributeSet r26, android.content.res.XmlResourceParser r27) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n.a.g(android.content.Context, android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, android.content.res.XmlResourceParser):n.a");
    }

    @Override // n.e, n.b
    public final b.c b() {
        return new b(this.f22208p, this, null);
    }

    @Override // n.e, n.b
    public final void e(b.c cVar) {
        super.e(cVar);
        if (cVar instanceof b) {
            this.f22208p = (b) cVar;
        }
    }

    @Override // n.e
    public final e.a f() {
        return new b(this.f22208p, this, null);
    }

    @Override // n.b, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        f fVar = this.f22209q;
        if (fVar != null) {
            fVar.d();
            this.f22209q = null;
            d(this.f22210r);
            this.f22210r = -1;
            this.f22211s = -1;
        }
    }

    @Override // n.e, n.b, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f22212t) {
            super.mutate();
            this.f22208p.e();
            this.f22212t = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0103  */
    @Override // n.e, n.b, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n.a.onStateChange(int[]):boolean");
    }

    @Override // n.b, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        f fVar = this.f22209q;
        if (fVar != null && (visible || z11)) {
            if (z10) {
                fVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public a(b bVar, Resources resources) {
        this.f22210r = -1;
        this.f22211s = -1;
        e(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class f {
        public boolean a() {
            return false;
        }

        public abstract void c();

        public abstract void d();

        public void b() {
        }
    }
}
