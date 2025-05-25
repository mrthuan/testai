// Auto-fixed: added missing class declaration
public class RandomAccessFileMode {
package net.lingala.zip4j.model.enums;

/* loaded from: classes3.dex */
public enum RandomAccessFileMode {
    READ("r"),
    WRITE("rw");
    
    private String value;

    RandomAccessFileMode(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}

}
