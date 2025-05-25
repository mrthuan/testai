package pdf.pdfreader.viewer.editor.free.decrypt;

import android.content.Context;
import cg.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.y;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: DecryptAndCopyUIHelper2.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f24251a;

    /* renamed from: b  reason: collision with root package name */
    public final List<PdfPreviewEntity> f24252b;
    public final DecryptAndCopyUIHelper.b c;

    /* renamed from: d  reason: collision with root package name */
    public final y f24253d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, ReaderPDFCore> f24254e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f24255f;

    public d(ReaderPreviewActivity readerPreviewActivity, ArrayList arrayList, DecryptAndCopyUIHelper.b bVar) {
        kotlin.jvm.internal.g.e(readerPreviewActivity, ea.a.p("LG9fdBx4dA==", "evL8Vnih"));
        ea.a.p("Km5FaQ1pUnM=", "keQg33ud");
        ea.a.p("XG4Ibx5wDmUGZVBMAHMiZSplcg==", "arV4rXbX");
        this.f24251a = readerPreviewActivity;
        this.f24252b = arrayList;
        this.c = bVar;
        this.f24253d = new y(readerPreviewActivity, new p<Integer, Integer, String>() { // from class: pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper2$decryptDialog$1
            {
                super(2);
            }

            @Override // cg.p
            public /* bridge */ /* synthetic */ String invoke(Integer num, Integer num2) {
                return invoke(num.intValue(), num2.intValue());
            }

            public final String invoke(int i10, int i11) {
                String string = d.this.f24251a.getString(R.string.arg_res_0x7f1303cd);
                kotlin.jvm.internal.g.d(string, ea.a.p("JW8idAN4Qy4vZRJTQHI-bl8oAC46dERploDXZTBkJ3IZcD5vBWVEcyFuAV9YbzZkUW41KQ==", "FLFLf7wb"));
                return string;
            }
        });
        this.f24254e = new HashMap<>();
        this.f24255f = new ArrayList();
    }

    public final void a(ArrayList arrayList) {
        ArrayList arrayList2;
        Context context;
        Object obj;
        boolean z10;
        boolean authenticatePassword;
        boolean z11;
        List<PdfPreviewEntity> list = this.f24252b;
        if (list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList2 = this.f24255f;
            context = this.f24251a;
            obj = null;
            if (!hasNext) {
                break;
            }
            PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) it.next();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((DecryptContainer) next).getPdfPreviewEntity().getId() == pdfPreviewEntity.getId()) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    obj = next;
                    break;
                }
            }
            DecryptContainer decryptContainer = (DecryptContainer) obj;
            if (decryptContainer != null) {
                try {
                    String path = pdfPreviewEntity.getPath();
                    kotlin.jvm.internal.g.d(path, ea.a.p("Am5HaS15H3ApdGg=", "K9g3Y1m3"));
                    String password = decryptContainer.getPassword();
                    HashMap<String, ReaderPDFCore> hashMap = this.f24254e;
                    ReaderPDFCore readerPDFCore = hashMap.get(path);
                    if (readerPDFCore != null) {
                        authenticatePassword = readerPDFCore.authenticatePassword(password);
                    } else {
                        ReaderPDFCore readerPDFCore2 = new ReaderPDFCore(context, path);
                        hashMap.put(path, readerPDFCore2);
                        authenticatePassword = readerPDFCore2.authenticatePassword(password);
                    }
                    if (authenticatePassword) {
                        arrayList2.add(new DecryptContainer(pdfPreviewEntity, decryptContainer.getPassword(), null, 4, null));
                    } else {
                        arrayList2.add(new DecryptContainer(pdfPreviewEntity, null, null, 6, null));
                    }
                } catch (Exception unused) {
                    arrayList2.add(new DecryptContainer(pdfPreviewEntity, null, null, 6, null));
                }
            } else {
                arrayList2.add(new DecryptContainer(pdfPreviewEntity, null, null, 6, null));
            }
        }
        c cVar = new c(this);
        kotlin.jvm.internal.g.e(context, "context");
        ReaderDecryptAndCopyExecutor readerDecryptAndCopyExecutor = new ReaderDecryptAndCopyExecutor(context, cVar);
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (((DecryptContainer) next2).getPassword().length() == 0) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                obj = next2;
                break;
            }
        }
        if (((DecryptContainer) obj) == null) {
            readerDecryptAndCopyExecutor.a(arrayList2);
        }
        w0.a().f28790a.execute(new b7.g(this, 18));
    }
}
