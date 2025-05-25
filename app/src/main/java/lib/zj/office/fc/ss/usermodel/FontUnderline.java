package lib.zj.office.fc.ss.usermodel;

/* loaded from: classes3.dex */
public enum FontUnderline {
    SINGLE(1),
    DOUBLE(2),
    SINGLE_ACCOUNTING(3),
    DOUBLE_ACCOUNTING(4),
    NONE(5);
    
    private static FontUnderline[] _table = new FontUnderline[6];
    private int value;

    /* renamed from: lib.zj.office.fc.ss.usermodel.FontUnderline$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$lib$zj$office$fc$ss$usermodel$FontUnderline;

        static {
            int[] iArr = new int[FontUnderline.values().length];
            $SwitchMap$lib$zj$office$fc$ss$usermodel$FontUnderline = iArr;
            try {
                iArr[FontUnderline.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$lib$zj$office$fc$ss$usermodel$FontUnderline[FontUnderline.DOUBLE_ACCOUNTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$lib$zj$office$fc$ss$usermodel$FontUnderline[FontUnderline.SINGLE_ACCOUNTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$lib$zj$office$fc$ss$usermodel$FontUnderline[FontUnderline.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$lib$zj$office$fc$ss$usermodel$FontUnderline[FontUnderline.SINGLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        FontUnderline[] values;
        for (FontUnderline fontUnderline : values()) {
            _table[fontUnderline.getValue()] = fontUnderline;
        }
    }

    FontUnderline(int i10) {
        this.value = i10;
    }

    public byte getByteValue() {
        int i10 = AnonymousClass1.$SwitchMap$lib$zj$office$fc$ss$usermodel$FontUnderline[ordinal()];
        if (i10 == 1) {
            return (byte) 2;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    return (byte) 1;
                }
                return (byte) 0;
            }
            return (byte) 33;
        }
        return (byte) 34;
    }

    public int getValue() {
        return this.value;
    }

    public static FontUnderline valueOf(int i10) {
        return _table[i10];
    }

    public static FontUnderline valueOf(byte b10) {
        if (b10 != 1) {
            if (b10 != 2) {
                if (b10 != 33) {
                    if (b10 != 34) {
                        return NONE;
                    }
                    return DOUBLE_ACCOUNTING;
                }
                return SINGLE_ACCOUNTING;
            }
            return DOUBLE;
        }
        return SINGLE;
    }
}
