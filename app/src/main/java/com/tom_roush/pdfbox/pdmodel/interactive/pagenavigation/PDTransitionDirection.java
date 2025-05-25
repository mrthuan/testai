package com.tom_roush.pdfbox.pdmodel.interactive.pagenavigation;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public class PDTransitionDirection {
    private final int degrees;
    public static final PDTransitionDirection LEFT_TO_RIGHT = new PDTransitionDirection("LEFT_TO_RIGHT", 0, 0);
    public static final PDTransitionDirection BOTTOM_TO_TOP = new PDTransitionDirection("BOTTOM_TO_TOP", 1, 90);
    public static final PDTransitionDirection RIGHT_TO_LEFT = new PDTransitionDirection("RIGHT_TO_LEFT", 2, ShapeTypes.MATH_EQUAL);
    public static final PDTransitionDirection TOP_TO_BOTTOM = new PDTransitionDirection("TOP_TO_BOTTOM", 3, 270);
    public static final PDTransitionDirection TOP_LEFT_TO_BOTTOM_RIGHT = new PDTransitionDirection("TOP_LEFT_TO_BOTTOM_RIGHT", 4, 315);
    public static final PDTransitionDirection NONE = new AnonymousClass1();
    private static final /* synthetic */ PDTransitionDirection[] $VALUES = $values();

    /* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public enum AnonymousClass1 extends PDTransitionDirection {
        public /* synthetic */ AnonymousClass1() {
            this("NONE", 5, 0);
        }

        @Override // com.tom_roush.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection
        public COSBase getCOSBase() {
            return COSName.NONE;
        }

        private AnonymousClass1(String str, int i10, int i11) {
            super(str, i10, i11, 0);
        }
    }

    private static /* synthetic */ PDTransitionDirection[] $values() {
        return new PDTransitionDirection[]{LEFT_TO_RIGHT, BOTTOM_TO_TOP, RIGHT_TO_LEFT, TOP_TO_BOTTOM, TOP_LEFT_TO_BOTTOM_RIGHT, NONE};
    }

    public /* synthetic */ PDTransitionDirection(String str, int i10, int i11, int i12) {
        this(str, i10, i11);
    }

    public static PDTransitionDirection valueOf(String str) {
        return (PDTransitionDirection) Enum.valueOf(PDTransitionDirection.class, str);
    }

    public static PDTransitionDirection[] values() {
        return (PDTransitionDirection[]) $VALUES.clone();
    }

    public COSBase getCOSBase() {
        return COSInteger.get(this.degrees);
    }

    private PDTransitionDirection(String str, int i10, int i11) {
        this.degrees = i11;
    }
}
