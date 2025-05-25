package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import java.io.Serializable;
import pdf.pdfreader.viewer.editor.free.feature.ai.data.AIQuickTag;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType;

/* compiled from: BaseAISubscriptionActivity.kt */
/* loaded from: classes3.dex */
public final class AIChooseFileParams implements Serializable {
    private final AIQuickTag aiQuickTag;
    private final int aiType;
    private final ToolsType toolsType;

    public AIChooseFileParams(ToolsType toolsType, int i10, AIQuickTag aIQuickTag) {
        kotlin.jvm.internal.g.e(toolsType, ea.a.p("BG87bD9UCXBl", "oVpTLpC7"));
        this.toolsType = toolsType;
        this.aiType = i10;
        this.aiQuickTag = aIQuickTag;
    }

    public static /* synthetic */ AIChooseFileParams copy$default(AIChooseFileParams aIChooseFileParams, ToolsType toolsType, int i10, AIQuickTag aIQuickTag, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            toolsType = aIChooseFileParams.toolsType;
        }
        if ((i11 & 2) != 0) {
            i10 = aIChooseFileParams.aiType;
        }
        if ((i11 & 4) != 0) {
            aIQuickTag = aIChooseFileParams.aiQuickTag;
        }
        return aIChooseFileParams.copy(toolsType, i10, aIQuickTag);
    }

    public final ToolsType component1() {
        return this.toolsType;
    }

    public final int component2() {
        return this.aiType;
    }

    public final AIQuickTag component3() {
        return this.aiQuickTag;
    }

    public final AIChooseFileParams copy(ToolsType toolsType, int i10, AIQuickTag aIQuickTag) {
        kotlin.jvm.internal.g.e(toolsType, "toolsType");
        return new AIChooseFileParams(toolsType, i10, aIQuickTag);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChooseFileParams)) {
            return false;
        }
        AIChooseFileParams aIChooseFileParams = (AIChooseFileParams) obj;
        if (this.toolsType == aIChooseFileParams.toolsType && this.aiType == aIChooseFileParams.aiType && kotlin.jvm.internal.g.a(this.aiQuickTag, aIChooseFileParams.aiQuickTag)) {
            return true;
        }
        return false;
    }

    public final AIQuickTag getAiQuickTag() {
        return this.aiQuickTag;
    }

    public final int getAiType() {
        return this.aiType;
    }

    public final ToolsType getToolsType() {
        return this.toolsType;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.toolsType.hashCode() * 31) + this.aiType) * 31;
        AIQuickTag aIQuickTag = this.aiQuickTag;
        if (aIQuickTag == null) {
            hashCode = 0;
        } else {
            hashCode = aIQuickTag.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        ToolsType toolsType = this.toolsType;
        int i10 = this.aiType;
        AIQuickTag aIQuickTag = this.aiQuickTag;
        return "AIChooseFileParams(toolsType=" + toolsType + ", aiType=" + i10 + ", aiQuickTag=" + aIQuickTag + ")";
    }
}
