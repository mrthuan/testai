package wl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDPageContentStream;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceRGB;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDImageXObject;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.j;
import n0.g;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.v;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: ImageConvertPDFTask.kt */
/* loaded from: classes3.dex */
public final class e implements sn.a {

    /* renamed from: a  reason: collision with root package name */
    public ThreadPoolExecutor f31365a;

    /* renamed from: b  reason: collision with root package name */
    public final Vector<f> f31366b = new Vector<>();
    public final AtomicBoolean c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInteger f31367d = new AtomicInteger(0);

    /* renamed from: e  reason: collision with root package name */
    public final AtomicInteger f31368e = new AtomicInteger(0);

    /* renamed from: f  reason: collision with root package name */
    public a f31369f;

    @Override // sn.a
    public final void a(Exception exc) {
        if (this.f31369f != null) {
            e(exc);
        }
    }

    @Override // sn.a
    public final void b(String str) {
        pdf.pdfreader.viewer.editor.free.observer.a aVar = StorageFileObserver.f25899a;
        if (str == null) {
            str = "";
        }
        StorageFileObserver.b(str);
    }

    @Override // sn.a
    public final void c(String str) {
        File file = new File(str);
        if (file.exists()) {
            ea.a.p("Jm1QZxwyZ2Q8QyVuA2UadA==", "U8mrr3fg");
            file.length();
            file.getName();
            Thread.currentThread().getName();
        }
        f();
        w0.a().f28791b.execute(new g(24, this, str));
    }

