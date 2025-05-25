package ao;

import android.view.View;
import android.widget.LinearLayout;
import hj.a;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class i0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f5068a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f5069b;
    public final /* synthetic */ LinearLayout c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f5070d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f5071e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5072f;

    public i0(ReaderPreviewActivity readerPreviewActivity, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5) {
        this.f5072f = readerPreviewActivity;
        this.f5068a = linearLayout;
        this.f5069b = linearLayout2;
        this.c = linearLayout3;
        this.f5070d = linearLayout4;
        this.f5071e = linearLayout5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f5068a.setSelected(false);
        this.f5069b.setSelected(true);
        this.c.setSelected(false);
        this.f5070d.setSelected(false);
        this.f5071e.setSelected(false);
        hj.a aVar = a.C0246a.f18352a;
        ReaderPreviewActivity context = this.f5072f;
        kotlin.jvm.internal.g.e(context, "context");
        aVar.c = (int) ((30.0f * context.getResources().getDisplayMetrics().density) + 0.5d);
        ReaderPreviewActivity.m2(context, ea.a.p("Mg==", "oReW4hkE"));
    }
}
