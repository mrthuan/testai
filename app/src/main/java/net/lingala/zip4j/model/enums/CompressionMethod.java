// Auto-fixed: added missing class declaration
public class CompressionMethod {
package net.lingala.zip4j.model.enums;

import net.lingala.zip4j.exception.ZipException;

/* loaded from: classes3.dex */
public enum CompressionMethod {
    STORE(0),
    DEFLATE(8),
    AES_INTERNAL_ONLY(99);
    
    private int code;

    CompressionMethod(int i10) {
        this.code = i10;
    }

    public static CompressionMethod getCompressionMethodFromCode(int i10) {
        CompressionMethod[] values;
        for (CompressionMethod compressionMethod : values()) {
            if (compressionMethod.getCode() == i10) {
                return compressionMethod;
            }
        }
        throw new ZipException("Unknown compression method", ZipException.Type.UNKNOWN_COMPRESSION_METHOD);
    }

    public int getCode() {
        return this.code;
    }
}

}