    public final void d(Context context, PDDocument pDDocument, int i10, ul.b bVar) {
        boolean z10;
        float width;
        float f10;
        float height;
        float height2;
        float f11;
        float f12;
        BitmapFactory.Options options;
        float f13;
        float f14;
        try {
            if (!this.c.get()) {
                String str = bVar.f30410h;
                kotlin.jvm.internal.g.d(str, ea.a.p("Bm0RZwsuVnA8UAd0aA==", "7Topn9Zi"));
                Bitmap p10 = aj.b.p(str, context);
                if (p10 != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    p10.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    float width2 = (p10.getWidth() * 1.0f) / p10.getHeight();
                    PDRectangle pDRectangle = PDRectangle.LETTER;
                    float width3 = (pDRectangle.getWidth() * 1.0f) / pDRectangle.getHeight();
                    if (width2 == 1.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        f10 = pDRectangle.getWidth();
                        width = pDRectangle.getWidth();
                    } else if (width2 > width3) {
                        f10 = pDRectangle.getWidth() * ((p10.getHeight() * 1.0f) / p10.getWidth());
                        width = pDRectangle.getWidth();
                    } else {
                        float height3 = pDRectangle.getHeight();
                        width = ((p10.getWidth() * 1.0f) / p10.getHeight()) * pDRectangle.getHeight();
                        f10 = height3;
                    }
                    PDRectangle pDRectangle2 = new PDRectangle(width, f10);
                    PDPage pDPage = new PDPage(pDRectangle2);
                    if (width2 > (pDRectangle2.getWidth() * 1.0f) / pDRectangle2.getHeight()) {
                        height = pDRectangle2.getWidth();
                        height2 = pDRectangle2.getWidth() / width2;
                    } else {
                        height = pDRectangle2.getHeight() * width2;
                        height2 = pDRectangle2.getHeight();
                    }
                    if (height < pDPage.getCropBox().getWidth()) {
                        f11 = (pDPage.getCropBox().getWidth() - height) / 2.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    if (height2 < pDPage.getCropBox().getHeight()) {
                        f12 = (pDPage.getCropBox().getHeight() - height2) / 2.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    PDPageContentStream pDPageContentStream = new PDPageContentStream(pDDocument, pDPage);
                    try {
                        options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeStream(byteArrayInputStream, null, options);
                        byteArrayInputStream.reset();
                        f13 = 2;
                        f14 = 0.0f * f13;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        pDPageContentStream.drawImage(new PDImageXObject(pDDocument, byteArrayInputStream, COSName.DCT_DECODE, options.outWidth, options.outHeight, 8, PDDeviceRGB.INSTANCE), f11 + 0.0f, f12 + 0.0f, (pDPage.getCropBox().getWidth() - (f11 * f13)) - f14, (pDPage.getCropBox().getHeight() - (f13 * f12)) - f14);
                        tf.d dVar = tf.d.f30009a;
                        o9.d.l(pDPageContentStream, null);
                        this.f31366b.add(new f(pDPage, i10));
                        o9.d.l(byteArrayInputStream, null);
                        o9.d.l(byteArrayOutputStream, null);
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
            }
        } catch (Exception e10) {
            e(e10);
            e10.printStackTrace();
            dp.a.a().getClass();
            dp.a.c("convert exception " + e10);
        } catch (OutOfMemoryError e11) {
            e(e11);
            e11.printStackTrace();
            androidx.activity.f.q("LG9fdhxyQyA1b20=", "FNswzBey", dp.a.a());
        } catch (Throwable th4) {
            e(th4);
            th4.printStackTrace();
            dp.a.a().getClass();
            dp.a.c("convert throwable " + th4);
        }
    }

    public final void e(Throwable th2) {
        f();
        w0.a().f28791b.execute(new androidx.fragment.app.g(14, this, th2));
    }

    public final void f() {
        try {
            this.c.set(true);
            ThreadPoolExecutor threadPoolExecutor = this.f31365a;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdownNow();
            }
            this.f31365a = null;
            dp.a a10 = dp.a.a();
            String p10 = ea.a.p("LG9fdhxyQyAoZSZlFHNl", "VbFNOCCZ");
            a10.getClass();
            dp.a.c(p10);
        } catch (Exception e10) {
            dp.a.a().getClass();
            dp.a.c("convert release error " + e10);
            e10.printStackTrace();
        }
    }

    public final synchronized void g(Context context, PDDocument pDDocument, String str) {
        try {
            try {
                try {
                    Vector<f> vector = this.f31366b;
                    if (vector.size() > 1) {
                        j.j0(vector, new d());
                    }
                    Iterator<f> it = this.f31366b.iterator();
                    while (it.hasNext()) {
                        pDDocument.addPage(it.next().f31371b);
                    }
                    Context m10 = ReaderPdfApplication.m();
                    ConcurrentHashMap<String, File> concurrentHashMap = v.f28781a;
                    File file = new File(v.B(m10, ea.a.p("DG9fdhxydA==", "EjKD6x1e")));
                    bg.b.z0(file);
                    file.mkdirs();
                    File file2 = new File(file.getAbsoluteFile() + File.separator + str + ".pdf");
                    if (file2.exists()) {
                        file2.delete();
                    }
                    file2.createNewFile();
                    pDDocument.save(file2);
                    ea.a.p("Jm1QZxwyZ2Q8QyVuA2UadA==", "cKs8wltf");
                    file2.length();
                    file2.getName();
                    Thread.currentThread().getName();
                    String str2 = n0.f28727a;
                    sn.d d10 = sn.d.d();
                    String p10 = ea.a.p("LG9fdhxydA==", "zxY4zjrn");
                    d10.getClass();
                    sn.d.k(context, file2, p10, this);
                } catch (OutOfMemoryError e10) {
                    e(e10);
                    e10.printStackTrace();
                    dp.a a10 = dp.a.a();
                    String p11 = ea.a.p("UG8ldhZyFiABYUJlSW85bQ==", "nX67thaf");
                    a10.getClass();
                    dp.a.c(p11);
                } catch (Throwable th2) {
                    e(th2);
                    th2.printStackTrace();
                    dp.a.a().getClass();
                    dp.a.c("convert save throwable " + th2);
                }
            } catch (Exception e11) {
                e(e11);
                e11.printStackTrace();
                dp.a.a().getClass();
                dp.a.c("convert save exception " + e11);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
