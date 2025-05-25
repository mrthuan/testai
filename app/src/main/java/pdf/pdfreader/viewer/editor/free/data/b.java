package pdf.pdfreader.viewer.editor.free.data;

import android.text.SpannableStringBuilder;
import androidx.activity.f;
import androidx.room.RoomDatabase;
import cg.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import km.e;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIAnswerContent;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIDataBase;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24204a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f24205b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i10, long j10, Object obj) {
        this.f24204a = i10;
        this.f24205b = j10;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z10;
        switch (this.f24204a) {
            case 0:
                long j10 = this.f24205b;
                d dVar = (d) this.c;
                g.e(dVar, ea.a.p("F287ZQFhFmU=", "T69hTeaB"));
                FileRepository.f24155a.getClass();
                Iterator it = FileRepository.r().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((PdfPreviewEntity) obj).getId() == j10) {
                            z10 = true;
                            continue;
                        } else {
                            z10 = false;
                            continue;
                        }
                        if (z10) {
                        }
                    } else {
                        obj = null;
                    }
                }
                PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) obj;
                if (pdfPreviewEntity != null) {
                    dVar.c(pdfPreviewEntity);
                    FileRepository.f24155a.getClass();
                    FileRepository.q().setValue(m.E0(FileRepository.r()));
                    synchronized (FileRepository.j()) {
                        ((List) FileRepository.F.getValue()).add(pdfPreviewEntity);
                    }
                    RecentAddRepository.s(pdfPreviewEntity);
                    FileRepository.f(pdfPreviewEntity);
                    if (!FileRepository.i().get()) {
                        FileRepository.o().execute(new u5.a(5));
                        return;
                    }
                    return;
                }
                return;
            default:
                long j11 = this.f24205b;
                l lVar = (l) this.c;
                AIDataBase aIDataBase = e.f19907a;
                g.e(lVar, ea.a.p("a29fRxx0cWk0aTloEGQ=", "NWhRYjJM"));
                km.c cVar = (km.c) e.f19907a.k();
                RoomDatabase roomDatabase = cVar.f19897a;
                roomDatabase.c();
                try {
                    ArrayList b10 = f.b(cVar, j11);
                    roomDatabase.j();
                    if (b10 != null) {
                        Iterator it2 = b10.iterator();
                        while (it2.hasNext()) {
                            ArrayList arrayList = ((km.a) it2.next()).f19893w;
                            if (arrayList != null) {
                                ea.a.p("Um44dxZyIW8cdFFudA==", "givGb52c");
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    AIAnswerContent aIAnswerContent = (AIAnswerContent) it3.next();
                                    SpannableStringBuilder J = e.f19908b.J(aIAnswerContent.getContent());
                                    ea.a.p("ImFDaw5vWS4ubwdhB2sMb0JuRmEsQQtzEmUBQxxuJmUhdB9jFm5DZTR0KQ==", "CAsKessR");
                                    if (aIAnswerContent.getEndIndex() > 0) {
                                        aIAnswerContent.setSpanStr(new SpannableStringBuilder(J.subSequence(0, aIAnswerContent.getEndIndex())));
                                    } else {
                                        aIAnswerContent.setSpanStr(new SpannableStringBuilder(J));
                                    }
                                }
                            }
                        }
                    }
                    w0.a().f28791b.execute(new com.facebook.appevents.g(14, lVar, b10));
                    return;
                } finally {
                    roomDatabase.g();
                }
        }
    }
}
