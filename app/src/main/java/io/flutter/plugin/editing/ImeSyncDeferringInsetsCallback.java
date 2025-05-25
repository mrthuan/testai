package io.flutter.plugin.editing;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import androidx.annotation.Keep;
import java.util.List;

@Keep
@SuppressLint({"NewApi", "Override"})
@TargetApi(30)
/* loaded from: classes.dex */
class ImeSyncDeferringInsetsCallback {
    private int deferredInsetTypes;
    private WindowInsets lastWindowInsets;
    private int overlayInsetTypes;
    private View view;
    private boolean animating = false;
    private boolean needsSave = false;
    private AnimationCallback animationCallback = new AnimationCallback();
    private a insetsListener = new a();

    @Keep
    /* loaded from: classes.dex */
    public class AnimationCallback extends WindowInsetsAnimation$Callback {
        public AnimationCallback() {
            super(1);
        }

        public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
            int typeMask;
            if (ImeSyncDeferringInsetsCallback.this.animating) {
                typeMask = windowInsetsAnimation.getTypeMask();
                if ((typeMask & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                    ImeSyncDeferringInsetsCallback.this.animating = false;
                    if (ImeSyncDeferringInsetsCallback.this.lastWindowInsets != null && ImeSyncDeferringInsetsCallback.this.view != null) {
                        ImeSyncDeferringInsetsCallback.this.view.dispatchApplyWindowInsets(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                    }
                }
            }
        }

        public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
            int typeMask;
            typeMask = windowInsetsAnimation.getTypeMask();
            if ((typeMask & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                ImeSyncDeferringInsetsCallback.this.animating = true;
                ImeSyncDeferringInsetsCallback.this.needsSave = true;
            }
        }

        public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
            Insets insets;
            int i10;
            Insets insets2;
            int i11;
            Insets of2;
            WindowInsets build;
            int typeMask;
            if (ImeSyncDeferringInsetsCallback.this.animating && !ImeSyncDeferringInsetsCallback.this.needsSave) {
                boolean z10 = false;
                for (WindowInsetsAnimation windowInsetsAnimation : list) {
                    typeMask = androidx.window.layout.d.d(windowInsetsAnimation).getTypeMask();
                    if ((typeMask & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                        z10 = true;
                    }
                }
                if (!z10) {
                    return windowInsets;
                }
                a4.g.f();
                WindowInsets.Builder f10 = a4.f.f(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                insets = windowInsets.getInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes);
                i10 = insets.bottom;
                insets2 = windowInsets.getInsets(ImeSyncDeferringInsetsCallback.this.overlayInsetTypes);
                i11 = insets2.bottom;
                of2 = Insets.of(0, 0, 0, Math.max(i10 - i11, 0));
                f10.setInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes, of2);
                View view = ImeSyncDeferringInsetsCallback.this.view;
                build = f10.build();
                view.onApplyWindowInsets(build);
            }
            return windowInsets;
        }
    }

    /* loaded from: classes.dex */
    public class a implements View.OnApplyWindowInsetsListener {
        public a() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            WindowInsets windowInsets2;
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = ImeSyncDeferringInsetsCallback.this;
            imeSyncDeferringInsetsCallback.view = view;
            if (imeSyncDeferringInsetsCallback.needsSave) {
                imeSyncDeferringInsetsCallback.lastWindowInsets = windowInsets;
                imeSyncDeferringInsetsCallback.needsSave = false;
            }
            if (imeSyncDeferringInsetsCallback.animating) {
                windowInsets2 = WindowInsets.CONSUMED;
                return windowInsets2;
            }
            return view.onApplyWindowInsets(windowInsets);
        }
    }

    public ImeSyncDeferringInsetsCallback(View view, int i10, int i11) {
        this.overlayInsetTypes = i10;
        this.deferredInsetTypes = i11;
        this.view = view;
    }

    public WindowInsetsAnimation$Callback getAnimationCallback() {
        return this.animationCallback;
    }

    public View.OnApplyWindowInsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    public void install() {
        this.view.setWindowInsetsAnimationCallback(this.animationCallback);
        this.view.setOnApplyWindowInsetsListener(this.insetsListener);
    }

    public void remove() {
        this.view.setWindowInsetsAnimationCallback(null);
        this.view.setOnApplyWindowInsetsListener(null);
    }
}
