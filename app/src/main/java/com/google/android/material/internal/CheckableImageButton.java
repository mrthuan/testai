package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import y0.f;

/* loaded from: classes2.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f12590g = {16842912};

    /* renamed from: d  reason: collision with root package name */
    public boolean f12591d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12592e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12593f;

    /* loaded from: classes2.dex */
    public class a extends x0.a {
        public a() {
        }

        @Override // x0.a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // x0.a
        public final void d(View view, f fVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f31416a;
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f31951a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            CheckableImageButton checkableImageButton = CheckableImageButton.this;
            accessibilityNodeInfo.setCheckable(checkableImageButton.f12592e);
            accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends c1.a {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public boolean c;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new b[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt() == 1;
        }

        @Override // c1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5506a, i10);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f12591d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        if (this.f12591d) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), f12590g);
        }
        return super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f5506a);
        setChecked(bVar.c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.c = this.f12591d;
        return bVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f12592e != z10) {
            this.f12592e = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f12592e && this.f12591d != z10) {
            this.f12591d = z10;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z10) {
        this.f12593f = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f12593f) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f12591d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12592e = true;
        this.f12593f = true;
        f0.o(this, new a());
    }
}
