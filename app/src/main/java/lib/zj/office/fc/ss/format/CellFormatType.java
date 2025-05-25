package lib.zj.office.fc.ss.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class CellFormatType {
    public static final CellFormatType GENERAL = new AnonymousClass1();
    public static final CellFormatType NUMBER = new AnonymousClass2();
    public static final CellFormatType DATE = new AnonymousClass3();
    public static final CellFormatType ELAPSED = new AnonymousClass4();
    public static final CellFormatType TEXT = new AnonymousClass5();
    private static final /* synthetic */ CellFormatType[] $VALUES = $values();

    /* renamed from: lib.zj.office.fc.ss.format.CellFormatType$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public enum AnonymousClass1 extends CellFormatType {
        public /* synthetic */ AnonymousClass1() {
            this("GENERAL", 0);
        }

        @Override // lib.zj.office.fc.ss.format.CellFormatType
        public CellFormatter formatter(String str) {
            return new CellGeneralFormatter();
        }

        @Override // lib.zj.office.fc.ss.format.CellFormatType
        public boolean isSpecial(char c) {
            return false;
        }

        private AnonymousClass1(String str, int i10) {
            super(str, i10, 0);
        }
    }

    /* renamed from: lib.zj.office.fc.ss.format.CellFormatType$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public enum AnonymousClass2 extends CellFormatType {
        public /* synthetic */ AnonymousClass2() {
            this("NUMBER", 1);
        }

        @Override // lib.zj.office.fc.ss.format.CellFormatType
        public CellFormatter formatter(String str) {
            return new CellNumberFormatter(str);
        }

        @Override // lib.zj.office.fc.ss.format.CellFormatType
        public boolean isSpecial(char c) {
            return false;
        }

        private AnonymousClass2(String str, int i10) {
            super(str, i10, 0);
        }
    }

    /* renamed from: lib.zj.office.fc.ss.format.CellFormatType$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public enum AnonymousClass3 extends CellFormatType {
        public /* synthetic */ AnonymousClass3() {
            this("DATE", 2);
        }

        @Override // lib.zj.office.fc.ss.format.CellFormatType
        public CellFormatter formatter(String str) {
            return new CellDateFormatter(str);
        }

        @Override // lib.zj.office.fc.ss.format.CellFormatType
        public boolean isSpecial(char c) {
            if (c != '\'' && (c > 127 || !Character.isLetter(c))) {
                return false;
            }
            return true;
        }

        private AnonymousClass3(String str, int i10) {
            super(str, i10, 0);
        }
    }

    /* renamed from: lib.zj.office.fc.ss.format.CellFormatType$4  reason: invalid class name */
    /* loaded from: classes3.dex */
    public enum AnonymousClass4 extends CellFormatType {
        public /* synthetic */ AnonymousClass4() {
            this("ELAPSED", 3);
        }

        @Override // lib.zj.office.fc.ss.format.CellFormatType
        public CellFormatter formatter(String str) {
            return new CellElapsedFormatter(str);
        }

        @Override // lib.zj.office.fc.ss.format.CellFormatType
        public boolean isSpecial(char c) {
            return false;
        }

        private AnonymousClass4(String str, int i10) {
            super(str, i10, 0);
        }
    }

    /* renamed from: lib.zj.office.fc.ss.format.CellFormatType$5  reason: invalid class name */
    /* loaded from: classes3.dex */
    public enum AnonymousClass5 extends CellFormatType {
        public /* synthetic */ AnonymousClass5() {
            this("TEXT", 4);
        }

        @Override // lib.zj.office.fc.ss.format.CellFormatType
        public CellFormatter formatter(String str) {
            return new CellTextFormatter(str);
        }

        @Override // lib.zj.office.fc.ss.format.CellFormatType
        public boolean isSpecial(char c) {
            return false;
        }

        private AnonymousClass5(String str, int i10) {
            super(str, i10, 0);
        }
    }

    private static /* synthetic */ CellFormatType[] $values() {
        return new CellFormatType[]{GENERAL, NUMBER, DATE, ELAPSED, TEXT};
    }

    public /* synthetic */ CellFormatType(String str, int i10, int i11) {
        this(str, i10);
    }

    public static CellFormatType valueOf(String str) {
        return (CellFormatType) Enum.valueOf(CellFormatType.class, str);
    }

    public static CellFormatType[] values() {
        return (CellFormatType[]) $VALUES.clone();
    }

    public abstract CellFormatter formatter(String str);

    public abstract boolean isSpecial(char c);

    private CellFormatType(String str, int i10) {
    }
}
