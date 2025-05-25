package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.widget.MaxHeightRecycleview;

/* compiled from: GalleryChooserPopu.kt */
/* loaded from: classes3.dex */
public final class n extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public final View f27697a;

    /* renamed from: b  reason: collision with root package name */
    public final tf.c f27698b;

    /* compiled from: GalleryChooserPopu.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a(ul.a aVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(View view) {
        super(view, -1, -2);
        ea.a.p("J28CdAJuQ1YhZXc=", "WoDlg7Zo");
        this.f27697a = view;
        tf.c a10 = kotlin.a.a(new cg.a<m>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.GalleryChooserPopu$adapter$2
            @Override // cg.a
            public final m invoke() {
                return new m();
            }
        });
        this.f27698b = a10;
        setBackgroundDrawable(new ColorDrawable(0));
        setOutsideTouchable(true);
        setFocusable(false);
        int i10 = pdf.pdfreader.viewer.editor.free.utils.m0.f28725a;
        if (Build.MANUFACTURER.toLowerCase().contains(ea.a.p("OWlHbw==", "8gfTtjYR")) && Build.VERSION.SDK_INT == 33) {
            setAnimationStyle(R.style.top_in_scale_anima2);
            view.setVisibility(4);
        } else {
            setAnimationStyle(R.style.top_in_scale_anima);
        }
        View findViewById = view.findViewById(R.id.galleryRv);
        kotlin.jvm.internal.g.d(findViewById, ea.a.p("FG8sdDJuPFYhZREuUmk5ZG5pN3cLeX9kXFJfaTUuJWEbbCdyLlI-KQ==", "XswBWHeX"));
        MaxHeightRecycleview maxHeightRecycleview = (MaxHeightRecycleview) findViewById;
        maxHeightRecycleview.setMaxHeight(view.getResources().getDimensionPixelSize(R.dimen.dp_340));
        maxHeightRecycleview.setAdapter((m) a10.getValue());
    }
}
