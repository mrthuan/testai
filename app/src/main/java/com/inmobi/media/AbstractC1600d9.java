package com.inmobi.media;

import kotlin.NoWhenBranchMatchedException;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.inmobi.media.d9  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1600d9 {
    public static final EnumC1586c9 a(byte b10) {
        if (b10 == 1) {
            return EnumC1586c9.f14989a;
        }
        if (b10 == 2) {
            return EnumC1586c9.c;
        }
        if (b10 == 3) {
            return EnumC1586c9.f14990b;
        }
        if (b10 == 4) {
            return EnumC1586c9.f14991d;
        }
        return EnumC1586c9.f14989a;
    }

    public static final boolean b(EnumC1586c9 enumC1586c9) {
        kotlin.jvm.internal.g.e(enumC1586c9, "<this>");
        if (enumC1586c9 != EnumC1586c9.f14990b && enumC1586c9 != EnumC1586c9.f14991d) {
            return false;
        }
        return true;
    }

    public static final int a(EnumC1586c9 enumC1586c9) {
        kotlin.jvm.internal.g.e(enumC1586c9, "<this>");
        int ordinal = enumC1586c9.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return 270;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return ShapeTypes.MATH_EQUAL;
            }
            return 90;
        }
        return 0;
    }
}
