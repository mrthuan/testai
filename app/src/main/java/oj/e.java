package oj;

import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.pdfeditor.PageView;
import lib.zj.pdfeditor.ReaderPDFCore;
import nj.a;
import oj.a;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReflowHelper.java */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: g  reason: collision with root package name */
    public static int f23109g = 100000000;

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f23110a = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.CallerRunsPolicy());

    /* renamed from: b  reason: collision with root package name */
    public final Handler f23111b = new Handler(Looper.getMainLooper());
    public final ConcurrentHashMap<Integer, ReaderPDFCore.c> c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f23112d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    public File f23113e;

    /* renamed from: f  reason: collision with root package name */
    public Matrix f23114f;

    public static void a(int[] iArr, c cVar) {
        if (iArr != null && iArr.length == 3) {
            ((ReaderPreviewActivity.c) cVar).a(iArr[2]);
            return;
        }
        ((ReaderPreviewActivity.c) cVar).a(1);
    }

    public final b b(int i10, int i11, int i12, int i13, float f10, float f11, ReaderPDFCore.Cookie cookie, ReaderPDFCore readerPDFCore) {
        if (this.f23112d.get()) {
            cookie.a();
            return null;
        } else if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            ConcurrentHashMap<Integer, ReaderPDFCore.c> concurrentHashMap = this.c;
            ReaderPDFCore.c cVar = concurrentHashMap.get(Integer.valueOf(i10));
            if (cVar == null) {
                ReaderPDFCore.c cacheReflow = readerPDFCore.cacheReflow(i10, i11, i12, i13, f10, f11, cookie);
                if (cacheReflow == null) {
                    cookie.a();
                    return null;
                }
                concurrentHashMap.put(Integer.valueOf(i10), cacheReflow);
                ReaderPDFCore.d b10 = cacheReflow.b(Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Float.valueOf(f10), Float.valueOf(f11), cookie);
                if (b10 != null) {
                    a.C0318a.f23099a.f23098a.put(Integer.valueOf(i10), Integer.valueOf(b10.c));
                    return c(b10.f21376b, b10.f21375a, i10);
                }
                cookie.a();
                return null;
            }
            ReaderPDFCore.d b11 = cVar.b(Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Float.valueOf(f10), Float.valueOf(f11), cookie);
            if (b11 != null) {
                a.C0318a.f23099a.f23098a.put(Integer.valueOf(i10), Integer.valueOf(b11.c));
                return c(b11.f21376b, b11.f21375a, i10);
            }
            cookie.a();
            return null;
        } else {
            cookie.a();
            throw new IllegalStateException("do not run in main thread");
        }
    }

    public final b c(Bitmap bitmap, int i10, int i11) {
        File file;
        Bitmap createBitmap;
        if (bitmap == null || this.f23112d.get()) {
            return null;
        }
        int height = bitmap.getHeight();
        if (i10 != 101 && i10 != 100) {
            int i12 = f23109g;
            int byteCount = bitmap.getByteCount();
            if (i12 > byteCount) {
                return new b(bitmap, null, height, i10);
            }
            if (this.f23114f == null) {
                this.f23114f = new Matrix();
            }
            float f10 = (i12 * 1.0f) / byteCount;
            this.f23114f.setScale(f10, f10);
            Bitmap createBitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), this.f23114f, true);
            if (createBitmap2 != bitmap && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
            createBitmap2.getByteCount();
            return new b(createBitmap2, null, height, i10);
        }
        Point parentSize = PageView.getParentSize();
        if (parentSize == null) {
            parentSize = new Point(1920, 1080);
        }
        int i13 = parentSize.x * parentSize.y * 2;
        int height2 = bitmap.getHeight() * bitmap.getWidth();
        if (height2 > i13) {
            if (this.f23113e == null) {
                File file2 = new File(a.C0300a.f22499a.f22497a.getCacheDir(), "reflow_" + UUID.randomUUID().toString());
                if (!file2.exists()) {
                    file2.mkdir();
                }
                this.f23113e = file2;
            }
            if (this.f23114f == null) {
                this.f23114f = new Matrix();
            }
            File file3 = this.f23113e;
            if (file3.exists()) {
                try {
                    File file4 = new File(file3, i11 + ".jpeg");
                    File file5 = new File(file3, i11 + ".temp");
                    if (file5.exists()) {
                        file5.delete();
                        file5.createNewFile();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file5);
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    if (file4.exists()) {
                        file4.delete();
                    }
                    file5.renameTo(file4);
                    file5.delete();
                    file = file4;
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                float f11 = (i13 * 1.0f) / height2;
                this.f23114f.setScale(f11, f11);
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), this.f23114f, true);
                if (createBitmap != bitmap && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
                if (file == null && file.exists()) {
                    try {
                        return new b(createBitmap, BitmapRegionDecoder.newInstance(file.getAbsolutePath(), false), height, i10);
                    } catch (IOException unused) {
                        return new b(createBitmap, null, height, i10);
                    }
                }
                return new b(createBitmap, null, height, i10);
            }
            file = null;
            float f112 = (i13 * 1.0f) / height2;
            this.f23114f.setScale(f112, f112);
            createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), this.f23114f, true);
            if (createBitmap != bitmap) {
                bitmap.recycle();
            }
            if (file == null) {
            }
            return new b(createBitmap, null, height, i10);
        }
        return new b(bitmap, null, height, i10);
    }
}
