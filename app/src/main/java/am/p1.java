package am;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.flexbox.FlexboxLayout;

/* compiled from: ItemImgConvertPdfDragTipsR3Binding.java */
/* loaded from: classes3.dex */
public final class p1 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1300a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatTextView f1301b;
    public final ViewGroup c;

    /* renamed from: d  reason: collision with root package name */
    public final ViewGroup f1302d;

    /* renamed from: e  reason: collision with root package name */
    public final View f1303e;

    public p1(FlexboxLayout flexboxLayout, FlexboxLayout flexboxLayout2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.c = flexboxLayout;
        this.f1302d = flexboxLayout2;
        this.f1301b = appCompatTextView;
        this.f1303e = appCompatTextView2;
    }

    @Override // i2.a
    public final View b() {
        int i10 = this.f1300a;
        ViewGroup viewGroup = this.c;
        switch (i10) {
            case 0:
                return (LinearLayout) viewGroup;
            default:
                return (FlexboxLayout) viewGroup;
        }
    }

    public p1(LinearLayout linearLayout, AppCompatImageView appCompatImageView, LinearLayout linearLayout2, AppCompatTextView appCompatTextView) {
        this.c = linearLayout;
        this.f1303e = appCompatImageView;
        this.f1302d = linearLayout2;
        this.f1301b = appCompatTextView;
    }
}
