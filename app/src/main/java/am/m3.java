package am;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.PDF2WordSoDownLoadStateView;

/* compiled from: ListItemToolsBinding.java */
/* loaded from: classes3.dex */
public final class m3 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f1108a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f1109b;
    public final ImageView c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatImageView f1110d;

    /* renamed from: e  reason: collision with root package name */
    public final LottieAnimationView f1111e;

    /* renamed from: f  reason: collision with root package name */
    public final PDF2WordSoDownLoadStateView f1112f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f1113g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f1114h;

    /* renamed from: i  reason: collision with root package name */
    public final View f1115i;

    public m3(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, AppCompatImageView appCompatImageView, LottieAnimationView lottieAnimationView, PDF2WordSoDownLoadStateView pDF2WordSoDownLoadStateView, TextView textView, TextView textView2, View view) {
        this.f1108a = constraintLayout;
        this.f1109b = imageView;
        this.c = imageView2;
        this.f1110d = appCompatImageView;
        this.f1111e = lottieAnimationView;
        this.f1112f = pDF2WordSoDownLoadStateView;
        this.f1113g = textView;
        this.f1114h = textView2;
        this.f1115i = view;
    }

    @Override // i2.a
    public final View b() {
        return this.f1108a;
    }
}
