package lib.zj.pdfeditor.text;

import android.graphics.RectF;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class AdjustActionInfo implements Serializable {
    private final AdjustAction action;
    private final long copyRootParentId;

    /* renamed from: id  reason: collision with root package name */
    private final long f21604id;
    public float initX;
    public float initY;
    private final RectF location;
    private final long parentId;
    private final int textColor;
    private final String textContent;
    private final int textSize;
    private final String textWithNewLine;

    public AdjustActionInfo(long j10, AdjustAction adjustAction, String str, String str2, int i10, int i11, RectF rectF, long j11) {
        this.initX = -1.0f;
        this.initY = -1.0f;
        this.f21604id = j10;
        this.parentId = -1L;
        this.action = adjustAction;
        this.textContent = str;
        this.textWithNewLine = str2;
        this.textSize = i10;
        this.textColor = i11;
        this.location = rectF;
        this.copyRootParentId = j11;
    }

    public AdjustAction getAction() {
        return this.action;
    }

    public long getCopyRootParentId() {
        return this.copyRootParentId;
    }

    public long getId() {
        return this.f21604id;
    }

    public RectF getLocation() {
        return this.location;
    }

    public long getParentId() {
        return this.parentId;
    }

    public int getTextColor() {
        return this.textColor;
    }

    public String getTextContent() {
        return this.textContent;
    }

    public int getTextSize() {
        return this.textSize;
    }

    public String getTextWithNewLine() {
        return this.textWithNewLine;
    }

    public String toString() {
        return "AdjustActionInfo{id=" + this.f21604id + ", parentId=" + this.parentId + ", action=" + this.action + ", textContent='" + this.textContent + "', textWithNewLine='" + this.textWithNewLine + "', textSize=" + this.textSize + ", textColor=" + this.textColor + ", location=" + this.location + ", initX=" + this.initX + ", initY=" + this.initY + '}';
    }

    public AdjustActionInfo(long j10, long j11, String str, String str2, int i10, int i11, RectF rectF, long j12) {
        this.initX = -1.0f;
        this.initY = -1.0f;
        this.f21604id = j10;
        this.parentId = j11;
        this.action = AdjustAction.Copy;
        this.textContent = str;
        this.textWithNewLine = str2;
        this.textSize = i10;
        this.textColor = i11;
        this.location = rectF;
        this.copyRootParentId = j12;
    }
}
