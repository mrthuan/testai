package a0;

import android.graphics.Path;
import android.graphics.Rect;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.ac.hm;
import com.google.android.gms.internal.ads.zzea;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements pdf.pdfreader.viewer.editor.free.data.d {
    public static int a(Path path, float f10, float f11, Rect rect, int i10) {
        path.lineTo(f10, f11);
        return rect.centerX() + i10;
    }

    public static String b(String str, int i10, String str2, int i11) {
        return str + i10 + str2 + i11;
    }

    public static String d(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String e(Locale locale, String str, String str2, Locale locale2, String str3) {
        g.d(locale, str);
        String lowerCase = str2.toLowerCase(locale2);
        g.d(lowerCase, str3);
        return lowerCase;
    }

    public static StringBuilder f(String str, int i10, String str2, int i11, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder g(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static void h(Class cls, StringBuffer stringBuffer, String str) {
        stringBuffer.append(cls.getName());
        stringBuffer.append(str);
    }

    public static void i(String str, int i10, String str2) {
        zzea.zzf(str2, str + i10);
    }

    public static boolean j(hm hmVar, String str) {
        return TextUtils.equals(hmVar.WAv().cJ(), str);
    }

    @Override // pdf.pdfreader.viewer.editor.free.data.d
    public void c(PdfPreviewEntity pdfPreviewEntity) {
        ExecutorService executorService = ReaderPreviewActivity.U5;
        pdfPreviewEntity.setHighlightOnce(true);
    }
}
