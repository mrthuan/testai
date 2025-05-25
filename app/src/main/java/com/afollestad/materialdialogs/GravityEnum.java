package com.afollestad.materialdialogs;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;

/* loaded from: classes.dex */
public enum GravityEnum {
    START,
    CENTER,
    END;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5929a;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            f5929a = iArr;
            try {
                iArr[GravityEnum.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5929a[GravityEnum.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5929a[GravityEnum.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @SuppressLint({"RtlHardcoded"})
    public int getGravityInt() {
        int i10 = a.f5929a[ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 3) {
                return 8388613;
            }
            throw new IllegalStateException("Invalid gravity constant");
        }
        return 8388611;
    }

    @TargetApi(17)
    public int getTextAlignment() {
        int i10 = a.f5929a[ordinal()];
        if (i10 != 2) {
            if (i10 != 3) {
                return 5;
            }
            return 6;
        }
        return 4;
    }
}
