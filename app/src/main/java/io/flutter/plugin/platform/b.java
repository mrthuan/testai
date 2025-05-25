package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import android.view.View;
import android.view.Window;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import lib.zj.office.fc.hslf.record.SlideAtom;
import x0.t0;

/* compiled from: PlatformPlugin.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f18797a;

    /* renamed from: b  reason: collision with root package name */
    public final PlatformChannel f18798b;
    public PlatformChannel.d c;

    /* renamed from: d  reason: collision with root package name */
    public int f18799d;

    /* compiled from: PlatformPlugin.java */
    /* loaded from: classes.dex */
    public class a implements PlatformChannel.c {
        public a() {
        }

        public final CharSequence a(PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
            ClipData.Item itemAt;
            Activity activity = b.this.f18797a;
            ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
            if (clipboardManager.hasPrimaryClip()) {
                try {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip == null) {
                        return null;
                    }
                    if (clipboardContentFormat != null && clipboardContentFormat != PlatformChannel.ClipboardContentFormat.PLAIN_TEXT) {
                        return null;
                    }
                    itemAt = primaryClip.getItemAt(0);
                    if (itemAt.getUri() != null) {
                        activity.getContentResolver().openTypedAssetFileDescriptor(itemAt.getUri(), "text/*", null);
                    }
                } catch (FileNotFoundException | SecurityException unused) {
                    return null;
                }
            }
            return itemAt.coerceToText(activity);
        }

        public final void b(ArrayList arrayList) {
            int i10;
            b bVar = b.this;
            bVar.getClass();
            if (arrayList.size() == 0) {
                i10 = 5894;
            } else {
                i10 = 1798;
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                int i12 = C0253b.f18802b[((PlatformChannel.SystemUiOverlay) arrayList.get(i11)).ordinal()];
                if (i12 != 1) {
                    if (i12 == 2) {
                        i10 = i10 & (-513) & (-3);
                    }
                } else {
                    i10 &= -5;
                }
            }
            bVar.f18799d = i10;
            bVar.b();
        }

        public final void c(PlatformChannel.SystemUiMode systemUiMode) {
            int i10;
            b bVar = b.this;
            bVar.getClass();
            if (systemUiMode == PlatformChannel.SystemUiMode.LEAN_BACK) {
                i10 = 1798;
            } else if (systemUiMode == PlatformChannel.SystemUiMode.IMMERSIVE) {
                i10 = 3846;
            } else if (systemUiMode == PlatformChannel.SystemUiMode.IMMERSIVE_STICKY) {
                i10 = 5894;
            } else if (systemUiMode == PlatformChannel.SystemUiMode.EDGE_TO_EDGE && Build.VERSION.SDK_INT >= 29) {
                i10 = 1792;
            } else {
                return;
            }
            bVar.f18799d = i10;
            bVar.b();
        }

        public final void d(PlatformChannel.HapticFeedbackType hapticFeedbackType) {
            View decorView = b.this.f18797a.getWindow().getDecorView();
            int i10 = C0253b.f18801a[hapticFeedbackType.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                decorView.performHapticFeedback(4);
                                return;
                            }
                            return;
                        }
                        decorView.performHapticFeedback(6);
                        return;
                    }
                    decorView.performHapticFeedback(3);
                    return;
                }
                decorView.performHapticFeedback(1);
                return;
            }
            decorView.performHapticFeedback(0);
        }
    }

    /* compiled from: PlatformPlugin.java */
    /* renamed from: io.flutter.plugin.platform.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0253b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18801a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f18802b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[PlatformChannel.Brightness.values().length];
            c = iArr;
            try {
                iArr[PlatformChannel.Brightness.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[PlatformChannel.Brightness.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[PlatformChannel.SystemUiOverlay.values().length];
            f18802b = iArr2;
            try {
                iArr2[PlatformChannel.SystemUiOverlay.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18802b[PlatformChannel.SystemUiOverlay.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[PlatformChannel.HapticFeedbackType.values().length];
            f18801a = iArr3;
            try {
                iArr3[PlatformChannel.HapticFeedbackType.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18801a[PlatformChannel.HapticFeedbackType.LIGHT_IMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18801a[PlatformChannel.HapticFeedbackType.MEDIUM_IMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18801a[PlatformChannel.HapticFeedbackType.HEAVY_IMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18801a[PlatformChannel.HapticFeedbackType.SELECTION_CLICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public b(Activity activity, PlatformChannel platformChannel) {
        a aVar = new a();
        this.f18797a = activity;
        this.f18798b = platformChannel;
        platformChannel.f18662b = aVar;
        this.f18799d = 1280;
    }

    @TargetApi(21)
    public final void a(PlatformChannel.d dVar) {
        t0.e bVar;
        t0.e eVar;
        Window window = this.f18797a.getWindow();
        View decorView = window.getDecorView();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            eVar = new t0.d(window);
        } else {
            if (i10 >= 26) {
                bVar = new t0.c(window, decorView);
            } else {
                bVar = new t0.b(window, decorView);
            }
            eVar = bVar;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 30) {
            window.addFlags(SlideAtom.USES_MASTER_SLIDE_ID);
            window.clearFlags(201326592);
        }
        PlatformChannel.Brightness brightness = dVar.f18674b;
        if (brightness != null) {
            int i12 = C0253b.c[brightness.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    eVar.d(false);
                }
            } else {
                eVar.d(true);
            }
        }
        Integer num = dVar.f18673a;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = dVar.c;
        if (bool != null && i11 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i11 >= 26) {
            PlatformChannel.Brightness brightness2 = dVar.f18676e;
            if (brightness2 != null) {
                int i13 = C0253b.c[brightness2.ordinal()];
                if (i13 != 1) {
                    if (i13 == 2) {
                        eVar.c(false);
                    }
                } else {
                    eVar.c(true);
                }
            }
            Integer num2 = dVar.f18675d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = dVar.f18677f;
        if (num3 != null && i11 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = dVar.f18678g;
        if (bool2 != null && i11 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.c = dVar;
    }

    public final void b() {
        this.f18797a.getWindow().getDecorView().setSystemUiVisibility(this.f18799d);
        PlatformChannel.d dVar = this.c;
        if (dVar != null) {
            a(dVar);
        }
    }
}
