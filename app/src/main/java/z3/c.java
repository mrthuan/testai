package z3;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.utils.n0;

/* compiled from: ByteBufferEncoder.java */
/* loaded from: classes.dex */
public final class c implements t3.a, t3.g, i4.f, l5.a, ka.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f32228a;

    public /* synthetic */ c(int i10) {
        this.f32228a = i10;
    }

    public static void f(PdfPreviewEntity pdfPreviewEntity) {
        if (pdfPreviewEntity != null) {
            String path = pdfPreviewEntity.getPath();
            String otherStrOne = pdfPreviewEntity.getOtherStrOne();
            if (!TextUtils.isEmpty(path) && TextUtils.isEmpty(otherStrOne)) {
                ea.a.p("d2E_YTFhEWU3bkBpHXkEZTRhW3JmciZwMWlESTVOCWVXIC5uB2kWeVJvQGgMcgV0Nk9cZWZpMCA-dVpsfyAeZUNhInJTaRbvzoxAaR1sMyB5IA==", "P6SlF7iF");
                pdfPreviewEntity.getName();
                String str = n0.f28727a;
                pdfPreviewEntity.setOtherStrOne(pdf.pdfreader.viewer.editor.free.utils.w.a(path));
            }
        }
    }

    @Override // t3.g
    public final EncodeStrategy a(t3.e eVar) {
        return EncodeStrategy.SOURCE;
    }

    @Override // i4.f
    public final void b(i4.g gVar) {
        gVar.onStart();
    }

    @Override // l5.a
    public final String c(int i10, String str, String str2, long j10) {
        return Long.toString(j10) + '|' + o9.d.o(i10) + '|' + str + '|' + str2;
    }

    @Override // t3.a
    public final boolean d(Object obj, File file, t3.e eVar) {
        switch (this.f32228a) {
            case 0:
                try {
                    p4.a.b((ByteBuffer) obj, file);
                    return true;
                } catch (IOException unused) {
                    Log.isLoggable("ByteBufferEncoder", 3);
                    return false;
                }
            default:
                try {
                    p4.a.b(((g4.c) ((v3.l) obj).get()).f17630a.f17639a.f17641a.getData().asReadOnlyBuffer(), file);
                    return true;
                } catch (IOException unused2) {
                    Log.isLoggable("GifEncoder", 5);
                    return false;
                }
        }
    }

    @Override // ka.a
    public final void h(Bundle bundle) {
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    @Override // i4.f
    public final void e(i4.g gVar) {
    }
}
