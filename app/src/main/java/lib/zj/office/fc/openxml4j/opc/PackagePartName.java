package lib.zj.office.fc.openxml4j.opc;

import a6.h;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.net.URI;
import java.net.URISyntaxException;
import lib.zj.office.fc.openxml4j.exceptions.InvalidFormatException;
import lib.zj.office.fc.openxml4j.exceptions.OpenXML4JRuntimeException;

/* loaded from: classes3.dex */
public final class PackagePartName implements Comparable<PackagePartName> {
    private boolean isRelationship;
    private URI partNameURI;
    private static String[] RFC3986_PCHAR_SUB_DELIMS = {"!", "$", "&", OperatorName.SHOW_TEXT_LINE, "(", ")", "*", "+", ",", ";", "="};
    private static String[] RFC3986_PCHAR_UNRESERVED_SUP = {"-", ".", "_", "~"};
    private static String[] RFC3986_PCHAR_AUTHORIZED_SUP = {":", "@"};

    public PackagePartName(URI uri, boolean z10) {
        if (z10) {
            throwExceptionIfInvalidPartUri(uri);
        } else if (!PackagingURIHelper.PACKAGE_ROOT_URI.equals(uri)) {
            throw new OpenXML4JRuntimeException("OCP conformance must be check for ALL part name except special cases : ['/']");
        }
        this.partNameURI = uri;
        this.isRelationship = isRelationshipPartURI(uri);
    }

