package sj;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.Toast;
import java.lang.reflect.Field;

/* compiled from: ToastCompat.java */
/* loaded from: classes3.dex */
public final class b extends Toast {

    /* renamed from: a  reason: collision with root package name */
    public final Toast f29822a;

    public b(Context context, Toast toast) {
        super(context);
        this.f29822a = toast;
    }

    public static b a(Context context, String str) {
        Toast makeText = Toast.makeText(context, str, 0);
        View view = makeText.getView();
        a aVar = new a(context, makeText);
        if (Build.VERSION.SDK_INT == 25) {
            try {
                Field declaredField = View.class.getDeclaredField("mContext");
                declaredField.setAccessible(true);
                declaredField.set(view, aVar);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return new b(context, makeText);
    }

    @Override // android.widget.Toast
    public final int getDuration() {
        return this.f29822a.getDuration();
    }

    @Override // android.widget.Toast
    public final int getGravity() {
        return this.f29822a.getGravity();
    }

    @Override // android.widget.Toast
    public final float getHorizontalMargin() {
        return this.f29822a.getHorizontalMargin();
    }

    @Override // android.widget.Toast
    public final float getVerticalMargin() {
        return this.f29822a.getVerticalMargin();
    }

    @Override // android.widget.Toast
    public final View getView() {
        return this.f29822a.getView();
    }

    @Override // android.widget.Toast
    public final int getXOffset() {
        return this.f29822a.getXOffset();
    }

    @Override // android.widget.Toast
    public final int getYOffset() {
        return this.f29822a.getYOffset();
    }

    @Override // android.widget.Toast
    public final void setDuration(int i10) {
        this.f29822a.setDuration(i10);
    }

    @Override // android.widget.Toast
    public final void setGravity(int i10, int i11, int i12) {
        this.f29822a.setGravity(i10, i11, i12);
    }

    @Override // android.widget.Toast
    public final void setMargin(float f10, float f11) {
        this.f29822a.setMargin(f10, f11);
    }

    @Override // android.widget.Toast
    public final void setText(int i10) {
        this.f29822a.setText(i10);
    }

    @Override // android.widget.Toast
    public final void setView(View view) {
        this.f29822a.setView(view);
        a aVar = new a(view.getContext(), this);
        if (Build.VERSION.SDK_INT == 25) {
            try {
                Field declaredField = View.class.getDeclaredField("mContext");
                declaredField.setAccessible(true);
                declaredField.set(view, aVar);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    @Override // android.widget.Toast
    public final void show() {
        this.f29822a.show();
    }

    @Override // android.widget.Toast
    public final void setText(CharSequence charSequence) {
        this.f29822a.setText(charSequence);
    }
}
