package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import java.io.Serializable;

/* compiled from: BaseAISubscriptionActivity.kt */
/* loaded from: classes3.dex */
public final class AIJumpTarget implements Serializable {
    private final AIChooseFileParams aiChooseFileParams;
    private final AIChatPageParams chatPageParams;
    private final Class<?> target;

    public AIJumpTarget(Class<?> cls, AIChatPageParams aIChatPageParams, AIChooseFileParams aIChooseFileParams) {
        kotlin.jvm.internal.g.e(cls, ea.a.p("R2E5ZxZ0", "QeHzNSzR"));
        this.target = cls;
        this.chatPageParams = aIChatPageParams;
        this.aiChooseFileParams = aIChooseFileParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AIJumpTarget copy$default(AIJumpTarget aIJumpTarget, Class cls, AIChatPageParams aIChatPageParams, AIChooseFileParams aIChooseFileParams, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cls = aIJumpTarget.target;
        }
        if ((i10 & 2) != 0) {
            aIChatPageParams = aIJumpTarget.chatPageParams;
        }
        if ((i10 & 4) != 0) {
            aIChooseFileParams = aIJumpTarget.aiChooseFileParams;
        }
        return aIJumpTarget.copy(cls, aIChatPageParams, aIChooseFileParams);
    }

    public final Class<?> component1() {
        return this.target;
    }

    public final AIChatPageParams component2() {
        return this.chatPageParams;
    }

    public final AIChooseFileParams component3() {
        return this.aiChooseFileParams;
    }

    public final AIJumpTarget copy(Class<?> target, AIChatPageParams aIChatPageParams, AIChooseFileParams aIChooseFileParams) {
        kotlin.jvm.internal.g.e(target, "target");
        return new AIJumpTarget(target, aIChatPageParams, aIChooseFileParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIJumpTarget)) {
            return false;
        }
        AIJumpTarget aIJumpTarget = (AIJumpTarget) obj;
        if (kotlin.jvm.internal.g.a(this.target, aIJumpTarget.target) && kotlin.jvm.internal.g.a(this.chatPageParams, aIJumpTarget.chatPageParams) && kotlin.jvm.internal.g.a(this.aiChooseFileParams, aIJumpTarget.aiChooseFileParams)) {
            return true;
        }
        return false;
    }

    public final AIChooseFileParams getAiChooseFileParams() {
        return this.aiChooseFileParams;
    }

    public final AIChatPageParams getChatPageParams() {
        return this.chatPageParams;
    }

    public final Class<?> getTarget() {
        return this.target;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.target.hashCode() * 31;
        AIChatPageParams aIChatPageParams = this.chatPageParams;
        int i10 = 0;
        if (aIChatPageParams == null) {
            hashCode = 0;
        } else {
            hashCode = aIChatPageParams.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        AIChooseFileParams aIChooseFileParams = this.aiChooseFileParams;
        if (aIChooseFileParams != null) {
            i10 = aIChooseFileParams.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        Class<?> cls = this.target;
        AIChatPageParams aIChatPageParams = this.chatPageParams;
        AIChooseFileParams aIChooseFileParams = this.aiChooseFileParams;
        return "AIJumpTarget(target=" + cls + ", chatPageParams=" + aIChatPageParams + ", aiChooseFileParams=" + aIChooseFileParams + ")";
    }

    public /* synthetic */ AIJumpTarget(Class cls, AIChatPageParams aIChatPageParams, AIChooseFileParams aIChooseFileParams, int i10, kotlin.jvm.internal.d dVar) {
        this(cls, (i10 & 2) != 0 ? null : aIChatPageParams, (i10 & 4) != 0 ? null : aIChooseFileParams);
    }
}