    private static void checkPCharCompliance(String str) {
        boolean z10;
        boolean z11;
        int i10 = 0;
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if ((charAt >= 'A' && charAt <= 'Z') || ((charAt >= 'a' && charAt <= 'z') || (charAt >= '0' && charAt <= '9'))) {
                z10 = false;
            } else {
                int i11 = 0;
                while (true) {
                    String[] strArr = RFC3986_PCHAR_UNRESERVED_SUP;
                    if (i11 < strArr.length) {
                        if (charAt == strArr[i11].charAt(0)) {
                            z10 = false;
                            break;
                        }
                        i11++;
                    } else {
                        z10 = true;
                        break;
                    }
                }
                int i12 = 0;
                while (z10) {
                    String[] strArr2 = RFC3986_PCHAR_AUTHORIZED_SUP;
                    if (i12 >= strArr2.length) {
                        break;
                    }
                    if (charAt == strArr2[i12].charAt(0)) {
                        z10 = false;
                    }
                    i12++;
                }
                int i13 = 0;
                while (z10) {
                    String[] strArr3 = RFC3986_PCHAR_SUB_DELIMS;
                    if (i13 >= strArr3.length) {
                        break;
                    }
                    if (charAt == strArr3[i13].charAt(0)) {
                        z10 = false;
                    }
                    i13++;
                }
            }
            if (z10 && charAt == '%') {
                if (str.length() - i10 >= 2) {
                    char parseInt = (char) Integer.parseInt(str.substring(i10 + 1, i10 + 3), 16);
                    i10 += 2;
                    if (parseInt != '/' && parseInt != '\\') {
                        if ((parseInt >= 'A' && parseInt <= 'Z') || ((parseInt >= 'a' && parseInt <= 'z') || (parseInt >= '0' && parseInt <= '9'))) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        int i14 = 0;
                        while (!z11) {
                            String[] strArr4 = RFC3986_PCHAR_UNRESERVED_SUP;
                            if (i14 >= strArr4.length) {
                                break;
                            } else if (charAt == strArr4[i14].charAt(0)) {
                                z10 = true;
                                break;
                            } else {
                                i14++;
                            }
                        }
                        z10 = z11;
                        if (z10) {
                            throw new InvalidFormatException("A segment shall not contain percent-encoded unreserved characters. [M1.8]");
                        }
                    } else {
                        throw new InvalidFormatException("A segment shall not contain percent-encoded forward slash ('/'), or backward slash ('') characters. [M1.7]");
                    }
                } else {
                    throw new InvalidFormatException(h.d("The segment ", str, " contain invalid encoded character !"));
                }
            }
            if (!z10) {
                i10++;
            } else {
                throw new InvalidFormatException("A segment shall not hold any characters other than pchar characters. [M1.6]");
            }
        }
    }

    private boolean isRelationshipPartURI(URI uri) {
        if (uri != null) {
            String path = uri.getPath();
            return path.matches("^.*/" + PackagingURIHelper.RELATIONSHIP_PART_SEGMENT_NAME + "/.*\\" + PackagingURIHelper.RELATIONSHIP_PART_EXTENSION_NAME + "$");
        }
        throw new IllegalArgumentException("partUri");
    }

    private static void throwExceptionIfAbsoluteUri(URI uri) {
        if (!uri.isAbsolute()) {
            return;
        }
        throw new InvalidFormatException("Absolute URI forbidden: " + uri);
    }

    private static void throwExceptionIfEmptyURI(URI uri) {
        if (uri != null) {
            String path = uri.getPath();
            if (path.length() != 0 && (path.length() != 1 || path.charAt(0) != PackagingURIHelper.FORWARD_SLASH_CHAR)) {
                return;
            }
            throw new InvalidFormatException("A part name shall not be empty [M1.1]: " + uri.getPath());
        }
        throw new IllegalArgumentException("partURI");
    }

    private static void throwExceptionIfInvalidPartUri(URI uri) {
        if (uri != null) {
            throwExceptionIfEmptyURI(uri);
            throwExceptionIfAbsoluteUri(uri);
            throwExceptionIfPartNameNotStartsWithForwardSlashChar(uri);
            throwExceptionIfPartNameEndsWithForwardSlashChar(uri);
            throwExceptionIfPartNameHaveInvalidSegments(uri);
            return;
        }
        throw new IllegalArgumentException("partUri");
    }

    private static void throwExceptionIfPartNameEndsWithForwardSlashChar(URI uri) {
        String path = uri.getPath();
        if (path.length() > 0 && path.charAt(path.length() - 1) == PackagingURIHelper.FORWARD_SLASH_CHAR) {
            throw new InvalidFormatException("A part name shall not have a forward slash as the last character [M1.5]: " + uri.getPath());
        }
    }

    private static void throwExceptionIfPartNameHaveInvalidSegments(URI uri) {
        if (uri != null) {
            String[] split = uri.toASCIIString().split(PackagingURIHelper.FORWARD_SLASH_STRING);
            if (split.length > 1 && split[0].equals("")) {
                for (int i10 = 1; i10 < split.length; i10++) {
                    String str = split[i10];
                    if (str != null && !"".equals(str)) {
                        if (!str.endsWith(".")) {
                            if (!"".equals(str.replaceAll("\\\\.", ""))) {
                                checkPCharCompliance(str);
                            } else {
                                throw new InvalidFormatException("A segment shall include at least one non-dot character. [M1.10]: " + uri.getPath());
                            }
                        } else {
                            throw new InvalidFormatException("A segment shall not end with a dot ('.') character [M1.9]: " + uri.getPath());
                        }
                    } else {
                        throw new InvalidFormatException("A part name shall not have empty segments [M1.3]: " + uri.getPath());
                    }
                }
                return;
            }
            throw new InvalidFormatException("A part name shall not have empty segments [M1.3]: " + uri.getPath());
        }
        throw new IllegalArgumentException("partUri");
    }

    private static void throwExceptionIfPartNameNotStartsWithForwardSlashChar(URI uri) {
        String path = uri.getPath();
        if (path.length() > 0 && path.charAt(0) != PackagingURIHelper.FORWARD_SLASH_CHAR) {
            throw new InvalidFormatException("A part name shall start with a forward slash ('/') character [M1.4]: " + uri.getPath());
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof PackagePartName)) {
            return this.partNameURI.toASCIIString().toLowerCase().equals(((PackagePartName) obj).partNameURI.toASCIIString().toLowerCase());
        }
        return false;
    }

    public String getExtension() {
        int lastIndexOf;
        String path = this.partNameURI.getPath();
        if (path.length() > 0 && (lastIndexOf = path.lastIndexOf(".")) > -1) {
            return path.substring(lastIndexOf + 1);
        }
        return "";
    }

    public String getName() {
        return this.partNameURI.toASCIIString();
    }

    public URI getURI() {
        return this.partNameURI;
    }

    public int hashCode() {
        return this.partNameURI.toASCIIString().toLowerCase().hashCode();
    }

    public String toString() {
        return getName();
    }

    @Override // java.lang.Comparable
    public int compareTo(PackagePartName packagePartName) {
        if (packagePartName == null) {
            return -1;
        }
        return this.partNameURI.toASCIIString().toLowerCase().compareTo(packagePartName.partNameURI.toASCIIString().toLowerCase());
    }

    public boolean isRelationshipPartURI() {
        return this.isRelationship;
    }

    public PackagePartName(String str, boolean z10) {
        try {
            URI uri = new URI(str);
            if (z10) {
                throwExceptionIfInvalidPartUri(uri);
            } else if (!PackagingURIHelper.PACKAGE_ROOT_URI.equals(uri)) {
                throw new OpenXML4JRuntimeException("OCP conformance must be check for ALL part name except special cases : ['/']");
            }
            this.partNameURI = uri;
            this.isRelationship = isRelationshipPartURI(uri);
        } catch (URISyntaxException unused) {
            throw new IllegalArgumentException("partName argmument is not a valid OPC part name !");
        }
    }
}
