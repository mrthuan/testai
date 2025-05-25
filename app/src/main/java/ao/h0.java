package ao;

import android.view.View;
import android.widget.LinearLayout;
import hj.a;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class h0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f5056a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f5057b;
    public final /* synthetic */ LinearLayout c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f5058d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f5059e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5060f;

    public h0(ReaderPreviewActivity readerPreviewActivity, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5) {
        this.f5060f = readerPreviewActivity;
        this.f5056a = linearLayout;
        this.f5057b = linearLayout2;
        this.c = linearLayout3;
        this.f5058d = linearLayout4;
        this.f5059e = linearLayout5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f5056a.setSelected(true);
        this.f5057b.setSelected(false);
        this.c.setSelected(false);
        this.f5058d.setSelected(false);
        this.f5059e.setSelected(false);
        hj.a aVar = a.C0246a.f18352a;
        ReaderPreviewActivity context = this.f5060f;
        kotlin.jvm.internal.g.e(context, "context");
        aVar.c = (int) ((10.0f * context.getResources().getDisplayMetrics().density) + 0.5d);
        ReaderPreviewActivity.m2(context, ea.a.p("MQ==", "McbIY0Xo"));
    }
}
