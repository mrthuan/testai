package ao;

import android.view.View;
import android.widget.LinearLayout;
import hj.a;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class j0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f5076a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f5077b;
    public final /* synthetic */ LinearLayout c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f5078d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f5079e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5080f;

    public j0(ReaderPreviewActivity readerPreviewActivity, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5) {
        this.f5080f = readerPreviewActivity;
        this.f5076a = linearLayout;
        this.f5077b = linearLayout2;
        this.c = linearLayout3;
        this.f5078d = linearLayout4;
        this.f5079e = linearLayout5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f5076a.setSelected(false);
        this.f5077b.setSelected(false);
        this.c.setSelected(true);
        this.f5078d.setSelected(false);
        this.f5079e.setSelected(false);
        hj.a aVar = a.C0246a.f18352a;
        ReaderPreviewActivity context = this.f5080f;
        kotlin.jvm.internal.g.e(context, "context");
        aVar.c = (int) ((50.0f * context.getResources().getDisplayMetrics().density) + 0.5d);
        ReaderPreviewActivity.m2(context, ea.a.p("Mw==", "IIvItJjA"));
    }
}
