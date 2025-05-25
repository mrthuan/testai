package u5;

import android.content.Context;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.a;
import com.facebook.internal.f;
import com.inmobi.media.E9;
import com.inmobi.media.Hb;
import com.inmobi.sdk.InMobiSdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import org.json.JSONException;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.data.RecentAddRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.utils.l;
import pdf.pdfreader.viewer.editor.free.utils.q0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.v;
import u5.d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30219a;

    public /* synthetic */ a(int i10) {
        this.f30219a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        f k10;
        String str;
        switch (this.f30219a) {
            case 0:
                if (!k6.a.b(b.class)) {
                    try {
                        Context a10 = com.facebook.d.a();
                        com.facebook.internal.a aVar = com.facebook.internal.a.f9745f;
                        com.facebook.internal.a a11 = a.C0146a.a(a10);
                        if (a11 != null && a11.f9749e) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            b bVar = b.f30220a;
                            bVar.getClass();
                            if (!k6.a.b(bVar) && (k10 = FetchedAppSettingsManager.k(com.facebook.d.b(), false)) != null && (str = k10.f9773i) != null) {
                                try {
                                    d.a().clear();
                                    d.a.a(new JSONObject(str));
                                } catch (JSONException unused) {
                                }
                            }
                            b.f30221b = true;
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        k6.a.a(b.class, th2);
                        return;
                    }
                }
                return;
            case 1:
                E9.c();
                return;
            case 2:
                Hb.f();
                return;
            case 3:
                InMobiSdk.b();
                return;
            case 4:
                FileRepository fileRepository = FileRepository.f24155a;
                boolean z11 = !RecentAddRepository.f24181a;
                FileRepository fileRepository2 = FileRepository.f24155a;
                if (z11) {
                    fileRepository2.getClass();
                    RecentAddRepository.q(m.E0(FileRepository.n()));
                    return;
                }
                fileRepository2.getClass();
                List<PdfPreviewEntity> list = m.E0(FileRepository.n());
                g.e(list, "list");
                ArrayList arrayList = new ArrayList();
                long o10 = q0.o();
                long i10 = q0.i();
                for (PdfPreviewEntity pdfPreviewEntity : list) {
                    if (pdfPreviewEntity.getDate() > o10 && pdfPreviewEntity.getId() > i10) {
                        String path = pdfPreviewEntity.getPath();
                        g.d(path, ea.a.p("UXR4cBF0aA==", "1x8VpHQx"));
                        if (!l.c(path) && t0.E(RecentAddRepository.b(), pdfPreviewEntity) == null) {
                            arrayList.add(pdfPreviewEntity);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    RecentAddRepository.a(arrayList);
                    return;
                }
                return;
            case 5:
                FileRepository.f24155a.getClass();
                FileRepository.H();
                return;
            case 6:
                v.a();
                return;
            case 7:
                Word2PDFConvertActivity.a aVar2 = Word2PDFConvertActivity.f26020p1;
                v.b();
                return;
            default:
                String str2 = ReaderHomeActivity.Y1;
                AppOpenManager.c().f();
                return;
        }
    }
}
