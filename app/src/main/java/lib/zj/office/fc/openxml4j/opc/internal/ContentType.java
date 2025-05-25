package lib.zj.office.fc.openxml4j.opc.internal;

import a6.h;
import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lib.zj.office.fc.codec.CharEncoding;
import lib.zj.office.fc.openxml4j.exceptions.InvalidFormatException;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* loaded from: classes3.dex */
public final class ContentType {
    private static final Pattern patternMediaType = Pattern.compile("^([\\x21-\\x7E&&[^\\(\\)<>@,;:\\\\/\"\\[\\]\\?={}\\x20\\x09]]+)/([\\x21-\\x7E&&[^\\(\\)<>@,;:\\\\/\"\\[\\]\\?={}\\x20\\x09]]+)$");
    private Hashtable<String, String> parameters;
    private String subType;
    private String type;

    public ContentType(String str) {
        try {
            Matcher matcher = patternMediaType.matcher(new String(str.getBytes(), CharEncoding.US_ASCII));
            if (matcher.matches()) {
                if (matcher.groupCount() >= 2) {
                    this.type = matcher.group(1);
                    this.subType = matcher.group(2);
                    this.parameters = new Hashtable<>(1);
                    for (int i10 = 4; i10 <= matcher.groupCount() && matcher.group(i10) != null; i10 += 2) {
                        this.parameters.put(matcher.group(i10), matcher.group(i10 + 1));
                    }
                    return;
                }
                return;
            }
            throw new InvalidFormatException(h.d("The specified content type '", str, "' is not compliant with RFC 2616: malformed content type."));
        } catch (UnsupportedEncodingException unused) {
            throw new InvalidFormatException("The specified content type is not an ASCII value.");
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof ContentType) && !toString().equalsIgnoreCase(obj.toString())) {
            return false;
        }
        return true;
    }

    public String getParameters(String str) {
        return this.parameters.get(str);
    }

    public String getSubType() {
        return this.subType;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getType());
        stringBuffer.append(PackagingURIHelper.FORWARD_SLASH_STRING);
        stringBuffer.append(getSubType());
        return stringBuffer.toString();
    }
}
