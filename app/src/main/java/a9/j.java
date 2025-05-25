package a9;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.Property;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import java.util.ArrayList;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: DrawableWithAnimatedVisibilityChange.java */
/* loaded from: classes2.dex */
public abstract class j extends Drawable implements Animatable {

    /* renamed from: k  reason: collision with root package name */
    public static final a f428k = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Context f429a;

    /* renamed from: b  reason: collision with root package name */
    public final b f430b;

    /* renamed from: d  reason: collision with root package name */
    public ValueAnimator f431d;

    /* renamed from: e  reason: collision with root package name */
    public ValueAnimator f432e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f433f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f434g;

    /* renamed from: h  reason: collision with root package name */
    public float f435h;

    /* renamed from: j  reason: collision with root package name */
    public int f437j;

    /* renamed from: i  reason: collision with root package name */
    public final Paint f436i = new Paint();
    public a9.a c = new a9.a();

    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    /* loaded from: classes2.dex */
    public class a extends Property<j, Float> {
        public a() {
            super(Float.class, "growFraction");
        }

        @Override // android.util.Property
        public final Float get(j jVar) {
            return Float.valueOf(jVar.b());
        }

        @Override // android.util.Property
        public final void set(j jVar, Float f10) {
            j jVar2 = jVar;
            float floatValue = f10.floatValue();
            if (jVar2.f435h != floatValue) {
                jVar2.f435h = floatValue;
                jVar2.invalidateSelf();
            }
        }
    }

    public j(Context context, b bVar) {
        this.f429a = context;
        this.f430b = bVar;
        setAlpha(FunctionEval.FunctionID.EXTERNAL_FUNC);
    }

    public final float b() {
        boolean z10;
        b bVar = this.f430b;
        boolean z11 = true;
        if (bVar.f400e != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (bVar.f401f == 0) {
                z11 = false;
            }
            if (!z11) {
                return 1.0f;
            }
        }
        return this.f435h;
    }

    public final boolean c() {
        ValueAnimator valueAnimator = this.f432e;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        ValueAnimator valueAnimator = this.f431d;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final boolean e(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        a9.a aVar = this.c;
        ContentResolver contentResolver = this.f429a.getContentResolver();
        aVar.getClass();
        float f10 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z12 && f10 > 0.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        return f(z10, z11, z13);
    }

    public boolean f(boolean z10, boolean z11, boolean z12) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z13;
        ValueAnimator valueAnimator3 = this.f431d;
        a aVar = f428k;
        if (valueAnimator3 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, aVar, 0.0f, 1.0f);
            this.f431d = ofFloat;
            ofFloat.setDuration(500L);
            this.f431d.setInterpolator(f8.b.f17142b);
            ValueAnimator valueAnimator4 = this.f431d;
            if (valueAnimator4 != null && valueAnimator4.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f431d = valueAnimator4;
            valueAnimator4.addListener(new h(this));
        }
        if (this.f432e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, aVar, 1.0f, 0.0f);
            this.f432e = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f432e.setInterpolator(f8.b.f17142b);
            ValueAnimator valueAnimator5 = this.f432e;
            if (valueAnimator5 != null && valueAnimator5.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f432e = valueAnimator5;
            valueAnimator5.addListener(new i(this));
        }
        boolean z14 = false;
        if (!isVisible() && !z10) {
            return false;
        }
        if (z10) {
            valueAnimator = this.f431d;
        } else {
            valueAnimator = this.f432e;
        }
        if (z10) {
            valueAnimator2 = this.f432e;
        } else {
            valueAnimator2 = this.f431d;
        }
        if (!z12) {
            if (valueAnimator2.isRunning()) {
                boolean z15 = this.f434g;
                this.f434g = true;
                valueAnimator2.cancel();
                this.f434g = z15;
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                boolean z16 = this.f434g;
                this.f434g = true;
                valueAnimator.end();
                this.f434g = z16;
            }
            return super.setVisible(z10, false);
        } else if (z12 && valueAnimator.isRunning()) {
            return false;
        } else {
            if (z10 && !super.setVisible(z10, false)) {
                z13 = false;
            } else {
                z13 = true;
            }
            b bVar = this.f430b;
            if (!z10 ? bVar.f401f != 0 : bVar.f400e != 0) {
                z14 = true;
            }
            if (!z14) {
                boolean z17 = this.f434g;
                this.f434g = true;
                valueAnimator.end();
                this.f434g = z17;
                return z13;
            }
            if (!z11 && valueAnimator.isPaused()) {
                valueAnimator.resume();
            } else {
                valueAnimator.start();
            }
            return z13;
        }
    }

    public final void g(BaseProgressIndicator.d dVar) {
        ArrayList arrayList = this.f433f;
        if (arrayList != null && arrayList.contains(dVar)) {
            this.f433f.remove(dVar);
            if (this.f433f.isEmpty()) {
                this.f433f = null;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f437j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        if (!d() && !c()) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f437j = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f436i.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        return e(z10, z11, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        f(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        f(false, true, false);
    }
}
