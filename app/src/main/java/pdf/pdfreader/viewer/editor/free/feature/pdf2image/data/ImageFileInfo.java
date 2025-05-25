package pdf.pdfreader.viewer.editor.free.feature.pdf2image.data;

import java.io.Serializable;

/* compiled from: ImageFileInfo.kt */
/* loaded from: classes3.dex */
public final class ImageFileInfo implements Serializable {
    private String fileName;
    private String filePath;
    private long fileSize;
    private int imgHeight;
    private int imgWidth;
    private long lastModified;
    private int pageIndex;
    private float scale;

    public final String getFileName() {
        return this.fileName;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final int getImgHeight() {
        return this.imgHeight;
    }

    public final int getImgWidth() {
        return this.imgWidth;
    }

    public final long getLastModified() {
        return this.lastModified;
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final float getScale() {
        return this.scale;
    }

    public final void setFileName(String str) {
        this.fileName = str;
    }

    public final void setFilePath(String str) {
        this.filePath = str;
    }

    public final void setFileSize(long j10) {
        this.fileSize = j10;
    }

    public final void setImgHeight(int i10) {
        this.imgHeight = i10;
    }

    public final void setImgWidth(int i10) {
        this.imgWidth = i10;
    }

    public final void setLastModified(long j10) {
        this.lastModified = j10;
    }

    public final void setPageIndex(int i10) {
        this.pageIndex = i10;
    }

    public final void setScale(float f10) {
        this.scale = f10;
    }
}
