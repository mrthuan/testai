package g4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import g4.f;
import java.util.ArrayList;

/* compiled from: GifDrawable.java */
/* loaded from: classes.dex */
public final class c extends Drawable implements f.b, Animatable {

    /* renamed from: a  reason: collision with root package name */
    public final a f17630a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17631b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f17632d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17633e;

    /* renamed from: f  reason: collision with root package name */
    public int f17634f;

    /* renamed from: g  reason: collision with root package name */
    public final int f17635g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f17636h;

    /* renamed from: i  reason: collision with root package name */
    public Paint f17637i;

    /* renamed from: j  reason: collision with root package name */
    public Rect f17638j;

    /* compiled from: GifDrawable.java */
    /* loaded from: classes.dex */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final f f17639a;

        public a(f fVar) {
            this.f17639a = fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c() {
        throw null;
    }

    public c(a aVar) {
        this.f17633e = true;
        this.f17635g = -1;
        com.google.android.play.core.assetpacks.c.l(aVar);
        this.f17630a = aVar;
    }

    @Override // g4.f.b
    public final void a() {
        f fVar;
        int i10;
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        f.a aVar = this.f17630a.f17639a.f17648i;
        if (aVar != null) {
            i10 = aVar.f17658e;
        } else {
            i10 = -1;
        }
        if (i10 == fVar.f17641a.c() - 1) {
            this.f17634f++;
        }
        int i11 = this.f17635g;
        if (i11 != -1 && this.f17634f >= i11) {
            stop();
        }
    }

    public final void b() {
        com.google.android.play.core.assetpacks.c.k("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f17632d);
        a aVar = this.f17630a;
        if (aVar.f17639a.f17641a.c() == 1) {
            invalidateSelf();
        } else if (!this.f17631b) {
            this.f17631b = true;
            f fVar = aVar.f17639a;
            if (!fVar.f17649j) {
                ArrayList arrayList = fVar.c;
                if (!arrayList.contains(this)) {
                    boolean isEmpty = arrayList.isEmpty();
                    arrayList.add(this);
                    if (isEmpty && !fVar.f17645f) {
                        fVar.f17645f = true;
                        fVar.f17649j = false;
                        fVar.a();
                    }
                    invalidateSelf();
                    return;
                }
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (this.f17632d) {
            return;
        }
        if (this.f17636h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f17638j == null) {
                this.f17638j = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f17638j);
            this.f17636h = false;
        }
        f fVar = this.f17630a.f17639a;
        f.a aVar = fVar.f17648i;
        if (aVar != null) {
            bitmap = aVar.f17660g;
        } else {
            bitmap = fVar.f17651l;
        }
        if (this.f17638j == null) {
            this.f17638j = new Rect();
        }
        Rect rect = this.f17638j;
        if (this.f17637i == null) {
            this.f17637i = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f17637i);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f17630a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f17630a.f17639a.f17656q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f17630a.f17639a.f17655p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f17631b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f17636h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f17637i == null) {
            this.f17637i = new Paint(2);
        }
        this.f17637i.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f17637i == null) {
            this.f17637i = new Paint(2);
        }
        this.f17637i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        com.google.android.play.core.assetpacks.c.k("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f17632d);
        this.f17633e = z10;
        if (!z10) {
            this.f17631b = false;
            f fVar = this.f17630a.f17639a;
            ArrayList arrayList = fVar.c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                fVar.f17645f = false;
            }
        } else if (this.c) {
            b();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.c = true;
        this.f17634f = 0;
        if (this.f17633e) {
            b();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.c = false;
        this.f17631b = false;
        f fVar = this.f17630a.f17639a;
        ArrayList arrayList = fVar.c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            fVar.f17645f = false;
        }
    }
}
