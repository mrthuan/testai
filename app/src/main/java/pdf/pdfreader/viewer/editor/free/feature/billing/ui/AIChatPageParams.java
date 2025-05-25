package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import java.io.Serializable;
import pdf.pdfreader.viewer.editor.free.feature.ai.data.AIQuickTag;

/* compiled from: BaseAISubscriptionActivity.kt */
/* loaded from: classes3.dex */
public final class AIChatPageParams implements Serializable {
    private final AIQuickTag aiQuickTag;
    private final String filePath;
    private final int fileType;
    private final int fromSource;

    public AIChatPageParams(AIQuickTag aIQuickTag, String str, int i10, int i11) {
        kotlin.jvm.internal.g.e(str, ea.a.p("UWleZR1hJGg=", "WT72MPB4"));
        this.aiQuickTag = aIQuickTag;
        this.filePath = str;
        this.fileType = i10;
        this.fromSource = i11;
    }

    public static /* synthetic */ AIChatPageParams copy$default(AIChatPageParams aIChatPageParams, AIQuickTag aIQuickTag, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            aIQuickTag = aIChatPageParams.aiQuickTag;
        }
        if ((i12 & 2) != 0) {
            str = aIChatPageParams.filePath;
        }
        if ((i12 & 4) != 0) {
            i10 = aIChatPageParams.fileType;
        }
        if ((i12 & 8) != 0) {
            i11 = aIChatPageParams.fromSource;
        }
        return aIChatPageParams.copy(aIQuickTag, str, i10, i11);
    }

    public final AIQuickTag component1() {
        return this.aiQuickTag;
    }

    public final String component2() {
        return this.filePath;
    }

    public final int component3() {
        return this.fileType;
    }

    public final int component4() {
        return this.fromSource;
    }

    public final AIChatPageParams copy(AIQuickTag aIQuickTag, String filePath, int i10, int i11) {
        kotlin.jvm.internal.g.e(filePath, "filePath");
        return new AIChatPageParams(aIQuickTag, filePath, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChatPageParams)) {
            return false;
        }
        AIChatPageParams aIChatPageParams = (AIChatPageParams) obj;
        if (kotlin.jvm.internal.g.a(this.aiQuickTag, aIChatPageParams.aiQuickTag) && kotlin.jvm.internal.g.a(this.filePath, aIChatPageParams.filePath) && this.fileType == aIChatPageParams.fileType && this.fromSource == aIChatPageParams.fromSource) {
            return true;
        }
        return false;
    }

    public final AIQuickTag getAiQuickTag() {
        return this.aiQuickTag;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final int getFileType() {
        return this.fileType;
    }

    public final int getFromSource() {
        return this.fromSource;
    }

    public int hashCode() {
        int hashCode;
        AIQuickTag aIQuickTag = this.aiQuickTag;
        if (aIQuickTag == null) {
            hashCode = 0;
        } else {
            hashCode = aIQuickTag.hashCode();
        }
        return ((androidx.activity.f.h(this.filePath, hashCode * 31, 31) + this.fileType) * 31) + this.fromSource;
    }

    public String toString() {
        AIQuickTag aIQuickTag = this.aiQuickTag;
        String str = this.filePath;
        int i10 = this.fileType;
        int i11 = this.fromSource;
        return "AIChatPageParams(aiQuickTag=" + aIQuickTag + ", filePath=" + str + ", fileType=" + i10 + ", fromSource=" + i11 + ")";
    }
}
