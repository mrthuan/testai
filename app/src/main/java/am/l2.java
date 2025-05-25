package am;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import pdf.pdfreader.viewer.editor.free.ui.widget.GraffitiPreviewView;

/* compiled from: LayoutGraffitiSizeColorBottomSheetBinding.java */
/* loaded from: classes3.dex */
public final class l2 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f1070a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f1071b;
    public final RecyclerView c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f1072d;

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f1073e;

    /* renamed from: f  reason: collision with root package name */
    public final GraffitiPreviewView f1074f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatSeekBar f1075g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f1076h;

    public l2(LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, TextView textView, ConstraintLayout constraintLayout, GraffitiPreviewView graffitiPreviewView, AppCompatSeekBar appCompatSeekBar, TextView textView2) {
        this.f1070a = linearLayout;
        this.f1071b = linearLayout2;
        this.c = recyclerView;
        this.f1072d = textView;
        this.f1073e = constraintLayout;
        this.f1074f = graffitiPreviewView;
        this.f1075g = appCompatSeekBar;
        this.f1076h = textView2;
    }

    @Override // i2.a
    public final View b() {
        return this.f1070a;
    }
}
