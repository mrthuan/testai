package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.Set;
import kotlin.jvm.internal.g;

/* compiled from: EmbeddingCompat.kt */
@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class EmbeddingCompat implements EmbeddingInterfaceCompat {
    public static final Companion Companion = new Companion(null);
    public static final boolean DEBUG = true;
    private static final String TAG = "EmbeddingCompat";
    private final EmbeddingAdapter adapter;
    private final ActivityEmbeddingComponent embeddingExtension;

    /* compiled from: EmbeddingCompat.kt */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.d dVar) {
            this();
        }

        public final ActivityEmbeddingComponent embeddingComponent() {
            if (isEmbeddingAvailable()) {
                ActivityEmbeddingComponent activityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
                if (activityEmbeddingComponent == null) {
                    return new EmptyEmbeddingComponent();
                }
                return activityEmbeddingComponent;
            }
            return new EmptyEmbeddingComponent();
        }

        public final Integer getExtensionApiLevel() {
            try {
                return Integer.valueOf(WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel());
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        public final boolean isEmbeddingAvailable() {
            try {
                if (WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() == null) {
                    return false;
                }
                return true;
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return false;
            }
        }
    }

    public EmbeddingCompat(ActivityEmbeddingComponent embeddingExtension, EmbeddingAdapter adapter) {
        g.e(embeddingExtension, "embeddingExtension");
        g.e(adapter, "adapter");
        this.embeddingExtension = embeddingExtension;
        this.adapter = adapter;
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void setEmbeddingCallback(EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallback) {
        g.e(embeddingCallback, "embeddingCallback");
        this.embeddingExtension.setSplitInfoCallback(new EmbeddingTranslatingCallback(embeddingCallback, this.adapter));
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void setSplitRules(Set<? extends EmbeddingRule> rules) {
        g.e(rules, "rules");
        this.embeddingExtension.setEmbeddingRules(this.adapter.translate(rules));
    }

    public EmbeddingCompat() {
        this(Companion.embeddingComponent(), new EmbeddingAdapter());
    }
}
