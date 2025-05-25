package pdf.pdfreader.viewer.editor.free.feature.ocr.helper;

import android.graphics.Bitmap;
import android.graphics.PointF;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;

/* compiled from: TransportMultiImage.kt */
/* loaded from: classes3.dex */
public final class m implements l {

    /* renamed from: a  reason: collision with root package name */
    public final int f25089a;

    /* renamed from: b  reason: collision with root package name */
    public final ReaderPDFCore f25090b;
    public final List<Integer> c;

    public m(int i10, ReaderPDFCore readerPDFCore, ArrayList arrayList) {
        ea.a.p("UG85ZQ==", "m0CxfrtI");
        ea.a.p("PGVdZRp0fm07Z2U=", "mNtL8IXD");
        this.f25089a = i10;
        this.f25090b = readerPDFCore;
        this.c = arrayList;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ocr.helper.l
    public final ul.c a(int i10) {
        return null;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ocr.helper.l
    public final String b(File file, int i10) {
        String str;
        int i11;
        if (!file.exists() || !file.isDirectory()) {
            return "";
        }
        Integer num = (Integer) kotlin.collections.m.t0(i10, this.c);
        if (num != null) {
            int intValue = num.intValue();
            w3.c cVar = com.bumptech.glide.b.b(ReaderPdfApplication.m()).f6833a;
            kotlin.jvm.internal.g.d(cVar, ea.a.p("NWUaKGNlC2QtcjZkUkEncFRpMWE9aVluWmcUdBhuMXQzbg1lGSlDLippEm1VcAdvV2w=", "X9Rn1jHA"));
            PointF pageSize = this.f25090b.getPageSize(intValue);
            float f10 = pageSize.x;
            float f11 = pageSize.y;
            try {
                if (f10 > 0.0f) {
                    float f12 = this.f25089a;
                    if (f10 > f12) {
                        float f13 = f12 / f10;
                        i11 = (int) (f10 * f13);
                        f11 *= f13;
                        int i12 = i11;
                        int i13 = (int) f11;
                        Bitmap e10 = cVar.e(i12, i13, Bitmap.Config.ARGB_8888);
                        kotlin.jvm.internal.g.d(e10, ea.a.p("LWlFbRhwZ281bGRnEHRAYlx0A2E1VwxkjIDWICdpGm0ucB9DFm5RaT0uC1IyQjc4DThWKQ==", "gokMnpen"));
                        File file2 = new File(file.getAbsoluteFile() + File.separator + UUID.randomUUID() + ".png");
                        this.f25090b.drawPage(e10, intValue, i12, i13, 0, 0, i12, i13, new ReaderPDFCore.Cookie());
                        String absolutePath = file2.getAbsolutePath();
                        kotlin.jvm.internal.g.d(absolutePath, ea.a.p("VWknZV1hAHMdbEF0DFA3dGg=", "tHmWAy0K"));
                        File file3 = new File(absolutePath);
                        file3.deleteOnExit();
                        file3.createNewFile();
                        FileOutputStream fileOutputStream = new FileOutputStream(file3);
                        e10.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        str = file2.getAbsolutePath();
                    }
                }
                Bitmap e102 = cVar.e(i12, i13, Bitmap.Config.ARGB_8888);
                kotlin.jvm.internal.g.d(e102, ea.a.p("LWlFbRhwZ281bGRnEHRAYlx0A2E1VwxkjIDWICdpGm0ucB9DFm5RaT0uC1IyQjc4DThWKQ==", "gokMnpen"));
                File file22 = new File(file.getAbsoluteFile() + File.separator + UUID.randomUUID() + ".png");
                this.f25090b.drawPage(e102, intValue, i12, i13, 0, 0, i12, i13, new ReaderPDFCore.Cookie());
                String absolutePath2 = file22.getAbsolutePath();
                kotlin.jvm.internal.g.d(absolutePath2, ea.a.p("VWknZV1hAHMdbEF0DFA3dGg=", "tHmWAy0K"));
                File file32 = new File(absolutePath2);
                file32.deleteOnExit();
                file32.createNewFile();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file32);
                e102.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                fileOutputStream2.flush();
                fileOutputStream2.close();
                str = file22.getAbsolutePath();
            } catch (Exception e11) {
                e11.printStackTrace();
                str = "";
            }
            i11 = (int) f10;
            int i122 = i11;
            int i132 = (int) f11;
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ocr.helper.l
    public final long c() {
        long j10;
        long j11 = 0;
        for (Number number : this.c) {
            PointF pageSize = this.f25090b.getPageSize(number.intValue());
            float f10 = pageSize.x;
            float f11 = pageSize.y;
            if (f10 > 0.0f) {
                int i10 = this.f25089a;
                if (f10 > i10) {
                    float f12 = i10 / f10;
                    j10 = f11 * f12 * f10 * f12 * 4;
                    j11 += j10;
                }
            }
            j10 = f10 * f11 * 4;
            j11 += j10;
        }
        return j11;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ocr.helper.l
    public final int size() {
        return this.c.size();
    }
}
