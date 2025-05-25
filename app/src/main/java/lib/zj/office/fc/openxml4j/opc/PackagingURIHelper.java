package lib.zj.office.fc.openxml4j.opc;

import a0.a;
import a0.d;
import a6.h;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import lib.zj.office.fc.openxml4j.exceptions.InvalidFormatException;
import lib.zj.office.fc.openxml4j.exceptions.InvalidOperationException;

/* loaded from: classes3.dex */
public final class PackagingURIHelper {
    public static final PackagePartName CORE_PROPERTIES_PART_NAME;
    public static final URI CORE_PROPERTIES_URI;
    public static final char FORWARD_SLASH_CHAR = '/';
    public static final String FORWARD_SLASH_STRING = "/";
    public static final String PACKAGE_CORE_PROPERTIES_NAME = "core.xml";
    public static final String PACKAGE_PROPERTIES_SEGMENT_NAME = "docProps";
    public static final PackagePartName PACKAGE_RELATIONSHIPS_ROOT_PART_NAME;
    public static final URI PACKAGE_RELATIONSHIPS_ROOT_URI;
    public static final PackagePartName PACKAGE_ROOT_PART_NAME;
    public static final URI PACKAGE_ROOT_URI;
    public static final String RELATIONSHIP_PART_EXTENSION_NAME = ".rels";
    public static final String RELATIONSHIP_PART_SEGMENT_NAME = "_rels";
    private static final char[] hexDigits;
    private static URI packageRootUri;

