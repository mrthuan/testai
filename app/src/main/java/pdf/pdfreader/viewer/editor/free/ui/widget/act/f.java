package pdf.pdfreader.viewer.editor.free.ui.widget.act;

import android.text.TextUtils;
import com.google.android.play.core.assetpacks.b1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.utils.n0;

/* compiled from: ReaderEditSearchActivity.java */
/* loaded from: classes3.dex */
public final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderEditSearchActivity f28331a;

    public f(ReaderEditSearchActivity readerEditSearchActivity) {
        this.f28331a = readerEditSearchActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReaderEditSearchActivity readerEditSearchActivity = this.f28331a;
        ArrayList a10 = bm.c.b(readerEditSearchActivity).a();
        int size = a10.size();
        ArrayList arrayList = new ArrayList(size);
        if (size > 0) {
            Iterator it = a10.iterator();
            while (it.hasNext()) {
                PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) it.next();
                File file = new File(pdfPreviewEntity.getPath());
                if (file.exists() && !TextUtils.isEmpty(file.getName()) && file.length() > 0 && b1.N(file)) {
                    arrayList.add(pdfPreviewEntity);
                } else {
                    ea.a.p("HGVQchpodmN0", "1VMlV1OI");
                    ea.a.p("qoa85tWh37_d5vGkk47h56-Eian_5vOHiLuCOiA=", "XCQ4l4ig");
                    String str = n0.f28727a;
                }
            }
        }
        readerEditSearchActivity.H.clear();
        readerEditSearchActivity.H.addAll(arrayList);
        readerEditSearchActivity.L.sendEmptyMessage(15);
    }
}
