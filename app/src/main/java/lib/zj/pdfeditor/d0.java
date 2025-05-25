package lib.zj.pdfeditor;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import lib.zj.pdfeditor.PDFReaderView;

/* compiled from: PageView.java */
/* loaded from: classes3.dex */
public final class d0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f21472a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PageView f21473b;

    public d0(PageView pageView, String str) {
        this.f21473b = pageView;
        this.f21472a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PDFReaderView.Mode readerMode;
        PageView pageView = this.f21473b;
        Context context = pageView.f21268b;
        if (context == null) {
            return;
        }
        boolean z10 = context instanceof Activity;
        Context context2 = pageView.f21268b;
        if (z10 && (((Activity) context).isFinishing() || ((Activity) context2).isDestroyed())) {
            return;
        }
        ((ClipboardManager) context2.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("MuPDF", this.f21472a));
        readerMode = pageView.getReaderMode();
        if (readerMode != PDFReaderView.Mode.Viewing) {
            pageView.Z0();
        }
    }
}
