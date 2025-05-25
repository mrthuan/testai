package jp.co.cyberagent.android.gpuimage.util;

import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: classes.dex */
public enum Rotation {
    NORMAL,
    ROTATION_90,
    ROTATION_180,
    ROTATION_270;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19428a;

        static {
            int[] iArr = new int[Rotation.values().length];
            f19428a = iArr;
            try {
                iArr[Rotation.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19428a[Rotation.ROTATION_90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19428a[Rotation.ROTATION_180.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19428a[Rotation.ROTATION_270.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static Rotation fromInt(int i10) {
        if (i10 != 0) {
            if (i10 != 90) {
                if (i10 != 180) {
                    if (i10 != 270) {
                        if (i10 == 360) {
                            return NORMAL;
                        }
                        throw new IllegalStateException(i10 + " is an unknown rotation. Needs to be either 0, 90, 180 or 270!");
                    }
                    return ROTATION_270;
                }
                return ROTATION_180;
            }
            return ROTATION_90;
        }
        return NORMAL;
    }

    public int asInt() {
        int i10 = a.f19428a[ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return 270;
                    }
                    throw new IllegalStateException("Unknown Rotation!");
                }
                return ShapeTypes.MATH_EQUAL;
            }
            return 90;
        }
        return 0;
    }
}
