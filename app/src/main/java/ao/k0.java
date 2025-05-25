package ao;

import android.view.View;
import android.widget.LinearLayout;
import hj.a;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class k0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f5088a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f5089b;
    public final /* synthetic */ LinearLayout c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f5090d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f5091e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5092f;

    public k0(ReaderPreviewActivity readerPreviewActivity, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5) {
        this.f5092f = readerPreviewActivity;
        this.f5088a = linearLayout;
        this.f5089b = linearLayout2;
        this.c = linearLayout3;
        this.f5090d = linearLayout4;
        this.f5091e = linearLayout5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f5088a.setSelected(false);
        this.f5089b.setSelected(false);
        this.c.setSelected(false);
        this.f5090d.setSelected(true);
        this.f5091e.setSelected(false);
        hj.a aVar = a.C0246a.f18352a;
        ReaderPreviewActivity context = this.f5092f;
        kotlin.jvm.internal.g.e(context, "context");
        aVar.c = (int) ((90.0f * context.getResources().getDisplayMetrics().density) + 0.5d);
        ReaderPreviewActivity.m2(context, ea.a.p("NA==", "PDHNyGla"));
    }
}
