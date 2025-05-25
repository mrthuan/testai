package pdf.pdfreader.viewer.editor.free.feature.ai.db;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class AIAnswerContent implements Serializable {
    private long chatId;
    private String content;
    private int endIndex;
    private boolean extendedBooleanFieldsOne;
    private boolean extendedBooleanFieldsThree;
    private boolean extendedBooleanFieldsTwo;
    private String extendedFieldsOne;
    private String extendedFieldsThree;
    private String extendedFieldsTwo;
    private int extendedIntFieldsOne;
    private int extendedIntFieldsThree;
    private int extendedIntFieldsTwo;
    private long fileId;

    /* renamed from: id  reason: collision with root package name */
    private long f24341id = 0;
    private int imgHeight;
    private int imgWidth;
    private boolean isLock;
    private CharSequence spanStr;
    private int type;

    public AIAnswerContent(long j10, long j11, String str, int i10, int i11, int i12) {
        this.chatId = j10;
        this.fileId = j11;
        this.content = str;
        this.imgWidth = i10;
        this.imgHeight = i11;
        this.type = i12;
    }

    public long getChatId() {
        return this.chatId;
    }

    public String getContent() {
        return this.content;
    }

    public int getEndIndex() {
        return this.endIndex;
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

    public long getFileId() {
        return this.fileId;
    }

    public long getId() {
        return this.f24341id;
    }

    public int getImgHeight() {
        return this.imgHeight;
    }

    public int getImgWidth() {
        return this.imgWidth;
    }

    public CharSequence getSpanStr() {
        return this.spanStr;
    }

    public int getType() {
        return this.type;
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

    public boolean isLock() {
        return this.isLock;
    }

    public void setChatId(long j10) {
        this.chatId = j10;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setEndIndex(int i10) {
        this.endIndex = i10;
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

    public void setFileId(long j10) {
        this.fileId = j10;
    }

    public void setId(long j10) {
        this.f24341id = j10;
    }

    public void setImgHeight(int i10) {
        this.imgHeight = i10;
    }

    public void setImgWidth(int i10) {
        this.imgWidth = i10;
    }

    public void setLock(boolean z10) {
        this.isLock = z10;
    }

    public void setSpanStr(CharSequence charSequence) {
        this.spanStr = charSequence;
    }

    public void setType(int i10) {
        this.type = i10;
    }
}
