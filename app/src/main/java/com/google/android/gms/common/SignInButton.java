package com.google.android.gms.common;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import b.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zaz;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.dynamic.RemoteCreator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p0.a;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public int f10891a;

    /* renamed from: b  reason: collision with root package name */
    public int f10892b;
    public View c;

    /* renamed from: d  reason: collision with root package name */
    public View.OnClickListener f10893d;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ButtonSize {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ColorScheme {
    }

    public SignInButton(Context context) {
        this(context, null);
    }

    public final void a(int i10, int i11) {
        this.f10891a = i10;
        this.f10892b = i11;
        Context context = getContext();
        View view = this.c;
        if (view != null) {
            removeView(view);
        }
        try {
            this.c = zaz.a(context, this.f10891a, this.f10892b);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            int i12 = this.f10891a;
            int i13 = this.f10892b;
            zaaa zaaaVar = new zaaa(context, null);
            Resources resources = context.getResources();
            zaaaVar.setTypeface(Typeface.DEFAULT_BOLD);
            zaaaVar.setTextSize(14.0f);
            int i14 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
            zaaaVar.setMinHeight(i14);
            zaaaVar.setMinWidth(i14);
            int a10 = zaaa.a(i13, pdf.pdfreader.viewer.editor.free.R.drawable.common_google_signin_btn_icon_dark, pdf.pdfreader.viewer.editor.free.R.drawable.common_google_signin_btn_icon_light, pdf.pdfreader.viewer.editor.free.R.drawable.common_google_signin_btn_icon_light);
            int a11 = zaaa.a(i13, pdf.pdfreader.viewer.editor.free.R.drawable.common_google_signin_btn_text_dark, pdf.pdfreader.viewer.editor.free.R.drawable.common_google_signin_btn_text_light, pdf.pdfreader.viewer.editor.free.R.drawable.common_google_signin_btn_text_light);
            if (i12 != 0 && i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException(a.c("Unknown button size: ", i12));
                }
            } else {
                a10 = a11;
            }
            Drawable drawable = resources.getDrawable(a10);
            a.b.h(drawable, resources.getColorStateList(pdf.pdfreader.viewer.editor.free.R.color.common_google_signin_btn_tint));
            a.b.i(drawable, PorterDuff.Mode.SRC_ATOP);
            zaaaVar.setBackgroundDrawable(drawable);
            ColorStateList colorStateList = resources.getColorStateList(zaaa.a(i13, pdf.pdfreader.viewer.editor.free.R.color.common_google_signin_btn_text_dark, pdf.pdfreader.viewer.editor.free.R.color.common_google_signin_btn_text_light, pdf.pdfreader.viewer.editor.free.R.color.common_google_signin_btn_text_light));
            Preconditions.j(colorStateList);
            zaaaVar.setTextColor(colorStateList);
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        zaaaVar.setText((CharSequence) null);
                    } else {
                        throw new IllegalStateException(b.a.c("Unknown button size: ", i12));
                    }
                } else {
                    zaaaVar.setText(resources.getString(pdf.pdfreader.viewer.editor.free.R.string.arg_res_0x7f1300c7));
                }
            } else {
                zaaaVar.setText(resources.getString(pdf.pdfreader.viewer.editor.free.R.string.arg_res_0x7f1300c6));
            }
            zaaaVar.setTransformationMethod(null);
            if (DeviceProperties.b(zaaaVar.getContext())) {
                zaaaVar.setGravity(19);
            }
            this.c = zaaaVar;
        }
        addView(this.c);
        this.c.setEnabled(isEnabled());
        this.c.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f10893d;
        if (onClickListener != null && view == this.c) {
            onClickListener.onClick(this);
        }
    }

    public void setColorScheme(int i10) {
        a(this.f10891a, i10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.c.setEnabled(z10);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f10893d = onClickListener;
        View view = this.c;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) {
        a(this.f10891a, this.f10892b);
    }

    public void setSize(int i10) {
        a(i10, this.f10892b);
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10893d = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.google.android.gms.base.R.styleable.f10832a, 0, 0);
        try {
            this.f10891a = obtainStyledAttributes.getInt(0, 0);
            this.f10892b = obtainStyledAttributes.getInt(1, 2);
            obtainStyledAttributes.recycle();
            a(this.f10891a, this.f10892b);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
