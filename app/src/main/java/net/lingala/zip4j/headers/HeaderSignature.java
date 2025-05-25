// Auto-fixed: added missing class declaration
public class HeaderSignature {
package net.lingala.zip4j.headers;

/* loaded from: classes3.dex */
public enum HeaderSignature {
    LOCAL_FILE_HEADER("LOCAL_FILE_HEADER"),
    EXTRA_DATA_RECORD("EXTRA_DATA_RECORD"),
    CENTRAL_DIRECTORY("CENTRAL_DIRECTORY"),
    END_OF_CENTRAL_DIRECTORY("END_OF_CENTRAL_DIRECTORY"),
    TEMPORARY_SPANNING_MARKER("TEMPORARY_SPANNING_MARKER"),
    DIGITAL_SIGNATURE("DIGITAL_SIGNATURE"),
    ARCEXTDATREC("ARCEXTDATREC"),
    SPLIT_ZIP("SPLIT_ZIP"),
    ZIP64_END_CENTRAL_DIRECTORY_LOCATOR("ZIP64_END_CENTRAL_DIRECTORY_LOCATOR"),
    ZIP64_END_CENTRAL_DIRECTORY_RECORD("ZIP64_END_CENTRAL_DIRECTORY_RECORD"),
    ZIP64_EXTRA_FIELD_SIGNATURE("ZIP64_EXTRA_FIELD_SIGNATURE"),
    AES_EXTRA_DATA_RECORD("AES_EXTRA_DATA_RECORD");
    
    private long value;

    HeaderSignature(String str) {
        this.value = r2;
    }

    public long getValue() {
        return this.value;
    }
}

}
