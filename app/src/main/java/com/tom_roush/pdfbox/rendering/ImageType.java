package com.tom_roush.pdfbox.rendering;

import android.graphics.Bitmap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class ImageType {
    public static final ImageType BINARY = new AnonymousClass1();
    public static final ImageType GRAY = new AnonymousClass2();
    public static final ImageType RGB = new AnonymousClass3();
    public static final ImageType ARGB = new AnonymousClass4();
    private static final /* synthetic */ ImageType[] $VALUES = $values();

    /* renamed from: com.tom_roush.pdfbox.rendering.ImageType$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public enum AnonymousClass1 extends ImageType {
        public /* synthetic */ AnonymousClass1() {
            this("BINARY", 0);
        }

        @Override // com.tom_roush.pdfbox.rendering.ImageType
        public Bitmap.Config toBitmapConfig() {
            return Bitmap.Config.ALPHA_8;
        }

        private AnonymousClass1(String str, int i10) {
            super(str, i10, 0);
        }
    }

    /* renamed from: com.tom_roush.pdfbox.rendering.ImageType$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public enum AnonymousClass2 extends ImageType {
        public /* synthetic */ AnonymousClass2() {
            this("GRAY", 1);
        }

        @Override // com.tom_roush.pdfbox.rendering.ImageType
        public Bitmap.Config toBitmapConfig() {
            return Bitmap.Config.ALPHA_8;
        }

        private AnonymousClass2(String str, int i10) {
            super(str, i10, 0);
        }
    }

    /* renamed from: com.tom_roush.pdfbox.rendering.ImageType$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public enum AnonymousClass3 extends ImageType {
        public /* synthetic */ AnonymousClass3() {
            this("RGB", 2);
        }

        @Override // com.tom_roush.pdfbox.rendering.ImageType
        public Bitmap.Config toBitmapConfig() {
            return Bitmap.Config.ARGB_8888;
        }

        private AnonymousClass3(String str, int i10) {
            super(str, i10, 0);
        }
    }

    /* renamed from: com.tom_roush.pdfbox.rendering.ImageType$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public enum AnonymousClass4 extends ImageType {
        public /* synthetic */ AnonymousClass4() {
            this("ARGB", 3);
        }

        @Override // com.tom_roush.pdfbox.rendering.ImageType
        public Bitmap.Config toBitmapConfig() {
            return Bitmap.Config.ARGB_8888;
        }

        private AnonymousClass4(String str, int i10) {
            super(str, i10, 0);
        }
    }

    private static /* synthetic */ ImageType[] $values() {
        return new ImageType[]{BINARY, GRAY, RGB, ARGB};
    }

    public /* synthetic */ ImageType(String str, int i10, int i11) {
        this(str, i10);
    }

    public static ImageType valueOf(String str) {
        return (ImageType) Enum.valueOf(ImageType.class, str);
    }

    public static ImageType[] values() {
        return (ImageType[]) $VALUES.clone();
    }

    public abstract Bitmap.Config toBitmapConfig();

    private ImageType(String str, int i10) {
    }
}
