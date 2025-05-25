package go;

import android.content.Context;
import ho.b;
import ho.d;
import ho.e;
import ho.f;
import io.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.GroupAiFilterType;

/* compiled from: FilterHelper.kt */
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: FilterHelper.kt */
    /* renamed from: go.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0237a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17939a;

        static {
            int[] iArr = new int[GroupAiFilterType.values().length];
            try {
                iArr[GroupAiFilterType.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupAiFilterType.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupAiFilterType.CONTRAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GroupAiFilterType.REVERSE_COLOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GroupAiFilterType.GRAYSCALE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GroupAiFilterType.CUSTOM2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GroupAiFilterType.CUSTOM_BW1.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GroupAiFilterType.CUSTOM_BW2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[GroupAiFilterType.SUPER_DOCS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[GroupAiFilterType.SUPER_IMAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[GroupAiFilterType.CUSTOM1.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[GroupAiFilterType.BLEND_ALPHA.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f17939a = iArr;
        }
    }

    public static b a(Context context, GroupAiFilterType filterType) {
        g.e(context, "context");
        g.e(filterType, "filterType");
        switch (C0237a.f17939a[filterType.ordinal()]) {
            case 1:
                return new ho.a(context);
            case 2:
                return new f(context);
            case 3:
                return new d(context);
            case 4:
                return new ho.g(context);
            case 5:
                return new e(context);
            case 6:
                return new io.a(context);
            case 7:
                return new io.b(context);
            case 8:
                return new c(context);
            case 9:
                return new io.d(context);
            case 10:
                return new io.e(context);
            case 11:
                return new io.d(context);
            case 12:
                return new ho.c(context);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
