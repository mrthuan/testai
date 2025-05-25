package am;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout;

/* compiled from: DialogPreviewAddTextBinding.java */
/* loaded from: classes3.dex */
public final class i0 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f969a;

    /* renamed from: b  reason: collision with root package name */
    public final InterceptTouchFrameLayout f970b;
    public final EditText c;

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintLayout f971d;

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f972e;

    /* renamed from: f  reason: collision with root package name */
    public final Space f973f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatImageView f974g;

    /* renamed from: h  reason: collision with root package name */
    public final AppCompatTextView f975h;

    /* renamed from: i  reason: collision with root package name */
    public final AppCompatImageView f976i;

    public i0(ConstraintLayout constraintLayout, InterceptTouchFrameLayout interceptTouchFrameLayout, EditText editText, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, Space space, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2) {
        this.f969a = constraintLayout;
        this.f970b = interceptTouchFrameLayout;
        this.c = editText;
        this.f971d = constraintLayout2;
        this.f972e = constraintLayout3;
        this.f973f = space;
        this.f974g = appCompatImageView;
        this.f975h = appCompatTextView;
        this.f976i = appCompatImageView2;
    }

    @Override // i2.a
    public final View b() {
        return this.f969a;
    }
}
