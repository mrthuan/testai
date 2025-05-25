package lib.zj.office.fc.pdf;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import lib.zj.office.fc.openxml4j.opc.ContentTypes;

/* loaded from: classes3.dex */
public class PDFLib {

    /* renamed from: lib  reason: collision with root package name */
    private static PDFLib f20679lib = new PDFLib();
    public float pageHeight;
    public float pageWidth;
    private int currentPageIndex = -1;
    private int pageCount = -1;
    private boolean isDrawPDFFinished = true;

    private static native boolean authenticatePassword(String str);

    private static native int convertFile(String str, String str2, int i10, int i11);

    private static native int convertPicture2PNG(String str, String str2, String str3);

    private static native void destroy();

    private static native void drawPage(Bitmap bitmap, float f10, float f11, int i10, int i11, int i12, int i13);

    private static native int getHyperlinkCount(int i10, float f10, float f11);

    private static native PDFHyperlinkInfo[] getHyperlinkInfo(int i10);

    private static native PDFOutlineItem[] getOutline();

    public static PDFLib getPDFLib() {
        return f20679lib;
    }

    private static native int getPageCount();

    private static native float getPageHeight();

    private static native float getPageWidth();

    private static native Rect[] getPagesSize();

    private static native boolean hasOutline();

    private static native boolean hasPassword();

    private static native int openFile(String str);

    private static native RectF[] searchContent(String str);

    private static native int setStopFlag(int i10);

    private static native void showPage(int i10);

    private void showPageSync(int i10) {
        if (this.pageCount == -1) {
            this.pageCount = getPageCount();
        }
        int i11 = this.pageCount;
        if (i10 > i11 - 1) {
            i10 = i11 - 1;
        } else if (i10 < 0) {
            i10 = 0;
        }
        if (this.currentPageIndex == i10) {
            return;
        }
        this.currentPageIndex = i10;
        showPage(i10);
        this.pageWidth = getPageWidth();
        this.pageHeight = getPageHeight();
    }

    public synchronized boolean authenticatePasswordSync(String str) {
        return authenticatePassword(str);
    }

    public boolean convertToPNG(String str, String str2, String str3) {
        if ((!ContentTypes.EXTENSION_PNG.equalsIgnoreCase(str3) && !ContentTypes.EXTENSION_JPG_2.equalsIgnoreCase(str3)) || convertPicture2PNG(str, str2, str3.toLowerCase()) == 0) {
            return false;
        }
        return true;
    }

    public synchronized void dispose() {
    }

    public synchronized void drawPageSync(Bitmap bitmap, int i10, float f10, float f11, int i11, int i12, int i13, int i14, int i15) {
        this.isDrawPDFFinished = false;
        showPageSync(i10);
        drawPage(bitmap, f10, f11, i11, i12, i13, i14);
        this.isDrawPDFFinished = true;
    }

    public Rect[] getAllPagesSize() {
        return getPagesSize();
    }

    public synchronized int getHyperlinkCountSync(int i10, float f10, float f11) {
        return getHyperlinkCount(i10, f10, f11);
    }

    public synchronized PDFHyperlinkInfo[] getHyperlinkInfoSync(int i10) {
        return getHyperlinkInfo(i10);
    }

    public synchronized PDFOutlineItem[] getOutlineSync() {
        return getOutline();
    }

    public int getPageCountSync() {
        if (this.pageCount < 0) {
            this.pageCount = getPageCount();
        }
        return this.pageCount;
    }

    public synchronized boolean hasOutlineSync() {
        return hasOutline();
    }

    public synchronized boolean hasPasswordSync() {
        return hasPassword();
    }

    public boolean isDrawPageSyncFinished() {
        return this.isDrawPDFFinished;
    }

    public synchronized void openFileSync(String str) {
        if (openFile(str) > 0) {
            this.pageCount = -1;
            this.currentPageIndex = -1;
        } else {
            throw new Exception("Format error");
        }
    }

    public synchronized RectF[] searchContentSync(int i10, String str) {
        showPageSync(i10);
        return searchContent(str);
    }

    public void setStopFlagSync(int i10) {
        setStopFlag(i10);
    }

    public int wmf2Jpg(String str, String str2, int i10, int i11) {
        return convertFile(str, str2, i10, i11);
    }
}