    static {
        URI uri;
        URI uri2;
        URI uri3;
        PackagePartName packagePartName;
        PackagePartName packagePartName2;
        PackagePartName packagePartName3 = null;
        try {
            uri = new URI(FORWARD_SLASH_STRING);
            try {
                uri2 = new URI(FORWARD_SLASH_CHAR + RELATIONSHIP_PART_SEGMENT_NAME + FORWARD_SLASH_CHAR + RELATIONSHIP_PART_EXTENSION_NAME);
            } catch (URISyntaxException unused) {
                uri2 = null;
            }
            try {
                packageRootUri = new URI(FORWARD_SLASH_STRING);
                uri3 = new URI(FORWARD_SLASH_CHAR + PACKAGE_PROPERTIES_SEGMENT_NAME + FORWARD_SLASH_CHAR + PACKAGE_CORE_PROPERTIES_NAME);
            } catch (URISyntaxException unused2) {
                uri3 = null;
                PACKAGE_ROOT_URI = uri;
                PACKAGE_RELATIONSHIPS_ROOT_URI = uri2;
                CORE_PROPERTIES_URI = uri3;
                packagePartName2 = createPartName(uri2);
                try {
                    packagePartName = createPartName(uri3);
                    try {
                        packagePartName3 = new PackagePartName(uri, false);
                    } catch (InvalidFormatException unused3) {
                    }
                } catch (InvalidFormatException unused4) {
                    packagePartName = null;
                }
                PACKAGE_RELATIONSHIPS_ROOT_PART_NAME = packagePartName2;
                CORE_PROPERTIES_PART_NAME = packagePartName;
                PACKAGE_ROOT_PART_NAME = packagePartName3;
                hexDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            }
        } catch (URISyntaxException unused5) {
            uri = null;
            uri2 = null;
        }
        PACKAGE_ROOT_URI = uri;
        PACKAGE_RELATIONSHIPS_ROOT_URI = uri2;
        CORE_PROPERTIES_URI = uri3;
        try {
            packagePartName2 = createPartName(uri2);
            packagePartName = createPartName(uri3);
            packagePartName3 = new PackagePartName(uri, false);
        } catch (InvalidFormatException unused6) {
            packagePartName = null;
            packagePartName2 = null;
        }
        PACKAGE_RELATIONSHIPS_ROOT_PART_NAME = packagePartName2;
        CORE_PROPERTIES_PART_NAME = packagePartName;
        PACKAGE_ROOT_PART_NAME = packagePartName3;
        hexDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static URI combine(URI uri, URI uri2) {
        try {
            return new URI(combine(uri.getPath(), uri2.getPath()));
        } catch (URISyntaxException unused) {
            throw new IllegalArgumentException("Prefix and suffix can't be combine !");
        }
    }

    public static PackagePartName createPartName(URI uri) {
        if (uri != null) {
            return new PackagePartName(uri, true);
        }
        throw new IllegalArgumentException("partName");
    }

    public static String decodeURI(URI uri) {
        StringBuffer stringBuffer = new StringBuffer();
        String aSCIIString = uri.toASCIIString();
        int i10 = 0;
        while (i10 < aSCIIString.length()) {
            char charAt = aSCIIString.charAt(i10);
            if (charAt == '%') {
                if (aSCIIString.length() - i10 >= 2) {
                    stringBuffer.append((char) Integer.parseInt(aSCIIString.substring(i10 + 1, i10 + 3), 16));
                    i10 += 2;
                } else {
                    throw new IllegalArgumentException(h.d("The uri ", aSCIIString, " contain invalid encoded character !"));
                }
            } else {
                stringBuffer.append(charAt);
            }
            i10++;
        }
        return stringBuffer.toString();
    }

    public static String encode(String str) {
        if (str.length() == 0) {
            return str;
        }
        try {
            ByteBuffer wrap = ByteBuffer.wrap(str.getBytes("UTF-8"));
            StringBuilder sb2 = new StringBuilder();
            while (wrap.hasRemaining()) {
                int i10 = wrap.get() & 255;
                if (isUnsafe(i10)) {
                    sb2.append('%');
                    char[] cArr = hexDigits;
                    sb2.append(cArr[(i10 >> 4) & 15]);
                    sb2.append(cArr[(i10 >> 0) & 15]);
                } else {
                    sb2.append((char) i10);
                }
            }
            return sb2.toString();
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String getFilename(URI uri) {
        if (uri != null) {
            String path = uri.getPath();
            int length = path.length();
            int i10 = length;
            do {
                i10--;
                if (i10 < 0) {
                    return "";
                }
            } while (path.charAt(i10) != FORWARD_SLASH_CHAR);
            return path.substring(i10 + 1, length);
        }
        return "";
    }

    public static String getFilenameWithoutExtension(URI uri) {
        String filename = getFilename(uri);
        int lastIndexOf = filename.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return filename;
        }
        return filename.substring(0, lastIndexOf);
    }

    public static URI getPackageRootUri() {
        return packageRootUri;
    }

    public static URI getPath(URI uri) {
        if (uri != null) {
            String path = uri.getPath();
            int length = path.length();
            while (true) {
                length--;
                if (length < 0) {
                    break;
                } else if (path.charAt(length) == FORWARD_SLASH_CHAR) {
                    try {
                        return new URI(path.substring(0, length));
                    } catch (URISyntaxException unused) {
                    }
                }
            }
        }
        return null;
    }

    public static PackagePartName getRelationshipPartName(PackagePartName packagePartName) {
        if (packagePartName != null) {
            if (PACKAGE_ROOT_URI.getPath().equals(packagePartName.getURI().getPath())) {
                return PACKAGE_RELATIONSHIPS_ROOT_PART_NAME;
            }
            if (!packagePartName.isRelationshipPartURI()) {
                String path = packagePartName.getURI().getPath();
                String filename = getFilename(packagePartName.getURI());
                StringBuilder k10 = a.k(combine(combine(path.substring(0, path.length() - filename.length()), RELATIONSHIP_PART_SEGMENT_NAME), filename));
                k10.append(RELATIONSHIP_PART_EXTENSION_NAME);
                try {
                    return createPartName(k10.toString());
                } catch (InvalidFormatException unused) {
                    return null;
                }
            }
            throw new InvalidOperationException("Can't be a relationship part");
        }
        throw new IllegalArgumentException("partName");
    }

    public static URI getSourcePartUriFromRelationshipPartUri(URI uri) {
        if (uri != null) {
            if (isRelationshipPartURI(uri)) {
                if (uri.compareTo(PACKAGE_RELATIONSHIPS_ROOT_URI) == 0) {
                    return PACKAGE_ROOT_URI;
                }
                String path = uri.getPath();
                String filenameWithoutExtension = getFilenameWithoutExtension(uri);
                String substring = path.substring(0, (path.length() - filenameWithoutExtension.length()) - RELATIONSHIP_PART_EXTENSION_NAME.length());
                return getURIFromPath(combine(substring.substring(0, (substring.length() - RELATIONSHIP_PART_SEGMENT_NAME.length()) - 1), filenameWithoutExtension));
            }
            throw new IllegalArgumentException("Must be a relationship part");
        }
        throw new IllegalArgumentException("Must not be null");
    }

    public static URI getURIFromPath(String str) {
        try {
            return toURI(str);
        } catch (URISyntaxException unused) {
            throw new IllegalArgumentException("path");
        }
    }

    public static boolean isRelationshipPartURI(URI uri) {
        if (uri != null) {
            String path = uri.getPath();
            return path.matches(".*" + RELATIONSHIP_PART_SEGMENT_NAME + ".*" + RELATIONSHIP_PART_EXTENSION_NAME + "$");
        }
        throw new IllegalArgumentException("partUri");
    }

    private static boolean isUnsafe(int i10) {
        if (i10 <= 128 && " ".indexOf(i10) < 0) {
            return false;
        }
        return true;
    }

    public static boolean isValidPartName(URI uri) {
        if (uri != null) {
            try {
                createPartName(uri);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
        throw new IllegalArgumentException("partUri");
    }

    public static URI relativizeURI(URI uri, URI uri2, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        String[] split = uri.getPath().split(FORWARD_SLASH_STRING, -1);
        String[] split2 = uri2.getPath().split(FORWARD_SLASH_STRING, -1);
        if (split.length != 0) {
            if (split2.length != 0) {
                if (uri.toString().equals(FORWARD_SLASH_STRING)) {
                    String path = uri2.getPath();
                    if (z10 && path.length() > 0 && path.charAt(0) == '/') {
                        try {
                            return new URI(path.substring(1));
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                    return uri2;
                }
                int i10 = 0;
                for (int i11 = 0; i11 < split.length && i11 < split2.length && split[i11].equals(split2[i11]); i11++) {
                    i10++;
                }
                if ((i10 == 0 || i10 == 1) && split[0].equals("") && split2[0].equals("")) {
                    for (int i12 = 0; i12 < split.length - 2; i12++) {
                        sb2.append("../");
                    }
                    for (int i13 = 0; i13 < split2.length; i13++) {
                        if (!split2[i13].equals("")) {
                            sb2.append(split2[i13]);
                            if (i13 != split2.length - 1) {
                                sb2.append(FORWARD_SLASH_STRING);
                            }
                        }
                    }
                    try {
                        return new URI(sb2.toString());
                    } catch (Exception unused2) {
                        return null;
                    }
                }
                if (i10 == split.length && i10 == split2.length) {
                    if (uri.equals(uri2)) {
                        sb2.append(split[split.length - 1]);
                    } else {
                        sb2.append("");
                    }
                } else {
                    if (i10 == 1) {
                        sb2.append(FORWARD_SLASH_STRING);
                    } else {
                        for (int i14 = i10; i14 < split.length - 1; i14++) {
                            sb2.append("../");
                        }
                    }
                    while (i10 < split2.length) {
                        if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) != '/') {
                            sb2.append(FORWARD_SLASH_STRING);
                        }
                        sb2.append(split2[i10]);
                        i10++;
                    }
                }
                String rawFragment = uri2.getRawFragment();
                if (rawFragment != null) {
                    sb2.append("#");
                    sb2.append(rawFragment);
                }
                try {
                    return new URI(sb2.toString());
                } catch (Exception unused3) {
                    return null;
                }
            }
            throw new IllegalArgumentException("Can't relativize an empty target URI !");
        }
        throw new IllegalArgumentException("Can't relativize an empty source URI !");
    }

    public static URI resolvePartUri(URI uri, URI uri2) {
        if (uri != null && !uri.isAbsolute()) {
            if (uri2 != null && !uri2.isAbsolute()) {
                return uri.resolve(uri2);
            }
            throw new IllegalArgumentException("targetUri invalid - " + uri2);
        }
        throw new IllegalArgumentException("sourcePartUri invalid - " + uri);
    }

    public static URI toURI(String str) {
        if (str.indexOf("\\") != -1) {
            str = str.replace('\\', FORWARD_SLASH_CHAR);
        }
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            String substring = str.substring(0, indexOf);
            String substring2 = str.substring(indexOf + 1);
            StringBuilder g10 = d.g(substring, "#");
            g10.append(encode(substring2));
            str = g10.toString();
        }
        return new URI(str.trim());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
        if (r4.startsWith("" + r2) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0081, code lost:
        if (r4.startsWith("" + r2) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0087, code lost:
        return a6.h.c(r3, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String combine(java.lang.String r3, java.lang.String r4) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            char r2 = lib.zj.office.fc.openxml4j.opc.PackagingURIHelper.FORWARD_SLASH_CHAR
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r0 = r3.endsWith(r0)
            if (r0 != 0) goto L3b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L3b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r2)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r0 = r3.endsWith(r0)
            if (r0 != 0) goto L5f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L83
        L5f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L88
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L88
        L83:
            java.lang.String r3 = a6.h.c(r3, r4)
            return r3
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.openxml4j.opc.PackagingURIHelper.combine(java.lang.String, java.lang.String):java.lang.String");
    }

    public static PackagePartName createPartName(String str) {
        try {
            return createPartName(toURI(str));
        } catch (URISyntaxException e10) {
            throw new InvalidFormatException(e10.getMessage());
        }
    }

    public static PackagePartName createPartName(String str, PackagePart packagePart) {
        try {
            return createPartName(resolvePartUri(packagePart.getPartName().getURI(), new URI(str)));
        } catch (URISyntaxException e10) {
            throw new InvalidFormatException(e10.getMessage());
        }
    }

    public static PackagePartName createPartName(URI uri, PackagePart packagePart) {
        return createPartName(resolvePartUri(packagePart.getPartName().getURI(), uri));
    }

    public static URI relativizeURI(URI uri, URI uri2) {
        return relativizeURI(uri, uri2, false);
    }
}
