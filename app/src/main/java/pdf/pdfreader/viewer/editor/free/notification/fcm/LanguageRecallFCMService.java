package pdf.pdfreader.viewer.editor.free.notification.fcm;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessagingService;
import ea.a;
import jb.t;
import kotlin.jvm.internal.g;
import no.f;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.fnbridge.FlutterEncryptConfig;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.d1;
import y.b;

/* compiled from: LanguageRecallFCMService.kt */
/* loaded from: classes3.dex */
public final class LanguageRecallFCMService extends FirebaseMessagingService {
    static {
        a.p("A2FfZwxhUGUIZSlhGWwuQ00=", "yC8WpOwo");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(t tVar) {
        if (tVar.f19155b == null) {
            b bVar = new b();
            Bundle bundle = tVar.f19154a;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        bVar.put(str, str2);
                    }
                }
            }
            tVar.f19155b = bVar;
        }
        b bVar2 = tVar.f19155b;
        g.d(bVar2, a.p("QWUmbwdlL2UBc1VnDC4yYTBh", "7CASCRf6"));
        bVar2.toString();
        FlutterEncryptConfig.f25878a.getClass();
        if (FlutterEncryptConfig.c()) {
            f.b(ReaderPdfApplication.m()).getClass();
            d1 b10 = d1.b(ReaderPdfApplication.m());
            String p10 = a.p("LWM1XxNvGWsXYwl1WnQIMQ41", "9YKXdkoY");
            SharedPreferences sharedPreferences = b10.f28619a;
            int i10 = 0;
            if (sharedPreferences != null) {
                i10 = sharedPreferences.getInt(p10, 0);
            }
            Context m10 = ReaderPdfApplication.m();
            g.d(m10, a.p("KGVFSRdzQ2E0Yy8oKQ==", "IZBFbgk3"));
            if (i10 >= c1.n(m10) - 1) {
                return;
            }
            int i11 = i10 + 1;
            f.b(ReaderPdfApplication.m()).getClass();
            d1 b11 = d1.b(ReaderPdfApplication.m());
            String p11 = a.p("KWNcXw5vRWsFYyV1G3Q3MQM1", "LEz4zbNP");
            SharedPreferences sharedPreferences2 = b11.f28619a;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putInt(p11, i11).apply();
            }
            pdf.pdfreader.viewer.editor.free.service.b bVar3 = pdf.pdfreader.viewer.editor.free.service.b.f26559a;
            Context m11 = ReaderPdfApplication.m();
            g.d(m11, a.p("VGU_SR1zFmEcY1EoKQ==", "b6Dc1m5C"));
            bVar3.getClass();
            pdf.pdfreader.viewer.editor.free.service.b.c(m11);
            Context m12 = ReaderPdfApplication.m();
            g.d(m12, a.p("VGU_SR1zFmEcY1EoKQ==", "nl2AGx80"));
            bVar3.h(m12, true, i10 + 2);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void e(String token) {
        g.e(token, "token");
    }
}
