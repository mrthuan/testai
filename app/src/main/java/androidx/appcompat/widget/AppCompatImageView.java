package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    public final e f2251a;

    /* renamed from: b  reason: collision with root package name */
    public final k f2252b;
    public boolean c;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f2251a;
        if (eVar != null) {
            eVar.a();
        }
        k kVar = this.f2252b;
        if (kVar != null) {
            kVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f2251a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f2251a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        s0 s0Var;
        k kVar = this.f2252b;
        if (kVar == null || (s0Var = kVar.f2614b) == null) {
            return null;
        }
        return s0Var.f2672a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        s0 s0Var;
        k kVar = this.f2252b;
        if (kVar == null || (s0Var = kVar.f2614b) == null) {
            return null;
        }
        return s0Var.f2673b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if ((!(this.f2252b.f2613a.getBackground() instanceof RippleDrawable)) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f2251a;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f2251a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        k kVar = this.f2252b;
        if (kVar != null) {
            kVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        k kVar = this.f2252b;
        if (kVar != null && drawable != null && !this.c) {
            kVar.c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (kVar != null) {
            kVar.a();
            if (!this.c) {
                ImageView imageView = kVar.f2613a;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(kVar.c);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        k kVar = this.f2252b;
        if (kVar != null) {
            kVar.c(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        k kVar = this.f2252b;
        if (kVar != null) {
            kVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f2251a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f2251a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        k kVar = this.f2252b;
        if (kVar != null) {
            if (kVar.f2614b == null) {
                kVar.f2614b = new s0();
            }
            s0 s0Var = kVar.f2614b;
            s0Var.f2672a = colorStateList;
            s0Var.f2674d = true;
            kVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        k kVar = this.f2252b;
        if (kVar != null) {
            if (kVar.f2614b == null) {
                kVar.f2614b = new s0();
            }
            s0 s0Var = kVar.f2614b;
            s0Var.f2673b = mode;
            s0Var.c = true;
            kVar.a();
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        r0.a(context);
        this.c = false;
        p0.a(getContext(), this);
        e eVar = new e(this);
        this.f2251a = eVar;
        eVar.d(attributeSet, i10);
        k kVar = new k(this);
        this.f2252b = kVar;
        kVar.b(attributeSet, i10);
    }
}
