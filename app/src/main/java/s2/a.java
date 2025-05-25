package s2;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.NetworkType;
import androidx.work.impl.background.systemjob.SystemJobService;
import o2.h;

/* compiled from: SystemJobInfoConverter.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f29700b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ComponentName f29701a;

    /* compiled from: SystemJobInfoConverter.java */
    /* renamed from: s2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0372a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f29702a;

        static {
            int[] iArr = new int[NetworkType.values().length];
            f29702a = iArr;
            try {
                iArr[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29702a[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29702a[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29702a[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29702a[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        h.e("SystemJobInfoConverter");
    }

    public a(Context context) {
        this.f29701a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }
}
