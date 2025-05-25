package lib.zj.office.fc.dom4j.io;

/* loaded from: classes3.dex */
public class OutputFormat implements Cloneable {
    protected static final String STANDARD_INDENT = "  ";
    private char attributeQuoteChar;
    private boolean doXHTML;
    private String encoding;
    private boolean expandEmptyElements;
    private String indent;
    private String lineSeparator;
    private boolean newLineAfterDeclaration;
    private int newLineAfterNTags;
    private boolean newlines;
    private boolean omitEncoding;
    private boolean padText;
    private boolean suppressDeclaration;
    private boolean trimText;

    public OutputFormat() {
        this.suppressDeclaration = false;
        this.newLineAfterDeclaration = true;
        this.encoding = "UTF-8";
        this.omitEncoding = false;
        this.indent = null;
        this.expandEmptyElements = false;
        this.newlines = false;
        this.lineSeparator = "\n";
        this.trimText = false;
        this.padText = false;
        this.doXHTML = false;
        this.newLineAfterNTags = 0;
        this.attributeQuoteChar = '\"';
    }

    public static OutputFormat createCompactFormat() {
        OutputFormat outputFormat = new OutputFormat();
        outputFormat.setIndent(false);
        outputFormat.setNewlines(false);
        outputFormat.setTrimText(true);
        return outputFormat;
    }

    public static OutputFormat createPrettyPrint() {
        OutputFormat outputFormat = new OutputFormat();
        outputFormat.setIndentSize(2);
        outputFormat.setNewlines(true);
        outputFormat.setTrimText(true);
        outputFormat.setPadText(true);
        return outputFormat;
    }

    public char getAttributeQuoteCharacter() {
        return this.attributeQuoteChar;
    }

    public String getEncoding() {
        return this.encoding;
    }

    public String getIndent() {
        return this.indent;
    }

    public String getLineSeparator() {
        return this.lineSeparator;
    }

    public int getNewLineAfterNTags() {
        return this.newLineAfterNTags;
    }

    public boolean isExpandEmptyElements() {
        return this.expandEmptyElements;
    }

    public boolean isNewLineAfterDeclaration() {
        return this.newLineAfterDeclaration;
    }

    public boolean isNewlines() {
        return this.newlines;
    }

    public boolean isOmitEncoding() {
        return this.omitEncoding;
    }

    public boolean isPadText() {
        return this.padText;
    }

    public boolean isSuppressDeclaration() {
        return this.suppressDeclaration;
    }

    public boolean isTrimText() {
        return this.trimText;
    }

    public boolean isXHTML() {
        return this.doXHTML;
    }

    public int parseOptions(String[] strArr, int i10) {
        int length = strArr.length;
        while (i10 < length) {
            if (strArr[i10].equals("-suppressDeclaration")) {
                setSuppressDeclaration(true);
            } else if (strArr[i10].equals("-omitEncoding")) {
                setOmitEncoding(true);
            } else if (strArr[i10].equals("-indent")) {
                i10++;
                setIndent(strArr[i10]);
            } else if (strArr[i10].equals("-indentSize")) {
                i10++;
                setIndentSize(Integer.parseInt(strArr[i10]));
            } else if (strArr[i10].startsWith("-expandEmpty")) {
                setExpandEmptyElements(true);
            } else if (strArr[i10].equals("-encoding")) {
                i10++;
                setEncoding(strArr[i10]);
            } else if (strArr[i10].equals("-newlines")) {
                setNewlines(true);
            } else if (strArr[i10].equals("-lineSeparator")) {
                i10++;
                setLineSeparator(strArr[i10]);
            } else if (strArr[i10].equals("-trimText")) {
                setTrimText(true);
            } else if (strArr[i10].equals("-padText")) {
                setPadText(true);
            } else if (!strArr[i10].startsWith("-xhtml")) {
                break;
            } else {
                setXHTML(true);
            }
            i10++;
        }
        return i10;
    }

    public void setAttributeQuoteCharacter(char c) {
        if (c != '\'' && c != '\"') {
            throw new IllegalArgumentException("Invalid attribute quote character (" + c + ")");
        }
        this.attributeQuoteChar = c;
    }

    public void setEncoding(String str) {
        if (str != null) {
            this.encoding = str;
        }
    }

    public void setExpandEmptyElements(boolean z10) {
        this.expandEmptyElements = z10;
    }

    public void setIndent(String str) {
        if (str != null && str.length() <= 0) {
            str = null;
        }
        this.indent = str;
    }

    public void setIndentSize(int i10) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < i10; i11++) {
            stringBuffer.append(" ");
        }
        this.indent = stringBuffer.toString();
    }

    public void setLineSeparator(String str) {
        this.lineSeparator = str;
    }

    public void setNewLineAfterDeclaration(boolean z10) {
        this.newLineAfterDeclaration = z10;
    }

    public void setNewLineAfterNTags(int i10) {
        this.newLineAfterNTags = i10;
    }

    public void setNewlines(boolean z10) {
        this.newlines = z10;
    }

    public void setOmitEncoding(boolean z10) {
        this.omitEncoding = z10;
    }

    public void setPadText(boolean z10) {
        this.padText = z10;
    }

    public void setSuppressDeclaration(boolean z10) {
        this.suppressDeclaration = z10;
    }

    public void setTrimText(boolean z10) {
        this.trimText = z10;
    }

    public void setXHTML(boolean z10) {
        this.doXHTML = z10;
    }

    public void setIndent(boolean z10) {
        if (z10) {
            this.indent = STANDARD_INDENT;
        } else {
            this.indent = null;
        }
    }

    public OutputFormat(String str) {
        this.suppressDeclaration = false;
        this.newLineAfterDeclaration = true;
        this.encoding = "UTF-8";
        this.omitEncoding = false;
        this.expandEmptyElements = false;
        this.newlines = false;
        this.lineSeparator = "\n";
        this.trimText = false;
        this.padText = false;
        this.doXHTML = false;
        this.newLineAfterNTags = 0;
        this.attributeQuoteChar = '\"';
        this.indent = str;
    }

    public OutputFormat(String str, boolean z10) {
        this.suppressDeclaration = false;
        this.newLineAfterDeclaration = true;
        this.encoding = "UTF-8";
        this.omitEncoding = false;
        this.expandEmptyElements = false;
        this.lineSeparator = "\n";
        this.trimText = false;
        this.padText = false;
        this.doXHTML = false;
        this.newLineAfterNTags = 0;
        this.attributeQuoteChar = '\"';
        this.indent = str;
        this.newlines = z10;
    }

    public OutputFormat(String str, boolean z10, String str2) {
        this.suppressDeclaration = false;
        this.newLineAfterDeclaration = true;
        this.omitEncoding = false;
        this.expandEmptyElements = false;
        this.lineSeparator = "\n";
        this.trimText = false;
        this.padText = false;
        this.doXHTML = false;
        this.newLineAfterNTags = 0;
        this.attributeQuoteChar = '\"';
        this.indent = str;
        this.newlines = z10;
        this.encoding = str2;
    }
}
