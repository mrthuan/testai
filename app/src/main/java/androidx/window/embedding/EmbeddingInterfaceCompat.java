package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import java.util.Set;

/* compiled from: EmbeddingInterfaceCompat.kt */
@ExperimentalWindowApi
/* loaded from: classes.dex */
public interface EmbeddingInterfaceCompat {

    /* compiled from: EmbeddingInterfaceCompat.kt */
    /* loaded from: classes.dex */
    public interface EmbeddingCallbackInterface {
        void onSplitInfoChanged(List<SplitInfo> list);
    }

    void setEmbeddingCallback(EmbeddingCallbackInterface embeddingCallbackInterface);

    void setSplitRules(Set<? extends EmbeddingRule> set);
}
