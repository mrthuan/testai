package lib.zj.office.viewer.model;

import java.io.File;
import java.io.Serializable;
import kotlin.jvm.internal.g;

/* compiled from: FileModel.kt */
/* loaded from: classes3.dex */
public final class FileModel implements Serializable {
    public static final a Companion = new a();
    public static final int FILE_TYPE_ALL = 0;
    public static final int FILE_TYPE_EXCEL = 3;
    public static final int FILE_TYPE_NOT_SUPPORT = -1;
    public static final int FILE_TYPE_PDF = 1;
    public static final int FILE_TYPE_PPT = 4;
    public static final int FILE_TYPE_TXT = 5;
    public static final int FILE_TYPE_WORD = 2;
    private long favoriteTimestamp;
    private long fileLength;
    private String fileName = "";
    private String filePath = "";
    private int fileType;
    private boolean isSelected;
    private long modifiedTimestamp;
    private long recentOpenTimestamp;

    /* compiled from: FileModel.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    public static void setFavorite$default(FileModel fileModel, boolean z10, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = System.currentTimeMillis();
            long j11 = ge.a.f17753d;
            if (j10 > j11) {
                ge.a.f17753d = j10;
            } else {
                long j12 = j11 + 1;
                ge.a.f17753d = j12;
                j10 = j12;
            }
        }
        fileModel.setFavorite(z10, j10);
    }

    public static void setRecentOpenTime$default(FileModel fileModel, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = System.currentTimeMillis();
            long j11 = ge.a.f17753d;
            if (j10 > j11) {
                ge.a.f17753d = j10;
            } else {
                long j12 = j11 + 1;
                ge.a.f17753d = j12;
                j10 = j12;
            }
        }
        fileModel.setRecentOpenTime(j10);
    }

    public final void copyFileAttrFrom(FileModel fromFileModel) {
        g.e(fromFileModel, "fromFileModel");
        this.fileType = fromFileModel.fileType;
        this.modifiedTimestamp = fromFileModel.modifiedTimestamp;
        this.fileName = fromFileModel.fileName;
        this.filePath = fromFileModel.filePath;
        this.fileLength = fromFileModel.fileLength;
    }

    public final void copyFrom(FileModel fromFileModel) {
        g.e(fromFileModel, "fromFileModel");
        this.fileType = fromFileModel.fileType;
        this.favoriteTimestamp = fromFileModel.favoriteTimestamp;
        this.recentOpenTimestamp = fromFileModel.recentOpenTimestamp;
        this.isSelected = fromFileModel.isSelected;
        this.modifiedTimestamp = fromFileModel.modifiedTimestamp;
        this.fileName = fromFileModel.fileName;
        this.filePath = fromFileModel.filePath;
        this.fileLength = fromFileModel.fileLength;
    }

    public final FileModel copyMe() {
        FileModel fileModel = new FileModel();
        fileModel.fileType = this.fileType;
        fileModel.favoriteTimestamp = this.favoriteTimestamp;
        fileModel.recentOpenTimestamp = this.recentOpenTimestamp;
        fileModel.isSelected = this.isSelected;
        fileModel.modifiedTimestamp = this.modifiedTimestamp;
        fileModel.fileName = this.fileName;
        fileModel.filePath = this.filePath;
        fileModel.fileLength = this.fileLength;
        return fileModel;
    }

    public final long getFavoriteTimestamp() {
        return this.favoriteTimestamp;
    }

    public final long getFileLength() {
        return this.fileLength;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final int getFileType() {
        return this.fileType;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final long getRecentOpenTimestamp() {
        return this.recentOpenTimestamp;
    }

    public final boolean isFavorite() {
        if (this.favoriteTimestamp > 0) {
            return true;
        }
        return false;
    }

    public final boolean isRecentOpened() {
        if (this.recentOpenTimestamp > 0) {
            return true;
        }
        return false;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final boolean isSupported() {
        int i10 = this.fileType;
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
            return true;
        }
        return false;
    }

    public final void setFavorite(boolean z10, long j10) {
        if (!z10) {
            j10 = 0;
        }
        this.favoriteTimestamp = j10;
    }

    public final void setFavoriteTimestamp(long j10) {
        this.favoriteTimestamp = j10;
    }

    public final void setFileLength(long j10) {
        this.fileLength = j10;
    }

    public final void setFileName(String str) {
        g.e(str, "<set-?>");
        this.fileName = str;
    }

    public final void setFilePath(String str) {
        g.e(str, "<set-?>");
        this.filePath = str;
    }

    public final void setFileType(int i10) {
        this.fileType = i10;
    }

    public final void setModifiedTimestamp(long j10) {
        this.modifiedTimestamp = j10;
    }

    public final void setRecentOpenTime(long j10) {
        this.recentOpenTimestamp = j10;
    }

    public final void setRecentOpenTimestamp(long j10) {
        this.recentOpenTimestamp = j10;
    }

    public final void setSelected(boolean z10) {
        this.isSelected = z10;
    }

    public final File toFile() {
        return new File(this.filePath);
    }

    public String toString() {
        int i10 = this.fileType;
        String str = this.fileName;
        long j10 = this.favoriteTimestamp;
        long j11 = this.recentOpenTimestamp;
        boolean z10 = this.isSelected;
        long j12 = this.modifiedTimestamp;
        long j13 = this.fileLength;
        String str2 = this.filePath;
        return "fileType = " + i10 + " fileName = " + str + " favoriteTimestamp = " + j10 + " recentOpenTimestamp = " + j11 + " isSelected = " + z10 + " modifiedTimestamp = " + j12 + " fileLength = " + j13 + " filePath = " + str2;
    }
}
