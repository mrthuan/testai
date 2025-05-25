package ao;

import android.view.View;
import android.widget.LinearLayout;
import hj.a;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class l0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f5097a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f5098b;
    public final /* synthetic */ LinearLayout c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f5099d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f5100e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5101f;

    public l0(ReaderPreviewActivity readerPreviewActivity, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5) {
        this.f5101f = readerPreviewActivity;
        this.f5097a = linearLayout;
        this.f5098b = linearLayout2;
        this.c = linearLayout3;
        this.f5099d = linearLayout4;
        this.f5100e = linearLayout5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f5097a.setSelected(false);
        this.f5098b.setSelected(false);
        this.c.setSelected(false);
        this.f5099d.setSelected(false);
        this.f5100e.setSelected(true);
        hj.a aVar = a.C0246a.f18352a;
        ReaderPreviewActivity context = this.f5101f;
        kotlin.jvm.internal.g.e(context, "context");
        aVar.c = (int) ((140.0f * context.getResources().getDisplayMetrics().density) + 0.5d);
        ReaderPreviewActivity.m2(context, ea.a.p("NQ==", "mRlS3bQG"));
    }
}
