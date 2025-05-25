package androidx.window.layout;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.HardwareFoldingFeature;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SidecarAdapter.kt */
/* loaded from: classes.dex */
public final class SidecarAdapter {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SidecarAdapter";

    /* compiled from: SidecarAdapter.kt */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.d dVar) {
            this();
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final int getRawSidecarDevicePosture(SidecarDeviceState sidecarDeviceState) {
            kotlin.jvm.internal.g.e(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                try {
                    Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                    if (invoke != null) {
                        return ((Integer) invoke).intValue();
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        public final int getSidecarDevicePosture$window_release(SidecarDeviceState sidecarDeviceState) {
            kotlin.jvm.internal.g.e(sidecarDeviceState, "sidecarDeviceState");
            int rawSidecarDevicePosture = getRawSidecarDevicePosture(sidecarDeviceState);
            if (rawSidecarDevicePosture < 0 || rawSidecarDevicePosture > 4) {
                return 0;
            }
            return rawSidecarDevicePosture;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final List<SidecarDisplayFeature> getSidecarDisplayFeatures(SidecarWindowLayoutInfo info) {
            kotlin.jvm.internal.g.e(info, "info");
            try {
                try {
                    List<SidecarDisplayFeature> list = info.displayFeatures;
                    if (list == null) {
                        return ge.a.v();
                    }
                    return list;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    return ge.a.v();
                }
            } catch (NoSuchFieldError unused2) {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(info, new Object[0]);
                if (invoke != null) {
                    return (List) invoke;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
            }
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void setSidecarDevicePosture(SidecarDeviceState sidecarDeviceState, int i10) {
            kotlin.jvm.internal.g.e(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i10;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } catch (NoSuchFieldError unused2) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i10));
            }
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void setSidecarDisplayFeatures(SidecarWindowLayoutInfo info, List<SidecarDisplayFeature> displayFeatures) {
            kotlin.jvm.internal.g.e(info, "info");
            kotlin.jvm.internal.g.e(displayFeatures, "displayFeatures");
            try {
                try {
                    info.displayFeatures = displayFeatures;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } catch (NoSuchFieldError unused2) {
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(info, displayFeatures);
            }
        }

        public final DisplayFeature translate$window_release(SidecarDisplayFeature feature, SidecarDeviceState deviceState) {
            HardwareFoldingFeature.Type fold;
            FoldingFeature.State state;
            kotlin.jvm.internal.g.e(feature, "feature");
            kotlin.jvm.internal.g.e(deviceState, "deviceState");
            Rect rect = feature.getRect();
            kotlin.jvm.internal.g.d(rect, "feature.rect");
            if (rect.width() == 0 && rect.height() == 0) {
                return null;
            }
            if (feature.getType() == 1 && rect.width() != 0 && rect.height() != 0) {
                return null;
            }
            if ((feature.getType() == 2 || feature.getType() == 1) && rect.left != 0 && rect.top != 0) {
                return null;
            }
            int type = feature.getType();
            if (type != 1) {
                if (type != 2) {
                    return null;
                }
                fold = HardwareFoldingFeature.Type.Companion.getHINGE();
            } else {
                fold = HardwareFoldingFeature.Type.Companion.getFOLD();
            }
            int sidecarDevicePosture$window_release = getSidecarDevicePosture$window_release(deviceState);
            if (sidecarDevicePosture$window_release != 0 && sidecarDevicePosture$window_release != 1) {
                if (sidecarDevicePosture$window_release != 2) {
                    if (sidecarDevicePosture$window_release != 3) {
                        if (sidecarDevicePosture$window_release != 4) {
                            state = FoldingFeature.State.FLAT;
                        }
                    } else {
                        state = FoldingFeature.State.FLAT;
                    }
                } else {
                    state = FoldingFeature.State.HALF_OPENED;
                }
                Rect rect2 = feature.getRect();
                kotlin.jvm.internal.g.d(rect2, "feature.rect");
                return new HardwareFoldingFeature(new Bounds(rect2), fold, state);
            }
            return null;
        }
    }

    private final boolean isEqualSidecarDisplayFeature(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (kotlin.jvm.internal.g.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return kotlin.jvm.internal.g.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    private final boolean isEqualSidecarDisplayFeatures(List<SidecarDisplayFeature> list, List<SidecarDisplayFeature> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (!isEqualSidecarDisplayFeature(list.get(i10), list2.get(i10))) {
                    return false;
                }
                if (i11 > size) {
                    break;
                }
                i10 = i11;
            }
        }
        return true;
    }

    public final boolean isEqualSidecarDeviceState(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (kotlin.jvm.internal.g.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        Companion companion = Companion;
        if (companion.getSidecarDevicePosture$window_release(sidecarDeviceState) == companion.getSidecarDevicePosture$window_release(sidecarDeviceState2)) {
            return true;
        }
        return false;
    }

    public final boolean isEqualSidecarWindowLayoutInfo(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (kotlin.jvm.internal.g.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        Companion companion = Companion;
        return isEqualSidecarDisplayFeatures(companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo), companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo2));
    }

    public final List<DisplayFeature> translate(List<SidecarDisplayFeature> sidecarDisplayFeatures, SidecarDeviceState deviceState) {
        kotlin.jvm.internal.g.e(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        kotlin.jvm.internal.g.e(deviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        for (SidecarDisplayFeature sidecarDisplayFeature : sidecarDisplayFeatures) {
            DisplayFeature translate$window_release = Companion.translate$window_release(sidecarDisplayFeature, deviceState);
            if (translate$window_release != null) {
                arrayList.add(translate$window_release);
            }
        }
        return arrayList;
    }

    public final WindowLayoutInfo translate(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState state) {
        kotlin.jvm.internal.g.e(state, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new WindowLayoutInfo(ge.a.v());
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        Companion companion = Companion;
        companion.setSidecarDevicePosture(sidecarDeviceState, companion.getSidecarDevicePosture$window_release(state));
        return new WindowLayoutInfo(translate(companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo), sidecarDeviceState));
    }
}
