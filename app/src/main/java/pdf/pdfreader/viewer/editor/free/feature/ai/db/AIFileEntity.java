package pdf.pdfreader.viewer.editor.free.feature.ai.db;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class AIFileEntity implements Serializable {
    private boolean extendedBooleanFieldsOne;
    private boolean extendedBooleanFieldsThree;
    private boolean extendedBooleanFieldsTwo;
    private String extendedFieldsOne;
    private String extendedFieldsThree;
    private String extendedFieldsTwo;
    private int extendedIntFieldsOne;
    private int extendedIntFieldsThree;
    private int extendedIntFieldsTwo;
    private String fileName;
    private String filePath;
    private long fileSize;
    private int fileType;
    private int fileUploadState;
    private String remoteFilePath;
    private String tempPdfPath;
    private long uploadTime;

    /* renamed from: id  reason: collision with root package name */
    private long f24347id = 0;
    private int canShowHistory = 0;

    public int getCanShowHistory() {
        return this.canShowHistory;
    }

    public String getExtendedFieldsOne() {
        return this.extendedFieldsOne;
    }

    public String getExtendedFieldsThree() {
        return this.extendedFieldsThree;
    }

    public String getExtendedFieldsTwo() {
        return this.extendedFieldsTwo;
    }

    public int getExtendedIntFieldsOne() {
        return this.extendedIntFieldsOne;
    }

    public int getExtendedIntFieldsThree() {
        return this.extendedIntFieldsThree;
    }

    public int getExtendedIntFieldsTwo() {
        return this.extendedIntFieldsTwo;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public int getFileType() {
        return this.fileType;
    }

    public int getFileUploadState() {
        return this.fileUploadState;
    }

    public long getId() {
        return this.f24347id;
    }

    public String getRemoteFilePath() {
        return this.remoteFilePath;
    }

    public String getTempPdfPath() {
        return this.tempPdfPath;
    }

    public long getUploadTime() {
        return this.uploadTime;
    }

    public boolean isExtendedBooleanFieldsOne() {
        return this.extendedBooleanFieldsOne;
    }

    public boolean isExtendedBooleanFieldsThree() {
        return this.extendedBooleanFieldsThree;
    }

    public boolean isExtendedBooleanFieldsTwo() {
        return this.extendedBooleanFieldsTwo;
    }

    public void setCanShowHistory(int i10) {
        this.canShowHistory = i10;
    }

    public void setExtendedBooleanFieldsOne(boolean z10) {
        this.extendedBooleanFieldsOne = z10;
    }

    public void setExtendedBooleanFieldsThree(boolean z10) {
        this.extendedBooleanFieldsThree = z10;
    }

    public void setExtendedBooleanFieldsTwo(boolean z10) {
        this.extendedBooleanFieldsTwo = z10;
    }

    public void setExtendedFieldsOne(String str) {
        this.extendedFieldsOne = str;
    }

    public void setExtendedFieldsThree(String str) {
        this.extendedFieldsThree = str;
    }

    public void setExtendedFieldsTwo(String str) {
        this.extendedFieldsTwo = str;
    }

    public void setExtendedIntFieldsOne(int i10) {
        this.extendedIntFieldsOne = i10;
    }

    public void setExtendedIntFieldsThree(int i10) {
        this.extendedIntFieldsThree = i10;
    }

    public void setExtendedIntFieldsTwo(int i10) {
        this.extendedIntFieldsTwo = i10;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public void setFileSize(long j10) {
        this.fileSize = j10;
    }

    public void setFileType(int i10) {
        this.fileType = i10;
    }

    public void setFileUploadState(int i10) {
        this.fileUploadState = i10;
    }

    public void setId(long j10) {
        this.f24347id = j10;
    }

    public void setRemoteFilePath(String str) {
        this.remoteFilePath = str;
    }

    public void setTempPdfPath(String str) {
        this.tempPdfPath = str;
    }

    public void setUploadTime(long j10) {
        this.uploadTime = j10;
    }
}
