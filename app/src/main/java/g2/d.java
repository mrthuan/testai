package g2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p0.a;

/* compiled from: AnimatedVectorDrawableCompat.java */
/* loaded from: classes.dex */
public final class d extends h implements Animatable {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f17424g = 0;

    /* renamed from: b  reason: collision with root package name */
    public final b f17425b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public e f17426d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<g2.c> f17427e;

    /* renamed from: f  reason: collision with root package name */
    public final a f17428f;

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            d.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            d.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            d.this.unscheduleSelf(runnable);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public i f17430a;

        /* renamed from: b  reason: collision with root package name */
        public AnimatorSet f17431b;
        public ArrayList<Animator> c;

        /* renamed from: d  reason: collision with root package name */
        public y.b<Animator, String> f17432d;

        public b(a aVar) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public d() {
        this(null);
    }

    @Override // g2.h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            a.b.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            return a.b.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f17425b;
        bVar.f17430a.draw(canvas);
        if (bVar.f17431b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            return a.C0322a.a(drawable);
        }
        return this.f17425b.f17430a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f17425b.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            return a.b.c(drawable);
        }
        return this.f17425b.f17430a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f17437a != null && Build.VERSION.SDK_INT >= 24) {
            return new c(this.f17437a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f17425b.f17430a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f17425b.f17430a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f17425b.f17430a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0171, code lost:
        if (r8.f17431b != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0173, code lost:
        r8.f17431b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017a, code lost:
        r8.f17431b.playTogether(r8.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0181, code lost:
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.d.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            return a.C0322a.d(drawable);
        }
        return this.f17425b.f17430a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f17425b.f17431b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f17425b.f17430a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f17425b.f17430a.setBounds(rect);
        }
    }

    @Override // g2.h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        return this.f17425b.f17430a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f17425b.f17430a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f17425b.f17430a.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            a.C0322a.e(drawable, z10);
        } else {
            this.f17425b.f17430a.setAutoMirrored(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f17425b.f17430a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            p0.a.a(drawable, i10);
        } else {
            this.f17425b.f17430a.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            p0.a.b(drawable, colorStateList);
        } else {
            this.f17425b.f17430a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            p0.a.c(drawable, mode);
        } else {
            this.f17425b.f17430a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f17425b.f17430a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f17425b;
        if (bVar.f17431b.isStarted()) {
            return;
        }
        bVar.f17431b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f17437a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f17425b.f17431b.end();
        }
    }

    public d(Context context) {
        this.f17426d = null;
        this.f17427e = null;
        a aVar = new a();
        this.f17428f = aVar;
        this.c = context;
        this.f17425b = new b(aVar);
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f17433a;

        public c(Drawable.ConstantState constantState) {
            this.f17433a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f17433a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f17433a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            d dVar = new d();
            Drawable newDrawable = this.f17433a.newDrawable();
            dVar.f17437a = newDrawable;
            newDrawable.setCallback(dVar.f17428f);
            return dVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            d dVar = new d();
            Drawable newDrawable = this.f17433a.newDrawable(resources);
            dVar.f17437a = newDrawable;
            newDrawable.setCallback(dVar.f17428f);
            return dVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            d dVar = new d();
            Drawable newDrawable = this.f17433a.newDrawable(resources, theme);
            dVar.f17437a = newDrawable;
            newDrawable.setCallback(dVar.f17428f);
            return dVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
