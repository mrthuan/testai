package lib.zj.office.fc.ddf;

/* loaded from: classes3.dex */
public class EscherPropertyMetaData {
    public static final byte TYPE_ARRAY = 5;
    public static final byte TYPE_BOOLEAN = 1;
    public static final byte TYPE_RGB = 2;
    public static final byte TYPE_SHAPEPATH = 3;
    public static final byte TYPE_SIMPLE = 4;
    public static final byte TYPE_UNKNOWN = 0;
    private String description;
    private byte type;

    public EscherPropertyMetaData(String str) {
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }

    public byte getType() {
        return this.type;
    }

    public EscherPropertyMetaData(String str, byte b10) {
        this.description = str;
        this.type = b10;
    }
}
