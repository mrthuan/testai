package lib.zj.office.fc.openxml4j.opc.internal;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import lib.zj.office.fc.openxml4j.opc.PackageRelationship;
import lib.zj.office.fc.openxml4j.opc.PackageRelationshipTypes;
import lib.zj.office.fc.openxml4j.opc.ZipPackage;

/* loaded from: classes3.dex */
public final class ZipHelper {
    private static final String FORWARD_SLASH = "/";
    public static final int READ_WRITE_FILE_BUFFER_SIZE = 8192;

    private ZipHelper() {
    }

    public static ZipEntry getContentTypeZipEntry(ZipPackage zipPackage) {
        Enumeration<? extends ZipEntry> entries = zipPackage.getZipArchive().getEntries();
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            if (nextElement.getName().equals(ContentTypeManager.CONTENT_TYPES_PART_NAME)) {
                return nextElement;
            }
        }
        return null;
    }

    public static ZipEntry getCorePropertiesZipEntry(ZipPackage zipPackage) {
        PackageRelationship relationship = zipPackage.getRelationshipsByType(PackageRelationshipTypes.CORE_PROPERTIES).getRelationship(0);
        if (relationship == null) {
            return null;
        }
        return new ZipEntry(relationship.getTargetURI().getPath());
    }

    public static String getOPCNameFromZipItemName(String str) {
        if (str != null) {
            if (str.startsWith("/")) {
                return str;
            }
            return "/".concat(str);
        }
        throw new IllegalArgumentException("zipItemName");
    }

    public static String getZipItemNameFromOPCName(String str) {
        if (str != null) {
            while (str.startsWith("/")) {
                str = str.substring(1);
            }
            return str;
        }
        throw new IllegalArgumentException("opcItemName");
    }

    public static URI getZipURIFromOPCName(String str) {
        if (str != null) {
            while (str.startsWith("/")) {
                str = str.substring(1);
            }
            try {
                return new URI(str);
            } catch (URISyntaxException unused) {
                return null;
            }
        }
        throw new IllegalArgumentException("opcItemName");
    }

    public static ZipFile openZipFile(String str) {
        File file = new File(str);
        try {
            if (!file.exists()) {
                return null;
            }
            return new ZipFile(file);
        } catch (IOException unused) {
            return null;
        }
    }
}
